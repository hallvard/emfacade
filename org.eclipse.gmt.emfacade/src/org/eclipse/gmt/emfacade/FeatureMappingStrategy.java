/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Mapping Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy#getImplType <em>Impl Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategy()
 * @model
 * @generated
 */
public interface FeatureMappingStrategy extends DefaultName {
	/**
	 * Returns the value of the '<em><b>Impl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Type</em>' reference.
	 * @see #setImplType(JvmGenericType)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategy_ImplType()
	 * @model
	 * @generated
	 */
	JvmGenericType getImplType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy#getImplType <em>Impl Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Type</em>' reference.
	 * @see #getImplType()
	 * @generated
	 */
	void setImplType(JvmGenericType value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' reference.
	 * @see #setInterfaceType(JvmGenericType)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategy_InterfaceType()
	 * @model
	 * @generated
	 */
	JvmGenericType getInterfaceType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy#getInterfaceType <em>Interface Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' reference.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(JvmGenericType value);

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategy_Patterns()
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getStrategy
	 * @model opposite="strategy" containment="true"
	 * @generated
	 */
	EList<FeatureMappingStrategyPattern> getPatterns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jElementsMany="true"
	 * @generated
	 */
	EList<EFeatureMapping> createFeatureMappings(EList<JvmMember> jElements);

} // FeatureMappingStrategy
