/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#getOrientationStyle <em>Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginHeight <em>Margin Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#isWrap <em>Wrap</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#isPack <em>Pack</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#isFill <em>Fill</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#isCenter <em>Center</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#isJustify <em>Justify</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginBottom <em>Margin Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout()
 * @model
 * @generated
 */
public interface RowLayout extends Layout<RowData> {
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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_OrientationStyle()
	 * @model unique="false"
	 * @generated
	 */
	OrientationStyle getOrientationStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getOrientationStyle <em>Orientation Style</em>}' attribute.
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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_MarginWidth()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMarginWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginWidth <em>Margin Width</em>}' attribute.
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
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_MarginHeight()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMarginHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginHeight <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Height</em>' attribute.
	 * @see #getMarginHeight()
	 * @generated
	 */
	void setMarginHeight(int value);

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see #setSpacing(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_Spacing()
	 * @model default="3" unique="false"
	 * @generated
	 */
	int getSpacing();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getSpacing <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing</em>' attribute.
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(int value);

	/**
	 * Returns the value of the '<em><b>Wrap</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap</em>' attribute.
	 * @see #setWrap(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_Wrap()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isWrap();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isWrap <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap</em>' attribute.
	 * @see #isWrap()
	 * @generated
	 */
	void setWrap(boolean value);

	/**
	 * Returns the value of the '<em><b>Pack</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pack</em>' attribute.
	 * @see #setPack(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_Pack()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isPack();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isPack <em>Pack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pack</em>' attribute.
	 * @see #isPack()
	 * @generated
	 */
	void setPack(boolean value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #setFill(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_Fill()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' attribute.
	 * @see #setCenter(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_Center()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isCenter <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' attribute.
	 * @see #isCenter()
	 * @generated
	 */
	void setCenter(boolean value);

	/**
	 * Returns the value of the '<em><b>Justify</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify</em>' attribute.
	 * @see #setJustify(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_Justify()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isJustify();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isJustify <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify</em>' attribute.
	 * @see #isJustify()
	 * @generated
	 */
	void setJustify(boolean value);

	/**
	 * Returns the value of the '<em><b>Margin Left</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Left</em>' attribute.
	 * @see #setMarginLeft(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_MarginLeft()
	 * @model default="3" unique="false"
	 * @generated
	 */
	int getMarginLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginLeft <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Left</em>' attribute.
	 * @see #getMarginLeft()
	 * @generated
	 */
	void setMarginLeft(int value);

	/**
	 * Returns the value of the '<em><b>Margin Top</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Top</em>' attribute.
	 * @see #setMarginTop(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_MarginTop()
	 * @model default="3" unique="false"
	 * @generated
	 */
	int getMarginTop();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginTop <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Top</em>' attribute.
	 * @see #getMarginTop()
	 * @generated
	 */
	void setMarginTop(int value);

	/**
	 * Returns the value of the '<em><b>Margin Right</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Right</em>' attribute.
	 * @see #setMarginRight(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_MarginRight()
	 * @model default="3" unique="false"
	 * @generated
	 */
	int getMarginRight();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginRight <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Right</em>' attribute.
	 * @see #getMarginRight()
	 * @generated
	 */
	void setMarginRight(int value);

	/**
	 * Returns the value of the '<em><b>Margin Bottom</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Bottom</em>' attribute.
	 * @see #setMarginBottom(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getRowLayout_MarginBottom()
	 * @model default="3" unique="false"
	 * @generated
	 */
	int getMarginBottom();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginBottom <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Bottom</em>' attribute.
	 * @see #getMarginBottom()
	 * @generated
	 */
	void setMarginBottom(int value);

} // RowLayout
