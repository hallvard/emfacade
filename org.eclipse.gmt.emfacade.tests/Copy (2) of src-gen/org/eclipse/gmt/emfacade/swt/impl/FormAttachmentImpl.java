/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.FormAttachment;
import org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormAttachmentImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormAttachmentImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormAttachmentImpl#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormAttachmentImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormAttachmentImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormAttachmentImpl extends MinimalEObjectImpl.Container implements FormAttachment
{
  /**
   * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment()
   * @generated
   * @ordered
   */
  protected static final FormAttachmentAlignment ALIGNMENT_EDEFAULT = FormAttachmentAlignment.DEFAULT;

  /**
   * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment()
   * @generated
   * @ordered
   */
  protected FormAttachmentAlignment alignment = ALIGNMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getControl() <em>Control</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected Control control;

  /**
   * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDenominator()
   * @generated
   * @ordered
   */
  protected static final int DENOMINATOR_EDEFAULT = 100;

  /**
   * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDenominator()
   * @generated
   * @ordered
   */
  protected int denominator = DENOMINATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumerator()
   * @generated
   * @ordered
   */
  protected static final int NUMERATOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumerator()
   * @generated
   * @ordered
   */
  protected int numerator = NUMERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected static final int OFFSET_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected int offset = OFFSET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormAttachmentImpl()
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
    return SwtPackage.Literals.FORM_ATTACHMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormAttachmentAlignment getAlignment()
  {
    return alignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignment(FormAttachmentAlignment newAlignment)
  {
    FormAttachmentAlignment oldAlignment = alignment;
    alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_ATTACHMENT__ALIGNMENT, oldAlignment, alignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Control getControl()
  {
    if (control != null && control.eIsProxy())
    {
      InternalEObject oldControl = (InternalEObject)control;
      control = (Control)eResolveProxy(oldControl);
      if (control != oldControl)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwtPackage.FORM_ATTACHMENT__CONTROL, oldControl, control));
      }
    }
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Control basicGetControl()
  {
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControl(Control newControl)
  {
    Control oldControl = control;
    control = newControl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_ATTACHMENT__CONTROL, oldControl, control));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDenominator()
  {
    return denominator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDenominator(int newDenominator)
  {
    int oldDenominator = denominator;
    denominator = newDenominator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_ATTACHMENT__DENOMINATOR, oldDenominator, denominator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumerator()
  {
    return numerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumerator(int newNumerator)
  {
    int oldNumerator = numerator;
    numerator = newNumerator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_ATTACHMENT__NUMERATOR, oldNumerator, numerator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOffset()
  {
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffset(int newOffset)
  {
    int oldOffset = offset;
    offset = newOffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_ATTACHMENT__OFFSET, oldOffset, offset));
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
      case SwtPackage.FORM_ATTACHMENT__ALIGNMENT:
        return getAlignment();
      case SwtPackage.FORM_ATTACHMENT__CONTROL:
        if (resolve) return getControl();
        return basicGetControl();
      case SwtPackage.FORM_ATTACHMENT__DENOMINATOR:
        return getDenominator();
      case SwtPackage.FORM_ATTACHMENT__NUMERATOR:
        return getNumerator();
      case SwtPackage.FORM_ATTACHMENT__OFFSET:
        return getOffset();
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
      case SwtPackage.FORM_ATTACHMENT__ALIGNMENT:
        setAlignment((FormAttachmentAlignment)newValue);
        return;
      case SwtPackage.FORM_ATTACHMENT__CONTROL:
        setControl((Control)newValue);
        return;
      case SwtPackage.FORM_ATTACHMENT__DENOMINATOR:
        setDenominator((Integer)newValue);
        return;
      case SwtPackage.FORM_ATTACHMENT__NUMERATOR:
        setNumerator((Integer)newValue);
        return;
      case SwtPackage.FORM_ATTACHMENT__OFFSET:
        setOffset((Integer)newValue);
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
      case SwtPackage.FORM_ATTACHMENT__ALIGNMENT:
        setAlignment(ALIGNMENT_EDEFAULT);
        return;
      case SwtPackage.FORM_ATTACHMENT__CONTROL:
        setControl((Control)null);
        return;
      case SwtPackage.FORM_ATTACHMENT__DENOMINATOR:
        setDenominator(DENOMINATOR_EDEFAULT);
        return;
      case SwtPackage.FORM_ATTACHMENT__NUMERATOR:
        setNumerator(NUMERATOR_EDEFAULT);
        return;
      case SwtPackage.FORM_ATTACHMENT__OFFSET:
        setOffset(OFFSET_EDEFAULT);
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
      case SwtPackage.FORM_ATTACHMENT__ALIGNMENT:
        return alignment != ALIGNMENT_EDEFAULT;
      case SwtPackage.FORM_ATTACHMENT__CONTROL:
        return control != null;
      case SwtPackage.FORM_ATTACHMENT__DENOMINATOR:
        return denominator != DENOMINATOR_EDEFAULT;
      case SwtPackage.FORM_ATTACHMENT__NUMERATOR:
        return numerator != NUMERATOR_EDEFAULT;
      case SwtPackage.FORM_ATTACHMENT__OFFSET:
        return offset != OFFSET_EDEFAULT;
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
    result.append(" (alignment: ");
    result.append(alignment);
    result.append(", denominator: ");
    result.append(denominator);
    result.append(", numerator: ");
    result.append(numerator);
    result.append(", offset: ");
    result.append(offset);
    result.append(')');
    return result.toString();
  }

} //FormAttachmentImpl
