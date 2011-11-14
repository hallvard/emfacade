package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.FormAttachment;
import org.eclipse.gmt.emfacade.swt.FormAttachmentAlignment;
import org.eclipse.swt.widgets.Control;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class FormAttachmentBinder <Model extends FormAttachment, View extends org.eclipse.swt.layout.FormAttachment>
	extends AbstractBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.swt.layout.FormAttachment();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Alignment()) {
			if (alignment_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Control()) {
			if (control_Association.updateView(eObject, object, feature, Control.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Denominator()) {
			if (denominator_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Numerator()) {
			if (numerator_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Offset()) {
			if (offset_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Alignment()) {
			alignment_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Control()) {
			control_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Denominator()) {
			denominator_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Numerator()) {
			numerator_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormAttachment_Offset()) {
			offset_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, FormAttachmentAlignment, org.eclipse.swt.layout.FormAttachment, Integer> alignment_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, FormAttachmentAlignment, org.eclipse.swt.layout.FormAttachment, Integer>(
		new FormAttachment_alignment()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, org.eclipse.gmt.emfacade.swt.Control, org.eclipse.swt.layout.FormAttachment, Control> control_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, org.eclipse.gmt.emfacade.swt.Control, org.eclipse.swt.layout.FormAttachment, Control>(
		new FormAttachment_control()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, Integer, org.eclipse.swt.layout.FormAttachment, Integer> denominator_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, Integer, org.eclipse.swt.layout.FormAttachment, Integer>(
		new FormAttachment_denominator()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, Integer, org.eclipse.swt.layout.FormAttachment, Integer> numerator_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, Integer, org.eclipse.swt.layout.FormAttachment, Integer>(
		new FormAttachment_numerator()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, Integer, org.eclipse.swt.layout.FormAttachment, Integer> offset_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormAttachment, Integer, org.eclipse.swt.layout.FormAttachment, Integer>(
		new FormAttachment_offset()
	);
		
}
