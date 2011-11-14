package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.ModalStyle;
import org.eclipse.gmt.emfacade.swt.Shell;
import org.eclipse.gmt.emfacade.swt.TrimStyle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class ShellBinder <Model extends Shell, View extends org.eclipse.swt.widgets.Shell>
	extends DecorationsBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.Shell _shell = new org.eclipse.swt.widgets.Shell(_style);
		return (View) _shell;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getShell_ModalStyle()) {
			if (modalStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getShell_TrimStyle()) {
			if (trimStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getShell_FullScreen()) {
			if (fullScreen_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getShell_Alpha()) {
			if (alpha_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getShell_ModalStyle()) {
			modalStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getShell_TrimStyle()) {
			trimStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getShell_FullScreen()) {
			fullScreen_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getShell_Alpha()) {
			alpha_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Shell, ModalStyle, org.eclipse.swt.widgets.Shell, Integer> modalStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Shell, ModalStyle, org.eclipse.swt.widgets.Shell, Integer>(
		new Shell_modalStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Shell, TrimStyle, org.eclipse.swt.widgets.Shell, Integer> trimStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Shell, TrimStyle, org.eclipse.swt.widgets.Shell, Integer>(
		new Shell_trimStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shell, Boolean, org.eclipse.swt.widgets.Shell, Boolean> fullScreen_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shell, Boolean, org.eclipse.swt.widgets.Shell, Boolean>(
		new Shell_fullScreen()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shell, Integer, org.eclipse.swt.widgets.Shell, Integer> alpha_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shell, Integer, org.eclipse.swt.widgets.Shell, Integer>(
		new Shell_alpha()
	);
		
}
