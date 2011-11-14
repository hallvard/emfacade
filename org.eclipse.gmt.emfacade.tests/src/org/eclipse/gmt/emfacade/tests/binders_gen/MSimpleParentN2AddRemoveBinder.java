package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.tests.facademodel.*;

import org.eclipse.gmt.emfacade.tests.views.*;



public  class MSimpleParentN2AddRemoveBinder <Model extends MSimpleParentN2AddRemove, View extends SimpleParentN2AddRemove>	extends	AbstractBinder<Model, View> {

	@Override
	protected View createView(Model eObject, IBinderContext context) {
		return (View) new SimpleParentN2AddRemove();
	}


	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParentN2AddRemove_Children()) {
			if (children_Association.updateView(eObject.getChildren(), object, feature, SimpleBean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == FacademodelPackage.eINSTANCE.getMSimpleParentN2AddRemove_Children()) {
			if (children_Association.updateView(eObject.getChildren(), object, notification, SimpleBean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(MSimpleParentN2AddRemove eObject, SimpleParentN2AddRemove object, EObject child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParentN2AddRemove_Children()) {
				children_Association.disposeView(
			eObject.getChildren(), object, feature, (MSimpleBean) child, (SimpleBean) childObject
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}

	private StrategyN.StrategyImpl<MSimpleParentN2AddRemove, MSimpleBean, SimpleParentN2AddRemove, SimpleBean> children_Association
	 = new AddRemoveEClassStrategyN.Impl<MSimpleParentN2AddRemove, MSimpleBean, SimpleParentN2AddRemove, SimpleBean>(
				new SimpleParentN2AddRemove_child()
		);
}
