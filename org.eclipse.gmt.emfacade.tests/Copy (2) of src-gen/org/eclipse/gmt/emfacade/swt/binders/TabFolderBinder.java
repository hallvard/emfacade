package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TabFolderBinder <Model extends TabFolder, View extends org.eclipse.swt.widgets.TabFolder>
	extends AbstractCompositeBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Composite _parent = this.<org.eclipse.swt.widgets.Composite>getParent(eObject, org.eclipse.swt.widgets.Composite.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.TabFolder _tabFolder = new org.eclipse.swt.widgets.TabFolder(_parent, _style);
		return (View) _tabFolder;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getTabFolder_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, feature, TabItem.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}
	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == SwtPackage.eINSTANCE.getTabFolder_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, notification, TabItem.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getTabFolder_Items()) {
			items_Association.disposeView(
			eObject.getItems(), object, feature, (org.eclipse.gmt.emfacade.swt.TabItem) child, (TabItem) childObject
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<TabFolder, org.eclipse.gmt.emfacade.swt.TabItem, org.eclipse.swt.widgets.TabFolder, TabItem> items_Association = new org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<TabFolder, org.eclipse.gmt.emfacade.swt.TabItem, org.eclipse.swt.widgets.TabFolder, TabItem>(
		new TabFolder_items()
	);
		
}
