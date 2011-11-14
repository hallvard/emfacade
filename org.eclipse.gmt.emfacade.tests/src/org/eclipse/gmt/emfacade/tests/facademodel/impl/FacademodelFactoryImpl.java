/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.tests.facademodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gmt.emfacade.tests.facademodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacademodelFactoryImpl extends EFactoryImpl implements FacademodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FacademodelFactory init() {
		try {
			FacademodelFactory theFacademodelFactory = (FacademodelFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/plugin/org.eclipse.gmt.emfacade.tests/src/org/eclipse/gmt/emfacade/tests/FacadeModel.ecore"); 
			if (theFacademodelFactory != null) {
				return theFacademodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FacademodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacademodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FacademodelPackage.MSIMPLE_BEAN: return createMSimpleBean();
			case FacademodelPackage.MSIMPLE_PARENT1_GET_SET: return createMSimpleParent1GetSet();
			case FacademodelPackage.MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE: return createMSimpleParentN1SizeGetSetAddRemove();
			case FacademodelPackage.MSIMPLE_PARENT_N2_ADD_REMOVE: return createMSimpleParentN2AddRemove();
			case FacademodelPackage.MSIMPLE_PARENT_N3_LIST: return createMSimpleParentN3List();
			case FacademodelPackage.MSIMPLE_CLASS_PUBLIC_FIELDS: return createMSimpleClassPublicFields();
			case FacademodelPackage.MSIMPLE_COMPOSITE: return createMSimpleComposite();
			case FacademodelPackage.MSIMPLE_CONTROL: return createMSimpleControl();
			case FacademodelPackage.MIMMUTABLE_VALUE: return createMImmutableValue();
			case FacademodelPackage.MIMMUTABLE_VALUE_PARENT: return createMImmutableValueParent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSimpleBean createMSimpleBean() {
		MSimpleBeanImpl mSimpleBean = new MSimpleBeanImpl();
		return mSimpleBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSimpleParent1GetSet createMSimpleParent1GetSet() {
		MSimpleParent1GetSetImpl mSimpleParent1GetSet = new MSimpleParent1GetSetImpl();
		return mSimpleParent1GetSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSimpleParentN1SizeGetSetAddRemove createMSimpleParentN1SizeGetSetAddRemove() {
		MSimpleParentN1SizeGetSetAddRemoveImpl mSimpleParentN1SizeGetSetAddRemove = new MSimpleParentN1SizeGetSetAddRemoveImpl();
		return mSimpleParentN1SizeGetSetAddRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSimpleParentN2AddRemove createMSimpleParentN2AddRemove() {
		MSimpleParentN2AddRemoveImpl mSimpleParentN2AddRemove = new MSimpleParentN2AddRemoveImpl();
		return mSimpleParentN2AddRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSimpleParentN3List createMSimpleParentN3List() {
		MSimpleParentN3ListImpl mSimpleParentN3List = new MSimpleParentN3ListImpl();
		return mSimpleParentN3List;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSimpleClassPublicFields createMSimpleClassPublicFields() {
		MSimpleClassPublicFieldsImpl mSimpleClassPublicFields = new MSimpleClassPublicFieldsImpl();
		return mSimpleClassPublicFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSimpleComposite createMSimpleComposite() {
		MSimpleCompositeImpl mSimpleComposite = new MSimpleCompositeImpl();
		return mSimpleComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSimpleControl createMSimpleControl() {
		MSimpleControlImpl mSimpleControl = new MSimpleControlImpl();
		return mSimpleControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MImmutableValue createMImmutableValue() {
		MImmutableValueImpl mImmutableValue = new MImmutableValueImpl();
		return mImmutableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MImmutableValueParent createMImmutableValueParent() {
		MImmutableValueParentImpl mImmutableValueParent = new MImmutableValueParentImpl();
		return mImmutableValueParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacademodelPackage getFacademodelPackage() {
		return (FacademodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FacademodelPackage getPackage() {
		return FacademodelPackage.eINSTANCE;
	}

} //FacademodelFactoryImpl
