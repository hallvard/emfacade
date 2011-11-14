/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Spinner#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Spinner#getTextLimit <em>Text Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getSpinner()
 * @model
 * @generated
 */
public interface Spinner extends IntervalSelector
{
  /**
   * Returns the value of the '<em><b>Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Digits</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Digits</em>' attribute.
   * @see #setDigits(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getSpinner_Digits()
   * @model unique="false"
   * @generated
   */
  int getDigits();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Spinner#getDigits <em>Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Digits</em>' attribute.
   * @see #getDigits()
   * @generated
   */
  void setDigits(int value);

  /**
   * Returns the value of the '<em><b>Text Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Limit</em>' attribute.
   * @see #setTextLimit(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getSpinner_TextLimit()
   * @model unique="false"
   * @generated
   */
  int getTextLimit();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Spinner#getTextLimit <em>Text Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Limit</em>' attribute.
   * @see #getTextLimit()
   * @generated
   */
  void setTextLimit(int value);

} // Spinner
