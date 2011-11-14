package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.SystemColor;
import org.eclipse.gmt.emfacade.swt.SystemColors;
import org.eclipse.swt.graphics.Color;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class SystemColorBinder <Model extends SystemColor, View extends Color>
	extends ColorBinder<Model, View>
	{

	
	  public void configureView(SystemColor systemColor, Color color, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public Color createView(SystemColor systemColor, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Widget _aParent = _binderHelper.<org.eclipse.swt.widgets.Widget>aParent(systemColor, org.eclipse.swt.widgets.Widget.class);
	    org.eclipse.swt.widgets.Display _display = _aParent.getDisplay();
	    org.eclipse.gmt.emfacade.swt.SystemColors _color = systemColor.getColor();
	    int _value = _color.getValue();
	    org.eclipse.swt.graphics.Color _systemColor = _display.getSystemColor(_value);
	    return _systemColor;
	  }
	
	  public void disposeView(SystemColor systemColor, Color color, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getSystemColor_Color()) {
			if (color_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getSystemColor_Color()) {
			color_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<SystemColor, SystemColors, Color, Integer> color_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<SystemColor, SystemColors, Color, Integer>(
		new Color_color()
	);{
	color_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getSystemColor_Color());
	}
		
	
}
