/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.tests.facademodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage
 * @generated
 */
public class FacademodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FacademodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacademodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FacademodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacademodelSwitch<Adapter> modelSwitch =
		new FacademodelSwitch<Adapter>() {
			@Override
			public Adapter caseMSimpleBean(MSimpleBean object) {
				return createMSimpleBeanAdapter();
			}
			@Override
			public Adapter caseMSimpleParent1GetSet(MSimpleParent1GetSet object) {
				return createMSimpleParent1GetSetAdapter();
			}
			@Override
			public Adapter caseMSimpleParentN1SizeGetSetAddRemove(MSimpleParentN1SizeGetSetAddRemove object) {
				return createMSimpleParentN1SizeGetSetAddRemoveAdapter();
			}
			@Override
			public Adapter caseMSimpleParentN2AddRemove(MSimpleParentN2AddRemove object) {
				return createMSimpleParentN2AddRemoveAdapter();
			}
			@Override
			public Adapter caseMSimpleParentN3List(MSimpleParentN3List object) {
				return createMSimpleParentN3ListAdapter();
			}
			@Override
			public Adapter caseMSimpleClassPublicFields(MSimpleClassPublicFields object) {
				return createMSimpleClassPublicFieldsAdapter();
			}
			@Override
			public Adapter caseMSimpleComposite(MSimpleComposite object) {
				return createMSimpleCompositeAdapter();
			}
			@Override
			public Adapter caseMSimpleControl(MSimpleControl object) {
				return createMSimpleControlAdapter();
			}
			@Override
			public Adapter caseMImmutableValue(MImmutableValue object) {
				return createMImmutableValueAdapter();
			}
			@Override
			public Adapter caseMImmutableValueParent(MImmutableValueParent object) {
				return createMImmutableValueParentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean <em>MSimple Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean
	 * @generated
	 */
	public Adapter createMSimpleBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet <em>MSimple Parent1 Get Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet
	 * @generated
	 */
	public Adapter createMSimpleParent1GetSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove <em>MSimple Parent N1 Size Get Set Add Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove
	 * @generated
	 */
	public Adapter createMSimpleParentN1SizeGetSetAddRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove <em>MSimple Parent N2 Add Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove
	 * @generated
	 */
	public Adapter createMSimpleParentN2AddRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List <em>MSimple Parent N3 List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List
	 * @generated
	 */
	public Adapter createMSimpleParentN3ListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields <em>MSimple Class Public Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields
	 * @generated
	 */
	public Adapter createMSimpleClassPublicFieldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite <em>MSimple Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite
	 * @generated
	 */
	public Adapter createMSimpleCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl <em>MSimple Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl
	 * @generated
	 */
	public Adapter createMSimpleControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue <em>MImmutable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue
	 * @generated
	 */
	public Adapter createMImmutableValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent <em>MImmutable Value Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent
	 * @generated
	 */
	public Adapter createMImmutableValueParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FacademodelAdapterFactory
