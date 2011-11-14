package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.SortDirection;
import org.eclipse.gmt.emfacade.swt.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TreeBinder <Model extends Tree, View extends org.eclipse.swt.widgets.Tree>
	extends ControlBinder<Model, View>
	{

	
	  public void configureView(Tree tree_1, org.eclipse.swt.widgets.Tree tree_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Tree createView(Tree tree, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(tree, org.eclipse.swt.widgets.Composite.class);
	    int _style = tree.getStyle();
	    org.eclipse.swt.widgets.Tree _tree = new org.eclipse.swt.widgets.Tree(_aParent, _style);
	    return _tree;
	  }
	
	  public void disposeView(Tree tree_1, org.eclipse.swt.widgets.Tree tree_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getTree_Columns()) {
			if (columns_Association.updateView(eObject.getColumns(), object, feature, TreeColumn.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getTree_HeaderVisible()) {
			if (headerVisible_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getTree_LinesVisible()) {
			if (linesVisible_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getTree_SortColumn()) {
			if (sortColumn_Association.updateView(eObject, object, feature, TreeColumn.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getTree_SortDirection()) {
			if (sortDirection_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}
	@Override
	protected boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper) {
		if (notification.getFeature() == SwtPackage.eINSTANCE.getTree_Columns()) {
			if (columns_Association.updateView(eObject.getColumns(), object, notification, TreeColumn.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
		if (feature == SwtPackage.eINSTANCE.getTree_Columns()) {
			columns_Association.disposeView(
			eObject.getColumns(), object, feature, (org.eclipse.gmt.emfacade.swt.TreeColumn) child, (TreeColumn) childObject
			, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getTree_HeaderVisible()) {
			headerVisible_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getTree_LinesVisible()) {
			linesVisible_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getTree_SortColumn()) {
			sortColumn_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getTree_SortDirection()) {
			sortDirection_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<Tree, org.eclipse.gmt.emfacade.swt.TreeColumn, org.eclipse.swt.widgets.Tree, TreeColumn> columns_Association = new org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<Tree, org.eclipse.gmt.emfacade.swt.TreeColumn, org.eclipse.swt.widgets.Tree, TreeColumn>(
		new Tree_columns()
	);{
	columns_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTree_Columns());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, Boolean, org.eclipse.swt.widgets.Tree, Boolean> headerVisible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, Boolean, org.eclipse.swt.widgets.Tree, Boolean>(
		new Tree_headerVisible()
	);{
	headerVisible_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTree_HeaderVisible());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, Boolean, org.eclipse.swt.widgets.Tree, Boolean> linesVisible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, Boolean, org.eclipse.swt.widgets.Tree, Boolean>(
		new Tree_linesVisible()
	);{
	linesVisible_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTree_LinesVisible());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, org.eclipse.gmt.emfacade.swt.TreeColumn, org.eclipse.swt.widgets.Tree, TreeColumn> sortColumn_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, org.eclipse.gmt.emfacade.swt.TreeColumn, org.eclipse.swt.widgets.Tree, TreeColumn>(
		new Tree_sortColumn()
	);{
	sortColumn_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTree_SortColumn());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, SortDirection, org.eclipse.swt.widgets.Tree, Integer> sortDirection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, SortDirection, org.eclipse.swt.widgets.Tree, Integer>(
		new Tree_sortDirection()
	);{
	sortDirection_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getTree_SortDirection());
	}
		
	
}
