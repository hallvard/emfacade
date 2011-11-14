package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.List;
import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class ListBinder <Model extends List, View extends org.eclipse.swt.widgets.List>
	extends AbstractListBinder<Model, View>
	{

	
	  public void configureView(List list_1, org.eclipse.swt.widgets.List list_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.List createView(List list, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(list, org.eclipse.swt.widgets.Composite.class);
	    int _style = list.getStyle();
	    org.eclipse.swt.widgets.List _list = new org.eclipse.swt.widgets.List(_aParent, _style);
	    return _list;
	  }
	
	  public void disposeView(List list_1, org.eclipse.swt.widgets.List list_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getList_MultiplicityStyle()) {
			if (multiplicityStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractList_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractList_SelectionIndex()) {
			if (selectionIndex_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getList_SelectionIndices()) {
			if (selectionIndices_Association.updateView(eObject.getSelectionIndices(), object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}
	@Override
	protected boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper) {
		if (notification.getFeature() == SwtPackage.eINSTANCE.getAbstractList_Items()) {
			if (items_Association.updateView(eObject.getItems(), object, notification, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (notification.getFeature() == SwtPackage.eINSTANCE.getList_SelectionIndices()) {
			if (selectionIndices_Association.updateView(eObject.getSelectionIndices(), object, notification, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
		if (feature == SwtPackage.eINSTANCE.getList_MultiplicityStyle()) {
			multiplicityStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractList_Items()) {
			items_Association.disposeView(
			eObject.getItems(), object, feature, (String) child, (String) childObject
			, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getAbstractList_SelectionIndex()) {
			selectionIndex_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getList_SelectionIndices()) {
			selectionIndices_Association.disposeView(
			eObject.getSelectionIndices(), object, feature, (Integer) child, (Integer) childObject
			, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<List, MultiplicityStyle, org.eclipse.swt.widgets.List, Integer> multiplicityStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<List, MultiplicityStyle, org.eclipse.swt.widgets.List, Integer>(
		new List_multiplicityStyle()
	);{
	multiplicityStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getList_MultiplicityStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<List, String, org.eclipse.swt.widgets.List, String> items_Association = new org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<List, String, org.eclipse.swt.widgets.List, String>(
		new List_items()
	);{
	items_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getAbstractList_Items());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<List, Integer, org.eclipse.swt.widgets.List, Integer> selectionIndex_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<List, Integer, org.eclipse.swt.widgets.List, Integer>(
		new List_selectionIndex()
	);{
	selectionIndex_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getAbstractList_SelectionIndex());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.AddRemoveStrategyN.Impl<List, Integer, org.eclipse.swt.widgets.List, Integer> selectionIndices_Association = new org.eclipse.gmt.emfacade.builder.strategies.AddRemoveStrategyN.Impl<List, Integer, org.eclipse.swt.widgets.List, Integer>(
		new List_selectionIndices()
	);{
	selectionIndices_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getList_SelectionIndices());
	}
		
	
}
