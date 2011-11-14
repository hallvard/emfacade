package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.draw2d.Figure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public  class FigureBinder <Model extends Figure, View extends IFigure>
	extends AbstractBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		org.eclipse.draw2d.Figure _figure = new org.eclipse.draw2d.Figure();
		return (View) _figure;
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
			if (children_Association.updateView(eObject.getChildren(), object, feature, IFigure.class, context)) {
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
			if (toolTip_Association.updateView(eObject, object, feature, IFigure.class, context)) {
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
			if (border_Association.updateView(eObject, object, feature, Border.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}
	@Override
	public void updateView(Model eObject, View object, Notification notification, IBinderContext context) {
		if (notification.getFeature() == Draw2dPackage.eINSTANCE.getFigure_Children()) {
			if (children_Association.updateView(eObject.getChildren(), object, notification, IFigure.class, context)) {
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
			eObject.getChildren(), object, feature, (Figure) child, (IFigure) childObject
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
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, IFigure, Boolean> enabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, IFigure, Boolean>(
		new IFigure_enabled()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, IFigure, Boolean> visible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, IFigure, Boolean>(
		new IFigure_visible()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, IFigure, Boolean> opaque_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, IFigure, Boolean>(
		new IFigure_opaque()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, IFigure, Boolean> focusTraversable_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Boolean, IFigure, Boolean>(
		new IFigure_focusTraversable()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<Figure, Figure, IFigure, IFigure> children_Association = new org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Impl<Figure, Figure, IFigure, IFigure>(
		new IFigure_children()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Rectangle, IFigure, Rectangle> bounds_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Rectangle, IFigure, Rectangle>(
		new IFigure_bounds()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, IFigure, Dimension> minimumSize_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, IFigure, Dimension>(
		new IFigure_minimumSize()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, IFigure, Dimension> preferredSize_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, IFigure, Dimension>(
		new IFigure_preferredSize()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, IFigure, Dimension> maximumSize_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Dimension, IFigure, Dimension>(
		new IFigure_maximumSize()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Figure, IFigure, IFigure> toolTip_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, Figure, IFigure, IFigure>(
		new IFigure_toolTip()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, org.eclipse.gmt.emfacade.swt.Color, IFigure, Color> backgroundColor_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, org.eclipse.gmt.emfacade.swt.Color, IFigure, Color>(
		new IFigure_backgroundColor()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, org.eclipse.gmt.emfacade.swt.Color, IFigure, Color> foregroundColor_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, org.eclipse.gmt.emfacade.swt.Color, IFigure, Color>(
		new IFigure_foregroundColor()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, org.eclipse.gmt.emfacade.swt.Font, IFigure, Font> font_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, org.eclipse.gmt.emfacade.swt.Font, IFigure, Font>(
		new IFigure_font()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, org.eclipse.gmt.emfacade.draw2d.Border, IFigure, Border> border_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Figure, org.eclipse.gmt.emfacade.draw2d.Border, IFigure, Border>(
		new IFigure_border()
	);
		
}
