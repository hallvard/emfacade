/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gmt.emfacade.swt.*;

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
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage
 * @generated
 */
public class SwtSwitch<T1> extends Switch<T1>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SwtPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwtSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SwtPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T1 doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SwtPackage.WIDGET:
      {
        Widget widget = (Widget)theEObject;
        T1 result = caseWidget(widget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.LAYOUT:
      {
        Layout<?> layout = (Layout<?>)theEObject;
        T1 result = caseLayout(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.LAYOUT_DATA:
      {
        LayoutData layoutData = (LayoutData)theEObject;
        T1 result = caseLayoutData(layoutData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.CONTROL:
      {
        Control control = (Control)theEObject;
        T1 result = caseControl(control);
        if (result == null) result = caseWidget(control);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.ABSTRACT_COMPOSITE:
      {
        AbstractComposite<?> abstractComposite = (AbstractComposite<?>)theEObject;
        T1 result = caseAbstractComposite(abstractComposite);
        if (result == null) result = caseControl(abstractComposite);
        if (result == null) result = caseWidget(abstractComposite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.COMPOSITE:
      {
        Composite composite = (Composite)theEObject;
        T1 result = caseComposite(composite);
        if (result == null) result = caseAbstractComposite(composite);
        if (result == null) result = caseControl(composite);
        if (result == null) result = caseWidget(composite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.GROUP:
      {
        Group group = (Group)theEObject;
        T1 result = caseGroup(group);
        if (result == null) result = caseComposite(group);
        if (result == null) result = caseAbstractComposite(group);
        if (result == null) result = caseControl(group);
        if (result == null) result = caseWidget(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.CANVAS:
      {
        Canvas canvas = (Canvas)theEObject;
        T1 result = caseCanvas(canvas);
        if (result == null) result = caseComposite(canvas);
        if (result == null) result = caseAbstractComposite(canvas);
        if (result == null) result = caseControl(canvas);
        if (result == null) result = caseWidget(canvas);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.DECORATIONS:
      {
        Decorations decorations = (Decorations)theEObject;
        T1 result = caseDecorations(decorations);
        if (result == null) result = caseCanvas(decorations);
        if (result == null) result = caseComposite(decorations);
        if (result == null) result = caseAbstractComposite(decorations);
        if (result == null) result = caseControl(decorations);
        if (result == null) result = caseWidget(decorations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.SHELL:
      {
        Shell shell = (Shell)theEObject;
        T1 result = caseShell(shell);
        if (result == null) result = caseDecorations(shell);
        if (result == null) result = caseCanvas(shell);
        if (result == null) result = caseComposite(shell);
        if (result == null) result = caseAbstractComposite(shell);
        if (result == null) result = caseControl(shell);
        if (result == null) result = caseWidget(shell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.MENU:
      {
        Menu menu = (Menu)theEObject;
        T1 result = caseMenu(menu);
        if (result == null) result = caseWidget(menu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.MENU_BAR:
      {
        MenuBar menuBar = (MenuBar)theEObject;
        T1 result = caseMenuBar(menuBar);
        if (result == null) result = caseMenu(menuBar);
        if (result == null) result = caseWidget(menuBar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.LABELED:
      {
        Labeled labeled = (Labeled)theEObject;
        T1 result = caseLabeled(labeled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.ITEM:
      {
        Item item = (Item)theEObject;
        T1 result = caseItem(item);
        if (result == null) result = caseWidget(item);
        if (result == null) result = caseLabeled(item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.MENU_ITEM:
      {
        MenuItem menuItem = (MenuItem)theEObject;
        T1 result = caseMenuItem(menuItem);
        if (result == null) result = caseItem(menuItem);
        if (result == null) result = caseWidget(menuItem);
        if (result == null) result = caseLabeled(menuItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.TOOL_BAR:
      {
        ToolBar toolBar = (ToolBar)theEObject;
        T1 result = caseToolBar(toolBar);
        if (result == null) result = caseControl(toolBar);
        if (result == null) result = caseWidget(toolBar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.TOOL_ITEM:
      {
        ToolItem toolItem = (ToolItem)theEObject;
        T1 result = caseToolItem(toolItem);
        if (result == null) result = caseItem(toolItem);
        if (result == null) result = caseWidget(toolItem);
        if (result == null) result = caseLabeled(toolItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.COOL_BAR:
      {
        CoolBar coolBar = (CoolBar)theEObject;
        T1 result = caseCoolBar(coolBar);
        if (result == null) result = caseAbstractComposite(coolBar);
        if (result == null) result = caseControl(coolBar);
        if (result == null) result = caseWidget(coolBar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.COOL_ITEM:
      {
        CoolItem coolItem = (CoolItem)theEObject;
        T1 result = caseCoolItem(coolItem);
        if (result == null) result = caseItem(coolItem);
        if (result == null) result = caseWidget(coolItem);
        if (result == null) result = caseLabeled(coolItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T1 result = caseLabel(label);
        if (result == null) result = caseControl(label);
        if (result == null) result = caseLabeled(label);
        if (result == null) result = caseWidget(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.SEPARATOR:
      {
        Separator separator = (Separator)theEObject;
        T1 result = caseSeparator(separator);
        if (result == null) result = caseControl(separator);
        if (result == null) result = caseWidget(separator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T1 result = caseButton(button);
        if (result == null) result = caseControl(button);
        if (result == null) result = caseLabeled(button);
        if (result == null) result = caseWidget(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T1 result = caseText(text);
        if (result == null) result = caseControl(text);
        if (result == null) result = caseWidget(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.PASSWORD_TEXT:
      {
        PasswordText passwordText = (PasswordText)theEObject;
        T1 result = casePasswordText(passwordText);
        if (result == null) result = caseText(passwordText);
        if (result == null) result = caseControl(passwordText);
        if (result == null) result = caseWidget(passwordText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.SEARCH_TEXT:
      {
        SearchText searchText = (SearchText)theEObject;
        T1 result = caseSearchText(searchText);
        if (result == null) result = caseText(searchText);
        if (result == null) result = caseControl(searchText);
        if (result == null) result = caseWidget(searchText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.INTERVAL_CONTROL:
      {
        IntervalControl intervalControl = (IntervalControl)theEObject;
        T1 result = caseIntervalControl(intervalControl);
        if (result == null) result = caseControl(intervalControl);
        if (result == null) result = caseWidget(intervalControl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.INTERVAL_SELECTOR:
      {
        IntervalSelector intervalSelector = (IntervalSelector)theEObject;
        T1 result = caseIntervalSelector(intervalSelector);
        if (result == null) result = caseIntervalControl(intervalSelector);
        if (result == null) result = caseControl(intervalSelector);
        if (result == null) result = caseWidget(intervalSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.SLIDER:
      {
        Slider slider = (Slider)theEObject;
        T1 result = caseSlider(slider);
        if (result == null) result = caseIntervalSelector(slider);
        if (result == null) result = caseIntervalControl(slider);
        if (result == null) result = caseControl(slider);
        if (result == null) result = caseWidget(slider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.SPINNER:
      {
        Spinner spinner = (Spinner)theEObject;
        T1 result = caseSpinner(spinner);
        if (result == null) result = caseIntervalSelector(spinner);
        if (result == null) result = caseIntervalControl(spinner);
        if (result == null) result = caseControl(spinner);
        if (result == null) result = caseWidget(spinner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.PROGRESS_BAR:
      {
        ProgressBar progressBar = (ProgressBar)theEObject;
        T1 result = caseProgressBar(progressBar);
        if (result == null) result = caseIntervalSelector(progressBar);
        if (result == null) result = caseIntervalControl(progressBar);
        if (result == null) result = caseControl(progressBar);
        if (result == null) result = caseWidget(progressBar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.DATE_TIME:
      {
        DateTime dateTime = (DateTime)theEObject;
        T1 result = caseDateTime(dateTime);
        if (result == null) result = caseControl(dateTime);
        if (result == null) result = caseWidget(dateTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.ABSTRACT_LIST:
      {
        AbstractList abstractList = (AbstractList)theEObject;
        T1 result = caseAbstractList(abstractList);
        if (result == null) result = caseControl(abstractList);
        if (result == null) result = caseWidget(abstractList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.LIST:
      {
        List list = (List)theEObject;
        T1 result = caseList(list);
        if (result == null) result = caseAbstractList(list);
        if (result == null) result = caseControl(list);
        if (result == null) result = caseWidget(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.COMBO:
      {
        Combo combo = (Combo)theEObject;
        T1 result = caseCombo(combo);
        if (result == null) result = caseAbstractList(combo);
        if (result == null) result = caseControl(combo);
        if (result == null) result = caseWidget(combo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.TAB_FOLDER:
      {
        TabFolder tabFolder = (TabFolder)theEObject;
        T1 result = caseTabFolder(tabFolder);
        if (result == null) result = caseAbstractComposite(tabFolder);
        if (result == null) result = caseControl(tabFolder);
        if (result == null) result = caseWidget(tabFolder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.TAB_ITEM:
      {
        TabItem tabItem = (TabItem)theEObject;
        T1 result = caseTabItem(tabItem);
        if (result == null) result = caseItem(tabItem);
        if (result == null) result = caseWidget(tabItem);
        if (result == null) result = caseLabeled(tabItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T1 result = caseColor(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.SYSTEM_COLOR:
      {
        SystemColor systemColor = (SystemColor)theEObject;
        T1 result = caseSystemColor(systemColor);
        if (result == null) result = caseColor(systemColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.RGB_COLOR:
      {
        RGBColor rgbColor = (RGBColor)theEObject;
        T1 result = caseRGBColor(rgbColor);
        if (result == null) result = caseColor(rgbColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.FONT:
      {
        Font font = (Font)theEObject;
        T1 result = caseFont(font);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.FILL_LAYOUT:
      {
        FillLayout fillLayout = (FillLayout)theEObject;
        T1 result = caseFillLayout(fillLayout);
        if (result == null) result = caseLayout(fillLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.ROW_LAYOUT:
      {
        RowLayout rowLayout = (RowLayout)theEObject;
        T1 result = caseRowLayout(rowLayout);
        if (result == null) result = caseLayout(rowLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.ROW_DATA:
      {
        RowData rowData = (RowData)theEObject;
        T1 result = caseRowData(rowData);
        if (result == null) result = caseLayoutData(rowData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.GRID_LAYOUT:
      {
        GridLayout gridLayout = (GridLayout)theEObject;
        T1 result = caseGridLayout(gridLayout);
        if (result == null) result = caseLayout(gridLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.GRID_DATA:
      {
        GridData gridData = (GridData)theEObject;
        T1 result = caseGridData(gridData);
        if (result == null) result = caseLayoutData(gridData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.FORM_LAYOUT:
      {
        FormLayout formLayout = (FormLayout)theEObject;
        T1 result = caseFormLayout(formLayout);
        if (result == null) result = caseLayout(formLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.FORM_DATA:
      {
        FormData formData = (FormData)theEObject;
        T1 result = caseFormData(formData);
        if (result == null) result = caseLayoutData(formData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.FORM_ATTACHMENT:
      {
        FormAttachment formAttachment = (FormAttachment)theEObject;
        T1 result = caseFormAttachment(formAttachment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.LINE_ATTRIBUTES:
      {
        LineAttributes lineAttributes = (LineAttributes)theEObject;
        T1 result = caseLineAttributes(lineAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.TREE_COLUMN:
      {
        TreeColumn treeColumn = (TreeColumn)theEObject;
        T1 result = caseTreeColumn(treeColumn);
        if (result == null) result = caseItem(treeColumn);
        if (result == null) result = caseWidget(treeColumn);
        if (result == null) result = caseLabeled(treeColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.TREE:
      {
        Tree tree = (Tree)theEObject;
        T1 result = caseTree(tree);
        if (result == null) result = caseControl(tree);
        if (result == null) result = caseWidget(tree);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.VIEWER:
      {
        Viewer<?> viewer = (Viewer<?>)theEObject;
        T1 result = caseViewer(viewer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwtPackage.TREE_VIEWER:
      {
        TreeViewer treeViewer = (TreeViewer)theEObject;
        T1 result = caseTreeViewer(treeViewer);
        if (result == null) result = caseViewer(treeViewer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
  public T1 caseWidget(Widget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T extends LayoutData> T1 caseLayout(Layout<T> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseLayoutData(LayoutData object)
  {
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
  public T1 caseControl(Control object)
  {
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
  public <T extends Control> T1 caseAbstractComposite(AbstractComposite<T> object)
  {
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
  public T1 caseComposite(Composite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseGroup(Group object)
  {
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
  public T1 caseCanvas(Canvas object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decorations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decorations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDecorations(Decorations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseShell(Shell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseMenu(Menu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Bar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Bar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseMenuBar(MenuBar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labeled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labeled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseLabeled(Labeled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseItem(Item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseMenuItem(MenuItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tool Bar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tool Bar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseToolBar(ToolBar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tool Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tool Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseToolItem(ToolItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cool Bar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cool Bar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseCoolBar(CoolBar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cool Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cool Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseCoolItem(CoolItem object)
  {
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
  public T1 caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Separator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Separator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseSeparator(Separator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Password Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Password Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 casePasswordText(PasswordText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Search Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Search Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseSearchText(SearchText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interval Control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interval Control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseIntervalControl(IntervalControl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interval Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interval Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseIntervalSelector(IntervalSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseSlider(Slider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseSpinner(Spinner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseProgressBar(ProgressBar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDateTime(DateTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseAbstractList(AbstractList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseCombo(Combo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Folder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Folder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseTabFolder(TabFolder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseTabItem(TabItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseSystemColor(SystemColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RGB Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RGB Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseRGBColor(RGBColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseFont(Font object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fill Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fill Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseFillLayout(FillLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseRowLayout(RowLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseRowData(RowData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseGridLayout(GridLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grid Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grid Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseGridData(GridData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseFormLayout(FormLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseFormData(FormData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Attachment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Attachment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseFormAttachment(FormAttachment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseLineAttributes(LineAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseTreeColumn(TreeColumn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseTree(Tree object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Viewer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Viewer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T extends Control> T1 caseViewer(Viewer<T> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree Viewer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree Viewer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseTreeViewer(TreeViewer object)
  {
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
  public T1 defaultCase(EObject object)
  {
    return null;
  }

} //SwtSwitch
