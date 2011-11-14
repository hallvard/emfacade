package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.TabItem;
import org.eclipse.swt.widgets.Control;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TabItemBinder <Model extends TabItem, View extends org.eclipse.swt.widgets.TabItem>
	extends ItemBinder<Model, View>
	{

	
	  public void configureView(TabItem tabItem_1, org.eclipse.swt.widgets.TabItem tabItem_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.TabItem createView(TabItem tabItem, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.TabFolder _aParent = _binderHelper.<org.eclipse.swt.widgets.TabFolder>aParent(tabItem, org.eclipse.swt.widgets.TabFolder.class);
	    int _style = tabItem.getStyle();
	    org.eclipse.swt.widgets.TabItem _tabItem = new org.eclipse.swt.widgets.TabItem(_aParent, _style);
	    return _tabItem;
	  }
	
	  public void disposeView(TabItem tabItem_1, org.eclipse.swt.widgets.TabItem tabItem_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getTabItem_ToolTipText()) {
			if (toolTipText_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getTabItem_Control()) {
			if (control_Association.updateView(eObject, object, feature, Control.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getTabItem_ToolTipText()) {
			toolTipText_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getTabItem_Control()) {
			control_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TabItem, String, org.eclipse.swt.widgets.TabItem, String> toolTipText_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TabItem, String, org.eclipse.swt.widgets.TabItem, String>(
		new TabItem_toolTipText()
	);{
	toolTipText_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTabItem_ToolTipText());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TabItem, org.eclipse.gmt.emfacade.swt.Control, org.eclipse.swt.widgets.TabItem, Control> control_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TabItem, org.eclipse.gmt.emfacade.swt.Control, org.eclipse.swt.widgets.TabItem, Control>(
		new TabItem_control()
	);{
	control_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTabItem_Control());
	}
		
	
}
