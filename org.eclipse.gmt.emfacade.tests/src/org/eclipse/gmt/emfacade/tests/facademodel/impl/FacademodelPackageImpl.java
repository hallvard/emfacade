/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.tests.facademodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelFactory;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue;
import org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacademodelPackageImpl extends EPackageImpl implements FacademodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSimpleBeanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSimpleParent1GetSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSimpleParentN1SizeGetSetAddRemoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSimpleParentN2AddRemoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSimpleParentN3ListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSimpleClassPublicFieldsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSimpleCompositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSimpleControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mImmutableValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mImmutableValueParentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FacademodelPackageImpl() {
		super(eNS_URI, FacademodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FacademodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FacademodelPackage init() {
		if (isInited) return (FacademodelPackage)EPackage.Registry.INSTANCE.getEPackage(FacademodelPackage.eNS_URI);

		// Obtain or create and register package
		FacademodelPackageImpl theFacademodelPackage = (FacademodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FacademodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FacademodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFacademodelPackage.createPackageContents();

		// Initialize created meta-data
		theFacademodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFacademodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FacademodelPackage.eNS_URI, theFacademodelPackage);
		return theFacademodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSimpleBean() {
		return mSimpleBeanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSimpleBean_String() {
		return (EAttribute)mSimpleBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSimpleBean_Integer() {
		return (EAttribute)mSimpleBeanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSimpleParent1GetSet() {
		return mSimpleParent1GetSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSimpleParent1GetSet_Child() {
		return (EReference)mSimpleParent1GetSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSimpleParentN1SizeGetSetAddRemove() {
		return mSimpleParentN1SizeGetSetAddRemoveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSimpleParentN1SizeGetSetAddRemove_Children() {
		return (EReference)mSimpleParentN1SizeGetSetAddRemoveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSimpleParentN2AddRemove() {
		return mSimpleParentN2AddRemoveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSimpleParentN2AddRemove_Children() {
		return (EReference)mSimpleParentN2AddRemoveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSimpleParentN3List() {
		return mSimpleParentN3ListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSimpleParentN3List_Children() {
		return (EReference)mSimpleParentN3ListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSimpleClassPublicFields() {
		return mSimpleClassPublicFieldsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSimpleClassPublicFields_String() {
		return (EAttribute)mSimpleClassPublicFieldsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSimpleClassPublicFields_Integer() {
		return (EAttribute)mSimpleClassPublicFieldsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSimpleComposite() {
		return mSimpleCompositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSimpleComposite_Children() {
		return (EReference)mSimpleCompositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSimpleControl() {
		return mSimpleControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSimpleControl_Parent() {
		return (EReference)mSimpleControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMImmutableValue() {
		return mImmutableValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMImmutableValue_String() {
		return (EAttribute)mImmutableValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMImmutableValue_Integer() {
		return (EAttribute)mImmutableValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMImmutableValueParent() {
		return mImmutableValueParentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMImmutableValueParent_Value() {
		return (EReference)mImmutableValueParentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMImmutableValueParent_Values() {
		return (EReference)mImmutableValueParentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacademodelFactory getFacademodelFactory() {
		return (FacademodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mSimpleBeanEClass = createEClass(MSIMPLE_BEAN);
		createEAttribute(mSimpleBeanEClass, MSIMPLE_BEAN__STRING);
		createEAttribute(mSimpleBeanEClass, MSIMPLE_BEAN__INTEGER);

		mSimpleParent1GetSetEClass = createEClass(MSIMPLE_PARENT1_GET_SET);
		createEReference(mSimpleParent1GetSetEClass, MSIMPLE_PARENT1_GET_SET__CHILD);

		mSimpleParentN1SizeGetSetAddRemoveEClass = createEClass(MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE);
		createEReference(mSimpleParentN1SizeGetSetAddRemoveEClass, MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE__CHILDREN);

		mSimpleParentN2AddRemoveEClass = createEClass(MSIMPLE_PARENT_N2_ADD_REMOVE);
		createEReference(mSimpleParentN2AddRemoveEClass, MSIMPLE_PARENT_N2_ADD_REMOVE__CHILDREN);

		mSimpleParentN3ListEClass = createEClass(MSIMPLE_PARENT_N3_LIST);
		createEReference(mSimpleParentN3ListEClass, MSIMPLE_PARENT_N3_LIST__CHILDREN);

		mSimpleClassPublicFieldsEClass = createEClass(MSIMPLE_CLASS_PUBLIC_FIELDS);
		createEAttribute(mSimpleClassPublicFieldsEClass, MSIMPLE_CLASS_PUBLIC_FIELDS__STRING);
		createEAttribute(mSimpleClassPublicFieldsEClass, MSIMPLE_CLASS_PUBLIC_FIELDS__INTEGER);

		mSimpleCompositeEClass = createEClass(MSIMPLE_COMPOSITE);
		createEReference(mSimpleCompositeEClass, MSIMPLE_COMPOSITE__CHILDREN);

		mSimpleControlEClass = createEClass(MSIMPLE_CONTROL);
		createEReference(mSimpleControlEClass, MSIMPLE_CONTROL__PARENT);

		mImmutableValueEClass = createEClass(MIMMUTABLE_VALUE);
		createEAttribute(mImmutableValueEClass, MIMMUTABLE_VALUE__STRING);
		createEAttribute(mImmutableValueEClass, MIMMUTABLE_VALUE__INTEGER);

		mImmutableValueParentEClass = createEClass(MIMMUTABLE_VALUE_PARENT);
		createEReference(mImmutableValueParentEClass, MIMMUTABLE_VALUE_PARENT__VALUE);
		createEReference(mImmutableValueParentEClass, MIMMUTABLE_VALUE_PARENT__VALUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mSimpleCompositeEClass.getESuperTypes().add(this.getMSimpleControl());

		// Initialize classes and features; add operations and parameters
		initEClass(mSimpleBeanEClass, MSimpleBean.class, "MSimpleBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMSimpleBean_String(), ecorePackage.getEString(), "string", null, 0, 1, MSimpleBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMSimpleBean_Integer(), ecorePackage.getEInt(), "integer", null, 0, 1, MSimpleBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSimpleParent1GetSetEClass, MSimpleParent1GetSet.class, "MSimpleParent1GetSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSimpleParent1GetSet_Child(), this.getMSimpleBean(), null, "child", null, 0, 1, MSimpleParent1GetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSimpleParentN1SizeGetSetAddRemoveEClass, MSimpleParentN1SizeGetSetAddRemove.class, "MSimpleParentN1SizeGetSetAddRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSimpleParentN1SizeGetSetAddRemove_Children(), this.getMSimpleBean(), null, "children", null, 0, -1, MSimpleParentN1SizeGetSetAddRemove.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSimpleParentN2AddRemoveEClass, MSimpleParentN2AddRemove.class, "MSimpleParentN2AddRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSimpleParentN2AddRemove_Children(), this.getMSimpleBean(), null, "children", null, 0, -1, MSimpleParentN2AddRemove.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSimpleParentN3ListEClass, MSimpleParentN3List.class, "MSimpleParentN3List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSimpleParentN3List_Children(), this.getMSimpleBean(), null, "children", null, 0, -1, MSimpleParentN3List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSimpleClassPublicFieldsEClass, MSimpleClassPublicFields.class, "MSimpleClassPublicFields", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMSimpleClassPublicFields_String(), ecorePackage.getEString(), "string", null, 0, 1, MSimpleClassPublicFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMSimpleClassPublicFields_Integer(), ecorePackage.getEInt(), "integer", null, 0, 1, MSimpleClassPublicFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSimpleCompositeEClass, MSimpleComposite.class, "MSimpleComposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSimpleComposite_Children(), this.getMSimpleControl(), this.getMSimpleControl_Parent(), "children", null, 0, -1, MSimpleComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSimpleControlEClass, MSimpleControl.class, "MSimpleControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSimpleControl_Parent(), this.getMSimpleComposite(), this.getMSimpleComposite_Children(), "parent", null, 0, 1, MSimpleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mImmutableValueEClass, MImmutableValue.class, "MImmutableValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMImmutableValue_String(), ecorePackage.getEString(), "string", null, 0, 1, MImmutableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMImmutableValue_Integer(), ecorePackage.getEInt(), "integer", null, 0, 1, MImmutableValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mImmutableValueParentEClass, MImmutableValueParent.class, "MImmutableValueParent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMImmutableValueParent_Value(), this.getMImmutableValue(), null, "value", null, 0, 1, MImmutableValueParent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMImmutableValueParent_Values(), this.getMImmutableValue(), null, "values", null, 0, -1, MImmutableValueParent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FacademodelPackageImpl
