/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.CoolBar;
import org.eclipse.gmt.emfacade.swt.CoolItem;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cool Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.CoolBarImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.CoolBarImpl#getOrientationStyle <em>Orientation Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoolBarImpl extends AbstractCompositeImpl<Control> implements CoolBar
{
  /**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
  protected EList<CoolItem> items;

  /**
	 * The default value of the '{@link #getOrientationStyle() <em>Orientation Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrientationStyle()
	 * @generated
	 * @ordered
	 */
  protected static final OrientationStyle ORIENTATION_STYLE_EDEFAULT = OrientationStyle.HORIZONTAL;

  /**
	 * The cached value of the '{@link #getOrientationStyle() <em>Orientation Style</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrientationStyle()
	 * @generated
	 * @ordered
	 */
  protected OrientationStyle orientationStyle = ORIENTATION_STYLE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CoolBarImpl()
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
		return SwtPackage.Literals.COOL_BAR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<CoolItem> getItems()
  {
		if (items == null) {
			items = new EObjectContainmentWithInverseEList<CoolItem>(CoolItem.class, this, SwtPackage.COOL_BAR__ITEMS, SwtPackage.COOL_ITEM__PARENT);
		}
		return items;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OrientationStyle getOrientationStyle()
  {
		return orientationStyle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrientationStyle(OrientationStyle newOrientationStyle)
  {
		OrientationStyle oldOrientationStyle = orientationStyle;
		orientationStyle = newOrientationStyle == null ? ORIENTATION_STYLE_EDEFAULT : newOrientationStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.COOL_BAR__ORIENTATION_STYLE, oldOrientationStyle, orientationStyle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SwtPackage.COOL_BAR__ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItems()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SwtPackage.COOL_BAR__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case SwtPackage.COOL_BAR__ITEMS:
				return getItems();
			case SwtPackage.COOL_BAR__ORIENTATION_STYLE:
				return getOrientationStyle();
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
			case SwtPackage.COOL_BAR__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends CoolItem>)newValue);
				return;
			case SwtPackage.COOL_BAR__ORIENTATION_STYLE:
				setOrientationStyle((OrientationStyle)newValue);
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
			case SwtPackage.COOL_BAR__ITEMS:
				getItems().clear();
				return;
			case SwtPackage.COOL_BAR__ORIENTATION_STYLE:
				setOrientationStyle(ORIENTATION_STYLE_EDEFAULT);
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
			case SwtPackage.COOL_BAR__ITEMS:
				return items != null && !items.isEmpty();
			case SwtPackage.COOL_BAR__ORIENTATION_STYLE:
				return orientationStyle != ORIENTATION_STYLE_EDEFAULT;
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
		result.append(" (orientationStyle: ");
		result.append(orientationStyle);
		result.append(')');
		return result.toString();
	}

} //CoolBarImpl
