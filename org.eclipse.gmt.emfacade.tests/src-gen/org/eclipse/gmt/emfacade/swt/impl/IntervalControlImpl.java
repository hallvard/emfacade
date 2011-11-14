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
import org.eclipse.gmt.emfacade.swt.IntervalControl;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.IntervalControlImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.IntervalControlImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.IntervalControlImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IntervalControlImpl extends ControlImpl implements IntervalControl
{
  /**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
  protected static final int MINIMUM_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
  protected int minimum = MINIMUM_EDEFAULT;

  /**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
  protected static final int MAXIMUM_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
  protected int maximum = MAXIMUM_EDEFAULT;

  /**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
  protected static final int SELECTION_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
  protected int selection = SELECTION_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IntervalControlImpl()
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
		return SwtPackage.Literals.INTERVAL_CONTROL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMinimum()
  {
		return minimum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinimum(int newMinimum)
  {
		int oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.INTERVAL_CONTROL__MINIMUM, oldMinimum, minimum));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMaximum()
  {
		return maximum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMaximum(int newMaximum)
  {
		int oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.INTERVAL_CONTROL__MAXIMUM, oldMaximum, maximum));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getSelection()
  {
		return selection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSelection(int newSelection)
  {
		int oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.INTERVAL_CONTROL__SELECTION, oldSelection, selection));
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
			case SwtPackage.INTERVAL_CONTROL__MINIMUM:
				return getMinimum();
			case SwtPackage.INTERVAL_CONTROL__MAXIMUM:
				return getMaximum();
			case SwtPackage.INTERVAL_CONTROL__SELECTION:
				return getSelection();
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
			case SwtPackage.INTERVAL_CONTROL__MINIMUM:
				setMinimum((Integer)newValue);
				return;
			case SwtPackage.INTERVAL_CONTROL__MAXIMUM:
				setMaximum((Integer)newValue);
				return;
			case SwtPackage.INTERVAL_CONTROL__SELECTION:
				setSelection((Integer)newValue);
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
			case SwtPackage.INTERVAL_CONTROL__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case SwtPackage.INTERVAL_CONTROL__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case SwtPackage.INTERVAL_CONTROL__SELECTION:
				setSelection(SELECTION_EDEFAULT);
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
			case SwtPackage.INTERVAL_CONTROL__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case SwtPackage.INTERVAL_CONTROL__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case SwtPackage.INTERVAL_CONTROL__SELECTION:
				return selection != SELECTION_EDEFAULT;
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
		result.append(" (minimum: ");
		result.append(minimum);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", selection: ");
		result.append(selection);
		result.append(')');
		return result.toString();
	}

} //IntervalControlImpl
