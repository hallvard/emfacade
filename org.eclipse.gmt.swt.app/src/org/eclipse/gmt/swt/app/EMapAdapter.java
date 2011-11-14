package org.eclipse.gmt.swt.app;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

/**
 * An adapter that maintains itself as an adapter for the content of a specific
 * EMap feature.
 * 
 * It can be installed for an {@link EObject}.
 */
public class EMapAdapter extends EContentAdapter {

	private EStructuralFeature eMapFeature, keyFeature, valueFeature;

	public EMapAdapter(EReference eMapFeature) {
		this.eMapFeature = eMapFeature;
		EClass entryClass = eMapFeature.getEReferenceType();
		for (EStructuralFeature feature : entryClass
				.getEAllStructuralFeatures()) {
			if ("key".equals(feature.getName())) {
				keyFeature = feature;
			} else if ("value".equals(feature.getName())) {
				valueFeature = feature;
			}
		}
	}

	protected boolean isMapFeatureNotification(Notification notification) {
		if (eMapFeature == notification.getFeature()) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("rawtypes")
	private boolean isMapEntryNotification(Notification notification) {
		return notification.getNotifier() instanceof Map.Entry;
	}

	protected boolean isValueFeatureNotification(Notification notification) {
		return (isMapEntryNotification(notification) && notification
				.getFeature() == valueFeature);
	}

	protected boolean isKeyFeatureNotification(Notification notification) {
		return (isMapEntryNotification(notification) && notification
				.getFeature() == keyFeature);
	}

	/**
	 * Handles installation of the adapter by adding the adapter to the notifier
	 * itself and each of the directly contained objects (if allowed by
	 * addAdapter).
	 */
	@Override
	public void setTarget(Notifier target) {
		if (target instanceof EObject) {
			super.addAdapter(target);
			setTarget((EObject) target);
		}
	}

	/**
	 * Prevents attaching to wrong kind of notifier.
	 */
	@Override
	protected void addAdapter(Notifier notifier) {
		if (notifier instanceof EObject) {
			EObject eObject = (EObject) notifier;
			if (eObject.eContainingFeature() == eMapFeature) {
				super.addAdapter(notifier);
			}
		}
	}
}
