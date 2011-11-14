/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.ToolBar;
import org.eclipse.gmt.emfacade.swt.ToolItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ToolItemImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ToolItemImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ToolItemImpl#getHotImage <em>Hot Image</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ToolItemImpl#getToolTipText <em>Tool Tip Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ToolItemImpl#isSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolItemImpl extends ItemImpl implements ToolItem
{
  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean enabled = ENABLED_EDEFAULT;

  /**
   * The default value of the '{@link #getHotImage() <em>Hot Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHotImage()
   * @generated
   * @ordered
   */
  protected static final URI HOT_IMAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHotImage() <em>Hot Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHotImage()
   * @generated
   * @ordered
   */
  protected URI hotImage = HOT_IMAGE_EDEFAULT;

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
   * The default value of the '{@link #isSelection() <em>Selection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelection()
   * @generated
   * @ordered
   */
  protected static final boolean SELECTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSelection() <em>Selection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelection()
   * @generated
   * @ordered
   */
  protected boolean selection = SELECTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ToolItemImpl()
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
    return SwtPackage.Literals.TOOL_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToolBar getParent()
  {
    if (eContainerFeatureID() != SwtPackage.TOOL_ITEM__PARENT) return null;
    return (ToolBar)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(ToolBar newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, SwtPackage.TOOL_ITEM__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(ToolBar newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != SwtPackage.TOOL_ITEM__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, SwtPackage.TOOL_BAR__ITEMS, ToolBar.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TOOL_ITEM__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(boolean newEnabled)
  {
    boolean oldEnabled = enabled;
    enabled = newEnabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TOOL_ITEM__ENABLED, oldEnabled, enabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URI getHotImage()
  {
    return hotImage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHotImage(URI newHotImage)
  {
    URI oldHotImage = hotImage;
    hotImage = newHotImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TOOL_ITEM__HOT_IMAGE, oldHotImage, hotImage));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TOOL_ITEM__TOOL_TIP_TEXT, oldToolTipText, toolTipText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSelection()
  {
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelection(boolean newSelection)
  {
    boolean oldSelection = selection;
    selection = newSelection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TOOL_ITEM__SELECTION, oldSelection, selection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SwtPackage.TOOL_ITEM__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((ToolBar)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SwtPackage.TOOL_ITEM__PARENT:
        return basicSetParent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case SwtPackage.TOOL_ITEM__PARENT:
        return eInternalContainer().eInverseRemove(this, SwtPackage.TOOL_BAR__ITEMS, ToolBar.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case SwtPackage.TOOL_ITEM__PARENT:
        return getParent();
      case SwtPackage.TOOL_ITEM__ENABLED:
        return isEnabled();
      case SwtPackage.TOOL_ITEM__HOT_IMAGE:
        return getHotImage();
      case SwtPackage.TOOL_ITEM__TOOL_TIP_TEXT:
        return getToolTipText();
      case SwtPackage.TOOL_ITEM__SELECTION:
        return isSelection();
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
      case SwtPackage.TOOL_ITEM__PARENT:
        setParent((ToolBar)newValue);
        return;
      case SwtPackage.TOOL_ITEM__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case SwtPackage.TOOL_ITEM__HOT_IMAGE:
        setHotImage((URI)newValue);
        return;
      case SwtPackage.TOOL_ITEM__TOOL_TIP_TEXT:
        setToolTipText((String)newValue);
        return;
      case SwtPackage.TOOL_ITEM__SELECTION:
        setSelection((Boolean)newValue);
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
      case SwtPackage.TOOL_ITEM__PARENT:
        setParent((ToolBar)null);
        return;
      case SwtPackage.TOOL_ITEM__ENABLED:
        setEnabled(ENABLED_EDEFAULT);
        return;
      case SwtPackage.TOOL_ITEM__HOT_IMAGE:
        setHotImage(HOT_IMAGE_EDEFAULT);
        return;
      case SwtPackage.TOOL_ITEM__TOOL_TIP_TEXT:
        setToolTipText(TOOL_TIP_TEXT_EDEFAULT);
        return;
      case SwtPackage.TOOL_ITEM__SELECTION:
        setSelection(SELECTION_EDEFAULT);
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
      case SwtPackage.TOOL_ITEM__PARENT:
        return getParent() != null;
      case SwtPackage.TOOL_ITEM__ENABLED:
        return enabled != ENABLED_EDEFAULT;
      case SwtPackage.TOOL_ITEM__HOT_IMAGE:
        return HOT_IMAGE_EDEFAULT == null ? hotImage != null : !HOT_IMAGE_EDEFAULT.equals(hotImage);
      case SwtPackage.TOOL_ITEM__TOOL_TIP_TEXT:
        return TOOL_TIP_TEXT_EDEFAULT == null ? toolTipText != null : !TOOL_TIP_TEXT_EDEFAULT.equals(toolTipText);
      case SwtPackage.TOOL_ITEM__SELECTION:
        return selection != SELECTION_EDEFAULT;
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
    result.append(" (enabled: ");
    result.append(enabled);
    result.append(", hotImage: ");
    result.append(hotImage);
    result.append(", toolTipText: ");
    result.append(toolTipText);
    result.append(", selection: ");
    result.append(selection);
    result.append(')');
    return result.toString();
  }

} //ToolItemImpl
