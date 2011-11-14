package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.FormLayout;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class FormLayoutBinder <Model extends FormLayout, View extends org.eclipse.swt.layout.FormLayout>
	extends LayoutBinder<Model, View>
	{

	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginWidth()) {
			if (marginWidth_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginHeight()) {
			if (marginHeight_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_Spacing()) {
			if (spacing_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginLeft()) {
			if (marginLeft_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginTop()) {
			if (marginTop_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginRight()) {
			if (marginRight_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginBottom()) {
			if (marginBottom_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginWidth()) {
			marginWidth_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginHeight()) {
			marginHeight_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_Spacing()) {
			spacing_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginLeft()) {
			marginLeft_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginTop()) {
			marginTop_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginRight()) {
			marginRight_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFormLayout_MarginBottom()) {
			marginBottom_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginWidth()
	);{
	marginWidth_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormLayout_MarginWidth());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginHeight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginHeight()
	);{
	marginHeight_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormLayout_MarginHeight());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> spacing_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_spacing()
	);{
	spacing_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormLayout_Spacing());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginLeft_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginLeft()
	);{
	marginLeft_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormLayout_MarginLeft());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginTop_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginTop()
	);{
	marginTop_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormLayout_MarginTop());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginRight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginRight()
	);{
	marginRight_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormLayout_MarginRight());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer> marginBottom_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FormLayout, Integer, org.eclipse.swt.layout.FormLayout, Integer>(
		new FormLayout_marginBottom()
	);{
	marginBottom_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFormLayout_MarginBottom());
	}
		
	
}
