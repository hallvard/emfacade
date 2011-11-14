package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.Combo;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class ComboBinder <Model extends Combo, View extends org.eclipse.swt.widgets.Combo>
	extends AbstractListBinder<Model, View>
	{

	
	  public void configureView(Combo combo_1, org.eclipse.swt.widgets.Combo combo_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Combo createView(Combo combo, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(combo, org.eclipse.swt.widgets.Composite.class);
	    int _style = combo.getStyle();
	    org.eclipse.swt.widgets.Combo _combo = new org.eclipse.swt.widgets.Combo(_aParent, _style);
	    return _combo;
	  }
	
	  public void disposeView(Combo combo_1, org.eclipse.swt.widgets.Combo combo_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
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
		if (feature == SwtPackage.eINSTANCE.getCombo_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getCombo_TextLimit()) {
			if (textLimit_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		}
		return false;
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
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
		if (feature == SwtPackage.eINSTANCE.getCombo_Text()) {
			text_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getCombo_TextLimit()) {
			textLimit_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<Combo, String, org.eclipse.swt.widgets.Combo, String> items_Association = new org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<Combo, String, org.eclipse.swt.widgets.Combo, String>(
		new Combo_items()
	);{
	items_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getAbstractList_Items());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, Integer, org.eclipse.swt.widgets.Combo, Integer> selectionIndex_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, Integer, org.eclipse.swt.widgets.Combo, Integer>(
		new Combo_selectionIndex()
	);{
	selectionIndex_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getAbstractList_SelectionIndex());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, String, org.eclipse.swt.widgets.Combo, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, String, org.eclipse.swt.widgets.Combo, String>(
		new Combo_text()
	);{
	text_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getCombo_Text());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, Integer, org.eclipse.swt.widgets.Combo, Integer> textLimit_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Combo, Integer, org.eclipse.swt.widgets.Combo, Integer>(
		new Combo_textLimit()
	);{
	textLimit_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getCombo_TextLimit());
	}
		
	
}
