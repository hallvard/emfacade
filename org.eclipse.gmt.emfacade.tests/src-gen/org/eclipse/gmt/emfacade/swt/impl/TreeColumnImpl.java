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
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.TreeColumn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TreeColumnImpl#getToolTipText <em>Tool Tip Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TreeColumnImpl#getDisplayText <em>Display Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreeColumnImpl extends ItemImpl implements TreeColumn
{
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
	 * The default value of the '{@link #getDisplayText() <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDisplayText()
	 * @generated
	 * @ordered
	 */
  protected static final String DISPLAY_TEXT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDisplayText() <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDisplayText()
	 * @generated
	 * @ordered
	 */
  protected String displayText = DISPLAY_TEXT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TreeColumnImpl()
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
		return SwtPackage.Literals.TREE_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TREE_COLUMN__TOOL_TIP_TEXT, oldToolTipText, toolTipText));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDisplayText()
  {
		return displayText;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDisplayText(String newDisplayText)
  {
		String oldDisplayText = displayText;
		displayText = newDisplayText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TREE_COLUMN__DISPLAY_TEXT, oldDisplayText, displayText));
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
			case SwtPackage.TREE_COLUMN__TOOL_TIP_TEXT:
				return getToolTipText();
			case SwtPackage.TREE_COLUMN__DISPLAY_TEXT:
				return getDisplayText();
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
			case SwtPackage.TREE_COLUMN__TOOL_TIP_TEXT:
				setToolTipText((String)newValue);
				return;
			case SwtPackage.TREE_COLUMN__DISPLAY_TEXT:
				setDisplayText((String)newValue);
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
			case SwtPackage.TREE_COLUMN__TOOL_TIP_TEXT:
				setToolTipText(TOOL_TIP_TEXT_EDEFAULT);
				return;
			case SwtPackage.TREE_COLUMN__DISPLAY_TEXT:
				setDisplayText(DISPLAY_TEXT_EDEFAULT);
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
			case SwtPackage.TREE_COLUMN__TOOL_TIP_TEXT:
				return TOOL_TIP_TEXT_EDEFAULT == null ? toolTipText != null : !TOOL_TIP_TEXT_EDEFAULT.equals(toolTipText);
			case SwtPackage.TREE_COLUMN__DISPLAY_TEXT:
				return DISPLAY_TEXT_EDEFAULT == null ? displayText != null : !DISPLAY_TEXT_EDEFAULT.equals(displayText);
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
		result.append(" (toolTipText: ");
		result.append(toolTipText);
		result.append(", displayText: ");
		result.append(displayText);
		result.append(')');
		return result.toString();
	}

} //TreeColumnImpl
