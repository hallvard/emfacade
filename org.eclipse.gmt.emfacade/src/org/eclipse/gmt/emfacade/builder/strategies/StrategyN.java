package org.eclipse.gmt.emfacade.builder.strategies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.IBinderContext;

public class StrategyN extends Strategy {

	public interface Count<V, VE> {
		int getCount(V t);
	}
	
	public interface GetAt<V, VE> {
		VE get(V t, int i);
	}
	
	public interface SetAt<V, VE> {
		void set(V t, int i, VE e);
	}
	
	public interface Add<V, VE> {
		void add(V t, VE e);
	}
	public interface AddAt<V, VE> {
		void add(V t, int i, VE e);
	}
	
	public interface Remove<V, VE> {
		void remove(V t, VE e);
	}
	public interface RemoveAt<V, VE> {
		void remove(V t, int i);
	}

	//

	public interface StrategyImpl<M extends EObject, ME, V, VE> {

		public boolean updateView(EList<ME> children, V object, Notification notification, Class<VE> c, IBinderContext context);
		public boolean updateView(EList<ME> children, V object, EStructuralFeature feature, Class<VE> c, IBinderContext context);

		public void disposeView(EList<ME> children, V object, EStructuralFeature feature, ME child, VE childObject, IBinderContext context);
	}
}
