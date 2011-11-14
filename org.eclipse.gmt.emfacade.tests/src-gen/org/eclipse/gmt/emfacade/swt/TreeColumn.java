/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.TreeColumn#getToolTipText <em>Tool Tip Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.TreeColumn#getDisplayText <em>Display Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTreeColumn()
 * @model
 * @generated
 */
public interface TreeColumn extends Item
{
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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTreeColumn_ToolTipText()
	 * @model unique="false"
	 * @generated
	 */
  String getToolTipText();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.TreeColumn#getToolTipText <em>Tool Tip Text</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Tip Text</em>' attribute.
	 * @see #getToolTipText()
	 * @generated
	 */
  void setToolTipText(String value);

  /**
	 * Returns the value of the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Text</em>' attribute.
	 * @see #setDisplayText(String)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTreeColumn_DisplayText()
	 * @model unique="false"
	 * @generated
	 */
  String getDisplayText();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.TreeColumn#getDisplayText <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Text</em>' attribute.
	 * @see #getDisplayText()
	 * @generated
	 */
  void setDisplayText(String value);

} // TreeColumn
