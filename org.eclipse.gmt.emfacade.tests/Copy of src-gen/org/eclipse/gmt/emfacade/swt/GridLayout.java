/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#getNumColumns <em>Num Columns</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginHeight <em>Margin Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridLayout#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout()
 * @model
 * @generated
 */
public interface GridLayout extends Layout<GridData> {
	/**
	 * Returns the value of the '<em><b>Num Columns</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Columns</em>' attribute.
	 * @see #setNumColumns(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_NumColumns()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getNumColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getNumColumns <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Columns</em>' attribute.
	 * @see #getNumColumns()
	 * @generated
	 */
	void setNumColumns(int value);

	/**
	 * Returns the value of the '<em><b>Make Columns Equal Width</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make Columns Equal Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make Columns Equal Width</em>' attribute.
	 * @see #setMakeColumnsEqualWidth(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_MakeColumnsEqualWidth()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isMakeColumnsEqualWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make Columns Equal Width</em>' attribute.
	 * @see #isMakeColumnsEqualWidth()
	 * @generated
	 */
	void setMakeColumnsEqualWidth(boolean value);

	/**
	 * Returns the value of the '<em><b>Margin Width</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Width</em>' attribute.
	 * @see #setMarginWidth(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_MarginWidth()
	 * @model default="5" unique="false"
	 * @generated
	 */
	int getMarginWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginWidth <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Width</em>' attribute.
	 * @see #getMarginWidth()
	 * @generated
	 */
	void setMarginWidth(int value);

	/**
	 * Returns the value of the '<em><b>Margin Height</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Height</em>' attribute.
	 * @see #setMarginHeight(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_MarginHeight()
	 * @model default="5" unique="false"
	 * @generated
	 */
	int getMarginHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginHeight <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Height</em>' attribute.
	 * @see #getMarginHeight()
	 * @generated
	 */
	void setMarginHeight(int value);

	/**
	 * Returns the value of the '<em><b>Margin Left</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Left</em>' attribute.
	 * @see #setMarginLeft(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_MarginLeft()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMarginLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginLeft <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Left</em>' attribute.
	 * @see #getMarginLeft()
	 * @generated
	 */
	void setMarginLeft(int value);

	/**
	 * Returns the value of the '<em><b>Margin Top</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Top</em>' attribute.
	 * @see #setMarginTop(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_MarginTop()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMarginTop();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginTop <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Top</em>' attribute.
	 * @see #getMarginTop()
	 * @generated
	 */
	void setMarginTop(int value);

	/**
	 * Returns the value of the '<em><b>Margin Right</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Right</em>' attribute.
	 * @see #setMarginRight(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_MarginRight()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMarginRight();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginRight <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Right</em>' attribute.
	 * @see #getMarginRight()
	 * @generated
	 */
	void setMarginRight(int value);

	/**
	 * Returns the value of the '<em><b>Margin Bottom</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Bottom</em>' attribute.
	 * @see #setMarginBottom(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_MarginBottom()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMarginBottom();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginBottom <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Bottom</em>' attribute.
	 * @see #getMarginBottom()
	 * @generated
	 */
	void setMarginBottom(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal Spacing</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Spacing</em>' attribute.
	 * @see #setHorizontalSpacing(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_HorizontalSpacing()
	 * @model default="5" unique="false"
	 * @generated
	 */
	int getHorizontalSpacing();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getHorizontalSpacing <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Spacing</em>' attribute.
	 * @see #getHorizontalSpacing()
	 * @generated
	 */
	void setHorizontalSpacing(int value);

	/**
	 * Returns the value of the '<em><b>Vertical Spacing</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Spacing</em>' attribute.
	 * @see #setVerticalSpacing(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridLayout_VerticalSpacing()
	 * @model default="5" unique="false"
	 * @generated
	 */
	int getVerticalSpacing();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getVerticalSpacing <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Spacing</em>' attribute.
	 * @see #getVerticalSpacing()
	 * @generated
	 */
	void setVerticalSpacing(int value);

} // GridLayout
