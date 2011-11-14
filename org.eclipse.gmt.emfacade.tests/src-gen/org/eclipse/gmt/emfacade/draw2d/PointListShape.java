/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point List Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.PointListShape#getPointList <em>Point List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getPointListShape()
 * @model abstract="true"
 * @generated
 */
public interface PointListShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Point List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point List</em>' attribute list.
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getPointListShape_PointList()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getPointList();

} // PointListShape
