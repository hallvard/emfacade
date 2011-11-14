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
 * A representation of the model object '<em><b>Abstract Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.AbstractComposite#getControls <em>Controls</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.AbstractComposite#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getAbstractComposite()
 * @model abstract="true"
 * @generated
 */
public interface AbstractComposite<T extends Control> extends Control
{
  /**
   * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
   * The list contents are of type {@link T}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controls</em>' containment reference list.
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getAbstractComposite_Controls()
   * @model containment="true"
   * @generated
   */
  EList<T> getControls();

  /**
   * Returns the value of the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' containment reference.
   * @see #setLayout(Layout)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getAbstractComposite_Layout()
   * @model containment="true"
   * @generated
   */
  Layout<LayoutData> getLayout();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.AbstractComposite#getLayout <em>Layout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' containment reference.
   * @see #getLayout()
   * @generated
   */
  void setLayout(Layout<LayoutData> value);

} // AbstractComposite
