package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.PasswordText;
import org.eclipse.swt.widgets.Text;

public  class PasswordTextBinder <Model extends PasswordText, View extends Text>
	extends TextBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.swt.widgets.Composite _parent = this.<org.eclipse.swt.widgets.Composite>getParent(eObject, org.eclipse.swt.widgets.Composite.class);
		int _style = eObject.getStyle();
		int _operator_bitor = org.eclipse.gmt.emfacade.lib.IntegerExtensions.operator_bitor(((Integer)_style), ((Integer)org.eclipse.swt.SWT.PASSWORD));
		org.eclipse.swt.widgets.Text _text = new org.eclipse.swt.widgets.Text(_parent, _operator_bitor);
		return (View) _text;
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
