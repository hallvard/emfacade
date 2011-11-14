package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.MenuBar;
import org.eclipse.swt.widgets.Menu;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class MenuBarBinder <Model extends MenuBar, View extends Menu>
	extends AbstractMenuBinder<Model, View>
	{

	
	  public void configureView(MenuBar menuBar, Menu menu, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public Menu createView(MenuBar menuBar, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Decorations _aParent = _binderHelper.<org.eclipse.swt.widgets.Decorations>aParent(menuBar, org.eclipse.swt.widgets.Decorations.class);
	    int _style = menuBar.getStyle();
	    org.eclipse.swt.widgets.Menu _menu = new org.eclipse.swt.widgets.Menu(_aParent, _style);
	    return _menu;
	  }
	
	  public void disposeView(MenuBar menuBar, Menu menu, IBinderHelper _binderHelper) {
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
