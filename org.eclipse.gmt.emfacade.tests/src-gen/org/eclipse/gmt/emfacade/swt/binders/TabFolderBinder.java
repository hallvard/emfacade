package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TabFolderBinder <Model extends TabFolder, View extends org.eclipse.swt.widgets.TabFolder>
	extends ControlBinder<Model, View>
	{

	
	  public void configureView(TabFolder tabFolder_1, org.eclipse.swt.widgets.TabFolder tabFolder_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.TabFolder createView(TabFolder tabFolder, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(tabFolder, org.eclipse.swt.widgets.Composite.class);
	    int _style = tabFolder.getStyle();
	    org.eclipse.swt.widgets.TabFolder _tabFolder = new org.eclipse.swt.widgets.TabFolder(_aParent, _style);
	    return _tabFolder;
	  }
	
	  public void disposeView(TabFolder tabFolder_1, org.eclipse.swt.widgets.TabFolder tabFolder_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getTabFolder_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, feature, TabItem.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}
	@Override
	protected boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper) {
		if (notification.getFeature() == SwtPackage.eINSTANCE.getTabFolder_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, notification, TabItem.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
		if (feature == SwtPackage.eINSTANCE.getTabFolder_Items()) {
			items_Association.disposeView(
			eObject.getItems(), object, feature, (org.eclipse.gmt.emfacade.swt.TabItem) child, (TabItem) childObject
			, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<TabFolder, org.eclipse.gmt.emfacade.swt.TabItem, org.eclipse.swt.widgets.TabFolder, TabItem> items_Association = new org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<TabFolder, org.eclipse.gmt.emfacade.swt.TabItem, org.eclipse.swt.widgets.TabFolder, TabItem>(
		new TabFolder_items()
	);{
	items_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTabFolder_Items());
	}
		
	
}
