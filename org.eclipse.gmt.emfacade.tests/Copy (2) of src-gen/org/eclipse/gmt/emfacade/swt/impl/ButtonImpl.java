/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.emfacade.swt.ArrowStyle;
import org.eclipse.gmt.emfacade.swt.Button;
import org.eclipse.gmt.emfacade.swt.ButtonStyle;
import org.eclipse.gmt.emfacade.swt.Labeled;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ButtonImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ButtonImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ButtonImpl#getButtonStyle <em>Button Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ButtonImpl#getArrowStyle <em>Arrow Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ButtonImpl#isSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends ControlImpl implements Button
{
  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected static final URI IMAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected URI image = IMAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getButtonStyle() <em>Button Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtonStyle()
   * @generated
   * @ordered
   */
  protected static final ButtonStyle BUTTON_STYLE_EDEFAULT = ButtonStyle.TOGGLE;

  /**
   * The cached value of the '{@link #getButtonStyle() <em>Button Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtonStyle()
   * @generated
   * @ordered
   */
  protected ButtonStyle buttonStyle = BUTTON_STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getArrowStyle() <em>Arrow Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrowStyle()
   * @generated
   * @ordered
   */
  protected static final ArrowStyle ARROW_STYLE_EDEFAULT = ArrowStyle.NONE;

  /**
   * The cached value of the '{@link #getArrowStyle() <em>Arrow Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrowStyle()
   * @generated
   * @ordered
   */
  protected ArrowStyle arrowStyle = ARROW_STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #isSelection() <em>Selection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelection()
   * @generated
   * @ordered
   */
  protected static final boolean SELECTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSelection() <em>Selection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelection()
   * @generated
   * @ordered
   */
  protected boolean selection = SELECTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonImpl()
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
    return SwtPackage.Literals.BUTTON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.BUTTON__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URI getImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(URI newImage)
  {
    URI oldImage = image;
    image = newImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.BUTTON__IMAGE, oldImage, image));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonStyle getButtonStyle()
  {
    return buttonStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setButtonStyle(ButtonStyle newButtonStyle)
  {
    ButtonStyle oldButtonStyle = buttonStyle;
    buttonStyle = newButtonStyle == null ? BUTTON_STYLE_EDEFAULT : newButtonStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.BUTTON__BUTTON_STYLE, oldButtonStyle, buttonStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowStyle getArrowStyle()
  {
    return arrowStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrowStyle(ArrowStyle newArrowStyle)
  {
    ArrowStyle oldArrowStyle = arrowStyle;
    arrowStyle = newArrowStyle == null ? ARROW_STYLE_EDEFAULT : newArrowStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.BUTTON__ARROW_STYLE, oldArrowStyle, arrowStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSelection()
  {
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelection(boolean newSelection)
  {
    boolean oldSelection = selection;
    selection = newSelection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.BUTTON__SELECTION, oldSelection, selection));
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
      case SwtPackage.BUTTON__TEXT:
        return getText();
      case SwtPackage.BUTTON__IMAGE:
        return getImage();
      case SwtPackage.BUTTON__BUTTON_STYLE:
        return getButtonStyle();
      case SwtPackage.BUTTON__ARROW_STYLE:
        return getArrowStyle();
      case SwtPackage.BUTTON__SELECTION:
        return isSelection();
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
      case SwtPackage.BUTTON__TEXT:
        setText((String)newValue);
        return;
      case SwtPackage.BUTTON__IMAGE:
        setImage((URI)newValue);
        return;
      case SwtPackage.BUTTON__BUTTON_STYLE:
        setButtonStyle((ButtonStyle)newValue);
        return;
      case SwtPackage.BUTTON__ARROW_STYLE:
        setArrowStyle((ArrowStyle)newValue);
        return;
      case SwtPackage.BUTTON__SELECTION:
        setSelection((Boolean)newValue);
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
      case SwtPackage.BUTTON__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case SwtPackage.BUTTON__IMAGE:
        setImage(IMAGE_EDEFAULT);
        return;
      case SwtPackage.BUTTON__BUTTON_STYLE:
        setButtonStyle(BUTTON_STYLE_EDEFAULT);
        return;
      case SwtPackage.BUTTON__ARROW_STYLE:
        setArrowStyle(ARROW_STYLE_EDEFAULT);
        return;
      case SwtPackage.BUTTON__SELECTION:
        setSelection(SELECTION_EDEFAULT);
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
      case SwtPackage.BUTTON__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case SwtPackage.BUTTON__IMAGE:
        return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
      case SwtPackage.BUTTON__BUTTON_STYLE:
        return buttonStyle != BUTTON_STYLE_EDEFAULT;
      case SwtPackage.BUTTON__ARROW_STYLE:
        return arrowStyle != ARROW_STYLE_EDEFAULT;
      case SwtPackage.BUTTON__SELECTION:
        return selection != SELECTION_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Labeled.class)
    {
      switch (derivedFeatureID)
      {
        case SwtPackage.BUTTON__TEXT: return SwtPackage.LABELED__TEXT;
        case SwtPackage.BUTTON__IMAGE: return SwtPackage.LABELED__IMAGE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Labeled.class)
    {
      switch (baseFeatureID)
      {
        case SwtPackage.LABELED__TEXT: return SwtPackage.BUTTON__TEXT;
        case SwtPackage.LABELED__IMAGE: return SwtPackage.BUTTON__IMAGE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (text: ");
    result.append(text);
    result.append(", image: ");
    result.append(image);
    result.append(", buttonStyle: ");
    result.append(buttonStyle);
    result.append(", arrowStyle: ");
    result.append(arrowStyle);
    result.append(", selection: ");
    result.append(selection);
    result.append(')');
    return result.toString();
  }

} //ButtonImpl
