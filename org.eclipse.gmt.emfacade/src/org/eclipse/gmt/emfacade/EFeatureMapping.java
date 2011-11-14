/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.JvmGenericType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFeature Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.EFeatureMapping#getEClassMapping <em>EClass Mapping</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EFeatureMapping#getOptions <em>Options</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EFeatureMapping#getEFeature <em>EFeature</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EFeatureMapping#getJClass <em>JClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEFeatureMapping()
 * @model
 * @generated
 */
public interface EFeatureMapping extends DefaultName, InterfaceImplementation {
	/**
	 * Returns the value of the '<em><b>EClass Mapping</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.EClassMapping#getFeatureMappings <em>Feature Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass Mapping</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass Mapping</em>' container reference.
	 * @see #setEClassMapping(EClassMapping)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEFeatureMapping_EClassMapping()
	 * @see org.eclipse.gmt.emfacade.EClassMapping#getFeatureMappings
	 * @model opposite="featureMappings" transient="false"
	 * @generated
	 */
	EClassMapping getEClassMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EFeatureMapping#getEClassMapping <em>EClass Mapping</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass Mapping</em>' container reference.
	 * @see #getEClassMapping()
	 * @generated
	 */
	void setEClassMapping(EClassMapping value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(EFeatureMappingOptions)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEFeatureMapping_Options()
	 * @model containment="true"
	 * @generated
	 */
	EFeatureMappingOptions getOptions();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EFeatureMapping#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(EFeatureMappingOptions value);

	/**
	 * Returns the value of the '<em><b>EFeature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFeature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFeature</em>' reference.
	 * @see #setEFeature(EStructuralFeature)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEFeatureMapping_EFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getEFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EFeatureMapping#getEFeature <em>EFeature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFeature</em>' reference.
	 * @see #getEFeature()
	 * @generated
	 */
	void setEFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>JClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JClass</em>' reference.
	 * @see #setJClass(JvmGenericType)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEFeatureMapping_JClass()
	 * @model
	 * @generated
	 */
	JvmGenericType getJClass();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EFeatureMapping#getJClass <em>JClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JClass</em>' reference.
	 * @see #getJClass()
	 * @generated
	 */
	void setJClass(JvmGenericType value);

} // EFeatureMapping
