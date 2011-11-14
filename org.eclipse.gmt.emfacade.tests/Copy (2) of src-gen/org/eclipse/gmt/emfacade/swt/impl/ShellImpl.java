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

import org.eclipse.gmt.emfacade.swt.ModalStyle;
import org.eclipse.gmt.emfacade.swt.Shell;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.TrimStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ShellImpl#getModalStyle <em>Modal Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ShellImpl#getTrimStyle <em>Trim Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ShellImpl#isFullScreen <em>Full Screen</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ShellImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShellImpl extends DecorationsImpl implements Shell
{
  /**
   * The default value of the '{@link #getModalStyle() <em>Modal Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModalStyle()
   * @generated
   * @ordered
   */
  protected static final ModalStyle MODAL_STYLE_EDEFAULT = ModalStyle.SYSTEM_MODAL;

  /**
   * The cached value of the '{@link #getModalStyle() <em>Modal Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModalStyle()
   * @generated
   * @ordered
   */
  protected ModalStyle modalStyle = MODAL_STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getTrimStyle() <em>Trim Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrimStyle()
   * @generated
   * @ordered
   */
  protected static final TrimStyle TRIM_STYLE_EDEFAULT = TrimStyle.SHELL_TRIM;

  /**
   * The cached value of the '{@link #getTrimStyle() <em>Trim Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrimStyle()
   * @generated
   * @ordered
   */
  protected TrimStyle trimStyle = TRIM_STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #isFullScreen() <em>Full Screen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFullScreen()
   * @generated
   * @ordered
   */
  protected static final boolean FULL_SCREEN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFullScreen() <em>Full Screen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFullScreen()
   * @generated
   * @ordered
   */
  protected boolean fullScreen = FULL_SCREEN_EDEFAULT;

  /**
   * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected static final int ALPHA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected int alpha = ALPHA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShellImpl()
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
    return SwtPackage.Literals.SHELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModalStyle getModalStyle()
  {
    return modalStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModalStyle(ModalStyle newModalStyle)
  {
    ModalStyle oldModalStyle = modalStyle;
    modalStyle = newModalStyle == null ? MODAL_STYLE_EDEFAULT : newModalStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.SHELL__MODAL_STYLE, oldModalStyle, modalStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrimStyle getTrimStyle()
  {
    return trimStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrimStyle(TrimStyle newTrimStyle)
  {
    TrimStyle oldTrimStyle = trimStyle;
    trimStyle = newTrimStyle == null ? TRIM_STYLE_EDEFAULT : newTrimStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.SHELL__TRIM_STYLE, oldTrimStyle, trimStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFullScreen()
  {
    return fullScreen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFullScreen(boolean newFullScreen)
  {
    boolean oldFullScreen = fullScreen;
    fullScreen = newFullScreen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.SHELL__FULL_SCREEN, oldFullScreen, fullScreen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAlpha()
  {
    return alpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlpha(int newAlpha)
  {
    int oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.SHELL__ALPHA, oldAlpha, alpha));
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
      case SwtPackage.SHELL__MODAL_STYLE:
        return getModalStyle();
      case SwtPackage.SHELL__TRIM_STYLE:
        return getTrimStyle();
      case SwtPackage.SHELL__FULL_SCREEN:
        return isFullScreen();
      case SwtPackage.SHELL__ALPHA:
        return getAlpha();
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
      case SwtPackage.SHELL__MODAL_STYLE:
        setModalStyle((ModalStyle)newValue);
        return;
      case SwtPackage.SHELL__TRIM_STYLE:
        setTrimStyle((TrimStyle)newValue);
        return;
      case SwtPackage.SHELL__FULL_SCREEN:
        setFullScreen((Boolean)newValue);
        return;
      case SwtPackage.SHELL__ALPHA:
        setAlpha((Integer)newValue);
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
      case SwtPackage.SHELL__MODAL_STYLE:
        setModalStyle(MODAL_STYLE_EDEFAULT);
        return;
      case SwtPackage.SHELL__TRIM_STYLE:
        setTrimStyle(TRIM_STYLE_EDEFAULT);
        return;
      case SwtPackage.SHELL__FULL_SCREEN:
        setFullScreen(FULL_SCREEN_EDEFAULT);
        return;
      case SwtPackage.SHELL__ALPHA:
        setAlpha(ALPHA_EDEFAULT);
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
      case SwtPackage.SHELL__MODAL_STYLE:
        return modalStyle != MODAL_STYLE_EDEFAULT;
      case SwtPackage.SHELL__TRIM_STYLE:
        return trimStyle != TRIM_STYLE_EDEFAULT;
      case SwtPackage.SHELL__FULL_SCREEN:
        return fullScreen != FULL_SCREEN_EDEFAULT;
      case SwtPackage.SHELL__ALPHA:
        return alpha != ALPHA_EDEFAULT;
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
    result.append(" (modalStyle: ");
    result.append(modalStyle);
    result.append(", trimStyle: ");
    result.append(trimStyle);
    result.append(", fullScreen: ");
    result.append(fullScreen);
    result.append(", alpha: ");
    result.append(alpha);
    result.append(')');
    return result.toString();
  }

} //ShellImpl
