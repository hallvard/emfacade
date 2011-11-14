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
import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.Text;
import org.eclipse.swt.graphics.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl#getMultiplicityStyle <em>Multiplicity Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl#getEchoChar <em>Echo Char</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl#getTabs <em>Tabs</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl#getTextLimit <em>Text Limit</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl#getTopIndex <em>Top Index</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends ControlImpl implements Text
{
  /**
	 * The default value of the '{@link #getMultiplicityStyle() <em>Multiplicity Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMultiplicityStyle()
	 * @generated
	 * @ordered
	 */
  protected static final MultiplicityStyle MULTIPLICITY_STYLE_EDEFAULT = MultiplicityStyle.SINGLE;

  /**
	 * The cached value of the '{@link #getMultiplicityStyle() <em>Multiplicity Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMultiplicityStyle()
	 * @generated
	 * @ordered
	 */
  protected MultiplicityStyle multiplicityStyle = MULTIPLICITY_STYLE_EDEFAULT;

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
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
  protected static final Point SELECTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
  protected Point selection = SELECTION_EDEFAULT;

  /**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
  protected static final boolean EDITABLE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
  protected boolean editable = EDITABLE_EDEFAULT;

  /**
	 * The default value of the '{@link #getEchoChar() <em>Echo Char</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEchoChar()
	 * @generated
	 * @ordered
	 */
  protected static final char ECHO_CHAR_EDEFAULT = '\u0000';

  /**
	 * The cached value of the '{@link #getEchoChar() <em>Echo Char</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEchoChar()
	 * @generated
	 * @ordered
	 */
  protected char echoChar = ECHO_CHAR_EDEFAULT;

  /**
	 * The default value of the '{@link #getTabs() <em>Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
  protected static final int TABS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
  protected int tabs = TABS_EDEFAULT;

  /**
	 * The default value of the '{@link #getTextLimit() <em>Text Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTextLimit()
	 * @generated
	 * @ordered
	 */
  protected static final int TEXT_LIMIT_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getTextLimit() <em>Text Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTextLimit()
	 * @generated
	 * @ordered
	 */
  protected int textLimit = TEXT_LIMIT_EDEFAULT;

  /**
	 * The default value of the '{@link #getTopIndex() <em>Top Index</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTopIndex()
	 * @generated
	 * @ordered
	 */
  protected static final int TOP_INDEX_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getTopIndex() <em>Top Index</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTopIndex()
	 * @generated
	 * @ordered
	 */
  protected int topIndex = TOP_INDEX_EDEFAULT;

  /**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
  protected static final String MESSAGE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
  protected String message = MESSAGE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TextImpl()
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
		return SwtPackage.Literals.TEXT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MultiplicityStyle getMultiplicityStyle()
  {
		return multiplicityStyle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMultiplicityStyle(MultiplicityStyle newMultiplicityStyle)
  {
		MultiplicityStyle oldMultiplicityStyle = multiplicityStyle;
		multiplicityStyle = newMultiplicityStyle == null ? MULTIPLICITY_STYLE_EDEFAULT : newMultiplicityStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TEXT__MULTIPLICITY_STYLE, oldMultiplicityStyle, multiplicityStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TEXT__TEXT, oldText, text));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Point getSelection()
  {
		return selection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSelection(Point newSelection)
  {
		Point oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TEXT__SELECTION, oldSelection, selection));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isEditable()
  {
		return editable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEditable(boolean newEditable)
  {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TEXT__EDITABLE, oldEditable, editable));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public char getEchoChar()
  {
		return echoChar;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEchoChar(char newEchoChar)
  {
		char oldEchoChar = echoChar;
		echoChar = newEchoChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TEXT__ECHO_CHAR, oldEchoChar, echoChar));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getTabs()
  {
		return tabs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTabs(int newTabs)
  {
		int oldTabs = tabs;
		tabs = newTabs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TEXT__TABS, oldTabs, tabs));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getTextLimit()
  {
		return textLimit;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTextLimit(int newTextLimit)
  {
		int oldTextLimit = textLimit;
		textLimit = newTextLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TEXT__TEXT_LIMIT, oldTextLimit, textLimit));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getTopIndex()
  {
		return topIndex;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTopIndex(int newTopIndex)
  {
		int oldTopIndex = topIndex;
		topIndex = newTopIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TEXT__TOP_INDEX, oldTopIndex, topIndex));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getMessage()
  {
		return message;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMessage(String newMessage)
  {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TEXT__MESSAGE, oldMessage, message));
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
			case SwtPackage.TEXT__MULTIPLICITY_STYLE:
				return getMultiplicityStyle();
			case SwtPackage.TEXT__TEXT:
				return getText();
			case SwtPackage.TEXT__SELECTION:
				return getSelection();
			case SwtPackage.TEXT__EDITABLE:
				return isEditable();
			case SwtPackage.TEXT__ECHO_CHAR:
				return getEchoChar();
			case SwtPackage.TEXT__TABS:
				return getTabs();
			case SwtPackage.TEXT__TEXT_LIMIT:
				return getTextLimit();
			case SwtPackage.TEXT__TOP_INDEX:
				return getTopIndex();
			case SwtPackage.TEXT__MESSAGE:
				return getMessage();
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
		switch (featureID) {
			case SwtPackage.TEXT__MULTIPLICITY_STYLE:
				setMultiplicityStyle((MultiplicityStyle)newValue);
				return;
			case SwtPackage.TEXT__TEXT:
				setText((String)newValue);
				return;
			case SwtPackage.TEXT__SELECTION:
				setSelection((Point)newValue);
				return;
			case SwtPackage.TEXT__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case SwtPackage.TEXT__ECHO_CHAR:
				setEchoChar((Character)newValue);
				return;
			case SwtPackage.TEXT__TABS:
				setTabs((Integer)newValue);
				return;
			case SwtPackage.TEXT__TEXT_LIMIT:
				setTextLimit((Integer)newValue);
				return;
			case SwtPackage.TEXT__TOP_INDEX:
				setTopIndex((Integer)newValue);
				return;
			case SwtPackage.TEXT__MESSAGE:
				setMessage((String)newValue);
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
			case SwtPackage.TEXT__MULTIPLICITY_STYLE:
				setMultiplicityStyle(MULTIPLICITY_STYLE_EDEFAULT);
				return;
			case SwtPackage.TEXT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case SwtPackage.TEXT__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case SwtPackage.TEXT__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case SwtPackage.TEXT__ECHO_CHAR:
				setEchoChar(ECHO_CHAR_EDEFAULT);
				return;
			case SwtPackage.TEXT__TABS:
				setTabs(TABS_EDEFAULT);
				return;
			case SwtPackage.TEXT__TEXT_LIMIT:
				setTextLimit(TEXT_LIMIT_EDEFAULT);
				return;
			case SwtPackage.TEXT__TOP_INDEX:
				setTopIndex(TOP_INDEX_EDEFAULT);
				return;
			case SwtPackage.TEXT__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case SwtPackage.TEXT__MULTIPLICITY_STYLE:
				return multiplicityStyle != MULTIPLICITY_STYLE_EDEFAULT;
			case SwtPackage.TEXT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case SwtPackage.TEXT__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
			case SwtPackage.TEXT__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case SwtPackage.TEXT__ECHO_CHAR:
				return echoChar != ECHO_CHAR_EDEFAULT;
			case SwtPackage.TEXT__TABS:
				return tabs != TABS_EDEFAULT;
			case SwtPackage.TEXT__TEXT_LIMIT:
				return textLimit != TEXT_LIMIT_EDEFAULT;
			case SwtPackage.TEXT__TOP_INDEX:
				return topIndex != TOP_INDEX_EDEFAULT;
			case SwtPackage.TEXT__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
		result.append(" (multiplicityStyle: ");
		result.append(multiplicityStyle);
		result.append(", text: ");
		result.append(text);
		result.append(", selection: ");
		result.append(selection);
		result.append(", editable: ");
		result.append(editable);
		result.append(", echoChar: ");
		result.append(echoChar);
		result.append(", tabs: ");
		result.append(tabs);
		result.append(", textLimit: ");
		result.append(textLimit);
		result.append(", topIndex: ");
		result.append(topIndex);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //TextImpl
