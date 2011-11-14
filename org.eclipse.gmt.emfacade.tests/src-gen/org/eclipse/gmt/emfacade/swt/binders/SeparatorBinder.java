package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.Separator;
import org.eclipse.swt.widgets.Label;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class SeparatorBinder <Model extends Separator, View extends Label>
	extends ControlBinder<Model, View>
	{

	
	  public void configureView(Separator separator, Label label, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public Label createView(Separator separator, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(separator, org.eclipse.swt.widgets.Composite.class);
	    int _style = separator.getStyle();
	    org.eclipse.swt.widgets.Label _label = new org.eclipse.swt.widgets.Label(_aParent, _style);
	    return _label;
	  }
	
	  public void disposeView(Separator separator, Label label, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getSeparator_OrientationStyle()) {
			if (orientationStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getSeparator_OrientationStyle()) {
			orientationStyle_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Separator, OrientationStyle, Label, Integer> orientationStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Separator, OrientationStyle, Label, Integer>(
		new Label_orientationStyle()
	);{
	orientationStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getSeparator_OrientationStyle());
	}
		
	
}
