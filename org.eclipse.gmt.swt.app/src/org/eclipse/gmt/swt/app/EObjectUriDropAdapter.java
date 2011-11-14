package org.eclipse.gmt.swt.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.gmt.swt.views.PaletteView;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;

public class EObjectUriDropAdapter extends EditingDomainViewerDropAdapter {
	
	public EObjectUriDropAdapter(EditingDomain domain, Viewer viewer) {
		super(domain, viewer);
	}

	private boolean isTransfer(Transfer transfer, DropTargetEvent event) {
		for (int i = 0; i < event.dataTypes.length; i++) {
			if (transfer.isSupportedType(event.dataTypes[i])) {
				return true;
			}
		}
		return false;
	}

	protected void helper(DropTargetEvent event) {
		if (isTransfer(TextTransfer.getInstance(), event)) {
			event.feedback = DND.FEEDBACK_SELECT | getAutoFeedback();
			originalOperation = DND.DROP_COPY;
			event.detail = DND.DROP_COPY;
		} else {
			super.helper(event);
		}
	}

	protected Collection<?> getDragSource(DropTargetEvent event) {
		if (isTransfer(TextTransfer.getInstance(), event)) {
			return null;
		}
		return super.getDragSource(event);
	}

	protected Collection<?> extractDragSource(Object object) {
		if (object instanceof String) {
			Collection<EObject> eObjects = new ArrayList<EObject>();
			ResourceSet resSet = new ResourceSetImpl();
			StringTokenizer tokens = new StringTokenizer((String)object);
			while (tokens.hasMoreTokens()) {
				String uri = tokens.nextToken();
				int pos = uri.indexOf(PaletteView.FRAGMENT_SEPARATOR);
				if (pos > 0) {
					Resource res = resSet.getResource(URI.createURI(uri.substring(0, pos)), true);
					EObject eObject = res.getEObject(uri.substring(pos + PaletteView.FRAGMENT_SEPARATOR.length()));
					if (eObject != null) {
						eObjects.add(EcoreUtil.copy(eObject));
					}
				}
			}
			return eObjects;
		}
		return super.extractDragSource(object);
	}
}