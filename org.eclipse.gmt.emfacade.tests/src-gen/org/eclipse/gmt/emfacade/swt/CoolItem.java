/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import org.eclipse.swt.graphics.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cool Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.CoolItem#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.CoolItem#getControl <em>Control</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.CoolItem#getMinimumSize <em>Minimum Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.CoolItem#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.CoolItem#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCoolItem()
 * @model
 * @generated
 */
public interface CoolItem extends Item
{
  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.swt.CoolBar#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CoolBar)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCoolItem_Parent()
	 * @see org.eclipse.gmt.emfacade.swt.CoolBar#getItems
	 * @model opposite="items" transient="false"
	 * @generated
	 */
  CoolBar getParent();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(CoolBar value);

  /**
	 * Returns the value of the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference.
	 * @see #setControl(Control)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCoolItem_Control()
	 * @model
	 * @generated
	 */
  Control getControl();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getControl <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' reference.
	 * @see #getControl()
	 * @generated
	 */
  void setControl(Control value);

  /**
	 * Returns the value of the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Size</em>' attribute.
	 * @see #setMinimumSize(Point)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCoolItem_MinimumSize()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.swt.Point"
	 * @generated
	 */
  Point getMinimumSize();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getMinimumSize <em>Minimum Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Size</em>' attribute.
	 * @see #getMinimumSize()
	 * @generated
	 */
  void setMinimumSize(Point value);

  /**
	 * Returns the value of the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preferred Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Size</em>' attribute.
	 * @see #setPreferredSize(Point)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCoolItem_PreferredSize()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.swt.Point"
	 * @generated
	 */
  Point getPreferredSize();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getPreferredSize <em>Preferred Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Size</em>' attribute.
	 * @see #getPreferredSize()
	 * @generated
	 */
  void setPreferredSize(Point value);

  /**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Point)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getCoolItem_Size()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.swt.Point"
	 * @generated
	 */
  Point getSize();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
  void setSize(Point value);

} // CoolItem
