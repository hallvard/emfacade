/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.gmt.emfacade.swt.Canvas;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Draw2 DCanvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Draw2DCanvas#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getDraw2DCanvas()
 * @model
 * @generated
 */
public interface Draw2DCanvas extends Canvas {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference.
	 * @see #setContents(Figure)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getDraw2DCanvas_Contents()
	 * @model containment="true"
	 * @generated
	 */
	Figure getContents();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Draw2DCanvas#getContents <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' containment reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(Figure value);

} // Draw2DCanvas
