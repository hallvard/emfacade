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
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.RowData;
import org.eclipse.gmt.emfacade.swt.RowLayout;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#getOrientationStyle <em>Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#getMarginHeight <em>Margin Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#isWrap <em>Wrap</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#isPack <em>Pack</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#isCenter <em>Center</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#isJustify <em>Justify</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RowLayoutImpl extends LayoutImpl<RowData> implements RowLayout {
	/**
	 * The default value of the '{@link #getOrientationStyle() <em>Orientation Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationStyle()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationStyle ORIENTATION_STYLE_EDEFAULT = OrientationStyle.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getOrientationStyle() <em>Orientation Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationStyle()
	 * @generated
	 * @ordered
	 */
	protected OrientationStyle orientationStyle = ORIENTATION_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginWidth() <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_WIDTH_EDEFAULT = 0;

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
	protected static final int MARGIN_HEIGHT_EDEFAULT = 0;

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
	 * The default value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final int SPACING_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected int spacing = SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #isWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrap()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRAP_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrap()
	 * @generated
	 * @ordered
	 */
	protected boolean wrap = WRAP_EDEFAULT;

	/**
	 * The default value of the '{@link #isPack() <em>Pack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PACK_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPack() <em>Pack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPack()
	 * @generated
	 * @ordered
	 */
	protected boolean pack = PACK_EDEFAULT;

	/**
	 * The default value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected boolean fill = FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #isCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCenter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CENTER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCenter()
	 * @generated
	 * @ordered
	 */
	protected boolean center = CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isJustify() <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJustify()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JUSTIFY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJustify() <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJustify()
	 * @generated
	 * @ordered
	 */
	protected boolean justify = JUSTIFY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_LEFT_EDEFAULT = 3;

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
	protected static final int MARGIN_TOP_EDEFAULT = 3;

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
	protected static final int MARGIN_RIGHT_EDEFAULT = 3;

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
	protected static final int MARGIN_BOTTOM_EDEFAULT = 3;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwtPackage.Literals.ROW_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationStyle getOrientationStyle() {
		return orientationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientationStyle(OrientationStyle newOrientationStyle) {
		OrientationStyle oldOrientationStyle = orientationStyle;
		orientationStyle = newOrientationStyle == null ? ORIENTATION_STYLE_EDEFAULT : newOrientationStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__ORIENTATION_STYLE, oldOrientationStyle, orientationStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginWidth() {
		return marginWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginWidth(int newMarginWidth) {
		int oldMarginWidth = marginWidth;
		marginWidth = newMarginWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__MARGIN_WIDTH, oldMarginWidth, marginWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginHeight() {
		return marginHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginHeight(int newMarginHeight) {
		int oldMarginHeight = marginHeight;
		marginHeight = newMarginHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__MARGIN_HEIGHT, oldMarginHeight, marginHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacing(int newSpacing) {
		int oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__SPACING, oldSpacing, spacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWrap() {
		return wrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrap(boolean newWrap) {
		boolean oldWrap = wrap;
		wrap = newWrap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__WRAP, oldWrap, wrap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPack() {
		return pack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPack(boolean newPack) {
		boolean oldPack = pack;
		pack = newPack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__PACK, oldPack, pack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(boolean newFill) {
		boolean oldFill = fill;
		fill = newFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__FILL, oldFill, fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(boolean newCenter) {
		boolean oldCenter = center;
		center = newCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__CENTER, oldCenter, center));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJustify() {
		return justify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustify(boolean newJustify) {
		boolean oldJustify = justify;
		justify = newJustify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__JUSTIFY, oldJustify, justify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginLeft() {
		return marginLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginLeft(int newMarginLeft) {
		int oldMarginLeft = marginLeft;
		marginLeft = newMarginLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__MARGIN_LEFT, oldMarginLeft, marginLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginTop() {
		return marginTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginTop(int newMarginTop) {
		int oldMarginTop = marginTop;
		marginTop = newMarginTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__MARGIN_TOP, oldMarginTop, marginTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginRight() {
		return marginRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginRight(int newMarginRight) {
		int oldMarginRight = marginRight;
		marginRight = newMarginRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__MARGIN_RIGHT, oldMarginRight, marginRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginBottom() {
		return marginBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginBottom(int newMarginBottom) {
		int oldMarginBottom = marginBottom;
		marginBottom = newMarginBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ROW_LAYOUT__MARGIN_BOTTOM, oldMarginBottom, marginBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwtPackage.ROW_LAYOUT__ORIENTATION_STYLE:
				return getOrientationStyle();
			case SwtPackage.ROW_LAYOUT__MARGIN_WIDTH:
				return getMarginWidth();
			case SwtPackage.ROW_LAYOUT__MARGIN_HEIGHT:
				return getMarginHeight();
			case SwtPackage.ROW_LAYOUT__SPACING:
				return getSpacing();
			case SwtPackage.ROW_LAYOUT__WRAP:
				return isWrap();
			case SwtPackage.ROW_LAYOUT__PACK:
				return isPack();
			case SwtPackage.ROW_LAYOUT__FILL:
				return isFill();
			case SwtPackage.ROW_LAYOUT__CENTER:
				return isCenter();
			case SwtPackage.ROW_LAYOUT__JUSTIFY:
				return isJustify();
			case SwtPackage.ROW_LAYOUT__MARGIN_LEFT:
				return getMarginLeft();
			case SwtPackage.ROW_LAYOUT__MARGIN_TOP:
				return getMarginTop();
			case SwtPackage.ROW_LAYOUT__MARGIN_RIGHT:
				return getMarginRight();
			case SwtPackage.ROW_LAYOUT__MARGIN_BOTTOM:
				return getMarginBottom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SwtPackage.ROW_LAYOUT__ORIENTATION_STYLE:
				setOrientationStyle((OrientationStyle)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_WIDTH:
				setMarginWidth((Integer)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_HEIGHT:
				setMarginHeight((Integer)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__SPACING:
				setSpacing((Integer)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__WRAP:
				setWrap((Boolean)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__PACK:
				setPack((Boolean)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__FILL:
				setFill((Boolean)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__CENTER:
				setCenter((Boolean)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__JUSTIFY:
				setJustify((Boolean)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_LEFT:
				setMarginLeft((Integer)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_TOP:
				setMarginTop((Integer)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_RIGHT:
				setMarginRight((Integer)newValue);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_BOTTOM:
				setMarginBottom((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SwtPackage.ROW_LAYOUT__ORIENTATION_STYLE:
				setOrientationStyle(ORIENTATION_STYLE_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_WIDTH:
				setMarginWidth(MARGIN_WIDTH_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_HEIGHT:
				setMarginHeight(MARGIN_HEIGHT_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__SPACING:
				setSpacing(SPACING_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__WRAP:
				setWrap(WRAP_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__PACK:
				setPack(PACK_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__CENTER:
				setCenter(CENTER_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__JUSTIFY:
				setJustify(JUSTIFY_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_LEFT:
				setMarginLeft(MARGIN_LEFT_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_TOP:
				setMarginTop(MARGIN_TOP_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_RIGHT:
				setMarginRight(MARGIN_RIGHT_EDEFAULT);
				return;
			case SwtPackage.ROW_LAYOUT__MARGIN_BOTTOM:
				setMarginBottom(MARGIN_BOTTOM_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SwtPackage.ROW_LAYOUT__ORIENTATION_STYLE:
				return orientationStyle != ORIENTATION_STYLE_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__MARGIN_WIDTH:
				return marginWidth != MARGIN_WIDTH_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__MARGIN_HEIGHT:
				return marginHeight != MARGIN_HEIGHT_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__SPACING:
				return spacing != SPACING_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__WRAP:
				return wrap != WRAP_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__PACK:
				return pack != PACK_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__FILL:
				return fill != FILL_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__CENTER:
				return center != CENTER_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__JUSTIFY:
				return justify != JUSTIFY_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__MARGIN_LEFT:
				return marginLeft != MARGIN_LEFT_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__MARGIN_TOP:
				return marginTop != MARGIN_TOP_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__MARGIN_RIGHT:
				return marginRight != MARGIN_RIGHT_EDEFAULT;
			case SwtPackage.ROW_LAYOUT__MARGIN_BOTTOM:
				return marginBottom != MARGIN_BOTTOM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (orientationStyle: ");
		result.append(orientationStyle);
		result.append(", marginWidth: ");
		result.append(marginWidth);
		result.append(", marginHeight: ");
		result.append(marginHeight);
		result.append(", spacing: ");
		result.append(spacing);
		result.append(", wrap: ");
		result.append(wrap);
		result.append(", pack: ");
		result.append(pack);
		result.append(", fill: ");
		result.append(fill);
		result.append(", center: ");
		result.append(center);
		result.append(", justify: ");
		result.append(justify);
		result.append(", marginLeft: ");
		result.append(marginLeft);
		result.append(", marginTop: ");
		result.append(marginTop);
		result.append(", marginRight: ");
		result.append(marginRight);
		result.append(", marginBottom: ");
		result.append(marginBottom);
		result.append(')');
		return result.toString();
	}

} //RowLayoutImpl
