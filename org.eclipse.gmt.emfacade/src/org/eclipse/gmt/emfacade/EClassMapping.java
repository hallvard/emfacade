/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.EClassMapping#getEClass <em>EClass</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EClassMapping#getJClass <em>JClass</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EClassMapping#getCreateExpression <em>Create Expression</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EClassMapping#getLifeCycleHandler <em>Life Cycle Handler</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EClassMapping#getDisposeExpression <em>Dispose Expression</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EClassMapping#getFeatureMappings <em>Feature Mappings</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EClassMapping#getFeatureMappingDefaults <em>Feature Mapping Defaults</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EClassMapping#getEventHandlers <em>Event Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassMapping()
 * @model
 * @generated
 */
public interface EClassMapping extends EClassifierMapping {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassMapping_EClass()
	 * @model
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EClassMapping#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

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
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassMapping_JClass()
	 * @model
	 * @generated
	 */
	JvmGenericType getJClass();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EClassMapping#getJClass <em>JClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JClass</em>' reference.
	 * @see #getJClass()
	 * @generated
	 */
	void setJClass(JvmGenericType value);

	/**
	 * Returns the value of the '<em><b>Create Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Expression</em>' containment reference.
	 * @see #setCreateExpression(XExpression)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassMapping_CreateExpression()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getCreateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EClassMapping#getCreateExpression <em>Create Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Expression</em>' containment reference.
	 * @see #getCreateExpression()
	 * @generated
	 */
	void setCreateExpression(XExpression value);

	/**
	 * Returns the value of the '<em><b>Life Cycle Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Life Cycle Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Cycle Handler</em>' containment reference.
	 * @see #setLifeCycleHandler(LifeCycleImplementation)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassMapping_LifeCycleHandler()
	 * @model containment="true"
	 * @generated
	 */
	LifeCycleImplementation getLifeCycleHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EClassMapping#getLifeCycleHandler <em>Life Cycle Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle Handler</em>' containment reference.
	 * @see #getLifeCycleHandler()
	 * @generated
	 */
	void setLifeCycleHandler(LifeCycleImplementation value);

	/**
	 * Returns the value of the '<em><b>Dispose Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispose Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispose Expression</em>' containment reference.
	 * @see #setDisposeExpression(XExpression)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassMapping_DisposeExpression()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getDisposeExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EClassMapping#getDisposeExpression <em>Dispose Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispose Expression</em>' containment reference.
	 * @see #getDisposeExpression()
	 * @generated
	 */
	void setDisposeExpression(XExpression value);

	/**
	 * Returns the value of the '<em><b>Feature Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.EFeatureMapping}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.EFeatureMapping#getEClassMapping <em>EClass Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Mappings</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassMapping_FeatureMappings()
	 * @see org.eclipse.gmt.emfacade.EFeatureMapping#getEClassMapping
	 * @model opposite="eClassMapping" containment="true"
	 * @generated
	 */
	EList<EFeatureMapping> getFeatureMappings();

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
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassMapping_FeatureMappingDefaults()
	 * @model containment="true"
	 * @generated
	 */
	EFeatureMappingOptions getFeatureMappingDefaults();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EClassMapping#getFeatureMappingDefaults <em>Feature Mapping Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Mapping Defaults</em>' containment reference.
	 * @see #getFeatureMappingDefaults()
	 * @generated
	 */
	void setFeatureMappingDefaults(EFeatureMappingOptions value);

	/**
	 * Returns the value of the '<em><b>Event Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.EventHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Handlers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Handlers</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassMapping_EventHandlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventHandler> getEventHandlers();

} // EClassMapping
