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
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.Separator;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.swt.SWT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Separator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.SeparatorImpl#getOrientationStyle <em>Orientation Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeparatorImpl extends ControlImpl implements Separator
{
  /**
	 * The default value of the '{@link #getOrientationStyle() <em>Orientation Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrientationStyle()
	 * @generated
	 * @ordered
	 */
  protected static final OrientationStyle ORIENTATION_STYLE_EDEFAULT = OrientationStyle.HORIZONTAL;

  /**
	 * The cached value of the '{@link #getOrientationStyle() <em>Orientation Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrientationStyle()
	 * @generated
	 * @ordered
	 */
  protected OrientationStyle orientationStyle = ORIENTATION_STYLE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SeparatorImpl()
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
		return SwtPackage.Literals.SEPARATOR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OrientationStyle getOrientationStyle()
  {
		return orientationStyle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrientationStyle(OrientationStyle newOrientationStyle)
  {
		OrientationStyle oldOrientationStyle = orientationStyle;
		orientationStyle = newOrientationStyle == null ? ORIENTATION_STYLE_EDEFAULT : newOrientationStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.SEPARATOR__ORIENTATION_STYLE, oldOrientationStyle, orientationStyle));
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
			case SwtPackage.SEPARATOR__ORIENTATION_STYLE:
				return getOrientationStyle();
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
			case SwtPackage.SEPARATOR__ORIENTATION_STYLE:
				setOrientationStyle((OrientationStyle)newValue);
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
			case SwtPackage.SEPARATOR__ORIENTATION_STYLE:
				setOrientationStyle(ORIENTATION_STYLE_EDEFAULT);
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
			case SwtPackage.SEPARATOR__ORIENTATION_STYLE:
				return orientationStyle != ORIENTATION_STYLE_EDEFAULT;
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
		result.append(" (orientationStyle: ");
		result.append(orientationStyle);
		result.append(')');
		return result.toString();
	}

	@Override
	public int getStyle() {
		return super.getStyle() | SWT.SEPARATOR;
	}
} //SeparatorImpl
