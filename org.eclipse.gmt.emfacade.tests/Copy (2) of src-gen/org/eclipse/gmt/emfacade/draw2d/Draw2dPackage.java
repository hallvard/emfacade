/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.eclipse.gmt.emfacade'"
 * @generated
 */
public interface Draw2dPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "draw2d";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.gmt.emfacade.draw2d";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "draw2d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Draw2dPackage eINSTANCE = org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.Draw2DCanvasImpl <em>Draw2 DCanvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2DCanvasImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getDraw2DCanvas()
	 * @generated
	 */
	int DRAW2_DCANVAS = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__STYLE = SwtPackage.CANVAS__STYLE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__PARENT = SwtPackage.CANVAS__PARENT;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__BORDER_STYLE = SwtPackage.CANVAS__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__TEXT_ORIENTATION_STYLE = SwtPackage.CANVAS__TEXT_ORIENTATION_STYLE;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__LAYOUT_DATA = SwtPackage.CANVAS__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__ENABLED = SwtPackage.CANVAS__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__VISIBLE = SwtPackage.CANVAS__VISIBLE;

	/**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__TOUCH_ENABLED = SwtPackage.CANVAS__TOUCH_ENABLED;

	/**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__TOOL_TIP_TEXT = SwtPackage.CANVAS__TOOL_TIP_TEXT;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__BACKGROUND = SwtPackage.CANVAS__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__FONT = SwtPackage.CANVAS__FONT;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__CONTROLS = SwtPackage.CANVAS__CONTROLS;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__LAYOUT = SwtPackage.CANVAS__LAYOUT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS__CONTENTS = SwtPackage.CANVAS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Draw2 DCanvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS_FEATURE_COUNT = SwtPackage.CANVAS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Draw2 DCanvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAW2_DCANVAS_OPERATION_COUNT = SwtPackage.CANVAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl <em>Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__VISIBLE = 1;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__OPAQUE = 2;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FOCUS_TRAVERSABLE = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__PARENT = 5;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__BOUNDS = 6;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__MINIMUM_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__PREFERRED_SIZE = 8;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__MAXIMUM_SIZE = 9;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__TOOL_TIP = 10;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__BACKGROUND_COLOR = 11;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FOREGROUND_COLOR = 12;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FONT = 13;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__BORDER = 14;

	/**
	 * The number of structural features of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ENABLED = FIGURE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VISIBLE = FIGURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OPAQUE = FIGURE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FOCUS_TRAVERSABLE = FIGURE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BOUNDS = FIGURE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TOOL_TIP = FIGURE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER = FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_ALIGNMENT = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_PLACEMENT = FIGURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ICON = FIGURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ICON_ALIGNMENT = FIGURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon Text Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ICON_TEXT_GAP = FIGURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 3;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ENABLED = FIGURE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__VISIBLE = FIGURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OPAQUE = FIGURE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FOCUS_TRAVERSABLE = FIGURE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BOUNDS = FIGURE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TOOL_TIP = FIGURE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BORDER = FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL_XOR = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OUTLINE = FIGURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OUTLINE_XOR = FIGURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ALPHA = FIGURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ANTIALIAS = FIGURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_WIDTH_FLOAT = FIGURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_STYLE = FIGURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_CAP = FIGURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_JOIN = FIGURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_DASH = FIGURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_DASH_OFFSET = FIGURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_MITER_LIMIT = FIGURE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.RectangleFigureImpl <em>Rectangle Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.RectangleFigureImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getRectangleFigure()
	 * @generated
	 */
	int RECTANGLE_FIGURE = 4;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__ENABLED = SHAPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__VISIBLE = SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__OPAQUE = SHAPE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__FOCUS_TRAVERSABLE = SHAPE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__TOOL_TIP = SHAPE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__BORDER = SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__FILL_XOR = SHAPE__FILL_XOR;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__OUTLINE_XOR = SHAPE__OUTLINE_XOR;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__ALPHA = SHAPE__ALPHA;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__ANTIALIAS = SHAPE__ANTIALIAS;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__LINE_WIDTH_FLOAT = SHAPE__LINE_WIDTH_FLOAT;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__LINE_STYLE = SHAPE__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__LINE_CAP = SHAPE__LINE_CAP;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__LINE_JOIN = SHAPE__LINE_JOIN;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__LINE_DASH = SHAPE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__LINE_DASH_OFFSET = SHAPE__LINE_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE__LINE_MITER_LIMIT = SHAPE__LINE_MITER_LIMIT;

	/**
	 * The number of structural features of the '<em>Rectangle Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rectangle Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FIGURE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.RoundedRectangleImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getRoundedRectangle()
	 * @generated
	 */
	int ROUNDED_RECTANGLE = 5;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__ENABLED = SHAPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__VISIBLE = SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__OPAQUE = SHAPE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FOCUS_TRAVERSABLE = SHAPE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__TOOL_TIP = SHAPE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__BORDER = SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FILL_XOR = SHAPE__FILL_XOR;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__OUTLINE_XOR = SHAPE__OUTLINE_XOR;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__ALPHA = SHAPE__ALPHA;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__ANTIALIAS = SHAPE__ANTIALIAS;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_WIDTH_FLOAT = SHAPE__LINE_WIDTH_FLOAT;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_STYLE = SHAPE__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_CAP = SHAPE__LINE_CAP;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_JOIN = SHAPE__LINE_JOIN;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_DASH = SHAPE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_DASH_OFFSET = SHAPE__LINE_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_MITER_LIMIT = SHAPE__LINE_MITER_LIMIT;

	/**
	 * The feature id for the '<em><b>Corner Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__CORNER_DIMENSIONS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.EllipseImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 6;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ENABLED = SHAPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__VISIBLE = SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__OPAQUE = SHAPE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FOCUS_TRAVERSABLE = SHAPE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__TOOL_TIP = SHAPE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BORDER = SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FILL_XOR = SHAPE__FILL_XOR;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__OUTLINE_XOR = SHAPE__OUTLINE_XOR;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ALPHA = SHAPE__ALPHA;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ANTIALIAS = SHAPE__ANTIALIAS;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_WIDTH_FLOAT = SHAPE__LINE_WIDTH_FLOAT;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_STYLE = SHAPE__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_CAP = SHAPE__LINE_CAP;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_JOIN = SHAPE__LINE_JOIN;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_DASH = SHAPE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_DASH_OFFSET = SHAPE__LINE_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_MITER_LIMIT = SHAPE__LINE_MITER_LIMIT;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.TriangleImpl <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.TriangleImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getTriangle()
	 * @generated
	 */
	int TRIANGLE = 7;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__ENABLED = SHAPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__VISIBLE = SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__OPAQUE = SHAPE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__FOCUS_TRAVERSABLE = SHAPE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__TOOL_TIP = SHAPE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__BORDER = SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__FILL_XOR = SHAPE__FILL_XOR;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__OUTLINE_XOR = SHAPE__OUTLINE_XOR;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__ALPHA = SHAPE__ALPHA;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__ANTIALIAS = SHAPE__ANTIALIAS;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LINE_WIDTH_FLOAT = SHAPE__LINE_WIDTH_FLOAT;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LINE_STYLE = SHAPE__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LINE_CAP = SHAPE__LINE_CAP;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LINE_JOIN = SHAPE__LINE_JOIN;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LINE_DASH = SHAPE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LINE_DASH_OFFSET = SHAPE__LINE_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LINE_MITER_LIMIT = SHAPE__LINE_MITER_LIMIT;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__ORIENTATION = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__DIRECTION = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PointListShapeImpl <em>Point List Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.PointListShapeImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPointListShape()
	 * @generated
	 */
	int POINT_LIST_SHAPE = 8;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__ENABLED = SHAPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__VISIBLE = SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__OPAQUE = SHAPE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__FOCUS_TRAVERSABLE = SHAPE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__TOOL_TIP = SHAPE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__BORDER = SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__FILL_XOR = SHAPE__FILL_XOR;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__OUTLINE_XOR = SHAPE__OUTLINE_XOR;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__ALPHA = SHAPE__ALPHA;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__ANTIALIAS = SHAPE__ANTIALIAS;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__LINE_WIDTH_FLOAT = SHAPE__LINE_WIDTH_FLOAT;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__LINE_STYLE = SHAPE__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__LINE_CAP = SHAPE__LINE_CAP;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__LINE_JOIN = SHAPE__LINE_JOIN;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__LINE_DASH = SHAPE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__LINE_DASH_OFFSET = SHAPE__LINE_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__LINE_MITER_LIMIT = SHAPE__LINE_MITER_LIMIT;

	/**
	 * The feature id for the '<em><b>Point List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE__POINT_LIST = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point List Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point List Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIST_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PolylineImpl <em>Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.PolylineImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 9;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__ENABLED = POINT_LIST_SHAPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__VISIBLE = POINT_LIST_SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__OPAQUE = POINT_LIST_SHAPE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FOCUS_TRAVERSABLE = POINT_LIST_SHAPE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__CHILDREN = POINT_LIST_SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__PARENT = POINT_LIST_SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__BOUNDS = POINT_LIST_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MINIMUM_SIZE = POINT_LIST_SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__PREFERRED_SIZE = POINT_LIST_SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MAXIMUM_SIZE = POINT_LIST_SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__TOOL_TIP = POINT_LIST_SHAPE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__BACKGROUND_COLOR = POINT_LIST_SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FOREGROUND_COLOR = POINT_LIST_SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FONT = POINT_LIST_SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__BORDER = POINT_LIST_SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FILL = POINT_LIST_SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FILL_XOR = POINT_LIST_SHAPE__FILL_XOR;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__OUTLINE = POINT_LIST_SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__OUTLINE_XOR = POINT_LIST_SHAPE__OUTLINE_XOR;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__ALPHA = POINT_LIST_SHAPE__ALPHA;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__ANTIALIAS = POINT_LIST_SHAPE__ANTIALIAS;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_WIDTH_FLOAT = POINT_LIST_SHAPE__LINE_WIDTH_FLOAT;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_STYLE = POINT_LIST_SHAPE__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_CAP = POINT_LIST_SHAPE__LINE_CAP;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_JOIN = POINT_LIST_SHAPE__LINE_JOIN;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_DASH = POINT_LIST_SHAPE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_DASH_OFFSET = POINT_LIST_SHAPE__LINE_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_MITER_LIMIT = POINT_LIST_SHAPE__LINE_MITER_LIMIT;

	/**
	 * The feature id for the '<em><b>Point List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__POINT_LIST = POINT_LIST_SHAPE__POINT_LIST;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__TOLERANCE = POINT_LIST_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_FEATURE_COUNT = POINT_LIST_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_OPERATION_COUNT = POINT_LIST_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.PolygonImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 10;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__ENABLED = POLYLINE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__VISIBLE = POLYLINE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__OPAQUE = POLYLINE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FOCUS_TRAVERSABLE = POLYLINE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__CHILDREN = POLYLINE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__PARENT = POLYLINE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BOUNDS = POLYLINE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MINIMUM_SIZE = POLYLINE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__PREFERRED_SIZE = POLYLINE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MAXIMUM_SIZE = POLYLINE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TOOL_TIP = POLYLINE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BACKGROUND_COLOR = POLYLINE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FOREGROUND_COLOR = POLYLINE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FONT = POLYLINE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BORDER = POLYLINE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FILL = POLYLINE__FILL;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FILL_XOR = POLYLINE__FILL_XOR;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__OUTLINE = POLYLINE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__OUTLINE_XOR = POLYLINE__OUTLINE_XOR;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__ALPHA = POLYLINE__ALPHA;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__ANTIALIAS = POLYLINE__ANTIALIAS;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_WIDTH_FLOAT = POLYLINE__LINE_WIDTH_FLOAT;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_STYLE = POLYLINE__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_CAP = POLYLINE__LINE_CAP;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_JOIN = POLYLINE__LINE_JOIN;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_DASH = POLYLINE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_DASH_OFFSET = POLYLINE__LINE_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_MITER_LIMIT = POLYLINE__LINE_MITER_LIMIT;

	/**
	 * The feature id for the '<em><b>Point List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__POINT_LIST = POLYLINE__POINT_LIST;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TOLERANCE = POLYLINE__TOLERANCE;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = POLYLINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = POLYLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PolylineShapeImpl <em>Polyline Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.PolylineShapeImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPolylineShape()
	 * @generated
	 */
	int POLYLINE_SHAPE = 11;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__ENABLED = POINT_LIST_SHAPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__VISIBLE = POINT_LIST_SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__OPAQUE = POINT_LIST_SHAPE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__FOCUS_TRAVERSABLE = POINT_LIST_SHAPE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__CHILDREN = POINT_LIST_SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__PARENT = POINT_LIST_SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__BOUNDS = POINT_LIST_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__MINIMUM_SIZE = POINT_LIST_SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__PREFERRED_SIZE = POINT_LIST_SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__MAXIMUM_SIZE = POINT_LIST_SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__TOOL_TIP = POINT_LIST_SHAPE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__BACKGROUND_COLOR = POINT_LIST_SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__FOREGROUND_COLOR = POINT_LIST_SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__FONT = POINT_LIST_SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__BORDER = POINT_LIST_SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__FILL = POINT_LIST_SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__FILL_XOR = POINT_LIST_SHAPE__FILL_XOR;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__OUTLINE = POINT_LIST_SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__OUTLINE_XOR = POINT_LIST_SHAPE__OUTLINE_XOR;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__ALPHA = POINT_LIST_SHAPE__ALPHA;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__ANTIALIAS = POINT_LIST_SHAPE__ANTIALIAS;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__LINE_WIDTH_FLOAT = POINT_LIST_SHAPE__LINE_WIDTH_FLOAT;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__LINE_STYLE = POINT_LIST_SHAPE__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__LINE_CAP = POINT_LIST_SHAPE__LINE_CAP;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__LINE_JOIN = POINT_LIST_SHAPE__LINE_JOIN;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__LINE_DASH = POINT_LIST_SHAPE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__LINE_DASH_OFFSET = POINT_LIST_SHAPE__LINE_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__LINE_MITER_LIMIT = POINT_LIST_SHAPE__LINE_MITER_LIMIT;

	/**
	 * The feature id for the '<em><b>Point List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__POINT_LIST = POINT_LIST_SHAPE__POINT_LIST;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE__TOLERANCE = POINT_LIST_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polyline Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE_FEATURE_COUNT = POINT_LIST_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polyline Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_SHAPE_OPERATION_COUNT = POINT_LIST_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PolygonShapeImpl <em>Polygon Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.PolygonShapeImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPolygonShape()
	 * @generated
	 */
	int POLYGON_SHAPE = 12;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__ENABLED = POINT_LIST_SHAPE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__VISIBLE = POINT_LIST_SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__OPAQUE = POINT_LIST_SHAPE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__FOCUS_TRAVERSABLE = POINT_LIST_SHAPE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__CHILDREN = POINT_LIST_SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__PARENT = POINT_LIST_SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__BOUNDS = POINT_LIST_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__MINIMUM_SIZE = POINT_LIST_SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__PREFERRED_SIZE = POINT_LIST_SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__MAXIMUM_SIZE = POINT_LIST_SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__TOOL_TIP = POINT_LIST_SHAPE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__BACKGROUND_COLOR = POINT_LIST_SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__FOREGROUND_COLOR = POINT_LIST_SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__FONT = POINT_LIST_SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__BORDER = POINT_LIST_SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__FILL = POINT_LIST_SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__FILL_XOR = POINT_LIST_SHAPE__FILL_XOR;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__OUTLINE = POINT_LIST_SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__OUTLINE_XOR = POINT_LIST_SHAPE__OUTLINE_XOR;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__ALPHA = POINT_LIST_SHAPE__ALPHA;

	/**
	 * The feature id for the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__ANTIALIAS = POINT_LIST_SHAPE__ANTIALIAS;

	/**
	 * The feature id for the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__LINE_WIDTH_FLOAT = POINT_LIST_SHAPE__LINE_WIDTH_FLOAT;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__LINE_STYLE = POINT_LIST_SHAPE__LINE_STYLE;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__LINE_CAP = POINT_LIST_SHAPE__LINE_CAP;

	/**
	 * The feature id for the '<em><b>Line Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__LINE_JOIN = POINT_LIST_SHAPE__LINE_JOIN;

	/**
	 * The feature id for the '<em><b>Line Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__LINE_DASH = POINT_LIST_SHAPE__LINE_DASH;

	/**
	 * The feature id for the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__LINE_DASH_OFFSET = POINT_LIST_SHAPE__LINE_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__LINE_MITER_LIMIT = POINT_LIST_SHAPE__LINE_MITER_LIMIT;

	/**
	 * The feature id for the '<em><b>Point List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE__POINT_LIST = POINT_LIST_SHAPE__POINT_LIST;

	/**
	 * The number of structural features of the '<em>Polygon Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_FEATURE_COUNT = POINT_LIST_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polygon Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_OPERATION_COUNT = POINT_LIST_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.ImageFigureImpl <em>Image Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.ImageFigureImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getImageFigure()
	 * @generated
	 */
	int IMAGE_FIGURE = 13;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__ENABLED = FIGURE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__VISIBLE = FIGURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__OPAQUE = FIGURE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__FOCUS_TRAVERSABLE = FIGURE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__BOUNDS = FIGURE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__TOOL_TIP = FIGURE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__BORDER = FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE__IMAGE = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FIGURE_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.ConnectionAnchorImpl <em>Connection Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.ConnectionAnchorImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getConnectionAnchor()
	 * @generated
	 */
	int CONNECTION_ANCHOR = 14;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ANCHOR__OWNER = 0;

	/**
	 * The number of structural features of the '<em>Connection Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ANCHOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connection Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ANCHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.XYAnchorImpl <em>XY Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.XYAnchorImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getXYAnchor()
	 * @generated
	 */
	int XY_ANCHOR = 15;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_ANCHOR__OWNER = CONNECTION_ANCHOR__OWNER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_ANCHOR__LOCATION = CONNECTION_ANCHOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XY Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_ANCHOR_FEATURE_COUNT = CONNECTION_ANCHOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XY Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_ANCHOR_OPERATION_COUNT = CONNECTION_ANCHOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.BlockFlowImpl <em>Block Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.BlockFlowImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getBlockFlow()
	 * @generated
	 */
	int BLOCK_FLOW = 16;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__ENABLED = FIGURE__ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__VISIBLE = FIGURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__OPAQUE = FIGURE__OPAQUE;

	/**
	 * The feature id for the '<em><b>Focus Traversable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__FOCUS_TRAVERSABLE = FIGURE__FOCUS_TRAVERSABLE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__CHILDREN = FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__PARENT = FIGURE__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__BOUNDS = FIGURE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__TOOL_TIP = FIGURE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__BORDER = FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW__ORIENTATION = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FLOW_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.BorderImpl <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.BorderImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 17;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__OPAQUE = 0;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.LabeledBorderImpl <em>Labeled Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.LabeledBorderImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getLabeledBorder()
	 * @generated
	 */
	int LABELED_BORDER = 18;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_BORDER__OPAQUE = BORDER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_BORDER__LABEL = BORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_BORDER__FONT = BORDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Labeled Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Labeled Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_BORDER_OPERATION_COUNT = BORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.FrameBorderImpl <em>Frame Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.FrameBorderImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getFrameBorder()
	 * @generated
	 */
	int FRAME_BORDER = 19;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_BORDER__OPAQUE = LABELED_BORDER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_BORDER__LABEL = LABELED_BORDER__LABEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_BORDER__FONT = LABELED_BORDER__FONT;

	/**
	 * The number of structural features of the '<em>Frame Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_BORDER_FEATURE_COUNT = LABELED_BORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Frame Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_BORDER_OPERATION_COUNT = LABELED_BORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.ColoredLabeledBorderImpl <em>Colored Labeled Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.ColoredLabeledBorderImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getColoredLabeledBorder()
	 * @generated
	 */
	int COLORED_LABELED_BORDER = 20;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_LABELED_BORDER__OPAQUE = LABELED_BORDER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_LABELED_BORDER__LABEL = LABELED_BORDER__LABEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_LABELED_BORDER__FONT = LABELED_BORDER__FONT;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_LABELED_BORDER__TEXT_COLOR = LABELED_BORDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colored Labeled Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_LABELED_BORDER_FEATURE_COUNT = LABELED_BORDER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Colored Labeled Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_LABELED_BORDER_OPERATION_COUNT = LABELED_BORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.GroupBoxBorderImpl <em>Group Box Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.GroupBoxBorderImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getGroupBoxBorder()
	 * @generated
	 */
	int GROUP_BOX_BORDER = 21;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX_BORDER__OPAQUE = COLORED_LABELED_BORDER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX_BORDER__LABEL = COLORED_LABELED_BORDER__LABEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX_BORDER__FONT = COLORED_LABELED_BORDER__FONT;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX_BORDER__TEXT_COLOR = COLORED_LABELED_BORDER__TEXT_COLOR;

	/**
	 * The number of structural features of the '<em>Group Box Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX_BORDER_FEATURE_COUNT = COLORED_LABELED_BORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Box Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BOX_BORDER_OPERATION_COUNT = COLORED_LABELED_BORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.TitleBarBorderImpl <em>Title Bar Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.TitleBarBorderImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getTitleBarBorder()
	 * @generated
	 */
	int TITLE_BAR_BORDER = 22;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_BAR_BORDER__OPAQUE = COLORED_LABELED_BORDER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_BAR_BORDER__LABEL = COLORED_LABELED_BORDER__LABEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_BAR_BORDER__FONT = COLORED_LABELED_BORDER__FONT;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_BAR_BORDER__TEXT_COLOR = COLORED_LABELED_BORDER__TEXT_COLOR;

	/**
	 * The number of structural features of the '<em>Title Bar Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_BAR_BORDER_FEATURE_COUNT = COLORED_LABELED_BORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Title Bar Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_BAR_BORDER_OPERATION_COUNT = COLORED_LABELED_BORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.FlowBorderImpl <em>Flow Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.FlowBorderImpl
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getFlowBorder()
	 * @generated
	 */
	int FLOW_BORDER = 23;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_BORDER__OPAQUE = BORDER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Left Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_BORDER__LEFT_MARGIN = BORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_BORDER__RIGHT_MARGIN = BORDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Top Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_BORDER__TOP_MARGIN = BORDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bottom Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_BORDER__BOTTOM_MARGIN = BORDER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Flow Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_BORDER_OPERATION_COUNT = BORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.Alignment <em>Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.Alignment
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.Orientation
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.draw2d.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.draw2d.Direction
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 26;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 27;

	/**
	 * The meta object id for the '<em>Dimension</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Dimension
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 28;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 29;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.Draw2DCanvas <em>Draw2 DCanvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Draw2 DCanvas</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2DCanvas
	 * @generated
	 */
	EClass getDraw2DCanvas();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.draw2d.Draw2DCanvas#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contents</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2DCanvas#getContents()
	 * @see #getDraw2DCanvas()
	 * @generated
	 */
	EReference getDraw2DCanvas_Contents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Figure#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#isEnabled()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Figure#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#isVisible()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Figure#isOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#isOpaque()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_Opaque();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Figure#isFocusTraversable <em>Focus Traversable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focus Traversable</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#isFocusTraversable()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_FocusTraversable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getChildren()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getParent()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounds</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getBounds()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getMinimumSize <em>Minimum Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Size</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getMinimumSize()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_MinimumSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getPreferredSize <em>Preferred Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Size</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getPreferredSize()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_PreferredSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getMaximumSize <em>Maximum Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Size</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getMaximumSize()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_MaximumSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getToolTip <em>Tool Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool Tip</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getToolTip()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_ToolTip();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background Color</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getBackgroundColor()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_BackgroundColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreground Color</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getForegroundColor()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_ForegroundColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getFont()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Font();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.draw2d.Figure#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Border</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Figure#getBorder()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Border();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Label#getTextAlignment <em>Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Alignment</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Label#getTextAlignment()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Label#getTextPlacement <em>Text Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Placement</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Label#getTextPlacement()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextPlacement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Label#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Label#getIcon()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Label#getIconAlignment <em>Icon Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Alignment</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Label#getIconAlignment()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_IconAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Label#getIconTextGap <em>Icon Text Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Text Gap</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Label#getIconTextGap()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_IconTextGap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#isFill()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#isFillXOR <em>Fill XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill XOR</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#isFillXOR()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_FillXOR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#isOutline()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Outline();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#isOutlineXOR <em>Outline XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline XOR</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#isOutlineXOR()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_OutlineXOR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#getAlpha()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getAntialias <em>Antialias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antialias</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#getAntialias()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Antialias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineWidthFloat <em>Line Width Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width Float</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#getLineWidthFloat()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineWidthFloat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#getLineStyle()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineCap <em>Line Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Cap</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#getLineCap()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineCap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineJoin <em>Line Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Join</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#getLineJoin()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineJoin();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineDash <em>Line Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line Dash</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#getLineDash()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineDash();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineDashOffset <em>Line Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Dash Offset</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#getLineDashOffset()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineDashOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineMiterLimit <em>Line Miter Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Miter Limit</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Shape#getLineMiterLimit()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineMiterLimit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.RectangleFigure <em>Rectangle Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle Figure</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.RectangleFigure
	 * @generated
	 */
	EClass getRectangleFigure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.RoundedRectangle <em>Rounded Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rounded Rectangle</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.RoundedRectangle
	 * @generated
	 */
	EClass getRoundedRectangle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.RoundedRectangle#getCornerDimensions <em>Corner Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Dimensions</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.RoundedRectangle#getCornerDimensions()
	 * @see #getRoundedRectangle()
	 * @generated
	 */
	EAttribute getRoundedRectangle_CornerDimensions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Triangle
	 * @generated
	 */
	EClass getTriangle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Triangle#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Triangle#getOrientation()
	 * @see #getTriangle()
	 * @generated
	 */
	EAttribute getTriangle_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Triangle#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Triangle#getDirection()
	 * @see #getTriangle()
	 * @generated
	 */
	EAttribute getTriangle_Direction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.PointListShape <em>Point List Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point List Shape</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.PointListShape
	 * @generated
	 */
	EClass getPointListShape();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmt.emfacade.draw2d.PointListShape#getPointList <em>Point List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Point List</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.PointListShape#getPointList()
	 * @see #getPointListShape()
	 * @generated
	 */
	EAttribute getPointListShape_PointList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Polyline
	 * @generated
	 */
	EClass getPolyline();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Polyline#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Polyline#getTolerance()
	 * @see #getPolyline()
	 * @generated
	 */
	EAttribute getPolyline_Tolerance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.PolylineShape <em>Polyline Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline Shape</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.PolylineShape
	 * @generated
	 */
	EClass getPolylineShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.PolylineShape#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.PolylineShape#getTolerance()
	 * @see #getPolylineShape()
	 * @generated
	 */
	EAttribute getPolylineShape_Tolerance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.PolygonShape <em>Polygon Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Shape</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.PolygonShape
	 * @generated
	 */
	EClass getPolygonShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.ImageFigure <em>Image Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Figure</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.ImageFigure
	 * @generated
	 */
	EClass getImageFigure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.ImageFigure#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.ImageFigure#getImage()
	 * @see #getImageFigure()
	 * @generated
	 */
	EAttribute getImageFigure_Image();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.ConnectionAnchor <em>Connection Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Anchor</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.ConnectionAnchor
	 * @generated
	 */
	EClass getConnectionAnchor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.draw2d.ConnectionAnchor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.ConnectionAnchor#getOwner()
	 * @see #getConnectionAnchor()
	 * @generated
	 */
	EReference getConnectionAnchor_Owner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.XYAnchor <em>XY Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY Anchor</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.XYAnchor
	 * @generated
	 */
	EClass getXYAnchor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.XYAnchor#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.XYAnchor#getLocation()
	 * @see #getXYAnchor()
	 * @generated
	 */
	EAttribute getXYAnchor_Location();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.BlockFlow <em>Block Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Flow</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.BlockFlow
	 * @generated
	 */
	EClass getBlockFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.BlockFlow#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.BlockFlow#getOrientation()
	 * @see #getBlockFlow()
	 * @generated
	 */
	EAttribute getBlockFlow_Orientation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.Border#isOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Border#isOpaque()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Opaque();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.LabeledBorder <em>Labeled Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Border</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.LabeledBorder
	 * @generated
	 */
	EClass getLabeledBorder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.LabeledBorder#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.LabeledBorder#getLabel()
	 * @see #getLabeledBorder()
	 * @generated
	 */
	EAttribute getLabeledBorder_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.draw2d.LabeledBorder#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.LabeledBorder#getFont()
	 * @see #getLabeledBorder()
	 * @generated
	 */
	EReference getLabeledBorder_Font();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.FrameBorder <em>Frame Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Border</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.FrameBorder
	 * @generated
	 */
	EClass getFrameBorder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.ColoredLabeledBorder <em>Colored Labeled Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Labeled Border</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.ColoredLabeledBorder
	 * @generated
	 */
	EClass getColoredLabeledBorder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.draw2d.ColoredLabeledBorder#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.ColoredLabeledBorder#getTextColor()
	 * @see #getColoredLabeledBorder()
	 * @generated
	 */
	EReference getColoredLabeledBorder_TextColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.GroupBoxBorder <em>Group Box Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Box Border</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.GroupBoxBorder
	 * @generated
	 */
	EClass getGroupBoxBorder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.TitleBarBorder <em>Title Bar Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Bar Border</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.TitleBarBorder
	 * @generated
	 */
	EClass getTitleBarBorder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.draw2d.FlowBorder <em>Flow Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Border</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.FlowBorder
	 * @generated
	 */
	EClass getFlowBorder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.FlowBorder#getLeftMargin <em>Left Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Margin</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.FlowBorder#getLeftMargin()
	 * @see #getFlowBorder()
	 * @generated
	 */
	EAttribute getFlowBorder_LeftMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.FlowBorder#getRightMargin <em>Right Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Margin</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.FlowBorder#getRightMargin()
	 * @see #getFlowBorder()
	 * @generated
	 */
	EAttribute getFlowBorder_RightMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.FlowBorder#getTopMargin <em>Top Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Margin</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.FlowBorder#getTopMargin()
	 * @see #getFlowBorder()
	 * @generated
	 */
	EAttribute getFlowBorder_TopMargin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.draw2d.FlowBorder#getBottomMargin <em>Bottom Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Margin</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.FlowBorder#getBottomMargin()
	 * @see #getFlowBorder()
	 * @generated
	 */
	EAttribute getFlowBorder_BottomMargin();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.draw2d.Alignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Alignment
	 * @generated
	 */
	EEnum getAlignment();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.draw2d.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.draw2d.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see org.eclipse.gmt.emfacade.draw2d.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dimension</em>'.
	 * @see org.eclipse.draw2d.geometry.Dimension
	 * @model instanceClass="org.eclipse.draw2d.geometry.Dimension"
	 * @generated
	 */
	EDataType getDimension();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Draw2dFactory getDraw2dFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.Draw2DCanvasImpl <em>Draw2 DCanvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2DCanvasImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getDraw2DCanvas()
		 * @generated
		 */
		EClass DRAW2_DCANVAS = eINSTANCE.getDraw2DCanvas();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAW2_DCANVAS__CONTENTS = eINSTANCE.getDraw2DCanvas_Contents();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl <em>Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.FigureImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getFigure()
		 * @generated
		 */
		EClass FIGURE = eINSTANCE.getFigure();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__ENABLED = eINSTANCE.getFigure_Enabled();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__VISIBLE = eINSTANCE.getFigure_Visible();

		/**
		 * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__OPAQUE = eINSTANCE.getFigure_Opaque();

		/**
		 * The meta object literal for the '<em><b>Focus Traversable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__FOCUS_TRAVERSABLE = eINSTANCE.getFigure_FocusTraversable();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__CHILDREN = eINSTANCE.getFigure_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__PARENT = eINSTANCE.getFigure_Parent();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__BOUNDS = eINSTANCE.getFigure_Bounds();

		/**
		 * The meta object literal for the '<em><b>Minimum Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__MINIMUM_SIZE = eINSTANCE.getFigure_MinimumSize();

		/**
		 * The meta object literal for the '<em><b>Preferred Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__PREFERRED_SIZE = eINSTANCE.getFigure_PreferredSize();

		/**
		 * The meta object literal for the '<em><b>Maximum Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__MAXIMUM_SIZE = eINSTANCE.getFigure_MaximumSize();

		/**
		 * The meta object literal for the '<em><b>Tool Tip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__TOOL_TIP = eINSTANCE.getFigure_ToolTip();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__BACKGROUND_COLOR = eINSTANCE.getFigure_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Foreground Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__FOREGROUND_COLOR = eINSTANCE.getFigure_ForegroundColor();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__FONT = eINSTANCE.getFigure_Font();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__BORDER = eINSTANCE.getFigure_Border();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.LabelImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '<em><b>Text Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_ALIGNMENT = eINSTANCE.getLabel_TextAlignment();

		/**
		 * The meta object literal for the '<em><b>Text Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_PLACEMENT = eINSTANCE.getLabel_TextPlacement();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ICON = eINSTANCE.getLabel_Icon();

		/**
		 * The meta object literal for the '<em><b>Icon Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ICON_ALIGNMENT = eINSTANCE.getLabel_IconAlignment();

		/**
		 * The meta object literal for the '<em><b>Icon Text Gap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ICON_TEXT_GAP = eINSTANCE.getLabel_IconTextGap();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.ShapeImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__FILL = eINSTANCE.getShape_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill XOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__FILL_XOR = eINSTANCE.getShape_FillXOR();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__OUTLINE = eINSTANCE.getShape_Outline();

		/**
		 * The meta object literal for the '<em><b>Outline XOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__OUTLINE_XOR = eINSTANCE.getShape_OutlineXOR();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__ALPHA = eINSTANCE.getShape_Alpha();

		/**
		 * The meta object literal for the '<em><b>Antialias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__ANTIALIAS = eINSTANCE.getShape_Antialias();

		/**
		 * The meta object literal for the '<em><b>Line Width Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__LINE_WIDTH_FLOAT = eINSTANCE.getShape_LineWidthFloat();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__LINE_STYLE = eINSTANCE.getShape_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Line Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__LINE_CAP = eINSTANCE.getShape_LineCap();

		/**
		 * The meta object literal for the '<em><b>Line Join</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__LINE_JOIN = eINSTANCE.getShape_LineJoin();

		/**
		 * The meta object literal for the '<em><b>Line Dash</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__LINE_DASH = eINSTANCE.getShape_LineDash();

		/**
		 * The meta object literal for the '<em><b>Line Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__LINE_DASH_OFFSET = eINSTANCE.getShape_LineDashOffset();

		/**
		 * The meta object literal for the '<em><b>Line Miter Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__LINE_MITER_LIMIT = eINSTANCE.getShape_LineMiterLimit();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.RectangleFigureImpl <em>Rectangle Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.RectangleFigureImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getRectangleFigure()
		 * @generated
		 */
		EClass RECTANGLE_FIGURE = eINSTANCE.getRectangleFigure();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.RoundedRectangleImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getRoundedRectangle()
		 * @generated
		 */
		EClass ROUNDED_RECTANGLE = eINSTANCE.getRoundedRectangle();

		/**
		 * The meta object literal for the '<em><b>Corner Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUNDED_RECTANGLE__CORNER_DIMENSIONS = eINSTANCE.getRoundedRectangle_CornerDimensions();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.EllipseImpl <em>Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.EllipseImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.TriangleImpl <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.TriangleImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getTriangle()
		 * @generated
		 */
		EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE__ORIENTATION = eINSTANCE.getTriangle_Orientation();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE__DIRECTION = eINSTANCE.getTriangle_Direction();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PointListShapeImpl <em>Point List Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.PointListShapeImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPointListShape()
		 * @generated
		 */
		EClass POINT_LIST_SHAPE = eINSTANCE.getPointListShape();

		/**
		 * The meta object literal for the '<em><b>Point List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_LIST_SHAPE__POINT_LIST = eINSTANCE.getPointListShape_PointList();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PolylineImpl <em>Polyline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.PolylineImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPolyline()
		 * @generated
		 */
		EClass POLYLINE = eINSTANCE.getPolyline();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYLINE__TOLERANCE = eINSTANCE.getPolyline_Tolerance();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.PolygonImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PolylineShapeImpl <em>Polyline Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.PolylineShapeImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPolylineShape()
		 * @generated
		 */
		EClass POLYLINE_SHAPE = eINSTANCE.getPolylineShape();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYLINE_SHAPE__TOLERANCE = eINSTANCE.getPolylineShape_Tolerance();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.PolygonShapeImpl <em>Polygon Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.PolygonShapeImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPolygonShape()
		 * @generated
		 */
		EClass POLYGON_SHAPE = eINSTANCE.getPolygonShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.ImageFigureImpl <em>Image Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.ImageFigureImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getImageFigure()
		 * @generated
		 */
		EClass IMAGE_FIGURE = eINSTANCE.getImageFigure();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_FIGURE__IMAGE = eINSTANCE.getImageFigure_Image();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.ConnectionAnchorImpl <em>Connection Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.ConnectionAnchorImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getConnectionAnchor()
		 * @generated
		 */
		EClass CONNECTION_ANCHOR = eINSTANCE.getConnectionAnchor();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ANCHOR__OWNER = eINSTANCE.getConnectionAnchor_Owner();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.XYAnchorImpl <em>XY Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.XYAnchorImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getXYAnchor()
		 * @generated
		 */
		EClass XY_ANCHOR = eINSTANCE.getXYAnchor();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_ANCHOR__LOCATION = eINSTANCE.getXYAnchor_Location();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.BlockFlowImpl <em>Block Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.BlockFlowImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getBlockFlow()
		 * @generated
		 */
		EClass BLOCK_FLOW = eINSTANCE.getBlockFlow();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_FLOW__ORIENTATION = eINSTANCE.getBlockFlow_Orientation();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.BorderImpl <em>Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.BorderImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getBorder()
		 * @generated
		 */
		EClass BORDER = eINSTANCE.getBorder();

		/**
		 * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__OPAQUE = eINSTANCE.getBorder_Opaque();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.LabeledBorderImpl <em>Labeled Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.LabeledBorderImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getLabeledBorder()
		 * @generated
		 */
		EClass LABELED_BORDER = eINSTANCE.getLabeledBorder();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_BORDER__LABEL = eINSTANCE.getLabeledBorder_Label();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_BORDER__FONT = eINSTANCE.getLabeledBorder_Font();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.FrameBorderImpl <em>Frame Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.FrameBorderImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getFrameBorder()
		 * @generated
		 */
		EClass FRAME_BORDER = eINSTANCE.getFrameBorder();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.ColoredLabeledBorderImpl <em>Colored Labeled Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.ColoredLabeledBorderImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getColoredLabeledBorder()
		 * @generated
		 */
		EClass COLORED_LABELED_BORDER = eINSTANCE.getColoredLabeledBorder();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLORED_LABELED_BORDER__TEXT_COLOR = eINSTANCE.getColoredLabeledBorder_TextColor();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.GroupBoxBorderImpl <em>Group Box Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.GroupBoxBorderImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getGroupBoxBorder()
		 * @generated
		 */
		EClass GROUP_BOX_BORDER = eINSTANCE.getGroupBoxBorder();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.TitleBarBorderImpl <em>Title Bar Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.TitleBarBorderImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getTitleBarBorder()
		 * @generated
		 */
		EClass TITLE_BAR_BORDER = eINSTANCE.getTitleBarBorder();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.impl.FlowBorderImpl <em>Flow Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.FlowBorderImpl
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getFlowBorder()
		 * @generated
		 */
		EClass FLOW_BORDER = eINSTANCE.getFlowBorder();

		/**
		 * The meta object literal for the '<em><b>Left Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_BORDER__LEFT_MARGIN = eINSTANCE.getFlowBorder_LeftMargin();

		/**
		 * The meta object literal for the '<em><b>Right Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_BORDER__RIGHT_MARGIN = eINSTANCE.getFlowBorder_RightMargin();

		/**
		 * The meta object literal for the '<em><b>Top Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_BORDER__TOP_MARGIN = eINSTANCE.getFlowBorder_TopMargin();

		/**
		 * The meta object literal for the '<em><b>Bottom Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_BORDER__BOTTOM_MARGIN = eINSTANCE.getFlowBorder_BottomMargin();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.Alignment <em>Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.Alignment
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getAlignment()
		 * @generated
		 */
		EEnum ALIGNMENT = eINSTANCE.getAlignment();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.Orientation
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.draw2d.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.draw2d.Direction
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em>Dimension</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Dimension
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getDimension()
		 * @generated
		 */
		EDataType DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see org.eclipse.gmt.emfacade.draw2d.impl.Draw2dPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

	}

} //Draw2dPackage
