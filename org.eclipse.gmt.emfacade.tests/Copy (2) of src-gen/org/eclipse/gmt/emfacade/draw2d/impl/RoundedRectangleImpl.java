/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d.impl;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;
import org.eclipse.gmt.emfacade.draw2d.RoundedRectangle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rounded Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.RoundedRectangleImpl#getCornerDimensions <em>Corner Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoundedRectangleImpl extends ShapeImpl implements RoundedRectangle {
	/**
	 * The default value of the '{@link #getCornerDimensions() <em>Corner Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final Dimension CORNER_DIMENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCornerDimensions() <em>Corner Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerDimensions()
	 * @generated
	 * @ordered
	 */
	protected Dimension cornerDimensions = CORNER_DIMENSIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundedRectangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Draw2dPackage.Literals.ROUNDED_RECTANGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getCornerDimensions() {
		return cornerDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerDimensions(Dimension newCornerDimensions) {
		Dimension oldCornerDimensions = cornerDimensions;
		cornerDimensions = newCornerDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.ROUNDED_RECTANGLE__CORNER_DIMENSIONS, oldCornerDimensions, cornerDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Draw2dPackage.ROUNDED_RECTANGLE__CORNER_DIMENSIONS:
				return getCornerDimensions();
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
			case Draw2dPackage.ROUNDED_RECTANGLE__CORNER_DIMENSIONS:
				setCornerDimensions((Dimension)newValue);
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
			case Draw2dPackage.ROUNDED_RECTANGLE__CORNER_DIMENSIONS:
				setCornerDimensions(CORNER_DIMENSIONS_EDEFAULT);
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
			case Draw2dPackage.ROUNDED_RECTANGLE__CORNER_DIMENSIONS:
				return CORNER_DIMENSIONS_EDEFAULT == null ? cornerDimensions != null : !CORNER_DIMENSIONS_EDEFAULT.equals(cornerDimensions);
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
		result.append(" (cornerDimensions: ");
		result.append(cornerDimensions);
		result.append(')');
		return result.toString();
	}

} //RoundedRectangleImpl
