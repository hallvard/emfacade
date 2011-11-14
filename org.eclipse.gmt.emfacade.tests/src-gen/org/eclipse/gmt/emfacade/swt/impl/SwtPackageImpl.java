/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.gmt.emfacade.swt.AbstractComposite;
import org.eclipse.gmt.emfacade.swt.AbstractList;
import org.eclipse.gmt.emfacade.swt.AbstractMenu;
import org.eclipse.gmt.emfacade.swt.ArrowStyle;
import org.eclipse.gmt.emfacade.swt.BorderStyle;
import org.eclipse.gmt.emfacade.swt.Browser;
import org.eclipse.gmt.emfacade.swt.Button;
import org.eclipse.gmt.emfacade.swt.ButtonStyle;
import org.eclipse.gmt.emfacade.swt.Canvas;
import org.eclipse.gmt.emfacade.swt.CapStyle;
import org.eclipse.gmt.emfacade.swt.Color;
import org.eclipse.gmt.emfacade.swt.Combo;
import org.eclipse.gmt.emfacade.swt.ComboStyle;
import org.eclipse.gmt.emfacade.swt.Composite;
import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.CoolBar;
import org.eclipse.gmt.emfacade.swt.CoolItem;
import org.eclipse.gmt.emfacade.swt.DateTime;
import org.eclipse.gmt.emfacade.swt.Decorations;
import org.eclipse.gmt.emfacade.swt.FillLayout;
import org.eclipse.gmt.emfacade.swt.Font;
import org.eclipse.gmt.emfacade.swt.FontStyle;
import org.eclipse.gmt.emfacade.swt.FormAttachment;
import org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment;
import org.eclipse.gmt.emfacade.swt.FormData;
import org.eclipse.gmt.emfacade.swt.FormLayout;
import org.eclipse.gmt.emfacade.swt.GridData;
import org.eclipse.gmt.emfacade.swt.GridLayout;
import org.eclipse.gmt.emfacade.swt.Group;
import org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle;
import org.eclipse.gmt.emfacade.swt.IntervalControl;
import org.eclipse.gmt.emfacade.swt.IntervalSelector;
import org.eclipse.gmt.emfacade.swt.Item;
import org.eclipse.gmt.emfacade.swt.JoinStyle;
import org.eclipse.gmt.emfacade.swt.Label;
import org.eclipse.gmt.emfacade.swt.Labeled;
import org.eclipse.gmt.emfacade.swt.Layout;
import org.eclipse.gmt.emfacade.swt.LayoutData;
import org.eclipse.gmt.emfacade.swt.LineAttributes;
import org.eclipse.gmt.emfacade.swt.LineStyle;
import org.eclipse.gmt.emfacade.swt.List;
import org.eclipse.gmt.emfacade.swt.Menu;
import org.eclipse.gmt.emfacade.swt.MenuBar;
import org.eclipse.gmt.emfacade.swt.MenuItem;
import org.eclipse.gmt.emfacade.swt.MenuItemStyle;
import org.eclipse.gmt.emfacade.swt.MenuStyle;
import org.eclipse.gmt.emfacade.swt.ModalStyle;
import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.PasswordText;
import org.eclipse.gmt.emfacade.swt.ProgressBar;
import org.eclipse.gmt.emfacade.swt.ProgressState;
import org.eclipse.gmt.emfacade.swt.RGBColor;
import org.eclipse.gmt.emfacade.swt.RowData;
import org.eclipse.gmt.emfacade.swt.RowLayout;
import org.eclipse.gmt.emfacade.swt.SearchText;
import org.eclipse.gmt.emfacade.swt.Separator;
import org.eclipse.gmt.emfacade.swt.Shell;
import org.eclipse.gmt.emfacade.swt.Slider;
import org.eclipse.gmt.emfacade.swt.SortDirection;
import org.eclipse.gmt.emfacade.swt.Spinner;
import org.eclipse.gmt.emfacade.swt.SwtFactory;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.SystemColor;
import org.eclipse.gmt.emfacade.swt.SystemColors;
import org.eclipse.gmt.emfacade.swt.TabFolder;
import org.eclipse.gmt.emfacade.swt.TabItem;
import org.eclipse.gmt.emfacade.swt.Text;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;
import org.eclipse.gmt.emfacade.swt.ToolBar;
import org.eclipse.gmt.emfacade.swt.ToolItem;
import org.eclipse.gmt.emfacade.swt.Tree;
import org.eclipse.gmt.emfacade.swt.TreeColumn;
import org.eclipse.gmt.emfacade.swt.TreeViewer;
import org.eclipse.gmt.emfacade.swt.TrimStyle;
import org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle;
import org.eclipse.gmt.emfacade.swt.Viewer;
import org.eclipse.gmt.emfacade.swt.Widget;
import org.eclipse.swt.graphics.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwtPackageImpl extends EPackageImpl implements SwtPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass widgetEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass layoutEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass layoutDataEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controlEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractCompositeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass compositeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass groupEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass canvasEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass decorationsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass shellEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMenuEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass menuEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass menuBarEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass labeledEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass itemEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass menuItemEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass toolBarEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass toolItemEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass coolBarEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass coolItemEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass labelEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass separatorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass buttonEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass textEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass passwordTextEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass searchTextEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass intervalControlEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass intervalSelectorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass sliderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass spinnerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass progressBarEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dateTimeEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browserEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass listEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass comboEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tabFolderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tabItemEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass colorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass systemColorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rgbColorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass fontEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass fillLayoutEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rowLayoutEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rowDataEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass gridLayoutEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass gridDataEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass formLayoutEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass formDataEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass formAttachmentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lineAttributesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass treeColumnEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass treeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass viewerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass treeViewerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum progressStateEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum systemColorsEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum fontStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum formAttachmentAlignmentEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum borderStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum buttonStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum arrowStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum textOrientationStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum orientationStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum horizontalAlignmentStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum verticalAlignmentStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum multiplicityStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum comboStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum menuStyleEEnum = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum menuItemStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum modalStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum trimStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum lineStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum capStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum joinStyleEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum sortDirectionEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType imageRefEDataType = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType pointEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType viewerInputEDataType = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SwtPackageImpl()
  {
		super(eNS_URI, SwtFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SwtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SwtPackage init()
  {
		if (isInited) return (SwtPackage)EPackage.Registry.INSTANCE.getEPackage(SwtPackage.eNS_URI);

		// Obtain or create and register package
		SwtPackageImpl theSwtPackage = (SwtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SwtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SwtPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theSwtPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theSwtPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSwtPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SwtPackage.eNS_URI, theSwtPackage);
		return theSwtPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWidget()
  {
		return widgetEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getWidget_Style()
  {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLayout()
  {
		return layoutEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLayoutData()
  {
		return layoutDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControl()
  {
		return controlEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControl_Parent()
  {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControl_BorderStyle()
  {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControl_TextOrientationStyle()
  {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControl_LayoutData()
  {
		return (EReference)controlEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControl_Enabled()
  {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControl_Visible()
  {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControl_TouchEnabled()
  {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControl_ToolTipText()
  {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControl_Background()
  {
		return (EReference)controlEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControl_Font()
  {
		return (EReference)controlEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Size() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(10);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractComposite()
  {
		return abstractCompositeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractComposite_Controls()
  {
		return (EReference)abstractCompositeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractComposite_Layout()
  {
		return (EReference)abstractCompositeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getComposite()
  {
		return compositeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGroup()
  {
		return groupEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGroup_Text()
  {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCanvas()
  {
		return canvasEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDecorations()
  {
		return decorationsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDecorations_Maximized()
  {
		return (EAttribute)decorationsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDecorations_Minimized()
  {
		return (EAttribute)decorationsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDecorations_MenuBar()
  {
		return (EReference)decorationsEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getShell()
  {
		return shellEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getShell_ModalStyle()
  {
		return (EAttribute)shellEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getShell_TrimStyle()
  {
		return (EAttribute)shellEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getShell_FullScreen()
  {
		return (EAttribute)shellEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getShell_Alpha()
  {
		return (EAttribute)shellEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShell_DefaultButton() {
		return (EReference)shellEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMenu() {
		return abstractMenuEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMenu_TextOrientationStyle() {
		return (EAttribute)abstractMenuEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMenu_Enabled() {
		return (EAttribute)abstractMenuEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMenu_Visible() {
		return (EAttribute)abstractMenuEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMenu_Items() {
		return (EReference)abstractMenuEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMenu()
  {
		return menuEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_MenuStyle() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_ParentItem() {
		return (EReference)menuEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMenuBar()
  {
		return menuBarEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMenuBar_Parent()
  {
		return (EReference)menuBarEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLabeled()
  {
		return labeledEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLabeled_Text()
  {
		return (EAttribute)labeledEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLabeled_Image()
  {
		return (EAttribute)labeledEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getItem()
  {
		return itemEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMenuItem()
  {
		return menuItemEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuItem_MenuItemStyle() {
		return (EAttribute)menuItemEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMenuItem_Menu()
  {
		return (EReference)menuItemEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMenuItem_ID()
  {
		return (EAttribute)menuItemEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMenuItem_Accelerator()
  {
		return (EAttribute)menuItemEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMenuItem_Enabled()
  {
		return (EAttribute)menuItemEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMenuItem_Selection()
  {
		return (EAttribute)menuItemEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getToolBar()
  {
		return toolBarEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getToolBar_Items()
  {
		return (EReference)toolBarEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getToolBar_OrientationStyle()
  {
		return (EAttribute)toolBarEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getToolItem()
  {
		return toolItemEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getToolItem_Parent()
  {
		return (EReference)toolItemEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getToolItem_Enabled()
  {
		return (EAttribute)toolItemEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getToolItem_HotImage()
  {
		return (EAttribute)toolItemEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getToolItem_ToolTipText()
  {
		return (EAttribute)toolItemEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getToolItem_Selection()
  {
		return (EAttribute)toolItemEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCoolBar()
  {
		return coolBarEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCoolBar_Items()
  {
		return (EReference)coolBarEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCoolBar_OrientationStyle()
  {
		return (EAttribute)coolBarEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCoolItem()
  {
		return coolItemEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCoolItem_Parent()
  {
		return (EReference)coolItemEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCoolItem_Control()
  {
		return (EReference)coolItemEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCoolItem_MinimumSize()
  {
		return (EAttribute)coolItemEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCoolItem_PreferredSize()
  {
		return (EAttribute)coolItemEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCoolItem_Size()
  {
		return (EAttribute)coolItemEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLabel()
  {
		return labelEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSeparator()
  {
		return separatorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSeparator_OrientationStyle()
  {
		return (EAttribute)separatorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getButton()
  {
		return buttonEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getButton_ButtonStyle()
  {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getButton_ArrowStyle()
  {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getButton_Selection()
  {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getText()
  {
		return textEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getText_MultiplicityStyle()
  {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getText_Text()
  {
		return (EAttribute)textEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getText_Selection()
  {
		return (EAttribute)textEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getText_Editable()
  {
		return (EAttribute)textEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getText_EchoChar()
  {
		return (EAttribute)textEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getText_Tabs()
  {
		return (EAttribute)textEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getText_TextLimit()
  {
		return (EAttribute)textEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getText_TopIndex()
  {
		return (EAttribute)textEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getText_Message()
  {
		return (EAttribute)textEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPasswordText()
  {
		return passwordTextEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSearchText()
  {
		return searchTextEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIntervalControl()
  {
		return intervalControlEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIntervalControl_Minimum()
  {
		return (EAttribute)intervalControlEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIntervalControl_Maximum()
  {
		return (EAttribute)intervalControlEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIntervalControl_Selection()
  {
		return (EAttribute)intervalControlEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIntervalSelector()
  {
		return intervalSelectorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIntervalSelector_OrientationStyle()
  {
		return (EAttribute)intervalSelectorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIntervalSelector_Increment()
  {
		return (EAttribute)intervalSelectorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIntervalSelector_PageIncrement()
  {
		return (EAttribute)intervalSelectorEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSlider()
  {
		return sliderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSlider_Thumb()
  {
		return (EAttribute)sliderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSpinner()
  {
		return spinnerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSpinner_Digits()
  {
		return (EAttribute)spinnerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSpinner_TextLimit()
  {
		return (EAttribute)spinnerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProgressBar()
  {
		return progressBarEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProgressBar_State()
  {
		return (EAttribute)progressBarEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDateTime()
  {
		return dateTimeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDateTime_Seconds()
  {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDateTime_Minutes()
  {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDateTime_Hours()
  {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDateTime_Day()
  {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDateTime_Month()
  {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDateTime_Year()
  {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowser() {
		return browserEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowser_JavascriptEnabled() {
		return (EAttribute)browserEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowser_Text() {
		return (EAttribute)browserEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowser_Url() {
		return (EAttribute)browserEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractList()
  {
		return abstractListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractList_Items()
  {
		return (EAttribute)abstractListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractList_SelectionIndex()
  {
		return (EAttribute)abstractListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getList()
  {
		return listEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getList_MultiplicityStyle()
  {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getList_SelectionIndices()
  {
		return (EAttribute)listEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getList_Selection()
  {
		return (EAttribute)listEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCombo()
  {
		return comboEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCombo_Text()
  {
		return (EAttribute)comboEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCombo_TextLimit()
  {
		return (EAttribute)comboEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTabFolder()
  {
		return tabFolderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTabFolder_Items()
  {
		return (EReference)tabFolderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTabItem()
  {
		return tabItemEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTabItem_Control()
  {
		return (EReference)tabItemEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTabItem_ToolTipText()
  {
		return (EAttribute)tabItemEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getColor()
  {
		return colorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSystemColor()
  {
		return systemColorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSystemColor_Color()
  {
		return (EAttribute)systemColorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRGBColor()
  {
		return rgbColorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRGBColor_Red()
  {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRGBColor_Green()
  {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRGBColor_Blue()
  {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFont()
  {
		return fontEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFont_Name()
  {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFont_Style()
  {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFont_Height()
  {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFillLayout()
  {
		return fillLayoutEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFillLayout_OrientationStyle()
  {
		return (EAttribute)fillLayoutEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFillLayout_MarginWidth()
  {
		return (EAttribute)fillLayoutEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFillLayout_MarginHeight()
  {
		return (EAttribute)fillLayoutEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFillLayout_Spacing()
  {
		return (EAttribute)fillLayoutEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRowLayout()
  {
		return rowLayoutEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_OrientationStyle()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_MarginWidth()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_MarginHeight()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_Spacing()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_Wrap()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_Pack()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_Fill()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_Center()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_Justify()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_MarginLeft()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_MarginTop()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_MarginRight()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowLayout_MarginBottom()
  {
		return (EAttribute)rowLayoutEClass.getEStructuralFeatures().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRowData()
  {
		return rowDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowData_Width()
  {
		return (EAttribute)rowDataEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowData_Height()
  {
		return (EAttribute)rowDataEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRowData_Exclude()
  {
		return (EAttribute)rowDataEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGridLayout()
  {
		return gridLayoutEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_NumColumns()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_MakeColumnsEqualWidth()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_MarginWidth()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_MarginHeight()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_MarginLeft()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_MarginTop()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_MarginRight()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_MarginBottom()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_HorizontalSpacing()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridLayout_VerticalSpacing()
  {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGridData()
  {
		return gridDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_VerticalAlignment()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_HorizontalAlignment()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_WidthHint()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_HeightHint()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_HorizontalIndent()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_VerticalIndent()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_HorizontalSpan()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_VerticalSpan()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_GrabExcessHorizontalSpace()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_GrabExcessVerticalSpace()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_MinimumWidth()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_MinimumHeight()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGridData_Exclude()
  {
		return (EAttribute)gridDataEClass.getEStructuralFeatures().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFormLayout()
  {
		return formLayoutEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormLayout_MarginWidth()
  {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormLayout_MarginHeight()
  {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormLayout_Spacing()
  {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormLayout_MarginLeft()
  {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormLayout_MarginTop()
  {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormLayout_MarginRight()
  {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormLayout_MarginBottom()
  {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFormData()
  {
		return formDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormData_Width()
  {
		return (EAttribute)formDataEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormData_Height()
  {
		return (EAttribute)formDataEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFormData_Left()
  {
		return (EReference)formDataEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFormData_Top()
  {
		return (EReference)formDataEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFormData_Right()
  {
		return (EReference)formDataEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFormData_Bottom()
  {
		return (EReference)formDataEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFormAttachment()
  {
		return formAttachmentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormAttachment_Alignment()
  {
		return (EAttribute)formAttachmentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFormAttachment_Control()
  {
		return (EReference)formAttachmentEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormAttachment_Denominator()
  {
		return (EAttribute)formAttachmentEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormAttachment_Numerator()
  {
		return (EAttribute)formAttachmentEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFormAttachment_Offset()
  {
		return (EAttribute)formAttachmentEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLineAttributes()
  {
		return lineAttributesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLineAttributes_Width()
  {
		return (EAttribute)lineAttributesEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLineAttributes_Style()
  {
		return (EAttribute)lineAttributesEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLineAttributes_Cap()
  {
		return (EAttribute)lineAttributesEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLineAttributes_Join()
  {
		return (EAttribute)lineAttributesEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLineAttributes_Dash()
  {
		return (EAttribute)lineAttributesEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLineAttributes_DashOffset()
  {
		return (EAttribute)lineAttributesEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLineAttributes_MiterLimit()
  {
		return (EAttribute)lineAttributesEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTreeColumn()
  {
		return treeColumnEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTreeColumn_ToolTipText()
  {
		return (EAttribute)treeColumnEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTreeColumn_DisplayText()
  {
		return (EAttribute)treeColumnEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTree()
  {
		return treeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTree_Columns()
  {
		return (EReference)treeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTree_HeaderVisible()
  {
		return (EAttribute)treeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTree_LinesVisible()
  {
		return (EAttribute)treeEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTree_SortColumn()
  {
		return (EReference)treeEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTree_SortDirection()
  {
		return (EAttribute)treeEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTree_Viewer()
  {
		return (EReference)treeEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getViewer()
  {
		return viewerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getViewer_Control()
  {
		return (EReference)viewerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getViewer_Input()
  {
		return (EAttribute)viewerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTreeViewer()
  {
		return treeViewerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getProgressState()
  {
		return progressStateEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getSystemColors()
  {
		return systemColorsEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getFontStyle()
  {
		return fontStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getFormAttachmentAlignment()
  {
		return formAttachmentAlignmentEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getBorderStyle()
  {
		return borderStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getButtonStyle()
  {
		return buttonStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getArrowStyle()
  {
		return arrowStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getTextOrientationStyle()
  {
		return textOrientationStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getOrientationStyle()
  {
		return orientationStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getHorizontalAlignmentStyle()
  {
		return horizontalAlignmentStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getVerticalAlignmentStyle()
  {
		return verticalAlignmentStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getMultiplicityStyle()
  {
		return multiplicityStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getComboStyle()
  {
		return comboStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMenuStyle() {
		return menuStyleEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getMenuItemStyle()
  {
		return menuItemStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getModalStyle()
  {
		return modalStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getTrimStyle()
  {
		return trimStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getLineStyle()
  {
		return lineStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getCapStyle()
  {
		return capStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getJoinStyle()
  {
		return joinStyleEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getSortDirection()
  {
		return sortDirectionEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getImageRef()
  {
		return imageRefEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPoint()
  {
		return pointEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getViewerInput()
  {
		return viewerInputEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SwtFactory getSwtFactory()
  {
		return (SwtFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__STYLE);

		layoutEClass = createEClass(LAYOUT);

		layoutDataEClass = createEClass(LAYOUT_DATA);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__PARENT);
		createEAttribute(controlEClass, CONTROL__BORDER_STYLE);
		createEAttribute(controlEClass, CONTROL__TEXT_ORIENTATION_STYLE);
		createEReference(controlEClass, CONTROL__LAYOUT_DATA);
		createEAttribute(controlEClass, CONTROL__ENABLED);
		createEAttribute(controlEClass, CONTROL__VISIBLE);
		createEAttribute(controlEClass, CONTROL__TOUCH_ENABLED);
		createEAttribute(controlEClass, CONTROL__TOOL_TIP_TEXT);
		createEReference(controlEClass, CONTROL__BACKGROUND);
		createEReference(controlEClass, CONTROL__FONT);
		createEAttribute(controlEClass, CONTROL__SIZE);

		abstractCompositeEClass = createEClass(ABSTRACT_COMPOSITE);
		createEReference(abstractCompositeEClass, ABSTRACT_COMPOSITE__CONTROLS);
		createEReference(abstractCompositeEClass, ABSTRACT_COMPOSITE__LAYOUT);

		compositeEClass = createEClass(COMPOSITE);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__TEXT);

		canvasEClass = createEClass(CANVAS);

		decorationsEClass = createEClass(DECORATIONS);
		createEAttribute(decorationsEClass, DECORATIONS__MAXIMIZED);
		createEAttribute(decorationsEClass, DECORATIONS__MINIMIZED);
		createEReference(decorationsEClass, DECORATIONS__MENU_BAR);

		shellEClass = createEClass(SHELL);
		createEAttribute(shellEClass, SHELL__MODAL_STYLE);
		createEAttribute(shellEClass, SHELL__TRIM_STYLE);
		createEAttribute(shellEClass, SHELL__FULL_SCREEN);
		createEAttribute(shellEClass, SHELL__ALPHA);
		createEReference(shellEClass, SHELL__DEFAULT_BUTTON);

		abstractMenuEClass = createEClass(ABSTRACT_MENU);
		createEAttribute(abstractMenuEClass, ABSTRACT_MENU__TEXT_ORIENTATION_STYLE);
		createEAttribute(abstractMenuEClass, ABSTRACT_MENU__ENABLED);
		createEAttribute(abstractMenuEClass, ABSTRACT_MENU__VISIBLE);
		createEReference(abstractMenuEClass, ABSTRACT_MENU__ITEMS);

		menuEClass = createEClass(MENU);
		createEAttribute(menuEClass, MENU__MENU_STYLE);
		createEReference(menuEClass, MENU__PARENT_ITEM);

		menuBarEClass = createEClass(MENU_BAR);
		createEReference(menuBarEClass, MENU_BAR__PARENT);

		labeledEClass = createEClass(LABELED);
		createEAttribute(labeledEClass, LABELED__TEXT);
		createEAttribute(labeledEClass, LABELED__IMAGE);

		itemEClass = createEClass(ITEM);

		menuItemEClass = createEClass(MENU_ITEM);
		createEAttribute(menuItemEClass, MENU_ITEM__MENU_ITEM_STYLE);
		createEReference(menuItemEClass, MENU_ITEM__MENU);
		createEAttribute(menuItemEClass, MENU_ITEM__ID);
		createEAttribute(menuItemEClass, MENU_ITEM__ACCELERATOR);
		createEAttribute(menuItemEClass, MENU_ITEM__ENABLED);
		createEAttribute(menuItemEClass, MENU_ITEM__SELECTION);

		toolBarEClass = createEClass(TOOL_BAR);
		createEReference(toolBarEClass, TOOL_BAR__ITEMS);
		createEAttribute(toolBarEClass, TOOL_BAR__ORIENTATION_STYLE);

		toolItemEClass = createEClass(TOOL_ITEM);
		createEReference(toolItemEClass, TOOL_ITEM__PARENT);
		createEAttribute(toolItemEClass, TOOL_ITEM__ENABLED);
		createEAttribute(toolItemEClass, TOOL_ITEM__HOT_IMAGE);
		createEAttribute(toolItemEClass, TOOL_ITEM__TOOL_TIP_TEXT);
		createEAttribute(toolItemEClass, TOOL_ITEM__SELECTION);

		coolBarEClass = createEClass(COOL_BAR);
		createEReference(coolBarEClass, COOL_BAR__ITEMS);
		createEAttribute(coolBarEClass, COOL_BAR__ORIENTATION_STYLE);

		coolItemEClass = createEClass(COOL_ITEM);
		createEReference(coolItemEClass, COOL_ITEM__PARENT);
		createEReference(coolItemEClass, COOL_ITEM__CONTROL);
		createEAttribute(coolItemEClass, COOL_ITEM__MINIMUM_SIZE);
		createEAttribute(coolItemEClass, COOL_ITEM__PREFERRED_SIZE);
		createEAttribute(coolItemEClass, COOL_ITEM__SIZE);

		labelEClass = createEClass(LABEL);

		separatorEClass = createEClass(SEPARATOR);
		createEAttribute(separatorEClass, SEPARATOR__ORIENTATION_STYLE);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__BUTTON_STYLE);
		createEAttribute(buttonEClass, BUTTON__ARROW_STYLE);
		createEAttribute(buttonEClass, BUTTON__SELECTION);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__MULTIPLICITY_STYLE);
		createEAttribute(textEClass, TEXT__TEXT);
		createEAttribute(textEClass, TEXT__SELECTION);
		createEAttribute(textEClass, TEXT__EDITABLE);
		createEAttribute(textEClass, TEXT__ECHO_CHAR);
		createEAttribute(textEClass, TEXT__TABS);
		createEAttribute(textEClass, TEXT__TEXT_LIMIT);
		createEAttribute(textEClass, TEXT__TOP_INDEX);
		createEAttribute(textEClass, TEXT__MESSAGE);

		passwordTextEClass = createEClass(PASSWORD_TEXT);

		searchTextEClass = createEClass(SEARCH_TEXT);

		intervalControlEClass = createEClass(INTERVAL_CONTROL);
		createEAttribute(intervalControlEClass, INTERVAL_CONTROL__MINIMUM);
		createEAttribute(intervalControlEClass, INTERVAL_CONTROL__MAXIMUM);
		createEAttribute(intervalControlEClass, INTERVAL_CONTROL__SELECTION);

		intervalSelectorEClass = createEClass(INTERVAL_SELECTOR);
		createEAttribute(intervalSelectorEClass, INTERVAL_SELECTOR__ORIENTATION_STYLE);
		createEAttribute(intervalSelectorEClass, INTERVAL_SELECTOR__INCREMENT);
		createEAttribute(intervalSelectorEClass, INTERVAL_SELECTOR__PAGE_INCREMENT);

		sliderEClass = createEClass(SLIDER);
		createEAttribute(sliderEClass, SLIDER__THUMB);

		spinnerEClass = createEClass(SPINNER);
		createEAttribute(spinnerEClass, SPINNER__DIGITS);
		createEAttribute(spinnerEClass, SPINNER__TEXT_LIMIT);

		progressBarEClass = createEClass(PROGRESS_BAR);
		createEAttribute(progressBarEClass, PROGRESS_BAR__STATE);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__SECONDS);
		createEAttribute(dateTimeEClass, DATE_TIME__MINUTES);
		createEAttribute(dateTimeEClass, DATE_TIME__HOURS);
		createEAttribute(dateTimeEClass, DATE_TIME__DAY);
		createEAttribute(dateTimeEClass, DATE_TIME__MONTH);
		createEAttribute(dateTimeEClass, DATE_TIME__YEAR);

		browserEClass = createEClass(BROWSER);
		createEAttribute(browserEClass, BROWSER__JAVASCRIPT_ENABLED);
		createEAttribute(browserEClass, BROWSER__TEXT);
		createEAttribute(browserEClass, BROWSER__URL);

		abstractListEClass = createEClass(ABSTRACT_LIST);
		createEAttribute(abstractListEClass, ABSTRACT_LIST__ITEMS);
		createEAttribute(abstractListEClass, ABSTRACT_LIST__SELECTION_INDEX);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__MULTIPLICITY_STYLE);
		createEAttribute(listEClass, LIST__SELECTION_INDICES);
		createEAttribute(listEClass, LIST__SELECTION);

		comboEClass = createEClass(COMBO);
		createEAttribute(comboEClass, COMBO__TEXT);
		createEAttribute(comboEClass, COMBO__TEXT_LIMIT);

		tabFolderEClass = createEClass(TAB_FOLDER);
		createEReference(tabFolderEClass, TAB_FOLDER__ITEMS);

		tabItemEClass = createEClass(TAB_ITEM);
		createEReference(tabItemEClass, TAB_ITEM__CONTROL);
		createEAttribute(tabItemEClass, TAB_ITEM__TOOL_TIP_TEXT);

		colorEClass = createEClass(COLOR);

		systemColorEClass = createEClass(SYSTEM_COLOR);
		createEAttribute(systemColorEClass, SYSTEM_COLOR__COLOR);

		rgbColorEClass = createEClass(RGB_COLOR);
		createEAttribute(rgbColorEClass, RGB_COLOR__RED);
		createEAttribute(rgbColorEClass, RGB_COLOR__GREEN);
		createEAttribute(rgbColorEClass, RGB_COLOR__BLUE);

		fontEClass = createEClass(FONT);
		createEAttribute(fontEClass, FONT__NAME);
		createEAttribute(fontEClass, FONT__STYLE);
		createEAttribute(fontEClass, FONT__HEIGHT);

		fillLayoutEClass = createEClass(FILL_LAYOUT);
		createEAttribute(fillLayoutEClass, FILL_LAYOUT__ORIENTATION_STYLE);
		createEAttribute(fillLayoutEClass, FILL_LAYOUT__MARGIN_WIDTH);
		createEAttribute(fillLayoutEClass, FILL_LAYOUT__MARGIN_HEIGHT);
		createEAttribute(fillLayoutEClass, FILL_LAYOUT__SPACING);

		rowLayoutEClass = createEClass(ROW_LAYOUT);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__ORIENTATION_STYLE);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__MARGIN_WIDTH);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__MARGIN_HEIGHT);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__SPACING);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__WRAP);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__PACK);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__FILL);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__CENTER);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__JUSTIFY);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__MARGIN_LEFT);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__MARGIN_TOP);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__MARGIN_RIGHT);
		createEAttribute(rowLayoutEClass, ROW_LAYOUT__MARGIN_BOTTOM);

		rowDataEClass = createEClass(ROW_DATA);
		createEAttribute(rowDataEClass, ROW_DATA__WIDTH);
		createEAttribute(rowDataEClass, ROW_DATA__HEIGHT);
		createEAttribute(rowDataEClass, ROW_DATA__EXCLUDE);

		gridLayoutEClass = createEClass(GRID_LAYOUT);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__NUM_COLUMNS);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__MARGIN_WIDTH);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__MARGIN_HEIGHT);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__MARGIN_LEFT);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__MARGIN_TOP);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__MARGIN_RIGHT);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__MARGIN_BOTTOM);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__HORIZONTAL_SPACING);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__VERTICAL_SPACING);

		gridDataEClass = createEClass(GRID_DATA);
		createEAttribute(gridDataEClass, GRID_DATA__VERTICAL_ALIGNMENT);
		createEAttribute(gridDataEClass, GRID_DATA__HORIZONTAL_ALIGNMENT);
		createEAttribute(gridDataEClass, GRID_DATA__WIDTH_HINT);
		createEAttribute(gridDataEClass, GRID_DATA__HEIGHT_HINT);
		createEAttribute(gridDataEClass, GRID_DATA__HORIZONTAL_INDENT);
		createEAttribute(gridDataEClass, GRID_DATA__VERTICAL_INDENT);
		createEAttribute(gridDataEClass, GRID_DATA__HORIZONTAL_SPAN);
		createEAttribute(gridDataEClass, GRID_DATA__VERTICAL_SPAN);
		createEAttribute(gridDataEClass, GRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE);
		createEAttribute(gridDataEClass, GRID_DATA__GRAB_EXCESS_VERTICAL_SPACE);
		createEAttribute(gridDataEClass, GRID_DATA__MINIMUM_WIDTH);
		createEAttribute(gridDataEClass, GRID_DATA__MINIMUM_HEIGHT);
		createEAttribute(gridDataEClass, GRID_DATA__EXCLUDE);

		formLayoutEClass = createEClass(FORM_LAYOUT);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__MARGIN_WIDTH);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__MARGIN_HEIGHT);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__SPACING);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__MARGIN_LEFT);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__MARGIN_TOP);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__MARGIN_RIGHT);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__MARGIN_BOTTOM);

		formDataEClass = createEClass(FORM_DATA);
		createEAttribute(formDataEClass, FORM_DATA__WIDTH);
		createEAttribute(formDataEClass, FORM_DATA__HEIGHT);
		createEReference(formDataEClass, FORM_DATA__LEFT);
		createEReference(formDataEClass, FORM_DATA__TOP);
		createEReference(formDataEClass, FORM_DATA__RIGHT);
		createEReference(formDataEClass, FORM_DATA__BOTTOM);

		formAttachmentEClass = createEClass(FORM_ATTACHMENT);
		createEAttribute(formAttachmentEClass, FORM_ATTACHMENT__ALIGNMENT);
		createEReference(formAttachmentEClass, FORM_ATTACHMENT__CONTROL);
		createEAttribute(formAttachmentEClass, FORM_ATTACHMENT__DENOMINATOR);
		createEAttribute(formAttachmentEClass, FORM_ATTACHMENT__NUMERATOR);
		createEAttribute(formAttachmentEClass, FORM_ATTACHMENT__OFFSET);

		lineAttributesEClass = createEClass(LINE_ATTRIBUTES);
		createEAttribute(lineAttributesEClass, LINE_ATTRIBUTES__WIDTH);
		createEAttribute(lineAttributesEClass, LINE_ATTRIBUTES__STYLE);
		createEAttribute(lineAttributesEClass, LINE_ATTRIBUTES__CAP);
		createEAttribute(lineAttributesEClass, LINE_ATTRIBUTES__JOIN);
		createEAttribute(lineAttributesEClass, LINE_ATTRIBUTES__DASH);
		createEAttribute(lineAttributesEClass, LINE_ATTRIBUTES__DASH_OFFSET);
		createEAttribute(lineAttributesEClass, LINE_ATTRIBUTES__MITER_LIMIT);

		treeColumnEClass = createEClass(TREE_COLUMN);
		createEAttribute(treeColumnEClass, TREE_COLUMN__TOOL_TIP_TEXT);
		createEAttribute(treeColumnEClass, TREE_COLUMN__DISPLAY_TEXT);

		treeEClass = createEClass(TREE);
		createEReference(treeEClass, TREE__COLUMNS);
		createEAttribute(treeEClass, TREE__HEADER_VISIBLE);
		createEAttribute(treeEClass, TREE__LINES_VISIBLE);
		createEReference(treeEClass, TREE__SORT_COLUMN);
		createEAttribute(treeEClass, TREE__SORT_DIRECTION);
		createEReference(treeEClass, TREE__VIEWER);

		viewerEClass = createEClass(VIEWER);
		createEReference(viewerEClass, VIEWER__CONTROL);
		createEAttribute(viewerEClass, VIEWER__INPUT);

		treeViewerEClass = createEClass(TREE_VIEWER);

		// Create enums
		progressStateEEnum = createEEnum(PROGRESS_STATE);
		systemColorsEEnum = createEEnum(SYSTEM_COLORS);
		fontStyleEEnum = createEEnum(FONT_STYLE);
		formAttachmentAlignmentEEnum = createEEnum(FORM_ATTACHMENT_ALIGNMENT);
		borderStyleEEnum = createEEnum(BORDER_STYLE);
		buttonStyleEEnum = createEEnum(BUTTON_STYLE);
		arrowStyleEEnum = createEEnum(ARROW_STYLE);
		textOrientationStyleEEnum = createEEnum(TEXT_ORIENTATION_STYLE);
		orientationStyleEEnum = createEEnum(ORIENTATION_STYLE);
		horizontalAlignmentStyleEEnum = createEEnum(HORIZONTAL_ALIGNMENT_STYLE);
		verticalAlignmentStyleEEnum = createEEnum(VERTICAL_ALIGNMENT_STYLE);
		multiplicityStyleEEnum = createEEnum(MULTIPLICITY_STYLE);
		comboStyleEEnum = createEEnum(COMBO_STYLE);
		menuStyleEEnum = createEEnum(MENU_STYLE);
		menuItemStyleEEnum = createEEnum(MENU_ITEM_STYLE);
		modalStyleEEnum = createEEnum(MODAL_STYLE);
		trimStyleEEnum = createEEnum(TRIM_STYLE);
		lineStyleEEnum = createEEnum(LINE_STYLE);
		capStyleEEnum = createEEnum(CAP_STYLE);
		joinStyleEEnum = createEEnum(JOIN_STYLE);
		sortDirectionEEnum = createEEnum(SORT_DIRECTION);

		// Create data types
		imageRefEDataType = createEDataType(IMAGE_REF);
		uriEDataType = createEDataType(URI);
		pointEDataType = createEDataType(POINT);
		viewerInputEDataType = createEDataType(VIEWER_INPUT);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter layoutEClass_T = addETypeParameter(layoutEClass, "T");
		ETypeParameter abstractCompositeEClass_T = addETypeParameter(abstractCompositeEClass, "T");
		ETypeParameter viewerEClass_T = addETypeParameter(viewerEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getLayoutData());
		layoutEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getControl());
		abstractCompositeEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getControl());
		viewerEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		controlEClass.getESuperTypes().add(this.getWidget());
		abstractCompositeEClass.getESuperTypes().add(this.getControl());
		g1 = createEGenericType(this.getAbstractComposite());
		EGenericType g2 = createEGenericType(this.getControl());
		g1.getETypeArguments().add(g2);
		compositeEClass.getEGenericSuperTypes().add(g1);
		groupEClass.getESuperTypes().add(this.getComposite());
		canvasEClass.getESuperTypes().add(this.getComposite());
		decorationsEClass.getESuperTypes().add(this.getCanvas());
		shellEClass.getESuperTypes().add(this.getDecorations());
		abstractMenuEClass.getESuperTypes().add(this.getWidget());
		menuEClass.getESuperTypes().add(this.getAbstractMenu());
		menuBarEClass.getESuperTypes().add(this.getAbstractMenu());
		itemEClass.getESuperTypes().add(this.getWidget());
		itemEClass.getESuperTypes().add(this.getLabeled());
		menuItemEClass.getESuperTypes().add(this.getItem());
		toolBarEClass.getESuperTypes().add(this.getControl());
		toolItemEClass.getESuperTypes().add(this.getItem());
		g1 = createEGenericType(this.getAbstractComposite());
		g2 = createEGenericType(this.getControl());
		g1.getETypeArguments().add(g2);
		coolBarEClass.getEGenericSuperTypes().add(g1);
		coolItemEClass.getESuperTypes().add(this.getItem());
		labelEClass.getESuperTypes().add(this.getControl());
		labelEClass.getESuperTypes().add(this.getLabeled());
		separatorEClass.getESuperTypes().add(this.getControl());
		buttonEClass.getESuperTypes().add(this.getControl());
		buttonEClass.getESuperTypes().add(this.getLabeled());
		textEClass.getESuperTypes().add(this.getControl());
		passwordTextEClass.getESuperTypes().add(this.getText());
		searchTextEClass.getESuperTypes().add(this.getText());
		intervalControlEClass.getESuperTypes().add(this.getControl());
		intervalSelectorEClass.getESuperTypes().add(this.getIntervalControl());
		sliderEClass.getESuperTypes().add(this.getIntervalSelector());
		spinnerEClass.getESuperTypes().add(this.getIntervalSelector());
		progressBarEClass.getESuperTypes().add(this.getIntervalControl());
		dateTimeEClass.getESuperTypes().add(this.getControl());
		browserEClass.getESuperTypes().add(this.getControl());
		abstractListEClass.getESuperTypes().add(this.getControl());
		listEClass.getESuperTypes().add(this.getAbstractList());
		comboEClass.getESuperTypes().add(this.getAbstractList());
		tabFolderEClass.getESuperTypes().add(this.getControl());
		tabItemEClass.getESuperTypes().add(this.getItem());
		systemColorEClass.getESuperTypes().add(this.getColor());
		rgbColorEClass.getESuperTypes().add(this.getColor());
		g1 = createEGenericType(this.getLayout());
		g2 = createEGenericType(this.getLayoutData());
		g1.getETypeArguments().add(g2);
		fillLayoutEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLayout());
		g2 = createEGenericType(this.getRowData());
		g1.getETypeArguments().add(g2);
		rowLayoutEClass.getEGenericSuperTypes().add(g1);
		rowDataEClass.getESuperTypes().add(this.getLayoutData());
		g1 = createEGenericType(this.getLayout());
		g2 = createEGenericType(this.getGridData());
		g1.getETypeArguments().add(g2);
		gridLayoutEClass.getEGenericSuperTypes().add(g1);
		gridDataEClass.getESuperTypes().add(this.getLayoutData());
		g1 = createEGenericType(this.getLayout());
		g2 = createEGenericType(this.getFormData());
		g1.getETypeArguments().add(g2);
		formLayoutEClass.getEGenericSuperTypes().add(g1);
		formDataEClass.getESuperTypes().add(this.getLayoutData());
		treeColumnEClass.getESuperTypes().add(this.getItem());
		treeEClass.getESuperTypes().add(this.getControl());
		g1 = createEGenericType(this.getViewer());
		g2 = createEGenericType(this.getTree());
		g1.getETypeArguments().add(g2);
		treeViewerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_Style(), theEcorePackage.getEInt(), "style", null, 0, 1, Widget.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layoutDataEClass, LayoutData.class, "LayoutData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlEClass, Control.class, "Control", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getAbstractComposite());
		g2 = createEGenericType(this.getControl());
		g1.getETypeArguments().add(g2);
		initEReference(getControl_Parent(), g1, null, "parent", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_BorderStyle(), this.getBorderStyle(), "borderStyle", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_TextOrientationStyle(), this.getTextOrientationStyle(), "textOrientationStyle", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_LayoutData(), this.getLayoutData(), null, "layoutData", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_TouchEnabled(), theEcorePackage.getEBoolean(), "touchEnabled", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_ToolTipText(), theEcorePackage.getEString(), "toolTipText", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Background(), this.getColor(), null, "background", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Font(), this.getFont(), null, "font", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Size(), this.getPoint(), "size", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCompositeEClass, AbstractComposite.class, "AbstractComposite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(abstractCompositeEClass_T);
		initEReference(getAbstractComposite_Controls(), g1, null, "controls", null, 0, -1, AbstractComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getLayout());
		g2 = createEGenericType(this.getLayoutData());
		g1.getETypeArguments().add(g2);
		initEReference(getAbstractComposite_Layout(), g1, null, "layout", null, 0, 1, AbstractComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasEClass, Canvas.class, "Canvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decorationsEClass, Decorations.class, "Decorations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecorations_Maximized(), theEcorePackage.getEBoolean(), "maximized", null, 0, 1, Decorations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecorations_Minimized(), theEcorePackage.getEBoolean(), "minimized", null, 0, 1, Decorations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecorations_MenuBar(), this.getMenuBar(), this.getMenuBar_Parent(), "menuBar", null, 0, 1, Decorations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shellEClass, Shell.class, "Shell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShell_ModalStyle(), this.getModalStyle(), "modalStyle", null, 0, 1, Shell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShell_TrimStyle(), this.getTrimStyle(), "trimStyle", null, 0, 1, Shell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShell_FullScreen(), theEcorePackage.getEBoolean(), "fullScreen", null, 0, 1, Shell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShell_Alpha(), theEcorePackage.getEInt(), "alpha", "255", 0, 1, Shell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShell_DefaultButton(), this.getButton(), null, "defaultButton", null, 0, 1, Shell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMenuEClass, AbstractMenu.class, "AbstractMenu", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractMenu_TextOrientationStyle(), this.getTextOrientationStyle(), "textOrientationStyle", null, 0, 1, AbstractMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMenu_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 0, 1, AbstractMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMenu_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, AbstractMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMenu_Items(), this.getMenuItem(), null, "items", null, 0, -1, AbstractMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenu_MenuStyle(), this.getMenuStyle(), "menuStyle", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_ParentItem(), this.getMenuItem(), this.getMenuItem_Menu(), "parentItem", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuBarEClass, MenuBar.class, "MenuBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuBar_Parent(), this.getDecorations(), this.getDecorations_MenuBar(), "parent", null, 0, 1, MenuBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labeledEClass, Labeled.class, "Labeled", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeled_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Labeled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabeled_Image(), this.getImageRef(), "image", null, 0, 1, Labeled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuItemEClass, MenuItem.class, "MenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMenuItem_MenuItemStyle(), this.getMenuItemStyle(), "menuItemStyle", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenuItem_Menu(), this.getMenu(), this.getMenu_ParentItem(), "menu", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuItem_ID(), theEcorePackage.getEInt(), "ID", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuItem_Accelerator(), theEcorePackage.getEInt(), "accelerator", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuItem_Enabled(), theEcorePackage.getEBoolean(), "enabled", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuItem_Selection(), theEcorePackage.getEBoolean(), "selection", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolBarEClass, ToolBar.class, "ToolBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolBar_Items(), this.getToolItem(), this.getToolItem_Parent(), "items", null, 0, -1, ToolBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolBar_OrientationStyle(), this.getOrientationStyle(), "orientationStyle", null, 0, 1, ToolBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolItemEClass, ToolItem.class, "ToolItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolItem_Parent(), this.getToolBar(), this.getToolBar_Items(), "parent", null, 0, 1, ToolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolItem_Enabled(), theEcorePackage.getEBoolean(), "enabled", null, 0, 1, ToolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolItem_HotImage(), this.getImageRef(), "hotImage", null, 0, 1, ToolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolItem_ToolTipText(), theEcorePackage.getEString(), "toolTipText", null, 0, 1, ToolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolItem_Selection(), theEcorePackage.getEBoolean(), "selection", null, 0, 1, ToolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coolBarEClass, CoolBar.class, "CoolBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoolBar_Items(), this.getCoolItem(), this.getCoolItem_Parent(), "items", null, 0, -1, CoolBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoolBar_OrientationStyle(), this.getOrientationStyle(), "orientationStyle", null, 0, 1, CoolBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coolItemEClass, CoolItem.class, "CoolItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoolItem_Parent(), this.getCoolBar(), this.getCoolBar_Items(), "parent", null, 0, 1, CoolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoolItem_Control(), this.getControl(), null, "control", null, 0, 1, CoolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoolItem_MinimumSize(), this.getPoint(), "minimumSize", null, 0, 1, CoolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoolItem_PreferredSize(), this.getPoint(), "preferredSize", null, 0, 1, CoolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoolItem_Size(), this.getPoint(), "size", null, 0, 1, CoolItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(separatorEClass, Separator.class, "Separator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeparator_OrientationStyle(), this.getOrientationStyle(), "orientationStyle", null, 0, 1, Separator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_ButtonStyle(), this.getButtonStyle(), "buttonStyle", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_ArrowStyle(), this.getArrowStyle(), "arrowStyle", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Selection(), theEcorePackage.getEBoolean(), "selection", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_MultiplicityStyle(), this.getMultiplicityStyle(), "multiplicityStyle", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Selection(), this.getPoint(), "selection", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Editable(), theEcorePackage.getEBoolean(), "editable", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_EchoChar(), theEcorePackage.getEChar(), "echoChar", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Tabs(), theEcorePackage.getEInt(), "tabs", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_TextLimit(), theEcorePackage.getEInt(), "textLimit", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_TopIndex(), theEcorePackage.getEInt(), "topIndex", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Message(), theEcorePackage.getEString(), "message", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passwordTextEClass, PasswordText.class, "PasswordText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(searchTextEClass, SearchText.class, "SearchText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalControlEClass, IntervalControl.class, "IntervalControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervalControl_Minimum(), theEcorePackage.getEInt(), "minimum", null, 0, 1, IntervalControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervalControl_Maximum(), theEcorePackage.getEInt(), "maximum", null, 0, 1, IntervalControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervalControl_Selection(), theEcorePackage.getEInt(), "selection", null, 0, 1, IntervalControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalSelectorEClass, IntervalSelector.class, "IntervalSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervalSelector_OrientationStyle(), this.getOrientationStyle(), "orientationStyle", null, 0, 1, IntervalSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervalSelector_Increment(), theEcorePackage.getEInt(), "increment", null, 0, 1, IntervalSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervalSelector_PageIncrement(), theEcorePackage.getEInt(), "pageIncrement", null, 0, 1, IntervalSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliderEClass, Slider.class, "Slider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlider_Thumb(), theEcorePackage.getEInt(), "thumb", null, 0, 1, Slider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spinnerEClass, Spinner.class, "Spinner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpinner_Digits(), theEcorePackage.getEInt(), "digits", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpinner_TextLimit(), theEcorePackage.getEInt(), "textLimit", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progressBarEClass, ProgressBar.class, "ProgressBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgressBar_State(), this.getProgressState(), "state", null, 0, 1, ProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Seconds(), theEcorePackage.getEInt(), "seconds", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Minutes(), theEcorePackage.getEInt(), "minutes", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Hours(), theEcorePackage.getEInt(), "hours", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Day(), theEcorePackage.getEInt(), "day", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Month(), theEcorePackage.getEInt(), "month", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Year(), theEcorePackage.getEInt(), "year", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(browserEClass, Browser.class, "Browser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBrowser_JavascriptEnabled(), theEcorePackage.getEBoolean(), "javascriptEnabled", null, 0, 1, Browser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrowser_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Browser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrowser_Url(), this.getURI(), "url", null, 0, 1, Browser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractListEClass, AbstractList.class, "AbstractList", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractList_Items(), theEcorePackage.getEString(), "items", null, 0, -1, AbstractList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractList_SelectionIndex(), theEcorePackage.getEInt(), "selectionIndex", null, 0, 1, AbstractList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_MultiplicityStyle(), this.getMultiplicityStyle(), "multiplicityStyle", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_SelectionIndices(), theEcorePackage.getEInt(), "selectionIndices", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_Selection(), theEcorePackage.getEString(), "selection", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comboEClass, Combo.class, "Combo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCombo_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Combo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCombo_TextLimit(), theEcorePackage.getEInt(), "textLimit", null, 0, 1, Combo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabFolderEClass, TabFolder.class, "TabFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTabFolder_Items(), this.getTabItem(), null, "items", null, 0, -1, TabFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabItemEClass, TabItem.class, "TabItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTabItem_Control(), this.getControl(), null, "control", null, 0, 1, TabItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabItem_ToolTipText(), theEcorePackage.getEString(), "toolTipText", null, 0, 1, TabItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorEClass, Color.class, "Color", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemColorEClass, SystemColor.class, "SystemColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemColor_Color(), this.getSystemColors(), "color", null, 0, 1, SystemColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rgbColorEClass, RGBColor.class, "RGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGBColor_Red(), theEcorePackage.getEInt(), "red", "255", 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_Green(), theEcorePackage.getEInt(), "green", "255", 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_Blue(), theEcorePackage.getEInt(), "blue", "255", 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontEClass, Font.class, "Font", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFont_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Style(), theEcorePackage.getEInt(), "style", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fillLayoutEClass, FillLayout.class, "FillLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFillLayout_OrientationStyle(), this.getOrientationStyle(), "orientationStyle", null, 0, 1, FillLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFillLayout_MarginWidth(), theEcorePackage.getEInt(), "marginWidth", "0", 0, 1, FillLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFillLayout_MarginHeight(), theEcorePackage.getEInt(), "marginHeight", "0", 0, 1, FillLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFillLayout_Spacing(), theEcorePackage.getEInt(), "spacing", "0", 0, 1, FillLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowLayoutEClass, RowLayout.class, "RowLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRowLayout_OrientationStyle(), this.getOrientationStyle(), "orientationStyle", null, 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_MarginWidth(), theEcorePackage.getEInt(), "marginWidth", "0", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_MarginHeight(), theEcorePackage.getEInt(), "marginHeight", "0", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_Spacing(), theEcorePackage.getEInt(), "spacing", "3", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_Wrap(), theEcorePackage.getEBoolean(), "wrap", "true", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_Pack(), theEcorePackage.getEBoolean(), "pack", "true", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_Fill(), theEcorePackage.getEBoolean(), "fill", "false", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_Center(), theEcorePackage.getEBoolean(), "center", "true", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_Justify(), theEcorePackage.getEBoolean(), "justify", "false", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_MarginLeft(), theEcorePackage.getEInt(), "marginLeft", "3", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_MarginTop(), theEcorePackage.getEInt(), "marginTop", "3", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_MarginRight(), theEcorePackage.getEInt(), "marginRight", "3", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowLayout_MarginBottom(), theEcorePackage.getEInt(), "marginBottom", "3", 0, 1, RowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowDataEClass, RowData.class, "RowData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRowData_Width(), theEcorePackage.getEInt(), "width", "-1", 0, 1, RowData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowData_Height(), theEcorePackage.getEInt(), "height", "-1", 0, 1, RowData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowData_Exclude(), theEcorePackage.getEBoolean(), "exclude", "false", 0, 1, RowData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridLayoutEClass, GridLayout.class, "GridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridLayout_NumColumns(), theEcorePackage.getEInt(), "numColumns", "1", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_MakeColumnsEqualWidth(), theEcorePackage.getEBoolean(), "makeColumnsEqualWidth", "false", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_MarginWidth(), theEcorePackage.getEInt(), "marginWidth", "5", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_MarginHeight(), theEcorePackage.getEInt(), "marginHeight", "5", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_MarginLeft(), theEcorePackage.getEInt(), "marginLeft", "0", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_MarginTop(), theEcorePackage.getEInt(), "marginTop", "0", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_MarginRight(), theEcorePackage.getEInt(), "marginRight", "0", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_MarginBottom(), theEcorePackage.getEInt(), "marginBottom", "0", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_HorizontalSpacing(), theEcorePackage.getEInt(), "horizontalSpacing", "5", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridLayout_VerticalSpacing(), theEcorePackage.getEInt(), "verticalSpacing", "5", 0, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridDataEClass, GridData.class, "GridData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridData_VerticalAlignment(), this.getVerticalAlignmentStyle(), "verticalAlignment", null, 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_HorizontalAlignment(), this.getHorizontalAlignmentStyle(), "horizontalAlignment", null, 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_WidthHint(), theEcorePackage.getEInt(), "widthHint", "-1", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_HeightHint(), theEcorePackage.getEInt(), "heightHint", "-1", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_HorizontalIndent(), theEcorePackage.getEInt(), "horizontalIndent", "0", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_VerticalIndent(), theEcorePackage.getEInt(), "verticalIndent", "0", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_HorizontalSpan(), theEcorePackage.getEInt(), "horizontalSpan", "1", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_VerticalSpan(), theEcorePackage.getEInt(), "verticalSpan", "1", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_GrabExcessHorizontalSpace(), theEcorePackage.getEBoolean(), "grabExcessHorizontalSpace", "false", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_GrabExcessVerticalSpace(), theEcorePackage.getEBoolean(), "grabExcessVerticalSpace", "false", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_MinimumWidth(), theEcorePackage.getEInt(), "minimumWidth", "0", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_MinimumHeight(), theEcorePackage.getEInt(), "minimumHeight", "0", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridData_Exclude(), theEcorePackage.getEBoolean(), "exclude", "false", 0, 1, GridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formLayoutEClass, FormLayout.class, "FormLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormLayout_MarginWidth(), theEcorePackage.getEInt(), "marginWidth", "0", 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLayout_MarginHeight(), theEcorePackage.getEInt(), "marginHeight", "0", 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLayout_Spacing(), theEcorePackage.getEInt(), "spacing", "3", 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLayout_MarginLeft(), theEcorePackage.getEInt(), "marginLeft", "3", 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLayout_MarginTop(), theEcorePackage.getEInt(), "marginTop", "3", 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLayout_MarginRight(), theEcorePackage.getEInt(), "marginRight", "3", 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLayout_MarginBottom(), theEcorePackage.getEInt(), "marginBottom", "3", 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formDataEClass, FormData.class, "FormData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormData_Width(), theEcorePackage.getEInt(), "width", "0", 0, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormData_Height(), theEcorePackage.getEInt(), "height", "0", 0, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormData_Left(), this.getFormAttachment(), null, "left", null, 0, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormData_Top(), this.getFormAttachment(), null, "top", null, 0, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormData_Right(), this.getFormAttachment(), null, "right", null, 0, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormData_Bottom(), this.getFormAttachment(), null, "bottom", null, 0, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formAttachmentEClass, FormAttachment.class, "FormAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormAttachment_Alignment(), this.getFormAttachmentAlignment(), "alignment", null, 0, 1, FormAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormAttachment_Control(), this.getControl(), null, "control", null, 0, 1, FormAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormAttachment_Denominator(), theEcorePackage.getEInt(), "denominator", "100", 0, 1, FormAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormAttachment_Numerator(), theEcorePackage.getEInt(), "numerator", null, 0, 1, FormAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormAttachment_Offset(), theEcorePackage.getEInt(), "offset", null, 0, 1, FormAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineAttributesEClass, LineAttributes.class, "LineAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineAttributes_Width(), theEcorePackage.getEFloat(), "width", null, 0, 1, LineAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineAttributes_Style(), this.getLineStyle(), "style", null, 0, 1, LineAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineAttributes_Cap(), this.getCapStyle(), "cap", null, 0, 1, LineAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineAttributes_Join(), this.getJoinStyle(), "join", null, 0, 1, LineAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineAttributes_Dash(), theEcorePackage.getEFloat(), "dash", null, 0, -1, LineAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineAttributes_DashOffset(), theEcorePackage.getEFloat(), "dashOffset", null, 0, 1, LineAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineAttributes_MiterLimit(), theEcorePackage.getEFloat(), "miterLimit", null, 0, 1, LineAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeColumnEClass, TreeColumn.class, "TreeColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeColumn_ToolTipText(), theEcorePackage.getEString(), "toolTipText", null, 0, 1, TreeColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeColumn_DisplayText(), theEcorePackage.getEString(), "displayText", null, 0, 1, TreeColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTree_Columns(), this.getTreeColumn(), null, "columns", null, 0, -1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTree_HeaderVisible(), theEcorePackage.getEBoolean(), "headerVisible", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTree_LinesVisible(), theEcorePackage.getEBoolean(), "linesVisible", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTree_SortColumn(), this.getTreeColumn(), null, "sortColumn", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTree_SortDirection(), this.getSortDirection(), "sortDirection", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTree_Viewer(), this.getTreeViewer(), null, "viewer", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewerEClass, Viewer.class, "Viewer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(viewerEClass_T);
		initEReference(getViewer_Control(), g1, null, "control", null, 0, 1, Viewer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewer_Input(), this.getViewerInput(), "input", null, 0, 1, Viewer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeViewerEClass, TreeViewer.class, "TreeViewer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(progressStateEEnum, ProgressState.class, "ProgressState");
		addEEnumLiteral(progressStateEEnum, ProgressState.NORMAL);
		addEEnumLiteral(progressStateEEnum, ProgressState.PAUSED);
		addEEnumLiteral(progressStateEEnum, ProgressState.ERROR);

		initEEnum(systemColorsEEnum, SystemColors.class, "SystemColors");
		addEEnumLiteral(systemColorsEEnum, SystemColors.RED);
		addEEnumLiteral(systemColorsEEnum, SystemColors.GREEN);
		addEEnumLiteral(systemColorsEEnum, SystemColors.BLUE);

		initEEnum(fontStyleEEnum, FontStyle.class, "FontStyle");
		addEEnumLiteral(fontStyleEEnum, FontStyle.NORMAL);
		addEEnumLiteral(fontStyleEEnum, FontStyle.BOLD);
		addEEnumLiteral(fontStyleEEnum, FontStyle.ITALIC);

		initEEnum(formAttachmentAlignmentEEnum, FormAttachmentAlignment.class, "FormAttachmentAlignment");
		addEEnumLiteral(formAttachmentAlignmentEEnum, FormAttachmentAlignment.DEFAULT);
		addEEnumLiteral(formAttachmentAlignmentEEnum, FormAttachmentAlignment.TOP);
		addEEnumLiteral(formAttachmentAlignmentEEnum, FormAttachmentAlignment.BOTTOM);
		addEEnumLiteral(formAttachmentAlignmentEEnum, FormAttachmentAlignment.LEFT);
		addEEnumLiteral(formAttachmentAlignmentEEnum, FormAttachmentAlignment.RIGHT);
		addEEnumLiteral(formAttachmentAlignmentEEnum, FormAttachmentAlignment.CENTER);

		initEEnum(borderStyleEEnum, BorderStyle.class, "BorderStyle");
		addEEnumLiteral(borderStyleEEnum, BorderStyle.NONE);
		addEEnumLiteral(borderStyleEEnum, BorderStyle.BORDER);

		initEEnum(buttonStyleEEnum, ButtonStyle.class, "ButtonStyle");
		addEEnumLiteral(buttonStyleEEnum, ButtonStyle.TOGGLE);
		addEEnumLiteral(buttonStyleEEnum, ButtonStyle.PUSH);
		addEEnumLiteral(buttonStyleEEnum, ButtonStyle.RADIO);
		addEEnumLiteral(buttonStyleEEnum, ButtonStyle.CHECK);
		addEEnumLiteral(buttonStyleEEnum, ButtonStyle.ARROW);

		initEEnum(arrowStyleEEnum, ArrowStyle.class, "ArrowStyle");
		addEEnumLiteral(arrowStyleEEnum, ArrowStyle.NONE);
		addEEnumLiteral(arrowStyleEEnum, ArrowStyle.UP);
		addEEnumLiteral(arrowStyleEEnum, ArrowStyle.DOWN);
		addEEnumLiteral(arrowStyleEEnum, ArrowStyle.LEFT);
		addEEnumLiteral(arrowStyleEEnum, ArrowStyle.RIGHT);

		initEEnum(textOrientationStyleEEnum, TextOrientationStyle.class, "TextOrientationStyle");
		addEEnumLiteral(textOrientationStyleEEnum, TextOrientationStyle.LEFT_TO_RIGHT);
		addEEnumLiteral(textOrientationStyleEEnum, TextOrientationStyle.RIGHT_TO_LEFT);

		initEEnum(orientationStyleEEnum, OrientationStyle.class, "OrientationStyle");
		addEEnumLiteral(orientationStyleEEnum, OrientationStyle.HORIZONTAL);
		addEEnumLiteral(orientationStyleEEnum, OrientationStyle.VERTICAL);

		initEEnum(horizontalAlignmentStyleEEnum, HorizontalAlignmentStyle.class, "HorizontalAlignmentStyle");
		addEEnumLiteral(horizontalAlignmentStyleEEnum, HorizontalAlignmentStyle.LEFT);
		addEEnumLiteral(horizontalAlignmentStyleEEnum, HorizontalAlignmentStyle.CENTER);
		addEEnumLiteral(horizontalAlignmentStyleEEnum, HorizontalAlignmentStyle.RIGHT);
		addEEnumLiteral(horizontalAlignmentStyleEEnum, HorizontalAlignmentStyle.FILL);

		initEEnum(verticalAlignmentStyleEEnum, VerticalAlignmentStyle.class, "VerticalAlignmentStyle");
		addEEnumLiteral(verticalAlignmentStyleEEnum, VerticalAlignmentStyle.CENTER);
		addEEnumLiteral(verticalAlignmentStyleEEnum, VerticalAlignmentStyle.TOP);
		addEEnumLiteral(verticalAlignmentStyleEEnum, VerticalAlignmentStyle.BOTTOM);
		addEEnumLiteral(verticalAlignmentStyleEEnum, VerticalAlignmentStyle.FILL);

		initEEnum(multiplicityStyleEEnum, MultiplicityStyle.class, "MultiplicityStyle");
		addEEnumLiteral(multiplicityStyleEEnum, MultiplicityStyle.SINGLE);
		addEEnumLiteral(multiplicityStyleEEnum, MultiplicityStyle.MULTI);

		initEEnum(comboStyleEEnum, ComboStyle.class, "ComboStyle");
		addEEnumLiteral(comboStyleEEnum, ComboStyle.DROP_DOWN);
		addEEnumLiteral(comboStyleEEnum, ComboStyle.READ_ONLY);
		addEEnumLiteral(comboStyleEEnum, ComboStyle.SIMPLE);

		initEEnum(menuStyleEEnum, MenuStyle.class, "MenuStyle");
		addEEnumLiteral(menuStyleEEnum, MenuStyle.POP_UP);
		addEEnumLiteral(menuStyleEEnum, MenuStyle.DROP_DOWN);

		initEEnum(menuItemStyleEEnum, MenuItemStyle.class, "MenuItemStyle");
		addEEnumLiteral(menuItemStyleEEnum, MenuItemStyle.PUSH);
		addEEnumLiteral(menuItemStyleEEnum, MenuItemStyle.CASCADE);
		addEEnumLiteral(menuItemStyleEEnum, MenuItemStyle.CHECK);
		addEEnumLiteral(menuItemStyleEEnum, MenuItemStyle.RADIO);
		addEEnumLiteral(menuItemStyleEEnum, MenuItemStyle.SEPARATOR);

		initEEnum(modalStyleEEnum, ModalStyle.class, "ModalStyle");
		addEEnumLiteral(modalStyleEEnum, ModalStyle.SYSTEM_MODAL);
		addEEnumLiteral(modalStyleEEnum, ModalStyle.APPLICATION_MODAL);
		addEEnumLiteral(modalStyleEEnum, ModalStyle.PRIMARY_MODAL);

		initEEnum(trimStyleEEnum, TrimStyle.class, "TrimStyle");
		addEEnumLiteral(trimStyleEEnum, TrimStyle.NOT_TRIM);
		addEEnumLiteral(trimStyleEEnum, TrimStyle.SHELL_TRIM);
		addEEnumLiteral(trimStyleEEnum, TrimStyle.DIALOG_TRIM);

		initEEnum(lineStyleEEnum, LineStyle.class, "LineStyle");
		addEEnumLiteral(lineStyleEEnum, LineStyle.CUSTOM);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASH);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASHDOT);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASHDOTDOT);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DOT);
		addEEnumLiteral(lineStyleEEnum, LineStyle.SOLID);

		initEEnum(capStyleEEnum, CapStyle.class, "CapStyle");
		addEEnumLiteral(capStyleEEnum, CapStyle.FLAT);
		addEEnumLiteral(capStyleEEnum, CapStyle.ROUND);
		addEEnumLiteral(capStyleEEnum, CapStyle.SQUARE);

		initEEnum(joinStyleEEnum, JoinStyle.class, "JoinStyle");
		addEEnumLiteral(joinStyleEEnum, JoinStyle.BEVEL);
		addEEnumLiteral(joinStyleEEnum, JoinStyle.MITER);
		addEEnumLiteral(joinStyleEEnum, JoinStyle.ROUND);

		initEEnum(sortDirectionEEnum, SortDirection.class, "SortDirection");
		addEEnumLiteral(sortDirectionEEnum, SortDirection.NONE);
		addEEnumLiteral(sortDirectionEEnum, SortDirection.UP);
		addEEnumLiteral(sortDirectionEEnum, SortDirection.DOWN);

		// Initialize data types
		initEDataType(imageRefEDataType, org.eclipse.emf.common.util.URI.class, "ImageRef", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, org.eclipse.emf.common.util.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(viewerInputEDataType, Object.class, "ViewerInput", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SwtPackageImpl
