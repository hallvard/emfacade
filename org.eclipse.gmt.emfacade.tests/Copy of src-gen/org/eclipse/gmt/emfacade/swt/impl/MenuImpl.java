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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.swt.Decorations;
import org.eclipse.gmt.emfacade.swt.Menu;
import org.eclipse.gmt.emfacade.swt.MenuItem;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl#getParentItem <em>Parent Item</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl#getTextOrientationStyle <em>Text Orientation Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends WidgetImpl implements Menu {
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
	protected static final boolean ENABLED_EDEFAULT = false;

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
	protected static final boolean VISIBLE_EDEFAULT = false;

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
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwtPackage.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decorations getParent() {
		if (eContainerFeatureID() != SwtPackage.MENU__PARENT) return null;
		return (Decorations)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Decorations newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, SwtPackage.MENU__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Decorations newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != SwtPackage.MENU__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, SwtPackage.DECORATIONS__MENU_BAR, Decorations.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem getParentItem() {
		if (eContainerFeatureID() != SwtPackage.MENU__PARENT_ITEM) return null;
		return (MenuItem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentItem(MenuItem newParentItem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentItem, SwtPackage.MENU__PARENT_ITEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentItem(MenuItem newParentItem) {
		if (newParentItem != eInternalContainer() || (eContainerFeatureID() != SwtPackage.MENU__PARENT_ITEM && newParentItem != null)) {
			if (EcoreUtil.isAncestor(this, newParentItem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentItem != null)
				msgs = ((InternalEObject)newParentItem).eInverseAdd(this, SwtPackage.MENU_ITEM__MENU, MenuItem.class, msgs);
			msgs = basicSetParentItem(newParentItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU__PARENT_ITEM, newParentItem, newParentItem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU__TEXT_ORIENTATION_STYLE, oldTextOrientationStyle, textOrientationStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU__VISIBLE, oldVisible, visible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<MenuItem>(MenuItem.class, this, SwtPackage.MENU__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwtPackage.MENU__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Decorations)otherEnd, msgs);
			case SwtPackage.MENU__PARENT_ITEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentItem((MenuItem)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwtPackage.MENU__PARENT:
				return basicSetParent(null, msgs);
			case SwtPackage.MENU__PARENT_ITEM:
				return basicSetParentItem(null, msgs);
			case SwtPackage.MENU__ITEMS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SwtPackage.MENU__PARENT:
				return eInternalContainer().eInverseRemove(this, SwtPackage.DECORATIONS__MENU_BAR, Decorations.class, msgs);
			case SwtPackage.MENU__PARENT_ITEM:
				return eInternalContainer().eInverseRemove(this, SwtPackage.MENU_ITEM__MENU, MenuItem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwtPackage.MENU__PARENT:
				return getParent();
			case SwtPackage.MENU__PARENT_ITEM:
				return getParentItem();
			case SwtPackage.MENU__TEXT_ORIENTATION_STYLE:
				return getTextOrientationStyle();
			case SwtPackage.MENU__ENABLED:
				return isEnabled();
			case SwtPackage.MENU__VISIBLE:
				return isVisible();
			case SwtPackage.MENU__ITEMS:
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
			case SwtPackage.MENU__PARENT:
				setParent((Decorations)newValue);
				return;
			case SwtPackage.MENU__PARENT_ITEM:
				setParentItem((MenuItem)newValue);
				return;
			case SwtPackage.MENU__TEXT_ORIENTATION_STYLE:
				setTextOrientationStyle((TextOrientationStyle)newValue);
				return;
			case SwtPackage.MENU__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case SwtPackage.MENU__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case SwtPackage.MENU__ITEMS:
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
			case SwtPackage.MENU__PARENT:
				setParent((Decorations)null);
				return;
			case SwtPackage.MENU__PARENT_ITEM:
				setParentItem((MenuItem)null);
				return;
			case SwtPackage.MENU__TEXT_ORIENTATION_STYLE:
				setTextOrientationStyle(TEXT_ORIENTATION_STYLE_EDEFAULT);
				return;
			case SwtPackage.MENU__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case SwtPackage.MENU__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case SwtPackage.MENU__ITEMS:
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
			case SwtPackage.MENU__PARENT:
				return getParent() != null;
			case SwtPackage.MENU__PARENT_ITEM:
				return getParentItem() != null;
			case SwtPackage.MENU__TEXT_ORIENTATION_STYLE:
				return textOrientationStyle != TEXT_ORIENTATION_STYLE_EDEFAULT;
			case SwtPackage.MENU__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case SwtPackage.MENU__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case SwtPackage.MENU__ITEMS:
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

} //MenuImpl
