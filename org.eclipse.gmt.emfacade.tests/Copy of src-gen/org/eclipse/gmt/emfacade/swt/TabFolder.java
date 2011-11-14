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
 * A representation of the model object '<em><b>Tab Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.TabFolder#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTabFolder()
 * @model
 * @generated
 */
public interface TabFolder extends AbstractComposite<Control> {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.swt.TabItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTabFolder_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<TabItem> getItems();

} // TabFolder
