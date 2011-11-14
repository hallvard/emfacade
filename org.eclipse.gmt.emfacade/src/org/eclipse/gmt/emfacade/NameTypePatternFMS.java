/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Type Pattern FMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.NameTypePatternFMS#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getNameTypePatternFMS()
 * @model
 * @generated
 */
public interface NameTypePatternFMS extends FeatureMappingStrategy {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(NameTypePattern)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getNameTypePatternFMS_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	NameTypePattern getPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.NameTypePatternFMS#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(NameTypePattern value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EStructuralFeature createFeature(String propertyName, JvmTypeReference type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EFeatureMapping createFeatureMapping(EStructuralFeature feature);

} // NameTypePatternFMS
