/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Mapping Strategy Method Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getStrategyMethod <em>Strategy Method</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getTargetMember <em>Target Member</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getTargetBody <em>Target Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategyMethodPattern()
 * @model
 * @generated
 */
public interface FeatureMappingStrategyMethodPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategy Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Method</em>' reference.
	 * @see #setStrategyMethod(JvmOperation)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategyMethodPattern_StrategyMethod()
	 * @model
	 * @generated
	 */
	JvmOperation getStrategyMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getStrategyMethod <em>Strategy Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Method</em>' reference.
	 * @see #getStrategyMethod()
	 * @generated
	 */
	void setStrategyMethod(JvmOperation value);

	/**
	 * Returns the value of the '<em><b>Target Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Member</em>' containment reference.
	 * @see #setTargetMember(JvmFeature)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategyMethodPattern_TargetMember()
	 * @model containment="true"
	 * @generated
	 */
	JvmFeature getTargetMember();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getTargetMember <em>Target Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Member</em>' containment reference.
	 * @see #getTargetMember()
	 * @generated
	 */
	void setTargetMember(JvmFeature value);

	/**
	 * Returns the value of the '<em><b>Target Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Body</em>' containment reference.
	 * @see #setTargetBody(XExpression)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategyMethodPattern_TargetBody()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getTargetBody();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getTargetBody <em>Target Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Body</em>' containment reference.
	 * @see #getTargetBody()
	 * @generated
	 */
	void setTargetBody(XExpression value);

} // FeatureMappingStrategyMethodPattern
