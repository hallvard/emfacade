/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.emfacade.swt.Menu;
import org.eclipse.gmt.emfacade.swt.MenuItem;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuItemImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuItemImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuItemImpl#getAccelerator <em>Accelerator</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuItemImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuItemImpl#isSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuItemImpl extends ItemImpl implements MenuItem
{
  /**
   * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenu()
   * @generated
   * @ordered
   */
  protected Menu menu;

  /**
   * The default value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected static final int ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected int id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getAccelerator() <em>Accelerator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccelerator()
   * @generated
   * @ordered
   */
  protected static final int ACCELERATOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAccelerator() <em>Accelerator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccelerator()
   * @generated
   * @ordered
   */
  protected int accelerator = ACCELERATOR_EDEFAULT;

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
  protected MenuItemImpl()
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
    return SwtPackage.Literals.MENU_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menu getMenu()
  {
    return menu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMenu(Menu newMenu, NotificationChain msgs)
  {
    Menu oldMenu = menu;
    menu = newMenu;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.MENU_ITEM__MENU, oldMenu, newMenu);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenu(Menu newMenu)
  {
    if (newMenu != menu)
    {
      NotificationChain msgs = null;
      if (menu != null)
        msgs = ((InternalEObject)menu).eInverseRemove(this, SwtPackage.MENU__PARENT_ITEM, Menu.class, msgs);
      if (newMenu != null)
        msgs = ((InternalEObject)newMenu).eInverseAdd(this, SwtPackage.MENU__PARENT_ITEM, Menu.class, msgs);
      msgs = basicSetMenu(newMenu, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU_ITEM__MENU, newMenu, newMenu));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getID()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setID(int newID)
  {
    int oldID = id;
    id = newID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU_ITEM__ID, oldID, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAccelerator()
  {
    return accelerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccelerator(int newAccelerator)
  {
    int oldAccelerator = accelerator;
    accelerator = newAccelerator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU_ITEM__ACCELERATOR, oldAccelerator, accelerator));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU_ITEM__ENABLED, oldEnabled, enabled));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU_ITEM__SELECTION, oldSelection, selection));
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
      case SwtPackage.MENU_ITEM__MENU:
        if (menu != null)
          msgs = ((InternalEObject)menu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.MENU_ITEM__MENU, null, msgs);
        return basicSetMenu((Menu)otherEnd, msgs);
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
      case SwtPackage.MENU_ITEM__MENU:
        return basicSetMenu(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SwtPackage.MENU_ITEM__MENU:
        return getMenu();
      case SwtPackage.MENU_ITEM__ID:
        return getID();
      case SwtPackage.MENU_ITEM__ACCELERATOR:
        return getAccelerator();
      case SwtPackage.MENU_ITEM__ENABLED:
        return isEnabled();
      case SwtPackage.MENU_ITEM__SELECTION:
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
      case SwtPackage.MENU_ITEM__MENU:
        setMenu((Menu)newValue);
        return;
      case SwtPackage.MENU_ITEM__ID:
        setID((Integer)newValue);
        return;
      case SwtPackage.MENU_ITEM__ACCELERATOR:
        setAccelerator((Integer)newValue);
        return;
      case SwtPackage.MENU_ITEM__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case SwtPackage.MENU_ITEM__SELECTION:
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
      case SwtPackage.MENU_ITEM__MENU:
        setMenu((Menu)null);
        return;
      case SwtPackage.MENU_ITEM__ID:
        setID(ID_EDEFAULT);
        return;
      case SwtPackage.MENU_ITEM__ACCELERATOR:
        setAccelerator(ACCELERATOR_EDEFAULT);
        return;
      case SwtPackage.MENU_ITEM__ENABLED:
        setEnabled(ENABLED_EDEFAULT);
        return;
      case SwtPackage.MENU_ITEM__SELECTION:
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
      case SwtPackage.MENU_ITEM__MENU:
        return menu != null;
      case SwtPackage.MENU_ITEM__ID:
        return id != ID_EDEFAULT;
      case SwtPackage.MENU_ITEM__ACCELERATOR:
        return accelerator != ACCELERATOR_EDEFAULT;
      case SwtPackage.MENU_ITEM__ENABLED:
        return enabled != ENABLED_EDEFAULT;
      case SwtPackage.MENU_ITEM__SELECTION:
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
    result.append(" (ID: ");
    result.append(id);
    result.append(", accelerator: ");
    result.append(accelerator);
    result.append(", enabled: ");
    result.append(enabled);
    result.append(", selection: ");
    result.append(selection);
    result.append(')');
    return result.toString();
  }

} //MenuItemImpl
