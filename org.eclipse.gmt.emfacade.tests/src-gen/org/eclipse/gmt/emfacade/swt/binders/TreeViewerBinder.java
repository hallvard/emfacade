package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.TreeViewer;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class TreeViewerBinder <Model extends TreeViewer, View extends org.eclipse.jface.viewers.TreeViewer>
	extends ViewerBinder<Model, View>
	{

	
	  public void configureView(TreeViewer treeViewer_1, org.eclipse.jface.viewers.TreeViewer treeViewer_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.jface.viewers.TreeViewer createView(TreeViewer treeViewer, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Tree _aParent = _binderHelper.<org.eclipse.swt.widgets.Tree>aParent(treeViewer, org.eclipse.swt.widgets.Tree.class);
	    org.eclipse.jface.viewers.TreeViewer _treeViewer = new org.eclipse.jface.viewers.TreeViewer(_aParent);
	    return _treeViewer;
	  }
	
	  public void disposeView(TreeViewer treeViewer_1, org.eclipse.jface.viewers.TreeViewer treeViewer_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		return false;
	}
	@Override
	protected boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper) {
		return false;
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
		
	
}
