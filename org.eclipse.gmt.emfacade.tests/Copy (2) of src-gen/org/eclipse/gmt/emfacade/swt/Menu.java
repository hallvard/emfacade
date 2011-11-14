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
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Menu#getParentItem <em>Parent Item</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Menu#getTextOrientationStyle <em>Text Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Menu#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Menu#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Menu#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends Widget
{
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

  /**
   * Returns the value of the '<em><b>Text Orientation Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.TextOrientationStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Orientation Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Orientation Style</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.TextOrientationStyle
   * @see #setTextOrientationStyle(TextOrientationStyle)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenu_TextOrientationStyle()
   * @model unique="false"
   * @generated
   */
  TextOrientationStyle getTextOrientationStyle();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Menu#getTextOrientationStyle <em>Text Orientation Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Orientation Style</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.TextOrientationStyle
   * @see #getTextOrientationStyle()
   * @generated
   */
  void setTextOrientationStyle(TextOrientationStyle value);

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
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenu_Enabled()
   * @model unique="false"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Menu#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see #setVisible(boolean)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenu_Visible()
   * @model unique="false"
   * @generated
   */
  boolean isVisible();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Menu#isVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see #isVisible()
   * @generated
   */
  void setVisible(boolean value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gmt.emfacade.swt.MenuItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getMenu_Items()
   * @model containment="true"
   * @generated
   */
  EList<MenuItem> getItems();

} // Menu
