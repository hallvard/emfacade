/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage
 * @generated
 */
public interface Draw2dFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Draw2dFactory eINSTANCE = org.eclipse.gmt.emfacade.draw2d.impl.Draw2dFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Draw2 DCanvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Draw2 DCanvas</em>'.
	 * @generated
	 */
	Draw2DCanvas createDraw2DCanvas();

	/**
	 * Returns a new object of class '<em>Figure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Figure</em>'.
	 * @generated
	 */
	Figure createFigure();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Rectangle Figure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle Figure</em>'.
	 * @generated
	 */
	RectangleFigure createRectangleFigure();

	/**
	 * Returns a new object of class '<em>Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rounded Rectangle</em>'.
	 * @generated
	 */
	RoundedRectangle createRoundedRectangle();

	/**
	 * Returns a new object of class '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ellipse</em>'.
	 * @generated
	 */
	Ellipse createEllipse();

	/**
	 * Returns a new object of class '<em>Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangle</em>'.
	 * @generated
	 */
	Triangle createTriangle();

	/**
	 * Returns a new object of class '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polyline</em>'.
	 * @generated
	 */
	Polyline createPolyline();

	/**
	 * Returns a new object of class '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon</em>'.
	 * @generated
	 */
	Polygon createPolygon();

	/**
	 * Returns a new object of class '<em>Polyline Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polyline Shape</em>'.
	 * @generated
	 */
	PolylineShape createPolylineShape();

	/**
	 * Returns a new object of class '<em>Polygon Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon Shape</em>'.
	 * @generated
	 */
	PolygonShape createPolygonShape();

	/**
	 * Returns a new object of class '<em>Image Figure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Figure</em>'.
	 * @generated
	 */
	ImageFigure createImageFigure();

	/**
	 * Returns a new object of class '<em>XY Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XY Anchor</em>'.
	 * @generated
	 */
	XYAnchor createXYAnchor();

	/**
	 * Returns a new object of class '<em>Block Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Flow</em>'.
	 * @generated
	 */
	BlockFlow createBlockFlow();

	/**
	 * Returns a new object of class '<em>Frame Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame Border</em>'.
	 * @generated
	 */
	FrameBorder createFrameBorder();

	/**
	 * Returns a new object of class '<em>Group Box Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Box Border</em>'.
	 * @generated
	 */
	GroupBoxBorder createGroupBoxBorder();

	/**
	 * Returns a new object of class '<em>Title Bar Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title Bar Border</em>'.
	 * @generated
	 */
	TitleBarBorder createTitleBarBorder();

	/**
	 * Returns a new object of class '<em>Flow Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Border</em>'.
	 * @generated
	 */
	FlowBorder createFlowBorder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Draw2dPackage getDraw2dPackage();

} //Draw2dFactory
