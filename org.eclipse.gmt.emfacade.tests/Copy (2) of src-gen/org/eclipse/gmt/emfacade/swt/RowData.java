/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowData#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowData#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowData#isExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowData()
 * @model
 * @generated
 */
public interface RowData extends LayoutData
{
  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * The default value is <code>"-1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowData_Width()
   * @model default="-1" unique="false"
   * @generated
   */
  int getWidth();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowData#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(int value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * The default value is <code>"-1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowData_Height()
   * @model default="-1" unique="false"
   * @generated
   */
  int getHeight();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowData#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(int value);

  /**
   * Returns the value of the '<em><b>Exclude</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude</em>' attribute.
   * @see #setExclude(boolean)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowData_Exclude()
   * @model default="false" unique="false"
   * @generated
   */
  boolean isExclude();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowData#isExclude <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude</em>' attribute.
   * @see #isExclude()
   * @generated
   */
  void setExclude(boolean value);

} // RowData
