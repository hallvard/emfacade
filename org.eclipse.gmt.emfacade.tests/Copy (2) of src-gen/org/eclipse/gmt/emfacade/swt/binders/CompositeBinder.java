package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.Composite;
import org.eclipse.swt.widgets.Layout;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class CompositeBinder <Model extends Composite, View extends org.eclipse.swt.widgets.Composite>
	extends AbstractCompositeBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Composite _parent = this.<org.eclipse.swt.widgets.Composite>getParent(eObject, org.eclipse.swt.widgets.Composite.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.Composite _composite = new org.eclipse.swt.widgets.Composite(_parent, _style);
		return (View) _composite;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getAbstractComposite_Layout()) {
			if (layout_Association.updateView(eObject, object, feature, Layout.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getAbstractComposite_Layout()) {
			layout_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Composite, org.eclipse.gmt.emfacade.swt.Layout, org.eclipse.swt.widgets.Composite, Layout> layout_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Composite, org.eclipse.gmt.emfacade.swt.Layout, org.eclipse.swt.widgets.Composite, Layout>(
		new Composite_layout()
	);
		
}
