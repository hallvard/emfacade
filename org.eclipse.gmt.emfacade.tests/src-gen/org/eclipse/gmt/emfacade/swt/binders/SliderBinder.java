package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.Slider;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class SliderBinder <Model extends Slider, View extends org.eclipse.swt.widgets.Slider>
	extends AbstractBinder<Model, View>
	{

	
	  public void configureView(Slider slider_1, org.eclipse.swt.widgets.Slider slider_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Slider createView(Slider slider, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(slider, org.eclipse.swt.widgets.Composite.class);
	    int _style = slider.getStyle();
	    org.eclipse.swt.widgets.Slider _slider = new org.eclipse.swt.widgets.Slider(_aParent, _style);
	    return _slider;
	  }
	
	  public void disposeView(Slider slider_1, org.eclipse.swt.widgets.Slider slider_2, IBinderHelper _binderHelper) {
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
		if (feature == SwtPackage.eINSTANCE.getSlider_Thumb()) {
			if (thumb_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getSlider_Thumb()) {
			thumb_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer> minimum_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer>(
		new Slider_minimum()
	);{
	minimum_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalControl_Minimum());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer> maximum_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer>(
		new Slider_maximum()
	);{
	maximum_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalControl_Maximum());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer> selection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer>(
		new Slider_selection()
	);{
	selection_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalControl_Selection());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, OrientationStyle, org.eclipse.swt.widgets.Slider, Integer> orientationStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, OrientationStyle, org.eclipse.swt.widgets.Slider, Integer>(
		new Slider_orientationStyle()
	);{
	orientationStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalSelector_OrientationStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer> increment_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer>(
		new Slider_increment()
	);{
	increment_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalSelector_Increment());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer> pageIncrement_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer>(
		new Slider_pageIncrement()
	);{
	pageIncrement_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalSelector_PageIncrement());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer> thumb_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Slider, Integer, org.eclipse.swt.widgets.Slider, Integer>(
		new Slider_thumb()
	);{
	thumb_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getSlider_Thumb());
	}
		
	
}
