package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl;
import org.eclipse.gmt.emfacade.tests.views.SimpleComposite;
import org.eclipse.gmt.emfacade.tests.views.SimpleControl;

public class MSimpleControlBinder extends AbstractBinder<MSimpleControl, SimpleControl> {

	@Override
	protected SimpleControl createView(MSimpleControl eObject, IBinderContext context) {
		SimpleComposite parent = context.getObject(eObject.getParent(), SimpleComposite.class, false);
		return new SimpleControl(parent);
	}

	public void disposeView(MSimpleControl eObject, SimpleComposite object, IBinderContext context) {
		object.dispose();		
	}
}
