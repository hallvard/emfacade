package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.SortDirection;
import org.eclipse.gmt.emfacade.swt.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TreeBinder <Model extends Tree, View extends org.eclipse.swt.widgets.Tree>
	extends ControlBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Composite _parent = this.<org.eclipse.swt.widgets.Composite>getParent(eObject, org.eclipse.swt.widgets.Composite.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.Tree _tree = new org.eclipse.swt.widgets.Tree(_parent, _style);
		return (View) _tree;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getTree_Columns()) {
			if (columns_Association.updateView(eObject.getColumns(), object, feature, TreeColumn.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getTree_HeaderVisible()) {
			if (headerVisible_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getTree_LinesVisible()) {
			if (linesVisible_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getTree_SortColumn()) {
			if (sortColumn_Association.updateView(eObject, object, feature, TreeColumn.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getTree_SortDirection()) {
			if (sortDirection_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}
	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == SwtPackage.eINSTANCE.getTree_Columns()) {
			if (columns_Association.updateView(eObject.getColumns(), object, notification, TreeColumn.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getTree_Columns()) {
			columns_Association.disposeView(
			eObject.getColumns(), object, feature, (org.eclipse.gmt.emfacade.swt.TreeColumn) child, (TreeColumn) childObject
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getTree_HeaderVisible()) {
			headerVisible_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getTree_LinesVisible()) {
			linesVisible_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getTree_SortColumn()) {
			sortColumn_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getTree_SortDirection()) {
			sortDirection_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<Tree, org.eclipse.gmt.emfacade.swt.TreeColumn, org.eclipse.swt.widgets.Tree, TreeColumn> columns_Association = new org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<Tree, org.eclipse.gmt.emfacade.swt.TreeColumn, org.eclipse.swt.widgets.Tree, TreeColumn>(
		new Tree_columns()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, Boolean, org.eclipse.swt.widgets.Tree, Boolean> headerVisible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, Boolean, org.eclipse.swt.widgets.Tree, Boolean>(
		new Tree_headerVisible()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, Boolean, org.eclipse.swt.widgets.Tree, Boolean> linesVisible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, Boolean, org.eclipse.swt.widgets.Tree, Boolean>(
		new Tree_linesVisible()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, org.eclipse.gmt.emfacade.swt.TreeColumn, org.eclipse.swt.widgets.Tree, TreeColumn> sortColumn_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, org.eclipse.gmt.emfacade.swt.TreeColumn, org.eclipse.swt.widgets.Tree, TreeColumn>(
		new Tree_sortColumn()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, SortDirection, org.eclipse.swt.widgets.Tree, Integer> sortDirection_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Tree, SortDirection, org.eclipse.swt.widgets.Tree, Integer>(
		new Tree_sortDirection()
	);
		
}
