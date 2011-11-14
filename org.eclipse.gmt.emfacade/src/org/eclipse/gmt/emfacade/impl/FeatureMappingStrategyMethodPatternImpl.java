/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Mapping Strategy Method Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyMethodPatternImpl#getStrategyMethod <em>Strategy Method</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyMethodPatternImpl#getTargetMember <em>Target Member</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyMethodPatternImpl#getTargetBody <em>Target Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureMappingStrategyMethodPatternImpl extends EObjectImpl implements FeatureMappingStrategyMethodPattern {
	/**
	 * The cached value of the '{@link #getStrategyMethod() <em>Strategy Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMethod()
	 * @generated
	 * @ordered
	 */
	protected JvmOperation strategyMethod;

	/**
	 * The cached value of the '{@link #getTargetMember() <em>Target Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMember()
	 * @generated
	 * @ordered
	 */
	protected JvmFeature targetMember;

	/**
	 * The cached value of the '{@link #getTargetBody() <em>Target Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBody()
	 * @generated
	 * @ordered
	 */
	protected XExpression targetBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMappingStrategyMethodPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation getStrategyMethod() {
		if (strategyMethod != null && strategyMethod.eIsProxy()) {
			InternalEObject oldStrategyMethod = (InternalEObject)strategyMethod;
			strategyMethod = (JvmOperation)eResolveProxy(oldStrategyMethod);
			if (strategyMethod != oldStrategyMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__STRATEGY_METHOD, oldStrategyMethod, strategyMethod));
			}
		}
		return strategyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation basicGetStrategyMethod() {
		return strategyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMethod(JvmOperation newStrategyMethod) {
		JvmOperation oldStrategyMethod = strategyMethod;
		strategyMethod = newStrategyMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__STRATEGY_METHOD, oldStrategyMethod, strategyMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmFeature getTargetMember() {
		return targetMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetMember(JvmFeature newTargetMember, NotificationChain msgs) {
		JvmFeature oldTargetMember = targetMember;
		targetMember = newTargetMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER, oldTargetMember, newTargetMember);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMember(JvmFeature newTargetMember) {
		if (newTargetMember != targetMember) {
			NotificationChain msgs = null;
			if (targetMember != null)
				msgs = ((InternalEObject)targetMember).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER, null, msgs);
			if (newTargetMember != null)
				msgs = ((InternalEObject)newTargetMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER, null, msgs);
			msgs = basicSetTargetMember(newTargetMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER, newTargetMember, newTargetMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getTargetBody() {
		return targetBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetBody(XExpression newTargetBody, NotificationChain msgs) {
		XExpression oldTargetBody = targetBody;
		targetBody = newTargetBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY, oldTargetBody, newTargetBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBody(XExpression newTargetBody) {
		if (newTargetBody != targetBody) {
			NotificationChain msgs = null;
			if (targetBody != null)
				msgs = ((InternalEObject)targetBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY, null, msgs);
			if (newTargetBody != null)
				msgs = ((InternalEObject)newTargetBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY, null, msgs);
			msgs = basicSetTargetBody(newTargetBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY, newTargetBody, newTargetBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER:
				return basicSetTargetMember(null, msgs);
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY:
				return basicSetTargetBody(null, msgs);
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
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__STRATEGY_METHOD:
				if (resolve) return getStrategyMethod();
				return basicGetStrategyMethod();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER:
				return getTargetMember();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY:
				return getTargetBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__STRATEGY_METHOD:
				setStrategyMethod((JvmOperation)newValue);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER:
				setTargetMember((JvmFeature)newValue);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY:
				setTargetBody((XExpression)newValue);
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
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__STRATEGY_METHOD:
				setStrategyMethod((JvmOperation)null);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER:
				setTargetMember((JvmFeature)null);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY:
				setTargetBody((XExpression)null);
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
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__STRATEGY_METHOD:
				return strategyMethod != null;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER:
				return targetMember != null;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY:
				return targetBody != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureMappingStrategyMethodPatternImpl
