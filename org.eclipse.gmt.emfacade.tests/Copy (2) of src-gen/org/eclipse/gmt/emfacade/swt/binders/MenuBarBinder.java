package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.MenuBar;
import org.eclipse.swt.widgets.Menu;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class MenuBarBinder <Model extends MenuBar, View extends Menu>
	extends MenuBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Decorations _parent = this.<org.eclipse.swt.widgets.Decorations>getParent(eObject, org.eclipse.swt.widgets.Decorations.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.Menu _menu = new org.eclipse.swt.widgets.Menu(_parent, _style);
		return (View) _menu;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
		
}
