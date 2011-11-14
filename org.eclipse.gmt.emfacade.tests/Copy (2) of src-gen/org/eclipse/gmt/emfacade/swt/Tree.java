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
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Tree#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Tree#isHeaderVisible <em>Header Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Tree#isLinesVisible <em>Lines Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Tree#getSortColumn <em>Sort Column</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Tree#getSortDirection <em>Sort Direction</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Tree#getViewer <em>Viewer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends Control
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gmt.emfacade.swt.TreeColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTree_Columns()
   * @model containment="true"
   * @generated
   */
  EList<TreeColumn> getColumns();

  /**
   * Returns the value of the '<em><b>Header Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header Visible</em>' attribute.
   * @see #setHeaderVisible(boolean)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTree_HeaderVisible()
   * @model unique="false"
   * @generated
   */
  boolean isHeaderVisible();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Tree#isHeaderVisible <em>Header Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header Visible</em>' attribute.
   * @see #isHeaderVisible()
   * @generated
   */
  void setHeaderVisible(boolean value);

  /**
   * Returns the value of the '<em><b>Lines Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines Visible</em>' attribute.
   * @see #setLinesVisible(boolean)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTree_LinesVisible()
   * @model unique="false"
   * @generated
   */
  boolean isLinesVisible();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Tree#isLinesVisible <em>Lines Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lines Visible</em>' attribute.
   * @see #isLinesVisible()
   * @generated
   */
  void setLinesVisible(boolean value);

  /**
   * Returns the value of the '<em><b>Sort Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Column</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Column</em>' reference.
   * @see #setSortColumn(TreeColumn)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTree_SortColumn()
   * @model
   * @generated
   */
  TreeColumn getSortColumn();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Tree#getSortColumn <em>Sort Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Column</em>' reference.
   * @see #getSortColumn()
   * @generated
   */
  void setSortColumn(TreeColumn value);

  /**
   * Returns the value of the '<em><b>Sort Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.SortDirection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Direction</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.SortDirection
   * @see #setSortDirection(SortDirection)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTree_SortDirection()
   * @model unique="false"
   * @generated
   */
  SortDirection getSortDirection();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Tree#getSortDirection <em>Sort Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Direction</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.SortDirection
   * @see #getSortDirection()
   * @generated
   */
  void setSortDirection(SortDirection value);

  /**
   * Returns the value of the '<em><b>Viewer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Viewer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Viewer</em>' containment reference.
   * @see #setViewer(TreeViewer)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTree_Viewer()
   * @model containment="true"
   * @generated
   */
  TreeViewer getViewer();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Tree#getViewer <em>Viewer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Viewer</em>' containment reference.
   * @see #getViewer()
   * @generated
   */
  void setViewer(TreeViewer value);

} // Tree
