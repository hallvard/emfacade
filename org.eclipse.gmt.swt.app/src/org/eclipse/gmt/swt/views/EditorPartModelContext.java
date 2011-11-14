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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;

public class EditorPartModelContext extends AbstractModelContext {

	private IWorkbenchPart owner;
	protected IEditingDomainProvider editingDomainProvider;

	public EditorPartModelContext(IWorkbenchPart part) {
		super();
		owner = part;
		if (part instanceof IEditingDomainProvider) {
			setEditingDomainProvider((IEditingDomainProvider)part);
		}
	}

	public void dispose() {
		super.dispose();
		owner = null;
	}

	public IWorkbenchPart getOwner() {
		return owner;
	}

	private Display getDisplay() {
		return getOwner().getSite().getShell().getDisplay();
	}

//	protected void fireContextChanged() {
//		getDisplay().asyncExec(this);
//	}

	private Adapter resourceSetAdapter = new AdapterImpl() {
		public void notifyChanged(Notification notification) {
			if (notification.getFeatureID(ResourceSet.class) == ResourceSet.RESOURCE_SET__RESOURCES) {
				fireContextChanged();
			}
		}
	};

	protected void setEditingDomainProvider(IEditingDomainProvider editingDomainProvider) {
		if (editingDomainProvider != this.editingDomainProvider) {
			if (this.editingDomainProvider != null) {
				this.editingDomainProvider.getEditingDomain().getResourceSet().eAdapters().remove(resourceSetAdapter);
			}
			this.editingDomainProvider = editingDomainProvider;
			if (this.editingDomainProvider != null) {
				this.editingDomainProvider.getEditingDomain().getResourceSet().eAdapters().add(resourceSetAdapter);
			}
			fireContextChanged();
		}
	}
	
	public EObject getModel(ModelPartContent partContent) {
		if (editingDomainProvider != null) {
			EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
			if (editingDomain != null) {
				for (Resource res: editingDomain.getResourceSet().getResources()) {
					EObject eObject = partContent.getModel(res.getContents());
					if (eObject != null) {
						return eObject;
					}
				}
			}
		}
		return null;
	}
}
