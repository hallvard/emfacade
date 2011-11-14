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
 * A representation of the model object '<em><b>Simple Parent N4 List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMSimpleParentN3List()
 * @model
 * @generated
 */
public interface MSimpleParentN3List extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMSimpleParentN3List_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<MSimpleBean> getChildren();

} // SimpleParentN4List
