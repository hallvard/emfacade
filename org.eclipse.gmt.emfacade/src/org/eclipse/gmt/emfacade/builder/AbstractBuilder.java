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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

public abstract class AbstractBuilder implements IBuilder, IBinderContext {

	private Object root = null;

	public <T> T getRootObject(Class<T> c) {
		return adapt(root, c);
	}

	public Object buildView(EObject control, Object context) {
		root = context;
		Object view = updateView(control, (Class<?>) null);
		fireObjectHandled(IBuilderListener.BUILD, control, context);
		return view;
	}
	
	private URIConverter uriConverter;

	public URIConverter getUriConverter() {
		if (uriConverter == null) {
			uriConverter = new ExtensibleURIConverterImpl();
		}
		return uriConverter;
	}

	public void buildView(Resource res, Object context) {
		for (EObject eObject: res.getContents()) {
			buildView(eObject, context);
		}
	}

	//

	private List<Object> disposables = new ArrayList<Object>();

	public void registerDisposable(Object disposable) {
		disposables.add(disposable);
	}

	public <T> T convert(Object modelValue, Class<T> clazz, IConverterContext context) throws Exception {
		if (clazz.isInstance(modelValue)) {
			return (T) modelValue;
		} else if (modelValue instanceof Enumerator) {
			Enumerator enumValue = (Enumerator) modelValue;
			if (Integer.class.equals(clazz)) {
				return (T) Integer.valueOf(enumValue.getValue());
			} else if (String.class.equals(clazz)) {
				return (T) enumValue.getLiteral();
			}
		}
		return null;
	}

	//

	public void dispose() {
		for (Object disposable: disposables) {
			disposeView(disposable);
		}
		for (EObject eObject: eObject2ObjectMap.keySet()) {
			disposeView(eObject);
		}
		eObject2ObjectMap.clear();
		object2EObjectMap.clear();
	}

	static void disposeView(Object disposable) {
		boolean dispose = true;
		Class<? extends Object> clazz = disposable.getClass();
		try {
			dispose = clazz.getMethod("isDisposed").invoke(disposable) != Boolean.TRUE;
		} catch (Exception e) {
		}
		if (dispose) {
			try {
				clazz.getMethod("dispose").invoke(disposable);
			} catch (Exception e) {
			}
		}
	}

	public static String casify(String s, Boolean cas) {
		if (s.length() > 0 && cas != null) {
			char first = s.charAt(0);
			s = (cas.booleanValue() ? Character.toUpperCase(first) : Character.toLowerCase(first)) + s.substring(1);
		}
		return s;
	}

	//

	private Map<EObject, Object> eObject2ObjectMap = new HashMap<EObject, Object>();
	private Map<Object, EObject> object2EObjectMap = new HashMap<Object, EObject>();

	public <T> T getObject(EObject eObject, Class<T> c, boolean update) {
		return getObject(eObject, c, update, false);
	}

	public EObject getEObject(Object object) {
		return object2EObjectMap.get(object);
	}

	public void putObject(EObject eObject, Object object) {
		eObject2ObjectMap.put(eObject, object);
		if (object != null) {
			object2EObjectMap.put(object, eObject);
		}
	}

	protected <T> T getObject(EObject eObject, Class<T> c, boolean update, boolean searchContainers) {
		EObject eO = eObject;
		while ((eO == eObject || searchContainers) && eO != null) {
			Object o = eObject2ObjectMap.get(eO);
			if (o != null && c != null && (! c.isInstance(o))) {
				// use eO to make sure we adapt using appropriate IBinder
				o = adapt(eO, o, c);
			}
			if (o != null && (c == null || c.isInstance(o))) {
				return (T) o;
			}
			eO = eO.eContainer();
		}
		return (update && eObject != null ? updateView(eObject, c) : null);
	}

	private List<IBuilderListener> builderListeners = new ArrayList<IBuilderListener>();

	public void addBuilderListener(IBuilderListener listener) {
		builderListeners.add(listener);
	}
	public void removeBuilderListener(IBuilderListener listener) {
		builderListeners.remove(listener);
	}

	public void fireObjectHandled(int id, EObject eObject, Object object) {
		for (IBuilderListener listener : builderListeners) {
			listener.objectHandled(id, eObject, object);
		}
	}

	public <T> T updateView(EObject eObject, Class<T> c) {
		Object object = eObject2ObjectMap.get(eObject);
		IBinder binder = getBinder(eObject, true);
		Object newObject = binder.updateView(eObject, object, this);
		if (newObject != null && (c == null || c.isInstance(newObject))) {
			eObject2ObjectMap.put(eObject, newObject);
			fireObjectHandled(IBuilderListener.UPDATE, eObject, object);
			return (T) newObject;
		}
		return null;
	}

	public boolean updateView(EObject eObject, EStructuralFeature feature) {
		Object object = eObject2ObjectMap.get(eObject);
		IBinder binder = getBinder(eObject, true);
		binder.updateView(eObject, object, feature, this);
		return true;
	}

	public void disposeView(EObject eObject) {
		validEObjects.remove(eObject);
		Object object = eObject2ObjectMap.get(eObject);
		if (object != null) {
			// first, disattach from parent
			EObject parent = eObject.eContainer();
			Object parentObject = eObject2ObjectMap.get(parent);
			if (parent != null && parentObject != null) {
				IBinder parentBinder = getBinder(parent, false);
				if (parentBinder != null) {
					parentBinder.disposeView(parent, parentObject, eObject, object, eObject.eContainingFeature(), this);
				}
			}
			// then, dispose the object itself
			IBinder binder = getBinder(eObject, false);
			if (binder != null) {
				binder.disposeView(eObject, object, this);
				fireObjectHandled(IBuilderListener.DISPOSE, eObject, object);
			}
		}
	}
	
	private Set<EObject> validEObjects = new HashSet<EObject>();
	
	public boolean markValid(EObject eObject) {
		boolean result = validEObjects.contains(eObject);
		validEObjects.add(eObject);
		return result;
	}

	public boolean isValid(EObject eObject) {
		return eObject2ObjectMap.containsKey(eObject) && validEObjects.contains(eObject);
	}

	public void invalidateView(EObject eObject, EClass eClass) {
		if (! isValid(eObject)) {
			return;
		}
		disposeView(eObject);
		EReference containmentFeature = eObject.eContainmentFeature();
		eObject = eObject.eContainer();
		while (eObject != null && eClass != null && (! eClass.isInstance(eObject))) {
			containmentFeature = eObject.eContainmentFeature();
			eObject = eObject.eContainer();
		}
		if (eObject != null) {
			updateView(eObject, containmentFeature);
		}
	}

	private AdapterFactory binderFactory;
	
	protected AbstractBuilder(AdapterFactory binderFactory) {
		this.binderFactory = binderFactory;
	}
	
	protected IBinder<?, ?> getBinder(EObject eObject, boolean throwException) {
		IBinder<?, ?> binder = (IBinder<?, ?>) binderFactory.adapt(eObject, IBinder.class);
		if (binder == null && throwException) {
			throw new RuntimeException("Couldn't get IBinder for eClass " + eObject.eClass().getName());
		}
		return binder;
	}

	// support for IBinderContext

	public <T> T adapt(EObject eObject, Object value, Class<T> c) {
		if (eObject == null) {
			return adapt(value, c);
		}
		IBinder<?, ?> binder = getBinder(eObject, true);
		Object o = binder.adapt(value, c);
		if (! c.isInstance(o)) {
			o = adapt(value, c);
		}
		return (T)(c.isInstance(o) ? o : null);
	}

	public <T> T adapt(Object value, Class<T> c) {
		if (value == null) {
			if (URIConverter.class.equals(c)) {
				return (T) getUriConverter();
			}
			return getRootObject(c);
		} else if (c.isInstance(value)) {
			return (T)value;
		} else if (value instanceof Collection && c.isArray()) {
			Collection<?> collection = (Collection<?>) value;
			Class<?> elementType = c.getComponentType();
			Object array = Array.newInstance(elementType, collection.size());
			int i = 0;
			for (Iterator<?> it = collection.iterator(); it.hasNext();) {
				Object o = it.next();
				Object o2 = adapt(o, elementType);
				Array.set(array, i++, o2);
			}
			return (T) array;
		}
		return null;
	}

	// from Adapter
	
	public void notifyChanged(Notification notification) {
		if (notification.getNotifier() instanceof EObject) {
			switch (notification.getEventType()) {
			case Notification.REMOVING_ADAPTER:
			case Notification.RESOLVE:
				break;
			default: {
				EObject eObject = (EObject) notification.getNotifier();
				Object object = getObject(eObject, null, false);
				IBinder binder = getBinder(eObject, false);
				if (binder != null) {
					binder.updateView(eObject, object, notification, this);
				}
			}
			}
		}
	}
}
