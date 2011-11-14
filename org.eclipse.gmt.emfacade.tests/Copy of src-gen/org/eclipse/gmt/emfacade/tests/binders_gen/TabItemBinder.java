package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.TabItem;
import org.eclipse.swt.widgets.Control;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TabItemBinder <Model extends TabItem, View extends org.eclipse.swt.widgets.TabItem>
	extends ItemBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.TabFolder _parent = this.<org.eclipse.swt.widgets.TabFolder>getParent(eObject, org.eclipse.swt.widgets.TabFolder.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.TabItem _tabItem = new org.eclipse.swt.widgets.TabItem(_parent, _style);
		return (View) _tabItem;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getTabItem_Control()) {
			if (control_Association.updateView(eObject, object, feature, Control.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getTabItem_ToolTipText()) {
			if (toolTipText_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getTabItem_Control()) {
			control_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getTabItem_ToolTipText()) {
			toolTipText_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TabItem, org.eclipse.gmt.emfacade.swt.Control, org.eclipse.swt.widgets.TabItem, Control> control_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TabItem, org.eclipse.gmt.emfacade.swt.Control, org.eclipse.swt.widgets.TabItem, Control>(
		new TabItem_control()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TabItem, String, org.eclipse.swt.widgets.TabItem, String> toolTipText_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TabItem, String, org.eclipse.swt.widgets.TabItem, String>(
		new TabItem_toolTipText()
	);
		
}
