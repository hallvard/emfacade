/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.tests.facademodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage
 * @generated
 */
public class FacademodelSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FacademodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacademodelSwitch() {
		if (modelPackage == null) {
			modelPackage = FacademodelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FacademodelPackage.MSIMPLE_BEAN: {
				MSimpleBean mSimpleBean = (MSimpleBean)theEObject;
				T result = caseMSimpleBean(mSimpleBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacademodelPackage.MSIMPLE_PARENT1_GET_SET: {
				MSimpleParent1GetSet mSimpleParent1GetSet = (MSimpleParent1GetSet)theEObject;
				T result = caseMSimpleParent1GetSet(mSimpleParent1GetSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacademodelPackage.MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE: {
				MSimpleParentN1SizeGetSetAddRemove mSimpleParentN1SizeGetSetAddRemove = (MSimpleParentN1SizeGetSetAddRemove)theEObject;
				T result = caseMSimpleParentN1SizeGetSetAddRemove(mSimpleParentN1SizeGetSetAddRemove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacademodelPackage.MSIMPLE_PARENT_N2_ADD_REMOVE: {
				MSimpleParentN2AddRemove mSimpleParentN2AddRemove = (MSimpleParentN2AddRemove)theEObject;
				T result = caseMSimpleParentN2AddRemove(mSimpleParentN2AddRemove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacademodelPackage.MSIMPLE_PARENT_N3_LIST: {
				MSimpleParentN3List mSimpleParentN3List = (MSimpleParentN3List)theEObject;
				T result = caseMSimpleParentN3List(mSimpleParentN3List);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacademodelPackage.MSIMPLE_CLASS_PUBLIC_FIELDS: {
				MSimpleClassPublicFields mSimpleClassPublicFields = (MSimpleClassPublicFields)theEObject;
				T result = caseMSimpleClassPublicFields(mSimpleClassPublicFields);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacademodelPackage.MSIMPLE_COMPOSITE: {
				MSimpleComposite mSimpleComposite = (MSimpleComposite)theEObject;
				T result = caseMSimpleComposite(mSimpleComposite);
				if (result == null) result = caseMSimpleControl(mSimpleComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacademodelPackage.MSIMPLE_CONTROL: {
				MSimpleControl mSimpleControl = (MSimpleControl)theEObject;
				T result = caseMSimpleControl(mSimpleControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacademodelPackage.MIMMUTABLE_VALUE: {
				MImmutableValue mImmutableValue = (MImmutableValue)theEObject;
				T result = caseMImmutableValue(mImmutableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacademodelPackage.MIMMUTABLE_VALUE_PARENT: {
				MImmutableValueParent mImmutableValueParent = (MImmutableValueParent)theEObject;
				T result = caseMImmutableValueParent(mImmutableValueParent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSimple Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSimple Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSimpleBean(MSimpleBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSimple Parent1 Get Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSimple Parent1 Get Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSimpleParent1GetSet(MSimpleParent1GetSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSimple Parent N1 Size Get Set Add Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSimple Parent N1 Size Get Set Add Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSimpleParentN1SizeGetSetAddRemove(MSimpleParentN1SizeGetSetAddRemove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSimple Parent N2 Add Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSimple Parent N2 Add Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSimpleParentN2AddRemove(MSimpleParentN2AddRemove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSimple Parent N3 List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSimple Parent N3 List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSimpleParentN3List(MSimpleParentN3List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSimple Class Public Fields</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSimple Class Public Fields</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSimpleClassPublicFields(MSimpleClassPublicFields object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSimple Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSimple Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSimpleComposite(MSimpleComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSimple Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSimple Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSimpleControl(MSimpleControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MImmutable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MImmutable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMImmutableValue(MImmutableValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MImmutable Value Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MImmutable Value Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMImmutableValueParent(MImmutableValueParent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //FacademodelSwitch
