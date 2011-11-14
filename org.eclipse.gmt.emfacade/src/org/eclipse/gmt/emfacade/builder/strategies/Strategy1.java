package org.eclipse.gmt.emfacade.builder.strategies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.IBinderContext;

public class Strategy1 extends Strategy {

	public interface Get<V, VE> {
		VE get(V t);
	}
	
	public interface Set<V, VE> {
		void set(V t, VE e);
	}
	
	public interface StrategyImpl<M extends EObject, ME, V, VE> {

		public abstract boolean updateView(M eObject, V object, EStructuralFeature feature, Class<VE> c, IBinderContext context);

		public abstract void disposeView(V object, IBinderContext context);
	}
}
