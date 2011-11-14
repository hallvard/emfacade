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

import org.eclipse.gmt.emfacade.swt.DateTime;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateTimeImpl extends ControlImpl implements DateTime
{
  /**
   * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconds()
   * @generated
   * @ordered
   */
  protected static final int SECONDS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconds()
   * @generated
   * @ordered
   */
  protected int seconds = SECONDS_EDEFAULT;

  /**
   * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected static final int MINUTES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected int minutes = MINUTES_EDEFAULT;

  /**
   * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected static final int HOURS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHours()
   * @generated
   * @ordered
   */
  protected int hours = HOURS_EDEFAULT;

  /**
   * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected static final int DAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected int day = DAY_EDEFAULT;

  /**
   * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected static final int MONTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected int month = MONTH_EDEFAULT;

  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final int YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected int year = YEAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DateTimeImpl()
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
    return SwtPackage.Literals.DATE_TIME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSeconds()
  {
    return seconds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeconds(int newSeconds)
  {
    int oldSeconds = seconds;
    seconds = newSeconds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.DATE_TIME__SECONDS, oldSeconds, seconds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinutes()
  {
    return minutes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinutes(int newMinutes)
  {
    int oldMinutes = minutes;
    minutes = newMinutes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.DATE_TIME__MINUTES, oldMinutes, minutes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHours()
  {
    return hours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHours(int newHours)
  {
    int oldHours = hours;
    hours = newHours;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.DATE_TIME__HOURS, oldHours, hours));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDay()
  {
    return day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDay(int newDay)
  {
    int oldDay = day;
    day = newDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.DATE_TIME__DAY, oldDay, day));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMonth()
  {
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonth(int newMonth)
  {
    int oldMonth = month;
    month = newMonth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.DATE_TIME__MONTH, oldMonth, month));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(int newYear)
  {
    int oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.DATE_TIME__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SwtPackage.DATE_TIME__SECONDS:
        return getSeconds();
      case SwtPackage.DATE_TIME__MINUTES:
        return getMinutes();
      case SwtPackage.DATE_TIME__HOURS:
        return getHours();
      case SwtPackage.DATE_TIME__DAY:
        return getDay();
      case SwtPackage.DATE_TIME__MONTH:
        return getMonth();
      case SwtPackage.DATE_TIME__YEAR:
        return getYear();
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
    switch (featureID)
    {
      case SwtPackage.DATE_TIME__SECONDS:
        setSeconds((Integer)newValue);
        return;
      case SwtPackage.DATE_TIME__MINUTES:
        setMinutes((Integer)newValue);
        return;
      case SwtPackage.DATE_TIME__HOURS:
        setHours((Integer)newValue);
        return;
      case SwtPackage.DATE_TIME__DAY:
        setDay((Integer)newValue);
        return;
      case SwtPackage.DATE_TIME__MONTH:
        setMonth((Integer)newValue);
        return;
      case SwtPackage.DATE_TIME__YEAR:
        setYear((Integer)newValue);
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
    switch (featureID)
    {
      case SwtPackage.DATE_TIME__SECONDS:
        setSeconds(SECONDS_EDEFAULT);
        return;
      case SwtPackage.DATE_TIME__MINUTES:
        setMinutes(MINUTES_EDEFAULT);
        return;
      case SwtPackage.DATE_TIME__HOURS:
        setHours(HOURS_EDEFAULT);
        return;
      case SwtPackage.DATE_TIME__DAY:
        setDay(DAY_EDEFAULT);
        return;
      case SwtPackage.DATE_TIME__MONTH:
        setMonth(MONTH_EDEFAULT);
        return;
      case SwtPackage.DATE_TIME__YEAR:
        setYear(YEAR_EDEFAULT);
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
    switch (featureID)
    {
      case SwtPackage.DATE_TIME__SECONDS:
        return seconds != SECONDS_EDEFAULT;
      case SwtPackage.DATE_TIME__MINUTES:
        return minutes != MINUTES_EDEFAULT;
      case SwtPackage.DATE_TIME__HOURS:
        return hours != HOURS_EDEFAULT;
      case SwtPackage.DATE_TIME__DAY:
        return day != DAY_EDEFAULT;
      case SwtPackage.DATE_TIME__MONTH:
        return month != MONTH_EDEFAULT;
      case SwtPackage.DATE_TIME__YEAR:
        return year != YEAR_EDEFAULT;
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
    result.append(" (seconds: ");
    result.append(seconds);
    result.append(", minutes: ");
    result.append(minutes);
    result.append(", hours: ");
    result.append(hours);
    result.append(", day: ");
    result.append(day);
    result.append(", month: ");
    result.append(month);
    result.append(", year: ");
    result.append(year);
    result.append(')');
    return result.toString();
  }

} //DateTimeImpl
