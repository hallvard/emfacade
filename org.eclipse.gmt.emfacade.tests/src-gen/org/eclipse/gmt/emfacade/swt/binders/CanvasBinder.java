package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.Canvas;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class CanvasBinder <Model extends Canvas, View extends org.eclipse.swt.widgets.Canvas>
	extends CompositeBinder<Model, View>
	{

	
	  public void configureView(Canvas canvas_1, org.eclipse.swt.widgets.Canvas canvas_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Canvas createView(Canvas canvas, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(canvas, org.eclipse.swt.widgets.Composite.class);
	    int _style = canvas.getStyle();
	    org.eclipse.swt.widgets.Canvas _canvas = new org.eclipse.swt.widgets.Canvas(_aParent, _style);
	    return _canvas;
	  }
	
	  public void disposeView(Canvas canvas_1, org.eclipse.swt.widgets.Canvas canvas_2, IBinderHelper _binderHelper) {
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
