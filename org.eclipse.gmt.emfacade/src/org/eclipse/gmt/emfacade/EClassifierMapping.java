/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClassifier Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEClassifierMapping()
 * @model
 * @generated
 */
public interface EClassifierMapping extends DefaultName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EClassifier getEClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	JvmDeclaredType getDeclaredType();

} // EClassifierMapping
