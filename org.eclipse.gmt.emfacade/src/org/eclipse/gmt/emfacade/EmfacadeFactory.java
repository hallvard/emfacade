/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.EmfacadePackage
 * @generated
 */
public interface EmfacadeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfacadeFactory eINSTANCE = org.eclipse.gmt.emfacade.impl.EmfacadeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Default Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Name</em>'.
	 * @generated
	 */
	DefaultName createDefaultName();

	/**
	 * Returns a new object of class '<em>Interface Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Implementation</em>'.
	 * @generated
	 */
	InterfaceImplementation createInterfaceImplementation();

	/**
	 * Returns a new object of class '<em>Interface Method Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Method Implementation</em>'.
	 * @generated
	 */
	InterfaceMethodImplementation createInterfaceMethodImplementation();

	/**
	 * Returns a new object of class '<em>EClass Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass Mapping</em>'.
	 * @generated
	 */
	EClassMapping createEClassMapping();

	/**
	 * Returns a new object of class '<em>Life Cycle Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Life Cycle Implementation</em>'.
	 * @generated
	 */
	LifeCycleImplementation createLifeCycleImplementation();

	/**
	 * Returns a new object of class '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Handler</em>'.
	 * @generated
	 */
	EventHandler createEventHandler();

	/**
	 * Returns a new object of class '<em>Feature Mapping Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Mapping Strategy</em>'.
	 * @generated
	 */
	FeatureMappingStrategy createFeatureMappingStrategy();

	/**
	 * Returns a new object of class '<em>EFeature Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature Mapping</em>'.
	 * @generated
	 */
	EFeatureMapping createEFeatureMapping();

	/**
	 * Returns a new object of class '<em>EFeature Mapping Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature Mapping Options</em>'.
	 * @generated
	 */
	EFeatureMappingOptions createEFeatureMappingOptions();

	/**
	 * Returns a new object of class '<em>EEnum Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum Mapping</em>'.
	 * @generated
	 */
	EEnumMapping createEEnumMapping();

	/**
	 * Returns a new object of class '<em>EEnum Literal Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum Literal Mapping</em>'.
	 * @generated
	 */
	EEnumLiteralMapping createEEnumLiteralMapping();

	/**
	 * Returns a new object of class '<em>EData Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EData Type Mapping</em>'.
	 * @generated
	 */
	EDataTypeMapping createEDataTypeMapping();

	/**
	 * Returns a new object of class '<em>Name Type Pattern FMS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Type Pattern FMS</em>'.
	 * @generated
	 */
	NameTypePatternFMS createNameTypePatternFMS();

	/**
	 * Returns a new object of class '<em>Name Type Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Type Pattern</em>'.
	 * @generated
	 */
	NameTypePattern createNameTypePattern();

	/**
	 * Returns a new object of class '<em>Member Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Pattern</em>'.
	 * @generated
	 */
	MemberPattern createMemberPattern();

	/**
	 * Returns a new object of class '<em>Type List Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type List Pattern</em>'.
	 * @generated
	 */
	TypeListPattern createTypeListPattern();

	/**
	 * Returns a new object of class '<em>Feature Mapping Strategy Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Mapping Strategy Pattern</em>'.
	 * @generated
	 */
	FeatureMappingStrategyPattern createFeatureMappingStrategyPattern();

	/**
	 * Returns a new object of class '<em>Feature Mapping Strategy Method Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Mapping Strategy Method Pattern</em>'.
	 * @generated
	 */
	FeatureMappingStrategyMethodPattern createFeatureMappingStrategyMethodPattern();

	/**
	 * Returns a new object of class '<em>Facade Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade Model</em>'.
	 * @generated
	 */
	FacadeModel createFacadeModel();

	/**
	 * Returns a new object of class '<em>Import Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Directive</em>'.
	 * @generated
	 */
	ImportDirective createImportDirective();

	/**
	 * Returns a new object of class '<em>EClassifier Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClassifier Mapping</em>'.
	 * @generated
	 */
	EClassifierMapping createEClassifierMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmfacadePackage getEmfacadePackage();

} //EmfacadeFactory
