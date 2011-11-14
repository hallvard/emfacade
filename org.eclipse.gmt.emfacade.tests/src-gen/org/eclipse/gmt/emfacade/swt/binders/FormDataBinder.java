package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.FormData;
import org.eclipse.swt.layout.FormAttachment;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class FormDataBinder <Model extends FormData, View extends org.eclipse.swt.layout.FormData>
	extends LayoutDataBinder<Model, View>
	{

	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getFormData_Width()) {
			if (width_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Height()) {
			if (height_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Left()) {
			if (left_Association.updateView(eObject, object, feature, FormAttachment.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Top()) {
			if (top_Association.updateView(eObject, object, feature, FormAttachment.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Right()) {
			if (right_Association.updateView(eObject, object, feature, FormAttachment.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Bottom()) {
			if (bottom_Association.updateView(eObject, object, feature, FormAttachment.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getFormData_Width()) {
			width_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Height()) {
			height_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Left()) {
			left_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Top()) {
			top_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Right()) {
			right_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormData_Bottom()) {
			bottom_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, Integer, org.eclipse.swt.layout.FormData, Integer> width_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, Integer, org.eclipse.swt.layout.FormData, Integer>(
		new FormData_width()
	);{
	width_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormData_Width());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, Integer, org.eclipse.swt.layout.FormData, Integer> height_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, Integer, org.eclipse.swt.layout.FormData, Integer>(
		new FormData_height()
	);{
	height_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormData_Height());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, org.eclipse.gmt.emfacade.swt.FormAttachment, org.eclipse.swt.layout.FormData, FormAttachment> left_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, org.eclipse.gmt.emfacade.swt.FormAttachment, org.eclipse.swt.layout.FormData, FormAttachment>(
		new FormData_left()
	);{
	left_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormData_Left());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, org.eclipse.gmt.emfacade.swt.FormAttachment, org.eclipse.swt.layout.FormData, FormAttachment> top_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, org.eclipse.gmt.emfacade.swt.FormAttachment, org.eclipse.swt.layout.FormData, FormAttachment>(
		new FormData_top()
	);{
	top_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormData_Top());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, org.eclipse.gmt.emfacade.swt.FormAttachment, org.eclipse.swt.layout.FormData, FormAttachment> right_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, org.eclipse.gmt.emfacade.swt.FormAttachment, org.eclipse.swt.layout.FormData, FormAttachment>(
		new FormData_right()
	);{
	right_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormData_Right());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, org.eclipse.gmt.emfacade.swt.FormAttachment, org.eclipse.swt.layout.FormData, FormAttachment> bottom_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormData, org.eclipse.gmt.emfacade.swt.FormAttachment, org.eclipse.swt.layout.FormData, FormAttachment>(
		new FormData_bottom()
	);{
	bottom_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormData_Bottom());
	}
		
	
}
