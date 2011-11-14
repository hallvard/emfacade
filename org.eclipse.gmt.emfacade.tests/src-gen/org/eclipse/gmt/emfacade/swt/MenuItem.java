/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.MenuItem#getMenuItemStyle <em>Menu Item Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.MenuItem#getMenu <em>Menu</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.MenuItem#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.MenuItem#getAccelerator <em>Accelerator</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.MenuItem#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.MenuItem#isSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenuItem()
 * @model
 * @generated
 */
public interface MenuItem extends Item
{
  /**
	 * Returns the value of the '<em><b>Menu Item Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.MenuItemStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Item Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Item Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItemStyle
	 * @see #setMenuItemStyle(MenuItemStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenuItem_MenuItemStyle()
	 * @model unique="false"
	 * @generated
	 */
	MenuItemStyle getMenuItemStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.MenuItem#getMenuItemStyle <em>Menu Item Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Item Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItemStyle
	 * @see #getMenuItemStyle()
	 * @generated
	 */
	void setMenuItemStyle(MenuItemStyle value);

		/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.swt.Menu#getParentItem <em>Parent Item</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menu</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference.
	 * @see #setMenu(Menu)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenuItem_Menu()
	 * @see org.eclipse.gmt.emfacade.swt.Menu#getParentItem
	 * @model opposite="parentItem" containment="true"
	 * @generated
	 */
  Menu getMenu();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.MenuItem#getMenu <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' containment reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

		/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenuItem_ID()
	 * @model unique="false"
	 * @generated
	 */
  int getID();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.MenuItem#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
  void setID(int value);

  /**
	 * Returns the value of the '<em><b>Accelerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accelerator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Accelerator</em>' attribute.
	 * @see #setAccelerator(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenuItem_Accelerator()
	 * @model unique="false"
	 * @generated
	 */
  int getAccelerator();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.MenuItem#getAccelerator <em>Accelerator</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accelerator</em>' attribute.
	 * @see #getAccelerator()
	 * @generated
	 */
  void setAccelerator(int value);

  /**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenuItem_Enabled()
	 * @model unique="false"
	 * @generated
	 */
  boolean isEnabled();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.MenuItem#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
  void setEnabled(boolean value);

  /**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenuItem_Selection()
	 * @model unique="false"
	 * @generated
	 */
  boolean isSelection();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.MenuItem#isSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #isSelection()
	 * @generated
	 */
  void setSelection(boolean value);

} // MenuItem
