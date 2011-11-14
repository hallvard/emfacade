package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.draw2d.Alignment;
import org.eclipse.gmt.emfacade.draw2d.Direction;
import org.eclipse.gmt.emfacade.draw2d.Label;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public  class LabelBinder <Model extends Label, View extends org.eclipse.draw2d.Label>
	extends FigureBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.draw2d.Label();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getLabel_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getLabel_TextAlignment()) {
			if (textAlignment_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getLabel_TextPlacement()) {
			if (textPlacement_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getLabel_IconAlignment()) {
			if (iconAlignment_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getLabel_IconTextGap()) {
			if (iconTextGap_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getLabel_Text()) {
			text_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getLabel_TextAlignment()) {
			textAlignment_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getLabel_TextPlacement()) {
			textPlacement_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getLabel_IconAlignment()) {
			iconAlignment_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getLabel_IconTextGap()) {
			iconTextGap_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, String, org.eclipse.draw2d.Label, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, String, org.eclipse.draw2d.Label, String>(
		new Label_text()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, Alignment, org.eclipse.draw2d.Label, Integer> textAlignment_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, Alignment, org.eclipse.draw2d.Label, Integer>(
		new Label_textAlignment()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, Direction, org.eclipse.draw2d.Label, Integer> textPlacement_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, Direction, org.eclipse.draw2d.Label, Integer>(
		new Label_textPlacement()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, Alignment, org.eclipse.draw2d.Label, Integer> iconAlignment_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, Alignment, org.eclipse.draw2d.Label, Integer>(
		new Label_iconAlignment()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, Integer, org.eclipse.draw2d.Label, Integer> iconTextGap_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Label, Integer, org.eclipse.draw2d.Label, Integer>(
		new Label_iconTextGap()
	);
		
}
