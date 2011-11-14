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
 * A representation of the model object '<em><b>MSimple Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMSimpleComposite()
 * @model
 * @generated
 */
public interface MSimpleComposite extends MSimpleControl {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMSimpleComposite_Children()
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<MSimpleControl> getChildren();

} // MSimpleComposite
