package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.ArrowStyle;
import org.eclipse.gmt.emfacade.swt.Button;
import org.eclipse.gmt.emfacade.swt.ButtonStyle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class ButtonBinder <Model extends Button, View extends org.eclipse.swt.widgets.Button>
	extends ControlBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Composite _parent = this.<org.eclipse.swt.widgets.Composite>getParent(eObject, org.eclipse.swt.widgets.Composite.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.Button _button = new org.eclipse.swt.widgets.Button(_parent, _style);
		return (View) _button;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getButton_ButtonStyle()) {
			if (buttonStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getButton_ArrowStyle()) {
			if (arrowStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getLabeled_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getButton_Selection()) {
			if (selection_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getButton_ButtonStyle()) {
			buttonStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getButton_ArrowStyle()) {
			arrowStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getLabeled_Text()) {
			text_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getButton_Selection()) {
			selection_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Button, ButtonStyle, org.eclipse.swt.widgets.Button, Integer> buttonStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Button, ButtonStyle, org.eclipse.swt.widgets.Button, Integer>(
		new Button_buttonStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Button, ArrowStyle, org.eclipse.swt.widgets.Button, Integer> arrowStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Button, ArrowStyle, org.eclipse.swt.widgets.Button, Integer>(
		new Button_arrowStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Button, String, org.eclipse.swt.widgets.Button, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Button, String, org.eclipse.swt.widgets.Button, String>(
		new Button_text()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Button, Boolean, org.eclipse.swt.widgets.Button, Boolean> selection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Button, Boolean, org.eclipse.swt.widgets.Button, Boolean>(
		new Button_selection()
	);
		
}
