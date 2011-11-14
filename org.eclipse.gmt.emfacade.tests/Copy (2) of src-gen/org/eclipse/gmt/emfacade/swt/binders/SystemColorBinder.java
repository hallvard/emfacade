package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.SystemColor;
import org.eclipse.gmt.emfacade.swt.SystemColors;
import org.eclipse.swt.graphics.Color;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class SystemColorBinder <Model extends SystemColor, View extends Color>
	extends ColorBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Widget _parent = this.<org.eclipse.swt.widgets.Widget>getParent(eObject, org.eclipse.swt.widgets.Widget.class);
		org.eclipse.swt.widgets.Display _display = _parent.getDisplay();
		org.eclipse.gmt.emfacade.swt.SystemColors _color = eObject.getColor();
		int _value = _color.getValue();
		org.eclipse.swt.graphics.Color _systemColor = _display.getSystemColor(_value);
		return (View) _systemColor;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getSystemColor_Color()) {
			if (color_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getSystemColor_Color()) {
			color_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<SystemColor, SystemColors, Color, Integer> color_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<SystemColor, SystemColors, Color, Integer>(
		new Color_color()
	);
		
}
