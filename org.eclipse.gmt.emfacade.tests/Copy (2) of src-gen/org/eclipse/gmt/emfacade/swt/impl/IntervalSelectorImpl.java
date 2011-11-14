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

import org.eclipse.gmt.emfacade.swt.IntervalSelector;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.IntervalSelectorImpl#getOrientationStyle <em>Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.IntervalSelectorImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.IntervalSelectorImpl#getPageIncrement <em>Page Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalSelectorImpl extends IntervalControlImpl implements IntervalSelector
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
   * The default value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncrement()
   * @generated
   * @ordered
   */
  protected static final int INCREMENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncrement()
   * @generated
   * @ordered
   */
  protected int increment = INCREMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getPageIncrement() <em>Page Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPageIncrement()
   * @generated
   * @ordered
   */
  protected static final int PAGE_INCREMENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPageIncrement() <em>Page Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPageIncrement()
   * @generated
   * @ordered
   */
  protected int pageIncrement = PAGE_INCREMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntervalSelectorImpl()
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
    return SwtPackage.Literals.INTERVAL_SELECTOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.INTERVAL_SELECTOR__ORIENTATION_STYLE, oldOrientationStyle, orientationStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIncrement()
  {
    return increment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncrement(int newIncrement)
  {
    int oldIncrement = increment;
    increment = newIncrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.INTERVAL_SELECTOR__INCREMENT, oldIncrement, increment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPageIncrement()
  {
    return pageIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPageIncrement(int newPageIncrement)
  {
    int oldPageIncrement = pageIncrement;
    pageIncrement = newPageIncrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.INTERVAL_SELECTOR__PAGE_INCREMENT, oldPageIncrement, pageIncrement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SwtPackage.INTERVAL_SELECTOR__ORIENTATION_STYLE:
        return getOrientationStyle();
      case SwtPackage.INTERVAL_SELECTOR__INCREMENT:
        return getIncrement();
      case SwtPackage.INTERVAL_SELECTOR__PAGE_INCREMENT:
        return getPageIncrement();
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
    switch (featureID)
    {
      case SwtPackage.INTERVAL_SELECTOR__ORIENTATION_STYLE:
        setOrientationStyle((OrientationStyle)newValue);
        return;
      case SwtPackage.INTERVAL_SELECTOR__INCREMENT:
        setIncrement((Integer)newValue);
        return;
      case SwtPackage.INTERVAL_SELECTOR__PAGE_INCREMENT:
        setPageIncrement((Integer)newValue);
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
    switch (featureID)
    {
      case SwtPackage.INTERVAL_SELECTOR__ORIENTATION_STYLE:
        setOrientationStyle(ORIENTATION_STYLE_EDEFAULT);
        return;
      case SwtPackage.INTERVAL_SELECTOR__INCREMENT:
        setIncrement(INCREMENT_EDEFAULT);
        return;
      case SwtPackage.INTERVAL_SELECTOR__PAGE_INCREMENT:
        setPageIncrement(PAGE_INCREMENT_EDEFAULT);
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
    switch (featureID)
    {
      case SwtPackage.INTERVAL_SELECTOR__ORIENTATION_STYLE:
        return orientationStyle != ORIENTATION_STYLE_EDEFAULT;
      case SwtPackage.INTERVAL_SELECTOR__INCREMENT:
        return increment != INCREMENT_EDEFAULT;
      case SwtPackage.INTERVAL_SELECTOR__PAGE_INCREMENT:
        return pageIncrement != PAGE_INCREMENT_EDEFAULT;
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
    result.append(", increment: ");
    result.append(increment);
    result.append(", pageIncrement: ");
    result.append(pageIncrement);
    result.append(')');
    return result.toString();
  }

} //IntervalSelectorImpl
