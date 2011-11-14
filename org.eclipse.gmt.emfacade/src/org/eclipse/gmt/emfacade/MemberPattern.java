/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.MemberPattern#getNamePattern <em>Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.MemberPattern#getTypePattern <em>Type Pattern</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.MemberPattern#getParameterListPattern <em>Parameter List Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getMemberPattern()
 * @model
 * @generated
 */
public interface MemberPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Pattern</em>' attribute.
	 * @see #setNamePattern(String)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getMemberPattern_NamePattern()
	 * @model
	 * @generated
	 */
	String getNamePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.MemberPattern#getNamePattern <em>Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Pattern</em>' attribute.
	 * @see #getNamePattern()
	 * @generated
	 */
	void setNamePattern(String value);

	/**
	 * Returns the value of the '<em><b>Type Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Pattern</em>' attribute.
	 * @see #setTypePattern(String)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getMemberPattern_TypePattern()
	 * @model
	 * @generated
	 */
	String getTypePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.MemberPattern#getTypePattern <em>Type Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Pattern</em>' attribute.
	 * @see #getTypePattern()
	 * @generated
	 */
	void setTypePattern(String value);

	/**
	 * Returns the value of the '<em><b>Parameter List Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter List Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter List Pattern</em>' containment reference.
	 * @see #setParameterListPattern(TypeListPattern)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getMemberPattern_ParameterListPattern()
	 * @model containment="true"
	 * @generated
	 */
	TypeListPattern getParameterListPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.MemberPattern#getParameterListPattern <em>Parameter List Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter List Pattern</em>' containment reference.
	 * @see #getParameterListPattern()
	 * @generated
	 */
	void setParameterListPattern(TypeListPattern value);

} // MemberPattern
