package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.AddRemoveStrategyN;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.builder.strategies.Strategy1;
import org.eclipse.gmt.emfacade.builder.strategies.StrategyN;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue;
import org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValue;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValueParent;

public class MImmutableValueParentBinder extends AbstractBinder<MImmutableValueParent, ImmutableValueParent> {

	@Override
	protected ImmutableValueParent createView(MImmutableValueParent eObject, IBinderContext context) {
		return new ImmutableValueParent();
	}

	@Override
	public void updateView(MImmutableValueParent eObject, ImmutableValueParent object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Value()) {
			if (! value_Association.updateView(eObject, object, feature, ImmutableValue.class, context)) {
				super.updateView(eObject, object, feature, context);
			}
		} else if (feature == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Values()) {
			if (! values_Association.updateView(eObject.getValues(), object, feature, ImmutableValue.class, context)) {
				super.updateView(eObject, object, feature, context);
			}
		}
	}

	@Override
	public void updateView(MImmutableValueParent eObject, ImmutableValueParent object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Values()) {
			if (! values_Association.updateView(eObject.getValues(), object, notification, ImmutableValue.class, context)) {
				super.updateView(eObject, object, notification, context);
			}
		}
	}
	
	@Override
	public void disposeView(MImmutableValueParent eObject, ImmutableValueParent object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Value()) {
			value_Association.disposeView(object, context);
		} else if (feature == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Values()) {
			values_Association.disposeView(eObject.getValues(), object, feature, (MImmutableValue) child, (ImmutableValue) childObject, context);
		} else {
			super.disposeView(eObject, object, child, childObject, feature, context);
		}
	}

	// Associations

	private Strategy1.StrategyImpl<MImmutableValueParent, MImmutableValue, ImmutableValueParent, ImmutableValue> value_Association =
		new GetSetStrategy1.Impl<MImmutableValueParent, MImmutableValue, ImmutableValueParent, ImmutableValue>(
			new ImmutableValueParent_value()
	);

	private StrategyN.StrategyImpl<MImmutableValueParent, MImmutableValue, ImmutableValueParent, ImmutableValue> values_Association =
		new AddRemoveStrategyN.Impl<MImmutableValueParent, MImmutableValue, ImmutableValueParent, ImmutableValue>(
			new ImmutableValueParent_values()
	);
}
