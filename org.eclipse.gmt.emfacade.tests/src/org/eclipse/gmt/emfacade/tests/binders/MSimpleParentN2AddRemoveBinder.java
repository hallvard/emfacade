package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.AddRemoveStrategyN;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN2AddRemove;


public class MSimpleParentN2AddRemoveBinder extends AbstractBinder<MSimpleParentN2AddRemove, org.eclipse.gmt.emfacade.tests.views.SimpleParentN2AddRemove> {

	@Override
	protected org.eclipse.gmt.emfacade.tests.views.SimpleParentN2AddRemove createView(MSimpleParentN2AddRemove simpleParent, IBinderContext context) {
		return new org.eclipse.gmt.emfacade.tests.views.SimpleParentN2AddRemove();
	}
	
	@Override
	public void updateView(MSimpleParentN2AddRemove eObject, SimpleParentN2AddRemove object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParentN2AddRemove_Children()) {
			if (! child_Association.updateView(eObject.getChildren(), object, feature, SimpleBean.class, context)) {
				super.updateView(eObject, object, feature, context);
			}
		}
	}

	@Override
	public void updateView(MSimpleParentN2AddRemove eObject, SimpleParentN2AddRemove object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == FacademodelPackage.eINSTANCE.getMSimpleParentN2AddRemove_Children()) {
			if (! child_Association.updateView(eObject.getChildren(), object, notification, SimpleBean.class, context)) {
				super.updateView(eObject, object, notification, context);
			}
		}
	}
	
	private AddRemoveStrategyN.Impl<MSimpleParentN2AddRemove, MSimpleBean, SimpleParentN2AddRemove, SimpleBean> child_Association =
		new AddRemoveStrategyN.Impl<MSimpleParentN2AddRemove, MSimpleBean, SimpleParentN2AddRemove, SimpleBean>(
			new SimpleParentN2AddRemove_child()
	);
}
