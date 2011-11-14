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
package org.eclipse.gmt.emfacade.builder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.util.Util;

public abstract class AbstractBinder<Model extends EObject, View> implements IBinder<Model, View>, IBinderHelper {

	protected abstract View createView(Model eObject, IBinderHelper _binderHelper);
	protected abstract void configureView(Model eObject, View object, IBinderHelper _binderHelper);
	protected abstract void disposeView(Model eObject, View object, IBinderHelper _binderHelper);
	protected abstract boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper);
	protected abstract boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper);

	private IBinderContext context = null;

	// Adapter methods
	
	public boolean isAdapterForType(Object type) {
		return IBinder.class.equals(type);
	}

	public Notifier getTarget() {
		return null;
	}

	public void setTarget(Notifier newTarget) {
	}

	public void notifyChanged(Notification notification) {
		context.notifyChanged(notification);
	}

	// IBinder methods

	public final View updateView(Model eObject, View object, IBinderContext context) {
		this.context = context;
		try {
			boolean configure = false;
			if (object == null) {
				configure = true;
				object = createView(eObject, this);
				context.putObject(eObject, object);
				registerAdapter(eObject);
				context.fireObjectHandled(IBuilderListener.BUILD, eObject, object);
			} else {
				context.fireObjectHandled(IBuilderListener.UPDATE, eObject, object);
			}
			if (object != null) {
				updateViewFeatures(eObject, object, context);
			}
			context.markValid(eObject);
			if (configure) {
				configureView(eObject, object, context);
			}
		} finally {
			context = null;
		}
		return object;
	}

	protected void registerAdapter(Model eObject) {
		if (! eObject.eAdapters().contains(this)) {
			eObject.eAdapters().add(this);
		}
	}
	protected void unregisterAdapter(Model eObject) {
		eObject.eAdapters().remove(this);
	}

	public final void configureView(Model eObject, View object, IBinderContext context) {
		configureView(eObject, object, this);
	}
	
	protected void updateViewFeatures(Model eObject, View object, IBinderContext context) {
		for (EAttribute attr : eObject.eClass().getEAllAttributes()) {
			updateView(eObject, object, attr, context);
		}
		for (EReference ref : eObject.eClass().getEAllReferences()) {
			if (ref.isContainment()) {
				updateView(eObject, object, ref, context);
			}
		}
		for (EReference ref : eObject.eClass().getEAllReferences()) {
			if (! ref.isContainment()) {
				updateView(eObject, object, ref, context);
			}
		}
	}

	public final void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (! updateView(eObject, object, feature, this));
	}
	
	public final void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (! updateView(eObject, object, notification, this)) {
			if (notification.getNotifier() == eObject && notification.getFeature() instanceof EStructuralFeature) {
				updateView(eObject, object, (EStructuralFeature) notification.getFeature(), context);
			}
		}
	}

	public final void disposeView(Model eObject, View object, IBinderContext context) {
		disposeView(eObject, object, this);
		context.putObject(eObject, null);
		unregisterAdapter(eObject);
		for (EObject child: eObject.eContents()) {
			context.disposeView(child);
		}
		if (object != null) {
			AbstractBuilder.disposeView(object);
		}
	}

	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature eContainingFeature, IBinderContext context) {
	}

	public <T> T adapt(Object value, Class<T> c) {
		return (c.isInstance(value) ? (T) value : null);
	}

	protected <T> T getObject(EObject eObject, Class<T> c, boolean searchContainers) {
		if (context == null) {
			return null;
		} else if (eObject == null) {
			return context.getRootObject(c);
		} else {
			T object = context.getObject(eObject, c, false);
			if (object == null && searchContainers) {
				object = getObject(eObject.eContainer(), c, searchContainers);
			}
			return object;
		}
	}
	
	protected <T extends EObject> T getEObject(Object object, Class<T> c, boolean searchContainers) {
		if (context == null) {
			return null;
		} else {
			EObject eObject = context.getEObject(object);
			if (c.isInstance(eObject)) {
				return (T) eObject;
			}
			return (searchContainers ? Util.getContainerOfType(eObject.eContainer(), c) : null);
		}
	}
	
	// IBinderHelper

	public IBinderContext getBinderContext() {
		return context;
	}
	
	public <T> T the(EObject eObject, Class<T> c) {
		return getObject(eObject, c, false);
	}
	public <T> T theParent(EObject eObject, Class<T> c) {
		return getObject(eObject.eContainer(), c, false);
	}
	
	public <T> T a(EObject eObject, Class<T> c) {
		return getObject(eObject, c, true);
	}
	public <T> T aParent(EObject eObject, Class<T> c) {
		return getObject(eObject.eContainer(), c, true);
	}
}
