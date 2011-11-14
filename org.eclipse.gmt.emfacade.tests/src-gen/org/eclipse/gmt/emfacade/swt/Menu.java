/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Menu#getMenuStyle <em>Menu Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Menu#getParentItem <em>Parent Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends AbstractMenu
{
  /**
	 * Returns the value of the '<em><b>Menu Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.MenuStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.MenuStyle
	 * @see #setMenuStyle(MenuStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenu_MenuStyle()
	 * @model unique="false"
	 * @generated
	 */
	MenuStyle getMenuStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Menu#getMenuStyle <em>Menu Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.MenuStyle
	 * @see #getMenuStyle()
	 * @generated
	 */
	void setMenuStyle(MenuStyle value);

	/**
	 * Returns the value of the '<em><b>Parent Item</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.swt.MenuItem#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Item</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Item</em>' container reference.
	 * @see #setParentItem(MenuItem)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenu_ParentItem()
	 * @see org.eclipse.gmt.emfacade.swt.MenuItem#getMenu
	 * @model opposite="menu" transient="false"
	 * @generated
	 */
	MenuItem getParentItem();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Menu#getParentItem <em>Parent Item</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Item</em>' container reference.
	 * @see #getParentItem()
	 * @generated
	 */
	void setParentItem(MenuItem value);

} // Menu
