package org.eclipse.gmt.emfacade.builder.strategies;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.IBinderContext;

public class AddRemoveStrategyN extends StrategyN {

	public interface Association<V, VE> extends Add<V, VE>, Remove<V, VE> {
	}

	public static class Impl<M extends EObject, ME, V, VE> extends Strategy.Impl<M, ME, V, VE> implements StrategyImpl<M, ME, V, VE> {

		private Association<V, VE> association;
		
		public Impl(Association<V, VE> association) {
			this.association = association;
		}

		public boolean updateView(EList<ME> children, V object, Notification notification, Class<VE> c, IBinderContext context) {
			int pos = notification.getPosition();
			Collection<ME> removed = null;
			switch (notification.getEventType()) {
			case Notification.SET: {
				removed = (Collection<ME>) Arrays.asList(notification.getOldValue());
				break;
			}
			case Notification.ADD: {
				break;
			}
			case Notification.ADD_MANY: {
				break;
			}
			case Notification.REMOVE: {
				removed = (Collection<ME>) Arrays.asList(notification.getOldValue());
				break;
			}
			case Notification.REMOVE_MANY: {
				removed = (Collection<ME>) notification.getOldValue();
				break;
			}
			}
			updateView(children, object, c, context, pos, removed);
			return true;
		}

		private void updateView(EList<ME> children, V object, Class<VE> c, IBinderContext context, int pos, Collection<ME> removed) {
			if (removed != null) {
				// first, remove views for removed elements
				for (ME element : removed) {
					VE elementView = model2View(element, c, false, context);
					if (elementView != null) {
						association.remove(object, elementView);
					}
				}
			}
			pos = Math.max(pos, 0);
			// second, remove other elements to preserve ordering after (re)adding
			for (int i = pos; i < children.size(); i++) {
				VE elementView = model2View(children.get(i), c, false, context);
				if (elementView != null) {
					association.remove(object, elementView);
				}
			}
			// second, add elements
			for (int i = pos; i < children.size(); i++) {
				VE elementView = model2View(children.get(i), c, true, context);
				if (elementView != null) {
					association.add(object, elementView);
				}
			}
		}

		public boolean updateView(EList<ME> children, V object, EStructuralFeature feature, Class<VE> c, IBinderContext context) {
			updateView(children, object, c, context, -1, null);
			return true;
		}

		public void disposeView(EList<ME> children, V object, EStructuralFeature feature, ME child, VE childObject, IBinderContext context) {
			association.remove(object, childObject);
		}
	}
}
