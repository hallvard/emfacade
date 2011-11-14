package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.TreeColumn;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TreeColumnBinder <Model extends TreeColumn, View extends org.eclipse.swt.widgets.TreeColumn>
	extends ItemBinder<Model, View>
	{

	
	  public void configureView(TreeColumn treeColumn_1, org.eclipse.swt.widgets.TreeColumn treeColumn_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.TreeColumn createView(TreeColumn treeColumn, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Tree _aParent = _binderHelper.<org.eclipse.swt.widgets.Tree>aParent(treeColumn, org.eclipse.swt.widgets.Tree.class);
	    int _style = treeColumn.getStyle();
	    org.eclipse.swt.widgets.TreeColumn _treeColumn = new org.eclipse.swt.widgets.TreeColumn(_aParent, _style);
	    return _treeColumn;
	  }
	
	  public void disposeView(TreeColumn treeColumn_1, org.eclipse.swt.widgets.TreeColumn treeColumn_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getTreeColumn_ToolTipText()) {
			if (toolTipText_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getTreeColumn_DisplayText()) {
			if (displayText_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getTreeColumn_ToolTipText()) {
			toolTipText_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getTreeColumn_DisplayText()) {
			displayText_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TreeColumn, String, org.eclipse.swt.widgets.TreeColumn, String> toolTipText_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TreeColumn, String, org.eclipse.swt.widgets.TreeColumn, String>(
		new TreeColumn_toolTipText()
	);{
	toolTipText_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTreeColumn_ToolTipText());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TreeColumn, String, org.eclipse.swt.widgets.TreeColumn, String> displayText_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TreeColumn, String, org.eclipse.swt.widgets.TreeColumn, String>(
		new TreeColumn_displayText()
	);{
	displayText_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTreeColumn_DisplayText());
	}
		
	
}
