package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.tests.facademodel.*;

import org.eclipse.gmt.emfacade.tests.views.*;



public  class MSimpleBeanBinder <Model extends MSimpleBean, View extends SimpleBean>	extends	AbstractBinder<Model, View> {

	@Override
	protected View createView(Model eObject, IBinderContext context) {
		return (View) new SimpleBean();
	}


	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleBean_String()) {
			if (string_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}
else		if (feature == FacademodelPackage.eINSTANCE.getMSimpleBean_Integer()) {
			if (integer_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}


	@Override
	public void disposeView(MSimpleBean eObject, SimpleBean object, EObject child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleBean_String()) {
				string_Association.disposeView(
				object
			, context);
			return;
		}
else		if (feature == FacademodelPackage.eINSTANCE.getMSimpleBean_Integer()) {
				integer_Association.disposeView(
				object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}

	private Strategy1.StrategyImpl<MSimpleBean, String, SimpleBean, String> string_Association
	 = new GetSetEDataTypeStrategy1.Impl<MSimpleBean, String, SimpleBean, String>(
				new SimpleBean_string()
		);
	private Strategy1.StrategyImpl<MSimpleBean, Integer, SimpleBean, Integer> integer_Association
	 = new GetSetEDataTypeStrategy1.Impl<MSimpleBean, Integer, SimpleBean, Integer>(
				new SimpleBean_integer()
		);
}
