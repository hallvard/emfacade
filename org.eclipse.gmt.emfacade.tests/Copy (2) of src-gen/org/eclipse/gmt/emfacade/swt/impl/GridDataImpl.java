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
import org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getWidthHint <em>Width Hint</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getHeightHint <em>Height Hint</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getHorizontalIndent <em>Horizontal Indent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getVerticalIndent <em>Vertical Indent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getHorizontalSpan <em>Horizontal Span</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getVerticalSpan <em>Vertical Span</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getMinimumWidth <em>Minimum Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#getMinimumHeight <em>Minimum Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl#isExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridDataImpl extends LayoutDataImpl implements GridData
{
  /**
   * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticalAlignment()
   * @generated
   * @ordered
   */
  protected static final VerticalAlignmentStyle VERTICAL_ALIGNMENT_EDEFAULT = VerticalAlignmentStyle.CENTER;

  /**
   * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticalAlignment()
   * @generated
   * @ordered
   */
  protected VerticalAlignmentStyle verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalAlignment()
   * @generated
   * @ordered
   */
  protected static final HorizontalAlignmentStyle HORIZONTAL_ALIGNMENT_EDEFAULT = HorizontalAlignmentStyle.LEFT;

  /**
   * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalAlignment()
   * @generated
   * @ordered
   */
  protected HorizontalAlignmentStyle horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getWidthHint() <em>Width Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidthHint()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_HINT_EDEFAULT = -1;

  /**
   * The cached value of the '{@link #getWidthHint() <em>Width Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidthHint()
   * @generated
   * @ordered
   */
  protected int widthHint = WIDTH_HINT_EDEFAULT;

  /**
   * The default value of the '{@link #getHeightHint() <em>Height Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeightHint()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_HINT_EDEFAULT = -1;

  /**
   * The cached value of the '{@link #getHeightHint() <em>Height Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeightHint()
   * @generated
   * @ordered
   */
  protected int heightHint = HEIGHT_HINT_EDEFAULT;

  /**
   * The default value of the '{@link #getHorizontalIndent() <em>Horizontal Indent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalIndent()
   * @generated
   * @ordered
   */
  protected static final int HORIZONTAL_INDENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHorizontalIndent() <em>Horizontal Indent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalIndent()
   * @generated
   * @ordered
   */
  protected int horizontalIndent = HORIZONTAL_INDENT_EDEFAULT;

  /**
   * The default value of the '{@link #getVerticalIndent() <em>Vertical Indent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticalIndent()
   * @generated
   * @ordered
   */
  protected static final int VERTICAL_INDENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVerticalIndent() <em>Vertical Indent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticalIndent()
   * @generated
   * @ordered
   */
  protected int verticalIndent = VERTICAL_INDENT_EDEFAULT;

  /**
   * The default value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalSpan()
   * @generated
   * @ordered
   */
  protected static final int HORIZONTAL_SPAN_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalSpan()
   * @generated
   * @ordered
   */
  protected int horizontalSpan = HORIZONTAL_SPAN_EDEFAULT;

  /**
   * The default value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticalSpan()
   * @generated
   * @ordered
   */
  protected static final int VERTICAL_SPAN_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticalSpan()
   * @generated
   * @ordered
   */
  protected int verticalSpan = VERTICAL_SPAN_EDEFAULT;

  /**
   * The default value of the '{@link #isGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGrabExcessHorizontalSpace()
   * @generated
   * @ordered
   */
  protected static final boolean GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGrabExcessHorizontalSpace()
   * @generated
   * @ordered
   */
  protected boolean grabExcessHorizontalSpace = GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT;

  /**
   * The default value of the '{@link #isGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGrabExcessVerticalSpace()
   * @generated
   * @ordered
   */
  protected static final boolean GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGrabExcessVerticalSpace()
   * @generated
   * @ordered
   */
  protected boolean grabExcessVerticalSpace = GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumWidth()
   * @generated
   * @ordered
   */
  protected static final int MINIMUM_WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumWidth()
   * @generated
   * @ordered
   */
  protected int minimumWidth = MINIMUM_WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumHeight()
   * @generated
   * @ordered
   */
  protected static final int MINIMUM_HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimumHeight()
   * @generated
   * @ordered
   */
  protected int minimumHeight = MINIMUM_HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #isExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclude()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLUDE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclude()
   * @generated
   * @ordered
   */
  protected boolean exclude = EXCLUDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GridDataImpl()
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
    return SwtPackage.Literals.GRID_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerticalAlignmentStyle getVerticalAlignment()
  {
    return verticalAlignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerticalAlignment(VerticalAlignmentStyle newVerticalAlignment)
  {
    VerticalAlignmentStyle oldVerticalAlignment = verticalAlignment;
    verticalAlignment = newVerticalAlignment == null ? VERTICAL_ALIGNMENT_EDEFAULT : newVerticalAlignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalAlignmentStyle getHorizontalAlignment()
  {
    return horizontalAlignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorizontalAlignment(HorizontalAlignmentStyle newHorizontalAlignment)
  {
    HorizontalAlignmentStyle oldHorizontalAlignment = horizontalAlignment;
    horizontalAlignment = newHorizontalAlignment == null ? HORIZONTAL_ALIGNMENT_EDEFAULT : newHorizontalAlignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidthHint()
  {
    return widthHint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidthHint(int newWidthHint)
  {
    int oldWidthHint = widthHint;
    widthHint = newWidthHint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__WIDTH_HINT, oldWidthHint, widthHint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeightHint()
  {
    return heightHint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeightHint(int newHeightHint)
  {
    int oldHeightHint = heightHint;
    heightHint = newHeightHint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__HEIGHT_HINT, oldHeightHint, heightHint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHorizontalIndent()
  {
    return horizontalIndent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorizontalIndent(int newHorizontalIndent)
  {
    int oldHorizontalIndent = horizontalIndent;
    horizontalIndent = newHorizontalIndent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__HORIZONTAL_INDENT, oldHorizontalIndent, horizontalIndent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVerticalIndent()
  {
    return verticalIndent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerticalIndent(int newVerticalIndent)
  {
    int oldVerticalIndent = verticalIndent;
    verticalIndent = newVerticalIndent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__VERTICAL_INDENT, oldVerticalIndent, verticalIndent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHorizontalSpan()
  {
    return horizontalSpan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorizontalSpan(int newHorizontalSpan)
  {
    int oldHorizontalSpan = horizontalSpan;
    horizontalSpan = newHorizontalSpan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__HORIZONTAL_SPAN, oldHorizontalSpan, horizontalSpan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVerticalSpan()
  {
    return verticalSpan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerticalSpan(int newVerticalSpan)
  {
    int oldVerticalSpan = verticalSpan;
    verticalSpan = newVerticalSpan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__VERTICAL_SPAN, oldVerticalSpan, verticalSpan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGrabExcessHorizontalSpace()
  {
    return grabExcessHorizontalSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGrabExcessHorizontalSpace(boolean newGrabExcessHorizontalSpace)
  {
    boolean oldGrabExcessHorizontalSpace = grabExcessHorizontalSpace;
    grabExcessHorizontalSpace = newGrabExcessHorizontalSpace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE, oldGrabExcessHorizontalSpace, grabExcessHorizontalSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGrabExcessVerticalSpace()
  {
    return grabExcessVerticalSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGrabExcessVerticalSpace(boolean newGrabExcessVerticalSpace)
  {
    boolean oldGrabExcessVerticalSpace = grabExcessVerticalSpace;
    grabExcessVerticalSpace = newGrabExcessVerticalSpace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE, oldGrabExcessVerticalSpace, grabExcessVerticalSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinimumWidth()
  {
    return minimumWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinimumWidth(int newMinimumWidth)
  {
    int oldMinimumWidth = minimumWidth;
    minimumWidth = newMinimumWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__MINIMUM_WIDTH, oldMinimumWidth, minimumWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinimumHeight()
  {
    return minimumHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinimumHeight(int newMinimumHeight)
  {
    int oldMinimumHeight = minimumHeight;
    minimumHeight = newMinimumHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__MINIMUM_HEIGHT, oldMinimumHeight, minimumHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExclude()
  {
    return exclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclude(boolean newExclude)
  {
    boolean oldExclude = exclude;
    exclude = newExclude;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GRID_DATA__EXCLUDE, oldExclude, exclude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SwtPackage.GRID_DATA__VERTICAL_ALIGNMENT:
        return getVerticalAlignment();
      case SwtPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
        return getHorizontalAlignment();
      case SwtPackage.GRID_DATA__WIDTH_HINT:
        return getWidthHint();
      case SwtPackage.GRID_DATA__HEIGHT_HINT:
        return getHeightHint();
      case SwtPackage.GRID_DATA__HORIZONTAL_INDENT:
        return getHorizontalIndent();
      case SwtPackage.GRID_DATA__VERTICAL_INDENT:
        return getVerticalIndent();
      case SwtPackage.GRID_DATA__HORIZONTAL_SPAN:
        return getHorizontalSpan();
      case SwtPackage.GRID_DATA__VERTICAL_SPAN:
        return getVerticalSpan();
      case SwtPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
        return isGrabExcessHorizontalSpace();
      case SwtPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
        return isGrabExcessVerticalSpace();
      case SwtPackage.GRID_DATA__MINIMUM_WIDTH:
        return getMinimumWidth();
      case SwtPackage.GRID_DATA__MINIMUM_HEIGHT:
        return getMinimumHeight();
      case SwtPackage.GRID_DATA__EXCLUDE:
        return isExclude();
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
    switch (featureID)
    {
      case SwtPackage.GRID_DATA__VERTICAL_ALIGNMENT:
        setVerticalAlignment((VerticalAlignmentStyle)newValue);
        return;
      case SwtPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
        setHorizontalAlignment((HorizontalAlignmentStyle)newValue);
        return;
      case SwtPackage.GRID_DATA__WIDTH_HINT:
        setWidthHint((Integer)newValue);
        return;
      case SwtPackage.GRID_DATA__HEIGHT_HINT:
        setHeightHint((Integer)newValue);
        return;
      case SwtPackage.GRID_DATA__HORIZONTAL_INDENT:
        setHorizontalIndent((Integer)newValue);
        return;
      case SwtPackage.GRID_DATA__VERTICAL_INDENT:
        setVerticalIndent((Integer)newValue);
        return;
      case SwtPackage.GRID_DATA__HORIZONTAL_SPAN:
        setHorizontalSpan((Integer)newValue);
        return;
      case SwtPackage.GRID_DATA__VERTICAL_SPAN:
        setVerticalSpan((Integer)newValue);
        return;
      case SwtPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
        setGrabExcessHorizontalSpace((Boolean)newValue);
        return;
      case SwtPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
        setGrabExcessVerticalSpace((Boolean)newValue);
        return;
      case SwtPackage.GRID_DATA__MINIMUM_WIDTH:
        setMinimumWidth((Integer)newValue);
        return;
      case SwtPackage.GRID_DATA__MINIMUM_HEIGHT:
        setMinimumHeight((Integer)newValue);
        return;
      case SwtPackage.GRID_DATA__EXCLUDE:
        setExclude((Boolean)newValue);
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
    switch (featureID)
    {
      case SwtPackage.GRID_DATA__VERTICAL_ALIGNMENT:
        setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
        setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__WIDTH_HINT:
        setWidthHint(WIDTH_HINT_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__HEIGHT_HINT:
        setHeightHint(HEIGHT_HINT_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__HORIZONTAL_INDENT:
        setHorizontalIndent(HORIZONTAL_INDENT_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__VERTICAL_INDENT:
        setVerticalIndent(VERTICAL_INDENT_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__HORIZONTAL_SPAN:
        setHorizontalSpan(HORIZONTAL_SPAN_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__VERTICAL_SPAN:
        setVerticalSpan(VERTICAL_SPAN_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
        setGrabExcessHorizontalSpace(GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
        setGrabExcessVerticalSpace(GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__MINIMUM_WIDTH:
        setMinimumWidth(MINIMUM_WIDTH_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__MINIMUM_HEIGHT:
        setMinimumHeight(MINIMUM_HEIGHT_EDEFAULT);
        return;
      case SwtPackage.GRID_DATA__EXCLUDE:
        setExclude(EXCLUDE_EDEFAULT);
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
    switch (featureID)
    {
      case SwtPackage.GRID_DATA__VERTICAL_ALIGNMENT:
        return verticalAlignment != VERTICAL_ALIGNMENT_EDEFAULT;
      case SwtPackage.GRID_DATA__HORIZONTAL_ALIGNMENT:
        return horizontalAlignment != HORIZONTAL_ALIGNMENT_EDEFAULT;
      case SwtPackage.GRID_DATA__WIDTH_HINT:
        return widthHint != WIDTH_HINT_EDEFAULT;
      case SwtPackage.GRID_DATA__HEIGHT_HINT:
        return heightHint != HEIGHT_HINT_EDEFAULT;
      case SwtPackage.GRID_DATA__HORIZONTAL_INDENT:
        return horizontalIndent != HORIZONTAL_INDENT_EDEFAULT;
      case SwtPackage.GRID_DATA__VERTICAL_INDENT:
        return verticalIndent != VERTICAL_INDENT_EDEFAULT;
      case SwtPackage.GRID_DATA__HORIZONTAL_SPAN:
        return horizontalSpan != HORIZONTAL_SPAN_EDEFAULT;
      case SwtPackage.GRID_DATA__VERTICAL_SPAN:
        return verticalSpan != VERTICAL_SPAN_EDEFAULT;
      case SwtPackage.GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
        return grabExcessHorizontalSpace != GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT;
      case SwtPackage.GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
        return grabExcessVerticalSpace != GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT;
      case SwtPackage.GRID_DATA__MINIMUM_WIDTH:
        return minimumWidth != MINIMUM_WIDTH_EDEFAULT;
      case SwtPackage.GRID_DATA__MINIMUM_HEIGHT:
        return minimumHeight != MINIMUM_HEIGHT_EDEFAULT;
      case SwtPackage.GRID_DATA__EXCLUDE:
        return exclude != EXCLUDE_EDEFAULT;
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
    result.append(" (verticalAlignment: ");
    result.append(verticalAlignment);
    result.append(", horizontalAlignment: ");
    result.append(horizontalAlignment);
    result.append(", widthHint: ");
    result.append(widthHint);
    result.append(", heightHint: ");
    result.append(heightHint);
    result.append(", horizontalIndent: ");
    result.append(horizontalIndent);
    result.append(", verticalIndent: ");
    result.append(verticalIndent);
    result.append(", horizontalSpan: ");
    result.append(horizontalSpan);
    result.append(", verticalSpan: ");
    result.append(verticalSpan);
    result.append(", grabExcessHorizontalSpace: ");
    result.append(grabExcessHorizontalSpace);
    result.append(", grabExcessVerticalSpace: ");
    result.append(grabExcessVerticalSpace);
    result.append(", minimumWidth: ");
    result.append(minimumWidth);
    result.append(", minimumHeight: ");
    result.append(minimumHeight);
    result.append(", exclude: ");
    result.append(exclude);
    result.append(')');
    return result.toString();
  }

} //GridDataImpl
