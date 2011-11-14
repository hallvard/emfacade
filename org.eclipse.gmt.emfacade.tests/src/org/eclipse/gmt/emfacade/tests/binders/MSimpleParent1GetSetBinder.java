package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.builder.strategies.Strategy1;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleParent1GetSet;


public class MSimpleParent1GetSetBinder<Model extends MSimpleParent1GetSet, View extends SimpleParent1GetSet> extends AbstractBinder<Model, View> {

	@Override
	protected View createView(Model simpleParent, IBinderContext context) {
		return (View) new SimpleParent1GetSet();
	}

	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParent1GetSet_Child()) {
			if (! child_Association.updateView(eObject, object, feature, SimpleBean.class, context)) {
				super.updateView(eObject, object, feature, context);
			}
		}
	}

	private Strategy1.StrategyImpl<Model, MSimpleBean, View, SimpleBean> child_Association =
		new GetSetStrategy1.Impl<Model, MSimpleBean, View, SimpleBean>(new SimpleParent1GetSet_child<View>());
}
