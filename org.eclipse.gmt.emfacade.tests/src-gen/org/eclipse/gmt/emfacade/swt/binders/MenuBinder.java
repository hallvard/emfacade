package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.Menu;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class MenuBinder <Model extends Menu, View extends org.eclipse.swt.widgets.Menu>
	extends AbstractMenuBinder<Model, View>
	{

	
	  public void configureView(Menu menu_1, org.eclipse.swt.widgets.Menu menu_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Menu createView(Menu menu, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Decorations _aParent = _binderHelper.<org.eclipse.swt.widgets.Decorations>aParent(menu, org.eclipse.swt.widgets.Decorations.class);
	    int _style = menu.getStyle();
	    org.eclipse.swt.widgets.Menu _menu = new org.eclipse.swt.widgets.Menu(_aParent, _style);
	    return _menu;
	  }
	
	  public void disposeView(Menu menu_1, org.eclipse.swt.widgets.Menu menu_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		return false;
	}
	@Override
	protected boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper) {
		return false;
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
		
	
}
