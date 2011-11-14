/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.emfacade.swt.AbstractComposite;
import org.eclipse.gmt.emfacade.swt.BorderStyle;
import org.eclipse.gmt.emfacade.swt.Color;
import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.Font;
import org.eclipse.gmt.emfacade.swt.LayoutData;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#getTextOrientationStyle <em>Text Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#isTouchEnabled <em>Touch Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#getToolTipText <em>Tool Tip Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ControlImpl extends WidgetImpl implements Control
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected AbstractComposite<Control> parent;

  /**
   * The default value of the '{@link #getBorderStyle() <em>Border Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderStyle()
   * @generated
   * @ordered
   */
  protected static final BorderStyle BORDER_STYLE_EDEFAULT = BorderStyle.NONE;

  /**
   * The cached value of the '{@link #getBorderStyle() <em>Border Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderStyle()
   * @generated
   * @ordered
   */
  protected BorderStyle borderStyle = BORDER_STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getTextOrientationStyle() <em>Text Orientation Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextOrientationStyle()
   * @generated
   * @ordered
   */
  protected static final TextOrientationStyle TEXT_ORIENTATION_STYLE_EDEFAULT = TextOrientationStyle.LEFT_TO_RIGHT;

  /**
   * The cached value of the '{@link #getTextOrientationStyle() <em>Text Orientation Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextOrientationStyle()
   * @generated
   * @ordered
   */
  protected TextOrientationStyle textOrientationStyle = TEXT_ORIENTATION_STYLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutData()
   * @generated
   * @ordered
   */
  protected LayoutData layoutData;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLED_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean enabled = ENABLED_EDEFAULT;

  /**
   * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVisible()
   * @generated
   * @ordered
   */
  protected static final boolean VISIBLE_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVisible()
   * @generated
   * @ordered
   */
  protected boolean visible = VISIBLE_EDEFAULT;

  /**
   * The default value of the '{@link #isTouchEnabled() <em>Touch Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTouchEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean TOUCH_ENABLED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTouchEnabled() <em>Touch Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTouchEnabled()
   * @generated
   * @ordered
   */
  protected boolean touchEnabled = TOUCH_ENABLED_EDEFAULT;

  /**
   * The default value of the '{@link #getToolTipText() <em>Tool Tip Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolTipText()
   * @generated
   * @ordered
   */
  protected static final String TOOL_TIP_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToolTipText() <em>Tool Tip Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolTipText()
   * @generated
   * @ordered
   */
  protected String toolTipText = TOOL_TIP_TEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected Color background;

  /**
   * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFont()
   * @generated
   * @ordered
   */
  protected Font font;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlImpl()
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
    return SwtPackage.Literals.CONTROL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public AbstractComposite<Control> getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (AbstractComposite<Control>)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwtPackage.CONTROL__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractComposite<Control> basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(AbstractComposite<Control> newParent)
  {
    AbstractComposite<Control> oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderStyle getBorderStyle()
  {
    return borderStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorderStyle(BorderStyle newBorderStyle)
  {
    BorderStyle oldBorderStyle = borderStyle;
    borderStyle = newBorderStyle == null ? BORDER_STYLE_EDEFAULT : newBorderStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__BORDER_STYLE, oldBorderStyle, borderStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextOrientationStyle getTextOrientationStyle()
  {
    return textOrientationStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextOrientationStyle(TextOrientationStyle newTextOrientationStyle)
  {
    TextOrientationStyle oldTextOrientationStyle = textOrientationStyle;
    textOrientationStyle = newTextOrientationStyle == null ? TEXT_ORIENTATION_STYLE_EDEFAULT : newTextOrientationStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__TEXT_ORIENTATION_STYLE, oldTextOrientationStyle, textOrientationStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutData getLayoutData()
  {
    return layoutData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLayoutData(LayoutData newLayoutData, NotificationChain msgs)
  {
    LayoutData oldLayoutData = layoutData;
    layoutData = newLayoutData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__LAYOUT_DATA, oldLayoutData, newLayoutData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutData(LayoutData newLayoutData)
  {
    if (newLayoutData != layoutData)
    {
      NotificationChain msgs = null;
      if (layoutData != null)
        msgs = ((InternalEObject)layoutData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.CONTROL__LAYOUT_DATA, null, msgs);
      if (newLayoutData != null)
        msgs = ((InternalEObject)newLayoutData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwtPackage.CONTROL__LAYOUT_DATA, null, msgs);
      msgs = basicSetLayoutData(newLayoutData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__LAYOUT_DATA, newLayoutData, newLayoutData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(boolean newEnabled)
  {
    boolean oldEnabled = enabled;
    enabled = newEnabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__ENABLED, oldEnabled, enabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVisible()
  {
    return visible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisible(boolean newVisible)
  {
    boolean oldVisible = visible;
    visible = newVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__VISIBLE, oldVisible, visible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTouchEnabled()
  {
    return touchEnabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTouchEnabled(boolean newTouchEnabled)
  {
    boolean oldTouchEnabled = touchEnabled;
    touchEnabled = newTouchEnabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__TOUCH_ENABLED, oldTouchEnabled, touchEnabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToolTipText()
  {
    return toolTipText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToolTipText(String newToolTipText)
  {
    String oldToolTipText = toolTipText;
    toolTipText = newToolTipText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__TOOL_TIP_TEXT, oldToolTipText, toolTipText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getBackground()
  {
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackground(Color newBackground, NotificationChain msgs)
  {
    Color oldBackground = background;
    background = newBackground;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__BACKGROUND, oldBackground, newBackground);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackground(Color newBackground)
  {
    if (newBackground != background)
    {
      NotificationChain msgs = null;
      if (background != null)
        msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.CONTROL__BACKGROUND, null, msgs);
      if (newBackground != null)
        msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwtPackage.CONTROL__BACKGROUND, null, msgs);
      msgs = basicSetBackground(newBackground, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__BACKGROUND, newBackground, newBackground));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font getFont()
  {
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFont(Font newFont, NotificationChain msgs)
  {
    Font oldFont = font;
    font = newFont;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__FONT, oldFont, newFont);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFont(Font newFont)
  {
    if (newFont != font)
    {
      NotificationChain msgs = null;
      if (font != null)
        msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.CONTROL__FONT, null, msgs);
      if (newFont != null)
        msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwtPackage.CONTROL__FONT, null, msgs);
      msgs = basicSetFont(newFont, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.CONTROL__FONT, newFont, newFont));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SwtPackage.CONTROL__LAYOUT_DATA:
        return basicSetLayoutData(null, msgs);
      case SwtPackage.CONTROL__BACKGROUND:
        return basicSetBackground(null, msgs);
      case SwtPackage.CONTROL__FONT:
        return basicSetFont(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SwtPackage.CONTROL__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case SwtPackage.CONTROL__BORDER_STYLE:
        return getBorderStyle();
      case SwtPackage.CONTROL__TEXT_ORIENTATION_STYLE:
        return getTextOrientationStyle();
      case SwtPackage.CONTROL__LAYOUT_DATA:
        return getLayoutData();
      case SwtPackage.CONTROL__ENABLED:
        return isEnabled();
      case SwtPackage.CONTROL__VISIBLE:
        return isVisible();
      case SwtPackage.CONTROL__TOUCH_ENABLED:
        return isTouchEnabled();
      case SwtPackage.CONTROL__TOOL_TIP_TEXT:
        return getToolTipText();
      case SwtPackage.CONTROL__BACKGROUND:
        return getBackground();
      case SwtPackage.CONTROL__FONT:
        return getFont();
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
    switch (featureID)
    {
      case SwtPackage.CONTROL__PARENT:
        setParent((AbstractComposite<Control>)newValue);
        return;
      case SwtPackage.CONTROL__BORDER_STYLE:
        setBorderStyle((BorderStyle)newValue);
        return;
      case SwtPackage.CONTROL__TEXT_ORIENTATION_STYLE:
        setTextOrientationStyle((TextOrientationStyle)newValue);
        return;
      case SwtPackage.CONTROL__LAYOUT_DATA:
        setLayoutData((LayoutData)newValue);
        return;
      case SwtPackage.CONTROL__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case SwtPackage.CONTROL__VISIBLE:
        setVisible((Boolean)newValue);
        return;
      case SwtPackage.CONTROL__TOUCH_ENABLED:
        setTouchEnabled((Boolean)newValue);
        return;
      case SwtPackage.CONTROL__TOOL_TIP_TEXT:
        setToolTipText((String)newValue);
        return;
      case SwtPackage.CONTROL__BACKGROUND:
        setBackground((Color)newValue);
        return;
      case SwtPackage.CONTROL__FONT:
        setFont((Font)newValue);
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
      case SwtPackage.CONTROL__PARENT:
        setParent((AbstractComposite<Control>)null);
        return;
      case SwtPackage.CONTROL__BORDER_STYLE:
        setBorderStyle(BORDER_STYLE_EDEFAULT);
        return;
      case SwtPackage.CONTROL__TEXT_ORIENTATION_STYLE:
        setTextOrientationStyle(TEXT_ORIENTATION_STYLE_EDEFAULT);
        return;
      case SwtPackage.CONTROL__LAYOUT_DATA:
        setLayoutData((LayoutData)null);
        return;
      case SwtPackage.CONTROL__ENABLED:
        setEnabled(ENABLED_EDEFAULT);
        return;
      case SwtPackage.CONTROL__VISIBLE:
        setVisible(VISIBLE_EDEFAULT);
        return;
      case SwtPackage.CONTROL__TOUCH_ENABLED:
        setTouchEnabled(TOUCH_ENABLED_EDEFAULT);
        return;
      case SwtPackage.CONTROL__TOOL_TIP_TEXT:
        setToolTipText(TOOL_TIP_TEXT_EDEFAULT);
        return;
      case SwtPackage.CONTROL__BACKGROUND:
        setBackground((Color)null);
        return;
      case SwtPackage.CONTROL__FONT:
        setFont((Font)null);
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
      case SwtPackage.CONTROL__PARENT:
        return parent != null;
      case SwtPackage.CONTROL__BORDER_STYLE:
        return borderStyle != BORDER_STYLE_EDEFAULT;
      case SwtPackage.CONTROL__TEXT_ORIENTATION_STYLE:
        return textOrientationStyle != TEXT_ORIENTATION_STYLE_EDEFAULT;
      case SwtPackage.CONTROL__LAYOUT_DATA:
        return layoutData != null;
      case SwtPackage.CONTROL__ENABLED:
        return enabled != ENABLED_EDEFAULT;
      case SwtPackage.CONTROL__VISIBLE:
        return visible != VISIBLE_EDEFAULT;
      case SwtPackage.CONTROL__TOUCH_ENABLED:
        return touchEnabled != TOUCH_ENABLED_EDEFAULT;
      case SwtPackage.CONTROL__TOOL_TIP_TEXT:
        return TOOL_TIP_TEXT_EDEFAULT == null ? toolTipText != null : !TOOL_TIP_TEXT_EDEFAULT.equals(toolTipText);
      case SwtPackage.CONTROL__BACKGROUND:
        return background != null;
      case SwtPackage.CONTROL__FONT:
        return font != null;
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
    result.append(" (borderStyle: ");
    result.append(borderStyle);
    result.append(", textOrientationStyle: ");
    result.append(textOrientationStyle);
    result.append(", enabled: ");
    result.append(enabled);
    result.append(", visible: ");
    result.append(visible);
    result.append(", touchEnabled: ");
    result.append(touchEnabled);
    result.append(", toolTipText: ");
    result.append(toolTipText);
    result.append(')');
    return result.toString();
  }

} //ControlImpl
