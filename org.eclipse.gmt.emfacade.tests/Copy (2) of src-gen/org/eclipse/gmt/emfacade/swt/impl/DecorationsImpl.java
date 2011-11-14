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

import org.eclipse.gmt.emfacade.swt.Decorations;
import org.eclipse.gmt.emfacade.swt.MenuBar;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decorations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.DecorationsImpl#isMaximized <em>Maximized</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.DecorationsImpl#isMinimized <em>Minimized</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.DecorationsImpl#getMenuBar <em>Menu Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DecorationsImpl extends CanvasImpl implements Decorations
{
  /**
   * The default value of the '{@link #isMaximized() <em>Maximized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaximized()
   * @generated
   * @ordered
   */
  protected static final boolean MAXIMIZED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMaximized() <em>Maximized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaximized()
   * @generated
   * @ordered
   */
  protected boolean maximized = MAXIMIZED_EDEFAULT;

  /**
   * The default value of the '{@link #isMinimized() <em>Minimized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMinimized()
   * @generated
   * @ordered
   */
  protected static final boolean MINIMIZED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMinimized() <em>Minimized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMinimized()
   * @generated
   * @ordered
   */
  protected boolean minimized = MINIMIZED_EDEFAULT;

  /**
   * The cached value of the '{@link #getMenuBar() <em>Menu Bar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenuBar()
   * @generated
   * @ordered
   */
  protected MenuBar menuBar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecorationsImpl()
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
    return SwtPackage.Literals.DECORATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMaximized()
  {
    return maximized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaximized(boolean newMaximized)
  {
    boolean oldMaximized = maximized;
    maximized = newMaximized;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.DECORATIONS__MAXIMIZED, oldMaximized, maximized));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMinimized()
  {
    return minimized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinimized(boolean newMinimized)
  {
    boolean oldMinimized = minimized;
    minimized = newMinimized;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.DECORATIONS__MINIMIZED, oldMinimized, minimized));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuBar getMenuBar()
  {
    return menuBar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMenuBar(MenuBar newMenuBar, NotificationChain msgs)
  {
    MenuBar oldMenuBar = menuBar;
    menuBar = newMenuBar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.DECORATIONS__MENU_BAR, oldMenuBar, newMenuBar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenuBar(MenuBar newMenuBar)
  {
    if (newMenuBar != menuBar)
    {
      NotificationChain msgs = null;
      if (menuBar != null)
        msgs = ((InternalEObject)menuBar).eInverseRemove(this, SwtPackage.MENU_BAR__PARENT, MenuBar.class, msgs);
      if (newMenuBar != null)
        msgs = ((InternalEObject)newMenuBar).eInverseAdd(this, SwtPackage.MENU_BAR__PARENT, MenuBar.class, msgs);
      msgs = basicSetMenuBar(newMenuBar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.DECORATIONS__MENU_BAR, newMenuBar, newMenuBar));
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
      case SwtPackage.DECORATIONS__MENU_BAR:
        if (menuBar != null)
          msgs = ((InternalEObject)menuBar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.DECORATIONS__MENU_BAR, null, msgs);
        return basicSetMenuBar((MenuBar)otherEnd, msgs);
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
      case SwtPackage.DECORATIONS__MENU_BAR:
        return basicSetMenuBar(null, msgs);
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
      case SwtPackage.DECORATIONS__MAXIMIZED:
        return isMaximized();
      case SwtPackage.DECORATIONS__MINIMIZED:
        return isMinimized();
      case SwtPackage.DECORATIONS__MENU_BAR:
        return getMenuBar();
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
      case SwtPackage.DECORATIONS__MAXIMIZED:
        setMaximized((Boolean)newValue);
        return;
      case SwtPackage.DECORATIONS__MINIMIZED:
        setMinimized((Boolean)newValue);
        return;
      case SwtPackage.DECORATIONS__MENU_BAR:
        setMenuBar((MenuBar)newValue);
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
      case SwtPackage.DECORATIONS__MAXIMIZED:
        setMaximized(MAXIMIZED_EDEFAULT);
        return;
      case SwtPackage.DECORATIONS__MINIMIZED:
        setMinimized(MINIMIZED_EDEFAULT);
        return;
      case SwtPackage.DECORATIONS__MENU_BAR:
        setMenuBar((MenuBar)null);
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
      case SwtPackage.DECORATIONS__MAXIMIZED:
        return maximized != MAXIMIZED_EDEFAULT;
      case SwtPackage.DECORATIONS__MINIMIZED:
        return minimized != MINIMIZED_EDEFAULT;
      case SwtPackage.DECORATIONS__MENU_BAR:
        return menuBar != null;
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
    result.append(" (maximized: ");
    result.append(maximized);
    result.append(", minimized: ");
    result.append(minimized);
    result.append(')');
    return result.toString();
  }

} //DecorationsImpl
