package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.builder.strategies.Strategy1;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;


public class MSimpleBeanBinder extends AbstractBinder<MSimpleBean, SimpleBean> {

	@Override
	protected SimpleBean createView(MSimpleBean simpleBean, IBinderContext context) {
		return new SimpleBean();
	}

	@Override
	public void updateView(MSimpleBean eObject, SimpleBean object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleBean_String()) {
			string_Association.updateView(eObject, object, feature, String.class, context);
		} else if (feature == FacademodelPackage.eINSTANCE.getMSimpleBean_Integer()) {
			integer_Association.updateView(eObject, object, feature, Integer.class, context);
		}
	}

	private Strategy1.StrategyImpl<MSimpleBean, String, SimpleBean, String> string_Association =
		new GetSetStrategy1.Impl<MSimpleBean, String, SimpleBean, String>(
			new SimpleBean_string()
	);
	
	private Strategy1.StrategyImpl<MSimpleBean, Integer, SimpleBean, Integer> integer_Association =
		new GetSetStrategy1.Impl<MSimpleBean, Integer, SimpleBean, Integer>(
			new SimpleBean_integer()
	);
}
