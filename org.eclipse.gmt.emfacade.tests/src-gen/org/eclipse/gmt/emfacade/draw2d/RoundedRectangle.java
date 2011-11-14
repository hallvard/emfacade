/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.draw2d.geometry.Dimension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rounded Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.RoundedRectangle#getCornerDimensions <em>Corner Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getRoundedRectangle()
 * @model
 * @generated
 */
public interface RoundedRectangle extends Shape {
	/**
	 * Returns the value of the '<em><b>Corner Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner Dimensions</em>' attribute.
	 * @see #setCornerDimensions(Dimension)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getRoundedRectangle_CornerDimensions()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.draw2d.Dimension"
	 * @generated
	 */
	Dimension getCornerDimensions();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.RoundedRectangle#getCornerDimensions <em>Corner Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner Dimensions</em>' attribute.
	 * @see #getCornerDimensions()
	 * @generated
	 */
	void setCornerDimensions(Dimension value);

} // RoundedRectangle
