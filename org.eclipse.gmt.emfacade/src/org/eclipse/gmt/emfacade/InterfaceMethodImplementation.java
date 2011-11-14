/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Method Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceImplementation <em>Interface Implementation</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceMethod <em>Interface Method</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getMethodBody <em>Method Body</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInferredMethodBody <em>Inferred Method Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getInterfaceMethodImplementation()
 * @model
 * @generated
 */
public interface InterfaceMethodImplementation extends DefaultName {
	/**
	 * Returns the value of the '<em><b>Interface Implementation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.InterfaceImplementation#getMethodImplementations <em>Method Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Implementation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Implementation</em>' container reference.
	 * @see #setInterfaceImplementation(InterfaceImplementation)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getInterfaceMethodImplementation_InterfaceImplementation()
	 * @see org.eclipse.gmt.emfacade.InterfaceImplementation#getMethodImplementations
	 * @model opposite="methodImplementations" transient="false"
	 * @generated
	 */
	InterfaceImplementation getInterfaceImplementation();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceImplementation <em>Interface Implementation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Implementation</em>' container reference.
	 * @see #getInterfaceImplementation()
	 * @generated
	 */
	void setInterfaceImplementation(InterfaceImplementation value);

	/**
	 * Returns the value of the '<em><b>Interface Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Method</em>' reference.
	 * @see #setInterfaceMethod(JvmOperation)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getInterfaceMethodImplementation_InterfaceMethod()
	 * @model
	 * @generated
	 */
	JvmOperation getInterfaceMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceMethod <em>Interface Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Method</em>' reference.
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	void setInterfaceMethod(JvmOperation value);

	/**
	 * Returns the value of the '<em><b>Method Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Body</em>' containment reference.
	 * @see #setMethodBody(XExpression)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getInterfaceMethodImplementation_MethodBody()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getMethodBody();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getMethodBody <em>Method Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Body</em>' containment reference.
	 * @see #getMethodBody()
	 * @generated
	 */
	void setMethodBody(XExpression value);

	/**
	 * Returns the value of the '<em><b>Inferred Method Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inferred Method Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inferred Method Body</em>' containment reference.
	 * @see #setInferredMethodBody(XExpression)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getInterfaceMethodImplementation_InferredMethodBody()
	 * @model containment="true" transient="true" derived="true"
	 * @generated
	 */
	XExpression getInferredMethodBody();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInferredMethodBody <em>Inferred Method Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inferred Method Body</em>' containment reference.
	 * @see #getInferredMethodBody()
	 * @generated
	 */
	void setInferredMethodBody(XExpression value);

} // InterfaceMethodImplementation
