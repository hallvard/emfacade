package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.RGBColor;
import org.eclipse.swt.graphics.Color;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class RGBColorBinder <Model extends RGBColor, View extends Color>
	extends ColorBinder<Model, View>
	{

	
	  public void configureView(RGBColor rGBColor, Color color, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public Color createView(RGBColor rGBColor, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Widget _aParent = _binderHelper.<org.eclipse.swt.widgets.Widget>aParent(rGBColor, org.eclipse.swt.widgets.Widget.class);
	    org.eclipse.swt.widgets.Display _display = _aParent.getDisplay();
	    int _red = rGBColor.getRed();
	    int _green = rGBColor.getGreen();
	    int _blue = rGBColor.getBlue();
	    org.eclipse.swt.graphics.Color _color = new org.eclipse.swt.graphics.Color(_display, _red, _green, _blue);
	    return _color;
	  }
	
	  public void disposeView(RGBColor rGBColor, Color color, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Red()) {
			if (red_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Green()) {
			if (green_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Blue()) {
			if (blue_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Red()) {
			red_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Green()) {
			green_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Blue()) {
			blue_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer> red_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer>(
		new Color_red()
	);{
	red_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getRGBColor_Red());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer> green_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer>(
		new Color_green()
	);{
	green_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getRGBColor_Green());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer> blue_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer>(
		new Color_blue()
	);{
	blue_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getRGBColor_Blue());
	}
		
	
}
