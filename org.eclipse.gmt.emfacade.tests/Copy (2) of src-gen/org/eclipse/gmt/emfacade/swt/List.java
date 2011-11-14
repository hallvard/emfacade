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
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.List#getMultiplicityStyle <em>Multiplicity Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.List#getSelectionIndices <em>Selection Indices</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.List#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getList()
 * @model
 * @generated
 */
public interface List extends AbstractList
{
  /**
   * Returns the value of the '<em><b>Multiplicity Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.MultiplicityStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity Style</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.MultiplicityStyle
   * @see #setMultiplicityStyle(MultiplicityStyle)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getList_MultiplicityStyle()
   * @model unique="false"
   * @generated
   */
  MultiplicityStyle getMultiplicityStyle();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.List#getMultiplicityStyle <em>Multiplicity Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity Style</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.MultiplicityStyle
   * @see #getMultiplicityStyle()
   * @generated
   */
  void setMultiplicityStyle(MultiplicityStyle value);

  /**
   * Returns the value of the '<em><b>Selection Indices</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection Indices</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection Indices</em>' attribute list.
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getList_SelectionIndices()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getSelectionIndices();

  /**
   * Returns the value of the '<em><b>Selection</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' attribute list.
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getList_Selection()
   * @model unique="false"
   * @generated
   */
  EList<String> getSelection();

} // List
