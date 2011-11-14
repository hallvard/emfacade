/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.tests.facademodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage
 * @generated
 */
public interface FacademodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacademodelFactory eINSTANCE = org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MSimple Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSimple Bean</em>'.
	 * @generated
	 */
	MSimpleBean createMSimpleBean();

	/**
	 * Returns a new object of class '<em>MSimple Parent1 Get Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSimple Parent1 Get Set</em>'.
	 * @generated
	 */
	MSimpleParent1GetSet createMSimpleParent1GetSet();

	/**
	 * Returns a new object of class '<em>MSimple Parent N1 Size Get Set Add Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSimple Parent N1 Size Get Set Add Remove</em>'.
	 * @generated
	 */
	MSimpleParentN1SizeGetSetAddRemove createMSimpleParentN1SizeGetSetAddRemove();

	/**
	 * Returns a new object of class '<em>MSimple Parent N2 Add Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSimple Parent N2 Add Remove</em>'.
	 * @generated
	 */
	MSimpleParentN2AddRemove createMSimpleParentN2AddRemove();

	/**
	 * Returns a new object of class '<em>MSimple Parent N3 List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSimple Parent N3 List</em>'.
	 * @generated
	 */
	MSimpleParentN3List createMSimpleParentN3List();

	/**
	 * Returns a new object of class '<em>MSimple Class Public Fields</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSimple Class Public Fields</em>'.
	 * @generated
	 */
	MSimpleClassPublicFields createMSimpleClassPublicFields();

	/**
	 * Returns a new object of class '<em>MSimple Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSimple Composite</em>'.
	 * @generated
	 */
	MSimpleComposite createMSimpleComposite();

	/**
	 * Returns a new object of class '<em>MSimple Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSimple Control</em>'.
	 * @generated
	 */
	MSimpleControl createMSimpleControl();

	/**
	 * Returns a new object of class '<em>MImmutable Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MImmutable Value</em>'.
	 * @generated
	 */
	MImmutableValue createMImmutableValue();

	/**
	 * Returns a new object of class '<em>MImmutable Value Parent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MImmutable Value Parent</em>'.
	 * @generated
	 */
	MImmutableValueParent createMImmutableValueParent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FacademodelPackage getFacademodelPackage();

} //FacademodelFactory
