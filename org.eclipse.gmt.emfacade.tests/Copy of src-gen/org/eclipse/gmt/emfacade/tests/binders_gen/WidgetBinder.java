package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.Widget;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public abstract class WidgetBinder <Model extends Widget, View extends org.eclipse.swt.widgets.Widget>
	extends AbstractBinder<Model, View> {
	
	@Override
	public void disposeView(Model eObject, View object, IBinderContext context) {
		
		Object _xifexpression = null;
		boolean _isDisposed = object.isDisposed();
		boolean _operator_not = org.eclipse.xtext.xbase.lib.BooleanExtensions.operator_not(_isDisposed);
		if (_operator_not) {
		  object.dispose();
		}
		super.disposeView(eObject, object, context);
	}
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
		
}
