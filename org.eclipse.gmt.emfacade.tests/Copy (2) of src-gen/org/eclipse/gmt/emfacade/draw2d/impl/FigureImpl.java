/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.draw2d.Border;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;
import org.eclipse.gmt.emfacade.draw2d.Figure;
import org.eclipse.gmt.emfacade.swt.Color;
import org.eclipse.gmt.emfacade.swt.Font;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#isOpaque <em>Opaque</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#isFocusTraversable <em>Focus Traversable</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getMinimumSize <em>Minimum Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getMaximumSize <em>Maximum Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getToolTip <em>Tool Tip</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl#getBorder <em>Border</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureImpl extends MinimalEObjectImpl.Container implements Figure {
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
	 * The default value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpaque()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPAQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpaque()
	 * @generated
	 * @ordered
	 */
	protected boolean opaque = OPAQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFocusTraversable() <em>Focus Traversable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFocusTraversable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOCUS_TRAVERSABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFocusTraversable() <em>Focus Traversable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFocusTraversable()
	 * @generated
	 * @ordered
	 */
	protected boolean focusTraversable = FOCUS_TRAVERSABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Figure> children;

	/**
	 * The default value of the '{@link #getBounds() <em>Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle BOUNDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Rectangle bounds = BOUNDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumSize() <em>Minimum Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSize()
	 * @generated
	 * @ordered
	 */
	protected static final Dimension MINIMUM_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumSize() <em>Minimum Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension minimumSize = MINIMUM_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredSize() <em>Preferred Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredSize()
	 * @generated
	 * @ordered
	 */
	protected static final Dimension PREFERRED_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredSize() <em>Preferred Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension preferredSize = PREFERRED_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumSize() <em>Maximum Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSize()
	 * @generated
	 * @ordered
	 */
	protected static final Dimension MAXIMUM_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSize() <em>Maximum Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension maximumSize = MAXIMUM_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToolTip() <em>Tool Tip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolTip()
	 * @generated
	 * @ordered
	 */
	protected Figure toolTip;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor;

	/**
	 * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color foregroundColor;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected Border border;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Draw2dPackage.Literals.FIGURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__ENABLED, oldEnabled, enabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpaque() {
		return opaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpaque(boolean newOpaque) {
		boolean oldOpaque = opaque;
		opaque = newOpaque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__OPAQUE, oldOpaque, opaque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFocusTraversable() {
		return focusTraversable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocusTraversable(boolean newFocusTraversable) {
		boolean oldFocusTraversable = focusTraversable;
		focusTraversable = newFocusTraversable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__FOCUS_TRAVERSABLE, oldFocusTraversable, focusTraversable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Figure> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<Figure>(Figure.class, this, Draw2dPackage.FIGURE__CHILDREN, Draw2dPackage.FIGURE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getParent() {
		if (eContainerFeatureID() != Draw2dPackage.FIGURE__PARENT) return null;
		return (Figure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Figure newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, Draw2dPackage.FIGURE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Figure newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != Draw2dPackage.FIGURE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, Draw2dPackage.FIGURE__CHILDREN, Figure.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Rectangle newBounds) {
		Rectangle oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__BOUNDS, oldBounds, bounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getMinimumSize() {
		return minimumSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSize(Dimension newMinimumSize) {
		Dimension oldMinimumSize = minimumSize;
		minimumSize = newMinimumSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__MINIMUM_SIZE, oldMinimumSize, minimumSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getPreferredSize() {
		return preferredSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredSize(Dimension newPreferredSize) {
		Dimension oldPreferredSize = preferredSize;
		preferredSize = newPreferredSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__PREFERRED_SIZE, oldPreferredSize, preferredSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getMaximumSize() {
		return maximumSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSize(Dimension newMaximumSize) {
		Dimension oldMaximumSize = maximumSize;
		maximumSize = newMaximumSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__MAXIMUM_SIZE, oldMaximumSize, maximumSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getToolTip() {
		return toolTip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolTip(Figure newToolTip, NotificationChain msgs) {
		Figure oldToolTip = toolTip;
		toolTip = newToolTip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__TOOL_TIP, oldToolTip, newToolTip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolTip(Figure newToolTip) {
		if (newToolTip != toolTip) {
			NotificationChain msgs = null;
			if (toolTip != null)
				msgs = ((InternalEObject)toolTip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__TOOL_TIP, null, msgs);
			if (newToolTip != null)
				msgs = ((InternalEObject)newToolTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__TOOL_TIP, null, msgs);
			msgs = basicSetToolTip(newToolTip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__TOOL_TIP, newToolTip, newToolTip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundColor(Color newBackgroundColor, NotificationChain msgs) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Color newBackgroundColor) {
		if (newBackgroundColor != backgroundColor) {
			NotificationChain msgs = null;
			if (backgroundColor != null)
				msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__BACKGROUND_COLOR, null, msgs);
			if (newBackgroundColor != null)
				msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__BACKGROUND_COLOR, null, msgs);
			msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getForegroundColor() {
		return foregroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForegroundColor(Color newForegroundColor, NotificationChain msgs) {
		Color oldForegroundColor = foregroundColor;
		foregroundColor = newForegroundColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__FOREGROUND_COLOR, oldForegroundColor, newForegroundColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroundColor(Color newForegroundColor) {
		if (newForegroundColor != foregroundColor) {
			NotificationChain msgs = null;
			if (foregroundColor != null)
				msgs = ((InternalEObject)foregroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__FOREGROUND_COLOR, null, msgs);
			if (newForegroundColor != null)
				msgs = ((InternalEObject)newForegroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__FOREGROUND_COLOR, null, msgs);
			msgs = basicSetForegroundColor(newForegroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__FOREGROUND_COLOR, newForegroundColor, newForegroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(Font newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Border getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBorder(Border newBorder, NotificationChain msgs) {
		Border oldBorder = border;
		border = newBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__BORDER, oldBorder, newBorder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(Border newBorder) {
		if (newBorder != border) {
			NotificationChain msgs = null;
			if (border != null)
				msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__BORDER, null, msgs);
			if (newBorder != null)
				msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Draw2dPackage.FIGURE__BORDER, null, msgs);
			msgs = basicSetBorder(newBorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draw2dPackage.FIGURE__BORDER, newBorder, newBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Draw2dPackage.FIGURE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case Draw2dPackage.FIGURE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Figure)otherEnd, msgs);
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
			case Draw2dPackage.FIGURE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case Draw2dPackage.FIGURE__PARENT:
				return basicSetParent(null, msgs);
			case Draw2dPackage.FIGURE__TOOL_TIP:
				return basicSetToolTip(null, msgs);
			case Draw2dPackage.FIGURE__BACKGROUND_COLOR:
				return basicSetBackgroundColor(null, msgs);
			case Draw2dPackage.FIGURE__FOREGROUND_COLOR:
				return basicSetForegroundColor(null, msgs);
			case Draw2dPackage.FIGURE__FONT:
				return basicSetFont(null, msgs);
			case Draw2dPackage.FIGURE__BORDER:
				return basicSetBorder(null, msgs);
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
			case Draw2dPackage.FIGURE__PARENT:
				return eInternalContainer().eInverseRemove(this, Draw2dPackage.FIGURE__CHILDREN, Figure.class, msgs);
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
			case Draw2dPackage.FIGURE__ENABLED:
				return isEnabled();
			case Draw2dPackage.FIGURE__VISIBLE:
				return isVisible();
			case Draw2dPackage.FIGURE__OPAQUE:
				return isOpaque();
			case Draw2dPackage.FIGURE__FOCUS_TRAVERSABLE:
				return isFocusTraversable();
			case Draw2dPackage.FIGURE__CHILDREN:
				return getChildren();
			case Draw2dPackage.FIGURE__PARENT:
				return getParent();
			case Draw2dPackage.FIGURE__BOUNDS:
				return getBounds();
			case Draw2dPackage.FIGURE__MINIMUM_SIZE:
				return getMinimumSize();
			case Draw2dPackage.FIGURE__PREFERRED_SIZE:
				return getPreferredSize();
			case Draw2dPackage.FIGURE__MAXIMUM_SIZE:
				return getMaximumSize();
			case Draw2dPackage.FIGURE__TOOL_TIP:
				return getToolTip();
			case Draw2dPackage.FIGURE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case Draw2dPackage.FIGURE__FOREGROUND_COLOR:
				return getForegroundColor();
			case Draw2dPackage.FIGURE__FONT:
				return getFont();
			case Draw2dPackage.FIGURE__BORDER:
				return getBorder();
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
			case Draw2dPackage.FIGURE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case Draw2dPackage.FIGURE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case Draw2dPackage.FIGURE__OPAQUE:
				setOpaque((Boolean)newValue);
				return;
			case Draw2dPackage.FIGURE__FOCUS_TRAVERSABLE:
				setFocusTraversable((Boolean)newValue);
				return;
			case Draw2dPackage.FIGURE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Figure>)newValue);
				return;
			case Draw2dPackage.FIGURE__PARENT:
				setParent((Figure)newValue);
				return;
			case Draw2dPackage.FIGURE__BOUNDS:
				setBounds((Rectangle)newValue);
				return;
			case Draw2dPackage.FIGURE__MINIMUM_SIZE:
				setMinimumSize((Dimension)newValue);
				return;
			case Draw2dPackage.FIGURE__PREFERRED_SIZE:
				setPreferredSize((Dimension)newValue);
				return;
			case Draw2dPackage.FIGURE__MAXIMUM_SIZE:
				setMaximumSize((Dimension)newValue);
				return;
			case Draw2dPackage.FIGURE__TOOL_TIP:
				setToolTip((Figure)newValue);
				return;
			case Draw2dPackage.FIGURE__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case Draw2dPackage.FIGURE__FOREGROUND_COLOR:
				setForegroundColor((Color)newValue);
				return;
			case Draw2dPackage.FIGURE__FONT:
				setFont((Font)newValue);
				return;
			case Draw2dPackage.FIGURE__BORDER:
				setBorder((Border)newValue);
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
			case Draw2dPackage.FIGURE__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case Draw2dPackage.FIGURE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case Draw2dPackage.FIGURE__OPAQUE:
				setOpaque(OPAQUE_EDEFAULT);
				return;
			case Draw2dPackage.FIGURE__FOCUS_TRAVERSABLE:
				setFocusTraversable(FOCUS_TRAVERSABLE_EDEFAULT);
				return;
			case Draw2dPackage.FIGURE__CHILDREN:
				getChildren().clear();
				return;
			case Draw2dPackage.FIGURE__PARENT:
				setParent((Figure)null);
				return;
			case Draw2dPackage.FIGURE__BOUNDS:
				setBounds(BOUNDS_EDEFAULT);
				return;
			case Draw2dPackage.FIGURE__MINIMUM_SIZE:
				setMinimumSize(MINIMUM_SIZE_EDEFAULT);
				return;
			case Draw2dPackage.FIGURE__PREFERRED_SIZE:
				setPreferredSize(PREFERRED_SIZE_EDEFAULT);
				return;
			case Draw2dPackage.FIGURE__MAXIMUM_SIZE:
				setMaximumSize(MAXIMUM_SIZE_EDEFAULT);
				return;
			case Draw2dPackage.FIGURE__TOOL_TIP:
				setToolTip((Figure)null);
				return;
			case Draw2dPackage.FIGURE__BACKGROUND_COLOR:
				setBackgroundColor((Color)null);
				return;
			case Draw2dPackage.FIGURE__FOREGROUND_COLOR:
				setForegroundColor((Color)null);
				return;
			case Draw2dPackage.FIGURE__FONT:
				setFont((Font)null);
				return;
			case Draw2dPackage.FIGURE__BORDER:
				setBorder((Border)null);
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
			case Draw2dPackage.FIGURE__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case Draw2dPackage.FIGURE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case Draw2dPackage.FIGURE__OPAQUE:
				return opaque != OPAQUE_EDEFAULT;
			case Draw2dPackage.FIGURE__FOCUS_TRAVERSABLE:
				return focusTraversable != FOCUS_TRAVERSABLE_EDEFAULT;
			case Draw2dPackage.FIGURE__CHILDREN:
				return children != null && !children.isEmpty();
			case Draw2dPackage.FIGURE__PARENT:
				return getParent() != null;
			case Draw2dPackage.FIGURE__BOUNDS:
				return BOUNDS_EDEFAULT == null ? bounds != null : !BOUNDS_EDEFAULT.equals(bounds);
			case Draw2dPackage.FIGURE__MINIMUM_SIZE:
				return MINIMUM_SIZE_EDEFAULT == null ? minimumSize != null : !MINIMUM_SIZE_EDEFAULT.equals(minimumSize);
			case Draw2dPackage.FIGURE__PREFERRED_SIZE:
				return PREFERRED_SIZE_EDEFAULT == null ? preferredSize != null : !PREFERRED_SIZE_EDEFAULT.equals(preferredSize);
			case Draw2dPackage.FIGURE__MAXIMUM_SIZE:
				return MAXIMUM_SIZE_EDEFAULT == null ? maximumSize != null : !MAXIMUM_SIZE_EDEFAULT.equals(maximumSize);
			case Draw2dPackage.FIGURE__TOOL_TIP:
				return toolTip != null;
			case Draw2dPackage.FIGURE__BACKGROUND_COLOR:
				return backgroundColor != null;
			case Draw2dPackage.FIGURE__FOREGROUND_COLOR:
				return foregroundColor != null;
			case Draw2dPackage.FIGURE__FONT:
				return font != null;
			case Draw2dPackage.FIGURE__BORDER:
				return border != null;
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", visible: ");
		result.append(visible);
		result.append(", opaque: ");
		result.append(opaque);
		result.append(", focusTraversable: ");
		result.append(focusTraversable);
		result.append(", bounds: ");
		result.append(bounds);
		result.append(", minimumSize: ");
		result.append(minimumSize);
		result.append(", preferredSize: ");
		result.append(preferredSize);
		result.append(", maximumSize: ");
		result.append(maximumSize);
		result.append(')');
		return result.toString();
	}

} //FigureImpl
