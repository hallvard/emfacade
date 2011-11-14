package org.eclipse.gmt.emfacade.ui.views;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.emfacade.builder.AbstractBuilder;
import org.eclipse.gmt.emfacade.builder.IBinder;
import org.eclipse.gmt.emfacade.builder.IBuilder;
import org.eclipse.gmt.swt.views.ModelPartContent;
import org.eclipse.swt.widgets.Composite;

public abstract class EmfacadePartContent extends ModelPartContent {

	public EmfacadePartContent(Composite modelComposite) {
		super(modelComposite);
	}

	private AdapterFactory binderFactory;
	
	public AdapterFactory getBinderFactory() {
		if (binderFactory == null) {
			binderFactory = createBinderFactory();
		}
		return binderFactory;
	}
	
	protected abstract AdapterFactory createBinderFactory();

	public void setBinderFactory(AdapterFactory binderFactory) {
		if (binderFactory != this.binderFactory) {
			this.binderFactory = binderFactory;
			setBuilder(null);
		}
	}

	private IBuilder builder = null;

	protected void setBuilder(IBuilder builder) {
		if (this.builder != null) {
			this.builder.dispose();
		}
		this.builder = builder;
	}
	
	public void setContents(EObject model) {
		builder.dispose();
		builder.buildView(model, getModelComposite());
	}

	@Override
	protected void setViewerContent(EObject model) {
		if (builder == null) {
			setBuilder(new AbstractBuilder(getBinderFactory()) {
			});
		}
		builder.buildView(model, getModelComposite());
	}
	
	@Override
	protected boolean isPartModel(EObject eObject) {
		return getBinderFactory() != null && getBinderFactory().adapt(eObject, IBinder.class) != null;
	}
}
