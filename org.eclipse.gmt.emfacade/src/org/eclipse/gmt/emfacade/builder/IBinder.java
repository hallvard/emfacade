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

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IBinder<Model extends EObject, View> extends Adapter, Map.Entry<EObject, View> {
	
	public View updateView(Model eObject, View object, IBinderContext context);
	public void configureView(Model eObject, View object, IBinderContext context);
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context);
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context);

	public void disposeView(Model eObject, View object, IBinderContext context);
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature eContainingFeature, IBinderContext context);

	public <T> T adapt(Object value, Class<T> c);
}
