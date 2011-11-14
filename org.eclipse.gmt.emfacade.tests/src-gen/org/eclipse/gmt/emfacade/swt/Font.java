/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Font#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Font#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Font#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFont()
 * @model
 * @generated
 */
public interface Font extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFont_Name()
	 * @model unique="false"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Font#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFont_Style()
	 * @model unique="false"
	 * @generated
	 */
  int getStyle();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Font#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
  void setStyle(int value);

  /**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFont_Height()
	 * @model unique="false"
	 * @generated
	 */
  int getHeight();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Font#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
  void setHeight(int value);

} // Font
