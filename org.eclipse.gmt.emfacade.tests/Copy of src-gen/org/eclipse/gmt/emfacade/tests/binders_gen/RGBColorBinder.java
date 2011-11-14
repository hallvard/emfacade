package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.RGBColor;
import org.eclipse.swt.graphics.Color;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class RGBColorBinder <Model extends RGBColor, View extends Color>
	extends ColorBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Widget _parent = this.<org.eclipse.swt.widgets.Widget>getParent(eObject, org.eclipse.swt.widgets.Widget.class);
		org.eclipse.swt.widgets.Display _display = _parent.getDisplay();
		int _red = eObject.getRed();
		int _green = eObject.getGreen();
		int _blue = eObject.getBlue();
		org.eclipse.swt.graphics.Color _color = new org.eclipse.swt.graphics.Color(_display, _red, _green, _blue);
		return (View) _color;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Red()) {
			if (red_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Green()) {
			if (green_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Blue()) {
			if (blue_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Red()) {
			red_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Green()) {
			green_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRGBColor_Blue()) {
			blue_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer> red_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer>(
		new Color_red()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer> green_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer>(
		new Color_green()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer> blue_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<RGBColor, Integer, Color, Integer>(
		new Color_blue()
	);
		
}
