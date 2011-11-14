/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Decorations#isMaximized <em>Maximized</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Decorations#isMinimized <em>Minimized</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Decorations#getMenuBar <em>Menu Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getDecorations()
 * @model abstract="true"
 * @generated
 */
public interface Decorations extends Canvas
{
  /**
	 * Returns the value of the '<em><b>Maximized</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maximized</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximized</em>' attribute.
	 * @see #setMaximized(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getDecorations_Maximized()
	 * @model unique="false"
	 * @generated
	 */
  boolean isMaximized();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Decorations#isMaximized <em>Maximized</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximized</em>' attribute.
	 * @see #isMaximized()
	 * @generated
	 */
  void setMaximized(boolean value);

  /**
	 * Returns the value of the '<em><b>Minimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimized</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimized</em>' attribute.
	 * @see #setMinimized(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getDecorations_Minimized()
	 * @model unique="false"
	 * @generated
	 */
  boolean isMinimized();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Decorations#isMinimized <em>Minimized</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimized</em>' attribute.
	 * @see #isMinimized()
	 * @generated
	 */
  void setMinimized(boolean value);

  /**
	 * Returns the value of the '<em><b>Menu Bar</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.swt.MenuBar#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menu Bar</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Bar</em>' containment reference.
	 * @see #setMenuBar(MenuBar)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getDecorations_MenuBar()
	 * @see org.eclipse.gmt.emfacade.swt.MenuBar#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
  MenuBar getMenuBar();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Decorations#getMenuBar <em>Menu Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Bar</em>' containment reference.
	 * @see #getMenuBar()
	 * @generated
	 */
  void setMenuBar(MenuBar value);

} // Decorations
