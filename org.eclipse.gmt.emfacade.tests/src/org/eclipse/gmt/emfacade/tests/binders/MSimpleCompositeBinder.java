package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl;
import org.eclipse.gmt.emfacade.tests.views.SimpleComposite;
import org.eclipse.gmt.emfacade.tests.views.SimpleControl;


public class MSimpleCompositeBinder extends AbstractBinder<MSimpleComposite, SimpleComposite> {

	@Override
	protected SimpleComposite createView(MSimpleComposite eObject, IBinderContext context) {
		SimpleComposite parent = context.getObject(eObject.getParent(), SimpleComposite.class, false);
		return new SimpleComposite(parent);
	}

	public void disposeView(MSimpleComposite eObject, SimpleComposite object, IBinderContext context) {
		object.dispose();		
	}

	@Override
	public void updateView(MSimpleComposite eObject, SimpleComposite object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleComposite_Children()) {
			children_Association.updateView(eObject.getChildren(), object, feature, SimpleControl.class, context);
		}
	}

	private ConstructorDisposeStrategyN.Impl<MSimpleComposite, MSimpleControl, SimpleComposite, SimpleControl> children_Association =
		new ConstructorDisposeStrategyN.Impl<MSimpleComposite, MSimpleControl, SimpleComposite, SimpleControl>(
				new ConstructorDisposeStrategyN.Association<SimpleComposite, SimpleControl>() {
				}
	);
}
