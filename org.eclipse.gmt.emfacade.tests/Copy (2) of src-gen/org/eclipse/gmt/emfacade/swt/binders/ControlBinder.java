package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.BorderStyle;
import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.LayoutData;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public abstract class ControlBinder <Model extends Control, View extends org.eclipse.swt.widgets.Control>
	extends WidgetBinder<Model, View> {
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getControl_BorderStyle()) {
			if (borderStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_TextOrientationStyle()) {
			if (textOrientationStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_LayoutData()) {
			if (layoutData_Association.updateView(eObject, object, feature, Object.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_Enabled()) {
			if (enabled_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_Visible()) {
			if (visible_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_TouchEnabled()) {
			if (touchEnabled_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_Background()) {
			if (background_Association.updateView(eObject, object, feature, Color.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_Font()) {
			if (font_Association.updateView(eObject, object, feature, Font.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_ToolTipText()) {
			if (toolTipText_Association.updateView(eObject, object, feature, String.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getControl_BorderStyle()) {
			borderStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_TextOrientationStyle()) {
			textOrientationStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_LayoutData()) {
			layoutData_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_Enabled()) {
			enabled_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_Visible()) {
			visible_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_TouchEnabled()) {
			touchEnabled_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_Background()) {
			background_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_Font()) {
			font_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getControl_ToolTipText()) {
			toolTipText_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Control, BorderStyle, org.eclipse.swt.widgets.Control, Integer> borderStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Control, BorderStyle, org.eclipse.swt.widgets.Control, Integer>(
		new Control_borderStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Control, TextOrientationStyle, org.eclipse.swt.widgets.Control, Integer> textOrientationStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Control, TextOrientationStyle, org.eclipse.swt.widgets.Control, Integer>(
		new Control_textOrientationStyle()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, LayoutData, org.eclipse.swt.widgets.Control, Object> layoutData_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, LayoutData, org.eclipse.swt.widgets.Control, Object>(
		new Control_layoutData()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean> enabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean>(
		new Control_enabled()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean> visible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean>(
		new Control_visible()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean> touchEnabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean>(
		new Control_touchEnabled()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, org.eclipse.gmt.emfacade.swt.Color, org.eclipse.swt.widgets.Control, Color> background_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, org.eclipse.gmt.emfacade.swt.Color, org.eclipse.swt.widgets.Control, Color>(
		new Control_background()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, org.eclipse.gmt.emfacade.swt.Font, org.eclipse.swt.widgets.Control, Font> font_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, org.eclipse.gmt.emfacade.swt.Font, org.eclipse.swt.widgets.Control, Font>(
		new Control_font()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, String, org.eclipse.swt.widgets.Control, String> toolTipText_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, String, org.eclipse.swt.widgets.Control, String>(
		new Control_toolTipText()
	);
		
}
