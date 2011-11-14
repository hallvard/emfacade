package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.Combo;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class ComboBinder <Model extends Combo, View extends org.eclipse.swt.widgets.Combo>
	extends AbstractListBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Composite _parent = this.<org.eclipse.swt.widgets.Composite>getParent(eObject, org.eclipse.swt.widgets.Composite.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.Combo _combo = new org.eclipse.swt.widgets.Combo(_parent, _style);
		return (View) _combo;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getAbstractList_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, feature, String.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getAbstractList_SelectionIndex()) {
			if (selectionIndex_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getCombo_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getCombo_TextLimit()) {
			if (textLimit_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}
	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == SwtPackage.eINSTANCE.getAbstractList_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, notification, String.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getAbstractList_Items()) {
			items_Association.disposeView(
			eObject.getItems(), object, feature, (String) child, (String) childObject
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getAbstractList_SelectionIndex()) {
			selectionIndex_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getCombo_Text()) {
			text_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getCombo_TextLimit()) {
			textLimit_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<Combo, String, org.eclipse.swt.widgets.Combo, String> items_Association = new org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<Combo, String, org.eclipse.swt.widgets.Combo, String>(
		new Combo_items()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, Integer, org.eclipse.swt.widgets.Combo, Integer> selectionIndex_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, Integer, org.eclipse.swt.widgets.Combo, Integer>(
		new Combo_selectionIndex()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, String, org.eclipse.swt.widgets.Combo, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, String, org.eclipse.swt.widgets.Combo, String>(
		new Combo_text()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, Integer, org.eclipse.swt.widgets.Combo, Integer> textLimit_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, Integer, org.eclipse.swt.widgets.Combo, Integer>(
		new Combo_textLimit()
	);
		
}
