package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.FormLayout;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class FormLayoutBinder <Model extends FormLayout, View extends org.eclipse.swt.layout.FormLayout>
	extends LayoutBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.swt.layout.FormLayout();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginWidth()) {
			if (marginWidth_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginHeight()) {
			if (marginHeight_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_Spacing()) {
			if (spacing_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginLeft()) {
			if (marginLeft_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginTop()) {
			if (marginTop_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginRight()) {
			if (marginRight_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginBottom()) {
			if (marginBottom_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginWidth()) {
			marginWidth_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginHeight()) {
			marginHeight_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_Spacing()) {
			spacing_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginLeft()) {
			marginLeft_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginTop()) {
			marginTop_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginRight()) {
			marginRight_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginBottom()) {
			marginBottom_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginWidth()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginHeight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginHeight()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> spacing_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_spacing()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginLeft_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginLeft()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginTop_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginTop()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginRight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginRight()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginBottom_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginBottom()
	);
		
}
