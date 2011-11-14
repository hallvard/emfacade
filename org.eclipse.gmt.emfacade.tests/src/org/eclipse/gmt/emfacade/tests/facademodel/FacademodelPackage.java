/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.tests.facademodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelFactory
 * @model kind="package"
 * @generated
 */
public interface FacademodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "facademodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.eclipse.gmt.emfacade.tests/src/org/eclipse/gmt/emfacade/tests/FacadeModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "facademodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacademodelPackage eINSTANCE = org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleBeanImpl <em>MSimple Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleBeanImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleBean()
	 * @generated
	 */
	int MSIMPLE_BEAN = 0;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_BEAN__STRING = 0;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_BEAN__INTEGER = 1;

	/**
	 * The number of structural features of the '<em>MSimple Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_BEAN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParent1GetSetImpl <em>MSimple Parent1 Get Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParent1GetSetImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleParent1GetSet()
	 * @generated
	 */
	int MSIMPLE_PARENT1_GET_SET = 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_PARENT1_GET_SET__CHILD = 0;

	/**
	 * The number of structural features of the '<em>MSimple Parent1 Get Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_PARENT1_GET_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN1SizeGetSetAddRemoveImpl <em>MSimple Parent N1 Size Get Set Add Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN1SizeGetSetAddRemoveImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleParentN1SizeGetSetAddRemove()
	 * @generated
	 */
	int MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>MSimple Parent N1 Size Get Set Add Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN2AddRemoveImpl <em>MSimple Parent N2 Add Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN2AddRemoveImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleParentN2AddRemove()
	 * @generated
	 */
	int MSIMPLE_PARENT_N2_ADD_REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_PARENT_N2_ADD_REMOVE__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>MSimple Parent N2 Add Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_PARENT_N2_ADD_REMOVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN3ListImpl <em>MSimple Parent N3 List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN3ListImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleParentN3List()
	 * @generated
	 */
	int MSIMPLE_PARENT_N3_LIST = 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_PARENT_N3_LIST__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>MSimple Parent N3 List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_PARENT_N3_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleClassPublicFieldsImpl <em>MSimple Class Public Fields</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleClassPublicFieldsImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleClassPublicFields()
	 * @generated
	 */
	int MSIMPLE_CLASS_PUBLIC_FIELDS = 5;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_CLASS_PUBLIC_FIELDS__STRING = 0;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_CLASS_PUBLIC_FIELDS__INTEGER = 1;

	/**
	 * The number of structural features of the '<em>MSimple Class Public Fields</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_CLASS_PUBLIC_FIELDS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleCompositeImpl <em>MSimple Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleCompositeImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleComposite()
	 * @generated
	 */
	int MSIMPLE_COMPOSITE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleControlImpl <em>MSimple Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleControlImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleControl()
	 * @generated
	 */
	int MSIMPLE_CONTROL = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_CONTROL__PARENT = 0;

	/**
	 * The number of structural features of the '<em>MSimple Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_CONTROL_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_COMPOSITE__PARENT = MSIMPLE_CONTROL__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_COMPOSITE__CHILDREN = MSIMPLE_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MSimple Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIMPLE_COMPOSITE_FEATURE_COUNT = MSIMPLE_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MImmutableValueImpl <em>MImmutable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MImmutableValueImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMImmutableValue()
	 * @generated
	 */
	int MIMMUTABLE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMMUTABLE_VALUE__STRING = 0;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMMUTABLE_VALUE__INTEGER = 1;

	/**
	 * The number of structural features of the '<em>MImmutable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMMUTABLE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MImmutableValueParentImpl <em>MImmutable Value Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MImmutableValueParentImpl
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMImmutableValueParent()
	 * @generated
	 */
	int MIMMUTABLE_VALUE_PARENT = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMMUTABLE_VALUE_PARENT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMMUTABLE_VALUE_PARENT__VALUES = 1;

	/**
	 * The number of structural features of the '<em>MImmutable Value Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMMUTABLE_VALUE_PARENT_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean <em>MSimple Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSimple Bean</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean
	 * @generated
	 */
	EClass getMSimpleBean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean#getString()
	 * @see #getMSimpleBean()
	 * @generated
	 */
	EAttribute getMSimpleBean_String();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean#getInteger()
	 * @see #getMSimpleBean()
	 * @generated
	 */
	EAttribute getMSimpleBean_Integer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet <em>MSimple Parent1 Get Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSimple Parent1 Get Set</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet
	 * @generated
	 */
	EClass getMSimpleParent1GetSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet#getChild()
	 * @see #getMSimpleParent1GetSet()
	 * @generated
	 */
	EReference getMSimpleParent1GetSet_Child();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove <em>MSimple Parent N1 Size Get Set Add Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSimple Parent N1 Size Get Set Add Remove</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove
	 * @generated
	 */
	EClass getMSimpleParentN1SizeGetSetAddRemove();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove#getChildren()
	 * @see #getMSimpleParentN1SizeGetSetAddRemove()
	 * @generated
	 */
	EReference getMSimpleParentN1SizeGetSetAddRemove_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove <em>MSimple Parent N2 Add Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSimple Parent N2 Add Remove</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove
	 * @generated
	 */
	EClass getMSimpleParentN2AddRemove();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove#getChildren()
	 * @see #getMSimpleParentN2AddRemove()
	 * @generated
	 */
	EReference getMSimpleParentN2AddRemove_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List <em>MSimple Parent N3 List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSimple Parent N3 List</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List
	 * @generated
	 */
	EClass getMSimpleParentN3List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List#getChildren()
	 * @see #getMSimpleParentN3List()
	 * @generated
	 */
	EReference getMSimpleParentN3List_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields <em>MSimple Class Public Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSimple Class Public Fields</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields
	 * @generated
	 */
	EClass getMSimpleClassPublicFields();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields#getString()
	 * @see #getMSimpleClassPublicFields()
	 * @generated
	 */
	EAttribute getMSimpleClassPublicFields_String();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields#getInteger()
	 * @see #getMSimpleClassPublicFields()
	 * @generated
	 */
	EAttribute getMSimpleClassPublicFields_Integer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite <em>MSimple Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSimple Composite</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite
	 * @generated
	 */
	EClass getMSimpleComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite#getChildren()
	 * @see #getMSimpleComposite()
	 * @generated
	 */
	EReference getMSimpleComposite_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl <em>MSimple Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSimple Control</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl
	 * @generated
	 */
	EClass getMSimpleControl();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl#getParent()
	 * @see #getMSimpleControl()
	 * @generated
	 */
	EReference getMSimpleControl_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue <em>MImmutable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MImmutable Value</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue
	 * @generated
	 */
	EClass getMImmutableValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue#getString()
	 * @see #getMImmutableValue()
	 * @generated
	 */
	EAttribute getMImmutableValue_String();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue#getInteger()
	 * @see #getMImmutableValue()
	 * @generated
	 */
	EAttribute getMImmutableValue_Integer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent <em>MImmutable Value Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MImmutable Value Parent</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent
	 * @generated
	 */
	EClass getMImmutableValueParent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent#getValue()
	 * @see #getMImmutableValueParent()
	 * @generated
	 */
	EReference getMImmutableValueParent_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent#getValues()
	 * @see #getMImmutableValueParent()
	 * @generated
	 */
	EReference getMImmutableValueParent_Values();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FacademodelFactory getFacademodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleBeanImpl <em>MSimple Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleBeanImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleBean()
		 * @generated
		 */
		EClass MSIMPLE_BEAN = eINSTANCE.getMSimpleBean();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSIMPLE_BEAN__STRING = eINSTANCE.getMSimpleBean_String();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSIMPLE_BEAN__INTEGER = eINSTANCE.getMSimpleBean_Integer();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParent1GetSetImpl <em>MSimple Parent1 Get Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParent1GetSetImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleParent1GetSet()
		 * @generated
		 */
		EClass MSIMPLE_PARENT1_GET_SET = eINSTANCE.getMSimpleParent1GetSet();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIMPLE_PARENT1_GET_SET__CHILD = eINSTANCE.getMSimpleParent1GetSet_Child();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN1SizeGetSetAddRemoveImpl <em>MSimple Parent N1 Size Get Set Add Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN1SizeGetSetAddRemoveImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleParentN1SizeGetSetAddRemove()
		 * @generated
		 */
		EClass MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE = eINSTANCE.getMSimpleParentN1SizeGetSetAddRemove();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE__CHILDREN = eINSTANCE.getMSimpleParentN1SizeGetSetAddRemove_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN2AddRemoveImpl <em>MSimple Parent N2 Add Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN2AddRemoveImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleParentN2AddRemove()
		 * @generated
		 */
		EClass MSIMPLE_PARENT_N2_ADD_REMOVE = eINSTANCE.getMSimpleParentN2AddRemove();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIMPLE_PARENT_N2_ADD_REMOVE__CHILDREN = eINSTANCE.getMSimpleParentN2AddRemove_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN3ListImpl <em>MSimple Parent N3 List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN3ListImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleParentN3List()
		 * @generated
		 */
		EClass MSIMPLE_PARENT_N3_LIST = eINSTANCE.getMSimpleParentN3List();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIMPLE_PARENT_N3_LIST__CHILDREN = eINSTANCE.getMSimpleParentN3List_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleClassPublicFieldsImpl <em>MSimple Class Public Fields</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleClassPublicFieldsImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleClassPublicFields()
		 * @generated
		 */
		EClass MSIMPLE_CLASS_PUBLIC_FIELDS = eINSTANCE.getMSimpleClassPublicFields();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSIMPLE_CLASS_PUBLIC_FIELDS__STRING = eINSTANCE.getMSimpleClassPublicFields_String();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSIMPLE_CLASS_PUBLIC_FIELDS__INTEGER = eINSTANCE.getMSimpleClassPublicFields_Integer();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleCompositeImpl <em>MSimple Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleCompositeImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleComposite()
		 * @generated
		 */
		EClass MSIMPLE_COMPOSITE = eINSTANCE.getMSimpleComposite();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIMPLE_COMPOSITE__CHILDREN = eINSTANCE.getMSimpleComposite_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleControlImpl <em>MSimple Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleControlImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMSimpleControl()
		 * @generated
		 */
		EClass MSIMPLE_CONTROL = eINSTANCE.getMSimpleControl();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIMPLE_CONTROL__PARENT = eINSTANCE.getMSimpleControl_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MImmutableValueImpl <em>MImmutable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MImmutableValueImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMImmutableValue()
		 * @generated
		 */
		EClass MIMMUTABLE_VALUE = eINSTANCE.getMImmutableValue();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIMMUTABLE_VALUE__STRING = eINSTANCE.getMImmutableValue_String();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIMMUTABLE_VALUE__INTEGER = eINSTANCE.getMImmutableValue_Integer();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MImmutableValueParentImpl <em>MImmutable Value Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.MImmutableValueParentImpl
		 * @see org.eclipse.gmt.emfacade.tests.facademodel.impl.FacademodelPackageImpl#getMImmutableValueParent()
		 * @generated
		 */
		EClass MIMMUTABLE_VALUE_PARENT = eINSTANCE.getMImmutableValueParent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIMMUTABLE_VALUE_PARENT__VALUE = eINSTANCE.getMImmutableValueParent_Value();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIMMUTABLE_VALUE_PARENT__VALUES = eINSTANCE.getMImmutableValueParent_Values();

	}

} //FacademodelPackage
