package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.RowData;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class RowDataBinder <Model extends RowData, View extends org.eclipse.swt.layout.RowData>
	extends LayoutDataBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.swt.layout.RowData();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getRowData_Width()) {
			if (width_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowData_Height()) {
			if (height_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowData_Exclude()) {
			if (exclude_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getRowData_Width()) {
			width_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowData_Height()) {
			height_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowData_Exclude()) {
			exclude_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowData, Integer, org.eclipse.swt.layout.RowData, Integer> width_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowData, Integer, org.eclipse.swt.layout.RowData, Integer>(
		new RowData_width()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowData, Integer, org.eclipse.swt.layout.RowData, Integer> height_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowData, Integer, org.eclipse.swt.layout.RowData, Integer>(
		new RowData_height()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowData, Boolean, org.eclipse.swt.layout.RowData, Boolean> exclude_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowData, Boolean, org.eclipse.swt.layout.RowData, Boolean>(
		new RowData_exclude()
	);
		
}
