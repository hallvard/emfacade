package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.tests.facademodel.*;

import org.eclipse.gmt.emfacade.tests.views.*;



public  class MSimpleParent1GetSetBinder <Model extends MSimpleParent1GetSet, View extends SimpleParent1GetSet>	extends	AbstractBinder<Model, View> {

	@Override
	protected View createView(Model eObject, IBinderContext context) {
		return (View) new SimpleParent1GetSet();
	}


	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParent1GetSet_Child()) {
			if (child_Association.updateView(eObject, object, feature, SimpleBean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}


	@Override
	public void disposeView(MSimpleParent1GetSet eObject, SimpleParent1GetSet object, EObject child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParent1GetSet_Child()) {
				child_Association.disposeView(
				object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}

	private Strategy1.StrategyImpl<MSimpleParent1GetSet, MSimpleBean, SimpleParent1GetSet, SimpleBean> child_Association
	 = new GetSetEClassStrategy1.Impl<MSimpleParent1GetSet, MSimpleBean, SimpleParent1GetSet, SimpleBean>(
				new SimpleParent1GetSet_child()
		);
}
