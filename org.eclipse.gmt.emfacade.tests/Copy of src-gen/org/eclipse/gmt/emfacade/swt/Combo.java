/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Combo#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Combo#getTextLimit <em>Text Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCombo()
 * @model
 * @generated
 */
public interface Combo extends AbstractList {

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCombo_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Combo#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Text Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Limit</em>' attribute.
	 * @see #setTextLimit(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCombo_TextLimit()
	 * @model unique="false"
	 * @generated
	 */
	int getTextLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Combo#getTextLimit <em>Text Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Limit</em>' attribute.
	 * @see #getTextLimit()
	 * @generated
	 */
	void setTextLimit(int value);
} // Combo
