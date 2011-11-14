/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.EFeatureMapping;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.FeatureMappingStrategy;
import org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Mapping Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyImpl#getImplType <em>Impl Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyImpl#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureMappingStrategyImpl extends DefaultNameImpl implements FeatureMappingStrategy {
	/**
	 * The cached value of the '{@link #getImplType() <em>Impl Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplType()
	 * @generated
	 * @ordered
	 */
	protected JvmGenericType implType;

	/**
	 * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected JvmGenericType interfaceType;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMappingStrategyPattern> patterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMappingStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.FEATURE_MAPPING_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType getImplType() {
		if (implType != null && implType.eIsProxy()) {
			InternalEObject oldImplType = (InternalEObject)implType;
			implType = (JvmGenericType)eResolveProxy(oldImplType);
			if (implType != oldImplType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.FEATURE_MAPPING_STRATEGY__IMPL_TYPE, oldImplType, implType));
			}
		}
		return implType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType basicGetImplType() {
		return implType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplType(JvmGenericType newImplType) {
		JvmGenericType oldImplType = implType;
		implType = newImplType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FEATURE_MAPPING_STRATEGY__IMPL_TYPE, oldImplType, implType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType getInterfaceType() {
		if (interfaceType != null && interfaceType.eIsProxy()) {
			InternalEObject oldInterfaceType = (InternalEObject)interfaceType;
			interfaceType = (JvmGenericType)eResolveProxy(oldInterfaceType);
			if (interfaceType != oldInterfaceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE, oldInterfaceType, interfaceType));
			}
		}
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType basicGetInterfaceType() {
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceType(JvmGenericType newInterfaceType) {
		JvmGenericType oldInterfaceType = interfaceType;
		interfaceType = newInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE, oldInterfaceType, interfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMappingStrategyPattern> getPatterns() {
		if (patterns == null) {
			patterns = new EObjectContainmentWithInverseEList<FeatureMappingStrategyPattern>(FeatureMappingStrategyPattern.class, this, EmfacadePackage.FEATURE_MAPPING_STRATEGY__PATTERNS, EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY);
		}
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EFeatureMapping> createFeatureMappings(EList<JvmMember> jElements) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__PATTERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPatterns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__PATTERNS:
				return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__IMPL_TYPE:
				if (resolve) return getImplType();
				return basicGetImplType();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE:
				if (resolve) return getInterfaceType();
				return basicGetInterfaceType();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__PATTERNS:
				return getPatterns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__IMPL_TYPE:
				setImplType((JvmGenericType)newValue);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE:
				setInterfaceType((JvmGenericType)newValue);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__PATTERNS:
				getPatterns().clear();
				getPatterns().addAll((Collection<? extends FeatureMappingStrategyPattern>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__IMPL_TYPE:
				setImplType((JvmGenericType)null);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE:
				setInterfaceType((JvmGenericType)null);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__PATTERNS:
				getPatterns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__IMPL_TYPE:
				return implType != null;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE:
				return interfaceType != null;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY__PATTERNS:
				return patterns != null && !patterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	// utility methods for subclasses

	protected static EAnnotation getJavaAnnotation(ENamedElement namedElement, boolean createIfMissing) {
		EAnnotation eAnnotation = namedElement.getEAnnotation(TypesPackage.eNS_URI);
		if (eAnnotation == null && createIfMissing) {
			eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			eAnnotation.setSource(TypesPackage.eNS_URI);
			namedElement.getEAnnotations().add(eAnnotation);
		}
		return eAnnotation;
	}
	
	protected EStructuralFeature initFeature(EStructuralFeature feature, String propertyName, JvmTypeReference type, int upperBound) {
		feature.setName(propertyName);
		EAnnotation eAnnotation = getJavaAnnotation(feature, true);
		if (! eAnnotation.getReferences().contains(type)) {
			eAnnotation.getReferences().add(type);
		}
		feature.setUpperBound(upperBound);
		return feature;
	}
	
	protected EFeatureMapping initFeatureMapping(EFeatureMapping featureMapping, EStructuralFeature feature) {
		featureMapping.getOptions().setStrategy(this);
		featureMapping.setEFeature(feature);
		return featureMapping;
	}

	@Override
	public String getDefaultName() {
		return (implType != null && (! implType.eIsProxy()) ? implType.getSimpleName() : null);
	}
} //FeatureMappingStrategyImpl
