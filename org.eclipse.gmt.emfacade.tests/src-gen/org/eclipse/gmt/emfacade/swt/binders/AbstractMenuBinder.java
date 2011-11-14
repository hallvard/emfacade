package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.AbstractMenu;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public abstract class AbstractMenuBinder <Model extends AbstractMenu, View extends Menu>
	extends WidgetBinder<Model, View>
	{

	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getAbstractMenu_TextOrientationStyle()) {
			if (textOrientationStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractMenu_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, feature, MenuItem.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractMenu_Enabled()) {
			if (enabled_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractMenu_Visible()) {
			if (visible_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}
	@Override
	protected boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper) {
		if (notification.getFeature() == SwtPackage.eINSTANCE.getAbstractMenu_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, notification, MenuItem.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
		if (feature == SwtPackage.eINSTANCE.getAbstractMenu_TextOrientationStyle()) {
			textOrientationStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractMenu_Items()) {
			items_Association.disposeView(
			eObject.getItems(), object, feature, (org.eclipse.gmt.emfacade.swt.MenuItem) child, (MenuItem) childObject
			, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractMenu_Enabled()) {
			enabled_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractMenu_Visible()) {
			visible_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<AbstractMenu, TextOrientationStyle, Menu, Integer> textOrientationStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<AbstractMenu, TextOrientationStyle, Menu, Integer>(
		new Menu_textOrientationStyle()
	);{
	textOrientationStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getAbstractMenu_TextOrientationStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<AbstractMenu, org.eclipse.gmt.emfacade.swt.MenuItem, Menu, MenuItem> items_Association = new org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<AbstractMenu, org.eclipse.gmt.emfacade.swt.MenuItem, Menu, MenuItem>(
		new Menu_items()
	);{
	items_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getAbstractMenu_Items());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<AbstractMenu, Boolean, Menu, Boolean> enabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<AbstractMenu, Boolean, Menu, Boolean>(
		new Menu_enabled()
	);{
	enabled_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getAbstractMenu_Enabled());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<AbstractMenu, Boolean, Menu, Boolean> visible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<AbstractMenu, Boolean, Menu, Boolean>(
		new Menu_visible()
	);{
	visible_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getAbstractMenu_Visible());
	}
		
	
}
