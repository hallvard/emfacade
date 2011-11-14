package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.tests.facademodel.*;

import org.eclipse.gmt.emfacade.tests.views.*;



public  class MImmutableValueBinder <Model extends MImmutableValue, View extends ImmutableValue>	extends	AbstractBinder<Model, View> {

	@Override
	protected View createView(Model eObject, IBinderContext context) {
		return (View) new ImmutableValue(			eObject.getString()
		,			eObject.getInteger()
		);
	}


	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValue_String()) {
			if (string_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}
else		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValue_Integer()) {
			if (integer_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}


	@Override
	public void disposeView(MImmutableValue eObject, ImmutableValue object, EObject child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValue_String()) {
				string_Association.disposeView(
				object
			, context);
			return;
		}
else		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValue_Integer()) {
				integer_Association.disposeView(
				object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}

	private Strategy1.StrategyImpl<MImmutableValue, String, ImmutableValue, String> string_Association
	 = new GetEDataTypeStrategy1.Impl<MImmutableValue, String, ImmutableValue, String>(
				new ImmutableValue_string(), null
		);
	private Strategy1.StrategyImpl<MImmutableValue, Integer, ImmutableValue, Integer> integer_Association
	 = new GetEDataTypeStrategy1.Impl<MImmutableValue, Integer, ImmutableValue, Integer>(
				new ImmutableValue_integer(), null
		);
}
