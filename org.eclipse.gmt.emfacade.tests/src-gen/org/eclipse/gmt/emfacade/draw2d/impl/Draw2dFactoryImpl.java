/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d.impl;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmt.emfacade.draw2d.Alignment;
import org.eclipse.gmt.emfacade.draw2d.BlockFlow;
import org.eclipse.gmt.emfacade.draw2d.Direction;
import org.eclipse.gmt.emfacade.draw2d.Draw2DCanvas;
import org.eclipse.gmt.emfacade.draw2d.Draw2dFactory;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;
import org.eclipse.gmt.emfacade.draw2d.Ellipse;
import org.eclipse.gmt.emfacade.draw2d.Figure;
import org.eclipse.gmt.emfacade.draw2d.FlowBorder;
import org.eclipse.gmt.emfacade.draw2d.FrameBorder;
import org.eclipse.gmt.emfacade.draw2d.GroupBoxBorder;
import org.eclipse.gmt.emfacade.draw2d.ImageFigure;
import org.eclipse.gmt.emfacade.draw2d.Label;
import org.eclipse.gmt.emfacade.draw2d.Orientation;
import org.eclipse.gmt.emfacade.draw2d.Polygon;
import org.eclipse.gmt.emfacade.draw2d.PolygonShape;
import org.eclipse.gmt.emfacade.draw2d.Polyline;
import org.eclipse.gmt.emfacade.draw2d.PolylineShape;
import org.eclipse.gmt.emfacade.draw2d.RectangleFigure;
import org.eclipse.gmt.emfacade.draw2d.RoundedRectangle;
import org.eclipse.gmt.emfacade.draw2d.TitleBarBorder;
import org.eclipse.gmt.emfacade.draw2d.Triangle;
import org.eclipse.gmt.emfacade.draw2d.XYAnchor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Draw2dFactoryImpl extends EFactoryImpl implements Draw2dFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Draw2dFactory init() {
		try {
			Draw2dFactory theDraw2dFactory = (Draw2dFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.gmt.emfacade.draw2d"); 
			if (theDraw2dFactory != null) {
				return theDraw2dFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Draw2dFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Draw2dFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Draw2dPackage.DRAW2_DCANVAS: return createDraw2DCanvas();
			case Draw2dPackage.FIGURE: return createFigure();
			case Draw2dPackage.LABEL: return createLabel();
			case Draw2dPackage.RECTANGLE_FIGURE: return createRectangleFigure();
			case Draw2dPackage.ROUNDED_RECTANGLE: return createRoundedRectangle();
			case Draw2dPackage.ELLIPSE: return createEllipse();
			case Draw2dPackage.TRIANGLE: return createTriangle();
			case Draw2dPackage.POLYLINE: return createPolyline();
			case Draw2dPackage.POLYGON: return createPolygon();
			case Draw2dPackage.POLYLINE_SHAPE: return createPolylineShape();
			case Draw2dPackage.POLYGON_SHAPE: return createPolygonShape();
			case Draw2dPackage.IMAGE_FIGURE: return createImageFigure();
			case Draw2dPackage.XY_ANCHOR: return createXYAnchor();
			case Draw2dPackage.BLOCK_FLOW: return createBlockFlow();
			case Draw2dPackage.FRAME_BORDER: return createFrameBorder();
			case Draw2dPackage.GROUP_BOX_BORDER: return createGroupBoxBorder();
			case Draw2dPackage.TITLE_BAR_BORDER: return createTitleBarBorder();
			case Draw2dPackage.FLOW_BORDER: return createFlowBorder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Draw2dPackage.ALIGNMENT:
				return createAlignmentFromString(eDataType, initialValue);
			case Draw2dPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case Draw2dPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case Draw2dPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case Draw2dPackage.DIMENSION:
				return createDimensionFromString(eDataType, initialValue);
			case Draw2dPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Draw2dPackage.ALIGNMENT:
				return convertAlignmentToString(eDataType, instanceValue);
			case Draw2dPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case Draw2dPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case Draw2dPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case Draw2dPackage.DIMENSION:
				return convertDimensionToString(eDataType, instanceValue);
			case Draw2dPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Draw2DCanvas createDraw2DCanvas() {
		Draw2DCanvasImpl draw2DCanvas = new Draw2DCanvasImpl();
		return draw2DCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure createFigure() {
		FigureImpl figure = new FigureImpl();
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangleFigure createRectangleFigure() {
		RectangleFigureImpl rectangleFigure = new RectangleFigureImpl();
		return rectangleFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundedRectangle createRoundedRectangle() {
		RoundedRectangleImpl roundedRectangle = new RoundedRectangleImpl();
		return roundedRectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ellipse createEllipse() {
		EllipseImpl ellipse = new EllipseImpl();
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triangle createTriangle() {
		TriangleImpl triangle = new TriangleImpl();
		return triangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polyline createPolyline() {
		PolylineImpl polyline = new PolylineImpl();
		return polyline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolylineShape createPolylineShape() {
		PolylineShapeImpl polylineShape = new PolylineShapeImpl();
		return polylineShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonShape createPolygonShape() {
		PolygonShapeImpl polygonShape = new PolygonShapeImpl();
		return polygonShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFigure createImageFigure() {
		ImageFigureImpl imageFigure = new ImageFigureImpl();
		return imageFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYAnchor createXYAnchor() {
		XYAnchorImpl xyAnchor = new XYAnchorImpl();
		return xyAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockFlow createBlockFlow() {
		BlockFlowImpl blockFlow = new BlockFlowImpl();
		return blockFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameBorder createFrameBorder() {
		FrameBorderImpl frameBorder = new FrameBorderImpl();
		return frameBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupBoxBorder createGroupBoxBorder() {
		GroupBoxBorderImpl groupBoxBorder = new GroupBoxBorderImpl();
		return groupBoxBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleBarBorder createTitleBarBorder() {
		TitleBarBorderImpl titleBarBorder = new TitleBarBorderImpl();
		return titleBarBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowBorder createFlowBorder() {
		FlowBorderImpl flowBorder = new FlowBorderImpl();
		return flowBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment createAlignmentFromString(EDataType eDataType, String initialValue) {
		Alignment result = Alignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		return (Point)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimensionFromString(EDataType eDataType, String initialValue) {
		return (Dimension)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		return (Rectangle)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Draw2dPackage getDraw2dPackage() {
		return (Draw2dPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Draw2dPackage getPackage() {
		return Draw2dPackage.eINSTANCE;
	}

} //Draw2dFactoryImpl
