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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.EClassMapping;
import org.eclipse.gmt.emfacade.EFeatureMapping;
import org.eclipse.gmt.emfacade.EFeatureMappingOptions;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.EventHandler;
import org.eclipse.gmt.emfacade.LifeCycleImplementation;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl#getJClass <em>JClass</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl#getCreateExpression <em>Create Expression</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl#getLifeCycleHandler <em>Life Cycle Handler</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl#getDisposeExpression <em>Dispose Expression</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl#getFeatureMappings <em>Feature Mappings</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl#getFeatureMappingDefaults <em>Feature Mapping Defaults</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl#getEventHandlers <em>Event Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EClassMappingImpl extends EClassifierMappingImpl implements EClassMapping {
	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

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
	 * The cached value of the '{@link #getCreateExpression() <em>Create Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression createExpression;

	/**
	 * The cached value of the '{@link #getLifeCycleHandler() <em>Life Cycle Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycleHandler()
	 * @generated
	 * @ordered
	 */
	protected LifeCycleImplementation lifeCycleHandler;

	/**
	 * The cached value of the '{@link #getDisposeExpression() <em>Dispose Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposeExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression disposeExpression;

	/**
	 * The cached value of the '{@link #getFeatureMappings() <em>Feature Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<EFeatureMapping> featureMappings;

	/**
	 * The cached value of the '{@link #getFeatureMappingDefaults() <em>Feature Mapping Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMappingDefaults()
	 * @generated
	 * @ordered
	 */
	protected EFeatureMappingOptions featureMappingDefaults;

	/**
	 * The cached value of the '{@link #getEventHandlers() <em>Event Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<EventHandler> eventHandlers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.ECLASS_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.ECLASS_MAPPING__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__ECLASS, oldEClass, eClass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.ECLASS_MAPPING__JCLASS, oldJClass, jClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__JCLASS, oldJClass, jClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getCreateExpression() {
		return createExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateExpression(XExpression newCreateExpression, NotificationChain msgs) {
		XExpression oldCreateExpression = createExpression;
		createExpression = newCreateExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__CREATE_EXPRESSION, oldCreateExpression, newCreateExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateExpression(XExpression newCreateExpression) {
		if (newCreateExpression != createExpression) {
			NotificationChain msgs = null;
			if (createExpression != null)
				msgs = ((InternalEObject)createExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.ECLASS_MAPPING__CREATE_EXPRESSION, null, msgs);
			if (newCreateExpression != null)
				msgs = ((InternalEObject)newCreateExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.ECLASS_MAPPING__CREATE_EXPRESSION, null, msgs);
			msgs = basicSetCreateExpression(newCreateExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__CREATE_EXPRESSION, newCreateExpression, newCreateExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycleImplementation getLifeCycleHandler() {
		return lifeCycleHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifeCycleHandler(LifeCycleImplementation newLifeCycleHandler, NotificationChain msgs) {
		LifeCycleImplementation oldLifeCycleHandler = lifeCycleHandler;
		lifeCycleHandler = newLifeCycleHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__LIFE_CYCLE_HANDLER, oldLifeCycleHandler, newLifeCycleHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCycleHandler(LifeCycleImplementation newLifeCycleHandler) {
		if (newLifeCycleHandler != lifeCycleHandler) {
			NotificationChain msgs = null;
			if (lifeCycleHandler != null)
				msgs = ((InternalEObject)lifeCycleHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.ECLASS_MAPPING__LIFE_CYCLE_HANDLER, null, msgs);
			if (newLifeCycleHandler != null)
				msgs = ((InternalEObject)newLifeCycleHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.ECLASS_MAPPING__LIFE_CYCLE_HANDLER, null, msgs);
			msgs = basicSetLifeCycleHandler(newLifeCycleHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__LIFE_CYCLE_HANDLER, newLifeCycleHandler, newLifeCycleHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getDisposeExpression() {
		return disposeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposeExpression(XExpression newDisposeExpression, NotificationChain msgs) {
		XExpression oldDisposeExpression = disposeExpression;
		disposeExpression = newDisposeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__DISPOSE_EXPRESSION, oldDisposeExpression, newDisposeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposeExpression(XExpression newDisposeExpression) {
		if (newDisposeExpression != disposeExpression) {
			NotificationChain msgs = null;
			if (disposeExpression != null)
				msgs = ((InternalEObject)disposeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.ECLASS_MAPPING__DISPOSE_EXPRESSION, null, msgs);
			if (newDisposeExpression != null)
				msgs = ((InternalEObject)newDisposeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.ECLASS_MAPPING__DISPOSE_EXPRESSION, null, msgs);
			msgs = basicSetDisposeExpression(newDisposeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__DISPOSE_EXPRESSION, newDisposeExpression, newDisposeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EFeatureMapping> getFeatureMappings() {
		if (featureMappings == null) {
			featureMappings = new EObjectContainmentWithInverseEList<EFeatureMapping>(EFeatureMapping.class, this, EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPINGS, EmfacadePackage.EFEATURE_MAPPING__ECLASS_MAPPING);
		}
		return featureMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMappingOptions getFeatureMappingDefaults() {
		return featureMappingDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureMappingDefaults(EFeatureMappingOptions newFeatureMappingDefaults, NotificationChain msgs) {
		EFeatureMappingOptions oldFeatureMappingDefaults = featureMappingDefaults;
		featureMappingDefaults = newFeatureMappingDefaults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS, oldFeatureMappingDefaults, newFeatureMappingDefaults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureMappingDefaults(EFeatureMappingOptions newFeatureMappingDefaults) {
		if (newFeatureMappingDefaults != featureMappingDefaults) {
			NotificationChain msgs = null;
			if (featureMappingDefaults != null)
				msgs = ((InternalEObject)featureMappingDefaults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS, null, msgs);
			if (newFeatureMappingDefaults != null)
				msgs = ((InternalEObject)newFeatureMappingDefaults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS, null, msgs);
			msgs = basicSetFeatureMappingDefaults(newFeatureMappingDefaults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS, newFeatureMappingDefaults, newFeatureMappingDefaults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventHandler> getEventHandlers() {
		if (eventHandlers == null) {
			eventHandlers = new EObjectContainmentEList<EventHandler>(EventHandler.class, this, EmfacadePackage.ECLASS_MAPPING__EVENT_HANDLERS);
		}
		return eventHandlers;
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
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureMappings()).basicAdd(otherEnd, msgs);
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
			case EmfacadePackage.ECLASS_MAPPING__CREATE_EXPRESSION:
				return basicSetCreateExpression(null, msgs);
			case EmfacadePackage.ECLASS_MAPPING__LIFE_CYCLE_HANDLER:
				return basicSetLifeCycleHandler(null, msgs);
			case EmfacadePackage.ECLASS_MAPPING__DISPOSE_EXPRESSION:
				return basicSetDisposeExpression(null, msgs);
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPINGS:
				return ((InternalEList<?>)getFeatureMappings()).basicRemove(otherEnd, msgs);
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS:
				return basicSetFeatureMappingDefaults(null, msgs);
			case EmfacadePackage.ECLASS_MAPPING__EVENT_HANDLERS:
				return ((InternalEList<?>)getEventHandlers()).basicRemove(otherEnd, msgs);
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
			case EmfacadePackage.ECLASS_MAPPING__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case EmfacadePackage.ECLASS_MAPPING__JCLASS:
				if (resolve) return getJClass();
				return basicGetJClass();
			case EmfacadePackage.ECLASS_MAPPING__CREATE_EXPRESSION:
				return getCreateExpression();
			case EmfacadePackage.ECLASS_MAPPING__LIFE_CYCLE_HANDLER:
				return getLifeCycleHandler();
			case EmfacadePackage.ECLASS_MAPPING__DISPOSE_EXPRESSION:
				return getDisposeExpression();
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPINGS:
				return getFeatureMappings();
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS:
				return getFeatureMappingDefaults();
			case EmfacadePackage.ECLASS_MAPPING__EVENT_HANDLERS:
				return getEventHandlers();
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
			case EmfacadePackage.ECLASS_MAPPING__ECLASS:
				setEClass((EClass)newValue);
				return;
			case EmfacadePackage.ECLASS_MAPPING__JCLASS:
				setJClass((JvmGenericType)newValue);
				return;
			case EmfacadePackage.ECLASS_MAPPING__CREATE_EXPRESSION:
				setCreateExpression((XExpression)newValue);
				return;
			case EmfacadePackage.ECLASS_MAPPING__LIFE_CYCLE_HANDLER:
				setLifeCycleHandler((LifeCycleImplementation)newValue);
				return;
			case EmfacadePackage.ECLASS_MAPPING__DISPOSE_EXPRESSION:
				setDisposeExpression((XExpression)newValue);
				return;
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPINGS:
				getFeatureMappings().clear();
				getFeatureMappings().addAll((Collection<? extends EFeatureMapping>)newValue);
				return;
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS:
				setFeatureMappingDefaults((EFeatureMappingOptions)newValue);
				return;
			case EmfacadePackage.ECLASS_MAPPING__EVENT_HANDLERS:
				getEventHandlers().clear();
				getEventHandlers().addAll((Collection<? extends EventHandler>)newValue);
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
			case EmfacadePackage.ECLASS_MAPPING__ECLASS:
				setEClass((EClass)null);
				return;
			case EmfacadePackage.ECLASS_MAPPING__JCLASS:
				setJClass((JvmGenericType)null);
				return;
			case EmfacadePackage.ECLASS_MAPPING__CREATE_EXPRESSION:
				setCreateExpression((XExpression)null);
				return;
			case EmfacadePackage.ECLASS_MAPPING__LIFE_CYCLE_HANDLER:
				setLifeCycleHandler((LifeCycleImplementation)null);
				return;
			case EmfacadePackage.ECLASS_MAPPING__DISPOSE_EXPRESSION:
				setDisposeExpression((XExpression)null);
				return;
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPINGS:
				getFeatureMappings().clear();
				return;
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS:
				setFeatureMappingDefaults((EFeatureMappingOptions)null);
				return;
			case EmfacadePackage.ECLASS_MAPPING__EVENT_HANDLERS:
				getEventHandlers().clear();
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
			case EmfacadePackage.ECLASS_MAPPING__ECLASS:
				return eClass != null;
			case EmfacadePackage.ECLASS_MAPPING__JCLASS:
				return jClass != null;
			case EmfacadePackage.ECLASS_MAPPING__CREATE_EXPRESSION:
				return createExpression != null;
			case EmfacadePackage.ECLASS_MAPPING__LIFE_CYCLE_HANDLER:
				return lifeCycleHandler != null;
			case EmfacadePackage.ECLASS_MAPPING__DISPOSE_EXPRESSION:
				return disposeExpression != null;
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPINGS:
				return featureMappings != null && !featureMappings.isEmpty();
			case EmfacadePackage.ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS:
				return featureMappingDefaults != null;
			case EmfacadePackage.ECLASS_MAPPING__EVENT_HANDLERS:
				return eventHandlers != null && !eventHandlers.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	@Override
	public String getDefaultName() {
		return (eClass != null && (! eClass.eIsProxy()) ? getEClassifier().getName() : null);
	}

	@Override
	public EClassifier getEClassifier() {
		return getEClass();
	}

	@Override
	public JvmDeclaredType getDeclaredType() {
		return getJClass();
	}
} //EClassMappingImpl
