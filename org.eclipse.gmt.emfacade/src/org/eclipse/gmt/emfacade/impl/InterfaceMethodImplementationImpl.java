/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.InterfaceImplementation;
import org.eclipse.gmt.emfacade.InterfaceMethodImplementation;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Method Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.InterfaceMethodImplementationImpl#getInterfaceImplementation <em>Interface Implementation</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.InterfaceMethodImplementationImpl#getInterfaceMethod <em>Interface Method</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.InterfaceMethodImplementationImpl#getMethodBody <em>Method Body</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.InterfaceMethodImplementationImpl#getInferredMethodBody <em>Inferred Method Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceMethodImplementationImpl extends DefaultNameImpl implements InterfaceMethodImplementation {
	/**
	 * The cached value of the '{@link #getInterfaceMethod() <em>Interface Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceMethod()
	 * @generated
	 * @ordered
	 */
	protected JvmOperation interfaceMethod;

	/**
	 * The cached value of the '{@link #getMethodBody() <em>Method Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodBody()
	 * @generated
	 * @ordered
	 */
	protected XExpression methodBody;

	/**
	 * The cached value of the '{@link #getInferredMethodBody() <em>Inferred Method Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInferredMethodBody()
	 * @generated
	 * @ordered
	 */
	protected XExpression inferredMethodBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceMethodImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.INTERFACE_METHOD_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceImplementation getInterfaceImplementation() {
		if (eContainerFeatureID() != EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION) return null;
		return (InterfaceImplementation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceImplementation(InterfaceImplementation newInterfaceImplementation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterfaceImplementation, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceImplementation(InterfaceImplementation newInterfaceImplementation) {
		if (newInterfaceImplementation != eInternalContainer() || (eContainerFeatureID() != EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION && newInterfaceImplementation != null)) {
			if (EcoreUtil.isAncestor(this, newInterfaceImplementation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterfaceImplementation != null)
				msgs = ((InternalEObject)newInterfaceImplementation).eInverseAdd(this, EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS, InterfaceImplementation.class, msgs);
			msgs = basicSetInterfaceImplementation(newInterfaceImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION, newInterfaceImplementation, newInterfaceImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation getInterfaceMethod() {
		if (interfaceMethod != null && interfaceMethod.eIsProxy()) {
			InternalEObject oldInterfaceMethod = (InternalEObject)interfaceMethod;
			interfaceMethod = (JvmOperation)eResolveProxy(oldInterfaceMethod);
			if (interfaceMethod != oldInterfaceMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_METHOD, oldInterfaceMethod, interfaceMethod));
			}
		}
		return interfaceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation basicGetInterfaceMethod() {
		return interfaceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceMethod(JvmOperation newInterfaceMethod) {
		JvmOperation oldInterfaceMethod = interfaceMethod;
		interfaceMethod = newInterfaceMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_METHOD, oldInterfaceMethod, interfaceMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getMethodBody() {
		return methodBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodBody(XExpression newMethodBody, NotificationChain msgs) {
		XExpression oldMethodBody = methodBody;
		methodBody = newMethodBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY, oldMethodBody, newMethodBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodBody(XExpression newMethodBody) {
		if (newMethodBody != methodBody) {
			NotificationChain msgs = null;
			if (methodBody != null)
				msgs = ((InternalEObject)methodBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY, null, msgs);
			if (newMethodBody != null)
				msgs = ((InternalEObject)newMethodBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY, null, msgs);
			msgs = basicSetMethodBody(newMethodBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY, newMethodBody, newMethodBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getInferredMethodBody() {
		return inferredMethodBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInferredMethodBody(XExpression newInferredMethodBody, NotificationChain msgs) {
		XExpression oldInferredMethodBody = inferredMethodBody;
		inferredMethodBody = newInferredMethodBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY, oldInferredMethodBody, newInferredMethodBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInferredMethodBody(XExpression newInferredMethodBody) {
		if (newInferredMethodBody != inferredMethodBody) {
			NotificationChain msgs = null;
			if (inferredMethodBody != null)
				msgs = ((InternalEObject)inferredMethodBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY, null, msgs);
			if (newInferredMethodBody != null)
				msgs = ((InternalEObject)newInferredMethodBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY, null, msgs);
			msgs = basicSetInferredMethodBody(newInferredMethodBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY, newInferredMethodBody, newInferredMethodBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterfaceImplementation((InterfaceImplementation)otherEnd, msgs);
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
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION:
				return basicSetInterfaceImplementation(null, msgs);
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY:
				return basicSetMethodBody(null, msgs);
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY:
				return basicSetInferredMethodBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION:
				return eInternalContainer().eInverseRemove(this, EmfacadePackage.INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS, InterfaceImplementation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION:
				return getInterfaceImplementation();
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_METHOD:
				if (resolve) return getInterfaceMethod();
				return basicGetInterfaceMethod();
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY:
				return getMethodBody();
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY:
				return getInferredMethodBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION:
				setInterfaceImplementation((InterfaceImplementation)newValue);
				return;
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_METHOD:
				setInterfaceMethod((JvmOperation)newValue);
				return;
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY:
				setMethodBody((XExpression)newValue);
				return;
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY:
				setInferredMethodBody((XExpression)newValue);
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
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION:
				setInterfaceImplementation((InterfaceImplementation)null);
				return;
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_METHOD:
				setInterfaceMethod((JvmOperation)null);
				return;
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY:
				setMethodBody((XExpression)null);
				return;
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY:
				setInferredMethodBody((XExpression)null);
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
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION:
				return getInterfaceImplementation() != null;
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_METHOD:
				return interfaceMethod != null;
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY:
				return methodBody != null;
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY:
				return inferredMethodBody != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getDefaultName() {
		return (interfaceMethod != null && (! interfaceMethod.eIsProxy()) ? interfaceMethod.getSimpleName() : null);
	}
} //InterfaceMethodImplementationImpl
