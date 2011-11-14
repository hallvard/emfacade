/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.InterfaceImplementation;
import org.eclipse.gmt.emfacade.InterfaceMethodImplementation;
import org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper;
import org.eclipse.xtext.common.types.JvmGenericType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.InterfaceImplementationImpl#getMethodImplementations <em>Method Implementations</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.InterfaceImplementationImpl#getInferredInterfaceType <em>Inferred Interface Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImplementationImpl extends EObjectImpl implements InterfaceImplementation {
	/**
	 * The cached value of the '{@link #getMethodImplementations() <em>Method Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceMethodImplementation> methodImplementations;

	/**
	 * The cached value of the '{@link #getInferredInterfaceType() <em>Inferred Interface Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInferredInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected JvmGenericType inferredInterfaceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.INTERFACE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceMethodImplementation> getMethodImplementations() {
		if (methodImplementations == null) {
			methodImplementations = new EObjectContainmentWithInverseEList<InterfaceMethodImplementation>(InterfaceMethodImplementation.class, this, EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION);
		}
		return methodImplementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType getInferredInterfaceType() {
		return inferredInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInferredInterfaceType(JvmGenericType newInferredInterfaceType, NotificationChain msgs) {
		JvmGenericType oldInferredInterfaceType = inferredInterfaceType;
		inferredInterfaceType = newInferredInterfaceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE, oldInferredInterfaceType, newInferredInterfaceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInferredInterfaceType(JvmGenericType newInferredInterfaceType) {
		if (newInferredInterfaceType != inferredInterfaceType) {
			NotificationChain msgs = null;
			if (inferredInterfaceType != null)
				msgs = ((InternalEObject)inferredInterfaceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE, null, msgs);
			if (newInferredInterfaceType != null)
				msgs = ((InternalEObject)newInferredInterfaceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE, null, msgs);
			msgs = basicSetInferredInterfaceType(newInferredInterfaceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE, newInferredInterfaceType, newInferredInterfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType getInterfaceType(EmfacadeJvmInferrerHelper helper) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethodImplementations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS:
				return ((InternalEList<?>)getMethodImplementations()).basicRemove(otherEnd, msgs);
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE:
				return basicSetInferredInterfaceType(null, msgs);
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
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS:
				return getMethodImplementations();
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE:
				return getInferredInterfaceType();
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
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS:
				getMethodImplementations().clear();
				getMethodImplementations().addAll((Collection<? extends InterfaceMethodImplementation>)newValue);
				return;
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE:
				setInferredInterfaceType((JvmGenericType)newValue);
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
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS:
				getMethodImplementations().clear();
				return;
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE:
				setInferredInterfaceType((JvmGenericType)null);
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
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS:
				return methodImplementations != null && !methodImplementations.isEmpty();
			case EmfacadePackage.INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE:
				return inferredInterfaceType != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImplementationImpl
