package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN;
import org.eclipse.gmt.emfacade.builder.strategies.StrategyN;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelPackage;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN1SizeGetSetAddRemove;

public class MSimpleParentN1SizeGetSetAddRemoveBinder<Model extends MSimpleParentN1SizeGetSetAddRemove, View extends SimpleParentN1SizeGetSetAddRemove> extends AbstractBinder<Model, View> {

	@Override
	protected View createView(MSimpleParentN1SizeGetSetAddRemove simpleParent, IBinderContext context) {
		return (View) new SimpleParentN1SizeGetSetAddRemove();
	}

	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == FacademodelPackage.eINSTANCE.getMSimpleParentN1SizeGetSetAddRemove_Children()) {
			if (! child_AssociationImpl.updateView(eObject.getChildren(), object, feature, SimpleBean.class, context)) {
				super.updateView(eObject, object, feature, context);
			}
		}
	}

	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == FacademodelPackage.eINSTANCE.getMSimpleParentN1SizeGetSetAddRemove_Children()) {
			if (! child_AssociationImpl.updateView(eObject.getChildren(), object, notification, SimpleBean.class, context)) {
				super.updateView(eObject, object, notification, context);
			}
		}
	}

	private StrategyN.StrategyImpl<MSimpleParentN1SizeGetSetAddRemove, MSimpleBean, SimpleParentN1SizeGetSetAddRemove, SimpleBean> child_AssociationImpl =
		new SizeGetSetAddRemoveStrategyN.Impl<MSimpleParentN1SizeGetSetAddRemove, MSimpleBean, SimpleParentN1SizeGetSetAddRemove, SimpleBean>(
			new SimpleParentN1SizeGetSetAddRemove_child()
	);
}
