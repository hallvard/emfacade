/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum Literal Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.EEnumLiteralMapping#getEnumLiteral <em>Enum Literal</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EEnumLiteralMapping#getConvertExpression <em>Convert Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEEnumLiteralMapping()
 * @model
 * @generated
 */
public interface EEnumLiteralMapping extends DefaultName {
	/**
	 * Returns the value of the '<em><b>Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Literal</em>' reference.
	 * @see #setEnumLiteral(EEnumLiteral)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEEnumLiteralMapping_EnumLiteral()
	 * @model
	 * @generated
	 */
	EEnumLiteral getEnumLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EEnumLiteralMapping#getEnumLiteral <em>Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Literal</em>' reference.
	 * @see #getEnumLiteral()
	 * @generated
	 */
	void setEnumLiteral(EEnumLiteral value);

	/**
	 * Returns the value of the '<em><b>Convert Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert Expression</em>' containment reference.
	 * @see #setConvertExpression(XExpression)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEEnumLiteralMapping_ConvertExpression()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getConvertExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EEnumLiteralMapping#getConvertExpression <em>Convert Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convert Expression</em>' containment reference.
	 * @see #getConvertExpression()
	 * @generated
	 */
	void setConvertExpression(XExpression value);

} // EEnumLiteralMapping
