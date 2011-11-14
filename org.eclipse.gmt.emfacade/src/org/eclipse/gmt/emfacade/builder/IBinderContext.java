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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IBinderContext extends IConverterContext {

	public void notifyChanged(Notification notification);

	public <T> T adapt(Object value, Class<T> c);

	public <T> T updateView(EObject eObject, Class<T> c);
	public boolean updateView(EObject eObject, EStructuralFeature feature);
	public void disposeView(EObject eObject);

	public boolean markValid(EObject eObject);
	public boolean isValid(EObject eObject);
	public void invalidateView(EObject eObject, EClass eClass);
	
	public <T> T getRootObject(Class<T> c);
	public <T> T getObject(EObject eObject, Class<T> c, boolean update);
	public void putObject(EObject eObject, Object object);

	public EObject getEObject(Object object);
	
	public void fireObjectHandled(int id, EObject eObject, Object object);
}
