/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.emfacade.swt.Color;
import org.eclipse.gmt.emfacade.swt.Font;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#isOpaque <em>Opaque</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#isFocusTraversable <em>Focus Traversable</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getMinimumSize <em>Minimum Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getPreferredSize <em>Preferred Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getMaximumSize <em>Maximum Size</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getToolTip <em>Tool Tip</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getFont <em>Font</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Figure#getBorder <em>Border</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure()
 * @model
 * @generated
 */
public interface Figure extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_Enabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_Visible()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opaque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opaque</em>' attribute.
	 * @see #setOpaque(boolean)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_Opaque()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOpaque();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#isOpaque <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opaque</em>' attribute.
	 * @see #isOpaque()
	 * @generated
	 */
	void setOpaque(boolean value);

	/**
	 * Returns the value of the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus Traversable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus Traversable</em>' attribute.
	 * @see #setFocusTraversable(boolean)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_FocusTraversable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFocusTraversable();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#isFocusTraversable <em>Focus Traversable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus Traversable</em>' attribute.
	 * @see #isFocusTraversable()
	 * @generated
	 */
	void setFocusTraversable(boolean value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.draw2d.Figure}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_Children()
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Figure> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Figure)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_Parent()
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Figure getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Figure value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' attribute.
	 * @see #setBounds(Rectangle)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_Bounds()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.draw2d.Rectangle"
	 * @generated
	 */
	Rectangle getBounds();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getBounds <em>Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' attribute.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Size</em>' attribute.
	 * @see #setMinimumSize(Dimension)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_MinimumSize()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.draw2d.Dimension"
	 * @generated
	 */
	Dimension getMinimumSize();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getMinimumSize <em>Minimum Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Size</em>' attribute.
	 * @see #getMinimumSize()
	 * @generated
	 */
	void setMinimumSize(Dimension value);

	/**
	 * Returns the value of the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Size</em>' attribute.
	 * @see #setPreferredSize(Dimension)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_PreferredSize()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.draw2d.Dimension"
	 * @generated
	 */
	Dimension getPreferredSize();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getPreferredSize <em>Preferred Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Size</em>' attribute.
	 * @see #getPreferredSize()
	 * @generated
	 */
	void setPreferredSize(Dimension value);

	/**
	 * Returns the value of the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Size</em>' attribute.
	 * @see #setMaximumSize(Dimension)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_MaximumSize()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.draw2d.Dimension"
	 * @generated
	 */
	Dimension getMaximumSize();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getMaximumSize <em>Maximum Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Size</em>' attribute.
	 * @see #getMaximumSize()
	 * @generated
	 */
	void setMaximumSize(Dimension value);

	/**
	 * Returns the value of the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Tip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Tip</em>' containment reference.
	 * @see #setToolTip(Figure)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_ToolTip()
	 * @model containment="true"
	 * @generated
	 */
	Figure getToolTip();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getToolTip <em>Tool Tip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Tip</em>' containment reference.
	 * @see #getToolTip()
	 * @generated
	 */
	void setToolTip(Figure value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' containment reference.
	 * @see #setBackgroundColor(Color)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_BackgroundColor()
	 * @model containment="true"
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getBackgroundColor <em>Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' containment reference.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

	/**
	 * Returns the value of the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground Color</em>' containment reference.
	 * @see #setForegroundColor(Color)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_ForegroundColor()
	 * @model containment="true"
	 * @generated
	 */
	Color getForegroundColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getForegroundColor <em>Foreground Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Color</em>' containment reference.
	 * @see #getForegroundColor()
	 * @generated
	 */
	void setForegroundColor(Color value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(Font)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_Font()
	 * @model containment="true"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' containment reference.
	 * @see #setBorder(Border)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getFigure_Border()
	 * @model containment="true"
	 * @generated
	 */
	Border getBorder();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getBorder <em>Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' containment reference.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(Border value);

} // Figure
