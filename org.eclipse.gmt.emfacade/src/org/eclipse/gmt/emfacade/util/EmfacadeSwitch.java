/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.gmt.emfacade.DefaultName;
import org.eclipse.gmt.emfacade.EClassMapping;
import org.eclipse.gmt.emfacade.EClassifierMapping;
import org.eclipse.gmt.emfacade.EDataTypeMapping;
import org.eclipse.gmt.emfacade.EEnumLiteralMapping;
import org.eclipse.gmt.emfacade.EEnumMapping;
import org.eclipse.gmt.emfacade.EFeatureMapping;
import org.eclipse.gmt.emfacade.EFeatureMappingOptions;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.EventHandler;
import org.eclipse.gmt.emfacade.FacadeModel;
import org.eclipse.gmt.emfacade.FeatureMappingStrategy;
import org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern;
import org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern;
import org.eclipse.gmt.emfacade.ImportDirective;
import org.eclipse.gmt.emfacade.InterfaceImplementation;
import org.eclipse.gmt.emfacade.InterfaceMethodImplementation;
import org.eclipse.gmt.emfacade.LifeCycleImplementation;
import org.eclipse.gmt.emfacade.MemberPattern;
import org.eclipse.gmt.emfacade.NameTypePattern;
import org.eclipse.gmt.emfacade.NameTypePatternFMS;
import org.eclipse.gmt.emfacade.TypeListPattern;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.EmfacadePackage
 * @generated
 */
public class EmfacadeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmfacadePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfacadeSwitch() {
		if (modelPackage == null) {
			modelPackage = EmfacadePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EmfacadePackage.DEFAULT_NAME: {
				DefaultName defaultName = (DefaultName)theEObject;
				T result = caseDefaultName(defaultName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.INTERFACE_IMPLEMENTATION: {
				InterfaceImplementation interfaceImplementation = (InterfaceImplementation)theEObject;
				T result = caseInterfaceImplementation(interfaceImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION: {
				InterfaceMethodImplementation interfaceMethodImplementation = (InterfaceMethodImplementation)theEObject;
				T result = caseInterfaceMethodImplementation(interfaceMethodImplementation);
				if (result == null) result = caseDefaultName(interfaceMethodImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.FACADE_MODEL: {
				FacadeModel facadeModel = (FacadeModel)theEObject;
				T result = caseFacadeModel(facadeModel);
				if (result == null) result = caseDefaultName(facadeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.IMPORT_DIRECTIVE: {
				ImportDirective importDirective = (ImportDirective)theEObject;
				T result = caseImportDirective(importDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.ECLASSIFIER_MAPPING: {
				EClassifierMapping eClassifierMapping = (EClassifierMapping)theEObject;
				T result = caseEClassifierMapping(eClassifierMapping);
				if (result == null) result = caseDefaultName(eClassifierMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.ECLASS_MAPPING: {
				EClassMapping eClassMapping = (EClassMapping)theEObject;
				T result = caseEClassMapping(eClassMapping);
				if (result == null) result = caseEClassifierMapping(eClassMapping);
				if (result == null) result = caseDefaultName(eClassMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.LIFE_CYCLE_IMPLEMENTATION: {
				LifeCycleImplementation lifeCycleImplementation = (LifeCycleImplementation)theEObject;
				T result = caseLifeCycleImplementation(lifeCycleImplementation);
				if (result == null) result = caseInterfaceImplementation(lifeCycleImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.EVENT_HANDLER: {
				EventHandler eventHandler = (EventHandler)theEObject;
				T result = caseEventHandler(eventHandler);
				if (result == null) result = caseInterfaceImplementation(eventHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY: {
				FeatureMappingStrategy featureMappingStrategy = (FeatureMappingStrategy)theEObject;
				T result = caseFeatureMappingStrategy(featureMappingStrategy);
				if (result == null) result = caseDefaultName(featureMappingStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.EFEATURE_MAPPING: {
				EFeatureMapping eFeatureMapping = (EFeatureMapping)theEObject;
				T result = caseEFeatureMapping(eFeatureMapping);
				if (result == null) result = caseDefaultName(eFeatureMapping);
				if (result == null) result = caseInterfaceImplementation(eFeatureMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.EFEATURE_MAPPING_OPTIONS: {
				EFeatureMappingOptions eFeatureMappingOptions = (EFeatureMappingOptions)theEObject;
				T result = caseEFeatureMappingOptions(eFeatureMappingOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.EDATA_TYPE_MAPPING: {
				EDataTypeMapping eDataTypeMapping = (EDataTypeMapping)theEObject;
				T result = caseEDataTypeMapping(eDataTypeMapping);
				if (result == null) result = caseEClassifierMapping(eDataTypeMapping);
				if (result == null) result = caseDefaultName(eDataTypeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.EENUM_MAPPING: {
				EEnumMapping eEnumMapping = (EEnumMapping)theEObject;
				T result = caseEEnumMapping(eEnumMapping);
				if (result == null) result = caseEDataTypeMapping(eEnumMapping);
				if (result == null) result = caseEClassifierMapping(eEnumMapping);
				if (result == null) result = caseDefaultName(eEnumMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.EENUM_LITERAL_MAPPING: {
				EEnumLiteralMapping eEnumLiteralMapping = (EEnumLiteralMapping)theEObject;
				T result = caseEEnumLiteralMapping(eEnumLiteralMapping);
				if (result == null) result = caseDefaultName(eEnumLiteralMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.NAME_TYPE_PATTERN_FMS: {
				NameTypePatternFMS nameTypePatternFMS = (NameTypePatternFMS)theEObject;
				T result = caseNameTypePatternFMS(nameTypePatternFMS);
				if (result == null) result = caseFeatureMappingStrategy(nameTypePatternFMS);
				if (result == null) result = caseDefaultName(nameTypePatternFMS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.MEMBER_PATTERN: {
				MemberPattern memberPattern = (MemberPattern)theEObject;
				T result = caseMemberPattern(memberPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.NAME_TYPE_PATTERN: {
				NameTypePattern nameTypePattern = (NameTypePattern)theEObject;
				T result = caseNameTypePattern(nameTypePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.TYPE_LIST_PATTERN: {
				TypeListPattern typeListPattern = (TypeListPattern)theEObject;
				T result = caseTypeListPattern(typeListPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN: {
				FeatureMappingStrategyPattern featureMappingStrategyPattern = (FeatureMappingStrategyPattern)theEObject;
				T result = caseFeatureMappingStrategyPattern(featureMappingStrategyPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN: {
				FeatureMappingStrategyMethodPattern featureMappingStrategyMethodPattern = (FeatureMappingStrategyMethodPattern)theEObject;
				T result = caseFeatureMappingStrategyMethodPattern(featureMappingStrategyMethodPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultName(DefaultName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceImplementation(InterfaceImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Method Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Method Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceMethodImplementation(InterfaceMethodImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassMapping(EClassMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Life Cycle Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Life Cycle Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeCycleImplementation(LifeCycleImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHandler(EventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapping(EFeatureMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Mapping Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Mapping Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMappingOptions(EFeatureMappingOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnumMapping(EEnumMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum Literal Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum Literal Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnumLiteralMapping(EEnumLiteralMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EData Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Type Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDataTypeMapping(EDataTypeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Mapping Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Mapping Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMappingStrategy(FeatureMappingStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type Pattern FMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type Pattern FMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameTypePatternFMS(NameTypePatternFMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameTypePattern(NameTypePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacadeModel(FacadeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportDirective(ImportDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClassifier Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClassifier Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassifierMapping(EClassifierMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberPattern(MemberPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type List Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type List Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeListPattern(TypeListPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Mapping Strategy Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Mapping Strategy Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMappingStrategyPattern(FeatureMappingStrategyPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Mapping Strategy Method Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Mapping Strategy Method Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMappingStrategyMethodPattern(FeatureMappingStrategyMethodPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EmfacadeSwitch
