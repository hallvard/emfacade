/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FillLayout#getOrientationStyle <em>Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FillLayout#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FillLayout#getMarginHeight <em>Margin Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FillLayout#getSpacing <em>Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFillLayout()
 * @model
 * @generated
 */
public interface FillLayout extends Layout<LayoutData>
{
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
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFillLayout_OrientationStyle()
   * @model unique="false"
   * @generated
   */
  OrientationStyle getOrientationStyle();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FillLayout#getOrientationStyle <em>Orientation Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation Style</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.OrientationStyle
   * @see #getOrientationStyle()
   * @generated
   */
  void setOrientationStyle(OrientationStyle value);

  /**
   * Returns the value of the '<em><b>Margin Width</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Width</em>' attribute.
   * @see #setMarginWidth(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFillLayout_MarginWidth()
   * @model default="0" unique="false"
   * @generated
   */
  int getMarginWidth();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FillLayout#getMarginWidth <em>Margin Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Width</em>' attribute.
   * @see #getMarginWidth()
   * @generated
   */
  void setMarginWidth(int value);

  /**
   * Returns the value of the '<em><b>Margin Height</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Margin Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Margin Height</em>' attribute.
   * @see #setMarginHeight(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFillLayout_MarginHeight()
   * @model default="0" unique="false"
   * @generated
   */
  int getMarginHeight();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FillLayout#getMarginHeight <em>Margin Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Margin Height</em>' attribute.
   * @see #getMarginHeight()
   * @generated
   */
  void setMarginHeight(int value);

  /**
   * Returns the value of the '<em><b>Spacing</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spacing</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spacing</em>' attribute.
   * @see #setSpacing(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFillLayout_Spacing()
   * @model default="0" unique="false"
   * @generated
   */
  int getSpacing();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FillLayout#getSpacing <em>Spacing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spacing</em>' attribute.
   * @see #getSpacing()
   * @generated
   */
  void setSpacing(int value);

} // FillLayout
