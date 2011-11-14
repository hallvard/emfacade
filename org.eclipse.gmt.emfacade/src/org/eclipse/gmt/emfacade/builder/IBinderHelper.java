package org.eclipse.gmt.emfacade.builder;

import org.eclipse.emf.ecore.EObject;

public interface IBinderHelper {
	public IBinderContext getBinderContext();
	
	public <T> T the(EObject eObject, Class<T> c);
	public <T> T theParent(EObject eObject, Class<T> c);	
	public <T> T a(EObject eObject, Class<T> c);
	public <T> T aParent(EObject eObject, Class<T> c);
	public <T> T e(Object eObject, Class<T> c);
}
