/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.gmt.emfacade.swt.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colored Labeled Border</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.ColoredLabeledBorder#getTextColor <em>Text Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getColoredLabeledBorder()
 * @model abstract="true"
 * @generated
 */
public interface ColoredLabeledBorder extends LabeledBorder {
	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' containment reference.
	 * @see #setTextColor(Color)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getColoredLabeledBorder_TextColor()
	 * @model containment="true"
	 * @generated
	 */
	Color getTextColor();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.ColoredLabeledBorder#getTextColor <em>Text Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' containment reference.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(Color value);

} // ColoredLabeledBorder
