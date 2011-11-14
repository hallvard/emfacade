package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.MenuItem;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class MenuItemBinder <Model extends MenuItem, View extends org.eclipse.swt.widgets.MenuItem>
	extends ItemBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Menu _parent = this.<org.eclipse.swt.widgets.Menu>getParent(eObject, org.eclipse.swt.widgets.Menu.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.MenuItem _menuItem = new org.eclipse.swt.widgets.MenuItem(_parent, _style);
		return (View) _menuItem;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getMenuItem_ID()) {
			if (ID_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Accelerator()) {
			if (accelerator_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Enabled()) {
			if (enabled_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Selection()) {
			if (selection_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getMenuItem_ID()) {
			ID_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Accelerator()) {
			accelerator_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Enabled()) {
			enabled_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenuItem_Selection()) {
			selection_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Integer, org.eclipse.swt.widgets.MenuItem, Integer> ID_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Integer, org.eclipse.swt.widgets.MenuItem, Integer>(
		new MenuItem_ID()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Integer, org.eclipse.swt.widgets.MenuItem, Integer> accelerator_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Integer, org.eclipse.swt.widgets.MenuItem, Integer>(
		new MenuItem_accelerator()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Boolean, org.eclipse.swt.widgets.MenuItem, Boolean> enabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Boolean, org.eclipse.swt.widgets.MenuItem, Boolean>(
		new MenuItem_enabled()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Boolean, org.eclipse.swt.widgets.MenuItem, Boolean> selection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<MenuItem, Boolean, org.eclipse.swt.widgets.MenuItem, Boolean>(
		new MenuItem_selection()
	);
		
}
