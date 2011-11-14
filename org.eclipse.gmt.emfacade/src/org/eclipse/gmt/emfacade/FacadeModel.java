/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.FacadeModel#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FacadeModel#getUsesFacadeModels <em>Uses Facade Models</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FacadeModel#getFeatureMappingStrategies <em>Feature Mapping Strategies</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FacadeModel#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FacadeModel#getEPackages <em>EPackages</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FacadeModel#getClassifierMappings <em>Classifier Mappings</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FacadeModel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.FacadeModel#getFeatureMappingDefaults <em>Feature Mapping Defaults</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFacadeModel()
 * @model
 * @generated
 */
public interface FacadeModel extends DefaultName {
	/**
	 * Returns the value of the '<em><b>Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Model</em>' reference.
	 * @see #setGenModel(GenPackage)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFacadeModel_GenModel()
	 * @model
	 * @generated
	 */
	GenPackage getGenModel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FacadeModel#getGenModel <em>Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Model</em>' reference.
	 * @see #getGenModel()
	 * @generated
	 */
	void setGenModel(GenPackage value);

	/**
	 * Returns the value of the '<em><b>Uses Facade Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.FacadeModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Facade Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Facade Models</em>' reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFacadeModel_UsesFacadeModels()
	 * @model
	 * @generated
	 */
	EList<FacadeModel> getUsesFacadeModels();

	/**
	 * Returns the value of the '<em><b>Feature Mapping Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.FeatureMappingStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Mapping Strategies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Mapping Strategies</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFacadeModel_FeatureMappingStrategies()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureMappingStrategy> getFeatureMappingStrategies();

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFacadeModel_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FacadeModel#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>EPackages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackages</em>' reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFacadeModel_EPackages()
	 * @model
	 * @generated
	 */
	EList<EPackage> getEPackages();

	/**
	 * Returns the value of the '<em><b>Classifier Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.EClassifierMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Mappings</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFacadeModel_ClassifierMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<EClassifierMapping> getClassifierMappings();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.ImportDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFacadeModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportDirective> getImports();

	/**
	 * Returns the value of the '<em><b>Feature Mapping Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Mapping Defaults</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Mapping Defaults</em>' containment reference.
	 * @see #setFeatureMappingDefaults(EFeatureMappingOptions)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getFacadeModel_FeatureMappingDefaults()
	 * @model containment="true"
	 * @generated
	 */
	EFeatureMappingOptions getFeatureMappingDefaults();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.FacadeModel#getFeatureMappingDefaults <em>Feature Mapping Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Mapping Defaults</em>' containment reference.
	 * @see #getFeatureMappingDefaults()
	 * @generated
	 */
	void setFeatureMappingDefaults(EFeatureMappingOptions value);

} // FacadeModel
