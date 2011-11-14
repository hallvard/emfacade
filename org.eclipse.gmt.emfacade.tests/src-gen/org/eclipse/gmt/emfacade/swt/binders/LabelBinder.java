package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.Label;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class LabelBinder <Model extends Label, View extends org.eclipse.swt.widgets.Label>
	extends ControlBinder<Model, View>
	{

	
	  public void configureView(Label label_1, org.eclipse.swt.widgets.Label label_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Label createView(Label label, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(label, org.eclipse.swt.widgets.Composite.class);
	    int _style = label.getStyle();
	    org.eclipse.swt.widgets.Label _label = new org.eclipse.swt.widgets.Label(_aParent, _style);
	    return _label;
	  }
	
	  public void disposeView(Label label_1, org.eclipse.swt.widgets.Label label_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getLabeled_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getLabeled_Text()) {
			text_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, String, org.eclipse.swt.widgets.Label, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, String, org.eclipse.swt.widgets.Label, String>(
		new Label_text()
	);{
	text_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getLabeled_Text());
	}
		
	
}
