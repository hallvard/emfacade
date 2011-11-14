/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.AbstractList#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.AbstractList#getSelectionIndex <em>Selection Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getAbstractList()
 * @model abstract="true"
 * @generated
 */
public interface AbstractList extends Control
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' attribute list.
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getAbstractList_Items()
   * @model unique="false"
   * @generated
   */
  EList<String> getItems();

  /**
   * Returns the value of the '<em><b>Selection Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection Index</em>' attribute.
   * @see #setSelectionIndex(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getAbstractList_SelectionIndex()
   * @model unique="false"
   * @generated
   */
  int getSelectionIndex();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.AbstractList#getSelectionIndex <em>Selection Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection Index</em>' attribute.
   * @see #getSelectionIndex()
   * @generated
   */
  void setSelectionIndex(int value);

} // AbstractList
