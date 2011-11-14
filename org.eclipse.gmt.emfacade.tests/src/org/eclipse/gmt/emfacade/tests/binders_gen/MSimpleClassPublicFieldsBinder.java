package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.tests.facademodel.*;

import org.eclipse.gmt.emfacade.tests.views.*;



public  class MSimpleClassPublicFieldsBinder <Model extends MSimpleClassPublicFields, View extends SimpleClassPublicFields>	extends	AbstractBinder<Model, View> {

	@Override
	protected View createView(Model eObject, IBinderContext context) {
		return (View) new SimpleClassPublicFields();
	}


	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleClassPublicFields_String()) {
			if (string_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}
else		if (feature == FacademodelPackage.eINSTANCE.getMSimpleClassPublicFields_Integer()) {
			if (integer_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}


	@Override
	public void disposeView(MSimpleClassPublicFields eObject, SimpleClassPublicFields object, EObject child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleClassPublicFields_String()) {
				string_Association.disposeView(
				object
			, context);
			return;
		}
else		if (feature == FacademodelPackage.eINSTANCE.getMSimpleClassPublicFields_Integer()) {
				integer_Association.disposeView(
				object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}

	private Strategy1.StrategyImpl<MSimpleClassPublicFields, String, SimpleClassPublicFields, String> string_Association
	 = new FieldEDataTypeStrategy1.Impl<MSimpleClassPublicFields, String, SimpleClassPublicFields, String>(
				new SimpleClassPublicFields_string()
		);
	private Strategy1.StrategyImpl<MSimpleClassPublicFields, Integer, SimpleClassPublicFields, Integer> integer_Association
	 = new FieldEDataTypeStrategy1.Impl<MSimpleClassPublicFields, Integer, SimpleClassPublicFields, Integer>(
				new SimpleClassPublicFields_integer()
		);
}
