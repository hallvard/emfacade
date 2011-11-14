package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.ArrowStyle;
import org.eclipse.gmt.emfacade.swt.Button;
import org.eclipse.gmt.emfacade.swt.ButtonStyle;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class ButtonBinder <Model extends Button, View extends org.eclipse.swt.widgets.Button>
	extends ControlBinder<Model, View>
implements	SelectionListener
	{

	
	  public void configureView(Button button_1, org.eclipse.swt.widgets.Button button_2, IBinderHelper _binderHelper) {
	    button_2.addSelectionListener(((org.eclipse.swt.events.SelectionListener) _binderHelper));
	  }
	
	  public org.eclipse.swt.widgets.Button createView(Button button, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(button, org.eclipse.swt.widgets.Composite.class);
	    int _style = button.getStyle();
	    org.eclipse.swt.widgets.Button _button = new org.eclipse.swt.widgets.Button(_aParent, _style);
	    return _button;
	  }
	
	  public void disposeView(Button button_1, org.eclipse.swt.widgets.Button button_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getButton_ButtonStyle()) {
			if (buttonStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getButton_ArrowStyle()) {
			if (arrowStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getLabeled_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getButton_Selection()) {
			if (selection_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getButton_ButtonStyle()) {
			buttonStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getButton_ArrowStyle()) {
			arrowStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getLabeled_Text()) {
			text_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getButton_Selection()) {
			selection_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Button, ButtonStyle, org.eclipse.swt.widgets.Button, Integer> buttonStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Button, ButtonStyle, org.eclipse.swt.widgets.Button, Integer>(
		new Button_buttonStyle()
	);{
	buttonStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getButton_ButtonStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Button, ArrowStyle, org.eclipse.swt.widgets.Button, Integer> arrowStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Button, ArrowStyle, org.eclipse.swt.widgets.Button, Integer>(
		new Button_arrowStyle()
	);{
	arrowStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getButton_ArrowStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Button, String, org.eclipse.swt.widgets.Button, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Button, String, org.eclipse.swt.widgets.Button, String>(
		new Button_text()
	);{
	text_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getLabeled_Text());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Button, Boolean, org.eclipse.swt.widgets.Button, Boolean> selection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Button, Boolean, org.eclipse.swt.widgets.Button, Boolean>(
		new Button_selection()
	);{
	selection_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getButton_Selection());
	}
		
	// implements org.eclipse.swt.events.SelectionListener
		
		  public void widgetDefaultSelected(SelectionEvent selectionEvent) {
		return;
		  }
		
		  public void widgetSelected(SelectionEvent selectionEvent) {
		    {
		      final org.eclipse.swt.widgets.Button swtButton = ((org.eclipse.swt.widgets.Button) selectionEvent.widget);
		      org.eclipse.gmt.emfacade.builder.IBinderHelper _IBinderHelper = this;
		      org.eclipse.gmt.emfacade.builder.IBinderContext _binderContext = _IBinderHelper.getBinderContext();
		      org.eclipse.emf.ecore.EObject _eObject = _binderContext.getEObject(selectionEvent.widget);
		      final org.eclipse.gmt.emfacade.swt.Button button = ((org.eclipse.gmt.emfacade.swt.Button) _eObject);
		      boolean _selection = swtButton.getSelection();
		      button.setSelection(_selection);
		    }
		  }
	
}
