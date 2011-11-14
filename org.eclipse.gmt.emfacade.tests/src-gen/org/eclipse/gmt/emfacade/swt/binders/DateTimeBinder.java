package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.DateTime;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class DateTimeBinder <Model extends DateTime, View extends org.eclipse.swt.widgets.DateTime>
	extends ControlBinder<Model, View>
	{

	
	  public void configureView(DateTime dateTime_1, org.eclipse.swt.widgets.DateTime dateTime_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.DateTime createView(DateTime dateTime, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(dateTime, org.eclipse.swt.widgets.Composite.class);
	    int _style = dateTime.getStyle();
	    org.eclipse.swt.widgets.DateTime _dateTime = new org.eclipse.swt.widgets.DateTime(_aParent, _style);
	    return _dateTime;
	  }
	
	  public void disposeView(DateTime dateTime_1, org.eclipse.swt.widgets.DateTime dateTime_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getDateTime_Seconds()) {
			if (seconds_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Minutes()) {
			if (minutes_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Hours()) {
			if (hours_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Day()) {
			if (day_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Month()) {
			if (month_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Year()) {
			if (year_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getDateTime_Seconds()) {
			seconds_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Minutes()) {
			minutes_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Hours()) {
			hours_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Day()) {
			day_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Month()) {
			month_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getDateTime_Year()) {
			year_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer> seconds_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer>(
		new DateTime_seconds()
	);{
	seconds_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getDateTime_Seconds());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer> minutes_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer>(
		new DateTime_minutes()
	);{
	minutes_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getDateTime_Minutes());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer> hours_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer>(
		new DateTime_hours()
	);{
	hours_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getDateTime_Hours());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer> day_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer>(
		new DateTime_day()
	);{
	day_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getDateTime_Day());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer> month_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer>(
		new DateTime_month()
	);{
	month_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getDateTime_Month());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer> year_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<DateTime, Integer, org.eclipse.swt.widgets.DateTime, Integer>(
		new DateTime_year()
	);{
	year_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getDateTime_Year());
	}
		
	
}
