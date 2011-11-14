/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormData#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormData#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormData#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormData#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormData#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormData#getBottom <em>Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormData()
 * @model
 * @generated
 */
public interface FormData extends LayoutData {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormData_Width()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormData#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormData_Height()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormData#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(FormAttachment)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormData_Left()
	 * @model containment="true"
	 * @generated
	 */
	FormAttachment getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormData#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(FormAttachment value);

	/**
	 * Returns the value of the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' containment reference.
	 * @see #setTop(FormAttachment)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormData_Top()
	 * @model containment="true"
	 * @generated
	 */
	FormAttachment getTop();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormData#getTop <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' containment reference.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(FormAttachment value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(FormAttachment)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormData_Right()
	 * @model containment="true"
	 * @generated
	 */
	FormAttachment getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormData#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(FormAttachment value);

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' containment reference.
	 * @see #setBottom(FormAttachment)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormData_Bottom()
	 * @model containment="true"
	 * @generated
	 */
	FormAttachment getBottom();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormData#getBottom <em>Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' containment reference.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(FormAttachment value);

} // FormData
