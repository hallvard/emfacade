package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.Menu;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;
import org.eclipse.swt.widgets.MenuItem;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class MenuBinder <Model extends Menu, View extends org.eclipse.swt.widgets.Menu>
	extends WidgetBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Decorations _parent = this.<org.eclipse.swt.widgets.Decorations>getParent(eObject, org.eclipse.swt.widgets.Decorations.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.Menu _menu = new org.eclipse.swt.widgets.Menu(_parent, _style);
		return (View) _menu;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getMenu_TextOrientationStyle()) {
			if (textOrientationStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenu_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, feature, MenuItem.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenu_Enabled()) {
			if (enabled_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenu_Visible()) {
			if (visible_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}
	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == SwtPackage.eINSTANCE.getMenu_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, notification, MenuItem.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getMenu_TextOrientationStyle()) {
			textOrientationStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenu_Items()) {
			items_Association.disposeView(
			eObject.getItems(), object, feature, (org.eclipse.gmt.emfacade.swt.MenuItem) child, (MenuItem) childObject
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenu_Enabled()) {
			enabled_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getMenu_Visible()) {
			visible_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Menu, TextOrientationStyle, org.eclipse.swt.widgets.Menu, Integer> textOrientationStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Menu, TextOrientationStyle, org.eclipse.swt.widgets.Menu, Integer>(
		new Menu_textOrientationStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<Menu, org.eclipse.gmt.emfacade.swt.MenuItem, org.eclipse.swt.widgets.Menu, MenuItem> items_Association = new org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<Menu, org.eclipse.gmt.emfacade.swt.MenuItem, org.eclipse.swt.widgets.Menu, MenuItem>(
		new Menu_items()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Menu, Boolean, org.eclipse.swt.widgets.Menu, Boolean> enabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Menu, Boolean, org.eclipse.swt.widgets.Menu, Boolean>(
		new Menu_enabled()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Menu, Boolean, org.eclipse.swt.widgets.Menu, Boolean> visible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Menu, Boolean, org.eclipse.swt.widgets.Menu, Boolean>(
		new Menu_visible()
	);
		
}
