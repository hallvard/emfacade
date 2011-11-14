/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;
import org.eclipse.gmt.emfacade.draw2d.Shape;
import org.eclipse.gmt.emfacade.swt.CapStyle;
import org.eclipse.gmt.emfacade.swt.JoinStyle;
import org.eclipse.gmt.emfacade.swt.LineStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#isFillXOR <em>Fill XOR</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#isOutline <em>Outline</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#isOutlineXOR <em>Outline XOR</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#getAntialias <em>Antialias</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#getLineWidthFloat <em>Line Width Float</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#getLineCap <em>Line Cap</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#getLineJoin <em>Line Join</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#getLineDash <em>Line Dash</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#getLineDashOffset <em>Line Dash Offset</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl#getLineMiterLimit <em>Line Miter Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ShapeImpl extends FigureImpl implements Shape {
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
	 * The default value of the '{@link #isFillXOR() <em>Fill XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillXOR()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_XOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFillXOR() <em>Fill XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillXOR()
	 * @generated
	 * @ordered
	 */
	protected boolean fillXOR = FILL_XOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected boolean outline = OUTLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutlineXOR() <em>Outline XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutlineXOR()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTLINE_XOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutlineXOR() <em>Outline XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutlineXOR()
	 * @generated
	 * @ordered
	 */
	protected boolean outlineXOR = OUTLINE_XOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected Integer alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntialias() <em>Antialias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntialias()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ANTIALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntialias() <em>Antialias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntialias()
	 * @generated
	 * @ordered
	 */
	protected Integer antialias = ANTIALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineWidthFloat() <em>Line Width Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidthFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_WIDTH_FLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineWidthFloat() <em>Line Width Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidthFloat()
	 * @generated
	 * @ordered
	 */
	protected float lineWidthFloat = LINE_WIDTH_FLOAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle LINE_STYLE_EDEFAULT = LineStyle.CUSTOM;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCap()
	 * @generated
	 * @ordered
	 */
	protected static final CapStyle LINE_CAP_EDEFAULT = CapStyle.FLAT;

	/**
	 * The cached value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCap()
	 * @generated
	 * @ordered
	 */
	protected CapStyle lineCap = LINE_CAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineJoin() <em>Line Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineJoin()
	 * @generated
	 * @ordered
	 */
	protected static final JoinStyle LINE_JOIN_EDEFAULT = JoinStyle.BEVEL;

	/**
	 * The cached value of the '{@link #getLineJoin() <em>Line Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineJoin()
	 * @generated
	 * @ordered
	 */
	protected JoinStyle lineJoin = LINE_JOIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLineDash() <em>Line Dash</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDash()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> lineDash;

	/**
	 * The default value of the '{@link #getLineDashOffset() <em>Line Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDashOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_DASH_OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineDashOffset() <em>Line Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDashOffset()
	 * @generated
	 * @ordered
	 */
	protected float lineDashOffset = LINE_DASH_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineMiterLimit() <em>Line Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineMiterLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_MITER_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineMiterLimit() <em>Line Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineMiterLimit()
	 * @generated
	 * @ordered
	 */
	protected float lineMiterLimit = LINE_MITER_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Draw2dPackage.Literals.SHAPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__FILL, oldFill, fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFillXOR() {
		return fillXOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillXOR(boolean newFillXOR) {
		boolean oldFillXOR = fillXOR;
		fillXOR = newFillXOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__FILL_XOR, oldFillXOR, fillXOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutline() {
		return outline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutline(boolean newOutline) {
		boolean oldOutline = outline;
		outline = newOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__OUTLINE, oldOutline, outline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutlineXOR() {
		return outlineXOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineXOR(boolean newOutlineXOR) {
		boolean oldOutlineXOR = outlineXOR;
		outlineXOR = newOutlineXOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__OUTLINE_XOR, oldOutlineXOR, outlineXOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(Integer newAlpha) {
		Integer oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAntialias() {
		return antialias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntialias(Integer newAntialias) {
		Integer oldAntialias = antialias;
		antialias = newAntialias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__ANTIALIAS, oldAntialias, antialias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLineWidthFloat() {
		return lineWidthFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidthFloat(float newLineWidthFloat) {
		float oldLineWidthFloat = lineWidthFloat;
		lineWidthFloat = newLineWidthFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__LINE_WIDTH_FLOAT, oldLineWidthFloat, lineWidthFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(LineStyle newLineStyle) {
		LineStyle oldLineStyle = lineStyle;
		lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__LINE_STYLE, oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapStyle getLineCap() {
		return lineCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineCap(CapStyle newLineCap) {
		CapStyle oldLineCap = lineCap;
		lineCap = newLineCap == null ? LINE_CAP_EDEFAULT : newLineCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__LINE_CAP, oldLineCap, lineCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinStyle getLineJoin() {
		return lineJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineJoin(JoinStyle newLineJoin) {
		JoinStyle oldLineJoin = lineJoin;
		lineJoin = newLineJoin == null ? LINE_JOIN_EDEFAULT : newLineJoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__LINE_JOIN, oldLineJoin, lineJoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getLineDash() {
		if (lineDash == null) {
			lineDash = new EDataTypeEList<Float>(Float.class, this, Draw2dPackage.SHAPE__LINE_DASH);
		}
		return lineDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLineDashOffset() {
		return lineDashOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineDashOffset(float newLineDashOffset) {
		float oldLineDashOffset = lineDashOffset;
		lineDashOffset = newLineDashOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__LINE_DASH_OFFSET, oldLineDashOffset, lineDashOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLineMiterLimit() {
		return lineMiterLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineMiterLimit(float newLineMiterLimit) {
		float oldLineMiterLimit = lineMiterLimit;
		lineMiterLimit = newLineMiterLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.SHAPE__LINE_MITER_LIMIT, oldLineMiterLimit, lineMiterLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Draw2dPackage.SHAPE__FILL:
				return isFill();
			case Draw2dPackage.SHAPE__FILL_XOR:
				return isFillXOR();
			case Draw2dPackage.SHAPE__OUTLINE:
				return isOutline();
			case Draw2dPackage.SHAPE__OUTLINE_XOR:
				return isOutlineXOR();
			case Draw2dPackage.SHAPE__ALPHA:
				return getAlpha();
			case Draw2dPackage.SHAPE__ANTIALIAS:
				return getAntialias();
			case Draw2dPackage.SHAPE__LINE_WIDTH_FLOAT:
				return getLineWidthFloat();
			case Draw2dPackage.SHAPE__LINE_STYLE:
				return getLineStyle();
			case Draw2dPackage.SHAPE__LINE_CAP:
				return getLineCap();
			case Draw2dPackage.SHAPE__LINE_JOIN:
				return getLineJoin();
			case Draw2dPackage.SHAPE__LINE_DASH:
				return getLineDash();
			case Draw2dPackage.SHAPE__LINE_DASH_OFFSET:
				return getLineDashOffset();
			case Draw2dPackage.SHAPE__LINE_MITER_LIMIT:
				return getLineMiterLimit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Draw2dPackage.SHAPE__FILL:
				setFill((Boolean)newValue);
				return;
			case Draw2dPackage.SHAPE__FILL_XOR:
				setFillXOR((Boolean)newValue);
				return;
			case Draw2dPackage.SHAPE__OUTLINE:
				setOutline((Boolean)newValue);
				return;
			case Draw2dPackage.SHAPE__OUTLINE_XOR:
				setOutlineXOR((Boolean)newValue);
				return;
			case Draw2dPackage.SHAPE__ALPHA:
				setAlpha((Integer)newValue);
				return;
			case Draw2dPackage.SHAPE__ANTIALIAS:
				setAntialias((Integer)newValue);
				return;
			case Draw2dPackage.SHAPE__LINE_WIDTH_FLOAT:
				setLineWidthFloat((Float)newValue);
				return;
			case Draw2dPackage.SHAPE__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
				return;
			case Draw2dPackage.SHAPE__LINE_CAP:
				setLineCap((CapStyle)newValue);
				return;
			case Draw2dPackage.SHAPE__LINE_JOIN:
				setLineJoin((JoinStyle)newValue);
				return;
			case Draw2dPackage.SHAPE__LINE_DASH:
				getLineDash().clear();
				getLineDash().addAll((Collection<? extends Float>)newValue);
				return;
			case Draw2dPackage.SHAPE__LINE_DASH_OFFSET:
				setLineDashOffset((Float)newValue);
				return;
			case Draw2dPackage.SHAPE__LINE_MITER_LIMIT:
				setLineMiterLimit((Float)newValue);
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
			case Draw2dPackage.SHAPE__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__FILL_XOR:
				setFillXOR(FILL_XOR_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__OUTLINE_XOR:
				setOutlineXOR(OUTLINE_XOR_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__ANTIALIAS:
				setAntialias(ANTIALIAS_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__LINE_WIDTH_FLOAT:
				setLineWidthFloat(LINE_WIDTH_FLOAT_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__LINE_CAP:
				setLineCap(LINE_CAP_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__LINE_JOIN:
				setLineJoin(LINE_JOIN_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__LINE_DASH:
				getLineDash().clear();
				return;
			case Draw2dPackage.SHAPE__LINE_DASH_OFFSET:
				setLineDashOffset(LINE_DASH_OFFSET_EDEFAULT);
				return;
			case Draw2dPackage.SHAPE__LINE_MITER_LIMIT:
				setLineMiterLimit(LINE_MITER_LIMIT_EDEFAULT);
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
			case Draw2dPackage.SHAPE__FILL:
				return fill != FILL_EDEFAULT;
			case Draw2dPackage.SHAPE__FILL_XOR:
				return fillXOR != FILL_XOR_EDEFAULT;
			case Draw2dPackage.SHAPE__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case Draw2dPackage.SHAPE__OUTLINE_XOR:
				return outlineXOR != OUTLINE_XOR_EDEFAULT;
			case Draw2dPackage.SHAPE__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case Draw2dPackage.SHAPE__ANTIALIAS:
				return ANTIALIAS_EDEFAULT == null ? antialias != null : !ANTIALIAS_EDEFAULT.equals(antialias);
			case Draw2dPackage.SHAPE__LINE_WIDTH_FLOAT:
				return lineWidthFloat != LINE_WIDTH_FLOAT_EDEFAULT;
			case Draw2dPackage.SHAPE__LINE_STYLE:
				return lineStyle != LINE_STYLE_EDEFAULT;
			case Draw2dPackage.SHAPE__LINE_CAP:
				return lineCap != LINE_CAP_EDEFAULT;
			case Draw2dPackage.SHAPE__LINE_JOIN:
				return lineJoin != LINE_JOIN_EDEFAULT;
			case Draw2dPackage.SHAPE__LINE_DASH:
				return lineDash != null && !lineDash.isEmpty();
			case Draw2dPackage.SHAPE__LINE_DASH_OFFSET:
				return lineDashOffset != LINE_DASH_OFFSET_EDEFAULT;
			case Draw2dPackage.SHAPE__LINE_MITER_LIMIT:
				return lineMiterLimit != LINE_MITER_LIMIT_EDEFAULT;
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
		result.append(" (fill: ");
		result.append(fill);
		result.append(", fillXOR: ");
		result.append(fillXOR);
		result.append(", outline: ");
		result.append(outline);
		result.append(", outlineXOR: ");
		result.append(outlineXOR);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", antialias: ");
		result.append(antialias);
		result.append(", lineWidthFloat: ");
		result.append(lineWidthFloat);
		result.append(", lineStyle: ");
		result.append(lineStyle);
		result.append(", lineCap: ");
		result.append(lineCap);
		result.append(", lineJoin: ");
		result.append(lineJoin);
		result.append(", lineDash: ");
		result.append(lineDash);
		result.append(", lineDashOffset: ");
		result.append(lineDashOffset);
		result.append(", lineMiterLimit: ");
		result.append(lineMiterLimit);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
