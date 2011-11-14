/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.gmt.emfacade.swt.AbstractList;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.AbstractListImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.AbstractListImpl#getSelectionIndex <em>Selection Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractListImpl extends ControlImpl implements AbstractList
{
  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<String> items;

  /**
   * The default value of the '{@link #getSelectionIndex() <em>Selection Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectionIndex()
   * @generated
   * @ordered
   */
  protected static final int SELECTION_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSelectionIndex() <em>Selection Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectionIndex()
   * @generated
   * @ordered
   */
  protected int selectionIndex = SELECTION_INDEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractListImpl()
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
    return SwtPackage.Literals.ABSTRACT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getItems()
  {
    if (items == null)
    {
      items = new EDataTypeEList<String>(String.class, this, SwtPackage.ABSTRACT_LIST__ITEMS);
    }
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSelectionIndex()
  {
    return selectionIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectionIndex(int newSelectionIndex)
  {
    int oldSelectionIndex = selectionIndex;
    selectionIndex = newSelectionIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ABSTRACT_LIST__SELECTION_INDEX, oldSelectionIndex, selectionIndex));
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
      case SwtPackage.ABSTRACT_LIST__ITEMS:
        return getItems();
      case SwtPackage.ABSTRACT_LIST__SELECTION_INDEX:
        return getSelectionIndex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SwtPackage.ABSTRACT_LIST__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends String>)newValue);
        return;
      case SwtPackage.ABSTRACT_LIST__SELECTION_INDEX:
        setSelectionIndex((Integer)newValue);
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
      case SwtPackage.ABSTRACT_LIST__ITEMS:
        getItems().clear();
        return;
      case SwtPackage.ABSTRACT_LIST__SELECTION_INDEX:
        setSelectionIndex(SELECTION_INDEX_EDEFAULT);
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
      case SwtPackage.ABSTRACT_LIST__ITEMS:
        return items != null && !items.isEmpty();
      case SwtPackage.ABSTRACT_LIST__SELECTION_INDEX:
        return selectionIndex != SELECTION_INDEX_EDEFAULT;
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
    result.append(" (items: ");
    result.append(items);
    result.append(", selectionIndex: ");
    result.append(selectionIndex);
    result.append(')');
    return result.toString();
  }

} //AbstractListImpl
