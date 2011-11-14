/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Separator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Separator#getOrientationStyle <em>Orientation Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getSeparator()
 * @model
 * @generated
 */
public interface Separator extends Control
{
  /**
	 * Returns the value of the '<em><b>Orientation Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.OrientationStyle}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.OrientationStyle
	 * @see #setOrientationStyle(OrientationStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getSeparator_OrientationStyle()
	 * @model unique="false"
	 * @generated
	 */
  OrientationStyle getOrientationStyle();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Separator#getOrientationStyle <em>Orientation Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.OrientationStyle
	 * @see #getOrientationStyle()
	 * @generated
	 */
  void setOrientationStyle(OrientationStyle value);

} // Separator
