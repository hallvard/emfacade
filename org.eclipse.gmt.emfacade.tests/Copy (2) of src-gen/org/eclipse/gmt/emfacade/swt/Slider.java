/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Slider#getThumb <em>Thumb</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getSlider()
 * @model
 * @generated
 */
public interface Slider extends IntervalSelector
{
  /**
   * Returns the value of the '<em><b>Thumb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thumb</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thumb</em>' attribute.
   * @see #setThumb(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getSlider_Thumb()
   * @model unique="false"
   * @generated
   */
  int getThumb();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Slider#getThumb <em>Thumb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thumb</em>' attribute.
   * @see #getThumb()
   * @generated
   */
  void setThumb(int value);

} // Slider
