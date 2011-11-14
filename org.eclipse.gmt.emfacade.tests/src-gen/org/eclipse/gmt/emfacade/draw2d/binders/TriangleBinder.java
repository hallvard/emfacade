package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.draw2d.Direction;
import org.eclipse.gmt.emfacade.draw2d.Orientation;
import org.eclipse.gmt.emfacade.draw2d.Triangle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public  class TriangleBinder <Model extends Triangle, View extends org.eclipse.draw2d.Triangle>
	extends ShapeBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.draw2d.Triangle();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getTriangle_Orientation()) {
			if (orientation_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getTriangle_Direction()) {
			if (direction_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getTriangle_Orientation()) {
			orientation_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getTriangle_Direction()) {
			direction_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Triangle, Orientation, org.eclipse.draw2d.Triangle, Integer> orientation_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Triangle, Orientation, org.eclipse.draw2d.Triangle, Integer>(
		new Triangle_orientation()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Triangle, Direction, org.eclipse.draw2d.Triangle, Integer> direction_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Triangle, Direction, org.eclipse.draw2d.Triangle, Integer>(
		new Triangle_direction()
	);
		
}
