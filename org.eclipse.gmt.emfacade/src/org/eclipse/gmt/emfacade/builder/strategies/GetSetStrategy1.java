package org.eclipse.gmt.emfacade.builder.strategies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.IBinderContext;

public class GetSetStrategy1 extends Strategy1 {

	public interface Association<V, VE> extends Get<V, VE>, Set<V, VE> {
	}

	public static class Impl<M extends EObject, ME, V, VE> extends Strategy.Impl<M, ME, V, VE> implements StrategyImpl<M, ME, V, VE> {

		protected Association<V, VE> association;
		
		public Impl(Association<V, VE> association) {
			this.association = association;
		}

		public boolean updateView(M eObject, V object, EStructuralFeature feature, Class<VE> c, IBinderContext context) {
			ME modelValue = (ME) eObject.eGet(feature);
			VE modelValueView = model2View(modelValue, c, true, context);
			VE viewValue = association.get(object);
			if (unequal(modelValueView, viewValue)) {
				association.set(object, modelValueView);
			}
			return true;
		}

		public void disposeView(V object, IBinderContext context) {
			association.set(object, null);
		}
	}
}
