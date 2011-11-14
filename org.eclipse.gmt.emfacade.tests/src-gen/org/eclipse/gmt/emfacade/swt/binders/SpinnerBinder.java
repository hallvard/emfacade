package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.Spinner;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class SpinnerBinder <Model extends Spinner, View extends org.eclipse.swt.widgets.Spinner>
	extends AbstractBinder<Model, View>
	{

	
	  public void configureView(Spinner spinner_1, org.eclipse.swt.widgets.Spinner spinner_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Spinner createView(Spinner spinner, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(spinner, org.eclipse.swt.widgets.Composite.class);
	    int _style = spinner.getStyle();
	    org.eclipse.swt.widgets.Spinner _spinner = new org.eclipse.swt.widgets.Spinner(_aParent, _style);
	    return _spinner;
	  }
	
	  public void disposeView(Spinner spinner_1, org.eclipse.swt.widgets.Spinner spinner_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getIntervalControl_Minimum()) {
			if (minimum_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalControl_Maximum()) {
			if (maximum_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalControl_Selection()) {
			if (selection_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalSelector_OrientationStyle()) {
			if (orientationStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalSelector_Increment()) {
			if (increment_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalSelector_PageIncrement()) {
			if (pageIncrement_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getSpinner_Digits()) {
			if (digits_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getSpinner_TextLimit()) {
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
		if (feature == SwtPackage.eINSTANCE.getIntervalControl_Minimum()) {
			minimum_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalControl_Maximum()) {
			maximum_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalControl_Selection()) {
			selection_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalSelector_OrientationStyle()) {
			orientationStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalSelector_Increment()) {
			increment_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getIntervalSelector_PageIncrement()) {
			pageIncrement_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getSpinner_Digits()) {
			digits_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getSpinner_TextLimit()) {
			textLimit_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer> minimum_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer>(
		new Spinner_minimum()
	);{
	minimum_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalControl_Minimum());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer> maximum_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer>(
		new Spinner_maximum()
	);{
	maximum_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalControl_Maximum());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer> selection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer>(
		new Spinner_selection()
	);{
	selection_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalControl_Selection());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, OrientationStyle, org.eclipse.swt.widgets.Spinner, Integer> orientationStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, OrientationStyle, org.eclipse.swt.widgets.Spinner, Integer>(
		new Spinner_orientationStyle()
	);{
	orientationStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalSelector_OrientationStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer> increment_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer>(
		new Spinner_increment()
	);{
	increment_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalSelector_Increment());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer> pageIncrement_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer>(
		new Spinner_pageIncrement()
	);{
	pageIncrement_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalSelector_PageIncrement());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer> digits_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer>(
		new Spinner_digits()
	);{
	digits_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getSpinner_Digits());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer> textLimit_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Spinner, Integer, org.eclipse.swt.widgets.Spinner, Integer>(
		new Spinner_textLimit()
	);{
	textLimit_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getSpinner_TextLimit());
	}
		
	
}
