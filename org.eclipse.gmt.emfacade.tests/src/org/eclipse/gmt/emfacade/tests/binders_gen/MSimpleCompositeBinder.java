package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.tests.facademodel.*;

import org.eclipse.gmt.emfacade.tests.views.*;



public  class MSimpleCompositeBinder <Model extends MSimpleComposite, View extends SimpleComposite>	extends	MSimpleControlBinder<Model, View> {

	@Override
	protected View createView(Model eObject, IBinderContext context) {
		return (View) new SimpleComposite(			context.getObject(eObject.getParent(), SimpleComposite.class, true)
		);
	}


	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleComposite_Children()) {
			if (children_Association.updateView(eObject.getChildren(), object, feature, SimpleControl.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == FacademodelPackage.eINSTANCE.getMSimpleComposite_Children()) {
			if (children_Association.updateView(eObject.getChildren(), object, notification, SimpleControl.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(MSimpleComposite eObject, SimpleComposite object, EObject child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleComposite_Children()) {
				children_Association.disposeView(
			eObject.getChildren(), object, feature, (MSimpleControl) child, (SimpleControl) childObject
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}

	private StrategyN.StrategyImpl<MSimpleComposite, MSimpleControl, SimpleComposite, SimpleControl> children_Association
	 = new ConstructorDisposeEClassStrategyN.Impl<MSimpleComposite, MSimpleControl, SimpleComposite, SimpleControl>(
				new SimpleComposite_children()
		);
}
