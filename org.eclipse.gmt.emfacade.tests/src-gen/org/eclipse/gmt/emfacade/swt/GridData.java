/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getWidthHint <em>Width Hint</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getHeightHint <em>Height Hint</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getHorizontalIndent <em>Horizontal Indent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getVerticalIndent <em>Vertical Indent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getHorizontalSpan <em>Horizontal Span</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getVerticalSpan <em>Vertical Span</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getMinimumWidth <em>Minimum Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#getMinimumHeight <em>Minimum Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.GridData#isExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData()
 * @model
 * @generated
 */
public interface GridData extends LayoutData
{
  /**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle
	 * @see #setVerticalAlignment(VerticalAlignmentStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_VerticalAlignment()
	 * @model unique="false"
	 * @generated
	 */
  VerticalAlignmentStyle getVerticalAlignment();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle
	 * @see #getVerticalAlignment()
	 * @generated
	 */
  void setVerticalAlignment(VerticalAlignmentStyle value);

  /**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horizontal Alignment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle
	 * @see #setHorizontalAlignment(HorizontalAlignmentStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_HorizontalAlignment()
	 * @model unique="false"
	 * @generated
	 */
  HorizontalAlignmentStyle getHorizontalAlignment();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
  void setHorizontalAlignment(HorizontalAlignmentStyle value);

  /**
	 * Returns the value of the '<em><b>Width Hint</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width Hint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Hint</em>' attribute.
	 * @see #setWidthHint(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_WidthHint()
	 * @model default="-1" unique="false"
	 * @generated
	 */
  int getWidthHint();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getWidthHint <em>Width Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Hint</em>' attribute.
	 * @see #getWidthHint()
	 * @generated
	 */
  void setWidthHint(int value);

  /**
	 * Returns the value of the '<em><b>Height Hint</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height Hint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Height Hint</em>' attribute.
	 * @see #setHeightHint(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_HeightHint()
	 * @model default="-1" unique="false"
	 * @generated
	 */
  int getHeightHint();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getHeightHint <em>Height Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Hint</em>' attribute.
	 * @see #getHeightHint()
	 * @generated
	 */
  void setHeightHint(int value);

  /**
	 * Returns the value of the '<em><b>Horizontal Indent</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horizontal Indent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Indent</em>' attribute.
	 * @see #setHorizontalIndent(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_HorizontalIndent()
	 * @model default="0" unique="false"
	 * @generated
	 */
  int getHorizontalIndent();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getHorizontalIndent <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Indent</em>' attribute.
	 * @see #getHorizontalIndent()
	 * @generated
	 */
  void setHorizontalIndent(int value);

  /**
	 * Returns the value of the '<em><b>Vertical Indent</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertical Indent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Indent</em>' attribute.
	 * @see #setVerticalIndent(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_VerticalIndent()
	 * @model default="0" unique="false"
	 * @generated
	 */
  int getVerticalIndent();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getVerticalIndent <em>Vertical Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Indent</em>' attribute.
	 * @see #getVerticalIndent()
	 * @generated
	 */
  void setVerticalIndent(int value);

  /**
	 * Returns the value of the '<em><b>Horizontal Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horizontal Span</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Span</em>' attribute.
	 * @see #setHorizontalSpan(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_HorizontalSpan()
	 * @model default="1" unique="false"
	 * @generated
	 */
  int getHorizontalSpan();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getHorizontalSpan <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Span</em>' attribute.
	 * @see #getHorizontalSpan()
	 * @generated
	 */
  void setHorizontalSpan(int value);

  /**
	 * Returns the value of the '<em><b>Vertical Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertical Span</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Span</em>' attribute.
	 * @see #setVerticalSpan(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_VerticalSpan()
	 * @model default="1" unique="false"
	 * @generated
	 */
  int getVerticalSpan();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getVerticalSpan <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Span</em>' attribute.
	 * @see #getVerticalSpan()
	 * @generated
	 */
  void setVerticalSpan(int value);

  /**
	 * Returns the value of the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grab Excess Horizontal Space</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Excess Horizontal Space</em>' attribute.
	 * @see #setGrabExcessHorizontalSpace(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_GrabExcessHorizontalSpace()
	 * @model default="false" unique="false"
	 * @generated
	 */
  boolean isGrabExcessHorizontalSpace();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Excess Horizontal Space</em>' attribute.
	 * @see #isGrabExcessHorizontalSpace()
	 * @generated
	 */
  void setGrabExcessHorizontalSpace(boolean value);

  /**
	 * Returns the value of the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grab Excess Vertical Space</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Excess Vertical Space</em>' attribute.
	 * @see #setGrabExcessVerticalSpace(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_GrabExcessVerticalSpace()
	 * @model default="false" unique="false"
	 * @generated
	 */
  boolean isGrabExcessVerticalSpace();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Excess Vertical Space</em>' attribute.
	 * @see #isGrabExcessVerticalSpace()
	 * @generated
	 */
  void setGrabExcessVerticalSpace(boolean value);

  /**
	 * Returns the value of the '<em><b>Minimum Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Width</em>' attribute.
	 * @see #setMinimumWidth(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_MinimumWidth()
	 * @model default="0" unique="false"
	 * @generated
	 */
  int getMinimumWidth();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getMinimumWidth <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Width</em>' attribute.
	 * @see #getMinimumWidth()
	 * @generated
	 */
  void setMinimumWidth(int value);

  /**
	 * Returns the value of the '<em><b>Minimum Height</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Height</em>' attribute.
	 * @see #setMinimumHeight(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_MinimumHeight()
	 * @model default="0" unique="false"
	 * @generated
	 */
  int getMinimumHeight();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#getMinimumHeight <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Height</em>' attribute.
	 * @see #getMinimumHeight()
	 * @generated
	 */
  void setMinimumHeight(int value);

  /**
	 * Returns the value of the '<em><b>Exclude</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' attribute.
	 * @see #setExclude(boolean)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getGridData_Exclude()
	 * @model default="false" unique="false"
	 * @generated
	 */
  boolean isExclude();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.GridData#isExclude <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' attribute.
	 * @see #isExclude()
	 * @generated
	 */
  void setExclude(boolean value);

} // GridData
