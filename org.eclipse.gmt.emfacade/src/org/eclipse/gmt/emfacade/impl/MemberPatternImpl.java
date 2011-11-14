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
import org.eclipse.gmt.emfacade.MemberPattern;
import org.eclipse.gmt.emfacade.TypeListPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.MemberPatternImpl#getNamePattern <em>Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.MemberPatternImpl#getTypePattern <em>Type Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.MemberPatternImpl#getParameterListPattern <em>Parameter List Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberPatternImpl extends EObjectImpl implements MemberPattern {
	/**
	 * The default value of the '{@link #getNamePattern() <em>Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamePattern() <em>Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePattern()
	 * @generated
	 * @ordered
	 */
	protected String namePattern = NAME_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypePattern() <em>Type Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypePattern() <em>Type Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePattern()
	 * @generated
	 * @ordered
	 */
	protected String typePattern = TYPE_PATTERN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterListPattern() <em>Parameter List Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterListPattern()
	 * @generated
	 * @ordered
	 */
	protected TypeListPattern parameterListPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.MEMBER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamePattern() {
		return namePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePattern(String newNamePattern) {
		String oldNamePattern = namePattern;
		namePattern = newNamePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.MEMBER_PATTERN__NAME_PATTERN, oldNamePattern, namePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypePattern() {
		return typePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePattern(String newTypePattern) {
		String oldTypePattern = typePattern;
		typePattern = newTypePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.MEMBER_PATTERN__TYPE_PATTERN, oldTypePattern, typePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeListPattern getParameterListPattern() {
		return parameterListPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterListPattern(TypeListPattern newParameterListPattern, NotificationChain msgs) {
		TypeListPattern oldParameterListPattern = parameterListPattern;
		parameterListPattern = newParameterListPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.MEMBER_PATTERN__PARAMETER_LIST_PATTERN, oldParameterListPattern, newParameterListPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterListPattern(TypeListPattern newParameterListPattern) {
		if (newParameterListPattern != parameterListPattern) {
			NotificationChain msgs = null;
			if (parameterListPattern != null)
				msgs = ((InternalEObject)parameterListPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.MEMBER_PATTERN__PARAMETER_LIST_PATTERN, null, msgs);
			if (newParameterListPattern != null)
				msgs = ((InternalEObject)newParameterListPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.MEMBER_PATTERN__PARAMETER_LIST_PATTERN, null, msgs);
			msgs = basicSetParameterListPattern(newParameterListPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.MEMBER_PATTERN__PARAMETER_LIST_PATTERN, newParameterListPattern, newParameterListPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.MEMBER_PATTERN__PARAMETER_LIST_PATTERN:
				return basicSetParameterListPattern(null, msgs);
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
			case EmfacadePackage.MEMBER_PATTERN__NAME_PATTERN:
				return getNamePattern();
			case EmfacadePackage.MEMBER_PATTERN__TYPE_PATTERN:
				return getTypePattern();
			case EmfacadePackage.MEMBER_PATTERN__PARAMETER_LIST_PATTERN:
				return getParameterListPattern();
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
			case EmfacadePackage.MEMBER_PATTERN__NAME_PATTERN:
				setNamePattern((String)newValue);
				return;
			case EmfacadePackage.MEMBER_PATTERN__TYPE_PATTERN:
				setTypePattern((String)newValue);
				return;
			case EmfacadePackage.MEMBER_PATTERN__PARAMETER_LIST_PATTERN:
				setParameterListPattern((TypeListPattern)newValue);
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
			case EmfacadePackage.MEMBER_PATTERN__NAME_PATTERN:
				setNamePattern(NAME_PATTERN_EDEFAULT);
				return;
			case EmfacadePackage.MEMBER_PATTERN__TYPE_PATTERN:
				setTypePattern(TYPE_PATTERN_EDEFAULT);
				return;
			case EmfacadePackage.MEMBER_PATTERN__PARAMETER_LIST_PATTERN:
				setParameterListPattern((TypeListPattern)null);
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
			case EmfacadePackage.MEMBER_PATTERN__NAME_PATTERN:
				return NAME_PATTERN_EDEFAULT == null ? namePattern != null : !NAME_PATTERN_EDEFAULT.equals(namePattern);
			case EmfacadePackage.MEMBER_PATTERN__TYPE_PATTERN:
				return TYPE_PATTERN_EDEFAULT == null ? typePattern != null : !TYPE_PATTERN_EDEFAULT.equals(typePattern);
			case EmfacadePackage.MEMBER_PATTERN__PARAMETER_LIST_PATTERN:
				return parameterListPattern != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (namePattern: ");
		result.append(namePattern);
		result.append(", typePattern: ");
		result.append(typePattern);
		result.append(')');
		return result.toString();
	}

} //MemberPatternImpl
