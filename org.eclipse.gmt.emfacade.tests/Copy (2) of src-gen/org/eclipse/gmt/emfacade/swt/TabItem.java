/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.TabItem#getControl <em>Control</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.TabItem#getToolTipText <em>Tool Tip Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTabItem()
 * @model
 * @generated
 */
public interface TabItem extends Item
{
  /**
   * Returns the value of the '<em><b>Control</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control</em>' reference.
   * @see #setControl(Control)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTabItem_Control()
   * @model
   * @generated
   */
  Control getControl();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.TabItem#getControl <em>Control</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control</em>' reference.
   * @see #getControl()
   * @generated
   */
  void setControl(Control value);

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
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTabItem_ToolTipText()
   * @model unique="false"
   * @generated
   */
  String getToolTipText();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.TabItem#getToolTipText <em>Tool Tip Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tool Tip Text</em>' attribute.
   * @see #getToolTipText()
   * @generated
   */
  void setToolTipText(String value);

} // TabItem
