package org.eclipse.gmt.emfacade.swt.binders;
			
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.emfacade.builder.IBinder;
import org.eclipse.gmt.emfacade.swt.Button;
import org.eclipse.gmt.emfacade.swt.Canvas;
import org.eclipse.gmt.emfacade.swt.Combo;
import org.eclipse.gmt.emfacade.swt.Composite;
import org.eclipse.gmt.emfacade.swt.FillLayout;
import org.eclipse.gmt.emfacade.swt.Font;
import org.eclipse.gmt.emfacade.swt.FormAttachment;
import org.eclipse.gmt.emfacade.swt.FormData;
import org.eclipse.gmt.emfacade.swt.FormLayout;
import org.eclipse.gmt.emfacade.swt.GridData;
import org.eclipse.gmt.emfacade.swt.GridLayout;
import org.eclipse.gmt.emfacade.swt.Group;
import org.eclipse.gmt.emfacade.swt.Label;
import org.eclipse.gmt.emfacade.swt.List;
import org.eclipse.gmt.emfacade.swt.Menu;
import org.eclipse.gmt.emfacade.swt.MenuBar;
import org.eclipse.gmt.emfacade.swt.MenuItem;
import org.eclipse.gmt.emfacade.swt.RGBColor;
import org.eclipse.gmt.emfacade.swt.RowData;
import org.eclipse.gmt.emfacade.swt.RowLayout;
import org.eclipse.gmt.emfacade.swt.Separator;
import org.eclipse.gmt.emfacade.swt.Shell;
import org.eclipse.gmt.emfacade.swt.SystemColor;
import org.eclipse.gmt.emfacade.swt.TabFolder;
import org.eclipse.gmt.emfacade.swt.TabItem;
import org.eclipse.gmt.emfacade.swt.Text;
import org.eclipse.gmt.emfacade.swt.Tree;
import org.eclipse.gmt.emfacade.swt.TreeColumn;
import org.eclipse.gmt.emfacade.swt.TreeViewer;
import org.eclipse.swt.graphics.Color;
			
public class SwtBinderFactory extends org.eclipse.gmt.emfacade.swt.util.SwtAdapterFactory {

	@Override
	public boolean isFactoryForType(Object type) {
		return IBinder.class.equals(type);
	}

			
			
			
			
			
			
			private IBinder<?, ?> compositeBinder = null;
			@Override
			public IBinder<?, ?> createCompositeAdapter() {
				if (compositeBinder == null) {
					compositeBinder = new CompositeBinder<Composite, org.eclipse.swt.widgets.Composite>();
				}
				return compositeBinder;
			}
			
			private IBinder<?, ?> groupBinder = null;
			@Override
			public IBinder<?, ?> createGroupAdapter() {
				if (groupBinder == null) {
					groupBinder = new GroupBinder<Group, org.eclipse.swt.widgets.Group>();
				}
				return groupBinder;
			}
			
			private IBinder<?, ?> canvasBinder = null;
			@Override
			public IBinder<?, ?> createCanvasAdapter() {
				if (canvasBinder == null) {
					canvasBinder = new CanvasBinder<Canvas, org.eclipse.swt.widgets.Canvas>();
				}
				return canvasBinder;
			}
			
			
			private IBinder<?, ?> shellBinder = null;
			@Override
			public IBinder<?, ?> createShellAdapter() {
				if (shellBinder == null) {
					shellBinder = new ShellBinder<Shell, org.eclipse.swt.widgets.Shell>();
				}
				return shellBinder;
			}
			
			private IBinder<?, ?> menuBinder = null;
			@Override
			public IBinder<?, ?> createMenuAdapter() {
				if (menuBinder == null) {
					menuBinder = new MenuBinder<Menu, org.eclipse.swt.widgets.Menu>();
				}
				return menuBinder;
			}
			
			private IBinder<?, ?> menuBarBinder = null;
			@Override
			public IBinder<?, ?> createMenuBarAdapter() {
				if (menuBarBinder == null) {
					menuBarBinder = new MenuBarBinder<MenuBar, org.eclipse.swt.widgets.Menu>();
				}
				return menuBarBinder;
			}
			
			
			private IBinder<?, ?> menuItemBinder = null;
			@Override
			public IBinder<?, ?> createMenuItemAdapter() {
				if (menuItemBinder == null) {
					menuItemBinder = new MenuItemBinder<MenuItem, org.eclipse.swt.widgets.MenuItem>();
				}
				return menuItemBinder;
			}
			
			private IBinder<?, ?> labelBinder = null;
			@Override
			public IBinder<?, ?> createLabelAdapter() {
				if (labelBinder == null) {
					labelBinder = new LabelBinder<Label, org.eclipse.swt.widgets.Label>();
				}
				return labelBinder;
			}
			
			private IBinder<?, ?> separatorBinder = null;
			@Override
			public IBinder<?, ?> createSeparatorAdapter() {
				if (separatorBinder == null) {
					separatorBinder = new SeparatorBinder<Separator, org.eclipse.swt.widgets.Label>();
				}
				return separatorBinder;
			}
			
			private IBinder<?, ?> buttonBinder = null;
			@Override
			public IBinder<?, ?> createButtonAdapter() {
				if (buttonBinder == null) {
					buttonBinder = new ButtonBinder<Button, org.eclipse.swt.widgets.Button>();
				}
				return buttonBinder;
			}
			
			private IBinder<?, ?> textBinder = null;
			@Override
			public IBinder<?, ?> createTextAdapter() {
				if (textBinder == null) {
					textBinder = new TextBinder<Text, org.eclipse.swt.widgets.Text>();
				}
				return textBinder;
			}
			
			
			private IBinder<?, ?> listBinder = null;
			@Override
			public IBinder<?, ?> createListAdapter() {
				if (listBinder == null) {
					listBinder = new ListBinder<List, org.eclipse.swt.widgets.List>();
				}
				return listBinder;
			}
			
			private IBinder<?, ?> comboBinder = null;
			@Override
			public IBinder<?, ?> createComboAdapter() {
				if (comboBinder == null) {
					comboBinder = new ComboBinder<Combo, org.eclipse.swt.widgets.Combo>();
				}
				return comboBinder;
			}
			
			private IBinder<?, ?> tabFolderBinder = null;
			@Override
			public IBinder<?, ?> createTabFolderAdapter() {
				if (tabFolderBinder == null) {
					tabFolderBinder = new TabFolderBinder<TabFolder, org.eclipse.swt.widgets.TabFolder>();
				}
				return tabFolderBinder;
			}
			
			private IBinder<?, ?> tabItemBinder = null;
			@Override
			public IBinder<?, ?> createTabItemAdapter() {
				if (tabItemBinder == null) {
					tabItemBinder = new TabItemBinder<TabItem, org.eclipse.swt.widgets.TabItem>();
				}
				return tabItemBinder;
			}
			
			private IBinder<?, ?> fillLayoutBinder = null;
			@Override
			public IBinder<?, ?> createFillLayoutAdapter() {
				if (fillLayoutBinder == null) {
					fillLayoutBinder = new FillLayoutBinder<FillLayout, org.eclipse.swt.layout.FillLayout>();
				}
				return fillLayoutBinder;
			}
			
			private IBinder<?, ?> rowLayoutBinder = null;
			@Override
			public IBinder<?, ?> createRowLayoutAdapter() {
				if (rowLayoutBinder == null) {
					rowLayoutBinder = new RowLayoutBinder<RowLayout, org.eclipse.swt.layout.RowLayout>();
				}
				return rowLayoutBinder;
			}
			
			private IBinder<?, ?> rowDataBinder = null;
			@Override
			public IBinder<?, ?> createRowDataAdapter() {
				if (rowDataBinder == null) {
					rowDataBinder = new RowDataBinder<RowData, org.eclipse.swt.layout.RowData>();
				}
				return rowDataBinder;
			}
			
			private IBinder<?, ?> gridLayoutBinder = null;
			@Override
			public IBinder<?, ?> createGridLayoutAdapter() {
				if (gridLayoutBinder == null) {
					gridLayoutBinder = new GridLayoutBinder<GridLayout, org.eclipse.swt.layout.GridLayout>();
				}
				return gridLayoutBinder;
			}
			
			private IBinder<?, ?> gridDataBinder = null;
			@Override
			public IBinder<?, ?> createGridDataAdapter() {
				if (gridDataBinder == null) {
					gridDataBinder = new GridDataBinder<GridData, org.eclipse.swt.layout.GridData>();
				}
				return gridDataBinder;
			}
			
			private IBinder<?, ?> formLayoutBinder = null;
			@Override
			public IBinder<?, ?> createFormLayoutAdapter() {
				if (formLayoutBinder == null) {
					formLayoutBinder = new FormLayoutBinder<FormLayout, org.eclipse.swt.layout.FormLayout>();
				}
				return formLayoutBinder;
			}
			
			private IBinder<?, ?> formDataBinder = null;
			@Override
			public IBinder<?, ?> createFormDataAdapter() {
				if (formDataBinder == null) {
					formDataBinder = new FormDataBinder<FormData, org.eclipse.swt.layout.FormData>();
				}
				return formDataBinder;
			}
			
			private IBinder<?, ?> formAttachmentBinder = null;
			@Override
			public IBinder<?, ?> createFormAttachmentAdapter() {
				if (formAttachmentBinder == null) {
					formAttachmentBinder = new FormAttachmentBinder<FormAttachment, org.eclipse.swt.layout.FormAttachment>();
				}
				return formAttachmentBinder;
			}
			
			
			private IBinder<?, ?> systemColorBinder = null;
			@Override
			public IBinder<?, ?> createSystemColorAdapter() {
				if (systemColorBinder == null) {
					systemColorBinder = new SystemColorBinder<SystemColor, Color>();
				}
				return systemColorBinder;
			}
			
			
			private IBinder<?, ?> rGBColorBinder = null;
			@Override
			public IBinder<?, ?> createRGBColorAdapter() {
				if (rGBColorBinder == null) {
					rGBColorBinder = new RGBColorBinder<RGBColor, Color>();
				}
				return rGBColorBinder;
			}
			
			private IBinder<?, ?> fontBinder = null;
			@Override
			public IBinder<?, ?> createFontAdapter() {
				if (fontBinder == null) {
					fontBinder = new FontBinder<Font, org.eclipse.swt.graphics.Font>();
				}
				return fontBinder;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			private IBinder<?, ?> treeColumnBinder = null;
			@Override
			public IBinder<?, ?> createTreeColumnAdapter() {
				if (treeColumnBinder == null) {
					treeColumnBinder = new TreeColumnBinder<TreeColumn, org.eclipse.swt.widgets.TreeColumn>();
				}
				return treeColumnBinder;
			}
			
			private IBinder<?, ?> treeBinder = null;
			@Override
			public IBinder<?, ?> createTreeAdapter() {
				if (treeBinder == null) {
					treeBinder = new TreeBinder<Tree, org.eclipse.swt.widgets.Tree>();
				}
				return treeBinder;
			}
			
			
			
			private IBinder<?, ?> treeViewerBinder = null;
			@Override
			public IBinder<?, ?> createTreeViewerAdapter() {
				if (treeViewerBinder == null) {
					treeViewerBinder = new TreeViewerBinder<TreeViewer, org.eclipse.jface.viewers.TreeViewer>();
				}
				return treeViewerBinder;
			}
}
