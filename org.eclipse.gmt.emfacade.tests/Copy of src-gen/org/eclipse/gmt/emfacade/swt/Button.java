/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Button#getButtonStyle <em>Button Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Button#getArrowStyle <em>Arrow Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Button#isSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Control, Labeled {

	/**
	 * Returns the value of the '<em><b>Button Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.ButtonStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.ButtonStyle
	 * @see #setButtonStyle(ButtonStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getButton_ButtonStyle()
	 * @model unique="false"
	 * @generated
	 */
	ButtonStyle getButtonStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Button#getButtonStyle <em>Button Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.ButtonStyle
	 * @see #getButtonStyle()
	 * @generated
	 */
	void setButtonStyle(ButtonStyle value);

	/**
	 * Returns the value of the '<em><b>Arrow Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.ArrowStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrow Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.ArrowStyle
	 * @see #setArrowStyle(ArrowStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getButton_ArrowStyle()
	 * @model unique="false"
	 * @generated
	 */
	ArrowStyle getArrowStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Button#getArrowStyle <em>Arrow Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.ArrowStyle
	 * @see #getArrowStyle()
	 * @generated
	 */
	void setArrowStyle(ArrowStyle value);

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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getButton_Selection()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSelection();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Button#isSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #isSelection()
	 * @generated
	 */
	void setSelection(boolean value);
} // Button
