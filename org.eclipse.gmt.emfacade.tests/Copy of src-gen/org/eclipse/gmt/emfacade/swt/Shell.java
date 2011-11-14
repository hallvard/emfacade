/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Shell#getModalStyle <em>Modal Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Shell#getTrimStyle <em>Trim Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Shell#isFullScreen <em>Full Screen</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Shell#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getShell()
 * @model
 * @generated
 */
public interface Shell extends Decorations {
	/**
	 * Returns the value of the '<em><b>Modal Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.ModalStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modal Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modal Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.ModalStyle
	 * @see #setModalStyle(ModalStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getShell_ModalStyle()
	 * @model unique="false"
	 * @generated
	 */
	ModalStyle getModalStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Shell#getModalStyle <em>Modal Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modal Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.ModalStyle
	 * @see #getModalStyle()
	 * @generated
	 */
	void setModalStyle(ModalStyle value);

	/**
	 * Returns the value of the '<em><b>Trim Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.TrimStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trim Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.TrimStyle
	 * @see #setTrimStyle(TrimStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getShell_TrimStyle()
	 * @model unique="false"
	 * @generated
	 */
	TrimStyle getTrimStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Shell#getTrimStyle <em>Trim Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.TrimStyle
	 * @see #getTrimStyle()
	 * @generated
	 */
	void setTrimStyle(TrimStyle value);

	/**
	 * Returns the value of the '<em><b>Full Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Screen</em>' attribute.
	 * @see #setFullScreen(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getShell_FullScreen()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFullScreen();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Shell#isFullScreen <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Screen</em>' attribute.
	 * @see #isFullScreen()
	 * @generated
	 */
	void setFullScreen(boolean value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getShell_Alpha()
	 * @model unique="false"
	 * @generated
	 */
	int getAlpha();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Shell#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(int value);

} // Shell
