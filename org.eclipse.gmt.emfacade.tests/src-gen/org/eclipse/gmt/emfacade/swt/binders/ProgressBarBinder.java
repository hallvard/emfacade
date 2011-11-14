package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.ProgressBar;
import org.eclipse.gmt.emfacade.swt.ProgressState;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class ProgressBarBinder <Model extends ProgressBar, View extends org.eclipse.swt.widgets.ProgressBar>
	extends AbstractBinder<Model, View>
	{

	
	  public void configureView(ProgressBar progressBar_1, org.eclipse.swt.widgets.ProgressBar progressBar_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.ProgressBar createView(ProgressBar progressBar, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(progressBar, org.eclipse.swt.widgets.Composite.class);
	    int _style = progressBar.getStyle();
	    org.eclipse.swt.widgets.ProgressBar _progressBar = new org.eclipse.swt.widgets.ProgressBar(_aParent, _style);
	    return _progressBar;
	  }
	
	  public void disposeView(ProgressBar progressBar_1, org.eclipse.swt.widgets.ProgressBar progressBar_2, IBinderHelper _binderHelper) {
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
		if (feature == SwtPackage.eINSTANCE.getProgressBar_State()) {
			if (state_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getProgressBar_State()) {
			state_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<ProgressBar, Integer, org.eclipse.swt.widgets.ProgressBar, Integer> minimum_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<ProgressBar, Integer, org.eclipse.swt.widgets.ProgressBar, Integer>(
		new ProgressBar_minimum()
	);{
	minimum_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalControl_Minimum());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<ProgressBar, Integer, org.eclipse.swt.widgets.ProgressBar, Integer> maximum_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<ProgressBar, Integer, org.eclipse.swt.widgets.ProgressBar, Integer>(
		new ProgressBar_maximum()
	);{
	maximum_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalControl_Maximum());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<ProgressBar, Integer, org.eclipse.swt.widgets.ProgressBar, Integer> selection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<ProgressBar, Integer, org.eclipse.swt.widgets.ProgressBar, Integer>(
		new ProgressBar_selection()
	);{
	selection_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getIntervalControl_Selection());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<ProgressBar, ProgressState, org.eclipse.swt.widgets.ProgressBar, Integer> state_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<ProgressBar, ProgressState, org.eclipse.swt.widgets.ProgressBar, Integer>(
		new ProgressBar_state()
	);{
	state_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getProgressBar_State());
	}
		
	
}
