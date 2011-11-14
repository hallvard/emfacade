/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.EmfacadeFactory
 * @model kind="package"
 * @generated
 */
public interface EmfacadePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emfacade";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.eclipse.gmt.emfacade/model/emfacade.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfacade";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfacadePackage eINSTANCE = org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.DefaultNameImpl <em>Default Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.DefaultNameImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getDefaultName()
	 * @generated
	 */
	int DEFAULT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Default Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_NAME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.InterfaceImplementationImpl <em>Interface Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.InterfaceImplementationImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getInterfaceImplementation()
	 * @generated
	 */
	int INTERFACE_IMPLEMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Method Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Inferred Interface Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Interface Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.InterfaceMethodImplementationImpl <em>Interface Method Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.InterfaceMethodImplementationImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getInterfaceMethodImplementation()
	 * @generated
	 */
	int INTERFACE_METHOD_IMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD_IMPLEMENTATION__NAME = DEFAULT_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Interface Implementation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION = DEFAULT_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_METHOD = DEFAULT_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY = DEFAULT_NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inferred Method Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY = DEFAULT_NAME_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Method Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD_IMPLEMENTATION_FEATURE_COUNT = DEFAULT_NAME_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl <em>EClass Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.EClassMappingImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEClassMapping()
	 * @generated
	 */
	int ECLASS_MAPPING = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl <em>EFeature Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEFeatureMapping()
	 * @generated
	 */
	int EFEATURE_MAPPING = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyImpl <em>Feature Mapping Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getFeatureMappingStrategy()
	 * @generated
	 */
	int FEATURE_MAPPING_STRATEGY = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.NameTypePatternFMSImpl <em>Name Type Pattern FMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.NameTypePatternFMSImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getNameTypePatternFMS()
	 * @generated
	 */
	int NAME_TYPE_PATTERN_FMS = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.NameTypePatternImpl <em>Name Type Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.NameTypePatternImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getNameTypePattern()
	 * @generated
	 */
	int NAME_TYPE_PATTERN = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl <em>Facade Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.FacadeModelImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getFacadeModel()
	 * @generated
	 */
	int FACADE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL__NAME = DEFAULT_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL__GEN_MODEL = DEFAULT_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uses Facade Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL__USES_FACADE_MODELS = DEFAULT_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Mapping Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL__FEATURE_MAPPING_STRATEGIES = DEFAULT_NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL__BASE_PACKAGE = DEFAULT_NAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EPackages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL__EPACKAGES = DEFAULT_NAME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Classifier Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL__CLASSIFIER_MAPPINGS = DEFAULT_NAME_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL__IMPORTS = DEFAULT_NAME_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Feature Mapping Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL__FEATURE_MAPPING_DEFAULTS = DEFAULT_NAME_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Facade Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_MODEL_FEATURE_COUNT = DEFAULT_NAME_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.ImportDirectiveImpl <em>Import Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.ImportDirectiveImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getImportDirective()
	 * @generated
	 */
	int IMPORT_DIRECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DIRECTIVE__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DIRECTIVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.EClassifierMappingImpl <em>EClassifier Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.EClassifierMappingImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEClassifierMapping()
	 * @generated
	 */
	int ECLASSIFIER_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_MAPPING__NAME = DEFAULT_NAME__NAME;

	/**
	 * The number of structural features of the '<em>EClassifier Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_MAPPING_FEATURE_COUNT = DEFAULT_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__NAME = ECLASSIFIER_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__ECLASS = ECLASSIFIER_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>JClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__JCLASS = ECLASSIFIER_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__CREATE_EXPRESSION = ECLASSIFIER_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Life Cycle Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__LIFE_CYCLE_HANDLER = ECLASSIFIER_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dispose Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__DISPOSE_EXPRESSION = ECLASSIFIER_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__FEATURE_MAPPINGS = ECLASSIFIER_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Feature Mapping Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS = ECLASSIFIER_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__EVENT_HANDLERS = ECLASSIFIER_MAPPING_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EClass Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING_FEATURE_COUNT = ECLASSIFIER_MAPPING_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.LifeCycleImplementationImpl <em>Life Cycle Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.LifeCycleImplementationImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getLifeCycleImplementation()
	 * @generated
	 */
	int LIFE_CYCLE_IMPLEMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Method Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS = INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Inferred Interface Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE = INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE;

	/**
	 * The number of structural features of the '<em>Life Cycle Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_IMPLEMENTATION_FEATURE_COUNT = INTERFACE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.EventHandlerImpl <em>Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.EventHandlerImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEventHandler()
	 * @generated
	 */
	int EVENT_HANDLER = 8;

	/**
	 * The feature id for the '<em><b>Method Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__METHOD_IMPLEMENTATIONS = INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Inferred Interface Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__INFERRED_INTERFACE_TYPE = INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__INTERFACE_TYPE = INTERFACE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = INTERFACE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY__NAME = DEFAULT_NAME__NAME;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.EEnumMappingImpl <em>EEnum Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.EEnumMappingImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEEnumMapping()
	 * @generated
	 */
	int EENUM_MAPPING = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.EEnumLiteralMappingImpl <em>EEnum Literal Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.EEnumLiteralMappingImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEEnumLiteralMapping()
	 * @generated
	 */
	int EENUM_LITERAL_MAPPING = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.EDataTypeMappingImpl <em>EData Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.EDataTypeMappingImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEDataTypeMapping()
	 * @generated
	 */
	int EDATA_TYPE_MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Impl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY__IMPL_TYPE = DEFAULT_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE = DEFAULT_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY__PATTERNS = DEFAULT_NAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Mapping Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_FEATURE_COUNT = DEFAULT_NAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING__NAME = DEFAULT_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Method Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING__METHOD_IMPLEMENTATIONS = DEFAULT_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inferred Interface Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING__INFERRED_INTERFACE_TYPE = DEFAULT_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.MemberPatternImpl <em>Member Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.MemberPatternImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getMemberPattern()
	 * @generated
	 */
	int MEMBER_PATTERN = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.TypeListPatternImpl <em>Type List Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.TypeListPatternImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getTypeListPattern()
	 * @generated
	 */
	int TYPE_LIST_PATTERN = 18;

	/**
	 * The feature id for the '<em><b>EClass Mapping</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING__ECLASS_MAPPING = DEFAULT_NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING__OPTIONS = DEFAULT_NAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EFeature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING__EFEATURE = DEFAULT_NAME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>JClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING__JCLASS = DEFAULT_NAME_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EFeature Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING_FEATURE_COUNT = DEFAULT_NAME_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingOptionsImpl <em>EFeature Mapping Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.EFeatureMappingOptionsImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEFeatureMappingOptions()
	 * @generated
	 */
	int EFEATURE_MAPPING_OPTIONS = 11;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING_OPTIONS__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>EFeature Mapping Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_MAPPING_OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_MAPPING__NAME = ECLASSIFIER_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>EData Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_MAPPING__EDATA_TYPE = ECLASSIFIER_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>JClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_MAPPING__JCLASS = ECLASSIFIER_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Convert Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_MAPPING__CONVERT_EXPRESSION = ECLASSIFIER_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EData Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_MAPPING_FEATURE_COUNT = ECLASSIFIER_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_MAPPING__NAME = EDATA_TYPE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>EData Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_MAPPING__EDATA_TYPE = EDATA_TYPE_MAPPING__EDATA_TYPE;

	/**
	 * The feature id for the '<em><b>JClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_MAPPING__JCLASS = EDATA_TYPE_MAPPING__JCLASS;

	/**
	 * The feature id for the '<em><b>Convert Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_MAPPING__CONVERT_EXPRESSION = EDATA_TYPE_MAPPING__CONVERT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Literal Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_MAPPING__LITERAL_MAPPINGS = EDATA_TYPE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEnum Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_MAPPING_FEATURE_COUNT = EDATA_TYPE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_MAPPING__NAME = DEFAULT_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_MAPPING__ENUM_LITERAL = DEFAULT_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Convert Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION = DEFAULT_NAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEnum Literal Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_MAPPING_FEATURE_COUNT = DEFAULT_NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_PATTERN_FMS__NAME = FEATURE_MAPPING_STRATEGY__NAME;

	/**
	 * The feature id for the '<em><b>Impl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_PATTERN_FMS__IMPL_TYPE = FEATURE_MAPPING_STRATEGY__IMPL_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_PATTERN_FMS__INTERFACE_TYPE = FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_PATTERN_FMS__PATTERNS = FEATURE_MAPPING_STRATEGY__PATTERNS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_PATTERN_FMS__PATTERN = FEATURE_MAPPING_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Type Pattern FMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_PATTERN_FMS_FEATURE_COUNT = FEATURE_MAPPING_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PATTERN__NAME_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Type Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PATTERN__TYPE_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Parameter List Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PATTERN__PARAMETER_LIST_PATTERN = 2;

	/**
	 * The number of structural features of the '<em>Member Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_PATTERN_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Member Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_PATTERN__MEMBER_PATTERNS = 0;

	/**
	 * The number of structural features of the '<em>Name Type Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Parameter Type Patterns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST_PATTERN__PARAMETER_TYPE_PATTERNS = 0;

	/**
	 * The number of structural features of the '<em>Type List Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyPatternImpl <em>Feature Mapping Strategy Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyPatternImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getFeatureMappingStrategyPattern()
	 * @generated
	 */
	int FEATURE_MAPPING_STRATEGY_PATTERN = 19;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY = 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_PATTERN__FEATURE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_PATTERN__TYPE_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Method Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_PATTERN__METHOD_PATTERNS = 3;

	/**
	 * The number of structural features of the '<em>Feature Mapping Strategy Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_PATTERN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyMethodPatternImpl <em>Feature Mapping Strategy Method Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyMethodPatternImpl
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getFeatureMappingStrategyMethodPattern()
	 * @generated
	 */
	int FEATURE_MAPPING_STRATEGY_METHOD_PATTERN = 20;

	/**
	 * The feature id for the '<em><b>Strategy Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__STRATEGY_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Target Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Target Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY = 2;

	/**
	 * The number of structural features of the '<em>Feature Mapping Strategy Method Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAPPING_STRATEGY_METHOD_PATTERN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '<em>Jvm Inferrer Helper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper
	 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEmfacadeJvmInferrerHelper()
	 * @generated
	 */
	int EMFACADE_JVM_INFERRER_HELPER = 21;

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.DefaultName <em>Default Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Name</em>'.
	 * @see org.eclipse.gmt.emfacade.DefaultName
	 * @generated
	 */
	EClass getDefaultName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.DefaultName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.emfacade.DefaultName#getName()
	 * @see #getDefaultName()
	 * @generated
	 */
	EAttribute getDefaultName_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.InterfaceImplementation <em>Interface Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Implementation</em>'.
	 * @see org.eclipse.gmt.emfacade.InterfaceImplementation
	 * @generated
	 */
	EClass getInterfaceImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.InterfaceImplementation#getMethodImplementations <em>Method Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Implementations</em>'.
	 * @see org.eclipse.gmt.emfacade.InterfaceImplementation#getMethodImplementations()
	 * @see #getInterfaceImplementation()
	 * @generated
	 */
	EReference getInterfaceImplementation_MethodImplementations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.InterfaceImplementation#getInferredInterfaceType <em>Inferred Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inferred Interface Type</em>'.
	 * @see org.eclipse.gmt.emfacade.InterfaceImplementation#getInferredInterfaceType()
	 * @see #getInterfaceImplementation()
	 * @generated
	 */
	EReference getInterfaceImplementation_InferredInterfaceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation <em>Interface Method Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Method Implementation</em>'.
	 * @see org.eclipse.gmt.emfacade.InterfaceMethodImplementation
	 * @generated
	 */
	EClass getInterfaceMethodImplementation();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceImplementation <em>Interface Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface Implementation</em>'.
	 * @see org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceImplementation()
	 * @see #getInterfaceMethodImplementation()
	 * @generated
	 */
	EReference getInterfaceMethodImplementation_InterfaceImplementation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceMethod <em>Interface Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Method</em>'.
	 * @see org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInterfaceMethod()
	 * @see #getInterfaceMethodImplementation()
	 * @generated
	 */
	EReference getInterfaceMethodImplementation_InterfaceMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getMethodBody <em>Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Body</em>'.
	 * @see org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getMethodBody()
	 * @see #getInterfaceMethodImplementation()
	 * @generated
	 */
	EReference getInterfaceMethodImplementation_MethodBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInferredMethodBody <em>Inferred Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inferred Method Body</em>'.
	 * @see org.eclipse.gmt.emfacade.InterfaceMethodImplementation#getInferredMethodBody()
	 * @see #getInterfaceMethodImplementation()
	 * @generated
	 */
	EReference getInterfaceMethodImplementation_InferredMethodBody();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.EClassMapping <em>EClass Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Mapping</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassMapping
	 * @generated
	 */
	EClass getEClassMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.EClassMapping#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassMapping#getEClass()
	 * @see #getEClassMapping()
	 * @generated
	 */
	EReference getEClassMapping_EClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.EClassMapping#getJClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>JClass</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassMapping#getJClass()
	 * @see #getEClassMapping()
	 * @generated
	 */
	EReference getEClassMapping_JClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.EClassMapping#getCreateExpression <em>Create Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Expression</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassMapping#getCreateExpression()
	 * @see #getEClassMapping()
	 * @generated
	 */
	EReference getEClassMapping_CreateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.EClassMapping#getLifeCycleHandler <em>Life Cycle Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Life Cycle Handler</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassMapping#getLifeCycleHandler()
	 * @see #getEClassMapping()
	 * @generated
	 */
	EReference getEClassMapping_LifeCycleHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.EClassMapping#getDisposeExpression <em>Dispose Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dispose Expression</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassMapping#getDisposeExpression()
	 * @see #getEClassMapping()
	 * @generated
	 */
	EReference getEClassMapping_DisposeExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.EClassMapping#getFeatureMappings <em>Feature Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Mappings</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassMapping#getFeatureMappings()
	 * @see #getEClassMapping()
	 * @generated
	 */
	EReference getEClassMapping_FeatureMappings();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.EClassMapping#getFeatureMappingDefaults <em>Feature Mapping Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Mapping Defaults</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassMapping#getFeatureMappingDefaults()
	 * @see #getEClassMapping()
	 * @generated
	 */
	EReference getEClassMapping_FeatureMappingDefaults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.EClassMapping#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Handlers</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassMapping#getEventHandlers()
	 * @see #getEClassMapping()
	 * @generated
	 */
	EReference getEClassMapping_EventHandlers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.LifeCycleImplementation <em>Life Cycle Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Cycle Implementation</em>'.
	 * @see org.eclipse.gmt.emfacade.LifeCycleImplementation
	 * @generated
	 */
	EClass getLifeCycleImplementation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler</em>'.
	 * @see org.eclipse.gmt.emfacade.EventHandler
	 * @generated
	 */
	EClass getEventHandler();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.EventHandler#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Type</em>'.
	 * @see org.eclipse.gmt.emfacade.EventHandler#getInterfaceType()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_InterfaceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.EFeatureMapping <em>EFeature Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFeature Mapping</em>'.
	 * @see org.eclipse.gmt.emfacade.EFeatureMapping
	 * @generated
	 */
	EClass getEFeatureMapping();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.emfacade.EFeatureMapping#getEClassMapping <em>EClass Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EClass Mapping</em>'.
	 * @see org.eclipse.gmt.emfacade.EFeatureMapping#getEClassMapping()
	 * @see #getEFeatureMapping()
	 * @generated
	 */
	EReference getEFeatureMapping_EClassMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.EFeatureMapping#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see org.eclipse.gmt.emfacade.EFeatureMapping#getOptions()
	 * @see #getEFeatureMapping()
	 * @generated
	 */
	EReference getEFeatureMapping_Options();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.EFeatureMapping#getEFeature <em>EFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EFeature</em>'.
	 * @see org.eclipse.gmt.emfacade.EFeatureMapping#getEFeature()
	 * @see #getEFeatureMapping()
	 * @generated
	 */
	EReference getEFeatureMapping_EFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.EFeatureMapping#getJClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>JClass</em>'.
	 * @see org.eclipse.gmt.emfacade.EFeatureMapping#getJClass()
	 * @see #getEFeatureMapping()
	 * @generated
	 */
	EReference getEFeatureMapping_JClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.EFeatureMappingOptions <em>EFeature Mapping Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFeature Mapping Options</em>'.
	 * @see org.eclipse.gmt.emfacade.EFeatureMappingOptions
	 * @generated
	 */
	EClass getEFeatureMappingOptions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.EFeatureMappingOptions#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strategy</em>'.
	 * @see org.eclipse.gmt.emfacade.EFeatureMappingOptions#getStrategy()
	 * @see #getEFeatureMappingOptions()
	 * @generated
	 */
	EReference getEFeatureMappingOptions_Strategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.EEnumMapping <em>EEnum Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Mapping</em>'.
	 * @see org.eclipse.gmt.emfacade.EEnumMapping
	 * @generated
	 */
	EClass getEEnumMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.EEnumMapping#getLiteralMappings <em>Literal Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal Mappings</em>'.
	 * @see org.eclipse.gmt.emfacade.EEnumMapping#getLiteralMappings()
	 * @see #getEEnumMapping()
	 * @generated
	 */
	EReference getEEnumMapping_LiteralMappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.EEnumLiteralMapping <em>EEnum Literal Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Literal Mapping</em>'.
	 * @see org.eclipse.gmt.emfacade.EEnumLiteralMapping
	 * @generated
	 */
	EClass getEEnumLiteralMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.EEnumLiteralMapping#getEnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Literal</em>'.
	 * @see org.eclipse.gmt.emfacade.EEnumLiteralMapping#getEnumLiteral()
	 * @see #getEEnumLiteralMapping()
	 * @generated
	 */
	EReference getEEnumLiteralMapping_EnumLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.EEnumLiteralMapping#getConvertExpression <em>Convert Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Convert Expression</em>'.
	 * @see org.eclipse.gmt.emfacade.EEnumLiteralMapping#getConvertExpression()
	 * @see #getEEnumLiteralMapping()
	 * @generated
	 */
	EReference getEEnumLiteralMapping_ConvertExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.EDataTypeMapping <em>EData Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type Mapping</em>'.
	 * @see org.eclipse.gmt.emfacade.EDataTypeMapping
	 * @generated
	 */
	EClass getEDataTypeMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.EDataTypeMapping#getEDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EData Type</em>'.
	 * @see org.eclipse.gmt.emfacade.EDataTypeMapping#getEDataType()
	 * @see #getEDataTypeMapping()
	 * @generated
	 */
	EReference getEDataTypeMapping_EDataType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.EDataTypeMapping#getJClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>JClass</em>'.
	 * @see org.eclipse.gmt.emfacade.EDataTypeMapping#getJClass()
	 * @see #getEDataTypeMapping()
	 * @generated
	 */
	EReference getEDataTypeMapping_JClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.EDataTypeMapping#getConvertExpression <em>Convert Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Convert Expression</em>'.
	 * @see org.eclipse.gmt.emfacade.EDataTypeMapping#getConvertExpression()
	 * @see #getEDataTypeMapping()
	 * @generated
	 */
	EReference getEDataTypeMapping_ConvertExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy <em>Feature Mapping Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Mapping Strategy</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategy
	 * @generated
	 */
	EClass getFeatureMappingStrategy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy#getImplType <em>Impl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impl Type</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategy#getImplType()
	 * @see #getFeatureMappingStrategy()
	 * @generated
	 */
	EReference getFeatureMappingStrategy_ImplType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Type</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategy#getInterfaceType()
	 * @see #getFeatureMappingStrategy()
	 * @generated
	 */
	EReference getFeatureMappingStrategy_InterfaceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategy#getPatterns()
	 * @see #getFeatureMappingStrategy()
	 * @generated
	 */
	EReference getFeatureMappingStrategy_Patterns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.NameTypePatternFMS <em>Name Type Pattern FMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type Pattern FMS</em>'.
	 * @see org.eclipse.gmt.emfacade.NameTypePatternFMS
	 * @generated
	 */
	EClass getNameTypePatternFMS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.NameTypePatternFMS#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.eclipse.gmt.emfacade.NameTypePatternFMS#getPattern()
	 * @see #getNameTypePatternFMS()
	 * @generated
	 */
	EReference getNameTypePatternFMS_Pattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.NameTypePattern <em>Name Type Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type Pattern</em>'.
	 * @see org.eclipse.gmt.emfacade.NameTypePattern
	 * @generated
	 */
	EClass getNameTypePattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.NameTypePattern#getMemberPatterns <em>Member Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Patterns</em>'.
	 * @see org.eclipse.gmt.emfacade.NameTypePattern#getMemberPatterns()
	 * @see #getNameTypePattern()
	 * @generated
	 */
	EReference getNameTypePattern_MemberPatterns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.FacadeModel <em>Facade Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade Model</em>'.
	 * @see org.eclipse.gmt.emfacade.FacadeModel
	 * @generated
	 */
	EClass getFacadeModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.FacadeModel#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Model</em>'.
	 * @see org.eclipse.gmt.emfacade.FacadeModel#getGenModel()
	 * @see #getFacadeModel()
	 * @generated
	 */
	EReference getFacadeModel_GenModel();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.emfacade.FacadeModel#getUsesFacadeModels <em>Uses Facade Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Facade Models</em>'.
	 * @see org.eclipse.gmt.emfacade.FacadeModel#getUsesFacadeModels()
	 * @see #getFacadeModel()
	 * @generated
	 */
	EReference getFacadeModel_UsesFacadeModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.FacadeModel#getFeatureMappingStrategies <em>Feature Mapping Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Mapping Strategies</em>'.
	 * @see org.eclipse.gmt.emfacade.FacadeModel#getFeatureMappingStrategies()
	 * @see #getFacadeModel()
	 * @generated
	 */
	EReference getFacadeModel_FeatureMappingStrategies();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.FacadeModel#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.eclipse.gmt.emfacade.FacadeModel#getBasePackage()
	 * @see #getFacadeModel()
	 * @generated
	 */
	EAttribute getFacadeModel_BasePackage();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmt.emfacade.FacadeModel#getEPackages <em>EPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EPackages</em>'.
	 * @see org.eclipse.gmt.emfacade.FacadeModel#getEPackages()
	 * @see #getFacadeModel()
	 * @generated
	 */
	EReference getFacadeModel_EPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.FacadeModel#getClassifierMappings <em>Classifier Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier Mappings</em>'.
	 * @see org.eclipse.gmt.emfacade.FacadeModel#getClassifierMappings()
	 * @see #getFacadeModel()
	 * @generated
	 */
	EReference getFacadeModel_ClassifierMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.FacadeModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.gmt.emfacade.FacadeModel#getImports()
	 * @see #getFacadeModel()
	 * @generated
	 */
	EReference getFacadeModel_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.FacadeModel#getFeatureMappingDefaults <em>Feature Mapping Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Mapping Defaults</em>'.
	 * @see org.eclipse.gmt.emfacade.FacadeModel#getFeatureMappingDefaults()
	 * @see #getFacadeModel()
	 * @generated
	 */
	EReference getFacadeModel_FeatureMappingDefaults();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.ImportDirective <em>Import Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Directive</em>'.
	 * @see org.eclipse.gmt.emfacade.ImportDirective
	 * @generated
	 */
	EClass getImportDirective();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.ImportDirective#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.gmt.emfacade.ImportDirective#getImportedNamespace()
	 * @see #getImportDirective()
	 * @generated
	 */
	EAttribute getImportDirective_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.EClassifierMapping <em>EClassifier Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClassifier Mapping</em>'.
	 * @see org.eclipse.gmt.emfacade.EClassifierMapping
	 * @generated
	 */
	EClass getEClassifierMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.MemberPattern <em>Member Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Pattern</em>'.
	 * @see org.eclipse.gmt.emfacade.MemberPattern
	 * @generated
	 */
	EClass getMemberPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.MemberPattern#getNamePattern <em>Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Pattern</em>'.
	 * @see org.eclipse.gmt.emfacade.MemberPattern#getNamePattern()
	 * @see #getMemberPattern()
	 * @generated
	 */
	EAttribute getMemberPattern_NamePattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.MemberPattern#getTypePattern <em>Type Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Pattern</em>'.
	 * @see org.eclipse.gmt.emfacade.MemberPattern#getTypePattern()
	 * @see #getMemberPattern()
	 * @generated
	 */
	EAttribute getMemberPattern_TypePattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.MemberPattern#getParameterListPattern <em>Parameter List Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter List Pattern</em>'.
	 * @see org.eclipse.gmt.emfacade.MemberPattern#getParameterListPattern()
	 * @see #getMemberPattern()
	 * @generated
	 */
	EReference getMemberPattern_ParameterListPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.TypeListPattern <em>Type List Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type List Pattern</em>'.
	 * @see org.eclipse.gmt.emfacade.TypeListPattern
	 * @generated
	 */
	EClass getTypeListPattern();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmt.emfacade.TypeListPattern#getParameterTypePatterns <em>Parameter Type Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Type Patterns</em>'.
	 * @see org.eclipse.gmt.emfacade.TypeListPattern#getParameterTypePatterns()
	 * @see #getTypeListPattern()
	 * @generated
	 */
	EAttribute getTypeListPattern_ParameterTypePatterns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern <em>Feature Mapping Strategy Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Mapping Strategy Pattern</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern
	 * @generated
	 */
	EClass getFeatureMappingStrategyPattern();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Strategy</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getStrategy()
	 * @see #getFeatureMappingStrategyPattern()
	 * @generated
	 */
	EReference getFeatureMappingStrategyPattern_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getFeatureName()
	 * @see #getFeatureMappingStrategyPattern()
	 * @generated
	 */
	EAttribute getFeatureMappingStrategyPattern_FeatureName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getTypeParameters()
	 * @see #getFeatureMappingStrategyPattern()
	 * @generated
	 */
	EReference getFeatureMappingStrategyPattern_TypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getMethodPatterns <em>Method Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Patterns</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern#getMethodPatterns()
	 * @see #getFeatureMappingStrategyPattern()
	 * @generated
	 */
	EReference getFeatureMappingStrategyPattern_MethodPatterns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern <em>Feature Mapping Strategy Method Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Mapping Strategy Method Pattern</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern
	 * @generated
	 */
	EClass getFeatureMappingStrategyMethodPattern();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getStrategyMethod <em>Strategy Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strategy Method</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getStrategyMethod()
	 * @see #getFeatureMappingStrategyMethodPattern()
	 * @generated
	 */
	EReference getFeatureMappingStrategyMethodPattern_StrategyMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getTargetMember <em>Target Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Member</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getTargetMember()
	 * @see #getFeatureMappingStrategyMethodPattern()
	 * @generated
	 */
	EReference getFeatureMappingStrategyMethodPattern_TargetMember();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getTargetBody <em>Target Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Body</em>'.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern#getTargetBody()
	 * @see #getFeatureMappingStrategyMethodPattern()
	 * @generated
	 */
	EReference getFeatureMappingStrategyMethodPattern_TargetBody();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper <em>Jvm Inferrer Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Jvm Inferrer Helper</em>'.
	 * @see org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper
	 * @model instanceClass="org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper"
	 * @generated
	 */
	EDataType getEmfacadeJvmInferrerHelper();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmfacadeFactory getEmfacadeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.DefaultNameImpl <em>Default Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.DefaultNameImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getDefaultName()
		 * @generated
		 */
		EClass DEFAULT_NAME = eINSTANCE.getDefaultName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_NAME__NAME = eINSTANCE.getDefaultName_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.InterfaceImplementationImpl <em>Interface Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.InterfaceImplementationImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getInterfaceImplementation()
		 * @generated
		 */
		EClass INTERFACE_IMPLEMENTATION = eINSTANCE.getInterfaceImplementation();

		/**
		 * The meta object literal for the '<em><b>Method Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS = eINSTANCE.getInterfaceImplementation_MethodImplementations();

		/**
		 * The meta object literal for the '<em><b>Inferred Interface Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE = eINSTANCE.getInterfaceImplementation_InferredInterfaceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.InterfaceMethodImplementationImpl <em>Interface Method Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.InterfaceMethodImplementationImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getInterfaceMethodImplementation()
		 * @generated
		 */
		EClass INTERFACE_METHOD_IMPLEMENTATION = eINSTANCE.getInterfaceMethodImplementation();

		/**
		 * The meta object literal for the '<em><b>Interface Implementation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION = eINSTANCE.getInterfaceMethodImplementation_InterfaceImplementation();

		/**
		 * The meta object literal for the '<em><b>Interface Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_METHOD = eINSTANCE.getInterfaceMethodImplementation_InterfaceMethod();

		/**
		 * The meta object literal for the '<em><b>Method Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY = eINSTANCE.getInterfaceMethodImplementation_MethodBody();

		/**
		 * The meta object literal for the '<em><b>Inferred Method Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY = eINSTANCE.getInterfaceMethodImplementation_InferredMethodBody();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.EClassMappingImpl <em>EClass Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.EClassMappingImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEClassMapping()
		 * @generated
		 */
		EClass ECLASS_MAPPING = eINSTANCE.getEClassMapping();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_MAPPING__ECLASS = eINSTANCE.getEClassMapping_EClass();

		/**
		 * The meta object literal for the '<em><b>JClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_MAPPING__JCLASS = eINSTANCE.getEClassMapping_JClass();

		/**
		 * The meta object literal for the '<em><b>Create Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_MAPPING__CREATE_EXPRESSION = eINSTANCE.getEClassMapping_CreateExpression();

		/**
		 * The meta object literal for the '<em><b>Life Cycle Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_MAPPING__LIFE_CYCLE_HANDLER = eINSTANCE.getEClassMapping_LifeCycleHandler();

		/**
		 * The meta object literal for the '<em><b>Dispose Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_MAPPING__DISPOSE_EXPRESSION = eINSTANCE.getEClassMapping_DisposeExpression();

		/**
		 * The meta object literal for the '<em><b>Feature Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_MAPPING__FEATURE_MAPPINGS = eINSTANCE.getEClassMapping_FeatureMappings();

		/**
		 * The meta object literal for the '<em><b>Feature Mapping Defaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS = eINSTANCE.getEClassMapping_FeatureMappingDefaults();

		/**
		 * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_MAPPING__EVENT_HANDLERS = eINSTANCE.getEClassMapping_EventHandlers();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.LifeCycleImplementationImpl <em>Life Cycle Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.LifeCycleImplementationImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getLifeCycleImplementation()
		 * @generated
		 */
		EClass LIFE_CYCLE_IMPLEMENTATION = eINSTANCE.getLifeCycleImplementation();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.EventHandlerImpl <em>Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.EventHandlerImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEventHandler()
		 * @generated
		 */
		EClass EVENT_HANDLER = eINSTANCE.getEventHandler();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__INTERFACE_TYPE = eINSTANCE.getEventHandler_InterfaceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl <em>EFeature Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.EFeatureMappingImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEFeatureMapping()
		 * @generated
		 */
		EClass EFEATURE_MAPPING = eINSTANCE.getEFeatureMapping();

		/**
		 * The meta object literal for the '<em><b>EClass Mapping</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE_MAPPING__ECLASS_MAPPING = eINSTANCE.getEFeatureMapping_EClassMapping();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE_MAPPING__OPTIONS = eINSTANCE.getEFeatureMapping_Options();

		/**
		 * The meta object literal for the '<em><b>EFeature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE_MAPPING__EFEATURE = eINSTANCE.getEFeatureMapping_EFeature();

		/**
		 * The meta object literal for the '<em><b>JClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE_MAPPING__JCLASS = eINSTANCE.getEFeatureMapping_JClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.EFeatureMappingOptionsImpl <em>EFeature Mapping Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.EFeatureMappingOptionsImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEFeatureMappingOptions()
		 * @generated
		 */
		EClass EFEATURE_MAPPING_OPTIONS = eINSTANCE.getEFeatureMappingOptions();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE_MAPPING_OPTIONS__STRATEGY = eINSTANCE.getEFeatureMappingOptions_Strategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.EEnumMappingImpl <em>EEnum Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.EEnumMappingImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEEnumMapping()
		 * @generated
		 */
		EClass EENUM_MAPPING = eINSTANCE.getEEnumMapping();

		/**
		 * The meta object literal for the '<em><b>Literal Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM_MAPPING__LITERAL_MAPPINGS = eINSTANCE.getEEnumMapping_LiteralMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.EEnumLiteralMappingImpl <em>EEnum Literal Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.EEnumLiteralMappingImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEEnumLiteralMapping()
		 * @generated
		 */
		EClass EENUM_LITERAL_MAPPING = eINSTANCE.getEEnumLiteralMapping();

		/**
		 * The meta object literal for the '<em><b>Enum Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM_LITERAL_MAPPING__ENUM_LITERAL = eINSTANCE.getEEnumLiteralMapping_EnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Convert Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION = eINSTANCE.getEEnumLiteralMapping_ConvertExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.EDataTypeMappingImpl <em>EData Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.EDataTypeMappingImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEDataTypeMapping()
		 * @generated
		 */
		EClass EDATA_TYPE_MAPPING = eINSTANCE.getEDataTypeMapping();

		/**
		 * The meta object literal for the '<em><b>EData Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDATA_TYPE_MAPPING__EDATA_TYPE = eINSTANCE.getEDataTypeMapping_EDataType();

		/**
		 * The meta object literal for the '<em><b>JClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDATA_TYPE_MAPPING__JCLASS = eINSTANCE.getEDataTypeMapping_JClass();

		/**
		 * The meta object literal for the '<em><b>Convert Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDATA_TYPE_MAPPING__CONVERT_EXPRESSION = eINSTANCE.getEDataTypeMapping_ConvertExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyImpl <em>Feature Mapping Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getFeatureMappingStrategy()
		 * @generated
		 */
		EClass FEATURE_MAPPING_STRATEGY = eINSTANCE.getFeatureMappingStrategy();

		/**
		 * The meta object literal for the '<em><b>Impl Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING_STRATEGY__IMPL_TYPE = eINSTANCE.getFeatureMappingStrategy_ImplType();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE = eINSTANCE.getFeatureMappingStrategy_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING_STRATEGY__PATTERNS = eINSTANCE.getFeatureMappingStrategy_Patterns();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.NameTypePatternFMSImpl <em>Name Type Pattern FMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.NameTypePatternFMSImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getNameTypePatternFMS()
		 * @generated
		 */
		EClass NAME_TYPE_PATTERN_FMS = eINSTANCE.getNameTypePatternFMS();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_TYPE_PATTERN_FMS__PATTERN = eINSTANCE.getNameTypePatternFMS_Pattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.NameTypePatternImpl <em>Name Type Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.NameTypePatternImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getNameTypePattern()
		 * @generated
		 */
		EClass NAME_TYPE_PATTERN = eINSTANCE.getNameTypePattern();

		/**
		 * The meta object literal for the '<em><b>Member Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_TYPE_PATTERN__MEMBER_PATTERNS = eINSTANCE.getNameTypePattern_MemberPatterns();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl <em>Facade Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.FacadeModelImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getFacadeModel()
		 * @generated
		 */
		EClass FACADE_MODEL = eINSTANCE.getFacadeModel();

		/**
		 * The meta object literal for the '<em><b>Gen Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACADE_MODEL__GEN_MODEL = eINSTANCE.getFacadeModel_GenModel();

		/**
		 * The meta object literal for the '<em><b>Uses Facade Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACADE_MODEL__USES_FACADE_MODELS = eINSTANCE.getFacadeModel_UsesFacadeModels();

		/**
		 * The meta object literal for the '<em><b>Feature Mapping Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACADE_MODEL__FEATURE_MAPPING_STRATEGIES = eINSTANCE.getFacadeModel_FeatureMappingStrategies();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACADE_MODEL__BASE_PACKAGE = eINSTANCE.getFacadeModel_BasePackage();

		/**
		 * The meta object literal for the '<em><b>EPackages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACADE_MODEL__EPACKAGES = eINSTANCE.getFacadeModel_EPackages();

		/**
		 * The meta object literal for the '<em><b>Classifier Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACADE_MODEL__CLASSIFIER_MAPPINGS = eINSTANCE.getFacadeModel_ClassifierMappings();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACADE_MODEL__IMPORTS = eINSTANCE.getFacadeModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Feature Mapping Defaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACADE_MODEL__FEATURE_MAPPING_DEFAULTS = eINSTANCE.getFacadeModel_FeatureMappingDefaults();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.ImportDirectiveImpl <em>Import Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.ImportDirectiveImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getImportDirective()
		 * @generated
		 */
		EClass IMPORT_DIRECTIVE = eINSTANCE.getImportDirective();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DIRECTIVE__IMPORTED_NAMESPACE = eINSTANCE.getImportDirective_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.EClassifierMappingImpl <em>EClassifier Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.EClassifierMappingImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEClassifierMapping()
		 * @generated
		 */
		EClass ECLASSIFIER_MAPPING = eINSTANCE.getEClassifierMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.MemberPatternImpl <em>Member Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.MemberPatternImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getMemberPattern()
		 * @generated
		 */
		EClass MEMBER_PATTERN = eINSTANCE.getMemberPattern();

		/**
		 * The meta object literal for the '<em><b>Name Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PATTERN__NAME_PATTERN = eINSTANCE.getMemberPattern_NamePattern();

		/**
		 * The meta object literal for the '<em><b>Type Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_PATTERN__TYPE_PATTERN = eINSTANCE.getMemberPattern_TypePattern();

		/**
		 * The meta object literal for the '<em><b>Parameter List Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_PATTERN__PARAMETER_LIST_PATTERN = eINSTANCE.getMemberPattern_ParameterListPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.TypeListPatternImpl <em>Type List Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.TypeListPatternImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getTypeListPattern()
		 * @generated
		 */
		EClass TYPE_LIST_PATTERN = eINSTANCE.getTypeListPattern();

		/**
		 * The meta object literal for the '<em><b>Parameter Type Patterns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_LIST_PATTERN__PARAMETER_TYPE_PATTERNS = eINSTANCE.getTypeListPattern_ParameterTypePatterns();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyPatternImpl <em>Feature Mapping Strategy Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyPatternImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getFeatureMappingStrategyPattern()
		 * @generated
		 */
		EClass FEATURE_MAPPING_STRATEGY_PATTERN = eINSTANCE.getFeatureMappingStrategyPattern();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY = eINSTANCE.getFeatureMappingStrategyPattern_Strategy();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MAPPING_STRATEGY_PATTERN__FEATURE_NAME = eINSTANCE.getFeatureMappingStrategyPattern_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING_STRATEGY_PATTERN__TYPE_PARAMETERS = eINSTANCE.getFeatureMappingStrategyPattern_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Method Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING_STRATEGY_PATTERN__METHOD_PATTERNS = eINSTANCE.getFeatureMappingStrategyPattern_MethodPatterns();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyMethodPatternImpl <em>Feature Mapping Strategy Method Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyMethodPatternImpl
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getFeatureMappingStrategyMethodPattern()
		 * @generated
		 */
		EClass FEATURE_MAPPING_STRATEGY_METHOD_PATTERN = eINSTANCE.getFeatureMappingStrategyMethodPattern();

		/**
		 * The meta object literal for the '<em><b>Strategy Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__STRATEGY_METHOD = eINSTANCE.getFeatureMappingStrategyMethodPattern_StrategyMethod();

		/**
		 * The meta object literal for the '<em><b>Target Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER = eINSTANCE.getFeatureMappingStrategyMethodPattern_TargetMember();

		/**
		 * The meta object literal for the '<em><b>Target Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY = eINSTANCE.getFeatureMappingStrategyMethodPattern_TargetBody();

		/**
		 * The meta object literal for the '<em>Jvm Inferrer Helper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper
		 * @see org.eclipse.gmt.emfacade.impl.EmfacadePackageImpl#getEmfacadeJvmInferrerHelper()
		 * @generated
		 */
		EDataType EMFACADE_JVM_INFERRER_HELPER = eINSTANCE.getEmfacadeJvmInferrerHelper();

	}

} //EmfacadePackage
