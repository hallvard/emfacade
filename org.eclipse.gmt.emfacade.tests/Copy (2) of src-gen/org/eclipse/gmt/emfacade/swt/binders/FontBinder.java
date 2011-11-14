package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.Font;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class FontBinder <Model extends Font, View extends org.eclipse.swt.graphics.Font>
	extends AbstractBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Widget _parent = this.<org.eclipse.swt.widgets.Widget>getParent(eObject, org.eclipse.swt.widgets.Widget.class);
		org.eclipse.swt.widgets.Display _display = _parent.getDisplay();
		String _name = eObject.getName();
		int _style = eObject.getStyle();
		int _height = eObject.getHeight();
		org.eclipse.swt.graphics.Font _font = new org.eclipse.swt.graphics.Font(_display, _name, _style, ((int) _height));
		return (View) _font;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getFont_Name()) {
			if (name_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFont_Style()) {
			if (style_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFont_Height()) {
			if (height_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getFont_Name()) {
			name_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFont_Style()) {
			style_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFont_Height()) {
			height_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, String, org.eclipse.swt.graphics.Font, String> name_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, String, org.eclipse.swt.graphics.Font, String>(
		new Font_name()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, Integer, org.eclipse.swt.graphics.Font, Integer> style_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, Integer, org.eclipse.swt.graphics.Font, Integer>(
		new Font_style()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, Integer, org.eclipse.swt.graphics.Font, Integer> height_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, Integer, org.eclipse.swt.graphics.Font, Integer>(
		new Font_height()
	);
		
}
