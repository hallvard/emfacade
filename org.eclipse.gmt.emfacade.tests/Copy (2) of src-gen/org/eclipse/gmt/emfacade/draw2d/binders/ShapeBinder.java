package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.draw2d.Shape;
import org.eclipse.gmt.emfacade.swt.CapStyle;
import org.eclipse.gmt.emfacade.swt.JoinStyle;
import org.eclipse.gmt.emfacade.swt.LineStyle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public abstract class ShapeBinder <Model extends Shape, View extends org.eclipse.draw2d.Shape>
	extends FigureBinder<Model, View> {
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getShape_Fill()) {
			if (fill_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_FillXOR()) {
			if (fillXOR_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_Outline()) {
			if (outline_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_OutlineXOR()) {
			if (outlineXOR_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_Alpha()) {
			if (alpha_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_Antialias()) {
			if (antialias_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineWidthFloat()) {
			if (lineWidthFloat_Association.updateView(eObject, object, feature, Float.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineStyle()) {
			if (lineStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineCap()) {
			if (lineCap_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineJoin()) {
			if (lineJoin_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineDashOffset()) {
			if (lineDashOffset_Association.updateView(eObject, object, feature, Float.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineMiterLimit()) {
			if (lineMiterLimit_Association.updateView(eObject, object, feature, Float.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getShape_Fill()) {
			fill_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_FillXOR()) {
			fillXOR_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_Outline()) {
			outline_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_OutlineXOR()) {
			outlineXOR_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_Alpha()) {
			alpha_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_Antialias()) {
			antialias_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineWidthFloat()) {
			lineWidthFloat_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineStyle()) {
			lineStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineCap()) {
			lineCap_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineJoin()) {
			lineJoin_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineDashOffset()) {
			lineDashOffset_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getShape_LineMiterLimit()) {
			lineMiterLimit_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Boolean, org.eclipse.draw2d.Shape, Boolean> fill_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Boolean, org.eclipse.draw2d.Shape, Boolean>(
		new Shape_fill()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Boolean, org.eclipse.draw2d.Shape, Boolean> fillXOR_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Boolean, org.eclipse.draw2d.Shape, Boolean>(
		new Shape_fillXOR()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Boolean, org.eclipse.draw2d.Shape, Boolean> outline_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Boolean, org.eclipse.draw2d.Shape, Boolean>(
		new Shape_outline()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Boolean, org.eclipse.draw2d.Shape, Boolean> outlineXOR_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Boolean, org.eclipse.draw2d.Shape, Boolean>(
		new Shape_outlineXOR()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Integer, org.eclipse.draw2d.Shape, Integer> alpha_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Integer, org.eclipse.draw2d.Shape, Integer>(
		new Shape_alpha()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Integer, org.eclipse.draw2d.Shape, Integer> antialias_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Integer, org.eclipse.draw2d.Shape, Integer>(
		new Shape_antialias()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Float, org.eclipse.draw2d.Shape, Float> lineWidthFloat_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Float, org.eclipse.draw2d.Shape, Float>(
		new Shape_lineWidthFloat()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, LineStyle, org.eclipse.draw2d.Shape, Integer> lineStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, LineStyle, org.eclipse.draw2d.Shape, Integer>(
		new Shape_lineStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, CapStyle, org.eclipse.draw2d.Shape, Integer> lineCap_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, CapStyle, org.eclipse.draw2d.Shape, Integer>(
		new Shape_lineCap()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, JoinStyle, org.eclipse.draw2d.Shape, Integer> lineJoin_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, JoinStyle, org.eclipse.draw2d.Shape, Integer>(
		new Shape_lineJoin()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Float, org.eclipse.draw2d.Shape, Float> lineDashOffset_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Float, org.eclipse.draw2d.Shape, Float>(
		new Shape_lineDashOffset()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Float, org.eclipse.draw2d.Shape, Float> lineMiterLimit_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shape, Float, org.eclipse.draw2d.Shape, Float>(
		new Shape_lineMiterLimit()
	);
		
}
