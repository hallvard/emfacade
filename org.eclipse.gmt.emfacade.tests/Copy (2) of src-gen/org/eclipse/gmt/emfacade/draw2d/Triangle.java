/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Triangle#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Triangle#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getTriangle()
 * @model
 * @generated
 */
public interface Triangle extends Shape {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.draw2d.Orientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Orientation
	 * @see #setOrientation(Orientation)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getTriangle_Orientation()
	 * @model unique="false"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Triangle#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.draw2d.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Direction
	 * @see #setDirection(Direction)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getTriangle_Direction()
	 * @model unique="false"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Triangle#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // Triangle
