/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmt.emfacade.swt.ArrowStyle;
import org.eclipse.gmt.emfacade.swt.BorderStyle;
import org.eclipse.gmt.emfacade.swt.Button;
import org.eclipse.gmt.emfacade.swt.ButtonStyle;
import org.eclipse.gmt.emfacade.swt.Canvas;
import org.eclipse.gmt.emfacade.swt.CapStyle;
import org.eclipse.gmt.emfacade.swt.Combo;
import org.eclipse.gmt.emfacade.swt.ComboStyle;
import org.eclipse.gmt.emfacade.swt.Composite;
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
import org.eclipse.gmt.emfacade.swt.JoinStyle;
import org.eclipse.gmt.emfacade.swt.Label;
import org.eclipse.gmt.emfacade.swt.LineAttributes;
import org.eclipse.gmt.emfacade.swt.LineStyle;
import org.eclipse.gmt.emfacade.swt.List;
import org.eclipse.gmt.emfacade.swt.Menu;
import org.eclipse.gmt.emfacade.swt.MenuItem;
import org.eclipse.gmt.emfacade.swt.MenuItemStyle;
import org.eclipse.gmt.emfacade.swt.ModalStyle;
import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.PasswordText;
import org.eclipse.gmt.emfacade.swt.RGBColor;
import org.eclipse.gmt.emfacade.swt.RowData;
import org.eclipse.gmt.emfacade.swt.RowLayout;
import org.eclipse.gmt.emfacade.swt.SearchText;
import org.eclipse.gmt.emfacade.swt.Shell;
import org.eclipse.gmt.emfacade.swt.SortDirection;
import org.eclipse.gmt.emfacade.swt.SwtFactory;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.SystemColor;
import org.eclipse.gmt.emfacade.swt.SystemColors;
import org.eclipse.gmt.emfacade.swt.TabFolder;
import org.eclipse.gmt.emfacade.swt.TabItem;
import org.eclipse.gmt.emfacade.swt.Text;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;
import org.eclipse.gmt.emfacade.swt.Tree;
import org.eclipse.gmt.emfacade.swt.TreeColumn;
import org.eclipse.gmt.emfacade.swt.TreeViewer;
import org.eclipse.gmt.emfacade.swt.TrimStyle;
import org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle;
import org.eclipse.gmt.emfacade.swt.util.Util;
import org.eclipse.swt.graphics.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwtFactoryImpl extends EFactoryImpl implements SwtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SwtFactory init() {
		try {
			SwtFactory theSwtFactory = (SwtFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.gmt.emfacade.swt"); 
			if (theSwtFactory != null) {
				return theSwtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SwtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwtFactoryImpl() {
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
			case SwtPackage.COMPOSITE: return createComposite();
			case SwtPackage.GROUP: return createGroup();
			case SwtPackage.CANVAS: return createCanvas();
			case SwtPackage.SHELL: return createShell();
			case SwtPackage.MENU: return createMenu();
			case SwtPackage.MENU_ITEM: return createMenuItem();
			case SwtPackage.LABEL: return createLabel();
			case SwtPackage.BUTTON: return createButton();
			case SwtPackage.TEXT: return createText();
			case SwtPackage.PASSWORD_TEXT: return createPasswordText();
			case SwtPackage.SEARCH_TEXT: return createSearchText();
			case SwtPackage.LIST: return createList();
			case SwtPackage.COMBO: return createCombo();
			case SwtPackage.TAB_FOLDER: return createTabFolder();
			case SwtPackage.TAB_ITEM: return createTabItem();
			case SwtPackage.SYSTEM_COLOR: return createSystemColor();
			case SwtPackage.RGB_COLOR: return createRGBColor();
			case SwtPackage.FONT: return createFont();
			case SwtPackage.FILL_LAYOUT: return createFillLayout();
			case SwtPackage.ROW_LAYOUT: return createRowLayout();
			case SwtPackage.ROW_DATA: return createRowData();
			case SwtPackage.GRID_LAYOUT: return createGridLayout();
			case SwtPackage.GRID_DATA: return createGridData();
			case SwtPackage.FORM_LAYOUT: return createFormLayout();
			case SwtPackage.FORM_DATA: return createFormData();
			case SwtPackage.FORM_ATTACHMENT: return createFormAttachment();
			case SwtPackage.LINE_ATTRIBUTES: return createLineAttributes();
			case SwtPackage.TREE_COLUMN: return createTreeColumn();
			case SwtPackage.TREE: return createTree();
			case SwtPackage.TREE_VIEWER: return createTreeViewer();
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
			case SwtPackage.SYSTEM_COLORS:
				return createSystemColorsFromString(eDataType, initialValue);
			case SwtPackage.FONT_STYLE:
				return createFontStyleFromString(eDataType, initialValue);
			case SwtPackage.FORM_ATTACHMENT_ALIGNMENT:
				return createFormAttachmentAlignmentFromString(eDataType, initialValue);
			case SwtPackage.BORDER_STYLE:
				return createBorderStyleFromString(eDataType, initialValue);
			case SwtPackage.BUTTON_STYLE:
				return createButtonStyleFromString(eDataType, initialValue);
			case SwtPackage.ARROW_STYLE:
				return createArrowStyleFromString(eDataType, initialValue);
			case SwtPackage.TEXT_ORIENTATION_STYLE:
				return createTextOrientationStyleFromString(eDataType, initialValue);
			case SwtPackage.ORIENTATION_STYLE:
				return createOrientationStyleFromString(eDataType, initialValue);
			case SwtPackage.HORIZONTAL_ALIGNMENT_STYLE:
				return createHorizontalAlignmentStyleFromString(eDataType, initialValue);
			case SwtPackage.VERTICAL_ALIGNMENT_STYLE:
				return createVerticalAlignmentStyleFromString(eDataType, initialValue);
			case SwtPackage.MULTIPLICITY_STYLE:
				return createMultiplicityStyleFromString(eDataType, initialValue);
			case SwtPackage.COMBO_STYLE:
				return createComboStyleFromString(eDataType, initialValue);
			case SwtPackage.MENU_ITEM_STYLE:
				return createMenuItemStyleFromString(eDataType, initialValue);
			case SwtPackage.MODAL_STYLE:
				return createModalStyleFromString(eDataType, initialValue);
			case SwtPackage.TRIM_STYLE:
				return createTrimStyleFromString(eDataType, initialValue);
			case SwtPackage.LINE_STYLE:
				return createLineStyleFromString(eDataType, initialValue);
			case SwtPackage.CAP_STYLE:
				return createCapStyleFromString(eDataType, initialValue);
			case SwtPackage.JOIN_STYLE:
				return createJoinStyleFromString(eDataType, initialValue);
			case SwtPackage.SORT_DIRECTION:
				return createSortDirectionFromString(eDataType, initialValue);
			case SwtPackage.IMAGE_REF:
				return createImageRefFromString(eDataType, initialValue);
			case SwtPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case SwtPackage.VIEWER_INPUT:
				return createViewerInputFromString(eDataType, initialValue);
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
			case SwtPackage.SYSTEM_COLORS:
				return convertSystemColorsToString(eDataType, instanceValue);
			case SwtPackage.FONT_STYLE:
				return convertFontStyleToString(eDataType, instanceValue);
			case SwtPackage.FORM_ATTACHMENT_ALIGNMENT:
				return convertFormAttachmentAlignmentToString(eDataType, instanceValue);
			case SwtPackage.BORDER_STYLE:
				return convertBorderStyleToString(eDataType, instanceValue);
			case SwtPackage.BUTTON_STYLE:
				return convertButtonStyleToString(eDataType, instanceValue);
			case SwtPackage.ARROW_STYLE:
				return convertArrowStyleToString(eDataType, instanceValue);
			case SwtPackage.TEXT_ORIENTATION_STYLE:
				return convertTextOrientationStyleToString(eDataType, instanceValue);
			case SwtPackage.ORIENTATION_STYLE:
				return convertOrientationStyleToString(eDataType, instanceValue);
			case SwtPackage.HORIZONTAL_ALIGNMENT_STYLE:
				return convertHorizontalAlignmentStyleToString(eDataType, instanceValue);
			case SwtPackage.VERTICAL_ALIGNMENT_STYLE:
				return convertVerticalAlignmentStyleToString(eDataType, instanceValue);
			case SwtPackage.MULTIPLICITY_STYLE:
				return convertMultiplicityStyleToString(eDataType, instanceValue);
			case SwtPackage.COMBO_STYLE:
				return convertComboStyleToString(eDataType, instanceValue);
			case SwtPackage.MENU_ITEM_STYLE:
				return convertMenuItemStyleToString(eDataType, instanceValue);
			case SwtPackage.MODAL_STYLE:
				return convertModalStyleToString(eDataType, instanceValue);
			case SwtPackage.TRIM_STYLE:
				return convertTrimStyleToString(eDataType, instanceValue);
			case SwtPackage.LINE_STYLE:
				return convertLineStyleToString(eDataType, instanceValue);
			case SwtPackage.CAP_STYLE:
				return convertCapStyleToString(eDataType, instanceValue);
			case SwtPackage.JOIN_STYLE:
				return convertJoinStyleToString(eDataType, instanceValue);
			case SwtPackage.SORT_DIRECTION:
				return convertSortDirectionToString(eDataType, instanceValue);
			case SwtPackage.IMAGE_REF:
				return convertImageRefToString(eDataType, instanceValue);
			case SwtPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case SwtPackage.VIEWER_INPUT:
				return convertViewerInputToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas createCanvas() {
		CanvasImpl canvas = new CanvasImpl();
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shell createShell() {
		ShellImpl shell = new ShellImpl();
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
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
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordText createPasswordText() {
		PasswordTextImpl passwordText = new PasswordTextImpl();
		return passwordText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchText createSearchText() {
		SearchTextImpl searchText = new SearchTextImpl();
		return searchText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Combo createCombo() {
		ComboImpl combo = new ComboImpl();
		return combo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabFolder createTabFolder() {
		TabFolderImpl tabFolder = new TabFolderImpl();
		return tabFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabItem createTabItem() {
		TabItemImpl tabItem = new TabItemImpl();
		return tabItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillLayout createFillLayout() {
		FillLayoutImpl fillLayout = new FillLayoutImpl();
		return fillLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowLayout createRowLayout() {
		RowLayoutImpl rowLayout = new RowLayoutImpl();
		return rowLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowData createRowData() {
		RowDataImpl rowData = new RowDataImpl();
		return rowData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridLayout createGridLayout() {
		GridLayoutImpl gridLayout = new GridLayoutImpl();
		return gridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridData createGridData() {
		GridDataImpl gridData = new GridDataImpl();
		return gridData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLayout createFormLayout() {
		FormLayoutImpl formLayout = new FormLayoutImpl();
		return formLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormData createFormData() {
		FormDataImpl formData = new FormDataImpl();
		return formData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormAttachment createFormAttachment() {
		FormAttachmentImpl formAttachment = new FormAttachmentImpl();
		return formAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineAttributes createLineAttributes() {
		LineAttributesImpl lineAttributes = new LineAttributesImpl();
		return lineAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeColumn createTreeColumn() {
		TreeColumnImpl treeColumn = new TreeColumnImpl();
		return treeColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeViewer createTreeViewer() {
		TreeViewerImpl treeViewer = new TreeViewerImpl();
		return treeViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemColor createSystemColor() {
		SystemColorImpl systemColor = new SystemColorImpl();
		return systemColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor createRGBColor() {
		RGBColorImpl rgbColor = new RGBColorImpl();
		return rgbColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemColors createSystemColorsFromString(EDataType eDataType, String initialValue) {
		SystemColors result = SystemColors.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemColorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle createFontStyleFromString(EDataType eDataType, String initialValue) {
		FontStyle result = FontStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormAttachmentAlignment createFormAttachmentAlignmentFromString(EDataType eDataType, String initialValue) {
		FormAttachmentAlignment result = FormAttachmentAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormAttachmentAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderStyle createBorderStyleFromString(EDataType eDataType, String initialValue) {
		BorderStyle result = BorderStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonStyle createButtonStyleFromString(EDataType eDataType, String initialValue) {
		ButtonStyle result = ButtonStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertButtonStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationStyle createOrientationStyleFromString(EDataType eDataType, String initialValue) {
		OrientationStyle result = OrientationStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalAlignmentStyle createHorizontalAlignmentStyleFromString(EDataType eDataType, String initialValue) {
		HorizontalAlignmentStyle result = HorizontalAlignmentStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalAlignmentStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlignmentStyle createVerticalAlignmentStyleFromString(EDataType eDataType, String initialValue) {
		VerticalAlignmentStyle result = VerticalAlignmentStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalAlignmentStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowStyle createArrowStyleFromString(EDataType eDataType, String initialValue) {
		ArrowStyle result = ArrowStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrowStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOrientationStyle createTextOrientationStyleFromString(EDataType eDataType, String initialValue) {
		TextOrientationStyle result = TextOrientationStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextOrientationStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityStyle createMultiplicityStyleFromString(EDataType eDataType, String initialValue) {
		MultiplicityStyle result = MultiplicityStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboStyle createComboStyleFromString(EDataType eDataType, String initialValue) {
		ComboStyle result = ComboStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComboStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItemStyle createMenuItemStyleFromString(EDataType eDataType, String initialValue) {
		MenuItemStyle result = MenuItemStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMenuItemStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalStyle createModalStyleFromString(EDataType eDataType, String initialValue) {
		ModalStyle result = ModalStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrimStyle createTrimStyleFromString(EDataType eDataType, String initialValue) {
		TrimStyle result = TrimStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrimStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle createLineStyleFromString(EDataType eDataType, String initialValue) {
		LineStyle result = LineStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapStyle createCapStyleFromString(EDataType eDataType, String initialValue) {
		CapStyle result = CapStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinStyle createJoinStyleFromString(EDataType eDataType, String initialValue) {
		JoinStyle result = JoinStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJoinStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirection createSortDirectionFromString(EDataType eDataType, String initialValue) {
		SortDirection result = SortDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createImageRefFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageRefToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		return Util.parse(initialValue, "(\\d*)[ ,;](\\d*)", Integer.class, 0, Point.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		Point point = (Point) instanceValue;
		return point.x + "," + point.y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createViewerInputFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewerInputToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwtPackage getSwtPackage() {
		return (SwtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SwtPackage getPackage() {
		return SwtPackage.eINSTANCE;
	}

} //SwtFactoryImpl
