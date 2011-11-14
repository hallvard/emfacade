/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.tests.facademodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Parent N1 Size Get Set Add Remove</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.tests.facademodel.impl.MSimpleParentN1SizeGetSetAddRemoveImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSimpleParentN1SizeGetSetAddRemoveImpl extends EObjectImpl implements MSimpleParentN1SizeGetSetAddRemove {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<MSimpleBean> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSimpleParentN1SizeGetSetAddRemoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacademodelPackage.Literals.MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSimpleBean> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<MSimpleBean>(MSimpleBean.class, this, FacademodelPackage.MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FacademodelPackage.MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacademodelPackage.MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE__CHILDREN:
				return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FacademodelPackage.MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends MSimpleBean>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FacademodelPackage.MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE__CHILDREN:
				getChildren().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FacademodelPackage.MSIMPLE_PARENT_N1_SIZE_GET_SET_ADD_REMOVE__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleParentN1SizeGetSetAddRemoveImpl
