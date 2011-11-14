/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.TabItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TabItemImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TabItemImpl#getToolTipText <em>Tool Tip Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabItemImpl extends ItemImpl implements TabItem
{
  /**
   * The cached value of the '{@link #getControl() <em>Control</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected Control control;

  /**
   * The default value of the '{@link #getToolTipText() <em>Tool Tip Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolTipText()
   * @generated
   * @ordered
   */
  protected static final String TOOL_TIP_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToolTipText() <em>Tool Tip Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolTipText()
   * @generated
   * @ordered
   */
  protected String toolTipText = TOOL_TIP_TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TabItemImpl()
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
    return SwtPackage.Literals.TAB_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Control getControl()
  {
    if (control != null && control.eIsProxy())
    {
      InternalEObject oldControl = (InternalEObject)control;
      control = (Control)eResolveProxy(oldControl);
      if (control != oldControl)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwtPackage.TAB_ITEM__CONTROL, oldControl, control));
      }
    }
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Control basicGetControl()
  {
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControl(Control newControl)
  {
    Control oldControl = control;
    control = newControl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TAB_ITEM__CONTROL, oldControl, control));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToolTipText()
  {
    return toolTipText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToolTipText(String newToolTipText)
  {
    String oldToolTipText = toolTipText;
    toolTipText = newToolTipText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TAB_ITEM__TOOL_TIP_TEXT, oldToolTipText, toolTipText));
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
      case SwtPackage.TAB_ITEM__CONTROL:
        if (resolve) return getControl();
        return basicGetControl();
      case SwtPackage.TAB_ITEM__TOOL_TIP_TEXT:
        return getToolTipText();
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
      case SwtPackage.TAB_ITEM__CONTROL:
        setControl((Control)newValue);
        return;
      case SwtPackage.TAB_ITEM__TOOL_TIP_TEXT:
        setToolTipText((String)newValue);
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
      case SwtPackage.TAB_ITEM__CONTROL:
        setControl((Control)null);
        return;
      case SwtPackage.TAB_ITEM__TOOL_TIP_TEXT:
        setToolTipText(TOOL_TIP_TEXT_EDEFAULT);
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
      case SwtPackage.TAB_ITEM__CONTROL:
        return control != null;
      case SwtPackage.TAB_ITEM__TOOL_TIP_TEXT:
        return TOOL_TIP_TEXT_EDEFAULT == null ? toolTipText != null : !TOOL_TIP_TEXT_EDEFAULT.equals(toolTipText);
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
    result.append(" (toolTipText: ");
    result.append(toolTipText);
    result.append(')');
    return result.toString();
  }

} //TabItemImpl
