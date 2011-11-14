package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.List;
import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class ListBinder <Model extends List, View extends org.eclipse.swt.widgets.List>
	extends AbstractListBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Composite _parent = this.<org.eclipse.swt.widgets.Composite>getParent(eObject, org.eclipse.swt.widgets.Composite.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.List _list = new org.eclipse.swt.widgets.List(_parent, _style);
		return (View) _list;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getList_MultiplicityStyle()) {
			if (multiplicityStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
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
		if (feature == SwtPackage.eINSTANCE.getList_SelectionIndices()) {
			if (selectionIndices_Association.updateView(eObject.getSelectionIndices(), object, feature, Integer.class, context)) {
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
		}else 
		if (notification.getFeature() == SwtPackage.eINSTANCE.getList_SelectionIndices()) {
			if (selectionIndices_Association.updateView(eObject.getSelectionIndices(), object, notification, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getList_MultiplicityStyle()) {
			multiplicityStyle_Association.disposeView(
object
			, context);
			return;
		}else 
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
		if (feature == SwtPackage.eINSTANCE.getList_SelectionIndices()) {
			selectionIndices_Association.disposeView(
			eObject.getSelectionIndices(), object, feature, (Integer) child, (Integer) childObject
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<List, MultiplicityStyle, org.eclipse.swt.widgets.List, Integer> multiplicityStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<List, MultiplicityStyle, org.eclipse.swt.widgets.List, Integer>(
		new List_multiplicityStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<List, String, org.eclipse.swt.widgets.List, String> items_Association = new org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<List, String, org.eclipse.swt.widgets.List, String>(
		new List_items()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<List, Integer, org.eclipse.swt.widgets.List, Integer> selectionIndex_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<List, Integer, org.eclipse.swt.widgets.List, Integer>(
		new List_selectionIndex()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.AddRemoveStrategyN.Impl<List, Integer, org.eclipse.swt.widgets.List, Integer> selectionIndices_Association = new org.eclipse.gmt.emfacade.builder.strategies.AddRemoveStrategyN.Impl<List, Integer, org.eclipse.swt.widgets.List, Integer>(
		new List_selectionIndices()
	);
		
}
