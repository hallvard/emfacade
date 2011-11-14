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
import org.eclipse.gmt.emfacade.swt.FormAttachment;
import org.eclipse.gmt.emfacade.swt.FormData;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormDataImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormDataImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormDataImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormDataImpl#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormDataImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.FormDataImpl#getBottom <em>Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormDataImpl extends LayoutDataImpl implements FormData
{
  /**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
  protected int width = WIDTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
  protected int height = HEIGHT_EDEFAULT;

  /**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
  protected FormAttachment left;

  /**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
  protected FormAttachment top;

  /**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
  protected FormAttachment right;

  /**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
  protected FormAttachment bottom;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FormDataImpl()
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
		return SwtPackage.Literals.FORM_DATA;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getWidth()
  {
		return width;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWidth(int newWidth)
  {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__WIDTH, oldWidth, width));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getHeight()
  {
		return height;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHeight(int newHeight)
  {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__HEIGHT, oldHeight, height));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FormAttachment getLeft()
  {
		return left;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetLeft(FormAttachment newLeft, NotificationChain msgs)
  {
		FormAttachment oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLeft(FormAttachment newLeft)
  {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.FORM_DATA__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwtPackage.FORM_DATA__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__LEFT, newLeft, newLeft));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FormAttachment getTop()
  {
		return top;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTop(FormAttachment newTop, NotificationChain msgs)
  {
		FormAttachment oldTop = top;
		top = newTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__TOP, oldTop, newTop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTop(FormAttachment newTop)
  {
		if (newTop != top) {
			NotificationChain msgs = null;
			if (top != null)
				msgs = ((InternalEObject)top).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.FORM_DATA__TOP, null, msgs);
			if (newTop != null)
				msgs = ((InternalEObject)newTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwtPackage.FORM_DATA__TOP, null, msgs);
			msgs = basicSetTop(newTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__TOP, newTop, newTop));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FormAttachment getRight()
  {
		return right;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRight(FormAttachment newRight, NotificationChain msgs)
  {
		FormAttachment oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRight(FormAttachment newRight)
  {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.FORM_DATA__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwtPackage.FORM_DATA__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__RIGHT, newRight, newRight));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FormAttachment getBottom()
  {
		return bottom;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetBottom(FormAttachment newBottom, NotificationChain msgs)
  {
		FormAttachment oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__BOTTOM, oldBottom, newBottom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBottom(FormAttachment newBottom)
  {
		if (newBottom != bottom) {
			NotificationChain msgs = null;
			if (bottom != null)
				msgs = ((InternalEObject)bottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.FORM_DATA__BOTTOM, null, msgs);
			if (newBottom != null)
				msgs = ((InternalEObject)newBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwtPackage.FORM_DATA__BOTTOM, null, msgs);
			msgs = basicSetBottom(newBottom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.FORM_DATA__BOTTOM, newBottom, newBottom));
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
			case SwtPackage.FORM_DATA__LEFT:
				return basicSetLeft(null, msgs);
			case SwtPackage.FORM_DATA__TOP:
				return basicSetTop(null, msgs);
			case SwtPackage.FORM_DATA__RIGHT:
				return basicSetRight(null, msgs);
			case SwtPackage.FORM_DATA__BOTTOM:
				return basicSetBottom(null, msgs);
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
			case SwtPackage.FORM_DATA__WIDTH:
				return getWidth();
			case SwtPackage.FORM_DATA__HEIGHT:
				return getHeight();
			case SwtPackage.FORM_DATA__LEFT:
				return getLeft();
			case SwtPackage.FORM_DATA__TOP:
				return getTop();
			case SwtPackage.FORM_DATA__RIGHT:
				return getRight();
			case SwtPackage.FORM_DATA__BOTTOM:
				return getBottom();
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
			case SwtPackage.FORM_DATA__WIDTH:
				setWidth((Integer)newValue);
				return;
			case SwtPackage.FORM_DATA__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case SwtPackage.FORM_DATA__LEFT:
				setLeft((FormAttachment)newValue);
				return;
			case SwtPackage.FORM_DATA__TOP:
				setTop((FormAttachment)newValue);
				return;
			case SwtPackage.FORM_DATA__RIGHT:
				setRight((FormAttachment)newValue);
				return;
			case SwtPackage.FORM_DATA__BOTTOM:
				setBottom((FormAttachment)newValue);
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
			case SwtPackage.FORM_DATA__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case SwtPackage.FORM_DATA__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case SwtPackage.FORM_DATA__LEFT:
				setLeft((FormAttachment)null);
				return;
			case SwtPackage.FORM_DATA__TOP:
				setTop((FormAttachment)null);
				return;
			case SwtPackage.FORM_DATA__RIGHT:
				setRight((FormAttachment)null);
				return;
			case SwtPackage.FORM_DATA__BOTTOM:
				setBottom((FormAttachment)null);
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
			case SwtPackage.FORM_DATA__WIDTH:
				return width != WIDTH_EDEFAULT;
			case SwtPackage.FORM_DATA__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case SwtPackage.FORM_DATA__LEFT:
				return left != null;
			case SwtPackage.FORM_DATA__TOP:
				return top != null;
			case SwtPackage.FORM_DATA__RIGHT:
				return right != null;
			case SwtPackage.FORM_DATA__BOTTOM:
				return bottom != null;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //FormDataImpl
