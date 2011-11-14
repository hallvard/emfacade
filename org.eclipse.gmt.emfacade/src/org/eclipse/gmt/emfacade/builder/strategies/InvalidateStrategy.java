package org.eclipse.gmt.emfacade.builder.strategies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.IBinderContext;

public class InvalidateStrategy extends Strategy1 {

	public interface Association<V, VE> {
	}

	public static class Impl<M extends EObject, ME, V, VE> extends Strategy.Impl<M, ME, V, VE> implements StrategyImpl<M, ME, V, VE> {

		@SuppressWarnings("unused")
		private Association<V, VE> association;
		
		public Impl(Association<V, VE> association) {
			this.association = association;
		}

		public boolean updateView(M eObject, V object, EStructuralFeature feature, Class<VE> c, IBinderContext context) {
			context.invalidateView(eObject, getInvalidateEClass());
			return true;
		}

		public void disposeView(V object, IBinderContext context) {
		}
	}
}
