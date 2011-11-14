/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.XExpression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EData Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.EDataTypeMapping#getEDataType <em>EData Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EDataTypeMapping#getJClass <em>JClass</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.EDataTypeMapping#getConvertExpression <em>Convert Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEDataTypeMapping()
 * @model
 * @generated
 */
public interface EDataTypeMapping extends EClassifierMapping {

	/**
	 * Returns the value of the '<em><b>EData Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EData Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EData Type</em>' reference.
	 * @see #setEDataType(EDataType)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEDataTypeMapping_EDataType()
	 * @model
	 * @generated
	 */
	EDataType getEDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EDataTypeMapping#getEDataType <em>EData Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EData Type</em>' reference.
	 * @see #getEDataType()
	 * @generated
	 */
	void setEDataType(EDataType value);

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
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEDataTypeMapping_JClass()
	 * @model
	 * @generated
	 */
	JvmGenericType getJClass();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EDataTypeMapping#getJClass <em>JClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JClass</em>' reference.
	 * @see #getJClass()
	 * @generated
	 */
	void setJClass(JvmGenericType value);

	/**
	 * Returns the value of the '<em><b>Convert Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert Expression</em>' containment reference.
	 * @see #setConvertExpression(XExpression)
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEDataTypeMapping_ConvertExpression()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getConvertExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.EDataTypeMapping#getConvertExpression <em>Convert Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convert Expression</em>' containment reference.
	 * @see #getConvertExpression()
	 * @generated
	 */
	void setConvertExpression(XExpression value);
} // EDataTypeMapping
