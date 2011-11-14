package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.draw2d.Border;
import org.eclipse.gmt.emfacade.draw2d.Figure;
import org.eclipse.gmt.emfacade.swt.Color;
import org.eclipse.gmt.emfacade.swt.Font;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public  class FigureBinder <Model extends Figure, View extends org.eclipse.draw2d.Figure>
	extends AbstractBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.draw2d.Figure();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Enabled()) {
			if (enabled_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Visible()) {
			if (visible_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Opaque()) {
			if (opaque_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_FocusTraversable()) {
			if (focusTraversable_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Children()) {
			if (children_Association.updateView(eObject.getChildren(), object, feature, org.eclipse.draw2d.Figure.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Bounds()) {
			if (bounds_Association.updateView(eObject, object, feature, Rectangle.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_MinimumSize()) {
			if (minimumSize_Association.updateView(eObject, object, feature, Dimension.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_PreferredSize()) {
			if (preferredSize_Association.updateView(eObject, object, feature, Dimension.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_MaximumSize()) {
			if (maximumSize_Association.updateView(eObject, object, feature, Dimension.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_ToolTip()) {
			if (toolTip_Association.updateView(eObject, object, feature, org.eclipse.draw2d.Figure.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_BackgroundColor()) {
			if (backgroundColor_Association.updateView(eObject, object, feature, Color.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_ForegroundColor()) {
			if (foregroundColor_Association.updateView(eObject, object, feature, Color.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Font()) {
			if (font_Association.updateView(eObject, object, feature, Font.class, context)) {
				return;
			}
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Border()) {
			if (border_Association.updateView(eObject, object, feature, AbstractBorder.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}
	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == Draw2dPackage.eINSTANCE.getFigure_Children()) {
			if (children_Association.updateView(eObject.getChildren(), object, notification, org.eclipse.draw2d.Figure.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, notification, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Enabled()) {
			enabled_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Visible()) {
			visible_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Opaque()) {
			opaque_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_FocusTraversable()) {
			focusTraversable_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Children()) {
			children_Association.disposeView(
			eObject.getChildren(), object, feature, (Figure) child, (org.eclipse.draw2d.Figure) childObject
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Bounds()) {
			bounds_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_MinimumSize()) {
			minimumSize_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_PreferredSize()) {
			preferredSize_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_MaximumSize()) {
			maximumSize_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_ToolTip()) {
			toolTip_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_BackgroundColor()) {
			backgroundColor_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_ForegroundColor()) {
			foregroundColor_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Font()) {
			font_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == Draw2dPackage.eINSTANCE.getFigure_Border()) {
			border_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, org.eclipse.draw2d.Figure, Boolean> enabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, org.eclipse.draw2d.Figure, Boolean>(
		new Figure_enabled()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, org.eclipse.draw2d.Figure, Boolean> visible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, org.eclipse.draw2d.Figure, Boolean>(
		new Figure_visible()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, org.eclipse.draw2d.Figure, Boolean> opaque_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, org.eclipse.draw2d.Figure, Boolean>(
		new Figure_opaque()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, org.eclipse.draw2d.Figure, Boolean> focusTraversable_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, org.eclipse.draw2d.Figure, Boolean>(
		new Figure_focusTraversable()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<Figure, Figure, org.eclipse.draw2d.Figure, org.eclipse.draw2d.Figure> children_Association = new org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<Figure, Figure, org.eclipse.draw2d.Figure, org.eclipse.draw2d.Figure>(
		new Figure_children()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Rectangle, org.eclipse.draw2d.Figure, Rectangle> bounds_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Rectangle, org.eclipse.draw2d.Figure, Rectangle>(
		new Figure_bounds()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, org.eclipse.draw2d.Figure, Dimension> minimumSize_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, org.eclipse.draw2d.Figure, Dimension>(
		new Figure_minimumSize()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, org.eclipse.draw2d.Figure, Dimension> preferredSize_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, org.eclipse.draw2d.Figure, Dimension>(
		new Figure_preferredSize()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, org.eclipse.draw2d.Figure, Dimension> maximumSize_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, org.eclipse.draw2d.Figure, Dimension>(
		new Figure_maximumSize()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Figure, org.eclipse.draw2d.Figure, org.eclipse.draw2d.Figure> toolTip_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Figure, org.eclipse.draw2d.Figure, org.eclipse.draw2d.Figure>(
		new Figure_toolTip()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Color, org.eclipse.draw2d.Figure, Color> backgroundColor_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Color, org.eclipse.draw2d.Figure, Color>(
		new Figure_backgroundColor()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Color, org.eclipse.draw2d.Figure, Color> foregroundColor_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Color, org.eclipse.draw2d.Figure, Color>(
		new Figure_foregroundColor()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Font, org.eclipse.draw2d.Figure, Font> font_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Font, org.eclipse.draw2d.Figure, Font>(
		new Figure_font()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Border, org.eclipse.draw2d.Figure, AbstractBorder> border_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Border, org.eclipse.draw2d.Figure, AbstractBorder>(
		new Figure_border()
	);
		
}
