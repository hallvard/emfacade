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
 * A representation of the model object '<em><b>MSimple Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMSimpleControl()
 * @model
 * @generated
 */
public interface MSimpleControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(MSimpleComposite)
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#getMSimpleControl_Parent()
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	MSimpleComposite getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(MSimpleComposite value);

} // MSimpleControl
