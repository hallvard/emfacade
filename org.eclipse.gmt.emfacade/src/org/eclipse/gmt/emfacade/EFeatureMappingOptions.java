/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFeature Mapping Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.EFeatureMappingOptions#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEFeatureMappingOptions()
 * @model
 * @generated
 */
public interface EFeatureMappingOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' reference.
	 * @see #setStrategy(FeatureMappingStrategy)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEFeatureMappingOptions_Strategy()
	 * @model
	 * @generated
	 */
	FeatureMappingStrategy getStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EFeatureMappingOptions#getStrategy <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(FeatureMappingStrategy value);

} // EFeatureMappingOptions
