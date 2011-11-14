package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.tests.facademodel.*;

import org.eclipse.gmt.emfacade.tests.views.*;



public  class MSimpleParentN3ListBinder <Model extends MSimpleParentN3List, View extends SimpleParentN3List>	extends	AbstractBinder<Model, View> {

	@Override
	protected View createView(Model eObject, IBinderContext context) {
		return (View) new SimpleParentN3List();
	}


	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParentN3List_Children()) {
			if (children_Association.updateView(eObject.getChildren(), object, feature, SimpleBean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == FacademodelPackage.eINSTANCE.getMSimpleParentN3List_Children()) {
			if (children_Association.updateView(eObject.getChildren(), object, notification, SimpleBean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(MSimpleParentN3List eObject, SimpleParentN3List object, EObject child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParentN3List_Children()) {
				children_Association.disposeView(
			eObject.getChildren(), object, feature, (MSimpleBean) child, (SimpleBean) childObject
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}

	private StrategyN.StrategyImpl<MSimpleParentN3List, MSimpleBean, SimpleParentN3List, SimpleBean> children_Association
	 = new ListEClassStrategyN.Impl<MSimpleParentN3List, MSimpleBean, SimpleParentN3List, SimpleBean>(
				new SimpleParentN3List_children()
		);
}
