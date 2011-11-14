/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.tests.facademodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MImmutable Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue#getString <em>String</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue#getInteger <em>Integer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMImmutableValue()
 * @model
 * @generated
 */
public interface MImmutableValue extends EObject {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMImmutableValue_String()
	 * @model
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' attribute.
	 * @see #setInteger(int)
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMImmutableValue_Integer()
	 * @model
	 * @generated
	 */
	int getInteger();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue#getInteger <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' attribute.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(int value);

} // MImmutableValue
