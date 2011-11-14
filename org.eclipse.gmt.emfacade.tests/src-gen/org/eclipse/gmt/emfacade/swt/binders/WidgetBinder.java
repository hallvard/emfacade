package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.Widget;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public abstract class WidgetBinder <Model extends Widget, View extends org.eclipse.swt.widgets.Widget>
	extends AbstractBinder<Model, View>
	{

	
	  public void configureView(Widget widget_1, org.eclipse.swt.widgets.Widget widget_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Widget createView(Widget widget, IBinderHelper _binderHelper) {
	return null;
	  }
	
	  public void disposeView(Widget widget_1, org.eclipse.swt.widgets.Widget widget_2, IBinderHelper _binderHelper) {
	    boolean _isDisposed = widget_2.isDisposed();
	    boolean _operator_not = org.eclipse.xtext.xbase.lib.BooleanExtensions.operator_not(_isDisposed);
	    if (_operator_not) {
	      widget_2.dispose();
	    }
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
