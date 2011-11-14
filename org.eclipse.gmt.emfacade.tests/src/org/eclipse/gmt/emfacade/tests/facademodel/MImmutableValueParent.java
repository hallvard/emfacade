/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.tests.facademodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MImmutable Value Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMImmutableValueParent()
 * @model
 * @generated
 */
public interface MImmutableValueParent extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(MImmutableValue)
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMImmutableValueParent_Value()
	 * @model containment="true"
	 * @generated
	 */
	MImmutableValue getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MImmutableValue value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMImmutableValueParent_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<MImmutableValue> getValues();

} // MImmutableValueParent
