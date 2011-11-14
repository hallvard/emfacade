/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper;
import org.eclipse.xtext.common.types.JvmGenericType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.InterfaceImplementation#getMethodImplementations <em>Method Implementations</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.InterfaceImplementation#getInferredInterfaceType <em>Inferred Interface Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getInterfaceImplementation()
 * @model
 * @generated
 */
public interface InterfaceImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Method Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceImplementation <em>Interface Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Implementations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Implementations</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getInterfaceImplementation_MethodImplementations()
	 * @see org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceImplementation
	 * @model opposite="interfaceImplementation" containment="true"
	 * @generated
	 */
	EList<InterfaceMethodImplementation> getMethodImplementations();

	/**
	 * Returns the value of the '<em><b>Inferred Interface Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inferred Interface Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inferred Interface Type</em>' containment reference.
	 * @see #setInferredInterfaceType(JvmGenericType)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getInterfaceImplementation_InferredInterfaceType()
	 * @model containment="true" transient="true" derived="true"
	 * @generated
	 */
	JvmGenericType getInferredInterfaceType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.InterfaceImplementation#getInferredInterfaceType <em>Inferred Interface Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inferred Interface Type</em>' containment reference.
	 * @see #getInferredInterfaceType()
	 * @generated
	 */
	void setInferredInterfaceType(JvmGenericType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model helperDataType="org.eclipse.gmt.emfacade.EmfacadeJvmInferrerHelper"
	 * @generated
	 */
	JvmGenericType getInterfaceType(EmfacadeJvmInferrerHelper helper);

} // InterfaceImplementation
