/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Border#isOpaque <em>Opaque</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getBorder()
 * @model abstract="true"
 * @generated
 */
public interface Border extends EObject {
	/**
	 * Returns the value of the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opaque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opaque</em>' attribute.
	 * @see #setOpaque(boolean)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getBorder_Opaque()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOpaque();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Border#isOpaque <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opaque</em>' attribute.
	 * @see #isOpaque()
	 * @generated
	 */
	void setOpaque(boolean value);

} // Border
