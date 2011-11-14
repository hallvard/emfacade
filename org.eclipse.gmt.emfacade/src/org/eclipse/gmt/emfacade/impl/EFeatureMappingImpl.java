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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.EClassMapping;
import org.eclipse.gmt.emfacade.EFeatureMapping;
import org.eclipse.gmt.emfacade.EFeatureMappingOptions;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.FeatureMappingStrategy;
import org.eclipse.gmt.emfacade.InterfaceImplementation;
import org.eclipse.gmt.emfacade.InterfaceMethodImplementation;
import org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper;
import org.eclipse.gmt.emfacade.util.Util;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFeature Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl#getMethodImplementations <em>Method Implementations</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl#getInferredInterfaceType <em>Inferred Interface Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl#getEClassMapping <em>EClass Mapping</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl#getEFeature <em>EFeature</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl#getJClass <em>JClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EFeatureMappingImpl extends DefaultNameImpl implements EFeatureMapping {
	/**
	 * The cached value of the '{@link #getMethodImplementations() <em>Method Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceMethodImplementation> methodImplementations;

	/**
	 * The cached value of the '{@link #getInferredInterfaceType() <em>Inferred Interface Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInferredInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected JvmGenericType inferredInterfaceType;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EFeatureMappingOptions options;

	/**
	 * The cached value of the '{@link #getEFeature() <em>EFeature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature eFeature;

	/**
	 * The cached value of the '{@link #getJClass() <em>JClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJClass()
	 * @generated
	 * @ordered
	 */
	protected JvmGenericType jClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFeatureMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.EFEATURE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceMethodImplementation> getMethodImplementations() {
		if (methodImplementations == null) {
			methodImplementations = new EObjectContainmentWithInverseEList<InterfaceMethodImplementation>(InterfaceMethodImplementation.class, this, EmfacadePackage.EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION);
		}
		return methodImplementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType getInferredInterfaceType() {
		return inferredInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInferredInterfaceType(JvmGenericType newInferredInterfaceType, NotificationChain msgs) {
		JvmGenericType oldInferredInterfaceType = inferredInterfaceType;
		inferredInterfaceType = newInferredInterfaceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE, oldInferredInterfaceType, newInferredInterfaceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInferredInterfaceType(JvmGenericType newInferredInterfaceType) {
		if (newInferredInterfaceType != inferredInterfaceType) {
			NotificationChain msgs = null;
			if (inferredInterfaceType != null)
				msgs = ((InternalEObject)inferredInterfaceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE, null, msgs);
			if (newInferredInterfaceType != null)
				msgs = ((InternalEObject)newInferredInterfaceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE, null, msgs);
			msgs = basicSetInferredInterfaceType(newInferredInterfaceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE, newInferredInterfaceType, newInferredInterfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassMapping getEClassMapping() {
		if (eContainerFeatureID() != EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING) return null;
		return (EClassMapping)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEClassMapping(EClassMapping newEClassMapping, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEClassMapping, EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClassMapping(EClassMapping newEClassMapping) {
		if (newEClassMapping != eInternalContainer() || (eContainerFeatureID() != EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING && newEClassMapping != null)) {
			if (EcoreUtil.isAncestor(this, newEClassMapping))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEClassMapping != null)
				msgs = ((InternalEObject)newEClassMapping).eInverseAdd(this, EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPINGS, EClassMapping.class, msgs);
			msgs = basicSetEClassMapping(newEClassMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING, newEClassMapping, newEClassMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMappingOptions getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(EFeatureMappingOptions newOptions, NotificationChain msgs) {
		EFeatureMappingOptions oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.EFEATURE_MAPPING__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(EFeatureMappingOptions newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.EFEATURE_MAPPING__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.EFEATURE_MAPPING__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EFEATURE_MAPPING__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEFeature() {
		if (eFeature != null && eFeature.eIsProxy()) {
			InternalEObject oldEFeature = (InternalEObject)eFeature;
			eFeature = (EStructuralFeature)eResolveProxy(oldEFeature);
			if (eFeature != oldEFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.EFEATURE_MAPPING__EFEATURE, oldEFeature, eFeature));
			}
		}
		return eFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetEFeature() {
		return eFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEFeature(EStructuralFeature newEFeature) {
		EStructuralFeature oldEFeature = eFeature;
		eFeature = newEFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EFEATURE_MAPPING__EFEATURE, oldEFeature, eFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType getJClass() {
		if (jClass != null && jClass.eIsProxy()) {
			InternalEObject oldJClass = (InternalEObject)jClass;
			jClass = (JvmGenericType)eResolveProxy(oldJClass);
			if (jClass != oldJClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.EFEATURE_MAPPING__JCLASS, oldJClass, jClass));
			}
		}
		return jClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType basicGetJClass() {
		return jClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJClass(JvmGenericType newJClass) {
		JvmGenericType oldJClass = jClass;
		jClass = newJClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EFEATURE_MAPPING__JCLASS, oldJClass, jClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JvmGenericType getInterfaceType(EmfacadeJvmInferrerHelper helper) {
		if (this.getInferredInterfaceType() == null) {
			FeatureMappingStrategy eFeatureMappingStrategy = Util.getStrategy(this);
			try {
				JvmDeclaredType typeArg1 = this.getEClassMapping().getDeclaredType();
				JvmGenericType interfaceType = (eFeatureMappingStrategy != null ? eFeatureMappingStrategy.getInterfaceType() : null);
				JvmGenericType inferredType = helper.getInferredJvmType(interfaceType, typeArg1, helper.getJClass(this));
				inferredType.setSimpleName(typeArg1.getSimpleName() + "_" + this.getEFeature().getName());
				this.setInferredInterfaceType(inferredType);
			} catch (Exception e) {
			}
		}
		return this.getInferredInterfaceType();
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
			case EmfacadePackage.EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethodImplementations()).basicAdd(otherEnd, msgs);
			case EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEClassMapping((EClassMapping)otherEnd, msgs);
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
			case EmfacadePackage.EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS:
				return ((InternalEList<?>)getMethodImplementations()).basicRemove(otherEnd, msgs);
			case EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE:
				return basicSetInferredInterfaceType(null, msgs);
			case EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING:
				return basicSetEClassMapping(null, msgs);
			case EmfacadePackage.EFEATURE_MAPPING__OPTIONS:
				return basicSetOptions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING:
				return eInternalContainer().eInverseRemove(this, EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPINGS, EClassMapping.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfacadePackage.EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS:
				return getMethodImplementations();
			case EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE:
				return getInferredInterfaceType();
			case EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING:
				return getEClassMapping();
			case EmfacadePackage.EFEATURE_MAPPING__OPTIONS:
				return getOptions();
			case EmfacadePackage.EFEATURE_MAPPING__EFEATURE:
				if (resolve) return getEFeature();
				return basicGetEFeature();
			case EmfacadePackage.EFEATURE_MAPPING__JCLASS:
				if (resolve) return getJClass();
				return basicGetJClass();
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
			case EmfacadePackage.EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS:
				getMethodImplementations().clear();
				getMethodImplementations().addAll((Collection<? extends InterfaceMethodImplementation>)newValue);
				return;
			case EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE:
				setInferredInterfaceType((JvmGenericType)newValue);
				return;
			case EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING:
				setEClassMapping((EClassMapping)newValue);
				return;
			case EmfacadePackage.EFEATURE_MAPPING__OPTIONS:
				setOptions((EFeatureMappingOptions)newValue);
				return;
			case EmfacadePackage.EFEATURE_MAPPING__EFEATURE:
				setEFeature((EStructuralFeature)newValue);
				return;
			case EmfacadePackage.EFEATURE_MAPPING__JCLASS:
				setJClass((JvmGenericType)newValue);
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
			case EmfacadePackage.EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS:
				getMethodImplementations().clear();
				return;
			case EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE:
				setInferredInterfaceType((JvmGenericType)null);
				return;
			case EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING:
				setEClassMapping((EClassMapping)null);
				return;
			case EmfacadePackage.EFEATURE_MAPPING__OPTIONS:
				setOptions((EFeatureMappingOptions)null);
				return;
			case EmfacadePackage.EFEATURE_MAPPING__EFEATURE:
				setEFeature((EStructuralFeature)null);
				return;
			case EmfacadePackage.EFEATURE_MAPPING__JCLASS:
				setJClass((JvmGenericType)null);
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
			case EmfacadePackage.EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS:
				return methodImplementations != null && !methodImplementations.isEmpty();
			case EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE:
				return inferredInterfaceType != null;
			case EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING:
				return getEClassMapping() != null;
			case EmfacadePackage.EFEATURE_MAPPING__OPTIONS:
				return options != null;
			case EmfacadePackage.EFEATURE_MAPPING__EFEATURE:
				return eFeature != null;
			case EmfacadePackage.EFEATURE_MAPPING__JCLASS:
				return jClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InterfaceImplementation.class) {
			switch (derivedFeatureID) {
				case EmfacadePackage.EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS: return EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS;
				case EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE: return EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InterfaceImplementation.class) {
			switch (baseFeatureID) {
				case EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS: return EmfacadePackage.EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS;
				case EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE: return EmfacadePackage.EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public String getDefaultName() {
		return (eFeature != null && (! eFeature.eIsProxy()) ? eFeature.getName() : null);
	}
} //EFeatureMappingImpl
