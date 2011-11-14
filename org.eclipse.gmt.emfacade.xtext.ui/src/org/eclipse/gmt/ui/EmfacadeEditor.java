package org.eclipse.gmt.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

public class EmfacadeEditor extends XtextEditor implements ISelectionProvider {

	private IXtextModelListener modelListener;

	private IStructuredSelection eObjectSelection = StructuredSelection.EMPTY;
	
	public ISelection getSelection() {
		return eObjectSelection;
	}
	public void setSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() <= 1) {
			Object o = ((IStructuredSelection) selection).getFirstElement();
			if (o == null || (o instanceof EObject)) { // && ((EObject) o).eResource() instanceof XtextResource)) {
				eObjectSelection = (IStructuredSelection) selection;
				fireSelectionChangedEvent();
			}
		}
	}
	protected void fireSelectionChangedEvent() {
		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, eObjectSelection));
		}
	}
	
	private List<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
	
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}
	
	protected void configureModelListener() {
		modelListener = new IXtextModelListener() {
			public void modelChanged(XtextResource resource) {
				updateSelection();
			}
		};
		getDocument().addModelListener(modelListener);
	}

	private ISelectionChangedListener internalSelectionChangedListener = new ISelectionChangedListener() {
		public void selectionChanged(SelectionChangedEvent event) {
//			updateSelection();
		}
	};
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		if (super.getSelectionProvider() != null) {
			super.getSelectionProvider().addSelectionChangedListener(internalSelectionChangedListener);
		}
		if (super.getSourceViewer() != null) {
			// should also look for cursor movements
		}
	}

//	@Override
//	protected void updateStatusLine() {
//		super.updateStatusLine();
//		updateSelection();
//	}

	@Override
	protected void handleCursorPositionChanged() {
		super.handleCursorPositionChanged();
		updateSelection();
	}

	@Override
	public boolean validateEditorInputState() {
		boolean result = super.validateEditorInputState();
		updateSelection();
		return result;
	}

	@Override
	public void dispose() {
		if (super.getSelectionProvider() != null) {
			super.getSelectionProvider().removeSelectionChangedListener(internalSelectionChangedListener);		
		}
	}
	
	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;
	
	protected void updateSelection() {
		final ISelection selection = getSelectionProvider().getSelection();
		if (selection instanceof ITextSelection) {
			getDocument().readOnly(new IUnitOfWork<Object, XtextResource>() {
				public Object exec(XtextResource xtextResource) throws Exception {
					Object eObject = eObjectAtOffsetHelper.resolveElementAt(xtextResource, ((ITextSelection)selection).getOffset());
					if (eObject instanceof EObject && eObject != eObjectSelection.getFirstElement()) {
						eObjectSelection = new StructuredSelection(eObject);
						setSelection(eObjectSelection);
					}
					return null;
				}
			});
		}
	}
}
