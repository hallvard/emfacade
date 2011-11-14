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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.swt.AbstractMenu;
import org.eclipse.gmt.emfacade.swt.MenuItem;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.AbstractMenuImpl#getTextOrientationStyle <em>Text Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.AbstractMenuImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.AbstractMenuImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.AbstractMenuImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractMenuImpl extends WidgetImpl implements AbstractMenu {
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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwtPackage.Literals.ABSTRACT_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOrientationStyle getTextOrientationStyle() {
		return textOrientationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextOrientationStyle(TextOrientationStyle newTextOrientationStyle) {
		TextOrientationStyle oldTextOrientationStyle = textOrientationStyle;
		textOrientationStyle = newTextOrientationStyle == null ? TEXT_ORIENTATION_STYLE_EDEFAULT : newTextOrientationStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ABSTRACT_MENU__TEXT_ORIENTATION_STYLE, oldTextOrientationStyle, textOrientationStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ABSTRACT_MENU__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.ABSTRACT_MENU__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<MenuItem>(MenuItem.class, this, SwtPackage.ABSTRACT_MENU__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwtPackage.ABSTRACT_MENU__ITEMS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwtPackage.ABSTRACT_MENU__TEXT_ORIENTATION_STYLE:
				return getTextOrientationStyle();
			case SwtPackage.ABSTRACT_MENU__ENABLED:
				return isEnabled();
			case SwtPackage.ABSTRACT_MENU__VISIBLE:
				return isVisible();
			case SwtPackage.ABSTRACT_MENU__ITEMS:
				return getItems();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SwtPackage.ABSTRACT_MENU__TEXT_ORIENTATION_STYLE:
				setTextOrientationStyle((TextOrientationStyle)newValue);
				return;
			case SwtPackage.ABSTRACT_MENU__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case SwtPackage.ABSTRACT_MENU__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case SwtPackage.ABSTRACT_MENU__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends MenuItem>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SwtPackage.ABSTRACT_MENU__TEXT_ORIENTATION_STYLE:
				setTextOrientationStyle(TEXT_ORIENTATION_STYLE_EDEFAULT);
				return;
			case SwtPackage.ABSTRACT_MENU__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case SwtPackage.ABSTRACT_MENU__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case SwtPackage.ABSTRACT_MENU__ITEMS:
				getItems().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SwtPackage.ABSTRACT_MENU__TEXT_ORIENTATION_STYLE:
				return textOrientationStyle != TEXT_ORIENTATION_STYLE_EDEFAULT;
			case SwtPackage.ABSTRACT_MENU__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case SwtPackage.ABSTRACT_MENU__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case SwtPackage.ABSTRACT_MENU__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (textOrientationStyle: ");
		result.append(textOrientationStyle);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //AbstractMenuImpl
