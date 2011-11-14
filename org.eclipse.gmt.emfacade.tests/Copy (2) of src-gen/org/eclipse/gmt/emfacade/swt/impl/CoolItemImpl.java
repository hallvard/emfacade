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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.CoolBar;
import org.eclipse.gmt.emfacade.swt.CoolItem;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

import org.eclipse.swt.graphics.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cool Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.CoolItemImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.CoolItemImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.CoolItemImpl#getMinimumSize <em>Minimum Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.CoolItemImpl#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.CoolItemImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoolItemImpl extends ItemImpl implements CoolItem
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
   * The default value of the '{@link #getMinimumSize() <em>Minimum Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumSize()
   * @generated
   * @ordered
   */
  protected static final Point MINIMUM_SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinimumSize() <em>Minimum Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumSize()
   * @generated
   * @ordered
   */
  protected Point minimumSize = MINIMUM_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getPreferredSize() <em>Preferred Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreferredSize()
   * @generated
   * @ordered
   */
  protected static final Point PREFERRED_SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreferredSize() <em>Preferred Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreferredSize()
   * @generated
   * @ordered
   */
  protected Point preferredSize = PREFERRED_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final Point SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected Point size = SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoolItemImpl()
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
    return SwtPackage.Literals.COOL_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoolBar getParent()
  {
    if (eContainerFeatureID() != SwtPackage.COOL_ITEM__PARENT) return null;
    return (CoolBar)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(CoolBar newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, SwtPackage.COOL_ITEM__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(CoolBar newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != SwtPackage.COOL_ITEM__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, SwtPackage.COOL_BAR__ITEMS, CoolBar.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.COOL_ITEM__PARENT, newParent, newParent));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwtPackage.COOL_ITEM__CONTROL, oldControl, control));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.COOL_ITEM__CONTROL, oldControl, control));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getMinimumSize()
  {
    return minimumSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinimumSize(Point newMinimumSize)
  {
    Point oldMinimumSize = minimumSize;
    minimumSize = newMinimumSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.COOL_ITEM__MINIMUM_SIZE, oldMinimumSize, minimumSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getPreferredSize()
  {
    return preferredSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreferredSize(Point newPreferredSize)
  {
    Point oldPreferredSize = preferredSize;
    preferredSize = newPreferredSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.COOL_ITEM__PREFERRED_SIZE, oldPreferredSize, preferredSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(Point newSize)
  {
    Point oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.COOL_ITEM__SIZE, oldSize, size));
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
      case SwtPackage.COOL_ITEM__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((CoolBar)otherEnd, msgs);
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
      case SwtPackage.COOL_ITEM__PARENT:
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
      case SwtPackage.COOL_ITEM__PARENT:
        return eInternalContainer().eInverseRemove(this, SwtPackage.COOL_BAR__ITEMS, CoolBar.class, msgs);
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
      case SwtPackage.COOL_ITEM__PARENT:
        return getParent();
      case SwtPackage.COOL_ITEM__CONTROL:
        if (resolve) return getControl();
        return basicGetControl();
      case SwtPackage.COOL_ITEM__MINIMUM_SIZE:
        return getMinimumSize();
      case SwtPackage.COOL_ITEM__PREFERRED_SIZE:
        return getPreferredSize();
      case SwtPackage.COOL_ITEM__SIZE:
        return getSize();
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
      case SwtPackage.COOL_ITEM__PARENT:
        setParent((CoolBar)newValue);
        return;
      case SwtPackage.COOL_ITEM__CONTROL:
        setControl((Control)newValue);
        return;
      case SwtPackage.COOL_ITEM__MINIMUM_SIZE:
        setMinimumSize((Point)newValue);
        return;
      case SwtPackage.COOL_ITEM__PREFERRED_SIZE:
        setPreferredSize((Point)newValue);
        return;
      case SwtPackage.COOL_ITEM__SIZE:
        setSize((Point)newValue);
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
      case SwtPackage.COOL_ITEM__PARENT:
        setParent((CoolBar)null);
        return;
      case SwtPackage.COOL_ITEM__CONTROL:
        setControl((Control)null);
        return;
      case SwtPackage.COOL_ITEM__MINIMUM_SIZE:
        setMinimumSize(MINIMUM_SIZE_EDEFAULT);
        return;
      case SwtPackage.COOL_ITEM__PREFERRED_SIZE:
        setPreferredSize(PREFERRED_SIZE_EDEFAULT);
        return;
      case SwtPackage.COOL_ITEM__SIZE:
        setSize(SIZE_EDEFAULT);
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
      case SwtPackage.COOL_ITEM__PARENT:
        return getParent() != null;
      case SwtPackage.COOL_ITEM__CONTROL:
        return control != null;
      case SwtPackage.COOL_ITEM__MINIMUM_SIZE:
        return MINIMUM_SIZE_EDEFAULT == null ? minimumSize != null : !MINIMUM_SIZE_EDEFAULT.equals(minimumSize);
      case SwtPackage.COOL_ITEM__PREFERRED_SIZE:
        return PREFERRED_SIZE_EDEFAULT == null ? preferredSize != null : !PREFERRED_SIZE_EDEFAULT.equals(preferredSize);
      case SwtPackage.COOL_ITEM__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
    result.append(" (minimumSize: ");
    result.append(minimumSize);
    result.append(", preferredSize: ");
    result.append(preferredSize);
    result.append(", size: ");
    result.append(size);
    result.append(')');
    return result.toString();
  }

} //CoolItemImpl
