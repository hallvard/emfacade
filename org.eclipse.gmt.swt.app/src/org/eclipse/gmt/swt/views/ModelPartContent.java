/*******************************************************************************
 * Copyright (c) 2008 Hallvard Traetteberg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hallvard Traetteberg - initial API and implementation
 ******************************************************************************/
package org.eclipse.gmt.swt.views;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class ModelPartContent implements ModelContext.Listener {

	public static interface Factory {
		
		ModelPartContent createModelPartContent(String uri);

		public class Registry {
			
			private static Map<String, Factory> factories = new HashMap<String, Factory>();

			public static void registerFactory(String uri, Factory factory) {
				factories.put(uri, factory);
			}
			
			private static Factory getFactoryFor(EObject eObject) {
				String uri = eObject.eClass().getEPackage().getNsURI();
				return factories.get(uri);
			}
			
			public static boolean hasFactoryFor(EObject eObject) {
				return getFactoryFor(eObject) != null;
			}
			
			public static ModelPartContent createFor(EObject eObject) {
				Factory factory = getFactoryFor(eObject);
				String uri = eObject.eClass().getEPackage().getNsURI();
				return (factory != null ? factory.createModelPartContent(uri) : null);
			}
		}
	}
	
	public static ModelPartContent createModelPartContent(Iterable<EObject> eObjects) {
		for (EObject eObject : eObjects) {
			ModelPartContent modelContent = ModelPartContent.Factory.Registry.createFor(eObject);
			if (modelContent != null) {
				return modelContent;
			}
		}
		return null;
	}

	public EObject getModel(Iterable<EObject> eObjects) {
		for (EObject eObject : eObjects) {
			if (isPartModel(eObject)) {
				return eObject;
			}
		}
		return null;
	}

	//

	private Composite modelComposite;

	private ModelContext modelContext;

	public ModelPartContent(Composite modelComposite) {
		super();
		modelComposite.setLayout(new FillLayout());
		this.modelComposite = modelComposite;
	}

	public Composite getModelComposite() {
		return modelComposite;
	}

	public void setModelContext(ModelContext modelContext) {
		if (this.modelContext != null) {
			this.modelContext.removeModelContextListener(this);
		}
		this.modelContext = modelContext;
		if (this.modelContext != null) {
			this.modelContext.addModelContextListener(this);
		}
		updatePartContent();
	}

	private void updatePartContent() {
		EObject model = (modelContext != null ? modelContext.getModel(this) : null);
		if (model != null) {
			updateViewer(model, modelComposite);
		}
	}

	public void contextChanged(ModelContext context) {
		updatePartContent();
	}
	
	private void updateViewer(EObject model, Object parent) {
		disposeControls();
		if (model != null) {
			updateViewer(model);
		}
	}

	protected void updateViewer(EObject model) {
		if (modelComposite != null) {
			setViewerContent(model);
			modelComposite.layout();
		}
	}

	protected abstract boolean isPartModel(EObject eObject);
	protected abstract void setViewerContent(EObject model);

	public void dispose() {
		setModelContext(null);
		disposeControls();
	}

	protected void disposeControls() {
		if (modelComposite != null && (! modelComposite.isDisposed())) {
			Control[] children = modelComposite.getChildren();
			for (int i = 0; i < children.length; i++) {
				if (! children[i].isDisposed()) {
					children[i].dispose();
				}
			}
		}
	}
}