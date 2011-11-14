/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gmt.emfacade.draw2d.*;

import org.eclipse.gmt.emfacade.swt.AbstractComposite;
import org.eclipse.gmt.emfacade.swt.Canvas;
import org.eclipse.gmt.emfacade.swt.Composite;
import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.Widget;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage
 * @generated
 */
public class Draw2dSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Draw2dPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Draw2dSwitch() {
		if (modelPackage == null) {
			modelPackage = Draw2dPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Draw2dPackage.DRAW2_DCANVAS: {
				Draw2DCanvas draw2DCanvas = (Draw2DCanvas)theEObject;
				T1 result = caseDraw2DCanvas(draw2DCanvas);
				if (result == null) result = caseCanvas(draw2DCanvas);
				if (result == null) result = caseComposite(draw2DCanvas);
				if (result == null) result = caseAbstractComposite(draw2DCanvas);
				if (result == null) result = caseControl(draw2DCanvas);
				if (result == null) result = caseWidget(draw2DCanvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.FIGURE: {
				Figure figure = (Figure)theEObject;
				T1 result = caseFigure(figure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.LABEL: {
				Label label = (Label)theEObject;
				T1 result = caseLabel(label);
				if (result == null) result = caseFigure(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T1 result = caseShape(shape);
				if (result == null) result = caseFigure(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.RECTANGLE_FIGURE: {
				RectangleFigure rectangleFigure = (RectangleFigure)theEObject;
				T1 result = caseRectangleFigure(rectangleFigure);
				if (result == null) result = caseShape(rectangleFigure);
				if (result == null) result = caseFigure(rectangleFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.ROUNDED_RECTANGLE: {
				RoundedRectangle roundedRectangle = (RoundedRectangle)theEObject;
				T1 result = caseRoundedRectangle(roundedRectangle);
				if (result == null) result = caseShape(roundedRectangle);
				if (result == null) result = caseFigure(roundedRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.ELLIPSE: {
				Ellipse ellipse = (Ellipse)theEObject;
				T1 result = caseEllipse(ellipse);
				if (result == null) result = caseShape(ellipse);
				if (result == null) result = caseFigure(ellipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.TRIANGLE: {
				Triangle triangle = (Triangle)theEObject;
				T1 result = caseTriangle(triangle);
				if (result == null) result = caseShape(triangle);
				if (result == null) result = caseFigure(triangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.POINT_LIST_SHAPE: {
				PointListShape pointListShape = (PointListShape)theEObject;
				T1 result = casePointListShape(pointListShape);
				if (result == null) result = caseShape(pointListShape);
				if (result == null) result = caseFigure(pointListShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.POLYLINE: {
				Polyline polyline = (Polyline)theEObject;
				T1 result = casePolyline(polyline);
				if (result == null) result = casePointListShape(polyline);
				if (result == null) result = caseShape(polyline);
				if (result == null) result = caseFigure(polyline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.POLYGON: {
				Polygon polygon = (Polygon)theEObject;
				T1 result = casePolygon(polygon);
				if (result == null) result = casePolyline(polygon);
				if (result == null) result = casePointListShape(polygon);
				if (result == null) result = caseShape(polygon);
				if (result == null) result = caseFigure(polygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.POLYLINE_SHAPE: {
				PolylineShape polylineShape = (PolylineShape)theEObject;
				T1 result = casePolylineShape(polylineShape);
				if (result == null) result = casePointListShape(polylineShape);
				if (result == null) result = caseShape(polylineShape);
				if (result == null) result = caseFigure(polylineShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.POLYGON_SHAPE: {
				PolygonShape polygonShape = (PolygonShape)theEObject;
				T1 result = casePolygonShape(polygonShape);
				if (result == null) result = casePointListShape(polygonShape);
				if (result == null) result = caseShape(polygonShape);
				if (result == null) result = caseFigure(polygonShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.IMAGE_FIGURE: {
				ImageFigure imageFigure = (ImageFigure)theEObject;
				T1 result = caseImageFigure(imageFigure);
				if (result == null) result = caseFigure(imageFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.CONNECTION_ANCHOR: {
				ConnectionAnchor connectionAnchor = (ConnectionAnchor)theEObject;
				T1 result = caseConnectionAnchor(connectionAnchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.XY_ANCHOR: {
				XYAnchor xyAnchor = (XYAnchor)theEObject;
				T1 result = caseXYAnchor(xyAnchor);
				if (result == null) result = caseConnectionAnchor(xyAnchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.BLOCK_FLOW: {
				BlockFlow blockFlow = (BlockFlow)theEObject;
				T1 result = caseBlockFlow(blockFlow);
				if (result == null) result = caseFigure(blockFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.BORDER: {
				Border border = (Border)theEObject;
				T1 result = caseBorder(border);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.LABELED_BORDER: {
				LabeledBorder labeledBorder = (LabeledBorder)theEObject;
				T1 result = caseLabeledBorder(labeledBorder);
				if (result == null) result = caseBorder(labeledBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.FRAME_BORDER: {
				FrameBorder frameBorder = (FrameBorder)theEObject;
				T1 result = caseFrameBorder(frameBorder);
				if (result == null) result = caseLabeledBorder(frameBorder);
				if (result == null) result = caseBorder(frameBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.COLORED_LABELED_BORDER: {
				ColoredLabeledBorder coloredLabeledBorder = (ColoredLabeledBorder)theEObject;
				T1 result = caseColoredLabeledBorder(coloredLabeledBorder);
				if (result == null) result = caseLabeledBorder(coloredLabeledBorder);
				if (result == null) result = caseBorder(coloredLabeledBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.GROUP_BOX_BORDER: {
				GroupBoxBorder groupBoxBorder = (GroupBoxBorder)theEObject;
				T1 result = caseGroupBoxBorder(groupBoxBorder);
				if (result == null) result = caseColoredLabeledBorder(groupBoxBorder);
				if (result == null) result = caseLabeledBorder(groupBoxBorder);
				if (result == null) result = caseBorder(groupBoxBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.TITLE_BAR_BORDER: {
				TitleBarBorder titleBarBorder = (TitleBarBorder)theEObject;
				T1 result = caseTitleBarBorder(titleBarBorder);
				if (result == null) result = caseColoredLabeledBorder(titleBarBorder);
				if (result == null) result = caseLabeledBorder(titleBarBorder);
				if (result == null) result = caseBorder(titleBarBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Draw2dPackage.FLOW_BORDER: {
				FlowBorder flowBorder = (FlowBorder)theEObject;
				T1 result = caseFlowBorder(flowBorder);
				if (result == null) result = caseBorder(flowBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Draw2 DCanvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Draw2 DCanvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDraw2DCanvas(Draw2DCanvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFigure(Figure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRectangleFigure(RectangleFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRoundedRectangle(RoundedRectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEllipse(Ellipse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTriangle(Triangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point List Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point List Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePointListShape(PointListShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePolyline(Polyline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePolygon(Polygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePolylineShape(PolylineShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePolygonShape(PolygonShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseImageFigure(ImageFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConnectionAnchor(ConnectionAnchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XY Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XY Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXYAnchor(XYAnchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBlockFlow(BlockFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBorder(Border object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabeledBorder(LabeledBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFrameBorder(FrameBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colored Labeled Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colored Labeled Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColoredLabeledBorder(ColoredLabeledBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Box Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Box Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGroupBoxBorder(GroupBoxBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Bar Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Bar Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTitleBarBorder(TitleBarBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFlowBorder(FlowBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Control> T1 caseAbstractComposite(AbstractComposite<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCanvas(Canvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //Draw2dSwitch
