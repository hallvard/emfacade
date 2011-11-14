/*******************************************************************************
 * Copyright (c) 2009 Hallvard Traetteberg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hallvard Traetteberg - initial API and implementation
 ******************************************************************************/
package org.eclipse.gmt.emfacade.ui.commands;

import java.util.ArrayList;
import java.util.Collection;

import no.hal.emf.ui.commands.EObjectsCommandHandler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.emfacade.EClassMapping;
import org.eclipse.gmt.emfacade.EClassifierMapping;
import org.eclipse.gmt.emfacade.EFeatureMapping;
import org.eclipse.gmt.emfacade.EmfacadeFactory;
import org.eclipse.gmt.emfacade.FacadeModel;
import org.eclipse.gmt.emfacade.FeatureMappingStrategy;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;

public class GenerateFeaturesAndMappingsCommandHandler extends EObjectsCommandHandler {

	public GenerateFeaturesAndMappingsCommandHandler() {
		super();
	}

	@Override
	protected boolean isCommandEObject(EObject eObject) {
		return eObject instanceof FeatureMappingStrategy ||
		eObject instanceof FacadeModel ||
		eObject instanceof JvmMember ||
		eObject instanceof Package ||
		eObject instanceof EPackage ||
		eObject instanceof EClass;
	}

	@Override
	public Object execute(Collection<? extends EObject> eObjects, ExecutionEvent event) throws ExecutionException {
		Collection<FeatureMappingStrategy> mappingStrategies = new ArrayList<FeatureMappingStrategy>();
		Collection<JvmGenericType> classDeclarations = new ArrayList<JvmGenericType>();
		Collection<EPackage> ePackages = new ArrayList<EPackage>();
		Collection<EClass> eClasses = new ArrayList<EClass>();
		categorizeEObjects(eObjects, mappingStrategies, classDeclarations, ePackages, eClasses);

		String eClassNamePrefix = getEventParameter(event, "eClassNamePrefix", "");

		FacadeModel facadeModel = getEObject(eObjects, FacadeModel.class, null);
		if (mappingStrategies.size() == 0) {
			mappingStrategies.addAll(facadeModel.getFeatureMappingStrategies());
		} else if (facadeModel == null) {
			facadeModel = (FacadeModel) mappingStrategies.iterator().next().eContainer();
		}
		if (ePackages.size() == 0) {
			for (Resource resource : facadeModel.eResource().getResourceSet().getResources()) {
				ePackages.addAll(getEObjects(resource.getContents(), EPackage.class, null, -1));
			}
		}
		for (JvmGenericType classDeclaration : classDeclarations) {
			String eClassName = eClassNamePrefix + classDeclaration.getSimpleName();
			EClass eClass = (EClass) findEClassifier(eClassName, ePackages, eClasses);
			if (eClass == null) {
				eClass = EcoreFactory.eINSTANCE.createEClass();
				eClass.setName(eClassName);
				getEObject(ePackages, EPackage.class, null).getEClassifiers().add(eClass);
			}
			EClassMapping classMapping = getEObject(facadeModel.getClassifierMappings(), EClassMapping.class, eClassName);
			if (classMapping == null) {
				classMapping = EmfacadeFactory.eINSTANCE.createEClassMapping();
				classMapping.setEClass(eClass);
				facadeModel.getClassifierMappings().add(classMapping);
			}

			EList<JvmMember> jElements = new BasicEList<JvmMember>(classDeclaration.getMembers());
			EList<JvmMember> matchedElements = new BasicEList<JvmMember>();
			for (FeatureMappingStrategy featureMappingStrategy : mappingStrategies) {
				EList<EFeatureMapping> featureMappings = featureMappingStrategy.createFeatureMappings(jElements);
				for (EFeatureMapping featureMapping : featureMappings) {
					EStructuralFeature feature = featureMapping.getEFeature();
					if (feature.getEType() == null) {
						resolveFeatureType(feature, facadeModel.getClassifierMappings(), ePackages);
					}
					EStructuralFeature existingFeature = eClass.getEStructuralFeature(feature.getName());
					if (existingFeature != null) {
						eClass.getEStructuralFeatures().remove(existingFeature);
					}
					eClass.getEStructuralFeatures().add(feature);
					EFeatureMapping existingMapping = getEObject(classMapping.getFeatureMappings(), EFeatureMapping.class, featureMapping.getEFeature().getName());
					if (existingMapping != null) {
						classMapping.getFeatureMappings().remove(existingMapping);
					}
					classMapping.getFeatureMappings().add(featureMapping);

//					matchedElements.addAll(featureMapping.getJElements());
				}
				jElements.removeAll(matchedElements);
			}
		}
		return null;
	}

	private EClassifier resolveFeatureType(EStructuralFeature feature, Collection<EClassifierMapping> eClassifierMappings, Collection<EPackage> ePackages) {
		EAnnotation eAnnotation = feature.getEAnnotation(TypesPackage.eNS_URI);
		if (eAnnotation != null) {
			JvmTypeReference type = getEObject(eAnnotation.getReferences(), JvmTypeReference.class, null);
			if (type == null) {
				return null;
			}
			EClassifier eClassifier = null;
			for (EClassifierMapping eClassifierMapping : eClassifierMappings) {
				if (eClassifierMapping.getDeclaredType() == type) {
					eClassifier = eClassifierMapping.getEClassifier();
					break;
				}
			}
			String typeName = getTypeName(type);
			if (eClassifier == null) {
				for (EPackage ePackage : ePackages) {
					eClassifier = findEClassifier(typeName, ePackage);
					if (eClassifier != null) {
						break;
					}
				}
			}
			if (eClassifier == null) {
				eClassifier = findEClassifier(typeName, EcorePackage.eINSTANCE);
			}
			feature.setEType(eClassifier);
			return eClassifier;
		}
		return null;
	}

	private EClassifier findEClassifier(String typeName, EPackage ePackage) {
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (typeName.equals(eClassifier.getInstanceTypeName())) {
				return eClassifier;
			}
		}
		return null;
	}
	
	private String getTypeName(JvmTypeReference type) {
		return type.getQualifiedName();
	}
	
	private EClassifier findEClassifier(String name, Collection<EPackage> ePackages, Collection<EClass> eClasses) {
		EClass eClass = getEObject(eClasses, EClass.class, name);
		if (eClass != null) {
			return eClass;
		}
		for (EPackage ePackage : ePackages) {
			EClassifier eClassifier = ePackage.getEClassifier(name);
			if (eClassifier != null) {
				return eClassifier;
			}
		}
		return null;
	}

	private void categorizeEObjects(Collection<? extends EObject> eObjects, Collection<FeatureMappingStrategy> mappingStrategies, Collection<JvmGenericType> classDeclarations, Collection<EPackage> ePackages, Collection<EClass> eClasses) {
		for (EObject eObject : eObjects) {
			categorizeEObjects(eObject, mappingStrategies, classDeclarations, ePackages, eClasses);
		}
	}
	private void categorizeEObjects(EObject eObject, Collection<FeatureMappingStrategy> mappingStrategies, Collection<JvmGenericType> classDeclarations, Collection<EPackage> ePackages, Collection<EClass> eClasses) {
		if (eObject instanceof FeatureMappingStrategy) {
			if (mappingStrategies != null) {
				mappingStrategies.add((FeatureMappingStrategy) eObject);
			}
		} else if (eObject instanceof JvmGenericType) {
			if (classDeclarations != null) {
				classDeclarations.add((JvmGenericType) eObject);
			}
		} else if (eObject instanceof EPackage) {
			if (ePackages != null) {
				ePackages.add((EPackage) eObject);
			}
		} else if (eObject instanceof EClass) {
			if (eClasses != null) {
				eClasses.add((EClass) eObject);
			}
		} 
	}
}
