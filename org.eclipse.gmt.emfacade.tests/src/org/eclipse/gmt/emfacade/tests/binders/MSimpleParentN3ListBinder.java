package org.eclipse.gmt.emfacade.tests.binders;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.ListStrategyN;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN3List;

public class MSimpleParentN3ListBinder extends AbstractBinder<MSimpleParentN3List, org.eclipse.gmt.emfacade.tests.views.SimpleParentN3List> {

	@Override
	protected org.eclipse.gmt.emfacade.tests.views.SimpleParentN3List createView(MSimpleParentN3List simpleParent, IBinderContext context) {
		return new SimpleParentN3List();
	}

	@Override
	public void updateView(MSimpleParentN3List eObject, SimpleParentN3List object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParentN3List_Children()) {
			if (! child_AssociationImpl.updateView(eObject.getChildren(), object, feature, SimpleBean.class, context)) {
				super.updateView(eObject, object, feature, context);
			}
		}
	}

	@Override
	public void updateView(MSimpleParentN3List eObject, SimpleParentN3List object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == FacademodelPackage.eINSTANCE.getMSimpleParentN3List_Children()) {
			if (! child_AssociationImpl.updateView(eObject.getChildren(), object, notification, SimpleBean.class, context)) {
				super.updateView(eObject, object, notification, context);
			}
		}
	}

	private ListStrategyN.Impl<MSimpleParentN3List, MSimpleBean, SimpleParentN3List, SimpleBean> child_AssociationImpl =
		new ListStrategyN.Impl<MSimpleParentN3List, MSimpleBean, SimpleParentN3List, SimpleBean>(
			new SimpleParentN3List_child()
	);
}
