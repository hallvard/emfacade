/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.MethodPattern#getParameterTypePatterns <em>Parameter Type Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getMethodPattern()
 * @model
 * @generated
 */
public interface MethodPattern extends MemberPattern {
	/**
	 * Returns the value of the '<em><b>Parameter Type Patterns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type Patterns</em>' attribute list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getMethodPattern_ParameterTypePatterns()
	 * @model
	 * @generated
	 */
	EList<String> getParameterTypePatterns();

} // MethodPattern
