/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.gmt.emfacade.swt.CapStyle;
import org.eclipse.gmt.emfacade.swt.JoinStyle;
import org.eclipse.gmt.emfacade.swt.LineAttributes;
import org.eclipse.gmt.emfacade.swt.LineStyle;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl#getCap <em>Cap</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl#getDash <em>Dash</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl#getDashOffset <em>Dash Offset</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl#getMiterLimit <em>Miter Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineAttributesImpl extends MinimalEObjectImpl.Container implements LineAttributes
{
  /**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
  protected static final float WIDTH_EDEFAULT = 0.0F;

  /**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
  protected float width = WIDTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
  protected static final LineStyle STYLE_EDEFAULT = LineStyle.CUSTOM;

  /**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
  protected LineStyle style = STYLE_EDEFAULT;

  /**
	 * The default value of the '{@link #getCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
  protected static final CapStyle CAP_EDEFAULT = CapStyle.FLAT;

  /**
	 * The cached value of the '{@link #getCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
  protected CapStyle cap = CAP_EDEFAULT;

  /**
	 * The default value of the '{@link #getJoin() <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
  protected static final JoinStyle JOIN_EDEFAULT = JoinStyle.BEVEL;

  /**
	 * The cached value of the '{@link #getJoin() <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
  protected JoinStyle join = JOIN_EDEFAULT;

  /**
	 * The cached value of the '{@link #getDash() <em>Dash</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDash()
	 * @generated
	 * @ordered
	 */
  protected EList<Float> dash;

  /**
	 * The default value of the '{@link #getDashOffset() <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDashOffset()
	 * @generated
	 * @ordered
	 */
  protected static final float DASH_OFFSET_EDEFAULT = 0.0F;

  /**
	 * The cached value of the '{@link #getDashOffset() <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDashOffset()
	 * @generated
	 * @ordered
	 */
  protected float dashOffset = DASH_OFFSET_EDEFAULT;

  /**
	 * The default value of the '{@link #getMiterLimit() <em>Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMiterLimit()
	 * @generated
	 * @ordered
	 */
  protected static final float MITER_LIMIT_EDEFAULT = 0.0F;

  /**
	 * The cached value of the '{@link #getMiterLimit() <em>Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMiterLimit()
	 * @generated
	 * @ordered
	 */
  protected float miterLimit = MITER_LIMIT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LineAttributesImpl()
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
		return SwtPackage.Literals.LINE_ATTRIBUTES;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float getWidth()
  {
		return width;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWidth(float newWidth)
  {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.LINE_ATTRIBUTES__WIDTH, oldWidth, width));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LineStyle getStyle()
  {
		return style;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStyle(LineStyle newStyle)
  {
		LineStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.LINE_ATTRIBUTES__STYLE, oldStyle, style));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CapStyle getCap()
  {
		return cap;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCap(CapStyle newCap)
  {
		CapStyle oldCap = cap;
		cap = newCap == null ? CAP_EDEFAULT : newCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.LINE_ATTRIBUTES__CAP, oldCap, cap));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JoinStyle getJoin()
  {
		return join;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setJoin(JoinStyle newJoin)
  {
		JoinStyle oldJoin = join;
		join = newJoin == null ? JOIN_EDEFAULT : newJoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.LINE_ATTRIBUTES__JOIN, oldJoin, join));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Float> getDash()
  {
		if (dash == null) {
			dash = new EDataTypeEList<Float>(Float.class, this, SwtPackage.LINE_ATTRIBUTES__DASH);
		}
		return dash;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float getDashOffset()
  {
		return dashOffset;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDashOffset(float newDashOffset)
  {
		float oldDashOffset = dashOffset;
		dashOffset = newDashOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.LINE_ATTRIBUTES__DASH_OFFSET, oldDashOffset, dashOffset));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float getMiterLimit()
  {
		return miterLimit;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMiterLimit(float newMiterLimit)
  {
		float oldMiterLimit = miterLimit;
		miterLimit = newMiterLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.LINE_ATTRIBUTES__MITER_LIMIT, oldMiterLimit, miterLimit));
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
			case SwtPackage.LINE_ATTRIBUTES__WIDTH:
				return getWidth();
			case SwtPackage.LINE_ATTRIBUTES__STYLE:
				return getStyle();
			case SwtPackage.LINE_ATTRIBUTES__CAP:
				return getCap();
			case SwtPackage.LINE_ATTRIBUTES__JOIN:
				return getJoin();
			case SwtPackage.LINE_ATTRIBUTES__DASH:
				return getDash();
			case SwtPackage.LINE_ATTRIBUTES__DASH_OFFSET:
				return getDashOffset();
			case SwtPackage.LINE_ATTRIBUTES__MITER_LIMIT:
				return getMiterLimit();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SwtPackage.LINE_ATTRIBUTES__WIDTH:
				setWidth((Float)newValue);
				return;
			case SwtPackage.LINE_ATTRIBUTES__STYLE:
				setStyle((LineStyle)newValue);
				return;
			case SwtPackage.LINE_ATTRIBUTES__CAP:
				setCap((CapStyle)newValue);
				return;
			case SwtPackage.LINE_ATTRIBUTES__JOIN:
				setJoin((JoinStyle)newValue);
				return;
			case SwtPackage.LINE_ATTRIBUTES__DASH:
				getDash().clear();
				getDash().addAll((Collection<? extends Float>)newValue);
				return;
			case SwtPackage.LINE_ATTRIBUTES__DASH_OFFSET:
				setDashOffset((Float)newValue);
				return;
			case SwtPackage.LINE_ATTRIBUTES__MITER_LIMIT:
				setMiterLimit((Float)newValue);
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
			case SwtPackage.LINE_ATTRIBUTES__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case SwtPackage.LINE_ATTRIBUTES__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case SwtPackage.LINE_ATTRIBUTES__CAP:
				setCap(CAP_EDEFAULT);
				return;
			case SwtPackage.LINE_ATTRIBUTES__JOIN:
				setJoin(JOIN_EDEFAULT);
				return;
			case SwtPackage.LINE_ATTRIBUTES__DASH:
				getDash().clear();
				return;
			case SwtPackage.LINE_ATTRIBUTES__DASH_OFFSET:
				setDashOffset(DASH_OFFSET_EDEFAULT);
				return;
			case SwtPackage.LINE_ATTRIBUTES__MITER_LIMIT:
				setMiterLimit(MITER_LIMIT_EDEFAULT);
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
			case SwtPackage.LINE_ATTRIBUTES__WIDTH:
				return width != WIDTH_EDEFAULT;
			case SwtPackage.LINE_ATTRIBUTES__STYLE:
				return style != STYLE_EDEFAULT;
			case SwtPackage.LINE_ATTRIBUTES__CAP:
				return cap != CAP_EDEFAULT;
			case SwtPackage.LINE_ATTRIBUTES__JOIN:
				return join != JOIN_EDEFAULT;
			case SwtPackage.LINE_ATTRIBUTES__DASH:
				return dash != null && !dash.isEmpty();
			case SwtPackage.LINE_ATTRIBUTES__DASH_OFFSET:
				return dashOffset != DASH_OFFSET_EDEFAULT;
			case SwtPackage.LINE_ATTRIBUTES__MITER_LIMIT:
				return miterLimit != MITER_LIMIT_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", style: ");
		result.append(style);
		result.append(", cap: ");
		result.append(cap);
		result.append(", join: ");
		result.append(join);
		result.append(", dash: ");
		result.append(dash);
		result.append(", dashOffset: ");
		result.append(dashOffset);
		result.append(", miterLimit: ");
		result.append(miterLimit);
		result.append(')');
		return result.toString();
	}

} //LineAttributesImpl
