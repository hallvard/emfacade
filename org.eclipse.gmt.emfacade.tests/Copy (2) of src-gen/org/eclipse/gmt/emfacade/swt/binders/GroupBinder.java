package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.Group;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class GroupBinder <Model extends Group, View extends org.eclipse.swt.widgets.Group>
	extends CompositeBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Composite _parent = this.<org.eclipse.swt.widgets.Composite>getParent(eObject, org.eclipse.swt.widgets.Composite.class);
		int _style = eObject.getStyle();
		org.eclipse.swt.widgets.Group _group = new org.eclipse.swt.widgets.Group(_parent, _style);
		return (View) _group;
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getGroup_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getGroup_Text()) {
			text_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Group, String, org.eclipse.swt.widgets.Group, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Group, String, org.eclipse.swt.widgets.Group, String>(
		new Group_text()
	);
		
}
