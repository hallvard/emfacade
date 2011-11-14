package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.Composite;
import org.eclipse.swt.widgets.Layout;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class CompositeBinder <Model extends Composite, View extends org.eclipse.swt.widgets.Composite>
	extends AbstractCompositeBinder<Model, View>
	{

	
	  public void configureView(Composite composite_1, org.eclipse.swt.widgets.Composite composite_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Composite createView(Composite composite, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(composite, org.eclipse.swt.widgets.Composite.class);
	    int _style = composite.getStyle();
	    org.eclipse.swt.widgets.Composite _composite = new org.eclipse.swt.widgets.Composite(_aParent, _style);
	    return _composite;
	  }
	
	  public void disposeView(Composite composite_1, org.eclipse.swt.widgets.Composite composite_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getAbstractComposite_Layout()) {
			if (layout_Association.updateView(eObject, object, feature, Layout.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getAbstractComposite_Layout()) {
			layout_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Composite, org.eclipse.gmt.emfacade.swt.Layout, org.eclipse.swt.widgets.Composite, Layout> layout_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Composite, org.eclipse.gmt.emfacade.swt.Layout, org.eclipse.swt.widgets.Composite, Layout>(
		new Composite_layout()
	);{
	layout_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getAbstractComposite_Layout());
	}
		
	
}
