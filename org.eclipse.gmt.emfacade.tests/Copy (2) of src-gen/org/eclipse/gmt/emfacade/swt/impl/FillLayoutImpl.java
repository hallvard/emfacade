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

import org.eclipse.gmt.emfacade.swt.FillLayout;
import org.eclipse.gmt.emfacade.swt.LayoutData;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FillLayoutImpl#getOrientationStyle <em>Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FillLayoutImpl#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FillLayoutImpl#getMarginHeight <em>Margin Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FillLayoutImpl#getSpacing <em>Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FillLayoutImpl extends LayoutImpl<LayoutData> implements FillLayout
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
   * The default value of the '{@link #getMarginWidth() <em>Margin Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginWidth()
   * @generated
   * @ordered
   */
  protected static final int MARGIN_WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMarginWidth() <em>Margin Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginWidth()
   * @generated
   * @ordered
   */
  protected int marginWidth = MARGIN_WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getMarginHeight() <em>Margin Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginHeight()
   * @generated
   * @ordered
   */
  protected static final int MARGIN_HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMarginHeight() <em>Margin Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarginHeight()
   * @generated
   * @ordered
   */
  protected int marginHeight = MARGIN_HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpacing()
   * @generated
   * @ordered
   */
  protected static final int SPACING_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpacing()
   * @generated
   * @ordered
   */
  protected int spacing = SPACING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FillLayoutImpl()
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
    return SwtPackage.Literals.FILL_LAYOUT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FILL_LAYOUT__ORIENTATION_STYLE, oldOrientationStyle, orientationStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMarginWidth()
  {
    return marginWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginWidth(int newMarginWidth)
  {
    int oldMarginWidth = marginWidth;
    marginWidth = newMarginWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FILL_LAYOUT__MARGIN_WIDTH, oldMarginWidth, marginWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMarginHeight()
  {
    return marginHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarginHeight(int newMarginHeight)
  {
    int oldMarginHeight = marginHeight;
    marginHeight = newMarginHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FILL_LAYOUT__MARGIN_HEIGHT, oldMarginHeight, marginHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSpacing()
  {
    return spacing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpacing(int newSpacing)
  {
    int oldSpacing = spacing;
    spacing = newSpacing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FILL_LAYOUT__SPACING, oldSpacing, spacing));
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
      case SwtPackage.FILL_LAYOUT__ORIENTATION_STYLE:
        return getOrientationStyle();
      case SwtPackage.FILL_LAYOUT__MARGIN_WIDTH:
        return getMarginWidth();
      case SwtPackage.FILL_LAYOUT__MARGIN_HEIGHT:
        return getMarginHeight();
      case SwtPackage.FILL_LAYOUT__SPACING:
        return getSpacing();
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
      case SwtPackage.FILL_LAYOUT__ORIENTATION_STYLE:
        setOrientationStyle((OrientationStyle)newValue);
        return;
      case SwtPackage.FILL_LAYOUT__MARGIN_WIDTH:
        setMarginWidth((Integer)newValue);
        return;
      case SwtPackage.FILL_LAYOUT__MARGIN_HEIGHT:
        setMarginHeight((Integer)newValue);
        return;
      case SwtPackage.FILL_LAYOUT__SPACING:
        setSpacing((Integer)newValue);
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
      case SwtPackage.FILL_LAYOUT__ORIENTATION_STYLE:
        setOrientationStyle(ORIENTATION_STYLE_EDEFAULT);
        return;
      case SwtPackage.FILL_LAYOUT__MARGIN_WIDTH:
        setMarginWidth(MARGIN_WIDTH_EDEFAULT);
        return;
      case SwtPackage.FILL_LAYOUT__MARGIN_HEIGHT:
        setMarginHeight(MARGIN_HEIGHT_EDEFAULT);
        return;
      case SwtPackage.FILL_LAYOUT__SPACING:
        setSpacing(SPACING_EDEFAULT);
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
      case SwtPackage.FILL_LAYOUT__ORIENTATION_STYLE:
        return orientationStyle != ORIENTATION_STYLE_EDEFAULT;
      case SwtPackage.FILL_LAYOUT__MARGIN_WIDTH:
        return marginWidth != MARGIN_WIDTH_EDEFAULT;
      case SwtPackage.FILL_LAYOUT__MARGIN_HEIGHT:
        return marginHeight != MARGIN_HEIGHT_EDEFAULT;
      case SwtPackage.FILL_LAYOUT__SPACING:
        return spacing != SPACING_EDEFAULT;
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
    result.append(", marginWidth: ");
    result.append(marginWidth);
    result.append(", marginHeight: ");
    result.append(marginHeight);
    result.append(", spacing: ");
    result.append(spacing);
    result.append(')');
    return result.toString();
  }

} //FillLayoutImpl
