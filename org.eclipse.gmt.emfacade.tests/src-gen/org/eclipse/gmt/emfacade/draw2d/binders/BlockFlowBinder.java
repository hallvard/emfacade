package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.draw2d.BlockFlow;
import org.eclipse.gmt.emfacade.draw2d.Orientation;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public  class BlockFlowBinder <Model extends BlockFlow, View extends org.eclipse.draw2d.text.BlockFlow>
	extends FigureBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.draw2d.text.BlockFlow();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getBlockFlow_Orientation()) {
			if (orientation_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getBlockFlow_Orientation()) {
			orientation_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<BlockFlow, Orientation, org.eclipse.draw2d.text.BlockFlow, Integer> orientation_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<BlockFlow, Orientation, org.eclipse.draw2d.text.BlockFlow, Integer>(
		new BlockFlow_orientation()
	);
		
}
