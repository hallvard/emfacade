package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.tests.facademodel.*;

import org.eclipse.gmt.emfacade.tests.views.*;



public  class MImmutableValueParentBinder <Model extends MImmutableValueParent, View extends ImmutableValueParent>	extends	AbstractBinder<Model, View> {

	@Override
	protected View createView(Model eObject, IBinderContext context) {
		return (View) new ImmutableValueParent();
	}


	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Value()) {
			if (value_Association.updateView(eObject, object, feature, ImmutableValue.class, context)) {
				return;
			}
		}
else		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Values()) {
			if (values_Association.updateView(eObject.getValues(), object, feature, ImmutableValue.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Values()) {
			if (values_Association.updateView(eObject.getValues(), object, notification, ImmutableValue.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(MImmutableValueParent eObject, ImmutableValueParent object, EObject child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Value()) {
				value_Association.disposeView(
				object
			, context);
			return;
		}
else		if (feature == FacademodelPackage.eINSTANCE.getMImmutableValueParent_Values()) {
				values_Association.disposeView(
			eObject.getValues(), object, feature, (MImmutableValue) child, (ImmutableValue) childObject
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}

	private Strategy1.StrategyImpl<MImmutableValueParent, MImmutableValue, ImmutableValueParent, ImmutableValue> value_Association
	 = new GetSetEClassStrategy1.Impl<MImmutableValueParent, MImmutableValue, ImmutableValueParent, ImmutableValue>(
				new ImmutableValueParent_value()
		);
	private StrategyN.StrategyImpl<MImmutableValueParent, MImmutableValue, ImmutableValueParent, ImmutableValue> values_Association
	 = new AddRemoveEClassStrategyN.Impl<MImmutableValueParent, MImmutableValue, ImmutableValueParent, ImmutableValue>(
				new ImmutableValueParent_values()
		);
}
