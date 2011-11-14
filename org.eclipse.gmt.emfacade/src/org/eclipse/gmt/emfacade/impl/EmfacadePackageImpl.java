/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmt.emfacade.DefaultName;
import org.eclipse.gmt.emfacade.EClassMapping;
import org.eclipse.gmt.emfacade.EClassifierMapping;
import org.eclipse.gmt.emfacade.EDataTypeMapping;
import org.eclipse.gmt.emfacade.EEnumLiteralMapping;
import org.eclipse.gmt.emfacade.EEnumMapping;
import org.eclipse.gmt.emfacade.EFeatureMapping;
import org.eclipse.gmt.emfacade.EFeatureMappingOptions;
import org.eclipse.gmt.emfacade.EmfacadeFactory;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.EventHandler;
import org.eclipse.gmt.emfacade.FacadeModel;
import org.eclipse.gmt.emfacade.FeatureMappingStrategy;
import org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern;
import org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern;
import org.eclipse.gmt.emfacade.ImportDirective;
import org.eclipse.gmt.emfacade.InterfaceImplementation;
import org.eclipse.gmt.emfacade.InterfaceMethodImplementation;
import org.eclipse.gmt.emfacade.LifeCycleImplementation;
import org.eclipse.gmt.emfacade.MemberPattern;
import org.eclipse.gmt.emfacade.NameTypePattern;
import org.eclipse.gmt.emfacade.NameTypePatternFMS;
import org.eclipse.gmt.emfacade.TypeListPattern;
import org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.impl.TypesPackageImpl;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.impl.XbasePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfacadePackageImpl extends EPackageImpl implements EmfacadePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceMethodImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifeCycleImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMappingOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumLiteralMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataTypeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureMappingStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTypePatternFMSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTypePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facadeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassifierMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeListPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureMappingStrategyPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureMappingStrategyMethodPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emfacadeJvmInferrerHelperEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmfacadePackageImpl() {
		super(eNS_URI, EmfacadeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EmfacadePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmfacadePackage init() {
		if (isInited) return (EmfacadePackage)EPackage.Registry.INSTANCE.getEPackage(EmfacadePackage.eNS_URI);

		// Obtain or create and register package
		EmfacadePackageImpl theEmfacadePackage = (EmfacadePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmfacadePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmfacadePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		XbasePackageImpl theXbasePackage = (XbasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI) instanceof XbasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI) : XbasePackage.eINSTANCE);
		GenModelPackageImpl theGenModelPackage = (GenModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI) instanceof GenModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI) : GenModelPackage.eINSTANCE);

		// Create package meta-data objects
		theEmfacadePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theXbasePackage.createPackageContents();
		theGenModelPackage.createPackageContents();

		// Initialize created meta-data
		theEmfacadePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theXbasePackage.initializePackageContents();
		theGenModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmfacadePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmfacadePackage.eNS_URI, theEmfacadePackage);
		return theEmfacadePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultName() {
		return defaultNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultName_Name() {
		return (EAttribute)defaultNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceImplementation() {
		return interfaceImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceImplementation_MethodImplementations() {
		return (EReference)interfaceImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceImplementation_InferredInterfaceType() {
		return (EReference)interfaceImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceMethodImplementation() {
		return interfaceMethodImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceMethodImplementation_InterfaceImplementation() {
		return (EReference)interfaceMethodImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceMethodImplementation_InterfaceMethod() {
		return (EReference)interfaceMethodImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceMethodImplementation_MethodBody() {
		return (EReference)interfaceMethodImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceMethodImplementation_InferredMethodBody() {
		return (EReference)interfaceMethodImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassMapping() {
		return eClassMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassMapping_EClass() {
		return (EReference)eClassMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassMapping_JClass() {
		return (EReference)eClassMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassMapping_CreateExpression() {
		return (EReference)eClassMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassMapping_LifeCycleHandler() {
		return (EReference)eClassMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassMapping_DisposeExpression() {
		return (EReference)eClassMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassMapping_FeatureMappings() {
		return (EReference)eClassMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassMapping_FeatureMappingDefaults() {
		return (EReference)eClassMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassMapping_EventHandlers() {
		return (EReference)eClassMappingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeCycleImplementation() {
		return lifeCycleImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventHandler() {
		return eventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHandler_InterfaceType() {
		return (EReference)eventHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapping() {
		return eFeatureMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMapping_EClassMapping() {
		return (EReference)eFeatureMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMapping_Options() {
		return (EReference)eFeatureMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMapping_EFeature() {
		return (EReference)eFeatureMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMapping_JClass() {
		return (EReference)eFeatureMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMappingOptions() {
		return eFeatureMappingOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMappingOptions_Strategy() {
		return (EReference)eFeatureMappingOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnumMapping() {
		return eEnumMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnumMapping_LiteralMappings() {
		return (EReference)eEnumMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnumLiteralMapping() {
		return eEnumLiteralMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnumLiteralMapping_EnumLiteral() {
		return (EReference)eEnumLiteralMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnumLiteralMapping_ConvertExpression() {
		return (EReference)eEnumLiteralMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDataTypeMapping() {
		return eDataTypeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDataTypeMapping_EDataType() {
		return (EReference)eDataTypeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDataTypeMapping_JClass() {
		return (EReference)eDataTypeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDataTypeMapping_ConvertExpression() {
		return (EReference)eDataTypeMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureMappingStrategy() {
		return featureMappingStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMappingStrategy_ImplType() {
		return (EReference)featureMappingStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMappingStrategy_InterfaceType() {
		return (EReference)featureMappingStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMappingStrategy_Patterns() {
		return (EReference)featureMappingStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameTypePatternFMS() {
		return nameTypePatternFMSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameTypePatternFMS_Pattern() {
		return (EReference)nameTypePatternFMSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameTypePattern() {
		return nameTypePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameTypePattern_MemberPatterns() {
		return (EReference)nameTypePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacadeModel() {
		return facadeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacadeModel_GenModel() {
		return (EReference)facadeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacadeModel_UsesFacadeModels() {
		return (EReference)facadeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacadeModel_FeatureMappingStrategies() {
		return (EReference)facadeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacadeModel_BasePackage() {
		return (EAttribute)facadeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacadeModel_EPackages() {
		return (EReference)facadeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacadeModel_ClassifierMappings() {
		return (EReference)facadeModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacadeModel_Imports() {
		return (EReference)facadeModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacadeModel_FeatureMappingDefaults() {
		return (EReference)facadeModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportDirective() {
		return importDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportDirective_ImportedNamespace() {
		return (EAttribute)importDirectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassifierMapping() {
		return eClassifierMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberPattern() {
		return memberPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberPattern_NamePattern() {
		return (EAttribute)memberPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberPattern_TypePattern() {
		return (EAttribute)memberPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberPattern_ParameterListPattern() {
		return (EReference)memberPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeListPattern() {
		return typeListPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeListPattern_ParameterTypePatterns() {
		return (EAttribute)typeListPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureMappingStrategyPattern() {
		return featureMappingStrategyPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMappingStrategyPattern_Strategy() {
		return (EReference)featureMappingStrategyPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureMappingStrategyPattern_FeatureName() {
		return (EAttribute)featureMappingStrategyPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMappingStrategyPattern_TypeParameters() {
		return (EReference)featureMappingStrategyPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMappingStrategyPattern_MethodPatterns() {
		return (EReference)featureMappingStrategyPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureMappingStrategyMethodPattern() {
		return featureMappingStrategyMethodPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMappingStrategyMethodPattern_StrategyMethod() {
		return (EReference)featureMappingStrategyMethodPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMappingStrategyMethodPattern_TargetMember() {
		return (EReference)featureMappingStrategyMethodPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureMappingStrategyMethodPattern_TargetBody() {
		return (EReference)featureMappingStrategyMethodPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEmfacadeJvmInferrerHelper() {
		return emfacadeJvmInferrerHelperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfacadeFactory getEmfacadeFactory() {
		return (EmfacadeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		defaultNameEClass = createEClass(DEFAULT_NAME);
		createEAttribute(defaultNameEClass, DEFAULT_NAME__NAME);

		interfaceImplementationEClass = createEClass(INTERFACE_IMPLEMENTATION);
		createEReference(interfaceImplementationEClass, INTERFACE_IMPLEMENTATION__METHOD_IMPLEMENTATIONS);
		createEReference(interfaceImplementationEClass, INTERFACE_IMPLEMENTATION__INFERRED_INTERFACE_TYPE);

		interfaceMethodImplementationEClass = createEClass(INTERFACE_METHOD_IMPLEMENTATION);
		createEReference(interfaceMethodImplementationEClass, INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_IMPLEMENTATION);
		createEReference(interfaceMethodImplementationEClass, INTERFACE_METHOD_IMPLEMENTATION__INTERFACE_METHOD);
		createEReference(interfaceMethodImplementationEClass, INTERFACE_METHOD_IMPLEMENTATION__METHOD_BODY);
		createEReference(interfaceMethodImplementationEClass, INTERFACE_METHOD_IMPLEMENTATION__INFERRED_METHOD_BODY);

		facadeModelEClass = createEClass(FACADE_MODEL);
		createEReference(facadeModelEClass, FACADE_MODEL__GEN_MODEL);
		createEReference(facadeModelEClass, FACADE_MODEL__USES_FACADE_MODELS);
		createEReference(facadeModelEClass, FACADE_MODEL__FEATURE_MAPPING_STRATEGIES);
		createEAttribute(facadeModelEClass, FACADE_MODEL__BASE_PACKAGE);
		createEReference(facadeModelEClass, FACADE_MODEL__EPACKAGES);
		createEReference(facadeModelEClass, FACADE_MODEL__CLASSIFIER_MAPPINGS);
		createEReference(facadeModelEClass, FACADE_MODEL__IMPORTS);
		createEReference(facadeModelEClass, FACADE_MODEL__FEATURE_MAPPING_DEFAULTS);

		importDirectiveEClass = createEClass(IMPORT_DIRECTIVE);
		createEAttribute(importDirectiveEClass, IMPORT_DIRECTIVE__IMPORTED_NAMESPACE);

		eClassifierMappingEClass = createEClass(ECLASSIFIER_MAPPING);

		eClassMappingEClass = createEClass(ECLASS_MAPPING);
		createEReference(eClassMappingEClass, ECLASS_MAPPING__ECLASS);
		createEReference(eClassMappingEClass, ECLASS_MAPPING__JCLASS);
		createEReference(eClassMappingEClass, ECLASS_MAPPING__CREATE_EXPRESSION);
		createEReference(eClassMappingEClass, ECLASS_MAPPING__LIFE_CYCLE_HANDLER);
		createEReference(eClassMappingEClass, ECLASS_MAPPING__DISPOSE_EXPRESSION);
		createEReference(eClassMappingEClass, ECLASS_MAPPING__FEATURE_MAPPINGS);
		createEReference(eClassMappingEClass, ECLASS_MAPPING__FEATURE_MAPPING_DEFAULTS);
		createEReference(eClassMappingEClass, ECLASS_MAPPING__EVENT_HANDLERS);

		lifeCycleImplementationEClass = createEClass(LIFE_CYCLE_IMPLEMENTATION);

		eventHandlerEClass = createEClass(EVENT_HANDLER);
		createEReference(eventHandlerEClass, EVENT_HANDLER__INTERFACE_TYPE);

		featureMappingStrategyEClass = createEClass(FEATURE_MAPPING_STRATEGY);
		createEReference(featureMappingStrategyEClass, FEATURE_MAPPING_STRATEGY__IMPL_TYPE);
		createEReference(featureMappingStrategyEClass, FEATURE_MAPPING_STRATEGY__INTERFACE_TYPE);
		createEReference(featureMappingStrategyEClass, FEATURE_MAPPING_STRATEGY__PATTERNS);

		eFeatureMappingEClass = createEClass(EFEATURE_MAPPING);
		createEReference(eFeatureMappingEClass, EFEATURE_MAPPING__ECLASS_MAPPING);
		createEReference(eFeatureMappingEClass, EFEATURE_MAPPING__OPTIONS);
		createEReference(eFeatureMappingEClass, EFEATURE_MAPPING__EFEATURE);
		createEReference(eFeatureMappingEClass, EFEATURE_MAPPING__JCLASS);

		eFeatureMappingOptionsEClass = createEClass(EFEATURE_MAPPING_OPTIONS);
		createEReference(eFeatureMappingOptionsEClass, EFEATURE_MAPPING_OPTIONS__STRATEGY);

		eDataTypeMappingEClass = createEClass(EDATA_TYPE_MAPPING);
		createEReference(eDataTypeMappingEClass, EDATA_TYPE_MAPPING__EDATA_TYPE);
		createEReference(eDataTypeMappingEClass, EDATA_TYPE_MAPPING__JCLASS);
		createEReference(eDataTypeMappingEClass, EDATA_TYPE_MAPPING__CONVERT_EXPRESSION);

		eEnumMappingEClass = createEClass(EENUM_MAPPING);
		createEReference(eEnumMappingEClass, EENUM_MAPPING__LITERAL_MAPPINGS);

		eEnumLiteralMappingEClass = createEClass(EENUM_LITERAL_MAPPING);
		createEReference(eEnumLiteralMappingEClass, EENUM_LITERAL_MAPPING__ENUM_LITERAL);
		createEReference(eEnumLiteralMappingEClass, EENUM_LITERAL_MAPPING__CONVERT_EXPRESSION);

		nameTypePatternFMSEClass = createEClass(NAME_TYPE_PATTERN_FMS);
		createEReference(nameTypePatternFMSEClass, NAME_TYPE_PATTERN_FMS__PATTERN);

		memberPatternEClass = createEClass(MEMBER_PATTERN);
		createEAttribute(memberPatternEClass, MEMBER_PATTERN__NAME_PATTERN);
		createEAttribute(memberPatternEClass, MEMBER_PATTERN__TYPE_PATTERN);
		createEReference(memberPatternEClass, MEMBER_PATTERN__PARAMETER_LIST_PATTERN);

		nameTypePatternEClass = createEClass(NAME_TYPE_PATTERN);
		createEReference(nameTypePatternEClass, NAME_TYPE_PATTERN__MEMBER_PATTERNS);

		typeListPatternEClass = createEClass(TYPE_LIST_PATTERN);
		createEAttribute(typeListPatternEClass, TYPE_LIST_PATTERN__PARAMETER_TYPE_PATTERNS);

		featureMappingStrategyPatternEClass = createEClass(FEATURE_MAPPING_STRATEGY_PATTERN);
		createEReference(featureMappingStrategyPatternEClass, FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY);
		createEAttribute(featureMappingStrategyPatternEClass, FEATURE_MAPPING_STRATEGY_PATTERN__FEATURE_NAME);
		createEReference(featureMappingStrategyPatternEClass, FEATURE_MAPPING_STRATEGY_PATTERN__TYPE_PARAMETERS);
		createEReference(featureMappingStrategyPatternEClass, FEATURE_MAPPING_STRATEGY_PATTERN__METHOD_PATTERNS);

		featureMappingStrategyMethodPatternEClass = createEClass(FEATURE_MAPPING_STRATEGY_METHOD_PATTERN);
		createEReference(featureMappingStrategyMethodPatternEClass, FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__STRATEGY_METHOD);
		createEReference(featureMappingStrategyMethodPatternEClass, FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_MEMBER);
		createEReference(featureMappingStrategyMethodPatternEClass, FEATURE_MAPPING_STRATEGY_METHOD_PATTERN__TARGET_BODY);

		// Create data types
		emfacadeJvmInferrerHelperEDataType = createEDataType(EMFACADE_JVM_INFERRER_HELPER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
		GenModelPackage theGenModelPackage = (GenModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interfaceMethodImplementationEClass.getESuperTypes().add(this.getDefaultName());
		facadeModelEClass.getESuperTypes().add(this.getDefaultName());
		eClassifierMappingEClass.getESuperTypes().add(this.getDefaultName());
		eClassMappingEClass.getESuperTypes().add(this.getEClassifierMapping());
		lifeCycleImplementationEClass.getESuperTypes().add(this.getInterfaceImplementation());
		eventHandlerEClass.getESuperTypes().add(this.getInterfaceImplementation());
		featureMappingStrategyEClass.getESuperTypes().add(this.getDefaultName());
		eFeatureMappingEClass.getESuperTypes().add(this.getDefaultName());
		eFeatureMappingEClass.getESuperTypes().add(this.getInterfaceImplementation());
		eDataTypeMappingEClass.getESuperTypes().add(this.getEClassifierMapping());
		eEnumMappingEClass.getESuperTypes().add(this.getEDataTypeMapping());
		eEnumLiteralMappingEClass.getESuperTypes().add(this.getDefaultName());
		nameTypePatternFMSEClass.getESuperTypes().add(this.getFeatureMappingStrategy());

		// Initialize classes and features; add operations and parameters
		initEClass(defaultNameEClass, DefaultName.class, "DefaultName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultName_Name(), ecorePackage.getEString(), "name", null, 0, 1, DefaultName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(defaultNameEClass, ecorePackage.getEString(), "getDefaultName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interfaceImplementationEClass, InterfaceImplementation.class, "InterfaceImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceImplementation_MethodImplementations(), this.getInterfaceMethodImplementation(), this.getInterfaceMethodImplementation_InterfaceImplementation(), "methodImplementations", null, 0, -1, InterfaceImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceImplementation_InferredInterfaceType(), theTypesPackage.getJvmGenericType(), null, "inferredInterfaceType", null, 0, 1, InterfaceImplementation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(interfaceImplementationEClass, theTypesPackage.getJvmGenericType(), "getInterfaceType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEmfacadeJvmInferrerHelper(), "helper", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interfaceMethodImplementationEClass, InterfaceMethodImplementation.class, "InterfaceMethodImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceMethodImplementation_InterfaceImplementation(), this.getInterfaceImplementation(), this.getInterfaceImplementation_MethodImplementations(), "interfaceImplementation", null, 0, 1, InterfaceMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceMethodImplementation_InterfaceMethod(), theTypesPackage.getJvmOperation(), null, "interfaceMethod", null, 0, 1, InterfaceMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceMethodImplementation_MethodBody(), theXbasePackage.getXExpression(), null, "methodBody", null, 0, 1, InterfaceMethodImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceMethodImplementation_InferredMethodBody(), theXbasePackage.getXExpression(), null, "inferredMethodBody", null, 0, 1, InterfaceMethodImplementation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(facadeModelEClass, FacadeModel.class, "FacadeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacadeModel_GenModel(), theGenModelPackage.getGenPackage(), null, "genModel", null, 0, 1, FacadeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacadeModel_UsesFacadeModels(), this.getFacadeModel(), null, "usesFacadeModels", null, 0, -1, FacadeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacadeModel_FeatureMappingStrategies(), this.getFeatureMappingStrategy(), null, "featureMappingStrategies", null, 0, -1, FacadeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacadeModel_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, FacadeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacadeModel_EPackages(), ecorePackage.getEPackage(), null, "ePackages", null, 0, -1, FacadeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacadeModel_ClassifierMappings(), this.getEClassifierMapping(), null, "classifierMappings", null, 0, -1, FacadeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacadeModel_Imports(), this.getImportDirective(), null, "imports", null, 0, -1, FacadeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacadeModel_FeatureMappingDefaults(), this.getEFeatureMappingOptions(), null, "featureMappingDefaults", null, 0, 1, FacadeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importDirectiveEClass, ImportDirective.class, "ImportDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportDirective_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassifierMappingEClass, EClassifierMapping.class, "EClassifierMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eClassifierMappingEClass, ecorePackage.getEClassifier(), "getEClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassifierMappingEClass, theTypesPackage.getJvmDeclaredType(), "getDeclaredType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eClassMappingEClass, EClassMapping.class, "EClassMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassMapping_EClass(), ecorePackage.getEClass(), null, "eClass", null, 0, 1, EClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassMapping_JClass(), theTypesPackage.getJvmGenericType(), null, "jClass", null, 0, 1, EClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassMapping_CreateExpression(), theXbasePackage.getXExpression(), null, "createExpression", null, 0, 1, EClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassMapping_LifeCycleHandler(), this.getLifeCycleImplementation(), null, "lifeCycleHandler", null, 0, 1, EClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassMapping_DisposeExpression(), theXbasePackage.getXExpression(), null, "disposeExpression", null, 0, 1, EClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassMapping_FeatureMappings(), this.getEFeatureMapping(), this.getEFeatureMapping_EClassMapping(), "featureMappings", null, 0, -1, EClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassMapping_FeatureMappingDefaults(), this.getEFeatureMappingOptions(), null, "featureMappingDefaults", null, 0, 1, EClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassMapping_EventHandlers(), this.getEventHandler(), null, "eventHandlers", null, 0, -1, EClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lifeCycleImplementationEClass, LifeCycleImplementation.class, "LifeCycleImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventHandlerEClass, EventHandler.class, "EventHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventHandler_InterfaceType(), theTypesPackage.getJvmGenericType(), null, "interfaceType", null, 0, 1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureMappingStrategyEClass, FeatureMappingStrategy.class, "FeatureMappingStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureMappingStrategy_ImplType(), theTypesPackage.getJvmGenericType(), null, "implType", null, 0, 1, FeatureMappingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureMappingStrategy_InterfaceType(), theTypesPackage.getJvmGenericType(), null, "interfaceType", null, 0, 1, FeatureMappingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureMappingStrategy_Patterns(), this.getFeatureMappingStrategyPattern(), this.getFeatureMappingStrategyPattern_Strategy(), "patterns", null, 0, -1, FeatureMappingStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(featureMappingStrategyEClass, this.getEFeatureMapping(), "createFeatureMappings", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getJvmMember(), "jElements", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(eFeatureMappingEClass, EFeatureMapping.class, "EFeatureMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFeatureMapping_EClassMapping(), this.getEClassMapping(), this.getEClassMapping_FeatureMappings(), "eClassMapping", null, 0, 1, EFeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFeatureMapping_Options(), this.getEFeatureMappingOptions(), null, "options", null, 0, 1, EFeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFeatureMapping_EFeature(), ecorePackage.getEStructuralFeature(), null, "eFeature", null, 0, 1, EFeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFeatureMapping_JClass(), theTypesPackage.getJvmGenericType(), null, "jClass", null, 0, 1, EFeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eFeatureMappingOptionsEClass, EFeatureMappingOptions.class, "EFeatureMappingOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFeatureMappingOptions_Strategy(), this.getFeatureMappingStrategy(), null, "strategy", null, 0, 1, EFeatureMappingOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDataTypeMappingEClass, EDataTypeMapping.class, "EDataTypeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDataTypeMapping_EDataType(), ecorePackage.getEDataType(), null, "eDataType", null, 0, 1, EDataTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDataTypeMapping_JClass(), theTypesPackage.getJvmGenericType(), null, "jClass", null, 0, 1, EDataTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDataTypeMapping_ConvertExpression(), theXbasePackage.getXExpression(), null, "convertExpression", null, 0, 1, EDataTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumMappingEClass, EEnumMapping.class, "EEnumMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnumMapping_LiteralMappings(), this.getEEnumLiteralMapping(), null, "literalMappings", null, 0, -1, EEnumMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumLiteralMappingEClass, EEnumLiteralMapping.class, "EEnumLiteralMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnumLiteralMapping_EnumLiteral(), ecorePackage.getEEnumLiteral(), null, "enumLiteral", null, 0, 1, EEnumLiteralMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEnumLiteralMapping_ConvertExpression(), theXbasePackage.getXExpression(), null, "convertExpression", null, 0, 1, EEnumLiteralMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameTypePatternFMSEClass, NameTypePatternFMS.class, "NameTypePatternFMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameTypePatternFMS_Pattern(), this.getNameTypePattern(), null, "pattern", null, 0, 1, NameTypePatternFMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(nameTypePatternFMSEClass, ecorePackage.getEStructuralFeature(), "createFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "propertyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getJvmTypeReference(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(nameTypePatternFMSEClass, this.getEFeatureMapping(), "createFeatureMapping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(memberPatternEClass, MemberPattern.class, "MemberPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemberPattern_NamePattern(), ecorePackage.getEString(), "namePattern", null, 0, 1, MemberPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberPattern_TypePattern(), ecorePackage.getEString(), "typePattern", null, 0, 1, MemberPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberPattern_ParameterListPattern(), this.getTypeListPattern(), null, "parameterListPattern", null, 0, 1, MemberPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameTypePatternEClass, NameTypePattern.class, "NameTypePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameTypePattern_MemberPatterns(), this.getMemberPattern(), null, "memberPatterns", null, 0, -1, NameTypePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(nameTypePatternEClass, theTypesPackage.getJvmTypeReference(), "matchMembers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "propertyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getJvmMember(), "members", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getJvmMember(), "matchedMembers", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(nameTypePatternEClass, ecorePackage.getEString(), "findFeatures", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getJvmMember(), "members", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getJvmTypeReference(), "matchedTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeListPatternEClass, TypeListPattern.class, "TypeListPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeListPattern_ParameterTypePatterns(), ecorePackage.getEString(), "parameterTypePatterns", null, 0, -1, TypeListPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureMappingStrategyPatternEClass, FeatureMappingStrategyPattern.class, "FeatureMappingStrategyPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureMappingStrategyPattern_Strategy(), this.getFeatureMappingStrategy(), this.getFeatureMappingStrategy_Patterns(), "strategy", null, 0, 1, FeatureMappingStrategyPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureMappingStrategyPattern_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, FeatureMappingStrategyPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureMappingStrategyPattern_TypeParameters(), theTypesPackage.getJvmTypeParameter(), null, "typeParameters", null, 0, -1, FeatureMappingStrategyPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureMappingStrategyPattern_MethodPatterns(), this.getFeatureMappingStrategyMethodPattern(), null, "methodPatterns", null, 0, -1, FeatureMappingStrategyPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureMappingStrategyMethodPatternEClass, FeatureMappingStrategyMethodPattern.class, "FeatureMappingStrategyMethodPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureMappingStrategyMethodPattern_StrategyMethod(), theTypesPackage.getJvmOperation(), null, "strategyMethod", null, 0, 1, FeatureMappingStrategyMethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureMappingStrategyMethodPattern_TargetMember(), theTypesPackage.getJvmFeature(), null, "targetMember", null, 0, 1, FeatureMappingStrategyMethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureMappingStrategyMethodPattern_TargetBody(), theXbasePackage.getXExpression(), null, "targetBody", null, 0, 1, FeatureMappingStrategyMethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(emfacadeJvmInferrerHelperEDataType, EmfacadeJvmInferrerHelper.class, "EmfacadeJvmInferrerHelper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EmfacadePackageImpl
