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
package org.eclipse.gmt.swt.app;

import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.gmt.swt.views.EditorPartModelContext;
import org.eclipse.gmt.swt.views.ModelPartContent;
import org.eclipse.gmt.swt.views.PartStyle;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;

public abstract class ModelApp extends EcoreEditor {

	protected ModelPartContent modelContent;
	
	private PartStyle partStyle = new PartStyle.SashStyle();
	
	protected Composite createPageContainer(Composite parent) {
		partStyle.createPageContainer(parent);
		partStyle.addContentComposite(this);
		return partStyle.getTreeParent();
	}

	public void createPages() {
		super.createPages();
//		Activator.getDefault().registerEventHandlerExtensions();
		modelContent = createModelPartContent();
		modelContent.setModelContext(new EditorPartModelContext(this));
	}

	protected abstract ModelPartContent createModelPartContent();

	public Object getAdapter(Class key) {
		if (key.equals(EditingDomain.class)) {
			return getEditingDomain();
		} else if (key.equals(URIConverter.class)) {
			return getEditingDomain().getResourceSet().getURIConverter();
		} else if (key.equals(Composite.class)) {
			return getContainer();
		} else if (IEditorInput.class.isAssignableFrom(key) && key.isInstance(getEditorInput())) {
			return getEditorInput();
		}
		return super.getAdapter(key);
	}

	protected void createContextMenuForGen(StructuredViewer viewer) {
		addDragDropSupport(viewer, getEditingDomain());
		try {
			super.createContextMenuForGen(viewer);
		} catch (SWTError swtError) {
			// this is expected, since we have already added our own, hacked drop support
			if (swtError.code != DND.ERROR_CANNOT_INIT_DROP) {
				throw swtError;
			}
		}
	}

	public static void addDragDropSupport(StructuredViewer viewer, EditingDomain editingDomain) {
		Transfer[] transferTypes = new Transfer[]{
				TextTransfer.getInstance(),
				LocalTransfer.getInstance()
		};
		viewer.addDropSupport(DND.DROP_COPY | DND.DROP_MOVE, transferTypes, new EObjectUriDropAdapter(editingDomain, viewer));
	}
}
