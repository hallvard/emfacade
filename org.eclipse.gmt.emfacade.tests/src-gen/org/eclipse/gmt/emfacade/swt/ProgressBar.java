/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.ProgressBar#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getProgressBar()
 * @model
 * @generated
 */
public interface ProgressBar extends IntervalControl
{
  /**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.ProgressState}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.ProgressState
	 * @see #setState(ProgressState)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getProgressBar_State()
	 * @model unique="false"
	 * @generated
	 */
  ProgressState getState();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.ProgressBar#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.ProgressState
	 * @see #getState()
	 * @generated
	 */
  void setState(ProgressState value);

} // ProgressBar
