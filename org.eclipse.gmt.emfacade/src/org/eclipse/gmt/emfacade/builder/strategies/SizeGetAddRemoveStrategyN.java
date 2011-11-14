package org.eclipse.gmt.emfacade.builder.strategies;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.IBinderContext;

public class SizeGetAddRemoveStrategyN extends StrategyN {

	public interface Association<V, VE> extends Count<V, VE>, GetAt<V, VE>, AddAt<V, VE>, Remove<V, VE> {
	}

	public static class Impl<M extends EObject, ME, V, VE> extends Strategy.Impl<M, ME, V, VE> implements StrategyImpl<M, ME, V, VE> {

		private Association<V, VE> association;

		public Impl(Association<V, VE> association) {
			this.association = association;
		}

		public boolean updateView(EList<ME> children, V object, Notification notification, Class<VE> c, IBinderContext context) {
			int pos = notification.getPosition();
			switch (notification.getEventType()) {
			case Notification.ADD: {
				// used for add case, newValue is the added element
				ME child = children.get(pos);
				VE childView = model2View(child, c, true, context);
				association.add(object, pos, childView);
				break;
			}
			case Notification.ADD_MANY: {
				// used for addAll case, newValue is the added Collection
				for (ME child : (Collection<ME>) notification.getNewValue()) {
					VE childView = model2View(child, c, true, context);
					association.add(object, pos, childView);
					pos++;
				}
				break;
			}
			case Notification.REMOVE: {
				// used for remove case, oldValue is removed object is the removed index
				association.remove(object, (VE) notification.getOldValue());
				break;
			}
			case Notification.REMOVE_MANY: {
				// used for removeAll and clear case, newValue is an array of the removed indices, or null for the clear case
				VE[] objects = (VE[]) notification.getOldValue();
				int[] indices = (int[]) notification.getNewValue();
				if (indices != null) {
					for (int i = 0; i < indices.length; i++) {
						association.remove(object, objects[indices[i]]);
					}
				} else {
					return false;
				}
				break;
			}
			default: 
				return false;
			}
			return true;
		}

		public boolean updateView(EList<ME> children, V object, EStructuralFeature feature, Class<VE> c, IBinderContext context) {
			outer: for (int i1 = 0; i1 < children.size(); i1++) {
				ME child = children.get(i1);
				VE childView = model2View(child, c, true, context);
				for (int i2 = i1; i2 < association.getCount(object); i2++) {
					if (! unequal(childView, association.get(object, i2))) {
						while (i2 > i1) {
							i2--;
							association.remove(object, association.get(object, i2));
						}
						continue outer;
					}
				}
				association.add(object, i1, childView);
			}
			while (association.getCount(object) > children.size()) {
				association.remove(object, association.get(object, association.getCount(object) - 1));
			}
			return true;
		}

		public void disposeView(EList<ME> children, V object, EStructuralFeature feature, ME child, VE childObject, IBinderContext context) {
			int count = association.getCount(object);
			for (int i = 0; i < count; i++) {
				VE viewValue = association.get(object, i);
				if (! unequal(childObject, viewValue)) {
					association.remove(object, viewValue);
					break;
				}
			}
		}
	}
}
