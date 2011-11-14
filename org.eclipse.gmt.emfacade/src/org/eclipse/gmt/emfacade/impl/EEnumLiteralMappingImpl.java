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
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.emfacade.EEnumLiteralMapping;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEnum Literal Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EEnumLiteralMappingImpl#getEnumLiteral <em>Enum Literal</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EEnumLiteralMappingImpl#getConvertExpression <em>Convert Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEnumLiteralMappingImpl extends DefaultNameImpl implements EEnumLiteralMapping {
	/**
	 * The cached value of the '{@link #getEnumLiteral() <em>Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumLiteral()
	 * @generated
	 * @ordered
	 */
	protected EEnumLiteral enumLiteral;

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
	protected EEnumLiteralMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.EENUM_LITERAL_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral getEnumLiteral() {
		if (enumLiteral != null && enumLiteral.eIsProxy()) {
			InternalEObject oldEnumLiteral = (InternalEObject)enumLiteral;
			enumLiteral = (EEnumLiteral)eResolveProxy(oldEnumLiteral);
			if (enumLiteral != oldEnumLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.EENUM_LITERAL_MAPPING__ENUM_LITERAL, oldEnumLiteral, enumLiteral));
			}
		}
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral basicGetEnumLiteral() {
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumLiteral(EEnumLiteral newEnumLiteral) {
		EEnumLiteral oldEnumLiteral = enumLiteral;
		enumLiteral = newEnumLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EENUM_LITERAL_MAPPING__ENUM_LITERAL, oldEnumLiteral, enumLiteral));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION, oldConvertExpression, newConvertExpression);
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
				msgs = ((InternalEObject)convertExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION, null, msgs);
			if (newConvertExpression != null)
				msgs = ((InternalEObject)newConvertExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION, null, msgs);
			msgs = basicSetConvertExpression(newConvertExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION, newConvertExpression, newConvertExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION:
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
			case EmfacadePackage.EENUM_LITERAL_MAPPING__ENUM_LITERAL:
				if (resolve) return getEnumLiteral();
				return basicGetEnumLiteral();
			case EmfacadePackage.EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION:
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
			case EmfacadePackage.EENUM_LITERAL_MAPPING__ENUM_LITERAL:
				setEnumLiteral((EEnumLiteral)newValue);
				return;
			case EmfacadePackage.EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION:
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
			case EmfacadePackage.EENUM_LITERAL_MAPPING__ENUM_LITERAL:
				setEnumLiteral((EEnumLiteral)null);
				return;
			case EmfacadePackage.EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION:
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
			case EmfacadePackage.EENUM_LITERAL_MAPPING__ENUM_LITERAL:
				return enumLiteral != null;
			case EmfacadePackage.EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION:
				return convertExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EEnumLiteralMappingImpl
