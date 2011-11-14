/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import org.eclipse.emf.common.util.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.ToolItem#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.ToolItem#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.ToolItem#getHotImage <em>Hot Image</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.ToolItem#getToolTipText <em>Tool Tip Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.ToolItem#isSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getToolItem()
 * @model
 * @generated
 */
public interface ToolItem extends Item
{
  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.swt.ToolBar#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ToolBar)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getToolItem_Parent()
	 * @see org.eclipse.gmt.emfacade.swt.ToolBar#getItems
	 * @model opposite="items" transient="false"
	 * @generated
	 */
  ToolBar getParent();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.ToolItem#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(ToolBar value);

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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getToolItem_Enabled()
	 * @model unique="false"
	 * @generated
	 */
  boolean isEnabled();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.ToolItem#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
  void setEnabled(boolean value);

  /**
	 * Returns the value of the '<em><b>Hot Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hot Image</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Image</em>' attribute.
	 * @see #setHotImage(URI)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getToolItem_HotImage()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.swt.ImageRef"
	 * @generated
	 */
  URI getHotImage();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.ToolItem#getHotImage <em>Hot Image</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Image</em>' attribute.
	 * @see #getHotImage()
	 * @generated
	 */
  void setHotImage(URI value);

  /**
	 * Returns the value of the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tool Tip Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Tip Text</em>' attribute.
	 * @see #setToolTipText(String)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getToolItem_ToolTipText()
	 * @model unique="false"
	 * @generated
	 */
  String getToolTipText();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.ToolItem#getToolTipText <em>Tool Tip Text</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Tip Text</em>' attribute.
	 * @see #getToolTipText()
	 * @generated
	 */
  void setToolTipText(String value);

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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getToolItem_Selection()
	 * @model unique="false"
	 * @generated
	 */
  boolean isSelection();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.ToolItem#isSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #isSelection()
	 * @generated
	 */
  void setSelection(boolean value);

} // ToolItem
