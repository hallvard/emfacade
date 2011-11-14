/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.xtext.common.types.JvmGenericType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.EventHandler#getInterfaceType <em>Interface Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEventHandler()
 * @model
 * @generated
 */
public interface EventHandler extends InterfaceImplementation {
	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' reference.
	 * @see #setInterfaceType(JvmGenericType)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEventHandler_InterfaceType()
	 * @model
	 * @generated
	 */
	JvmGenericType getInterfaceType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EventHandler#getInterfaceType <em>Interface Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' reference.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(JvmGenericType value);

} // EventHandler
