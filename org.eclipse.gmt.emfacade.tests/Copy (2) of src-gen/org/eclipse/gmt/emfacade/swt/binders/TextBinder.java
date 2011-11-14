package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;
import org.eclipse.gmt.emfacade.swt.Text;
import org.eclipse.swt.graphics.Point;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TextBinder <Model extends Text, View extends org.eclipse.swt.widgets.Text>
	extends ControlBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Composite _parent = this.<org.eclipse.swt.widgets.Composite>getParent(eObject, org.eclipse.swt.widgets.Composite.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.Text _text = new org.eclipse.swt.widgets.Text(_parent, _style);
		return (View) _text;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getText_MultiplicityStyle()) {
			if (multiplicityStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Selection()) {
			if (selection_Association.updateView(eObject, object, feature, Point.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Editable()) {
			if (editable_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_EchoChar()) {
			if (echoChar_Association.updateView(eObject, object, feature, Character.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Tabs()) {
			if (tabs_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_TopIndex()) {
			if (topIndex_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Message()) {
			if (message_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_TextLimit()) {
			if (textLimit_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getText_MultiplicityStyle()) {
			multiplicityStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Text()) {
			text_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Selection()) {
			selection_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Editable()) {
			editable_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_EchoChar()) {
			echoChar_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Tabs()) {
			tabs_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_TopIndex()) {
			topIndex_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_Message()) {
			message_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getText_TextLimit()) {
			textLimit_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Text, MultiplicityStyle, org.eclipse.swt.widgets.Text, Integer> multiplicityStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Text, MultiplicityStyle, org.eclipse.swt.widgets.Text, Integer>(
		new Text_multiplicityStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, String, org.eclipse.swt.widgets.Text, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, String, org.eclipse.swt.widgets.Text, String>(
		new Text_text()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Point, org.eclipse.swt.widgets.Text, Point> selection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Point, org.eclipse.swt.widgets.Text, Point>(
		new Text_selection()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Boolean, org.eclipse.swt.widgets.Text, Boolean> editable_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Boolean, org.eclipse.swt.widgets.Text, Boolean>(
		new Text_editable()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Character, org.eclipse.swt.widgets.Text, Character> echoChar_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Character, org.eclipse.swt.widgets.Text, Character>(
		new Text_echoChar()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer> tabs_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer>(
		new Text_tabs()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer> topIndex_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer>(
		new Text_topIndex()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, String, org.eclipse.swt.widgets.Text, String> message_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, String, org.eclipse.swt.widgets.Text, String>(
		new Text_message()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer> textLimit_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer>(
		new Text_textLimit()
	);
		
}
