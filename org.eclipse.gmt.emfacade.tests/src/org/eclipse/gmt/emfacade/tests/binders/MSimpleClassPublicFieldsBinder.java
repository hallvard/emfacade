package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields;
import org.eclipse.gmt.emfacade.tests.views.SimpleClassPublicFields;


public class MSimpleClassPublicFieldsBinder extends AbstractBinder<MSimpleClassPublicFields, SimpleClassPublicFields> {

	@Override
	protected SimpleClassPublicFields createView(MSimpleClassPublicFields simpleInstance, IBinderContext context) {
		return new SimpleClassPublicFields();
	}

	@Override
	public void updateView(MSimpleClassPublicFields eObject, SimpleClassPublicFields object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleClassPublicFields_String()) {
			string_Association.updateView(eObject, object, feature, String.class, context);
		} else if (feature == FacademodelPackage.eINSTANCE.getMSimpleClassPublicFields_Integer()) {
			integer_Association.updateView(eObject, object, feature, Integer.class, context);
		}
	}

	private GetSetStrategy1.Impl<MSimpleClassPublicFields, String, SimpleClassPublicFields, String> string_Association =
		new GetSetStrategy1.Impl<MSimpleClassPublicFields, String, SimpleClassPublicFields, String>(
			new SimpleClassPublicFields_string()
	);
	
	private GetSetStrategy1.Impl<MSimpleClassPublicFields, Integer, SimpleClassPublicFields, Integer> integer_Association =
		new GetSetStrategy1.Impl<MSimpleClassPublicFields, Integer, SimpleClassPublicFields, Integer>(
			new SimpleClassPublicFields_integer()
	);
}
