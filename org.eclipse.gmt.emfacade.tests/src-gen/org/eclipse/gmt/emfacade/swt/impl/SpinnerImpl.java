/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.emfacade.swt.Spinner;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.SpinnerImpl#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.SpinnerImpl#getTextLimit <em>Text Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpinnerImpl extends IntervalSelectorImpl implements Spinner
{
  /**
	 * The default value of the '{@link #getDigits() <em>Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDigits()
	 * @generated
	 * @ordered
	 */
  protected static final int DIGITS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getDigits() <em>Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDigits()
	 * @generated
	 * @ordered
	 */
  protected int digits = DIGITS_EDEFAULT;

  /**
	 * The default value of the '{@link #getTextLimit() <em>Text Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTextLimit()
	 * @generated
	 * @ordered
	 */
  protected static final int TEXT_LIMIT_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getTextLimit() <em>Text Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTextLimit()
	 * @generated
	 * @ordered
	 */
  protected int textLimit = TEXT_LIMIT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SpinnerImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SwtPackage.Literals.SPINNER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getDigits()
  {
		return digits;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDigits(int newDigits)
  {
		int oldDigits = digits;
		digits = newDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.SPINNER__DIGITS, oldDigits, digits));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getTextLimit()
  {
		return textLimit;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTextLimit(int newTextLimit)
  {
		int oldTextLimit = textLimit;
		textLimit = newTextLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.SPINNER__TEXT_LIMIT, oldTextLimit, textLimit));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SwtPackage.SPINNER__DIGITS:
				return getDigits();
			case SwtPackage.SPINNER__TEXT_LIMIT:
				return getTextLimit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SwtPackage.SPINNER__DIGITS:
				setDigits((Integer)newValue);
				return;
			case SwtPackage.SPINNER__TEXT_LIMIT:
				setTextLimit((Integer)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case SwtPackage.SPINNER__DIGITS:
				setDigits(DIGITS_EDEFAULT);
				return;
			case SwtPackage.SPINNER__TEXT_LIMIT:
				setTextLimit(TEXT_LIMIT_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case SwtPackage.SPINNER__DIGITS:
				return digits != DIGITS_EDEFAULT;
			case SwtPackage.SPINNER__TEXT_LIMIT:
				return textLimit != TEXT_LIMIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (digits: ");
		result.append(digits);
		result.append(", textLimit: ");
		result.append(textLimit);
		result.append(')');
		return result.toString();
	}

} //SpinnerImpl
