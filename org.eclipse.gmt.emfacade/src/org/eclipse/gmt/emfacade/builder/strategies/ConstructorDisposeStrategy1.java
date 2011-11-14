package org.eclipse.gmt.emfacade.builder.strategies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.IBinderContext;

public class ConstructorDisposeStrategy1 extends Strategy1 {

	public interface Association<V, VE> {
	}

	public static class Impl<M extends EObject, ME extends EObject, V, VE> extends Strategy.Impl<M, ME, V, VE> implements StrategyImpl<M, ME, V, VE> {

		@SuppressWarnings("unused")
		private Association<V, VE> association;

		public Impl(Association<V, VE> association) {
			this.association = association;
		}

//		protected void createView(ME element, IBinderContext context) {
//			context.updateView(element, Object.class);
//		}
		
		public boolean updateView(M eObject, V object, EStructuralFeature feature, Class<VE> c, IBinderContext context) {
			ME modelValue = (ME) eObject.eGet(feature);
			VE modelValueView = model2View(modelValue, c, false, context);
			context.invalidateView(modelValue, modelValue.eClass());
//			context.disposeView(context.getEObject(modelValueView));
//			createView(modelValue, context);
			return true;
		}

		public void disposeView(V object, IBinderContext context) {
		}
	}
}
