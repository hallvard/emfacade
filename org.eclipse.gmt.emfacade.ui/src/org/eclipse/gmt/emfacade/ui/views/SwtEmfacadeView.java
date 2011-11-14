package org.eclipse.gmt.emfacade.ui.views;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.gmt.emfacade.swt.binders.SwtBinderFactory;
import org.eclipse.gmt.swt.views.AbstractModelView;
import org.eclipse.gmt.swt.views.ActiveEditorPartModelContext;
import org.eclipse.gmt.swt.views.ModelContext;
import org.eclipse.gmt.swt.views.ModelPartContent;
import org.eclipse.swt.widgets.Composite;

public class SwtEmfacadeView extends AbstractModelView {

	@Override
	protected ModelPartContent createModelPartContent(Composite composite) {

		return new EmfacadePartContent(composite) {
			
			@Override
			protected AdapterFactory createBinderFactory() {
				return new SwtBinderFactory();
			}
		};
	}

	private ModelContext modelContext = null;

	@Override
	protected ModelContext getModelContext() {
		if (modelContext == null) {
			modelContext = new ActiveEditorPartModelContext(this);
		}
		return modelContext;
	}
}
