/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Polyline#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getPolyline()
 * @model
 * @generated
 */
public interface Polyline extends PointListShape {
	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance</em>' attribute.
	 * @see #setTolerance(int)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getPolyline_Tolerance()
	 * @model default="2" unique="false"
	 * @generated
	 */
	int getTolerance();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Polyline#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' attribute.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(int value);

} // Polyline
