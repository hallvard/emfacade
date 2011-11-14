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
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.gmt.emfacade.swt.List;
import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ListImpl#getMultiplicityStyle <em>Multiplicity Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ListImpl#getSelectionIndices <em>Selection Indices</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.ListImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends AbstractListImpl implements List
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
	 * The cached value of the '{@link #getSelectionIndices() <em>Selection Indices</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSelectionIndices()
	 * @generated
	 * @ordered
	 */
  protected EList<Integer> selectionIndices;

  /**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
  protected EList<String> selection;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ListImpl()
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
		return SwtPackage.Literals.LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.LIST__MULTIPLICITY_STYLE, oldMultiplicityStyle, multiplicityStyle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Integer> getSelectionIndices()
  {
		if (selectionIndices == null) {
			selectionIndices = new EDataTypeEList<Integer>(Integer.class, this, SwtPackage.LIST__SELECTION_INDICES);
		}
		return selectionIndices;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getSelection()
  {
		if (selection == null) {
			selection = new EDataTypeEList<String>(String.class, this, SwtPackage.LIST__SELECTION);
		}
		return selection;
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
			case SwtPackage.LIST__MULTIPLICITY_STYLE:
				return getMultiplicityStyle();
			case SwtPackage.LIST__SELECTION_INDICES:
				return getSelectionIndices();
			case SwtPackage.LIST__SELECTION:
				return getSelection();
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
			case SwtPackage.LIST__MULTIPLICITY_STYLE:
				setMultiplicityStyle((MultiplicityStyle)newValue);
				return;
			case SwtPackage.LIST__SELECTION_INDICES:
				getSelectionIndices().clear();
				getSelectionIndices().addAll((Collection<? extends Integer>)newValue);
				return;
			case SwtPackage.LIST__SELECTION:
				getSelection().clear();
				getSelection().addAll((Collection<? extends String>)newValue);
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
			case SwtPackage.LIST__MULTIPLICITY_STYLE:
				setMultiplicityStyle(MULTIPLICITY_STYLE_EDEFAULT);
				return;
			case SwtPackage.LIST__SELECTION_INDICES:
				getSelectionIndices().clear();
				return;
			case SwtPackage.LIST__SELECTION:
				getSelection().clear();
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
			case SwtPackage.LIST__MULTIPLICITY_STYLE:
				return multiplicityStyle != MULTIPLICITY_STYLE_EDEFAULT;
			case SwtPackage.LIST__SELECTION_INDICES:
				return selectionIndices != null && !selectionIndices.isEmpty();
			case SwtPackage.LIST__SELECTION:
				return selection != null && !selection.isEmpty();
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
		result.append(", selectionIndices: ");
		result.append(selectionIndices);
		result.append(", selection: ");
		result.append(selection);
		result.append(')');
		return result.toString();
	}

} //ListImpl
