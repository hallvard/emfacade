package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.draw2d.RoundedRectangle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public  class RoundedRectangleBinder <Model extends RoundedRectangle, View extends org.eclipse.draw2d.RoundedRectangle>
	extends ShapeBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.draw2d.RoundedRectangle();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getRoundedRectangle_CornerDimensions()) {
			if (cornerDimensions_Association.updateView(eObject, object, feature, Dimension.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getRoundedRectangle_CornerDimensions()) {
			cornerDimensions_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RoundedRectangle, Dimension, org.eclipse.draw2d.RoundedRectangle, Dimension> cornerDimensions_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RoundedRectangle, Dimension, org.eclipse.draw2d.RoundedRectangle, Dimension>(
		new RoundedRectangle_cornerDimensions()
	);
		
}
