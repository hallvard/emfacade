package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.Decorations;
import org.eclipse.gmt.emfacade.swt.MenuBar;
import org.eclipse.swt.widgets.Menu;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public abstract class DecorationsBinder <Model extends Decorations, View extends org.eclipse.swt.widgets.Decorations>
	extends CanvasBinder<Model, View> {
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getDecorations_MenuBar()) {
			if (menuBar_Association.updateView(eObject, object, feature, Menu.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getDecorations_Maximized()) {
			if (maximized_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getDecorations_Minimized()) {
			if (minimized_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getDecorations_MenuBar()) {
			menuBar_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getDecorations_Maximized()) {
			maximized_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getDecorations_Minimized()) {
			minimized_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Decorations, MenuBar, org.eclipse.swt.widgets.Decorations, Menu> menuBar_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Decorations, MenuBar, org.eclipse.swt.widgets.Decorations, Menu>(
		new Decorations_menuBar()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Decorations, Boolean, org.eclipse.swt.widgets.Decorations, Boolean> maximized_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Decorations, Boolean, org.eclipse.swt.widgets.Decorations, Boolean>(
		new Decorations_maximized()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Decorations, Boolean, org.eclipse.swt.widgets.Decorations, Boolean> minimized_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Decorations, Boolean, org.eclipse.swt.widgets.Decorations, Boolean>(
		new Decorations_minimized()
	);
		
}
