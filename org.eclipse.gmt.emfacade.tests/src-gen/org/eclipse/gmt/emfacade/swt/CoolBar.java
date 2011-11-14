/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cool Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.CoolBar#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.CoolBar#getOrientationStyle <em>Orientation Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCoolBar()
 * @model
 * @generated
 */
public interface CoolBar extends AbstractComposite<Control>
{
  /**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.swt.CoolItem}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCoolBar_Items()
	 * @see org.eclipse.gmt.emfacade.swt.CoolItem#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
  EList<CoolItem> getItems();

  /**
	 * Returns the value of the '<em><b>Orientation Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.OrientationStyle}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.OrientationStyle
	 * @see #setOrientationStyle(OrientationStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCoolBar_OrientationStyle()
	 * @model unique="false"
	 * @generated
	 */
  OrientationStyle getOrientationStyle();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.CoolBar#getOrientationStyle <em>Orientation Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.OrientationStyle
	 * @see #getOrientationStyle()
	 * @generated
	 */
  void setOrientationStyle(OrientationStyle value);

} // CoolBar
