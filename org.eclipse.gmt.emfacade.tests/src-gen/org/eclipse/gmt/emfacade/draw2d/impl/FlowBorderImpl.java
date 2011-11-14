/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;
import org.eclipse.gmt.emfacade.draw2d.FlowBorder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Border</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FlowBorderImpl#getLeftMargin <em>Left Margin</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FlowBorderImpl#getRightMargin <em>Right Margin</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FlowBorderImpl#getTopMargin <em>Top Margin</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FlowBorderImpl#getBottomMargin <em>Bottom Margin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowBorderImpl extends BorderImpl implements FlowBorder {
	/**
	 * The default value of the '{@link #getLeftMargin() <em>Left Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMargin()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_MARGIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLeftMargin() <em>Left Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMargin()
	 * @generated
	 * @ordered
	 */
	protected int leftMargin = LEFT_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightMargin() <em>Right Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMargin()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_MARGIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRightMargin() <em>Right Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMargin()
	 * @generated
	 * @ordered
	 */
	protected int rightMargin = RIGHT_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopMargin() <em>Top Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMargin()
	 * @generated
	 * @ordered
	 */
	protected static final int TOP_MARGIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTopMargin() <em>Top Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMargin()
	 * @generated
	 * @ordered
	 */
	protected int topMargin = TOP_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottomMargin() <em>Bottom Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomMargin()
	 * @generated
	 * @ordered
	 */
	protected static final int BOTTOM_MARGIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBottomMargin() <em>Bottom Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomMargin()
	 * @generated
	 * @ordered
	 */
	protected int bottomMargin = BOTTOM_MARGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowBorderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Draw2dPackage.Literals.FLOW_BORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeftMargin() {
		return leftMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftMargin(int newLeftMargin) {
		int oldLeftMargin = leftMargin;
		leftMargin = newLeftMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FLOW_BORDER__LEFT_MARGIN, oldLeftMargin, leftMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRightMargin() {
		return rightMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightMargin(int newRightMargin) {
		int oldRightMargin = rightMargin;
		rightMargin = newRightMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FLOW_BORDER__RIGHT_MARGIN, oldRightMargin, rightMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTopMargin() {
		return topMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopMargin(int newTopMargin) {
		int oldTopMargin = topMargin;
		topMargin = newTopMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FLOW_BORDER__TOP_MARGIN, oldTopMargin, topMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBottomMargin() {
		return bottomMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomMargin(int newBottomMargin) {
		int oldBottomMargin = bottomMargin;
		bottomMargin = newBottomMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FLOW_BORDER__BOTTOM_MARGIN, oldBottomMargin, bottomMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Draw2dPackage.FLOW_BORDER__LEFT_MARGIN:
				return getLeftMargin();
			case Draw2dPackage.FLOW_BORDER__RIGHT_MARGIN:
				return getRightMargin();
			case Draw2dPackage.FLOW_BORDER__TOP_MARGIN:
				return getTopMargin();
			case Draw2dPackage.FLOW_BORDER__BOTTOM_MARGIN:
				return getBottomMargin();
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
			case Draw2dPackage.FLOW_BORDER__LEFT_MARGIN:
				setLeftMargin((Integer)newValue);
				return;
			case Draw2dPackage.FLOW_BORDER__RIGHT_MARGIN:
				setRightMargin((Integer)newValue);
				return;
			case Draw2dPackage.FLOW_BORDER__TOP_MARGIN:
				setTopMargin((Integer)newValue);
				return;
			case Draw2dPackage.FLOW_BORDER__BOTTOM_MARGIN:
				setBottomMargin((Integer)newValue);
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
			case Draw2dPackage.FLOW_BORDER__LEFT_MARGIN:
				setLeftMargin(LEFT_MARGIN_EDEFAULT);
				return;
			case Draw2dPackage.FLOW_BORDER__RIGHT_MARGIN:
				setRightMargin(RIGHT_MARGIN_EDEFAULT);
				return;
			case Draw2dPackage.FLOW_BORDER__TOP_MARGIN:
				setTopMargin(TOP_MARGIN_EDEFAULT);
				return;
			case Draw2dPackage.FLOW_BORDER__BOTTOM_MARGIN:
				setBottomMargin(BOTTOM_MARGIN_EDEFAULT);
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
			case Draw2dPackage.FLOW_BORDER__LEFT_MARGIN:
				return leftMargin != LEFT_MARGIN_EDEFAULT;
			case Draw2dPackage.FLOW_BORDER__RIGHT_MARGIN:
				return rightMargin != RIGHT_MARGIN_EDEFAULT;
			case Draw2dPackage.FLOW_BORDER__TOP_MARGIN:
				return topMargin != TOP_MARGIN_EDEFAULT;
			case Draw2dPackage.FLOW_BORDER__BOTTOM_MARGIN:
				return bottomMargin != BOTTOM_MARGIN_EDEFAULT;
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
		result.append(" (leftMargin: ");
		result.append(leftMargin);
		result.append(", rightMargin: ");
		result.append(rightMargin);
		result.append(", topMargin: ");
		result.append(topMargin);
		result.append(", bottomMargin: ");
		result.append(bottomMargin);
		result.append(')');
		return result.toString();
	}

} //FlowBorderImpl
