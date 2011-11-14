/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.SystemColor#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getSystemColor()
 * @model
 * @generated
 */
public interface SystemColor extends Color
{
  /**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.SystemColors}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.SystemColors
	 * @see #setColor(SystemColors)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getSystemColor_Color()
	 * @model unique="false"
	 * @generated
	 */
  SystemColors getColor();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.SystemColor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.SystemColors
	 * @see #getColor()
	 * @generated
	 */
  void setColor(SystemColors value);

} // SystemColor
