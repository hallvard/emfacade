/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.IntervalSelector#getOrientationStyle <em>Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.IntervalSelector#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.IntervalSelector#getPageIncrement <em>Page Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getIntervalSelector()
 * @model
 * @generated
 */
public interface IntervalSelector extends IntervalControl
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
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getIntervalSelector_OrientationStyle()
   * @model unique="false"
   * @generated
   */
  OrientationStyle getOrientationStyle();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.IntervalSelector#getOrientationStyle <em>Orientation Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation Style</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.OrientationStyle
   * @see #getOrientationStyle()
   * @generated
   */
  void setOrientationStyle(OrientationStyle value);

  /**
   * Returns the value of the '<em><b>Increment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Increment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Increment</em>' attribute.
   * @see #setIncrement(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getIntervalSelector_Increment()
   * @model unique="false"
   * @generated
   */
  int getIncrement();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.IntervalSelector#getIncrement <em>Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Increment</em>' attribute.
   * @see #getIncrement()
   * @generated
   */
  void setIncrement(int value);

  /**
   * Returns the value of the '<em><b>Page Increment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Page Increment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page Increment</em>' attribute.
   * @see #setPageIncrement(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getIntervalSelector_PageIncrement()
   * @model unique="false"
   * @generated
   */
  int getPageIncrement();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.IntervalSelector#getPageIncrement <em>Page Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Page Increment</em>' attribute.
   * @see #getPageIncrement()
   * @generated
   */
  void setPageIncrement(int value);

} // IntervalSelector
