/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import org.eclipse.swt.graphics.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Text#getMultiplicityStyle <em>Multiplicity Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Text#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Text#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Text#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Text#getEchoChar <em>Echo Char</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Text#getTabs <em>Tabs</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Text#getTextLimit <em>Text Limit</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Text#getTopIndex <em>Top Index</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.Text#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Control
{
  /**
   * Returns the value of the '<em><b>Multiplicity Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.MultiplicityStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity Style</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.MultiplicityStyle
   * @see #setMultiplicityStyle(MultiplicityStyle)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText_MultiplicityStyle()
   * @model unique="false"
   * @generated
   */
  MultiplicityStyle getMultiplicityStyle();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Text#getMultiplicityStyle <em>Multiplicity Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity Style</em>' attribute.
   * @see org.eclipse.gmt.emfacade.swt.MultiplicityStyle
   * @see #getMultiplicityStyle()
   * @generated
   */
  void setMultiplicityStyle(MultiplicityStyle value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText_Text()
   * @model unique="false"
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Text#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Selection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' attribute.
   * @see #setSelection(Point)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText_Selection()
   * @model unique="false" dataType="org.eclipse.gmt.emfacade.swt.Point"
   * @generated
   */
  Point getSelection();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Text#getSelection <em>Selection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' attribute.
   * @see #getSelection()
   * @generated
   */
  void setSelection(Point value);

  /**
   * Returns the value of the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Editable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Editable</em>' attribute.
   * @see #setEditable(boolean)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText_Editable()
   * @model unique="false"
   * @generated
   */
  boolean isEditable();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Text#isEditable <em>Editable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Editable</em>' attribute.
   * @see #isEditable()
   * @generated
   */
  void setEditable(boolean value);

  /**
   * Returns the value of the '<em><b>Echo Char</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Echo Char</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Echo Char</em>' attribute.
   * @see #setEchoChar(char)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText_EchoChar()
   * @model unique="false"
   * @generated
   */
  char getEchoChar();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Text#getEchoChar <em>Echo Char</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Echo Char</em>' attribute.
   * @see #getEchoChar()
   * @generated
   */
  void setEchoChar(char value);

  /**
   * Returns the value of the '<em><b>Tabs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tabs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tabs</em>' attribute.
   * @see #setTabs(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText_Tabs()
   * @model unique="false"
   * @generated
   */
  int getTabs();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Text#getTabs <em>Tabs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tabs</em>' attribute.
   * @see #getTabs()
   * @generated
   */
  void setTabs(int value);

  /**
   * Returns the value of the '<em><b>Text Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Limit</em>' attribute.
   * @see #setTextLimit(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText_TextLimit()
   * @model unique="false"
   * @generated
   */
  int getTextLimit();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Text#getTextLimit <em>Text Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Limit</em>' attribute.
   * @see #getTextLimit()
   * @generated
   */
  void setTextLimit(int value);

  /**
   * Returns the value of the '<em><b>Top Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top Index</em>' attribute.
   * @see #setTopIndex(int)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText_TopIndex()
   * @model unique="false"
   * @generated
   */
  int getTopIndex();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Text#getTopIndex <em>Top Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top Index</em>' attribute.
   * @see #getTopIndex()
   * @generated
   */
  void setTopIndex(int value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getText_Message()
   * @model unique="false"
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.Text#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // Text
