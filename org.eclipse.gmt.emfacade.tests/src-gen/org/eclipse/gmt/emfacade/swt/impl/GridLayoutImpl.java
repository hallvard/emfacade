/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.emfacade.swt.GridData;
import org.eclipse.gmt.emfacade.swt.GridLayout;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#getNumColumns <em>Num Columns</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#getMarginHeight <em>Margin Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridLayoutImpl extends LayoutImpl<GridData> implements GridLayout
{
  /**
	 * The default value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
  protected static final int NUM_COLUMNS_EDEFAULT = 1;

  /**
	 * The cached value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
  protected int numColumns = NUM_COLUMNS_EDEFAULT;

  /**
	 * The default value of the '{@link #isMakeColumnsEqualWidth() <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isMakeColumnsEqualWidth()
	 * @generated
	 * @ordered
	 */
  protected static final boolean MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isMakeColumnsEqualWidth() <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isMakeColumnsEqualWidth()
	 * @generated
	 * @ordered
	 */
  protected boolean makeColumnsEqualWidth = MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getMarginWidth() <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginWidth()
	 * @generated
	 * @ordered
	 */
  protected static final int MARGIN_WIDTH_EDEFAULT = 5;

  /**
	 * The cached value of the '{@link #getMarginWidth() <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginWidth()
	 * @generated
	 * @ordered
	 */
  protected int marginWidth = MARGIN_WIDTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getMarginHeight() <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginHeight()
	 * @generated
	 * @ordered
	 */
  protected static final int MARGIN_HEIGHT_EDEFAULT = 5;

  /**
	 * The cached value of the '{@link #getMarginHeight() <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginHeight()
	 * @generated
	 * @ordered
	 */
  protected int marginHeight = MARGIN_HEIGHT_EDEFAULT;

  /**
	 * The default value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
  protected static final int MARGIN_LEFT_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
  protected int marginLeft = MARGIN_LEFT_EDEFAULT;

  /**
	 * The default value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
  protected static final int MARGIN_TOP_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
  protected int marginTop = MARGIN_TOP_EDEFAULT;

  /**
	 * The default value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
  protected static final int MARGIN_RIGHT_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
  protected int marginRight = MARGIN_RIGHT_EDEFAULT;

  /**
	 * The default value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
  protected static final int MARGIN_BOTTOM_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
  protected int marginBottom = MARGIN_BOTTOM_EDEFAULT;

  /**
	 * The default value of the '{@link #getHorizontalSpacing() <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHorizontalSpacing()
	 * @generated
	 * @ordered
	 */
  protected static final int HORIZONTAL_SPACING_EDEFAULT = 5;

  /**
	 * The cached value of the '{@link #getHorizontalSpacing() <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHorizontalSpacing()
	 * @generated
	 * @ordered
	 */
  protected int horizontalSpacing = HORIZONTAL_SPACING_EDEFAULT;

  /**
	 * The default value of the '{@link #getVerticalSpacing() <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVerticalSpacing()
	 * @generated
	 * @ordered
	 */
  protected static final int VERTICAL_SPACING_EDEFAULT = 5;

  /**
	 * The cached value of the '{@link #getVerticalSpacing() <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVerticalSpacing()
	 * @generated
	 * @ordered
	 */
  protected int verticalSpacing = VERTICAL_SPACING_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected GridLayoutImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SwtPackage.Literals.GRID_LAYOUT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getNumColumns()
  {
		return numColumns;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNumColumns(int newNumColumns)
  {
		int oldNumColumns = numColumns;
		numColumns = newNumColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__NUM_COLUMNS, oldNumColumns, numColumns));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isMakeColumnsEqualWidth()
  {
		return makeColumnsEqualWidth;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMakeColumnsEqualWidth(boolean newMakeColumnsEqualWidth)
  {
		boolean oldMakeColumnsEqualWidth = makeColumnsEqualWidth;
		makeColumnsEqualWidth = newMakeColumnsEqualWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH, oldMakeColumnsEqualWidth, makeColumnsEqualWidth));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMarginWidth()
  {
		return marginWidth;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMarginWidth(int newMarginWidth)
  {
		int oldMarginWidth = marginWidth;
		marginWidth = newMarginWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__MARGIN_WIDTH, oldMarginWidth, marginWidth));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMarginHeight()
  {
		return marginHeight;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMarginHeight(int newMarginHeight)
  {
		int oldMarginHeight = marginHeight;
		marginHeight = newMarginHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__MARGIN_HEIGHT, oldMarginHeight, marginHeight));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMarginLeft()
  {
		return marginLeft;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMarginLeft(int newMarginLeft)
  {
		int oldMarginLeft = marginLeft;
		marginLeft = newMarginLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__MARGIN_LEFT, oldMarginLeft, marginLeft));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMarginTop()
  {
		return marginTop;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMarginTop(int newMarginTop)
  {
		int oldMarginTop = marginTop;
		marginTop = newMarginTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__MARGIN_TOP, oldMarginTop, marginTop));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMarginRight()
  {
		return marginRight;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMarginRight(int newMarginRight)
  {
		int oldMarginRight = marginRight;
		marginRight = newMarginRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__MARGIN_RIGHT, oldMarginRight, marginRight));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMarginBottom()
  {
		return marginBottom;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMarginBottom(int newMarginBottom)
  {
		int oldMarginBottom = marginBottom;
		marginBottom = newMarginBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__MARGIN_BOTTOM, oldMarginBottom, marginBottom));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getHorizontalSpacing()
  {
		return horizontalSpacing;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHorizontalSpacing(int newHorizontalSpacing)
  {
		int oldHorizontalSpacing = horizontalSpacing;
		horizontalSpacing = newHorizontalSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__HORIZONTAL_SPACING, oldHorizontalSpacing, horizontalSpacing));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getVerticalSpacing()
  {
		return verticalSpacing;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVerticalSpacing(int newVerticalSpacing)
  {
		int oldVerticalSpacing = verticalSpacing;
		verticalSpacing = newVerticalSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_LAYOUT__VERTICAL_SPACING, oldVerticalSpacing, verticalSpacing));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SwtPackage.GRID_LAYOUT__NUM_COLUMNS:
				return getNumColumns();
			case SwtPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				return isMakeColumnsEqualWidth();
			case SwtPackage.GRID_LAYOUT__MARGIN_WIDTH:
				return getMarginWidth();
			case SwtPackage.GRID_LAYOUT__MARGIN_HEIGHT:
				return getMarginHeight();
			case SwtPackage.GRID_LAYOUT__MARGIN_LEFT:
				return getMarginLeft();
			case SwtPackage.GRID_LAYOUT__MARGIN_TOP:
				return getMarginTop();
			case SwtPackage.GRID_LAYOUT__MARGIN_RIGHT:
				return getMarginRight();
			case SwtPackage.GRID_LAYOUT__MARGIN_BOTTOM:
				return getMarginBottom();
			case SwtPackage.GRID_LAYOUT__HORIZONTAL_SPACING:
				return getHorizontalSpacing();
			case SwtPackage.GRID_LAYOUT__VERTICAL_SPACING:
				return getVerticalSpacing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SwtPackage.GRID_LAYOUT__NUM_COLUMNS:
				setNumColumns((Integer)newValue);
				return;
			case SwtPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				setMakeColumnsEqualWidth((Boolean)newValue);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_WIDTH:
				setMarginWidth((Integer)newValue);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_HEIGHT:
				setMarginHeight((Integer)newValue);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_LEFT:
				setMarginLeft((Integer)newValue);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_TOP:
				setMarginTop((Integer)newValue);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_RIGHT:
				setMarginRight((Integer)newValue);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_BOTTOM:
				setMarginBottom((Integer)newValue);
				return;
			case SwtPackage.GRID_LAYOUT__HORIZONTAL_SPACING:
				setHorizontalSpacing((Integer)newValue);
				return;
			case SwtPackage.GRID_LAYOUT__VERTICAL_SPACING:
				setVerticalSpacing((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case SwtPackage.GRID_LAYOUT__NUM_COLUMNS:
				setNumColumns(NUM_COLUMNS_EDEFAULT);
				return;
			case SwtPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				setMakeColumnsEqualWidth(MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_WIDTH:
				setMarginWidth(MARGIN_WIDTH_EDEFAULT);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_HEIGHT:
				setMarginHeight(MARGIN_HEIGHT_EDEFAULT);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_LEFT:
				setMarginLeft(MARGIN_LEFT_EDEFAULT);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_TOP:
				setMarginTop(MARGIN_TOP_EDEFAULT);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_RIGHT:
				setMarginRight(MARGIN_RIGHT_EDEFAULT);
				return;
			case SwtPackage.GRID_LAYOUT__MARGIN_BOTTOM:
				setMarginBottom(MARGIN_BOTTOM_EDEFAULT);
				return;
			case SwtPackage.GRID_LAYOUT__HORIZONTAL_SPACING:
				setHorizontalSpacing(HORIZONTAL_SPACING_EDEFAULT);
				return;
			case SwtPackage.GRID_LAYOUT__VERTICAL_SPACING:
				setVerticalSpacing(VERTICAL_SPACING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case SwtPackage.GRID_LAYOUT__NUM_COLUMNS:
				return numColumns != NUM_COLUMNS_EDEFAULT;
			case SwtPackage.GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				return makeColumnsEqualWidth != MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT;
			case SwtPackage.GRID_LAYOUT__MARGIN_WIDTH:
				return marginWidth != MARGIN_WIDTH_EDEFAULT;
			case SwtPackage.GRID_LAYOUT__MARGIN_HEIGHT:
				return marginHeight != MARGIN_HEIGHT_EDEFAULT;
			case SwtPackage.GRID_LAYOUT__MARGIN_LEFT:
				return marginLeft != MARGIN_LEFT_EDEFAULT;
			case SwtPackage.GRID_LAYOUT__MARGIN_TOP:
				return marginTop != MARGIN_TOP_EDEFAULT;
			case SwtPackage.GRID_LAYOUT__MARGIN_RIGHT:
				return marginRight != MARGIN_RIGHT_EDEFAULT;
			case SwtPackage.GRID_LAYOUT__MARGIN_BOTTOM:
				return marginBottom != MARGIN_BOTTOM_EDEFAULT;
			case SwtPackage.GRID_LAYOUT__HORIZONTAL_SPACING:
				return horizontalSpacing != HORIZONTAL_SPACING_EDEFAULT;
			case SwtPackage.GRID_LAYOUT__VERTICAL_SPACING:
				return verticalSpacing != VERTICAL_SPACING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numColumns: ");
		result.append(numColumns);
		result.append(", makeColumnsEqualWidth: ");
		result.append(makeColumnsEqualWidth);
		result.append(", marginWidth: ");
		result.append(marginWidth);
		result.append(", marginHeight: ");
		result.append(marginHeight);
		result.append(", marginLeft: ");
		result.append(marginLeft);
		result.append(", marginTop: ");
		result.append(marginTop);
		result.append(", marginRight: ");
		result.append(marginRight);
		result.append(", marginBottom: ");
		result.append(marginBottom);
		result.append(", horizontalSpacing: ");
		result.append(horizontalSpacing);
		result.append(", verticalSpacing: ");
		result.append(verticalSpacing);
		result.append(')');
		return result.toString();
	}

} //GridLayoutImpl
