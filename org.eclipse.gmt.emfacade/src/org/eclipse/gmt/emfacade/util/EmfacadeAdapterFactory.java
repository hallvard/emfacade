/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.emfacade.DefaultName;
import org.eclipse.gmt.emfacade.EClassMapping;
import org.eclipse.gmt.emfacade.EClassifierMapping;
import org.eclipse.gmt.emfacade.EDataTypeMapping;
import org.eclipse.gmt.emfacade.EEnumLiteralMapping;
import org.eclipse.gmt.emfacade.EEnumMapping;
import org.eclipse.gmt.emfacade.EFeatureMapping;
import org.eclipse.gmt.emfacade.EFeatureMappingOptions;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.EmfacadePackage
 * @generated
 */
public class EmfacadeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmfacadePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfacadeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EmfacadePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfacadeSwitch<Adapter> modelSwitch =
		new EmfacadeSwitch<Adapter>() {
			@Override
			public Adapter caseDefaultName(DefaultName object) {
				return createDefaultNameAdapter();
			}
			@Override
			public Adapter caseInterfaceImplementation(InterfaceImplementation object) {
				return createInterfaceImplementationAdapter();
			}
			@Override
			public Adapter caseInterfaceMethodImplementation(InterfaceMethodImplementation object) {
				return createInterfaceMethodImplementationAdapter();
			}
			@Override
			public Adapter caseFacadeModel(FacadeModel object) {
				return createFacadeModelAdapter();
			}
			@Override
			public Adapter caseImportDirective(ImportDirective object) {
				return createImportDirectiveAdapter();
			}
			@Override
			public Adapter caseEClassifierMapping(EClassifierMapping object) {
				return createEClassifierMappingAdapter();
			}
			@Override
			public Adapter caseEClassMapping(EClassMapping object) {
				return createEClassMappingAdapter();
			}
			@Override
			public Adapter caseLifeCycleImplementation(LifeCycleImplementation object) {
				return createLifeCycleImplementationAdapter();
			}
			@Override
			public Adapter caseEventHandler(EventHandler object) {
				return createEventHandlerAdapter();
			}
			@Override
			public Adapter caseFeatureMappingStrategy(FeatureMappingStrategy object) {
				return createFeatureMappingStrategyAdapter();
			}
			@Override
			public Adapter caseEFeatureMapping(EFeatureMapping object) {
				return createEFeatureMappingAdapter();
			}
			@Override
			public Adapter caseEFeatureMappingOptions(EFeatureMappingOptions object) {
				return createEFeatureMappingOptionsAdapter();
			}
			@Override
			public Adapter caseEDataTypeMapping(EDataTypeMapping object) {
				return createEDataTypeMappingAdapter();
			}
			@Override
			public Adapter caseEEnumMapping(EEnumMapping object) {
				return createEEnumMappingAdapter();
			}
			@Override
			public Adapter caseEEnumLiteralMapping(EEnumLiteralMapping object) {
				return createEEnumLiteralMappingAdapter();
			}
			@Override
			public Adapter caseNameTypePatternFMS(NameTypePatternFMS object) {
				return createNameTypePatternFMSAdapter();
			}
			@Override
			public Adapter caseMemberPattern(MemberPattern object) {
				return createMemberPatternAdapter();
			}
			@Override
			public Adapter caseNameTypePattern(NameTypePattern object) {
				return createNameTypePatternAdapter();
			}
			@Override
			public Adapter caseTypeListPattern(TypeListPattern object) {
				return createTypeListPatternAdapter();
			}
			@Override
			public Adapter caseFeatureMappingStrategyPattern(FeatureMappingStrategyPattern object) {
				return createFeatureMappingStrategyPatternAdapter();
			}
			@Override
			public Adapter caseFeatureMappingStrategyMethodPattern(FeatureMappingStrategyMethodPattern object) {
				return createFeatureMappingStrategyMethodPatternAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.DefaultName <em>Default Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.DefaultName
	 * @generated
	 */
	public Adapter createDefaultNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.InterfaceImplementation <em>Interface Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.InterfaceImplementation
	 * @generated
	 */
	public Adapter createInterfaceImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.InterfaceMethodImplementation <em>Interface Method Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.InterfaceMethodImplementation
	 * @generated
	 */
	public Adapter createInterfaceMethodImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.EClassMapping <em>EClass Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.EClassMapping
	 * @generated
	 */
	public Adapter createEClassMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.LifeCycleImplementation <em>Life Cycle Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.LifeCycleImplementation
	 * @generated
	 */
	public Adapter createLifeCycleImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.EventHandler
	 * @generated
	 */
	public Adapter createEventHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.EFeatureMapping <em>EFeature Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.EFeatureMapping
	 * @generated
	 */
	public Adapter createEFeatureMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.EFeatureMappingOptions <em>EFeature Mapping Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.EFeatureMappingOptions
	 * @generated
	 */
	public Adapter createEFeatureMappingOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.EEnumMapping <em>EEnum Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.EEnumMapping
	 * @generated
	 */
	public Adapter createEEnumMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.EEnumLiteralMapping <em>EEnum Literal Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.EEnumLiteralMapping
	 * @generated
	 */
	public Adapter createEEnumLiteralMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.EDataTypeMapping <em>EData Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.EDataTypeMapping
	 * @generated
	 */
	public Adapter createEDataTypeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategy <em>Feature Mapping Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategy
	 * @generated
	 */
	public Adapter createFeatureMappingStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.NameTypePatternFMS <em>Name Type Pattern FMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.NameTypePatternFMS
	 * @generated
	 */
	public Adapter createNameTypePatternFMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.NameTypePattern <em>Name Type Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.NameTypePattern
	 * @generated
	 */
	public Adapter createNameTypePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.FacadeModel <em>Facade Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.FacadeModel
	 * @generated
	 */
	public Adapter createFacadeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.ImportDirective <em>Import Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.ImportDirective
	 * @generated
	 */
	public Adapter createImportDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.EClassifierMapping <em>EClassifier Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.EClassifierMapping
	 * @generated
	 */
	public Adapter createEClassifierMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.MemberPattern <em>Member Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.MemberPattern
	 * @generated
	 */
	public Adapter createMemberPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.TypeListPattern <em>Type List Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.TypeListPattern
	 * @generated
	 */
	public Adapter createTypeListPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern <em>Feature Mapping Strategy Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern
	 * @generated
	 */
	public Adapter createFeatureMappingStrategyPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern <em>Feature Mapping Strategy Method Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern
	 * @generated
	 */
	public Adapter createFeatureMappingStrategyMethodPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EmfacadeAdapterFactory
