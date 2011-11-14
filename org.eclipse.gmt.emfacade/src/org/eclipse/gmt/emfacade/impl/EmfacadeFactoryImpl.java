/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfacadeFactoryImpl extends EFactoryImpl implements EmfacadeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmfacadeFactory init() {
		try {
			EmfacadeFactory theEmfacadeFactory = (EmfacadeFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/org.eclipse.gmt.emfacade/model/emfacade.ecore"); 
			if (theEmfacadeFactory != null) {
				return theEmfacadeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmfacadeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfacadeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmfacadePackage.DEFAULT_NAME: return createDefaultName();
			case EmfacadePackage.INTERFACE_IMPLEMENTATION: return createInterfaceImplementation();
			case EmfacadePackage.INTERFACE_METHOD_IMPLEMENTATION: return createInterfaceMethodImplementation();
			case EmfacadePackage.FACADE_MODEL: return createFacadeModel();
			case EmfacadePackage.IMPORT_DIRECTIVE: return createImportDirective();
			case EmfacadePackage.ECLASSIFIER_MAPPING: return createEClassifierMapping();
			case EmfacadePackage.ECLASS_MAPPING: return createEClassMapping();
			case EmfacadePackage.LIFE_CYCLE_IMPLEMENTATION: return createLifeCycleImplementation();
			case EmfacadePackage.EVENT_HANDLER: return createEventHandler();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY: return createFeatureMappingStrategy();
			case EmfacadePackage.EFEATURE_MAPPING: return createEFeatureMapping();
			case EmfacadePackage.EFEATURE_MAPPING_OPTIONS: return createEFeatureMappingOptions();
			case EmfacadePackage.EDATA_TYPE_MAPPING: return createEDataTypeMapping();
			case EmfacadePackage.EENUM_MAPPING: return createEEnumMapping();
			case EmfacadePackage.EENUM_LITERAL_MAPPING: return createEEnumLiteralMapping();
			case EmfacadePackage.NAME_TYPE_PATTERN_FMS: return createNameTypePatternFMS();
			case EmfacadePackage.MEMBER_PATTERN: return createMemberPattern();
			case EmfacadePackage.NAME_TYPE_PATTERN: return createNameTypePattern();
			case EmfacadePackage.TYPE_LIST_PATTERN: return createTypeListPattern();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN: return createFeatureMappingStrategyPattern();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_METHOD_PATTERN: return createFeatureMappingStrategyMethodPattern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmfacadePackage.EMFACADE_JVM_INFERRER_HELPER:
				return createEmfacadeJvmInferrerHelperFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmfacadePackage.EMFACADE_JVM_INFERRER_HELPER:
				return convertEmfacadeJvmInferrerHelperToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultName createDefaultName() {
		DefaultNameImpl defaultName = new DefaultNameImpl();
		return defaultName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceImplementation createInterfaceImplementation() {
		InterfaceImplementationImpl interfaceImplementation = new InterfaceImplementationImpl();
		return interfaceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceMethodImplementation createInterfaceMethodImplementation() {
		InterfaceMethodImplementationImpl interfaceMethodImplementation = new InterfaceMethodImplementationImpl();
		return interfaceMethodImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassMapping createEClassMapping() {
		EClassMappingImpl eClassMapping = new EClassMappingImpl();
		return eClassMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycleImplementation createLifeCycleImplementation() {
		LifeCycleImplementationImpl lifeCycleImplementation = new LifeCycleImplementationImpl();
		return lifeCycleImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandler createEventHandler() {
		EventHandlerImpl eventHandler = new EventHandlerImpl();
		return eventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMappingStrategy createFeatureMappingStrategy() {
		FeatureMappingStrategyImpl featureMappingStrategy = new FeatureMappingStrategyImpl();
		return featureMappingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMapping createEFeatureMapping() {
		EFeatureMappingImpl eFeatureMapping = new EFeatureMappingImpl();
		return eFeatureMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMappingOptions createEFeatureMappingOptions() {
		EFeatureMappingOptionsImpl eFeatureMappingOptions = new EFeatureMappingOptionsImpl();
		return eFeatureMappingOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumMapping createEEnumMapping() {
		EEnumMappingImpl eEnumMapping = new EEnumMappingImpl();
		return eEnumMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteralMapping createEEnumLiteralMapping() {
		EEnumLiteralMappingImpl eEnumLiteralMapping = new EEnumLiteralMappingImpl();
		return eEnumLiteralMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataTypeMapping createEDataTypeMapping() {
		EDataTypeMappingImpl eDataTypeMapping = new EDataTypeMappingImpl();
		return eDataTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameTypePatternFMS createNameTypePatternFMS() {
		NameTypePatternFMSImpl nameTypePatternFMS = new NameTypePatternFMSImpl();
		return nameTypePatternFMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameTypePattern createNameTypePattern() {
		NameTypePatternImpl nameTypePattern = new NameTypePatternImpl();
		return nameTypePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberPattern createMemberPattern() {
		MemberPatternImpl memberPattern = new MemberPatternImpl();
		return memberPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeListPattern createTypeListPattern() {
		TypeListPatternImpl typeListPattern = new TypeListPatternImpl();
		return typeListPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMappingStrategyPattern createFeatureMappingStrategyPattern() {
		FeatureMappingStrategyPatternImpl featureMappingStrategyPattern = new FeatureMappingStrategyPatternImpl();
		return featureMappingStrategyPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMappingStrategyMethodPattern createFeatureMappingStrategyMethodPattern() {
		FeatureMappingStrategyMethodPatternImpl featureMappingStrategyMethodPattern = new FeatureMappingStrategyMethodPatternImpl();
		return featureMappingStrategyMethodPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfacadeJvmInferrerHelper createEmfacadeJvmInferrerHelperFromString(EDataType eDataType, String initialValue) {
		return (EmfacadeJvmInferrerHelper)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmfacadeJvmInferrerHelperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacadeModel createFacadeModel() {
		FacadeModelImpl facadeModel = new FacadeModelImpl();
		return facadeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportDirective createImportDirective() {
		ImportDirectiveImpl importDirective = new ImportDirectiveImpl();
		return importDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifierMapping createEClassifierMapping() {
		EClassifierMappingImpl eClassifierMapping = new EClassifierMappingImpl();
		return eClassifierMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfacadePackage getEmfacadePackage() {
		return (EmfacadePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmfacadePackage getPackage() {
		return EmfacadePackage.eINSTANCE;
	}

} //EmfacadeFactoryImpl
