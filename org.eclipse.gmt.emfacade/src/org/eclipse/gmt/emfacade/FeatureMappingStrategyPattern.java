/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Mapping Strategy Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getMethodPatterns <em>Method Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategyPattern()
 * @model
 * @generated
 */
public interface FeatureMappingStrategyPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' container reference.
	 * @see #setStrategy(FeatureMappingStrategy)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategyPattern_Strategy()
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategy#getPatterns
	 * @model opposite="patterns" transient="false"
	 * @generated
	 */
	FeatureMappingStrategy getStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getStrategy <em>Strategy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' container reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(FeatureMappingStrategy value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategyPattern_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link types.JvmTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategyPattern_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<JvmTypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Method Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Patterns</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFeatureMappingStrategyPattern_MethodPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureMappingStrategyMethodPattern> getMethodPatterns();

} // FeatureMappingStrategyPattern
