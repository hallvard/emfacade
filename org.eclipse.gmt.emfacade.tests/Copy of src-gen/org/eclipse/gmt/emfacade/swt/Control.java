/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#getTextOrientationStyle <em>Text Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#isTouchEnabled <em>Touch Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#getToolTipText <em>Tool Tip Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#getBackground <em>Background</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Control#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl()
 * @model abstract="true"
 * @generated
 */
public interface Control extends Widget {
	/**
	 * Returns the value of the '<em><b>Border Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.BorderStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.BorderStyle
	 * @see #setBorderStyle(BorderStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_BorderStyle()
	 * @model unique="false"
	 * @generated
	 */
	BorderStyle getBorderStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#getBorderStyle <em>Border Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.BorderStyle
	 * @see #getBorderStyle()
	 * @generated
	 */
	void setBorderStyle(BorderStyle value);

	/**
	 * Returns the value of the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touch Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touch Enabled</em>' attribute.
	 * @see #setTouchEnabled(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_TouchEnabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTouchEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#isTouchEnabled <em>Touch Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touch Enabled</em>' attribute.
	 * @see #isTouchEnabled()
	 * @generated
	 */
	void setTouchEnabled(boolean value);

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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_ToolTipText()
	 * @model unique="false"
	 * @generated
	 */
	String getToolTipText();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#getToolTipText <em>Tool Tip Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Tip Text</em>' attribute.
	 * @see #getToolTipText()
	 * @generated
	 */
	void setToolTipText(String value);

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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_TextOrientationStyle()
	 * @model unique="false"
	 * @generated
	 */
	TextOrientationStyle getTextOrientationStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#getTextOrientationStyle <em>Text Orientation Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Orientation Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.TextOrientationStyle
	 * @see #getTextOrientationStyle()
	 * @generated
	 */
	void setTextOrientationStyle(TextOrientationStyle value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(Color)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_Background()
	 * @model containment="true"
	 * @generated
	 */
	Color getBackground();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Color value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(Font)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_Font()
	 * @model containment="true"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

	/**
	 * Returns the value of the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Data</em>' containment reference.
	 * @see #setLayoutData(LayoutData)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_LayoutData()
	 * @model containment="true"
	 * @generated
	 */
	LayoutData getLayoutData();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#getLayoutData <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Data</em>' containment reference.
	 * @see #getLayoutData()
	 * @generated
	 */
	void setLayoutData(LayoutData value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_Enabled()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_Visible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(AbstractComposite)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getControl_Parent()
	 * @model
	 * @generated
	 */
	AbstractComposite<Control> getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Control#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AbstractComposite<Control> value);

} // Control
