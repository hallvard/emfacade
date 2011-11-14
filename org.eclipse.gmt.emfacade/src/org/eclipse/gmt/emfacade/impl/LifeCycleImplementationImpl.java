/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.emfacade.EClassMapping;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.LifeCycleImplementation;
import org.eclipse.gmt.emfacade.builder.LifeCycle;
import org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper;
import org.eclipse.gmt.emfacade.util.Util;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Cycle Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LifeCycleImplementationImpl extends InterfaceImplementationImpl implements LifeCycleImplementation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeCycleImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.LIFE_CYCLE_IMPLEMENTATION;
	}

	@Override
	public JvmGenericType getInterfaceType(EmfacadeJvmInferrerHelper helper) {
		if (this.getInferredInterfaceType() == null) {
			EClassMapping eClassMapping = Util.getContainerOfType(this, EClassMapping.class);
			try {
				JvmGenericType interfaceType = (JvmGenericType) helper.getJvmTypeRef(LifeCycle.class, this).getType();
				JvmType eClassType = helper.getEClass(eClassMapping);
				this.setInferredInterfaceType(helper.getInferredJvmType(interfaceType, eClassType, eClassMapping.getJClass()));
			} catch (Exception e) {
			}
		}
		return this.getInferredInterfaceType();
	}
} //LifeCycleImplementationImpl
