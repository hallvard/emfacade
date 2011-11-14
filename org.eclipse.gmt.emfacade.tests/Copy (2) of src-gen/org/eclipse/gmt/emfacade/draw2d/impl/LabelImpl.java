/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.emfacade.draw2d.Alignment;
import org.eclipse.gmt.emfacade.draw2d.Direction;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;
import org.eclipse.gmt.emfacade.draw2d.Label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl#getTextPlacement <em>Text Placement</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl#getIconAlignment <em>Icon Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl#getIconTextGap <em>Icon Text Gap</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelImpl extends FigureImpl implements Label {
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
	 * The default value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment TEXT_ALIGNMENT_EDEFAULT = Alignment.LEFT;

	/**
	 * The cached value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment textAlignment = TEXT_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextPlacement() <em>Text Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final Direction TEXT_PLACEMENT_EDEFAULT = Direction.NORTH;

	/**
	 * The cached value of the '{@link #getTextPlacement() <em>Text Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPlacement()
	 * @generated
	 * @ordered
	 */
	protected Direction textPlacement = TEXT_PLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final URI ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected URI icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconAlignment() <em>Icon Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment ICON_ALIGNMENT_EDEFAULT = Alignment.LEFT;

	/**
	 * The cached value of the '{@link #getIconAlignment() <em>Icon Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment iconAlignment = ICON_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconTextGap() <em>Icon Text Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconTextGap()
	 * @generated
	 * @ordered
	 */
	protected static final int ICON_TEXT_GAP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIconTextGap() <em>Icon Text Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconTextGap()
	 * @generated
	 * @ordered
	 */
	protected int iconTextGap = ICON_TEXT_GAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Draw2dPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.LABEL__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getTextAlignment() {
		return textAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlignment(Alignment newTextAlignment) {
		Alignment oldTextAlignment = textAlignment;
		textAlignment = newTextAlignment == null ? TEXT_ALIGNMENT_EDEFAULT : newTextAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.LABEL__TEXT_ALIGNMENT, oldTextAlignment, textAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getTextPlacement() {
		return textPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPlacement(Direction newTextPlacement) {
		Direction oldTextPlacement = textPlacement;
		textPlacement = newTextPlacement == null ? TEXT_PLACEMENT_EDEFAULT : newTextPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.LABEL__TEXT_PLACEMENT, oldTextPlacement, textPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(URI newIcon) {
		URI oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.LABEL__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getIconAlignment() {
		return iconAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconAlignment(Alignment newIconAlignment) {
		Alignment oldIconAlignment = iconAlignment;
		iconAlignment = newIconAlignment == null ? ICON_ALIGNMENT_EDEFAULT : newIconAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.LABEL__ICON_ALIGNMENT, oldIconAlignment, iconAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIconTextGap() {
		return iconTextGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconTextGap(int newIconTextGap) {
		int oldIconTextGap = iconTextGap;
		iconTextGap = newIconTextGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.LABEL__ICON_TEXT_GAP, oldIconTextGap, iconTextGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Draw2dPackage.LABEL__TEXT:
				return getText();
			case Draw2dPackage.LABEL__TEXT_ALIGNMENT:
				return getTextAlignment();
			case Draw2dPackage.LABEL__TEXT_PLACEMENT:
				return getTextPlacement();
			case Draw2dPackage.LABEL__ICON:
				return getIcon();
			case Draw2dPackage.LABEL__ICON_ALIGNMENT:
				return getIconAlignment();
			case Draw2dPackage.LABEL__ICON_TEXT_GAP:
				return getIconTextGap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Draw2dPackage.LABEL__TEXT:
				setText((String)newValue);
				return;
			case Draw2dPackage.LABEL__TEXT_ALIGNMENT:
				setTextAlignment((Alignment)newValue);
				return;
			case Draw2dPackage.LABEL__TEXT_PLACEMENT:
				setTextPlacement((Direction)newValue);
				return;
			case Draw2dPackage.LABEL__ICON:
				setIcon((URI)newValue);
				return;
			case Draw2dPackage.LABEL__ICON_ALIGNMENT:
				setIconAlignment((Alignment)newValue);
				return;
			case Draw2dPackage.LABEL__ICON_TEXT_GAP:
				setIconTextGap((Integer)newValue);
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
			case Draw2dPackage.LABEL__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case Draw2dPackage.LABEL__TEXT_ALIGNMENT:
				setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
				return;
			case Draw2dPackage.LABEL__TEXT_PLACEMENT:
				setTextPlacement(TEXT_PLACEMENT_EDEFAULT);
				return;
			case Draw2dPackage.LABEL__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case Draw2dPackage.LABEL__ICON_ALIGNMENT:
				setIconAlignment(ICON_ALIGNMENT_EDEFAULT);
				return;
			case Draw2dPackage.LABEL__ICON_TEXT_GAP:
				setIconTextGap(ICON_TEXT_GAP_EDEFAULT);
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
			case Draw2dPackage.LABEL__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case Draw2dPackage.LABEL__TEXT_ALIGNMENT:
				return textAlignment != TEXT_ALIGNMENT_EDEFAULT;
			case Draw2dPackage.LABEL__TEXT_PLACEMENT:
				return textPlacement != TEXT_PLACEMENT_EDEFAULT;
			case Draw2dPackage.LABEL__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case Draw2dPackage.LABEL__ICON_ALIGNMENT:
				return iconAlignment != ICON_ALIGNMENT_EDEFAULT;
			case Draw2dPackage.LABEL__ICON_TEXT_GAP:
				return iconTextGap != ICON_TEXT_GAP_EDEFAULT;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", textAlignment: ");
		result.append(textAlignment);
		result.append(", textPlacement: ");
		result.append(textPlacement);
		result.append(", icon: ");
		result.append(icon);
		result.append(", iconAlignment: ");
		result.append(iconAlignment);
		result.append(", iconTextGap: ");
		result.append(iconTextGap);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
