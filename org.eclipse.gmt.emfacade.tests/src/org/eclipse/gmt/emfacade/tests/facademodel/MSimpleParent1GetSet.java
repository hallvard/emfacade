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
 * A representation of the model object '<em><b>Simple Parent1 Get Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMSimpleParent1GetSet()
 * @model
 * @generated
 */
public interface MSimpleParent1GetSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(MSimpleBean)
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMSimpleParent1GetSet_Child()
	 * @model containment="true"
	 * @generated
	 */
	MSimpleBean getChild();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(MSimpleBean value);

} // SimpleParent1GetSet
