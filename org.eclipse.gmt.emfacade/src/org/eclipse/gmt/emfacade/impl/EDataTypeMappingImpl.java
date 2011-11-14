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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.emfacade.EDataTypeMapping;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EData Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EDataTypeMappingImpl#getEDataType <em>EData Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EDataTypeMappingImpl#getJClass <em>JClass</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EDataTypeMappingImpl#getConvertExpression <em>Convert Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDataTypeMappingImpl extends EClassifierMappingImpl implements EDataTypeMapping {
	/**
	 * The cached value of the '{@link #getEDataType() <em>EData Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDataType()
	 * @generated
	 * @ordered
	 */
	protected EDataType eDataType;
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
	 * The cached value of the '{@link #getConvertExpression() <em>Convert Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression convertExpression;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDataTypeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.EDATA_TYPE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDataType() {
		if (eDataType != null && eDataType.eIsProxy()) {
			InternalEObject oldEDataType = (InternalEObject)eDataType;
			eDataType = (EDataType)eResolveProxy(oldEDataType);
			if (eDataType != oldEDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.EDATA_TYPE_MAPPING__EDATA_TYPE, oldEDataType, eDataType));
			}
		}
		return eDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType basicGetEDataType() {
		return eDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDataType(EDataType newEDataType) {
		EDataType oldEDataType = eDataType;
		eDataType = newEDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EDATA_TYPE_MAPPING__EDATA_TYPE, oldEDataType, eDataType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.EDATA_TYPE_MAPPING__JCLASS, oldJClass, jClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EDATA_TYPE_MAPPING__JCLASS, oldJClass, jClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getConvertExpression() {
		return convertExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConvertExpression(XExpression newConvertExpression, NotificationChain msgs) {
		XExpression oldConvertExpression = convertExpression;
		convertExpression = newConvertExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.EDATA_TYPE_MAPPING__CONVERT_EXPRESSION, oldConvertExpression, newConvertExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvertExpression(XExpression newConvertExpression) {
		if (newConvertExpression != convertExpression) {
			NotificationChain msgs = null;
			if (convertExpression != null)
				msgs = ((InternalEObject)convertExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.EDATA_TYPE_MAPPING__CONVERT_EXPRESSION, null, msgs);
			if (newConvertExpression != null)
				msgs = ((InternalEObject)newConvertExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.EDATA_TYPE_MAPPING__CONVERT_EXPRESSION, null, msgs);
			msgs = basicSetConvertExpression(newConvertExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EDATA_TYPE_MAPPING__CONVERT_EXPRESSION, newConvertExpression, newConvertExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.EDATA_TYPE_MAPPING__CONVERT_EXPRESSION:
				return basicSetConvertExpression(null, msgs);
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
			case EmfacadePackage.EDATA_TYPE_MAPPING__EDATA_TYPE:
				if (resolve) return getEDataType();
				return basicGetEDataType();
			case EmfacadePackage.EDATA_TYPE_MAPPING__JCLASS:
				if (resolve) return getJClass();
				return basicGetJClass();
			case EmfacadePackage.EDATA_TYPE_MAPPING__CONVERT_EXPRESSION:
				return getConvertExpression();
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
			case EmfacadePackage.EDATA_TYPE_MAPPING__EDATA_TYPE:
				setEDataType((EDataType)newValue);
				return;
			case EmfacadePackage.EDATA_TYPE_MAPPING__JCLASS:
				setJClass((JvmGenericType)newValue);
				return;
			case EmfacadePackage.EDATA_TYPE_MAPPING__CONVERT_EXPRESSION:
				setConvertExpression((XExpression)newValue);
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
			case EmfacadePackage.EDATA_TYPE_MAPPING__EDATA_TYPE:
				setEDataType((EDataType)null);
				return;
			case EmfacadePackage.EDATA_TYPE_MAPPING__JCLASS:
				setJClass((JvmGenericType)null);
				return;
			case EmfacadePackage.EDATA_TYPE_MAPPING__CONVERT_EXPRESSION:
				setConvertExpression((XExpression)null);
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
			case EmfacadePackage.EDATA_TYPE_MAPPING__EDATA_TYPE:
				return eDataType != null;
			case EmfacadePackage.EDATA_TYPE_MAPPING__JCLASS:
				return jClass != null;
			case EmfacadePackage.EDATA_TYPE_MAPPING__CONVERT_EXPRESSION:
				return convertExpression != null;
		}
		return super.eIsSet(featureID);
	}

	//
	
	@Override
	public String getDefaultName() {
		return (eDataType != null && (! eDataType.eIsProxy()) ? getEClassifier().getName() : null);
	}

	@Override
	public EClassifier getEClassifier() {
		return getEDataType();
	}

	@Override
	public JvmDeclaredType getDeclaredType() {
		return getJClass();
	}
} //EDataTypeMappingImpl
