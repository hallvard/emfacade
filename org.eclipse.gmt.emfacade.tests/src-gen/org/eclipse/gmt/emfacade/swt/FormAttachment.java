/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getControl <em>Control</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormAttachment()
 * @model
 * @generated
 */
public interface FormAttachment extends EObject
{
  /**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment
	 * @see #setAlignment(FormAttachmentAlignment)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormAttachment_Alignment()
	 * @model unique="false"
	 * @generated
	 */
  FormAttachmentAlignment getAlignment();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment
	 * @see #getAlignment()
	 * @generated
	 */
  void setAlignment(FormAttachmentAlignment value);

  /**
	 * Returns the value of the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference.
	 * @see #setControl(Control)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormAttachment_Control()
	 * @model
	 * @generated
	 */
  Control getControl();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getControl <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' reference.
	 * @see #getControl()
	 * @generated
	 */
  void setControl(Control value);

  /**
	 * Returns the value of the '<em><b>Denominator</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Denominator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' attribute.
	 * @see #setDenominator(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormAttachment_Denominator()
	 * @model default="100" unique="false"
	 * @generated
	 */
  int getDenominator();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' attribute.
	 * @see #getDenominator()
	 * @generated
	 */
  void setDenominator(int value);

  /**
	 * Returns the value of the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numerator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' attribute.
	 * @see #setNumerator(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormAttachment_Numerator()
	 * @model unique="false"
	 * @generated
	 */
  int getNumerator();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' attribute.
	 * @see #getNumerator()
	 * @generated
	 */
  void setNumerator(int value);

  /**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Offset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFormAttachment_Offset()
	 * @model unique="false"
	 * @generated
	 */
  int getOffset();

  /**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
  void setOffset(int value);

} // FormAttachment
