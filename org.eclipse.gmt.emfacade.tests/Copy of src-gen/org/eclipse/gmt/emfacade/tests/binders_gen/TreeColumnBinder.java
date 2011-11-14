package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.TreeColumn;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TreeColumnBinder <Model extends TreeColumn, View extends org.eclipse.swt.widgets.TreeColumn>
	extends ItemBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Tree _parent = this.<org.eclipse.swt.widgets.Tree>getParent(eObject, org.eclipse.swt.widgets.Tree.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.TreeColumn _treeColumn = new org.eclipse.swt.widgets.TreeColumn(_parent, _style);
		return (View) _treeColumn;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getTreeColumn_ToolTipText()) {
			if (toolTipText_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getTreeColumn_DisplayText()) {
			if (displayText_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getTreeColumn_ToolTipText()) {
			toolTipText_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getTreeColumn_DisplayText()) {
			displayText_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TreeColumn, String, org.eclipse.swt.widgets.TreeColumn, String> toolTipText_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TreeColumn, String, org.eclipse.swt.widgets.TreeColumn, String>(
		new TreeColumn_toolTipText()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TreeColumn, String, org.eclipse.swt.widgets.TreeColumn, String> displayText_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<TreeColumn, String, org.eclipse.swt.widgets.TreeColumn, String>(
		new TreeColumn_displayText()
	);
		
}
