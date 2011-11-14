package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;
import org.eclipse.gmt.emfacade.swt.Text;
import org.eclipse.swt.graphics.Point;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TextBinder <Model extends Text, View extends org.eclipse.swt.widgets.Text>
	extends ControlBinder<Model, View>
	{

	
	  public void configureView(Text text_1, org.eclipse.swt.widgets.Text text_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Text createView(Text text, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(text, org.eclipse.swt.widgets.Composite.class);
	    int _style = text.getStyle();
	    org.eclipse.swt.widgets.Text _text = new org.eclipse.swt.widgets.Text(_aParent, _style);
	    return _text;
	  }
	
	  public void disposeView(Text text_1, org.eclipse.swt.widgets.Text text_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getText_MultiplicityStyle()) {
			if (multiplicityStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Selection()) {
			if (selection_Association.updateView(eObject, object, feature, Point.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Editable()) {
			if (editable_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_EchoChar()) {
			if (echoChar_Association.updateView(eObject, object, feature, Character.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Tabs()) {
			if (tabs_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_TopIndex()) {
			if (topIndex_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Message()) {
			if (message_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_TextLimit()) {
			if (textLimit_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getText_MultiplicityStyle()) {
			multiplicityStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Text()) {
			text_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Selection()) {
			selection_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Editable()) {
			editable_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_EchoChar()) {
			echoChar_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Tabs()) {
			tabs_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_TopIndex()) {
			topIndex_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_Message()) {
			message_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getText_TextLimit()) {
			textLimit_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Text, MultiplicityStyle, org.eclipse.swt.widgets.Text, Integer> multiplicityStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Text, MultiplicityStyle, org.eclipse.swt.widgets.Text, Integer>(
		new Text_multiplicityStyle()
	);{
	multiplicityStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getText_MultiplicityStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, String, org.eclipse.swt.widgets.Text, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, String, org.eclipse.swt.widgets.Text, String>(
		new Text_text()
	);{
	text_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getText_Text());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Point, org.eclipse.swt.widgets.Text, Point> selection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Point, org.eclipse.swt.widgets.Text, Point>(
		new Text_selection()
	);{
	selection_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getText_Selection());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Boolean, org.eclipse.swt.widgets.Text, Boolean> editable_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Boolean, org.eclipse.swt.widgets.Text, Boolean>(
		new Text_editable()
	);{
	editable_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getText_Editable());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Character, org.eclipse.swt.widgets.Text, Character> echoChar_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Character, org.eclipse.swt.widgets.Text, Character>(
		new Text_echoChar()
	);{
	echoChar_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getText_EchoChar());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer> tabs_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer>(
		new Text_tabs()
	);{
	tabs_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getText_Tabs());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer> topIndex_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer>(
		new Text_topIndex()
	);{
	topIndex_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getText_TopIndex());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, String, org.eclipse.swt.widgets.Text, String> message_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, String, org.eclipse.swt.widgets.Text, String>(
		new Text_message()
	);{
	message_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getText_Message());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer> textLimit_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Text, Integer, org.eclipse.swt.widgets.Text, Integer>(
		new Text_textLimit()
	);{
	textLimit_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getText_TextLimit());
	}
		
	
}
