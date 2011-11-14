package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1;
import org.eclipse.gmt.emfacade.builder.strategies.Strategy1;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValue;

public class MImmutableValueBinder extends AbstractBinder<MImmutableValue, ImmutableValue> {

	@Override
	protected ImmutableValue createView(MImmutableValue eObject, IBinderContext context) {
		String string = eObject.getString();
		int integer = eObject.getInteger();
		return new ImmutableValue(string, integer);
	}

	@Override
	public void updateView(MImmutableValue eObject, ImmutableValue object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValue_String()) {
			if (string_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		} else if (feature == FacademodelPackage.eINSTANCE.getMImmutableValue_Integer()) {
			if (integer_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	private Strategy1.StrategyImpl<MImmutableValue, String, ImmutableValue, String> string_Association =
		new GetStrategy1.Impl<MImmutableValue, String, ImmutableValue, String>(
			new ImmutableValue_string()
	);
	
	private Strategy1.StrategyImpl<MImmutableValue, Integer, ImmutableValue, Integer> integer_Association =
		new GetStrategy1.Impl<MImmutableValue, Integer, ImmutableValue, Integer>(
			new ImmutableValue_integer()
	);
}
