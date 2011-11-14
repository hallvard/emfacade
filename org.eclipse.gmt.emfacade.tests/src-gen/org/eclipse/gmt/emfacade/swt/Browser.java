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
 * A representation of the model object '<em><b>Browser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Browser#isJavascriptEnabled <em>Javascript Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Browser#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Browser#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getBrowser()
 * @model
 * @generated
 */
public interface Browser extends Control {
	/**
	 * Returns the value of the '<em><b>Javascript Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Javascript Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Javascript Enabled</em>' attribute.
	 * @see #setJavascriptEnabled(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getBrowser_JavascriptEnabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isJavascriptEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Browser#isJavascriptEnabled <em>Javascript Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Javascript Enabled</em>' attribute.
	 * @see #isJavascriptEnabled()
	 * @generated
	 */
	void setJavascriptEnabled(boolean value);

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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getBrowser_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Browser#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(URI)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getBrowser_Url()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.swt.URI"
	 * @generated
	 */
	URI getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Browser#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(URI value);

} // Browser
