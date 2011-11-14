/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.emfacade.swt.Menu;
import org.eclipse.gmt.emfacade.swt.MenuItem;
import org.eclipse.gmt.emfacade.swt.MenuStyle;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl#getMenuStyle <em>Menu Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl#getParentItem <em>Parent Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends AbstractMenuImpl implements Menu
{
  /**
	 * The default value of the '{@link #getMenuStyle() <em>Menu Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuStyle()
	 * @generated
	 * @ordered
	 */
	protected static final MenuStyle MENU_STYLE_EDEFAULT = MenuStyle.POP_UP;

	/**
	 * The cached value of the '{@link #getMenuStyle() <em>Menu Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuStyle()
	 * @generated
	 * @ordered
	 */
	protected MenuStyle menuStyle = MENU_STYLE_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MenuImpl()
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
		return SwtPackage.Literals.MENU;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuStyle getMenuStyle() {
		return menuStyle;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuStyle(MenuStyle newMenuStyle) {
		MenuStyle oldMenuStyle = menuStyle;
		menuStyle = newMenuStyle == null ? MENU_STYLE_EDEFAULT : newMenuStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.MENU__MENU_STYLE, oldMenuStyle, menuStyle));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
			case SwtPackage.MENU__PARENT_ITEM:
				return basicSetParentItem(null, msgs);
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SwtPackage.MENU__MENU_STYLE:
				return getMenuStyle();
			case SwtPackage.MENU__PARENT_ITEM:
				return getParentItem();
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
			case SwtPackage.MENU__MENU_STYLE:
				setMenuStyle((MenuStyle)newValue);
				return;
			case SwtPackage.MENU__PARENT_ITEM:
				setParentItem((MenuItem)newValue);
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
			case SwtPackage.MENU__MENU_STYLE:
				setMenuStyle(MENU_STYLE_EDEFAULT);
				return;
			case SwtPackage.MENU__PARENT_ITEM:
				setParentItem((MenuItem)null);
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
			case SwtPackage.MENU__MENU_STYLE:
				return menuStyle != MENU_STYLE_EDEFAULT;
			case SwtPackage.MENU__PARENT_ITEM:
				return getParentItem() != null;
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
		result.append(" (menuStyle: ");
		result.append(menuStyle);
		result.append(')');
		return result.toString();
	}

} //MenuImpl
