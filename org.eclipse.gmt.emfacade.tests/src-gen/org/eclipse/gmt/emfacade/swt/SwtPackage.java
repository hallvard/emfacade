/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.gmt.emfacade.swt.SwtFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.eclipse.gmt.emfacade'"
 * @generated
 */
public interface SwtPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "swt";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.gmt.emfacade.swt";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "swt";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SwtPackage eINSTANCE = org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.WidgetImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getWidget()
	 * @generated
	 */
  int WIDGET = 0;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WIDGET__STYLE = 0;

  /**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WIDGET_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WIDGET_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.LayoutImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLayout()
	 * @generated
	 */
  int LAYOUT = 1;

  /**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LAYOUT_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LAYOUT_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.LayoutDataImpl <em>Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.LayoutDataImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLayoutData()
	 * @generated
	 */
  int LAYOUT_DATA = 2;

  /**
	 * The number of structural features of the '<em>Layout Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LAYOUT_DATA_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>Layout Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LAYOUT_DATA_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ControlImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getControl()
	 * @generated
	 */
  int CONTROL = 3;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__STYLE = WIDGET__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__PARENT = WIDGET_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__BORDER_STYLE = WIDGET_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__TEXT_ORIENTATION_STYLE = WIDGET_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__LAYOUT_DATA = WIDGET_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__ENABLED = WIDGET_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__VISIBLE = WIDGET_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__TOUCH_ENABLED = WIDGET_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__TOOL_TIP_TEXT = WIDGET_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__BACKGROUND = WIDGET_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL__FONT = WIDGET_FEATURE_COUNT + 9;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SIZE = WIDGET_FEATURE_COUNT + 10;

		/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 11;

  /**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTROL_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.AbstractCompositeImpl <em>Abstract Composite</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.AbstractCompositeImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getAbstractComposite()
	 * @generated
	 */
  int ABSTRACT_COMPOSITE = 4;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__CONTROLS = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE__LAYOUT = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Composite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Abstract Composite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_COMPOSITE_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.CompositeImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getComposite()
	 * @generated
	 */
  int COMPOSITE = 5;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__STYLE = ABSTRACT_COMPOSITE__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__PARENT = ABSTRACT_COMPOSITE__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__BORDER_STYLE = ABSTRACT_COMPOSITE__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__TEXT_ORIENTATION_STYLE = ABSTRACT_COMPOSITE__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__LAYOUT_DATA = ABSTRACT_COMPOSITE__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__ENABLED = ABSTRACT_COMPOSITE__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__VISIBLE = ABSTRACT_COMPOSITE__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__TOUCH_ENABLED = ABSTRACT_COMPOSITE__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__TOOL_TIP_TEXT = ABSTRACT_COMPOSITE__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__BACKGROUND = ABSTRACT_COMPOSITE__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__FONT = ABSTRACT_COMPOSITE__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SIZE = ABSTRACT_COMPOSITE__SIZE;

		/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__CONTROLS = ABSTRACT_COMPOSITE__CONTROLS;

  /**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE__LAYOUT = ABSTRACT_COMPOSITE__LAYOUT;

  /**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE_FEATURE_COUNT = ABSTRACT_COMPOSITE_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPOSITE_OPERATION_COUNT = ABSTRACT_COMPOSITE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.GroupImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getGroup()
	 * @generated
	 */
  int GROUP = 6;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__STYLE = COMPOSITE__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__PARENT = COMPOSITE__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__BORDER_STYLE = COMPOSITE__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__TEXT_ORIENTATION_STYLE = COMPOSITE__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__LAYOUT_DATA = COMPOSITE__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__ENABLED = COMPOSITE__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__VISIBLE = COMPOSITE__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__TOUCH_ENABLED = COMPOSITE__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__TOOL_TIP_TEXT = COMPOSITE__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__BACKGROUND = COMPOSITE__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__FONT = COMPOSITE__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SIZE = COMPOSITE__SIZE;

		/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__CONTROLS = COMPOSITE__CONTROLS;

  /**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__LAYOUT = COMPOSITE__LAYOUT;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP__TEXT = COMPOSITE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GROUP_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.CanvasImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCanvas()
	 * @generated
	 */
  int CANVAS = 7;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__STYLE = COMPOSITE__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__PARENT = COMPOSITE__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__BORDER_STYLE = COMPOSITE__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__TEXT_ORIENTATION_STYLE = COMPOSITE__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__LAYOUT_DATA = COMPOSITE__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__ENABLED = COMPOSITE__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__VISIBLE = COMPOSITE__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__TOUCH_ENABLED = COMPOSITE__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__TOOL_TIP_TEXT = COMPOSITE__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__BACKGROUND = COMPOSITE__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__FONT = COMPOSITE__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__SIZE = COMPOSITE__SIZE;

		/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__CONTROLS = COMPOSITE__CONTROLS;

  /**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS__LAYOUT = COMPOSITE__LAYOUT;

  /**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CANVAS_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.DecorationsImpl <em>Decorations</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.DecorationsImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getDecorations()
	 * @generated
	 */
  int DECORATIONS = 8;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__STYLE = CANVAS__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__PARENT = CANVAS__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__BORDER_STYLE = CANVAS__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__TEXT_ORIENTATION_STYLE = CANVAS__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__LAYOUT_DATA = CANVAS__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__ENABLED = CANVAS__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__VISIBLE = CANVAS__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__TOUCH_ENABLED = CANVAS__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__TOOL_TIP_TEXT = CANVAS__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__BACKGROUND = CANVAS__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__FONT = CANVAS__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATIONS__SIZE = CANVAS__SIZE;

		/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__CONTROLS = CANVAS__CONTROLS;

  /**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__LAYOUT = CANVAS__LAYOUT;

  /**
	 * The feature id for the '<em><b>Maximized</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__MAXIMIZED = CANVAS_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Minimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__MINIMIZED = CANVAS_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Menu Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS__MENU_BAR = CANVAS_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Decorations</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS_FEATURE_COUNT = CANVAS_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Decorations</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECORATIONS_OPERATION_COUNT = CANVAS_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ShellImpl <em>Shell</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ShellImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getShell()
	 * @generated
	 */
  int SHELL = 9;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__STYLE = DECORATIONS__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__PARENT = DECORATIONS__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__BORDER_STYLE = DECORATIONS__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__TEXT_ORIENTATION_STYLE = DECORATIONS__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__LAYOUT_DATA = DECORATIONS__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__ENABLED = DECORATIONS__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__VISIBLE = DECORATIONS__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__TOUCH_ENABLED = DECORATIONS__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__TOOL_TIP_TEXT = DECORATIONS__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__BACKGROUND = DECORATIONS__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__FONT = DECORATIONS__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL__SIZE = DECORATIONS__SIZE;

		/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__CONTROLS = DECORATIONS__CONTROLS;

  /**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__LAYOUT = DECORATIONS__LAYOUT;

  /**
	 * The feature id for the '<em><b>Maximized</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__MAXIMIZED = DECORATIONS__MAXIMIZED;

  /**
	 * The feature id for the '<em><b>Minimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__MINIMIZED = DECORATIONS__MINIMIZED;

  /**
	 * The feature id for the '<em><b>Menu Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__MENU_BAR = DECORATIONS__MENU_BAR;

  /**
	 * The feature id for the '<em><b>Modal Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__MODAL_STYLE = DECORATIONS_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Trim Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__TRIM_STYLE = DECORATIONS_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Full Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__FULL_SCREEN = DECORATIONS_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL__ALPHA = DECORATIONS_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Default Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL__DEFAULT_BUTTON = DECORATIONS_FEATURE_COUNT + 4;

		/**
	 * The number of structural features of the '<em>Shell</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL_FEATURE_COUNT = DECORATIONS_FEATURE_COUNT + 5;

  /**
	 * The number of operations of the '<em>Shell</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SHELL_OPERATION_COUNT = DECORATIONS_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.AbstractMenuImpl <em>Abstract Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.AbstractMenuImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getAbstractMenu()
	 * @generated
	 */
	int ABSTRACT_MENU = 10;

		/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MENU__STYLE = WIDGET__STYLE;

		/**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MENU__TEXT_ORIENTATION_STYLE = WIDGET_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MENU__ENABLED = WIDGET_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MENU__VISIBLE = WIDGET_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MENU__ITEMS = WIDGET_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Abstract Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MENU_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

		/**
	 * The number of operations of the '<em>Abstract Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MENU_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.MenuImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenu()
	 * @generated
	 */
  int MENU = 11;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU__STYLE = ABSTRACT_MENU__STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__TEXT_ORIENTATION_STYLE = ABSTRACT_MENU__TEXT_ORIENTATION_STYLE;

		/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ENABLED = ABSTRACT_MENU__ENABLED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__VISIBLE = ABSTRACT_MENU__VISIBLE;

		/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ITEMS = ABSTRACT_MENU__ITEMS;

		/**
	 * The feature id for the '<em><b>Menu Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__MENU_STYLE = ABSTRACT_MENU_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Parent Item</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__PARENT_ITEM = ABSTRACT_MENU_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_FEATURE_COUNT = ABSTRACT_MENU_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_OPERATION_COUNT = ABSTRACT_MENU_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.MenuBarImpl <em>Menu Bar</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.MenuBarImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenuBar()
	 * @generated
	 */
  int MENU_BAR = 12;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_BAR__STYLE = ABSTRACT_MENU__STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BAR__TEXT_ORIENTATION_STYLE = ABSTRACT_MENU__TEXT_ORIENTATION_STYLE;

		/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BAR__ENABLED = ABSTRACT_MENU__ENABLED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BAR__VISIBLE = ABSTRACT_MENU__VISIBLE;

		/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BAR__ITEMS = ABSTRACT_MENU__ITEMS;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_BAR__PARENT = ABSTRACT_MENU_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Menu Bar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_BAR_FEATURE_COUNT = ABSTRACT_MENU_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Menu Bar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_BAR_OPERATION_COUNT = ABSTRACT_MENU_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.LabeledImpl <em>Labeled</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.LabeledImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLabeled()
	 * @generated
	 */
  int LABELED = 13;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABELED__TEXT = 0;

  /**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABELED__IMAGE = 1;

  /**
	 * The number of structural features of the '<em>Labeled</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABELED_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Labeled</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABELED_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ItemImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getItem()
	 * @generated
	 */
  int ITEM = 14;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITEM__STYLE = WIDGET__STYLE;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITEM__TEXT = WIDGET_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITEM__IMAGE = WIDGET_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITEM_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITEM_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.MenuItemImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenuItem()
	 * @generated
	 */
  int MENU_ITEM = 15;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM__STYLE = ITEM__STYLE;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM__TEXT = ITEM__TEXT;

  /**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM__IMAGE = ITEM__IMAGE;

  /**
	 * The feature id for the '<em><b>Menu Item Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__MENU_ITEM_STYLE = ITEM_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM__MENU = ITEM_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM__ID = ITEM_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Accelerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM__ACCELERATOR = ITEM_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM__ENABLED = ITEM_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM__SELECTION = ITEM_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 6;

  /**
	 * The number of operations of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MENU_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ToolBarImpl <em>Tool Bar</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ToolBarImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getToolBar()
	 * @generated
	 */
  int TOOL_BAR = 16;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__ITEMS = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR__ORIENTATION_STYLE = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_BAR_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ToolItemImpl <em>Tool Item</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ToolItemImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getToolItem()
	 * @generated
	 */
  int TOOL_ITEM = 17;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM__STYLE = ITEM__STYLE;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM__TEXT = ITEM__TEXT;

  /**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM__IMAGE = ITEM__IMAGE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM__PARENT = ITEM_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM__ENABLED = ITEM_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Hot Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM__HOT_IMAGE = ITEM_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM__TOOL_TIP_TEXT = ITEM_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM__SELECTION = ITEM_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Tool Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 5;

  /**
	 * The number of operations of the '<em>Tool Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOL_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.CoolBarImpl <em>Cool Bar</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.CoolBarImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCoolBar()
	 * @generated
	 */
  int COOL_BAR = 18;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__STYLE = ABSTRACT_COMPOSITE__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__PARENT = ABSTRACT_COMPOSITE__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__BORDER_STYLE = ABSTRACT_COMPOSITE__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__TEXT_ORIENTATION_STYLE = ABSTRACT_COMPOSITE__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__LAYOUT_DATA = ABSTRACT_COMPOSITE__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__ENABLED = ABSTRACT_COMPOSITE__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__VISIBLE = ABSTRACT_COMPOSITE__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__TOUCH_ENABLED = ABSTRACT_COMPOSITE__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__TOOL_TIP_TEXT = ABSTRACT_COMPOSITE__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__BACKGROUND = ABSTRACT_COMPOSITE__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__FONT = ABSTRACT_COMPOSITE__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOL_BAR__SIZE = ABSTRACT_COMPOSITE__SIZE;

		/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__CONTROLS = ABSTRACT_COMPOSITE__CONTROLS;

  /**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__LAYOUT = ABSTRACT_COMPOSITE__LAYOUT;

  /**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__ITEMS = ABSTRACT_COMPOSITE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR__ORIENTATION_STYLE = ABSTRACT_COMPOSITE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Cool Bar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR_FEATURE_COUNT = ABSTRACT_COMPOSITE_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Cool Bar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_BAR_OPERATION_COUNT = ABSTRACT_COMPOSITE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.CoolItemImpl <em>Cool Item</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.CoolItemImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCoolItem()
	 * @generated
	 */
  int COOL_ITEM = 19;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM__STYLE = ITEM__STYLE;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM__TEXT = ITEM__TEXT;

  /**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM__IMAGE = ITEM__IMAGE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM__PARENT = ITEM_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM__CONTROL = ITEM_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Minimum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM__MINIMUM_SIZE = ITEM_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Preferred Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM__PREFERRED_SIZE = ITEM_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM__SIZE = ITEM_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Cool Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 5;

  /**
	 * The number of operations of the '<em>Cool Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COOL_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.LabelImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLabel()
	 * @generated
	 */
  int LABEL = 20;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__TEXT = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL__IMAGE = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LABEL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.SeparatorImpl <em>Separator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.SeparatorImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSeparator()
	 * @generated
	 */
  int SEPARATOR = 21;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR__ORIENTATION_STYLE = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Separator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Separator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEPARATOR_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ButtonImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getButton()
	 * @generated
	 */
  int BUTTON = 22;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__TEXT = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__IMAGE = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Button Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__BUTTON_STYLE = CONTROL_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Arrow Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__ARROW_STYLE = CONTROL_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON__SELECTION = CONTROL_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 5;

  /**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BUTTON_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.TextImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getText()
	 * @generated
	 */
  int TEXT = 23;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Multiplicity Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__MULTIPLICITY_STYLE = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__TEXT = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__SELECTION = CONTROL_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__EDITABLE = CONTROL_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Echo Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__ECHO_CHAR = CONTROL_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Tabs</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__TABS = CONTROL_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Text Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__TEXT_LIMIT = CONTROL_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Top Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__TOP_INDEX = CONTROL_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT__MESSAGE = CONTROL_FEATURE_COUNT + 8;

  /**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 9;

  /**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.PasswordTextImpl <em>Password Text</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.PasswordTextImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getPasswordText()
	 * @generated
	 */
  int PASSWORD_TEXT = 24;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__STYLE = TEXT__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__PARENT = TEXT__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__BORDER_STYLE = TEXT__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__TEXT_ORIENTATION_STYLE = TEXT__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__LAYOUT_DATA = TEXT__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__ENABLED = TEXT__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__VISIBLE = TEXT__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__TOUCH_ENABLED = TEXT__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__TOOL_TIP_TEXT = TEXT__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__BACKGROUND = TEXT__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__FONT = TEXT__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TEXT__SIZE = TEXT__SIZE;

		/**
	 * The feature id for the '<em><b>Multiplicity Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__MULTIPLICITY_STYLE = TEXT__MULTIPLICITY_STYLE;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__TEXT = TEXT__TEXT;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__SELECTION = TEXT__SELECTION;

  /**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__EDITABLE = TEXT__EDITABLE;

  /**
	 * The feature id for the '<em><b>Echo Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__ECHO_CHAR = TEXT__ECHO_CHAR;

  /**
	 * The feature id for the '<em><b>Tabs</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__TABS = TEXT__TABS;

  /**
	 * The feature id for the '<em><b>Text Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__TEXT_LIMIT = TEXT__TEXT_LIMIT;

  /**
	 * The feature id for the '<em><b>Top Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__TOP_INDEX = TEXT__TOP_INDEX;

  /**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT__MESSAGE = TEXT__MESSAGE;

  /**
	 * The number of structural features of the '<em>Password Text</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Password Text</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PASSWORD_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.SearchTextImpl <em>Search Text</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.SearchTextImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSearchText()
	 * @generated
	 */
  int SEARCH_TEXT = 25;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__STYLE = TEXT__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__PARENT = TEXT__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__BORDER_STYLE = TEXT__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__TEXT_ORIENTATION_STYLE = TEXT__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__LAYOUT_DATA = TEXT__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__ENABLED = TEXT__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__VISIBLE = TEXT__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__TOUCH_ENABLED = TEXT__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__TOOL_TIP_TEXT = TEXT__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__BACKGROUND = TEXT__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__FONT = TEXT__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_TEXT__SIZE = TEXT__SIZE;

		/**
	 * The feature id for the '<em><b>Multiplicity Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__MULTIPLICITY_STYLE = TEXT__MULTIPLICITY_STYLE;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__TEXT = TEXT__TEXT;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__SELECTION = TEXT__SELECTION;

  /**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__EDITABLE = TEXT__EDITABLE;

  /**
	 * The feature id for the '<em><b>Echo Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__ECHO_CHAR = TEXT__ECHO_CHAR;

  /**
	 * The feature id for the '<em><b>Tabs</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__TABS = TEXT__TABS;

  /**
	 * The feature id for the '<em><b>Text Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__TEXT_LIMIT = TEXT__TEXT_LIMIT;

  /**
	 * The feature id for the '<em><b>Top Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__TOP_INDEX = TEXT__TOP_INDEX;

  /**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT__MESSAGE = TEXT__MESSAGE;

  /**
	 * The number of structural features of the '<em>Search Text</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Search Text</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEARCH_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.IntervalControlImpl <em>Interval Control</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.IntervalControlImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getIntervalControl()
	 * @generated
	 */
  int INTERVAL_CONTROL = 26;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONTROL__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__MINIMUM = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__MAXIMUM = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL__SELECTION = CONTROL_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Interval Control</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Interval Control</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_CONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.IntervalSelectorImpl <em>Interval Selector</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.IntervalSelectorImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getIntervalSelector()
	 * @generated
	 */
  int INTERVAL_SELECTOR = 27;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__STYLE = INTERVAL_CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__PARENT = INTERVAL_CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__BORDER_STYLE = INTERVAL_CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__TEXT_ORIENTATION_STYLE = INTERVAL_CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__LAYOUT_DATA = INTERVAL_CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__ENABLED = INTERVAL_CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__VISIBLE = INTERVAL_CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__TOUCH_ENABLED = INTERVAL_CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__TOOL_TIP_TEXT = INTERVAL_CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__BACKGROUND = INTERVAL_CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__FONT = INTERVAL_CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SELECTOR__SIZE = INTERVAL_CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__MINIMUM = INTERVAL_CONTROL__MINIMUM;

  /**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__MAXIMUM = INTERVAL_CONTROL__MAXIMUM;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__SELECTION = INTERVAL_CONTROL__SELECTION;

  /**
	 * The feature id for the '<em><b>Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__ORIENTATION_STYLE = INTERVAL_CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__INCREMENT = INTERVAL_CONTROL_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Page Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR__PAGE_INCREMENT = INTERVAL_CONTROL_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Interval Selector</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR_FEATURE_COUNT = INTERVAL_CONTROL_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Interval Selector</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERVAL_SELECTOR_OPERATION_COUNT = INTERVAL_CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.SliderImpl <em>Slider</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.SliderImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSlider()
	 * @generated
	 */
  int SLIDER = 28;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__STYLE = INTERVAL_SELECTOR__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__PARENT = INTERVAL_SELECTOR__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__BORDER_STYLE = INTERVAL_SELECTOR__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__TEXT_ORIENTATION_STYLE = INTERVAL_SELECTOR__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__LAYOUT_DATA = INTERVAL_SELECTOR__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__ENABLED = INTERVAL_SELECTOR__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__VISIBLE = INTERVAL_SELECTOR__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__TOUCH_ENABLED = INTERVAL_SELECTOR__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__TOOL_TIP_TEXT = INTERVAL_SELECTOR__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__BACKGROUND = INTERVAL_SELECTOR__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__FONT = INTERVAL_SELECTOR__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER__SIZE = INTERVAL_SELECTOR__SIZE;

		/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__MINIMUM = INTERVAL_SELECTOR__MINIMUM;

  /**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__MAXIMUM = INTERVAL_SELECTOR__MAXIMUM;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__SELECTION = INTERVAL_SELECTOR__SELECTION;

  /**
	 * The feature id for the '<em><b>Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__ORIENTATION_STYLE = INTERVAL_SELECTOR__ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__INCREMENT = INTERVAL_SELECTOR__INCREMENT;

  /**
	 * The feature id for the '<em><b>Page Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__PAGE_INCREMENT = INTERVAL_SELECTOR__PAGE_INCREMENT;

  /**
	 * The feature id for the '<em><b>Thumb</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER__THUMB = INTERVAL_SELECTOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Slider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER_FEATURE_COUNT = INTERVAL_SELECTOR_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Slider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDER_OPERATION_COUNT = INTERVAL_SELECTOR_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.SpinnerImpl <em>Spinner</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.SpinnerImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSpinner()
	 * @generated
	 */
  int SPINNER = 29;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__STYLE = INTERVAL_SELECTOR__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__PARENT = INTERVAL_SELECTOR__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__BORDER_STYLE = INTERVAL_SELECTOR__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__TEXT_ORIENTATION_STYLE = INTERVAL_SELECTOR__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__LAYOUT_DATA = INTERVAL_SELECTOR__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__ENABLED = INTERVAL_SELECTOR__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__VISIBLE = INTERVAL_SELECTOR__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__TOUCH_ENABLED = INTERVAL_SELECTOR__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__TOOL_TIP_TEXT = INTERVAL_SELECTOR__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__BACKGROUND = INTERVAL_SELECTOR__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__FONT = INTERVAL_SELECTOR__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__SIZE = INTERVAL_SELECTOR__SIZE;

		/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__MINIMUM = INTERVAL_SELECTOR__MINIMUM;

  /**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__MAXIMUM = INTERVAL_SELECTOR__MAXIMUM;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__SELECTION = INTERVAL_SELECTOR__SELECTION;

  /**
	 * The feature id for the '<em><b>Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__ORIENTATION_STYLE = INTERVAL_SELECTOR__ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__INCREMENT = INTERVAL_SELECTOR__INCREMENT;

  /**
	 * The feature id for the '<em><b>Page Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__PAGE_INCREMENT = INTERVAL_SELECTOR__PAGE_INCREMENT;

  /**
	 * The feature id for the '<em><b>Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__DIGITS = INTERVAL_SELECTOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Text Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER__TEXT_LIMIT = INTERVAL_SELECTOR_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER_FEATURE_COUNT = INTERVAL_SELECTOR_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPINNER_OPERATION_COUNT = INTERVAL_SELECTOR_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ProgressBarImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getProgressBar()
	 * @generated
	 */
  int PROGRESS_BAR = 30;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__STYLE = INTERVAL_CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__PARENT = INTERVAL_CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__BORDER_STYLE = INTERVAL_CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__TEXT_ORIENTATION_STYLE = INTERVAL_CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__LAYOUT_DATA = INTERVAL_CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__ENABLED = INTERVAL_CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__VISIBLE = INTERVAL_CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__TOUCH_ENABLED = INTERVAL_CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__TOOL_TIP_TEXT = INTERVAL_CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__BACKGROUND = INTERVAL_CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__FONT = INTERVAL_CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__SIZE = INTERVAL_CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__MINIMUM = INTERVAL_CONTROL__MINIMUM;

  /**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__MAXIMUM = INTERVAL_CONTROL__MAXIMUM;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__SELECTION = INTERVAL_CONTROL__SELECTION;

  /**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR__STATE = INTERVAL_CONTROL_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR_FEATURE_COUNT = INTERVAL_CONTROL_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRESS_BAR_OPERATION_COUNT = INTERVAL_CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getDateTime()
	 * @generated
	 */
  int DATE_TIME = 31;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__SECONDS = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__MINUTES = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__HOURS = CONTROL_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__DAY = CONTROL_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__MONTH = CONTROL_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME__YEAR = CONTROL_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 6;

  /**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATE_TIME_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.BrowserImpl <em>Browser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.BrowserImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getBrowser()
	 * @generated
	 */
	int BROWSER = 32;

		/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__STYLE = CONTROL__STYLE;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__PARENT = CONTROL__PARENT;

		/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__BORDER_STYLE = CONTROL__BORDER_STYLE;

		/**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

		/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

		/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__ENABLED = CONTROL__ENABLED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__VISIBLE = CONTROL__VISIBLE;

		/**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

		/**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

		/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__BACKGROUND = CONTROL__BACKGROUND;

		/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__FONT = CONTROL__FONT;

		/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Javascript Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__JAVASCRIPT_ENABLED = CONTROL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__TEXT = CONTROL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__URL = CONTROL_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Browser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 3;

		/**
	 * The number of operations of the '<em>Browser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.AbstractListImpl <em>Abstract List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.AbstractListImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getAbstractList()
	 * @generated
	 */
  int ABSTRACT_LIST = 33;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIST__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__ITEMS = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Selection Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST__SELECTION_INDEX = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Abstract List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_LIST_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ListImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getList()
	 * @generated
	 */
  int LIST = 34;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__STYLE = ABSTRACT_LIST__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__PARENT = ABSTRACT_LIST__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__BORDER_STYLE = ABSTRACT_LIST__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__TEXT_ORIENTATION_STYLE = ABSTRACT_LIST__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__LAYOUT_DATA = ABSTRACT_LIST__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__ENABLED = ABSTRACT_LIST__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__VISIBLE = ABSTRACT_LIST__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__TOUCH_ENABLED = ABSTRACT_LIST__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__TOOL_TIP_TEXT = ABSTRACT_LIST__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__BACKGROUND = ABSTRACT_LIST__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__FONT = ABSTRACT_LIST__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SIZE = ABSTRACT_LIST__SIZE;

		/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__ITEMS = ABSTRACT_LIST__ITEMS;

  /**
	 * The feature id for the '<em><b>Selection Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__SELECTION_INDEX = ABSTRACT_LIST__SELECTION_INDEX;

  /**
	 * The feature id for the '<em><b>Multiplicity Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__MULTIPLICITY_STYLE = ABSTRACT_LIST_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Selection Indices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__SELECTION_INDICES = ABSTRACT_LIST_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Selection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__SELECTION = ABSTRACT_LIST_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_COUNT = ABSTRACT_LIST_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_OPERATION_COUNT = ABSTRACT_LIST_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ComboImpl <em>Combo</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ComboImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCombo()
	 * @generated
	 */
  int COMBO = 35;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__STYLE = ABSTRACT_LIST__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__PARENT = ABSTRACT_LIST__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__BORDER_STYLE = ABSTRACT_LIST__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__TEXT_ORIENTATION_STYLE = ABSTRACT_LIST__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__LAYOUT_DATA = ABSTRACT_LIST__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__ENABLED = ABSTRACT_LIST__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__VISIBLE = ABSTRACT_LIST__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__TOUCH_ENABLED = ABSTRACT_LIST__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__TOOL_TIP_TEXT = ABSTRACT_LIST__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__BACKGROUND = ABSTRACT_LIST__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__FONT = ABSTRACT_LIST__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__SIZE = ABSTRACT_LIST__SIZE;

		/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__ITEMS = ABSTRACT_LIST__ITEMS;

  /**
	 * The feature id for the '<em><b>Selection Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__SELECTION_INDEX = ABSTRACT_LIST__SELECTION_INDEX;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__TEXT = ABSTRACT_LIST_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Text Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO__TEXT_LIMIT = ABSTRACT_LIST_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Combo</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO_FEATURE_COUNT = ABSTRACT_LIST_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Combo</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMBO_OPERATION_COUNT = ABSTRACT_LIST_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.TabFolderImpl <em>Tab Folder</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.TabFolderImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTabFolder()
	 * @generated
	 */
  int TAB_FOLDER = 36;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FOLDER__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER__ITEMS = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Tab Folder</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Tab Folder</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_FOLDER_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.TabItemImpl <em>Tab Item</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.TabItemImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTabItem()
	 * @generated
	 */
  int TAB_ITEM = 37;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_ITEM__STYLE = ITEM__STYLE;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_ITEM__TEXT = ITEM__TEXT;

  /**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_ITEM__IMAGE = ITEM__IMAGE;

  /**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_ITEM__CONTROL = ITEM_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_ITEM__TOOL_TIP_TEXT = ITEM_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Tab Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Tab Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TAB_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ColorImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getColor()
	 * @generated
	 */
  int COLOR = 38;

  /**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLOR_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLOR_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.SystemColorImpl <em>System Color</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.SystemColorImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSystemColor()
	 * @generated
	 */
  int SYSTEM_COLOR = 39;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEM_COLOR__COLOR = COLOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>System Color</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEM_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>System Color</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEM_COLOR_OPERATION_COUNT = COLOR_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.RGBColorImpl <em>RGB Color</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.RGBColorImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getRGBColor()
	 * @generated
	 */
  int RGB_COLOR = 40;

  /**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RGB_COLOR__RED = COLOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RGB_COLOR__GREEN = COLOR_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RGB_COLOR__BLUE = COLOR_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RGB_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RGB_COLOR_OPERATION_COUNT = COLOR_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.FontImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFont()
	 * @generated
	 */
  int FONT = 41;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FONT__NAME = 0;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FONT__STYLE = 1;

  /**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FONT__HEIGHT = 2;

  /**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FONT_FEATURE_COUNT = 3;

  /**
	 * The number of operations of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FONT_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.FillLayoutImpl <em>Fill Layout</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.FillLayoutImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFillLayout()
	 * @generated
	 */
  int FILL_LAYOUT = 42;

  /**
	 * The feature id for the '<em><b>Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILL_LAYOUT__ORIENTATION_STYLE = LAYOUT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILL_LAYOUT__MARGIN_WIDTH = LAYOUT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILL_LAYOUT__MARGIN_HEIGHT = LAYOUT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILL_LAYOUT__SPACING = LAYOUT_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Fill Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILL_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 4;

  /**
	 * The number of operations of the '<em>Fill Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILL_LAYOUT_OPERATION_COUNT = LAYOUT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl <em>Row Layout</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getRowLayout()
	 * @generated
	 */
  int ROW_LAYOUT = 43;

  /**
	 * The feature id for the '<em><b>Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__ORIENTATION_STYLE = LAYOUT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__MARGIN_WIDTH = LAYOUT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__MARGIN_HEIGHT = LAYOUT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__SPACING = LAYOUT_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Wrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__WRAP = LAYOUT_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Pack</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__PACK = LAYOUT_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__FILL = LAYOUT_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__CENTER = LAYOUT_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__JUSTIFY = LAYOUT_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__MARGIN_LEFT = LAYOUT_FEATURE_COUNT + 9;

  /**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__MARGIN_TOP = LAYOUT_FEATURE_COUNT + 10;

  /**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__MARGIN_RIGHT = LAYOUT_FEATURE_COUNT + 11;

  /**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT__MARGIN_BOTTOM = LAYOUT_FEATURE_COUNT + 12;

  /**
	 * The number of structural features of the '<em>Row Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 13;

  /**
	 * The number of operations of the '<em>Row Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_LAYOUT_OPERATION_COUNT = LAYOUT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.RowDataImpl <em>Row Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.RowDataImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getRowData()
	 * @generated
	 */
  int ROW_DATA = 44;

  /**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_DATA__WIDTH = LAYOUT_DATA_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_DATA__HEIGHT = LAYOUT_DATA_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_DATA__EXCLUDE = LAYOUT_DATA_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Row Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Row Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROW_DATA_OPERATION_COUNT = LAYOUT_DATA_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getGridLayout()
	 * @generated
	 */
  int GRID_LAYOUT = 45;

  /**
	 * The feature id for the '<em><b>Num Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__NUM_COLUMNS = LAYOUT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Make Columns Equal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH = LAYOUT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__MARGIN_WIDTH = LAYOUT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__MARGIN_HEIGHT = LAYOUT_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__MARGIN_LEFT = LAYOUT_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__MARGIN_TOP = LAYOUT_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__MARGIN_RIGHT = LAYOUT_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__MARGIN_BOTTOM = LAYOUT_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Horizontal Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__HORIZONTAL_SPACING = LAYOUT_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>Vertical Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT__VERTICAL_SPACING = LAYOUT_FEATURE_COUNT + 9;

  /**
	 * The number of structural features of the '<em>Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 10;

  /**
	 * The number of operations of the '<em>Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_LAYOUT_OPERATION_COUNT = LAYOUT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl <em>Grid Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.GridDataImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getGridData()
	 * @generated
	 */
  int GRID_DATA = 46;

  /**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__VERTICAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__HORIZONTAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Width Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__WIDTH_HINT = LAYOUT_DATA_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Height Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__HEIGHT_HINT = LAYOUT_DATA_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Horizontal Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__HORIZONTAL_INDENT = LAYOUT_DATA_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Vertical Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__VERTICAL_INDENT = LAYOUT_DATA_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Horizontal Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__HORIZONTAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Vertical Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__VERTICAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = LAYOUT_DATA_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE = LAYOUT_DATA_FEATURE_COUNT + 9;

  /**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__MINIMUM_WIDTH = LAYOUT_DATA_FEATURE_COUNT + 10;

  /**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__MINIMUM_HEIGHT = LAYOUT_DATA_FEATURE_COUNT + 11;

  /**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA__EXCLUDE = LAYOUT_DATA_FEATURE_COUNT + 12;

  /**
	 * The number of structural features of the '<em>Grid Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 13;

  /**
	 * The number of operations of the '<em>Grid Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRID_DATA_OPERATION_COUNT = LAYOUT_DATA_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.FormLayoutImpl <em>Form Layout</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.FormLayoutImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFormLayout()
	 * @generated
	 */
  int FORM_LAYOUT = 47;

  /**
	 * The feature id for the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_LAYOUT__MARGIN_WIDTH = LAYOUT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_LAYOUT__MARGIN_HEIGHT = LAYOUT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_LAYOUT__SPACING = LAYOUT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_LAYOUT__MARGIN_LEFT = LAYOUT_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_LAYOUT__MARGIN_TOP = LAYOUT_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_LAYOUT__MARGIN_RIGHT = LAYOUT_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_LAYOUT__MARGIN_BOTTOM = LAYOUT_FEATURE_COUNT + 6;

  /**
	 * The number of structural features of the '<em>Form Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 7;

  /**
	 * The number of operations of the '<em>Form Layout</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_LAYOUT_OPERATION_COUNT = LAYOUT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.FormDataImpl <em>Form Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.FormDataImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFormData()
	 * @generated
	 */
  int FORM_DATA = 48;

  /**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_DATA__WIDTH = LAYOUT_DATA_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_DATA__HEIGHT = LAYOUT_DATA_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_DATA__LEFT = LAYOUT_DATA_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_DATA__TOP = LAYOUT_DATA_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_DATA__RIGHT = LAYOUT_DATA_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_DATA__BOTTOM = LAYOUT_DATA_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Form Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 6;

  /**
	 * The number of operations of the '<em>Form Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_DATA_OPERATION_COUNT = LAYOUT_DATA_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.FormAttachmentImpl <em>Form Attachment</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.FormAttachmentImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFormAttachment()
	 * @generated
	 */
  int FORM_ATTACHMENT = 49;

  /**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_ATTACHMENT__ALIGNMENT = 0;

  /**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_ATTACHMENT__CONTROL = 1;

  /**
	 * The feature id for the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_ATTACHMENT__DENOMINATOR = 2;

  /**
	 * The feature id for the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_ATTACHMENT__NUMERATOR = 3;

  /**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_ATTACHMENT__OFFSET = 4;

  /**
	 * The number of structural features of the '<em>Form Attachment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_ATTACHMENT_FEATURE_COUNT = 5;

  /**
	 * The number of operations of the '<em>Form Attachment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FORM_ATTACHMENT_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl <em>Line Attributes</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLineAttributes()
	 * @generated
	 */
  int LINE_ATTRIBUTES = 50;

  /**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_ATTRIBUTES__WIDTH = 0;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_ATTRIBUTES__STYLE = 1;

  /**
	 * The feature id for the '<em><b>Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_ATTRIBUTES__CAP = 2;

  /**
	 * The feature id for the '<em><b>Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_ATTRIBUTES__JOIN = 3;

  /**
	 * The feature id for the '<em><b>Dash</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_ATTRIBUTES__DASH = 4;

  /**
	 * The feature id for the '<em><b>Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_ATTRIBUTES__DASH_OFFSET = 5;

  /**
	 * The feature id for the '<em><b>Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_ATTRIBUTES__MITER_LIMIT = 6;

  /**
	 * The number of structural features of the '<em>Line Attributes</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_ATTRIBUTES_FEATURE_COUNT = 7;

  /**
	 * The number of operations of the '<em>Line Attributes</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_ATTRIBUTES_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.TreeColumnImpl <em>Tree Column</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.TreeColumnImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTreeColumn()
	 * @generated
	 */
  int TREE_COLUMN = 51;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_COLUMN__STYLE = ITEM__STYLE;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_COLUMN__TEXT = ITEM__TEXT;

  /**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_COLUMN__IMAGE = ITEM__IMAGE;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_COLUMN__TOOL_TIP_TEXT = ITEM_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_COLUMN__DISPLAY_TEXT = ITEM_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Tree Column</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_COLUMN_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Tree Column</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_COLUMN_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.TreeImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTree()
	 * @generated
	 */
  int TREE = 52;

  /**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__STYLE = CONTROL__STYLE;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__PARENT = CONTROL__PARENT;

  /**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__BORDER_STYLE = CONTROL__BORDER_STYLE;

  /**
	 * The feature id for the '<em><b>Text Orientation Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__TEXT_ORIENTATION_STYLE = CONTROL__TEXT_ORIENTATION_STYLE;

  /**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__LAYOUT_DATA = CONTROL__LAYOUT_DATA;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__ENABLED = CONTROL__ENABLED;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__VISIBLE = CONTROL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Touch Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__TOUCH_ENABLED = CONTROL__TOUCH_ENABLED;

  /**
	 * The feature id for the '<em><b>Tool Tip Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__TOOL_TIP_TEXT = CONTROL__TOOL_TIP_TEXT;

  /**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__BACKGROUND = CONTROL__BACKGROUND;

  /**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__FONT = CONTROL__FONT;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SIZE = CONTROL__SIZE;

		/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__COLUMNS = CONTROL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Header Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__HEADER_VISIBLE = CONTROL_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__LINES_VISIBLE = CONTROL_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Sort Column</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__SORT_COLUMN = CONTROL_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Sort Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__SORT_DIRECTION = CONTROL_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Viewer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE__VIEWER = CONTROL_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 6;

  /**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.ViewerImpl <em>Viewer</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.ViewerImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getViewer()
	 * @generated
	 */
  int VIEWER = 53;

  /**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VIEWER__CONTROL = 0;

  /**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VIEWER__INPUT = 1;

  /**
	 * The number of structural features of the '<em>Viewer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VIEWER_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Viewer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VIEWER_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.impl.TreeViewerImpl <em>Tree Viewer</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.impl.TreeViewerImpl
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTreeViewer()
	 * @generated
	 */
  int TREE_VIEWER = 54;

  /**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_VIEWER__CONTROL = VIEWER__CONTROL;

  /**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_VIEWER__INPUT = VIEWER__INPUT;

  /**
	 * The number of structural features of the '<em>Tree Viewer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_VIEWER_FEATURE_COUNT = VIEWER_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Tree Viewer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_VIEWER_OPERATION_COUNT = VIEWER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.ProgressState <em>Progress State</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.ProgressState
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getProgressState()
	 * @generated
	 */
  int PROGRESS_STATE = 55;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.SystemColors <em>System Colors</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.SystemColors
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSystemColors()
	 * @generated
	 */
  int SYSTEM_COLORS = 56;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.FontStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFontStyle()
	 * @generated
	 */
  int FONT_STYLE = 57;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment <em>Form Attachment Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFormAttachmentAlignment()
	 * @generated
	 */
  int FORM_ATTACHMENT_ALIGNMENT = 58;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.BorderStyle <em>Border Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.BorderStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getBorderStyle()
	 * @generated
	 */
  int BORDER_STYLE = 59;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.ButtonStyle <em>Button Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.ButtonStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getButtonStyle()
	 * @generated
	 */
  int BUTTON_STYLE = 60;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.ArrowStyle <em>Arrow Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.ArrowStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getArrowStyle()
	 * @generated
	 */
  int ARROW_STYLE = 61;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.TextOrientationStyle <em>Text Orientation Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.TextOrientationStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTextOrientationStyle()
	 * @generated
	 */
  int TEXT_ORIENTATION_STYLE = 62;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.OrientationStyle <em>Orientation Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.OrientationStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getOrientationStyle()
	 * @generated
	 */
  int ORIENTATION_STYLE = 63;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle <em>Horizontal Alignment Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getHorizontalAlignmentStyle()
	 * @generated
	 */
  int HORIZONTAL_ALIGNMENT_STYLE = 64;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle <em>Vertical Alignment Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getVerticalAlignmentStyle()
	 * @generated
	 */
  int VERTICAL_ALIGNMENT_STYLE = 65;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.MultiplicityStyle <em>Multiplicity Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.MultiplicityStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMultiplicityStyle()
	 * @generated
	 */
  int MULTIPLICITY_STYLE = 66;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.ComboStyle <em>Combo Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.ComboStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getComboStyle()
	 * @generated
	 */
  int COMBO_STYLE = 67;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.MenuStyle <em>Menu Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.MenuStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenuStyle()
	 * @generated
	 */
	int MENU_STYLE = 68;

		/**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.MenuItemStyle <em>Menu Item Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.MenuItemStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenuItemStyle()
	 * @generated
	 */
  int MENU_ITEM_STYLE = 69;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.ModalStyle <em>Modal Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.ModalStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getModalStyle()
	 * @generated
	 */
  int MODAL_STYLE = 70;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.TrimStyle <em>Trim Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.TrimStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTrimStyle()
	 * @generated
	 */
  int TRIM_STYLE = 71;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.LineStyle <em>Line Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.LineStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLineStyle()
	 * @generated
	 */
  int LINE_STYLE = 72;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.CapStyle <em>Cap Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.CapStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCapStyle()
	 * @generated
	 */
  int CAP_STYLE = 73;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.JoinStyle <em>Join Style</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.JoinStyle
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getJoinStyle()
	 * @generated
	 */
  int JOIN_STYLE = 74;

  /**
	 * The meta object id for the '{@link org.eclipse.gmt.emfacade.swt.SortDirection <em>Sort Direction</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.emfacade.swt.SortDirection
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSortDirection()
	 * @generated
	 */
  int SORT_DIRECTION = 75;

  /**
	 * The meta object id for the '<em>Image Ref</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getImageRef()
	 * @generated
	 */
  int IMAGE_REF = 76;

  /**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getURI()
	 * @generated
	 */
	int URI = 77;

		/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Point
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getPoint()
	 * @generated
	 */
  int POINT = 78;

  /**
	 * The meta object id for the '<em>Viewer Input</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getViewerInput()
	 * @generated
	 */
  int VIEWER_INPUT = 79;


  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Widget
	 * @generated
	 */
  EClass getWidget();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Widget#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Widget#getStyle()
	 * @see #getWidget()
	 * @generated
	 */
  EAttribute getWidget_Style();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Layout
	 * @generated
	 */
  EClass getLayout();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.LayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Data</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LayoutData
	 * @generated
	 */
  EClass getLayoutData();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control
	 * @generated
	 */
  EClass getControl();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.swt.Control#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#getParent()
	 * @see #getControl()
	 * @generated
	 */
  EReference getControl_Parent();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Control#getBorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#getBorderStyle()
	 * @see #getControl()
	 * @generated
	 */
  EAttribute getControl_BorderStyle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Control#getTextOrientationStyle <em>Text Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#getTextOrientationStyle()
	 * @see #getControl()
	 * @generated
	 */
  EAttribute getControl_TextOrientationStyle();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.Control#getLayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Data</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#getLayoutData()
	 * @see #getControl()
	 * @generated
	 */
  EReference getControl_LayoutData();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Control#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#isEnabled()
	 * @see #getControl()
	 * @generated
	 */
  EAttribute getControl_Enabled();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Control#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#isVisible()
	 * @see #getControl()
	 * @generated
	 */
  EAttribute getControl_Visible();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Control#isTouchEnabled <em>Touch Enabled</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Touch Enabled</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#isTouchEnabled()
	 * @see #getControl()
	 * @generated
	 */
  EAttribute getControl_TouchEnabled();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Control#getToolTipText <em>Tool Tip Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Tip Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#getToolTipText()
	 * @see #getControl()
	 * @generated
	 */
  EAttribute getControl_ToolTipText();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.Control#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#getBackground()
	 * @see #getControl()
	 * @generated
	 */
  EReference getControl_Background();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.Control#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#getFont()
	 * @see #getControl()
	 * @generated
	 */
  EReference getControl_Font();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Control#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Control#getSize()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Size();

		/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.AbstractComposite <em>Abstract Composite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Composite</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractComposite
	 * @generated
	 */
  EClass getAbstractComposite();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.swt.AbstractComposite#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractComposite#getControls()
	 * @see #getAbstractComposite()
	 * @generated
	 */
  EReference getAbstractComposite_Controls();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.AbstractComposite#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractComposite#getLayout()
	 * @see #getAbstractComposite()
	 * @generated
	 */
  EReference getAbstractComposite_Layout();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Composite
	 * @generated
	 */
  EClass getComposite();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Group
	 * @generated
	 */
  EClass getGroup();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Group#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Group#getText()
	 * @see #getGroup()
	 * @generated
	 */
  EAttribute getGroup_Text();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Canvas
	 * @generated
	 */
  EClass getCanvas();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Decorations <em>Decorations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorations</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Decorations
	 * @generated
	 */
  EClass getDecorations();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Decorations#isMaximized <em>Maximized</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximized</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Decorations#isMaximized()
	 * @see #getDecorations()
	 * @generated
	 */
  EAttribute getDecorations_Maximized();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Decorations#isMinimized <em>Minimized</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimized</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Decorations#isMinimized()
	 * @see #getDecorations()
	 * @generated
	 */
  EAttribute getDecorations_Minimized();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.Decorations#getMenuBar <em>Menu Bar</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menu Bar</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Decorations#getMenuBar()
	 * @see #getDecorations()
	 * @generated
	 */
  EReference getDecorations_MenuBar();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Shell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Shell
	 * @generated
	 */
  EClass getShell();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Shell#getModalStyle <em>Modal Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modal Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Shell#getModalStyle()
	 * @see #getShell()
	 * @generated
	 */
  EAttribute getShell_ModalStyle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Shell#getTrimStyle <em>Trim Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trim Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Shell#getTrimStyle()
	 * @see #getShell()
	 * @generated
	 */
  EAttribute getShell_TrimStyle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Shell#isFullScreen <em>Full Screen</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Screen</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Shell#isFullScreen()
	 * @see #getShell()
	 * @generated
	 */
  EAttribute getShell_FullScreen();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Shell#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Shell#getAlpha()
	 * @see #getShell()
	 * @generated
	 */
  EAttribute getShell_Alpha();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.swt.Shell#getDefaultButton <em>Default Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Button</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Shell#getDefaultButton()
	 * @see #getShell()
	 * @generated
	 */
	EReference getShell_DefaultButton();

		/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.AbstractMenu <em>Abstract Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Menu</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractMenu
	 * @generated
	 */
	EClass getAbstractMenu();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.AbstractMenu#getTextOrientationStyle <em>Text Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractMenu#getTextOrientationStyle()
	 * @see #getAbstractMenu()
	 * @generated
	 */
	EAttribute getAbstractMenu_TextOrientationStyle();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.AbstractMenu#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractMenu#isEnabled()
	 * @see #getAbstractMenu()
	 * @generated
	 */
	EAttribute getAbstractMenu_Enabled();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.AbstractMenu#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractMenu#isVisible()
	 * @see #getAbstractMenu()
	 * @generated
	 */
	EAttribute getAbstractMenu_Visible();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.swt.AbstractMenu#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractMenu#getItems()
	 * @see #getAbstractMenu()
	 * @generated
	 */
	EReference getAbstractMenu_Items();

		/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Menu
	 * @generated
	 */
  EClass getMenu();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Menu#getMenuStyle <em>Menu Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Menu#getMenuStyle()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_MenuStyle();

		/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.emfacade.swt.Menu#getParentItem <em>Parent Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Item</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Menu#getParentItem()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_ParentItem();

		/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.MenuBar <em>Menu Bar</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Bar</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuBar
	 * @generated
	 */
  EClass getMenuBar();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.emfacade.swt.MenuBar#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuBar#getParent()
	 * @see #getMenuBar()
	 * @generated
	 */
  EReference getMenuBar_Parent();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Labeled <em>Labeled</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Labeled
	 * @generated
	 */
  EClass getLabeled();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Labeled#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Labeled#getText()
	 * @see #getLabeled()
	 * @generated
	 */
  EAttribute getLabeled_Text();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Labeled#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Labeled#getImage()
	 * @see #getLabeled()
	 * @generated
	 */
  EAttribute getLabeled_Image();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Item
	 * @generated
	 */
  EClass getItem();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItem
	 * @generated
	 */
  EClass getMenuItem();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.MenuItem#getMenuItemStyle <em>Menu Item Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu Item Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItem#getMenuItemStyle()
	 * @see #getMenuItem()
	 * @generated
	 */
	EAttribute getMenuItem_MenuItemStyle();

		/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.MenuItem#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menu</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItem#getMenu()
	 * @see #getMenuItem()
	 * @generated
	 */
  EReference getMenuItem_Menu();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.MenuItem#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItem#getID()
	 * @see #getMenuItem()
	 * @generated
	 */
  EAttribute getMenuItem_ID();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.MenuItem#getAccelerator <em>Accelerator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accelerator</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItem#getAccelerator()
	 * @see #getMenuItem()
	 * @generated
	 */
  EAttribute getMenuItem_Accelerator();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.MenuItem#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItem#isEnabled()
	 * @see #getMenuItem()
	 * @generated
	 */
  EAttribute getMenuItem_Enabled();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.MenuItem#isSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItem#isSelection()
	 * @see #getMenuItem()
	 * @generated
	 */
  EAttribute getMenuItem_Selection();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.ToolBar <em>Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Bar</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ToolBar
	 * @generated
	 */
  EClass getToolBar();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.swt.ToolBar#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ToolBar#getItems()
	 * @see #getToolBar()
	 * @generated
	 */
  EReference getToolBar_Items();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.ToolBar#getOrientationStyle <em>Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ToolBar#getOrientationStyle()
	 * @see #getToolBar()
	 * @generated
	 */
  EAttribute getToolBar_OrientationStyle();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.ToolItem <em>Tool Item</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Item</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ToolItem
	 * @generated
	 */
  EClass getToolItem();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.emfacade.swt.ToolItem#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ToolItem#getParent()
	 * @see #getToolItem()
	 * @generated
	 */
  EReference getToolItem_Parent();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.ToolItem#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ToolItem#isEnabled()
	 * @see #getToolItem()
	 * @generated
	 */
  EAttribute getToolItem_Enabled();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.ToolItem#getHotImage <em>Hot Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Image</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ToolItem#getHotImage()
	 * @see #getToolItem()
	 * @generated
	 */
  EAttribute getToolItem_HotImage();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.ToolItem#getToolTipText <em>Tool Tip Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Tip Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ToolItem#getToolTipText()
	 * @see #getToolItem()
	 * @generated
	 */
  EAttribute getToolItem_ToolTipText();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.ToolItem#isSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ToolItem#isSelection()
	 * @see #getToolItem()
	 * @generated
	 */
  EAttribute getToolItem_Selection();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.CoolBar <em>Cool Bar</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cool Bar</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CoolBar
	 * @generated
	 */
  EClass getCoolBar();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.swt.CoolBar#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CoolBar#getItems()
	 * @see #getCoolBar()
	 * @generated
	 */
  EReference getCoolBar_Items();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.CoolBar#getOrientationStyle <em>Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CoolBar#getOrientationStyle()
	 * @see #getCoolBar()
	 * @generated
	 */
  EAttribute getCoolBar_OrientationStyle();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.CoolItem <em>Cool Item</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cool Item</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CoolItem
	 * @generated
	 */
  EClass getCoolItem();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CoolItem#getParent()
	 * @see #getCoolItem()
	 * @generated
	 */
  EReference getCoolItem_Parent();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CoolItem#getControl()
	 * @see #getCoolItem()
	 * @generated
	 */
  EReference getCoolItem_Control();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getMinimumSize <em>Minimum Size</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Size</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CoolItem#getMinimumSize()
	 * @see #getCoolItem()
	 * @generated
	 */
  EAttribute getCoolItem_MinimumSize();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getPreferredSize <em>Preferred Size</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Size</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CoolItem#getPreferredSize()
	 * @see #getCoolItem()
	 * @generated
	 */
  EAttribute getCoolItem_PreferredSize();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.CoolItem#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CoolItem#getSize()
	 * @see #getCoolItem()
	 * @generated
	 */
  EAttribute getCoolItem_Size();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Label
	 * @generated
	 */
  EClass getLabel();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Separator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separator</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Separator
	 * @generated
	 */
  EClass getSeparator();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Separator#getOrientationStyle <em>Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Separator#getOrientationStyle()
	 * @see #getSeparator()
	 * @generated
	 */
  EAttribute getSeparator_OrientationStyle();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Button
	 * @generated
	 */
  EClass getButton();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Button#getButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Button#getButtonStyle()
	 * @see #getButton()
	 * @generated
	 */
  EAttribute getButton_ButtonStyle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Button#getArrowStyle <em>Arrow Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrow Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Button#getArrowStyle()
	 * @see #getButton()
	 * @generated
	 */
  EAttribute getButton_ArrowStyle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Button#isSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Button#isSelection()
	 * @see #getButton()
	 * @generated
	 */
  EAttribute getButton_Selection();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text
	 * @generated
	 */
  EClass getText();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Text#getMultiplicityStyle <em>Multiplicity Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text#getMultiplicityStyle()
	 * @see #getText()
	 * @generated
	 */
  EAttribute getText_MultiplicityStyle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text#getText()
	 * @see #getText()
	 * @generated
	 */
  EAttribute getText_Text();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Text#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text#getSelection()
	 * @see #getText()
	 * @generated
	 */
  EAttribute getText_Selection();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Text#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text#isEditable()
	 * @see #getText()
	 * @generated
	 */
  EAttribute getText_Editable();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Text#getEchoChar <em>Echo Char</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Echo Char</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text#getEchoChar()
	 * @see #getText()
	 * @generated
	 */
  EAttribute getText_EchoChar();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Text#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabs</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text#getTabs()
	 * @see #getText()
	 * @generated
	 */
  EAttribute getText_Tabs();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Text#getTextLimit <em>Text Limit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Limit</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text#getTextLimit()
	 * @see #getText()
	 * @generated
	 */
  EAttribute getText_TextLimit();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Text#getTopIndex <em>Top Index</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Index</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text#getTopIndex()
	 * @see #getText()
	 * @generated
	 */
  EAttribute getText_TopIndex();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Text#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Text#getMessage()
	 * @see #getText()
	 * @generated
	 */
  EAttribute getText_Message();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.PasswordText <em>Password Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.PasswordText
	 * @generated
	 */
  EClass getPasswordText();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.SearchText <em>Search Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.SearchText
	 * @generated
	 */
  EClass getSearchText();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.IntervalControl <em>Interval Control</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Control</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.IntervalControl
	 * @generated
	 */
  EClass getIntervalControl();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.IntervalControl#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.IntervalControl#getMinimum()
	 * @see #getIntervalControl()
	 * @generated
	 */
  EAttribute getIntervalControl_Minimum();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.IntervalControl#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.IntervalControl#getMaximum()
	 * @see #getIntervalControl()
	 * @generated
	 */
  EAttribute getIntervalControl_Maximum();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.IntervalControl#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.IntervalControl#getSelection()
	 * @see #getIntervalControl()
	 * @generated
	 */
  EAttribute getIntervalControl_Selection();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.IntervalSelector <em>Interval Selector</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Selector</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.IntervalSelector
	 * @generated
	 */
  EClass getIntervalSelector();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.IntervalSelector#getOrientationStyle <em>Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.IntervalSelector#getOrientationStyle()
	 * @see #getIntervalSelector()
	 * @generated
	 */
  EAttribute getIntervalSelector_OrientationStyle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.IntervalSelector#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.IntervalSelector#getIncrement()
	 * @see #getIntervalSelector()
	 * @generated
	 */
  EAttribute getIntervalSelector_Increment();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.IntervalSelector#getPageIncrement <em>Page Increment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Increment</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.IntervalSelector#getPageIncrement()
	 * @see #getIntervalSelector()
	 * @generated
	 */
  EAttribute getIntervalSelector_PageIncrement();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Slider <em>Slider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slider</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Slider
	 * @generated
	 */
  EClass getSlider();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Slider#getThumb <em>Thumb</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumb</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Slider#getThumb()
	 * @see #getSlider()
	 * @generated
	 */
  EAttribute getSlider_Thumb();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinner</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Spinner
	 * @generated
	 */
  EClass getSpinner();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Spinner#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digits</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Spinner#getDigits()
	 * @see #getSpinner()
	 * @generated
	 */
  EAttribute getSpinner_Digits();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Spinner#getTextLimit <em>Text Limit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Limit</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Spinner#getTextLimit()
	 * @see #getSpinner()
	 * @generated
	 */
  EAttribute getSpinner_TextLimit();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.ProgressBar <em>Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Bar</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ProgressBar
	 * @generated
	 */
  EClass getProgressBar();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.ProgressBar#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ProgressBar#getState()
	 * @see #getProgressBar()
	 * @generated
	 */
  EAttribute getProgressBar_State();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.DateTime
	 * @generated
	 */
  EClass getDateTime();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.DateTime#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.DateTime#getSeconds()
	 * @see #getDateTime()
	 * @generated
	 */
  EAttribute getDateTime_Seconds();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.DateTime#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.DateTime#getMinutes()
	 * @see #getDateTime()
	 * @generated
	 */
  EAttribute getDateTime_Minutes();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.DateTime#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.DateTime#getHours()
	 * @see #getDateTime()
	 * @generated
	 */
  EAttribute getDateTime_Hours();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.DateTime#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.DateTime#getDay()
	 * @see #getDateTime()
	 * @generated
	 */
  EAttribute getDateTime_Day();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.DateTime#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.DateTime#getMonth()
	 * @see #getDateTime()
	 * @generated
	 */
  EAttribute getDateTime_Month();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.DateTime#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.DateTime#getYear()
	 * @see #getDateTime()
	 * @generated
	 */
  EAttribute getDateTime_Year();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Browser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browser</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Browser
	 * @generated
	 */
	EClass getBrowser();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Browser#isJavascriptEnabled <em>Javascript Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Javascript Enabled</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Browser#isJavascriptEnabled()
	 * @see #getBrowser()
	 * @generated
	 */
	EAttribute getBrowser_JavascriptEnabled();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Browser#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Browser#getText()
	 * @see #getBrowser()
	 * @generated
	 */
	EAttribute getBrowser_Text();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Browser#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Browser#getUrl()
	 * @see #getBrowser()
	 * @generated
	 */
	EAttribute getBrowser_Url();

		/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.AbstractList <em>Abstract List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract List</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractList
	 * @generated
	 */
  EClass getAbstractList();

  /**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmt.emfacade.swt.AbstractList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractList#getItems()
	 * @see #getAbstractList()
	 * @generated
	 */
  EAttribute getAbstractList_Items();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.AbstractList#getSelectionIndex <em>Selection Index</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Index</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.AbstractList#getSelectionIndex()
	 * @see #getAbstractList()
	 * @generated
	 */
  EAttribute getAbstractList_SelectionIndex();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.List
	 * @generated
	 */
  EClass getList();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.List#getMultiplicityStyle <em>Multiplicity Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.List#getMultiplicityStyle()
	 * @see #getList()
	 * @generated
	 */
  EAttribute getList_MultiplicityStyle();

  /**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmt.emfacade.swt.List#getSelectionIndices <em>Selection Indices</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selection Indices</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.List#getSelectionIndices()
	 * @see #getList()
	 * @generated
	 */
  EAttribute getList_SelectionIndices();

  /**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmt.emfacade.swt.List#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selection</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.List#getSelection()
	 * @see #getList()
	 * @generated
	 */
  EAttribute getList_Selection();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Combo <em>Combo</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Combo
	 * @generated
	 */
  EClass getCombo();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Combo#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Combo#getText()
	 * @see #getCombo()
	 * @generated
	 */
  EAttribute getCombo_Text();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Combo#getTextLimit <em>Text Limit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Limit</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Combo#getTextLimit()
	 * @see #getCombo()
	 * @generated
	 */
  EAttribute getCombo_TextLimit();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.TabFolder <em>Tab Folder</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Folder</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TabFolder
	 * @generated
	 */
  EClass getTabFolder();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.swt.TabFolder#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TabFolder#getItems()
	 * @see #getTabFolder()
	 * @generated
	 */
  EReference getTabFolder_Items();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.TabItem <em>Tab Item</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Item</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TabItem
	 * @generated
	 */
  EClass getTabItem();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.TabItem#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TabItem#getControl()
	 * @see #getTabItem()
	 * @generated
	 */
  EReference getTabItem_Control();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.TabItem#getToolTipText <em>Tool Tip Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Tip Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TabItem#getToolTipText()
	 * @see #getTabItem()
	 * @generated
	 */
  EAttribute getTabItem_ToolTipText();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Color
	 * @generated
	 */
  EClass getColor();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.SystemColor <em>System Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Color</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.SystemColor
	 * @generated
	 */
  EClass getSystemColor();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.SystemColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.SystemColor#getColor()
	 * @see #getSystemColor()
	 * @generated
	 */
  EAttribute getSystemColor_Color();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB Color</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RGBColor
	 * @generated
	 */
  EClass getRGBColor();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RGBColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RGBColor#getRed()
	 * @see #getRGBColor()
	 * @generated
	 */
  EAttribute getRGBColor_Red();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RGBColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RGBColor#getGreen()
	 * @see #getRGBColor()
	 * @generated
	 */
  EAttribute getRGBColor_Green();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RGBColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RGBColor#getBlue()
	 * @see #getRGBColor()
	 * @generated
	 */
  EAttribute getRGBColor_Blue();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Font
	 * @generated
	 */
  EClass getFont();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Font#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Font#getName()
	 * @see #getFont()
	 * @generated
	 */
  EAttribute getFont_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Font#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Font#getStyle()
	 * @see #getFont()
	 * @generated
	 */
  EAttribute getFont_Style();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Font#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Font#getHeight()
	 * @see #getFont()
	 * @generated
	 */
  EAttribute getFont_Height();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.FillLayout <em>Fill Layout</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill Layout</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FillLayout
	 * @generated
	 */
  EClass getFillLayout();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FillLayout#getOrientationStyle <em>Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FillLayout#getOrientationStyle()
	 * @see #getFillLayout()
	 * @generated
	 */
  EAttribute getFillLayout_OrientationStyle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FillLayout#getMarginWidth <em>Margin Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Width</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FillLayout#getMarginWidth()
	 * @see #getFillLayout()
	 * @generated
	 */
  EAttribute getFillLayout_MarginWidth();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FillLayout#getMarginHeight <em>Margin Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Height</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FillLayout#getMarginHeight()
	 * @see #getFillLayout()
	 * @generated
	 */
  EAttribute getFillLayout_MarginHeight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FillLayout#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FillLayout#getSpacing()
	 * @see #getFillLayout()
	 * @generated
	 */
  EAttribute getFillLayout_Spacing();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.RowLayout <em>Row Layout</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Layout</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout
	 * @generated
	 */
  EClass getRowLayout();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getOrientationStyle <em>Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#getOrientationStyle()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_OrientationStyle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginWidth <em>Margin Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Width</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#getMarginWidth()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_MarginWidth();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginHeight <em>Margin Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Height</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#getMarginHeight()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_MarginHeight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#getSpacing()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_Spacing();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isWrap <em>Wrap</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#isWrap()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_Wrap();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isPack <em>Pack</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pack</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#isPack()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_Pack();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#isFill()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_Fill();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#isCenter()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_Center();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#isJustify <em>Justify</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#isJustify()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_Justify();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginLeft <em>Margin Left</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Left</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#getMarginLeft()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_MarginLeft();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginTop <em>Margin Top</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Top</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#getMarginTop()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_MarginTop();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginRight <em>Margin Right</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Right</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#getMarginRight()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_MarginRight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowLayout#getMarginBottom <em>Margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Bottom</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowLayout#getMarginBottom()
	 * @see #getRowLayout()
	 * @generated
	 */
  EAttribute getRowLayout_MarginBottom();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.RowData <em>Row Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Data</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowData
	 * @generated
	 */
  EClass getRowData();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowData#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowData#getWidth()
	 * @see #getRowData()
	 * @generated
	 */
  EAttribute getRowData_Width();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowData#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowData#getHeight()
	 * @see #getRowData()
	 * @generated
	 */
  EAttribute getRowData_Height();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.RowData#isExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.RowData#isExclude()
	 * @see #getRowData()
	 * @generated
	 */
  EAttribute getRowData_Exclude();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.GridLayout <em>Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Layout</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout
	 * @generated
	 */
  EClass getGridLayout();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getNumColumns <em>Num Columns</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Columns</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#getNumColumns()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_NumColumns();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#isMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make Columns Equal Width</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#isMakeColumnsEqualWidth()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_MakeColumnsEqualWidth();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginWidth <em>Margin Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Width</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#getMarginWidth()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_MarginWidth();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginHeight <em>Margin Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Height</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#getMarginHeight()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_MarginHeight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginLeft <em>Margin Left</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Left</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#getMarginLeft()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_MarginLeft();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginTop <em>Margin Top</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Top</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#getMarginTop()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_MarginTop();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginRight <em>Margin Right</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Right</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#getMarginRight()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_MarginRight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getMarginBottom <em>Margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Bottom</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#getMarginBottom()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_MarginBottom();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getHorizontalSpacing <em>Horizontal Spacing</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Spacing</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#getHorizontalSpacing()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_HorizontalSpacing();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridLayout#getVerticalSpacing <em>Vertical Spacing</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Spacing</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridLayout#getVerticalSpacing()
	 * @see #getGridLayout()
	 * @generated
	 */
  EAttribute getGridLayout_VerticalSpacing();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.GridData <em>Grid Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Data</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData
	 * @generated
	 */
  EClass getGridData();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getVerticalAlignment()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_VerticalAlignment();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getHorizontalAlignment()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_HorizontalAlignment();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getWidthHint <em>Width Hint</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Hint</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getWidthHint()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_WidthHint();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getHeightHint <em>Height Hint</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Hint</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getHeightHint()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_HeightHint();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getHorizontalIndent <em>Horizontal Indent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Indent</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getHorizontalIndent()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_HorizontalIndent();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getVerticalIndent <em>Vertical Indent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Indent</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getVerticalIndent()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_VerticalIndent();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getHorizontalSpan <em>Horizontal Span</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Span</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getHorizontalSpan()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_HorizontalSpan();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getVerticalSpan <em>Vertical Span</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Span</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getVerticalSpan()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_VerticalSpan();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Horizontal Space</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#isGrabExcessHorizontalSpace()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_GrabExcessHorizontalSpace();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Vertical Space</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#isGrabExcessVerticalSpace()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_GrabExcessVerticalSpace();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getMinimumWidth <em>Minimum Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Width</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getMinimumWidth()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_MinimumWidth();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#getMinimumHeight <em>Minimum Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Height</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#getMinimumHeight()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_MinimumHeight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.GridData#isExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.GridData#isExclude()
	 * @see #getGridData()
	 * @generated
	 */
  EAttribute getGridData_Exclude();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.FormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Layout</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormLayout
	 * @generated
	 */
  EClass getFormLayout();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormLayout#getMarginWidth <em>Margin Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Width</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormLayout#getMarginWidth()
	 * @see #getFormLayout()
	 * @generated
	 */
  EAttribute getFormLayout_MarginWidth();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormLayout#getMarginHeight <em>Margin Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Height</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormLayout#getMarginHeight()
	 * @see #getFormLayout()
	 * @generated
	 */
  EAttribute getFormLayout_MarginHeight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormLayout#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormLayout#getSpacing()
	 * @see #getFormLayout()
	 * @generated
	 */
  EAttribute getFormLayout_Spacing();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormLayout#getMarginLeft <em>Margin Left</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Left</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormLayout#getMarginLeft()
	 * @see #getFormLayout()
	 * @generated
	 */
  EAttribute getFormLayout_MarginLeft();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormLayout#getMarginTop <em>Margin Top</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Top</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormLayout#getMarginTop()
	 * @see #getFormLayout()
	 * @generated
	 */
  EAttribute getFormLayout_MarginTop();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormLayout#getMarginRight <em>Margin Right</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Right</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormLayout#getMarginRight()
	 * @see #getFormLayout()
	 * @generated
	 */
  EAttribute getFormLayout_MarginRight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormLayout#getMarginBottom <em>Margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Bottom</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormLayout#getMarginBottom()
	 * @see #getFormLayout()
	 * @generated
	 */
  EAttribute getFormLayout_MarginBottom();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.FormData <em>Form Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Data</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormData
	 * @generated
	 */
  EClass getFormData();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormData#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormData#getWidth()
	 * @see #getFormData()
	 * @generated
	 */
  EAttribute getFormData_Width();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormData#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormData#getHeight()
	 * @see #getFormData()
	 * @generated
	 */
  EAttribute getFormData_Height();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.FormData#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormData#getLeft()
	 * @see #getFormData()
	 * @generated
	 */
  EReference getFormData_Left();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.FormData#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormData#getTop()
	 * @see #getFormData()
	 * @generated
	 */
  EReference getFormData_Top();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.FormData#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormData#getRight()
	 * @see #getFormData()
	 * @generated
	 */
  EReference getFormData_Right();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.FormData#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bottom</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormData#getBottom()
	 * @see #getFormData()
	 * @generated
	 */
  EReference getFormData_Bottom();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.FormAttachment <em>Form Attachment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Attachment</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachment
	 * @generated
	 */
  EClass getFormAttachment();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachment#getAlignment()
	 * @see #getFormAttachment()
	 * @generated
	 */
  EAttribute getFormAttachment_Alignment();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachment#getControl()
	 * @see #getFormAttachment()
	 * @generated
	 */
  EReference getFormAttachment_Control();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denominator</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachment#getDenominator()
	 * @see #getFormAttachment()
	 * @generated
	 */
  EAttribute getFormAttachment_Denominator();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numerator</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachment#getNumerator()
	 * @see #getFormAttachment()
	 * @generated
	 */
  EAttribute getFormAttachment_Numerator();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.FormAttachment#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachment#getOffset()
	 * @see #getFormAttachment()
	 * @generated
	 */
  EAttribute getFormAttachment_Offset();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.LineAttributes <em>Line Attributes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Attributes</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LineAttributes
	 * @generated
	 */
  EClass getLineAttributes();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LineAttributes#getWidth()
	 * @see #getLineAttributes()
	 * @generated
	 */
  EAttribute getLineAttributes_Width();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LineAttributes#getStyle()
	 * @see #getLineAttributes()
	 * @generated
	 */
  EAttribute getLineAttributes_Style();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getCap <em>Cap</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LineAttributes#getCap()
	 * @see #getLineAttributes()
	 * @generated
	 */
  EAttribute getLineAttributes_Cap();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LineAttributes#getJoin()
	 * @see #getLineAttributes()
	 * @generated
	 */
  EAttribute getLineAttributes_Join();

  /**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getDash <em>Dash</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dash</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LineAttributes#getDash()
	 * @see #getLineAttributes()
	 * @generated
	 */
  EAttribute getLineAttributes_Dash();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getDashOffset <em>Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dash Offset</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LineAttributes#getDashOffset()
	 * @see #getLineAttributes()
	 * @generated
	 */
  EAttribute getLineAttributes_DashOffset();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getMiterLimit <em>Miter Limit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miter Limit</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LineAttributes#getMiterLimit()
	 * @see #getLineAttributes()
	 * @generated
	 */
  EAttribute getLineAttributes_MiterLimit();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.TreeColumn <em>Tree Column</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Column</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TreeColumn
	 * @generated
	 */
  EClass getTreeColumn();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.TreeColumn#getToolTipText <em>Tool Tip Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Tip Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TreeColumn#getToolTipText()
	 * @see #getTreeColumn()
	 * @generated
	 */
  EAttribute getTreeColumn_ToolTipText();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.TreeColumn#getDisplayText <em>Display Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Text</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TreeColumn#getDisplayText()
	 * @see #getTreeColumn()
	 * @generated
	 */
  EAttribute getTreeColumn_DisplayText();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Tree
	 * @generated
	 */
  EClass getTree();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.emfacade.swt.Tree#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Tree#getColumns()
	 * @see #getTree()
	 * @generated
	 */
  EReference getTree_Columns();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Tree#isHeaderVisible <em>Header Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Visible</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Tree#isHeaderVisible()
	 * @see #getTree()
	 * @generated
	 */
  EAttribute getTree_HeaderVisible();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Tree#isLinesVisible <em>Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines Visible</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Tree#isLinesVisible()
	 * @see #getTree()
	 * @generated
	 */
  EAttribute getTree_LinesVisible();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.swt.Tree#getSortColumn <em>Sort Column</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sort Column</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Tree#getSortColumn()
	 * @see #getTree()
	 * @generated
	 */
  EReference getTree_SortColumn();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Tree#getSortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Direction</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Tree#getSortDirection()
	 * @see #getTree()
	 * @generated
	 */
  EAttribute getTree_SortDirection();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.emfacade.swt.Tree#getViewer <em>Viewer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Viewer</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Tree#getViewer()
	 * @see #getTree()
	 * @generated
	 */
  EReference getTree_Viewer();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.Viewer <em>Viewer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewer</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Viewer
	 * @generated
	 */
  EClass getViewer();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.emfacade.swt.Viewer#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Viewer#getControl()
	 * @see #getViewer()
	 * @generated
	 */
  EReference getViewer_Control();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.emfacade.swt.Viewer#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.Viewer#getInput()
	 * @see #getViewer()
	 * @generated
	 */
  EAttribute getViewer_Input();

  /**
	 * Returns the meta object for class '{@link org.eclipse.gmt.emfacade.swt.TreeViewer <em>Tree Viewer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Viewer</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TreeViewer
	 * @generated
	 */
  EClass getTreeViewer();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.ProgressState <em>Progress State</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Progress State</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ProgressState
	 * @generated
	 */
  EEnum getProgressState();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.SystemColors <em>System Colors</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Colors</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.SystemColors
	 * @generated
	 */
  EEnum getSystemColors();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FontStyle
	 * @generated
	 */
  EEnum getFontStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment <em>Form Attachment Alignment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Attachment Alignment</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment
	 * @generated
	 */
  EEnum getFormAttachmentAlignment();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.BorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Border Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.BorderStyle
	 * @generated
	 */
  EEnum getBorderStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ButtonStyle
	 * @generated
	 */
  EEnum getButtonStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.ArrowStyle <em>Arrow Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arrow Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ArrowStyle
	 * @generated
	 */
  EEnum getArrowStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.TextOrientationStyle <em>Text Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TextOrientationStyle
	 * @generated
	 */
  EEnum getTextOrientationStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.OrientationStyle <em>Orientation Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.OrientationStyle
	 * @generated
	 */
  EEnum getOrientationStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle <em>Horizontal Alignment Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Horizontal Alignment Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle
	 * @generated
	 */
  EEnum getHorizontalAlignmentStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle <em>Vertical Alignment Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Alignment Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle
	 * @generated
	 */
  EEnum getVerticalAlignmentStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.MultiplicityStyle <em>Multiplicity Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MultiplicityStyle
	 * @generated
	 */
  EEnum getMultiplicityStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.ComboStyle <em>Combo Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Combo Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ComboStyle
	 * @generated
	 */
  EEnum getComboStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.MenuStyle <em>Menu Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Menu Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuStyle
	 * @generated
	 */
	EEnum getMenuStyle();

		/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.MenuItemStyle <em>Menu Item Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Menu Item Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.MenuItemStyle
	 * @generated
	 */
  EEnum getMenuItemStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.ModalStyle <em>Modal Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modal Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.ModalStyle
	 * @generated
	 */
  EEnum getModalStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.TrimStyle <em>Trim Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trim Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.TrimStyle
	 * @generated
	 */
  EEnum getTrimStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.LineStyle
	 * @generated
	 */
  EEnum getLineStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.CapStyle <em>Cap Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cap Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.CapStyle
	 * @generated
	 */
  EEnum getCapStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.JoinStyle <em>Join Style</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join Style</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.JoinStyle
	 * @generated
	 */
  EEnum getJoinStyle();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.emfacade.swt.SortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Direction</em>'.
	 * @see org.eclipse.gmt.emfacade.swt.SortDirection
	 * @generated
	 */
  EEnum getSortDirection();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>Image Ref</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Ref</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
  EDataType getImageRef();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.swt.graphics.Point
	 * @model instanceClass="org.eclipse.swt.graphics.Point"
	 * @generated
	 */
  EDataType getPoint();

  /**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Viewer Input</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Viewer Input</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
  EDataType getViewerInput();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SwtFactory getSwtFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.WidgetImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getWidget()
		 * @generated
		 */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WIDGET__STYLE = eINSTANCE.getWidget_Style();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.LayoutImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLayout()
		 * @generated
		 */
    EClass LAYOUT = eINSTANCE.getLayout();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.LayoutDataImpl <em>Layout Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.LayoutDataImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLayoutData()
		 * @generated
		 */
    EClass LAYOUT_DATA = eINSTANCE.getLayoutData();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ControlImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getControl()
		 * @generated
		 */
    EClass CONTROL = eINSTANCE.getControl();

    /**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONTROL__PARENT = eINSTANCE.getControl_Parent();

    /**
		 * The meta object literal for the '<em><b>Border Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTROL__BORDER_STYLE = eINSTANCE.getControl_BorderStyle();

    /**
		 * The meta object literal for the '<em><b>Text Orientation Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTROL__TEXT_ORIENTATION_STYLE = eINSTANCE.getControl_TextOrientationStyle();

    /**
		 * The meta object literal for the '<em><b>Layout Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONTROL__LAYOUT_DATA = eINSTANCE.getControl_LayoutData();

    /**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTROL__ENABLED = eINSTANCE.getControl_Enabled();

    /**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTROL__VISIBLE = eINSTANCE.getControl_Visible();

    /**
		 * The meta object literal for the '<em><b>Touch Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTROL__TOUCH_ENABLED = eINSTANCE.getControl_TouchEnabled();

    /**
		 * The meta object literal for the '<em><b>Tool Tip Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTROL__TOOL_TIP_TEXT = eINSTANCE.getControl_ToolTipText();

    /**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONTROL__BACKGROUND = eINSTANCE.getControl_Background();

    /**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONTROL__FONT = eINSTANCE.getControl_Font();

    /**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__SIZE = eINSTANCE.getControl_Size();

				/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.AbstractCompositeImpl <em>Abstract Composite</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.AbstractCompositeImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getAbstractComposite()
		 * @generated
		 */
    EClass ABSTRACT_COMPOSITE = eINSTANCE.getAbstractComposite();

    /**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_COMPOSITE__CONTROLS = eINSTANCE.getAbstractComposite_Controls();

    /**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_COMPOSITE__LAYOUT = eINSTANCE.getAbstractComposite_Layout();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.CompositeImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getComposite()
		 * @generated
		 */
    EClass COMPOSITE = eINSTANCE.getComposite();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.GroupImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getGroup()
		 * @generated
		 */
    EClass GROUP = eINSTANCE.getGroup();

    /**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GROUP__TEXT = eINSTANCE.getGroup_Text();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.CanvasImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCanvas()
		 * @generated
		 */
    EClass CANVAS = eINSTANCE.getCanvas();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.DecorationsImpl <em>Decorations</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.DecorationsImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getDecorations()
		 * @generated
		 */
    EClass DECORATIONS = eINSTANCE.getDecorations();

    /**
		 * The meta object literal for the '<em><b>Maximized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DECORATIONS__MAXIMIZED = eINSTANCE.getDecorations_Maximized();

    /**
		 * The meta object literal for the '<em><b>Minimized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DECORATIONS__MINIMIZED = eINSTANCE.getDecorations_Minimized();

    /**
		 * The meta object literal for the '<em><b>Menu Bar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DECORATIONS__MENU_BAR = eINSTANCE.getDecorations_MenuBar();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ShellImpl <em>Shell</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ShellImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getShell()
		 * @generated
		 */
    EClass SHELL = eINSTANCE.getShell();

    /**
		 * The meta object literal for the '<em><b>Modal Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SHELL__MODAL_STYLE = eINSTANCE.getShell_ModalStyle();

    /**
		 * The meta object literal for the '<em><b>Trim Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SHELL__TRIM_STYLE = eINSTANCE.getShell_TrimStyle();

    /**
		 * The meta object literal for the '<em><b>Full Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SHELL__FULL_SCREEN = eINSTANCE.getShell_FullScreen();

    /**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SHELL__ALPHA = eINSTANCE.getShell_Alpha();

    /**
		 * The meta object literal for the '<em><b>Default Button</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHELL__DEFAULT_BUTTON = eINSTANCE.getShell_DefaultButton();

				/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.AbstractMenuImpl <em>Abstract Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.AbstractMenuImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getAbstractMenu()
		 * @generated
		 */
		EClass ABSTRACT_MENU = eINSTANCE.getAbstractMenu();

				/**
		 * The meta object literal for the '<em><b>Text Orientation Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MENU__TEXT_ORIENTATION_STYLE = eINSTANCE.getAbstractMenu_TextOrientationStyle();

				/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MENU__ENABLED = eINSTANCE.getAbstractMenu_Enabled();

				/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MENU__VISIBLE = eINSTANCE.getAbstractMenu_Visible();

				/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MENU__ITEMS = eINSTANCE.getAbstractMenu_Items();

				/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.MenuImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenu()
		 * @generated
		 */
    EClass MENU = eINSTANCE.getMenu();

    /**
		 * The meta object literal for the '<em><b>Menu Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__MENU_STYLE = eINSTANCE.getMenu_MenuStyle();

				/**
		 * The meta object literal for the '<em><b>Parent Item</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__PARENT_ITEM = eINSTANCE.getMenu_ParentItem();

				/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.MenuBarImpl <em>Menu Bar</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.MenuBarImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenuBar()
		 * @generated
		 */
    EClass MENU_BAR = eINSTANCE.getMenuBar();

    /**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MENU_BAR__PARENT = eINSTANCE.getMenuBar_Parent();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.LabeledImpl <em>Labeled</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.LabeledImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLabeled()
		 * @generated
		 */
    EClass LABELED = eINSTANCE.getLabeled();

    /**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LABELED__TEXT = eINSTANCE.getLabeled_Text();

    /**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LABELED__IMAGE = eINSTANCE.getLabeled_Image();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ItemImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getItem()
		 * @generated
		 */
    EClass ITEM = eINSTANCE.getItem();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.MenuItemImpl <em>Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.MenuItemImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenuItem()
		 * @generated
		 */
    EClass MENU_ITEM = eINSTANCE.getMenuItem();

    /**
		 * The meta object literal for the '<em><b>Menu Item Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ITEM__MENU_ITEM_STYLE = eINSTANCE.getMenuItem_MenuItemStyle();

				/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MENU_ITEM__MENU = eINSTANCE.getMenuItem_Menu();

    /**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MENU_ITEM__ID = eINSTANCE.getMenuItem_ID();

    /**
		 * The meta object literal for the '<em><b>Accelerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MENU_ITEM__ACCELERATOR = eINSTANCE.getMenuItem_Accelerator();

    /**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MENU_ITEM__ENABLED = eINSTANCE.getMenuItem_Enabled();

    /**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MENU_ITEM__SELECTION = eINSTANCE.getMenuItem_Selection();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ToolBarImpl <em>Tool Bar</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ToolBarImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getToolBar()
		 * @generated
		 */
    EClass TOOL_BAR = eINSTANCE.getToolBar();

    /**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TOOL_BAR__ITEMS = eINSTANCE.getToolBar_Items();

    /**
		 * The meta object literal for the '<em><b>Orientation Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TOOL_BAR__ORIENTATION_STYLE = eINSTANCE.getToolBar_OrientationStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ToolItemImpl <em>Tool Item</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ToolItemImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getToolItem()
		 * @generated
		 */
    EClass TOOL_ITEM = eINSTANCE.getToolItem();

    /**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TOOL_ITEM__PARENT = eINSTANCE.getToolItem_Parent();

    /**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TOOL_ITEM__ENABLED = eINSTANCE.getToolItem_Enabled();

    /**
		 * The meta object literal for the '<em><b>Hot Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TOOL_ITEM__HOT_IMAGE = eINSTANCE.getToolItem_HotImage();

    /**
		 * The meta object literal for the '<em><b>Tool Tip Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TOOL_ITEM__TOOL_TIP_TEXT = eINSTANCE.getToolItem_ToolTipText();

    /**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TOOL_ITEM__SELECTION = eINSTANCE.getToolItem_Selection();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.CoolBarImpl <em>Cool Bar</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.CoolBarImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCoolBar()
		 * @generated
		 */
    EClass COOL_BAR = eINSTANCE.getCoolBar();

    /**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COOL_BAR__ITEMS = eINSTANCE.getCoolBar_Items();

    /**
		 * The meta object literal for the '<em><b>Orientation Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COOL_BAR__ORIENTATION_STYLE = eINSTANCE.getCoolBar_OrientationStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.CoolItemImpl <em>Cool Item</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.CoolItemImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCoolItem()
		 * @generated
		 */
    EClass COOL_ITEM = eINSTANCE.getCoolItem();

    /**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COOL_ITEM__PARENT = eINSTANCE.getCoolItem_Parent();

    /**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COOL_ITEM__CONTROL = eINSTANCE.getCoolItem_Control();

    /**
		 * The meta object literal for the '<em><b>Minimum Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COOL_ITEM__MINIMUM_SIZE = eINSTANCE.getCoolItem_MinimumSize();

    /**
		 * The meta object literal for the '<em><b>Preferred Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COOL_ITEM__PREFERRED_SIZE = eINSTANCE.getCoolItem_PreferredSize();

    /**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COOL_ITEM__SIZE = eINSTANCE.getCoolItem_Size();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.LabelImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLabel()
		 * @generated
		 */
    EClass LABEL = eINSTANCE.getLabel();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.SeparatorImpl <em>Separator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.SeparatorImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSeparator()
		 * @generated
		 */
    EClass SEPARATOR = eINSTANCE.getSeparator();

    /**
		 * The meta object literal for the '<em><b>Orientation Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SEPARATOR__ORIENTATION_STYLE = eINSTANCE.getSeparator_OrientationStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ButtonImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getButton()
		 * @generated
		 */
    EClass BUTTON = eINSTANCE.getButton();

    /**
		 * The meta object literal for the '<em><b>Button Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BUTTON__BUTTON_STYLE = eINSTANCE.getButton_ButtonStyle();

    /**
		 * The meta object literal for the '<em><b>Arrow Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BUTTON__ARROW_STYLE = eINSTANCE.getButton_ArrowStyle();

    /**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BUTTON__SELECTION = eINSTANCE.getButton_Selection();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.TextImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getText()
		 * @generated
		 */
    EClass TEXT = eINSTANCE.getText();

    /**
		 * The meta object literal for the '<em><b>Multiplicity Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT__MULTIPLICITY_STYLE = eINSTANCE.getText_MultiplicityStyle();

    /**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

    /**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT__SELECTION = eINSTANCE.getText_Selection();

    /**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT__EDITABLE = eINSTANCE.getText_Editable();

    /**
		 * The meta object literal for the '<em><b>Echo Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT__ECHO_CHAR = eINSTANCE.getText_EchoChar();

    /**
		 * The meta object literal for the '<em><b>Tabs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT__TABS = eINSTANCE.getText_Tabs();

    /**
		 * The meta object literal for the '<em><b>Text Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT__TEXT_LIMIT = eINSTANCE.getText_TextLimit();

    /**
		 * The meta object literal for the '<em><b>Top Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT__TOP_INDEX = eINSTANCE.getText_TopIndex();

    /**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT__MESSAGE = eINSTANCE.getText_Message();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.PasswordTextImpl <em>Password Text</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.PasswordTextImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getPasswordText()
		 * @generated
		 */
    EClass PASSWORD_TEXT = eINSTANCE.getPasswordText();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.SearchTextImpl <em>Search Text</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.SearchTextImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSearchText()
		 * @generated
		 */
    EClass SEARCH_TEXT = eINSTANCE.getSearchText();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.IntervalControlImpl <em>Interval Control</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.IntervalControlImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getIntervalControl()
		 * @generated
		 */
    EClass INTERVAL_CONTROL = eINSTANCE.getIntervalControl();

    /**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INTERVAL_CONTROL__MINIMUM = eINSTANCE.getIntervalControl_Minimum();

    /**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INTERVAL_CONTROL__MAXIMUM = eINSTANCE.getIntervalControl_Maximum();

    /**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INTERVAL_CONTROL__SELECTION = eINSTANCE.getIntervalControl_Selection();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.IntervalSelectorImpl <em>Interval Selector</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.IntervalSelectorImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getIntervalSelector()
		 * @generated
		 */
    EClass INTERVAL_SELECTOR = eINSTANCE.getIntervalSelector();

    /**
		 * The meta object literal for the '<em><b>Orientation Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INTERVAL_SELECTOR__ORIENTATION_STYLE = eINSTANCE.getIntervalSelector_OrientationStyle();

    /**
		 * The meta object literal for the '<em><b>Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INTERVAL_SELECTOR__INCREMENT = eINSTANCE.getIntervalSelector_Increment();

    /**
		 * The meta object literal for the '<em><b>Page Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INTERVAL_SELECTOR__PAGE_INCREMENT = eINSTANCE.getIntervalSelector_PageIncrement();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.SliderImpl <em>Slider</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.SliderImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSlider()
		 * @generated
		 */
    EClass SLIDER = eINSTANCE.getSlider();

    /**
		 * The meta object literal for the '<em><b>Thumb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDER__THUMB = eINSTANCE.getSlider_Thumb();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.SpinnerImpl <em>Spinner</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.SpinnerImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSpinner()
		 * @generated
		 */
    EClass SPINNER = eINSTANCE.getSpinner();

    /**
		 * The meta object literal for the '<em><b>Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SPINNER__DIGITS = eINSTANCE.getSpinner_Digits();

    /**
		 * The meta object literal for the '<em><b>Text Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SPINNER__TEXT_LIMIT = eINSTANCE.getSpinner_TextLimit();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ProgressBarImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getProgressBar()
		 * @generated
		 */
    EClass PROGRESS_BAR = eINSTANCE.getProgressBar();

    /**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROGRESS_BAR__STATE = eINSTANCE.getProgressBar_State();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.DateTimeImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getDateTime()
		 * @generated
		 */
    EClass DATE_TIME = eINSTANCE.getDateTime();

    /**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE_TIME__SECONDS = eINSTANCE.getDateTime_Seconds();

    /**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE_TIME__MINUTES = eINSTANCE.getDateTime_Minutes();

    /**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE_TIME__HOURS = eINSTANCE.getDateTime_Hours();

    /**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE_TIME__DAY = eINSTANCE.getDateTime_Day();

    /**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE_TIME__MONTH = eINSTANCE.getDateTime_Month();

    /**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DATE_TIME__YEAR = eINSTANCE.getDateTime_Year();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.BrowserImpl <em>Browser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.BrowserImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getBrowser()
		 * @generated
		 */
		EClass BROWSER = eINSTANCE.getBrowser();

				/**
		 * The meta object literal for the '<em><b>Javascript Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSER__JAVASCRIPT_ENABLED = eINSTANCE.getBrowser_JavascriptEnabled();

				/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSER__TEXT = eINSTANCE.getBrowser_Text();

				/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSER__URL = eINSTANCE.getBrowser_Url();

				/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.AbstractListImpl <em>Abstract List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.AbstractListImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getAbstractList()
		 * @generated
		 */
    EClass ABSTRACT_LIST = eINSTANCE.getAbstractList();

    /**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_LIST__ITEMS = eINSTANCE.getAbstractList_Items();

    /**
		 * The meta object literal for the '<em><b>Selection Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_LIST__SELECTION_INDEX = eINSTANCE.getAbstractList_SelectionIndex();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ListImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getList()
		 * @generated
		 */
    EClass LIST = eINSTANCE.getList();

    /**
		 * The meta object literal for the '<em><b>Multiplicity Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LIST__MULTIPLICITY_STYLE = eINSTANCE.getList_MultiplicityStyle();

    /**
		 * The meta object literal for the '<em><b>Selection Indices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LIST__SELECTION_INDICES = eINSTANCE.getList_SelectionIndices();

    /**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LIST__SELECTION = eINSTANCE.getList_Selection();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ComboImpl <em>Combo</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ComboImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCombo()
		 * @generated
		 */
    EClass COMBO = eINSTANCE.getCombo();

    /**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COMBO__TEXT = eINSTANCE.getCombo_Text();

    /**
		 * The meta object literal for the '<em><b>Text Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COMBO__TEXT_LIMIT = eINSTANCE.getCombo_TextLimit();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.TabFolderImpl <em>Tab Folder</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.TabFolderImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTabFolder()
		 * @generated
		 */
    EClass TAB_FOLDER = eINSTANCE.getTabFolder();

    /**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TAB_FOLDER__ITEMS = eINSTANCE.getTabFolder_Items();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.TabItemImpl <em>Tab Item</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.TabItemImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTabItem()
		 * @generated
		 */
    EClass TAB_ITEM = eINSTANCE.getTabItem();

    /**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TAB_ITEM__CONTROL = eINSTANCE.getTabItem_Control();

    /**
		 * The meta object literal for the '<em><b>Tool Tip Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TAB_ITEM__TOOL_TIP_TEXT = eINSTANCE.getTabItem_ToolTipText();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ColorImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getColor()
		 * @generated
		 */
    EClass COLOR = eINSTANCE.getColor();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.SystemColorImpl <em>System Color</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.SystemColorImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSystemColor()
		 * @generated
		 */
    EClass SYSTEM_COLOR = eINSTANCE.getSystemColor();

    /**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SYSTEM_COLOR__COLOR = eINSTANCE.getSystemColor_Color();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.RGBColorImpl <em>RGB Color</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.RGBColorImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getRGBColor()
		 * @generated
		 */
    EClass RGB_COLOR = eINSTANCE.getRGBColor();

    /**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RGB_COLOR__RED = eINSTANCE.getRGBColor_Red();

    /**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RGB_COLOR__GREEN = eINSTANCE.getRGBColor_Green();

    /**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RGB_COLOR__BLUE = eINSTANCE.getRGBColor_Blue();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.FontImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFont()
		 * @generated
		 */
    EClass FONT = eINSTANCE.getFont();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FONT__NAME = eINSTANCE.getFont_Name();

    /**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FONT__STYLE = eINSTANCE.getFont_Style();

    /**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FONT__HEIGHT = eINSTANCE.getFont_Height();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.FillLayoutImpl <em>Fill Layout</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.FillLayoutImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFillLayout()
		 * @generated
		 */
    EClass FILL_LAYOUT = eINSTANCE.getFillLayout();

    /**
		 * The meta object literal for the '<em><b>Orientation Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FILL_LAYOUT__ORIENTATION_STYLE = eINSTANCE.getFillLayout_OrientationStyle();

    /**
		 * The meta object literal for the '<em><b>Margin Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FILL_LAYOUT__MARGIN_WIDTH = eINSTANCE.getFillLayout_MarginWidth();

    /**
		 * The meta object literal for the '<em><b>Margin Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FILL_LAYOUT__MARGIN_HEIGHT = eINSTANCE.getFillLayout_MarginHeight();

    /**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FILL_LAYOUT__SPACING = eINSTANCE.getFillLayout_Spacing();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl <em>Row Layout</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.RowLayoutImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getRowLayout()
		 * @generated
		 */
    EClass ROW_LAYOUT = eINSTANCE.getRowLayout();

    /**
		 * The meta object literal for the '<em><b>Orientation Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__ORIENTATION_STYLE = eINSTANCE.getRowLayout_OrientationStyle();

    /**
		 * The meta object literal for the '<em><b>Margin Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__MARGIN_WIDTH = eINSTANCE.getRowLayout_MarginWidth();

    /**
		 * The meta object literal for the '<em><b>Margin Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__MARGIN_HEIGHT = eINSTANCE.getRowLayout_MarginHeight();

    /**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__SPACING = eINSTANCE.getRowLayout_Spacing();

    /**
		 * The meta object literal for the '<em><b>Wrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__WRAP = eINSTANCE.getRowLayout_Wrap();

    /**
		 * The meta object literal for the '<em><b>Pack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__PACK = eINSTANCE.getRowLayout_Pack();

    /**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__FILL = eINSTANCE.getRowLayout_Fill();

    /**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__CENTER = eINSTANCE.getRowLayout_Center();

    /**
		 * The meta object literal for the '<em><b>Justify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__JUSTIFY = eINSTANCE.getRowLayout_Justify();

    /**
		 * The meta object literal for the '<em><b>Margin Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__MARGIN_LEFT = eINSTANCE.getRowLayout_MarginLeft();

    /**
		 * The meta object literal for the '<em><b>Margin Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__MARGIN_TOP = eINSTANCE.getRowLayout_MarginTop();

    /**
		 * The meta object literal for the '<em><b>Margin Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__MARGIN_RIGHT = eINSTANCE.getRowLayout_MarginRight();

    /**
		 * The meta object literal for the '<em><b>Margin Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_LAYOUT__MARGIN_BOTTOM = eINSTANCE.getRowLayout_MarginBottom();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.RowDataImpl <em>Row Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.RowDataImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getRowData()
		 * @generated
		 */
    EClass ROW_DATA = eINSTANCE.getRowData();

    /**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_DATA__WIDTH = eINSTANCE.getRowData_Width();

    /**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_DATA__HEIGHT = eINSTANCE.getRowData_Height();

    /**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROW_DATA__EXCLUDE = eINSTANCE.getRowData_Exclude();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.GridLayoutImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getGridLayout()
		 * @generated
		 */
    EClass GRID_LAYOUT = eINSTANCE.getGridLayout();

    /**
		 * The meta object literal for the '<em><b>Num Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__NUM_COLUMNS = eINSTANCE.getGridLayout_NumColumns();

    /**
		 * The meta object literal for the '<em><b>Make Columns Equal Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH = eINSTANCE.getGridLayout_MakeColumnsEqualWidth();

    /**
		 * The meta object literal for the '<em><b>Margin Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__MARGIN_WIDTH = eINSTANCE.getGridLayout_MarginWidth();

    /**
		 * The meta object literal for the '<em><b>Margin Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__MARGIN_HEIGHT = eINSTANCE.getGridLayout_MarginHeight();

    /**
		 * The meta object literal for the '<em><b>Margin Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__MARGIN_LEFT = eINSTANCE.getGridLayout_MarginLeft();

    /**
		 * The meta object literal for the '<em><b>Margin Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__MARGIN_TOP = eINSTANCE.getGridLayout_MarginTop();

    /**
		 * The meta object literal for the '<em><b>Margin Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__MARGIN_RIGHT = eINSTANCE.getGridLayout_MarginRight();

    /**
		 * The meta object literal for the '<em><b>Margin Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__MARGIN_BOTTOM = eINSTANCE.getGridLayout_MarginBottom();

    /**
		 * The meta object literal for the '<em><b>Horizontal Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__HORIZONTAL_SPACING = eINSTANCE.getGridLayout_HorizontalSpacing();

    /**
		 * The meta object literal for the '<em><b>Vertical Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_LAYOUT__VERTICAL_SPACING = eINSTANCE.getGridLayout_VerticalSpacing();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.GridDataImpl <em>Grid Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.GridDataImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getGridData()
		 * @generated
		 */
    EClass GRID_DATA = eINSTANCE.getGridData();

    /**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__VERTICAL_ALIGNMENT = eINSTANCE.getGridData_VerticalAlignment();

    /**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__HORIZONTAL_ALIGNMENT = eINSTANCE.getGridData_HorizontalAlignment();

    /**
		 * The meta object literal for the '<em><b>Width Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__WIDTH_HINT = eINSTANCE.getGridData_WidthHint();

    /**
		 * The meta object literal for the '<em><b>Height Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__HEIGHT_HINT = eINSTANCE.getGridData_HeightHint();

    /**
		 * The meta object literal for the '<em><b>Horizontal Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__HORIZONTAL_INDENT = eINSTANCE.getGridData_HorizontalIndent();

    /**
		 * The meta object literal for the '<em><b>Vertical Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__VERTICAL_INDENT = eINSTANCE.getGridData_VerticalIndent();

    /**
		 * The meta object literal for the '<em><b>Horizontal Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__HORIZONTAL_SPAN = eINSTANCE.getGridData_HorizontalSpan();

    /**
		 * The meta object literal for the '<em><b>Vertical Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__VERTICAL_SPAN = eINSTANCE.getGridData_VerticalSpan();

    /**
		 * The meta object literal for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = eINSTANCE.getGridData_GrabExcessHorizontalSpace();

    /**
		 * The meta object literal for the '<em><b>Grab Excess Vertical Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE = eINSTANCE.getGridData_GrabExcessVerticalSpace();

    /**
		 * The meta object literal for the '<em><b>Minimum Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__MINIMUM_WIDTH = eINSTANCE.getGridData_MinimumWidth();

    /**
		 * The meta object literal for the '<em><b>Minimum Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__MINIMUM_HEIGHT = eINSTANCE.getGridData_MinimumHeight();

    /**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GRID_DATA__EXCLUDE = eINSTANCE.getGridData_Exclude();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.FormLayoutImpl <em>Form Layout</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.FormLayoutImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFormLayout()
		 * @generated
		 */
    EClass FORM_LAYOUT = eINSTANCE.getFormLayout();

    /**
		 * The meta object literal for the '<em><b>Margin Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_LAYOUT__MARGIN_WIDTH = eINSTANCE.getFormLayout_MarginWidth();

    /**
		 * The meta object literal for the '<em><b>Margin Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_LAYOUT__MARGIN_HEIGHT = eINSTANCE.getFormLayout_MarginHeight();

    /**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_LAYOUT__SPACING = eINSTANCE.getFormLayout_Spacing();

    /**
		 * The meta object literal for the '<em><b>Margin Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_LAYOUT__MARGIN_LEFT = eINSTANCE.getFormLayout_MarginLeft();

    /**
		 * The meta object literal for the '<em><b>Margin Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_LAYOUT__MARGIN_TOP = eINSTANCE.getFormLayout_MarginTop();

    /**
		 * The meta object literal for the '<em><b>Margin Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_LAYOUT__MARGIN_RIGHT = eINSTANCE.getFormLayout_MarginRight();

    /**
		 * The meta object literal for the '<em><b>Margin Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_LAYOUT__MARGIN_BOTTOM = eINSTANCE.getFormLayout_MarginBottom();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.FormDataImpl <em>Form Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.FormDataImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFormData()
		 * @generated
		 */
    EClass FORM_DATA = eINSTANCE.getFormData();

    /**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_DATA__WIDTH = eINSTANCE.getFormData_Width();

    /**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_DATA__HEIGHT = eINSTANCE.getFormData_Height();

    /**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FORM_DATA__LEFT = eINSTANCE.getFormData_Left();

    /**
		 * The meta object literal for the '<em><b>Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FORM_DATA__TOP = eINSTANCE.getFormData_Top();

    /**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FORM_DATA__RIGHT = eINSTANCE.getFormData_Right();

    /**
		 * The meta object literal for the '<em><b>Bottom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FORM_DATA__BOTTOM = eINSTANCE.getFormData_Bottom();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.FormAttachmentImpl <em>Form Attachment</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.FormAttachmentImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFormAttachment()
		 * @generated
		 */
    EClass FORM_ATTACHMENT = eINSTANCE.getFormAttachment();

    /**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_ATTACHMENT__ALIGNMENT = eINSTANCE.getFormAttachment_Alignment();

    /**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FORM_ATTACHMENT__CONTROL = eINSTANCE.getFormAttachment_Control();

    /**
		 * The meta object literal for the '<em><b>Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_ATTACHMENT__DENOMINATOR = eINSTANCE.getFormAttachment_Denominator();

    /**
		 * The meta object literal for the '<em><b>Numerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_ATTACHMENT__NUMERATOR = eINSTANCE.getFormAttachment_Numerator();

    /**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FORM_ATTACHMENT__OFFSET = eINSTANCE.getFormAttachment_Offset();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl <em>Line Attributes</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.LineAttributesImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLineAttributes()
		 * @generated
		 */
    EClass LINE_ATTRIBUTES = eINSTANCE.getLineAttributes();

    /**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LINE_ATTRIBUTES__WIDTH = eINSTANCE.getLineAttributes_Width();

    /**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LINE_ATTRIBUTES__STYLE = eINSTANCE.getLineAttributes_Style();

    /**
		 * The meta object literal for the '<em><b>Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LINE_ATTRIBUTES__CAP = eINSTANCE.getLineAttributes_Cap();

    /**
		 * The meta object literal for the '<em><b>Join</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LINE_ATTRIBUTES__JOIN = eINSTANCE.getLineAttributes_Join();

    /**
		 * The meta object literal for the '<em><b>Dash</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LINE_ATTRIBUTES__DASH = eINSTANCE.getLineAttributes_Dash();

    /**
		 * The meta object literal for the '<em><b>Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LINE_ATTRIBUTES__DASH_OFFSET = eINSTANCE.getLineAttributes_DashOffset();

    /**
		 * The meta object literal for the '<em><b>Miter Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LINE_ATTRIBUTES__MITER_LIMIT = eINSTANCE.getLineAttributes_MiterLimit();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.TreeColumnImpl <em>Tree Column</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.TreeColumnImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTreeColumn()
		 * @generated
		 */
    EClass TREE_COLUMN = eINSTANCE.getTreeColumn();

    /**
		 * The meta object literal for the '<em><b>Tool Tip Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TREE_COLUMN__TOOL_TIP_TEXT = eINSTANCE.getTreeColumn_ToolTipText();

    /**
		 * The meta object literal for the '<em><b>Display Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TREE_COLUMN__DISPLAY_TEXT = eINSTANCE.getTreeColumn_DisplayText();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.TreeImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTree()
		 * @generated
		 */
    EClass TREE = eINSTANCE.getTree();

    /**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TREE__COLUMNS = eINSTANCE.getTree_Columns();

    /**
		 * The meta object literal for the '<em><b>Header Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TREE__HEADER_VISIBLE = eINSTANCE.getTree_HeaderVisible();

    /**
		 * The meta object literal for the '<em><b>Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TREE__LINES_VISIBLE = eINSTANCE.getTree_LinesVisible();

    /**
		 * The meta object literal for the '<em><b>Sort Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TREE__SORT_COLUMN = eINSTANCE.getTree_SortColumn();

    /**
		 * The meta object literal for the '<em><b>Sort Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TREE__SORT_DIRECTION = eINSTANCE.getTree_SortDirection();

    /**
		 * The meta object literal for the '<em><b>Viewer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TREE__VIEWER = eINSTANCE.getTree_Viewer();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.ViewerImpl <em>Viewer</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.ViewerImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getViewer()
		 * @generated
		 */
    EClass VIEWER = eINSTANCE.getViewer();

    /**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VIEWER__CONTROL = eINSTANCE.getViewer_Control();

    /**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VIEWER__INPUT = eINSTANCE.getViewer_Input();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.impl.TreeViewerImpl <em>Tree Viewer</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.impl.TreeViewerImpl
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTreeViewer()
		 * @generated
		 */
    EClass TREE_VIEWER = eINSTANCE.getTreeViewer();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.ProgressState <em>Progress State</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.ProgressState
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getProgressState()
		 * @generated
		 */
    EEnum PROGRESS_STATE = eINSTANCE.getProgressState();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.SystemColors <em>System Colors</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.SystemColors
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSystemColors()
		 * @generated
		 */
    EEnum SYSTEM_COLORS = eINSTANCE.getSystemColors();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.FontStyle <em>Font Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.FontStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFontStyle()
		 * @generated
		 */
    EEnum FONT_STYLE = eINSTANCE.getFontStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment <em>Form Attachment Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getFormAttachmentAlignment()
		 * @generated
		 */
    EEnum FORM_ATTACHMENT_ALIGNMENT = eINSTANCE.getFormAttachmentAlignment();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.BorderStyle <em>Border Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.BorderStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getBorderStyle()
		 * @generated
		 */
    EEnum BORDER_STYLE = eINSTANCE.getBorderStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.ButtonStyle <em>Button Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.ButtonStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getButtonStyle()
		 * @generated
		 */
    EEnum BUTTON_STYLE = eINSTANCE.getButtonStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.ArrowStyle <em>Arrow Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.ArrowStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getArrowStyle()
		 * @generated
		 */
    EEnum ARROW_STYLE = eINSTANCE.getArrowStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.TextOrientationStyle <em>Text Orientation Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.TextOrientationStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTextOrientationStyle()
		 * @generated
		 */
    EEnum TEXT_ORIENTATION_STYLE = eINSTANCE.getTextOrientationStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.OrientationStyle <em>Orientation Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.OrientationStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getOrientationStyle()
		 * @generated
		 */
    EEnum ORIENTATION_STYLE = eINSTANCE.getOrientationStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle <em>Horizontal Alignment Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getHorizontalAlignmentStyle()
		 * @generated
		 */
    EEnum HORIZONTAL_ALIGNMENT_STYLE = eINSTANCE.getHorizontalAlignmentStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle <em>Vertical Alignment Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getVerticalAlignmentStyle()
		 * @generated
		 */
    EEnum VERTICAL_ALIGNMENT_STYLE = eINSTANCE.getVerticalAlignmentStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.MultiplicityStyle <em>Multiplicity Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.MultiplicityStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMultiplicityStyle()
		 * @generated
		 */
    EEnum MULTIPLICITY_STYLE = eINSTANCE.getMultiplicityStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.ComboStyle <em>Combo Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.ComboStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getComboStyle()
		 * @generated
		 */
    EEnum COMBO_STYLE = eINSTANCE.getComboStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.MenuStyle <em>Menu Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.MenuStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenuStyle()
		 * @generated
		 */
		EEnum MENU_STYLE = eINSTANCE.getMenuStyle();

				/**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.MenuItemStyle <em>Menu Item Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.MenuItemStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getMenuItemStyle()
		 * @generated
		 */
    EEnum MENU_ITEM_STYLE = eINSTANCE.getMenuItemStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.ModalStyle <em>Modal Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.ModalStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getModalStyle()
		 * @generated
		 */
    EEnum MODAL_STYLE = eINSTANCE.getModalStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.TrimStyle <em>Trim Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.TrimStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getTrimStyle()
		 * @generated
		 */
    EEnum TRIM_STYLE = eINSTANCE.getTrimStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.LineStyle <em>Line Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.LineStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getLineStyle()
		 * @generated
		 */
    EEnum LINE_STYLE = eINSTANCE.getLineStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.CapStyle <em>Cap Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.CapStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getCapStyle()
		 * @generated
		 */
    EEnum CAP_STYLE = eINSTANCE.getCapStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.JoinStyle <em>Join Style</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.JoinStyle
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getJoinStyle()
		 * @generated
		 */
    EEnum JOIN_STYLE = eINSTANCE.getJoinStyle();

    /**
		 * The meta object literal for the '{@link org.eclipse.gmt.emfacade.swt.SortDirection <em>Sort Direction</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.emfacade.swt.SortDirection
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getSortDirection()
		 * @generated
		 */
    EEnum SORT_DIRECTION = eINSTANCE.getSortDirection();

    /**
		 * The meta object literal for the '<em>Image Ref</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getImageRef()
		 * @generated
		 */
    EDataType IMAGE_REF = eINSTANCE.getImageRef();

    /**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

				/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Point
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getPoint()
		 * @generated
		 */
    EDataType POINT = eINSTANCE.getPoint();

    /**
		 * The meta object literal for the '<em>Viewer Input</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.gmt.emfacade.swt.impl.SwtPackageImpl#getViewerInput()
		 * @generated
		 */
    EDataType VIEWER_INPUT = eINSTANCE.getViewerInput();

  }

} //SwtPackage
