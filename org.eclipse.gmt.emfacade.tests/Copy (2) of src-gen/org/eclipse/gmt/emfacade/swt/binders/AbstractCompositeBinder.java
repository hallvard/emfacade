package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.AbstractComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public abstract class AbstractCompositeBinder <Model extends AbstractComposite, View extends Composite>
	extends ControlBinder<Model, View> {
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getAbstractComposite_Controls()) {
			if (controls_Association.updateView(eObject.getControls(), object, feature, Control.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}
	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == SwtPackage.eINSTANCE.getAbstractComposite_Controls()) {
			if (controls_Association.updateView(eObject.getControls(), object, notification, Control.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getAbstractComposite_Controls()) {
			controls_Association.disposeView(
			eObject.getControls(), object, feature, (org.eclipse.gmt.emfacade.swt.Control) child, (Control) childObject
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<AbstractComposite, org.eclipse.gmt.emfacade.swt.Control, Composite, Control> controls_Association = new org.eclipse.gmt.emfacade.builder.strategies.ConstructorDisposeStrategyN.Impl<AbstractComposite, org.eclipse.gmt.emfacade.swt.Control, Composite, Control>(
		new Composite_controls()
	);
		
}
