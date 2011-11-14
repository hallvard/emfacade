package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.MenuItem;
import org.eclipse.swt.widgets.Menu;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class MenuItemBinder <Model extends MenuItem, View extends org.eclipse.swt.widgets.MenuItem>
	extends ItemBinder<Model, View>
	{

	
	  public void configureView(MenuItem menuItem_1, org.eclipse.swt.widgets.MenuItem menuItem_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.MenuItem createView(MenuItem menuItem, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Menu _aParent = _binderHelper.<org.eclipse.swt.widgets.Menu>aParent(menuItem, org.eclipse.swt.widgets.Menu.class);
	    int _style = menuItem.getStyle();
	    org.eclipse.swt.widgets.MenuItem _menuItem = new org.eclipse.swt.widgets.MenuItem(_aParent, _style);
	    return _menuItem;
	  }
	
	  public void disposeView(MenuItem menuItem_1, org.eclipse.swt.widgets.MenuItem menuItem_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getMenuItem_ID()) {
			if (ID_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Accelerator()) {
			if (accelerator_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Enabled()) {
			if (enabled_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Selection()) {
			if (selection_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Menu()) {
			if (menu_Association.updateView(eObject, object, feature, Menu.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}
	@Override
	protected boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper) {
		return false;
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
		if (feature == SwtPackage.eINSTANCE.getMenuItem_ID()) {
			ID_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Accelerator()) {
			accelerator_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Enabled()) {
			enabled_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Selection()) {
			selection_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Menu()) {
			menu_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Integer, org.eclipse.swt.widgets.MenuItem, Integer> ID_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Integer, org.eclipse.swt.widgets.MenuItem, Integer>(
		new MenuItem_ID()
	);{
	ID_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getMenuItem_ID());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Integer, org.eclipse.swt.widgets.MenuItem, Integer> accelerator_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Integer, org.eclipse.swt.widgets.MenuItem, Integer>(
		new MenuItem_accelerator()
	);{
	accelerator_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getMenuItem_Accelerator());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Boolean, org.eclipse.swt.widgets.MenuItem, Boolean> enabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Boolean, org.eclipse.swt.widgets.MenuItem, Boolean>(
		new MenuItem_enabled()
	);{
	enabled_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getMenuItem_Enabled());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Boolean, org.eclipse.swt.widgets.MenuItem, Boolean> selection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Boolean, org.eclipse.swt.widgets.MenuItem, Boolean>(
		new MenuItem_selection()
	);{
	selection_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getMenuItem_Selection());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, org.eclipse.gmt.emfacade.swt.Menu, org.eclipse.swt.widgets.MenuItem, Menu> menu_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, org.eclipse.gmt.emfacade.swt.Menu, org.eclipse.swt.widgets.MenuItem, Menu>(
		new MenuItem_menu()
	);{
	menu_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getMenuItem_Menu());
	}
		
	
}
