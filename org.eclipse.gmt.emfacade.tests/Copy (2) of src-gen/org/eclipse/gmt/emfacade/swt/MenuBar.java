/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.MenuBar#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenuBar()
 * @model
 * @generated
 */
public interface MenuBar extends Menu
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.swt.Decorations#getMenuBar <em>Menu Bar</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Decorations)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenuBar_Parent()
   * @see org.eclipse.gmt.emfacade.swt.Decorations#getMenuBar
   * @model opposite="menuBar" transient="false"
   * @generated
   */
  Decorations getParent();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.MenuBar#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Decorations value);

} // MenuBar
