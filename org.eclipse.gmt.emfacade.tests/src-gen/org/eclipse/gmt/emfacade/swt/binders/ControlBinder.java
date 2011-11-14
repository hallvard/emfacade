package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.BorderStyle;
import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.LayoutData;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public abstract class ControlBinder <Model extends Control, View extends org.eclipse.swt.widgets.Control>
	extends WidgetBinder<Model, View>
	{

	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getControl_BorderStyle()) {
			if (borderStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_TextOrientationStyle()) {
			if (textOrientationStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_LayoutData()) {
			if (layoutData_Association.updateView(eObject, object, feature, Object.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Enabled()) {
			if (enabled_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Visible()) {
			if (visible_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_TouchEnabled()) {
			if (touchEnabled_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Background()) {
			if (background_Association.updateView(eObject, object, feature, Color.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Font()) {
			if (font_Association.updateView(eObject, object, feature, Font.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_ToolTipText()) {
			if (toolTipText_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Size()) {
			if (size_Association.updateView(eObject, object, feature, Point.class, _binderHelper.getBinderContext())) {
				return true;
			}
		}
		return false;
	}
	@Override
	protected boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper) {
		return false;
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
		if (feature == SwtPackage.eINSTANCE.getControl_BorderStyle()) {
			borderStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_TextOrientationStyle()) {
			textOrientationStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_LayoutData()) {
			layoutData_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Enabled()) {
			enabled_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Visible()) {
			visible_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_TouchEnabled()) {
			touchEnabled_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Background()) {
			background_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Font()) {
			font_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_ToolTipText()) {
			toolTipText_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getControl_Size()) {
			size_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Control, BorderStyle, org.eclipse.swt.widgets.Control, Integer> borderStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Control, BorderStyle, org.eclipse.swt.widgets.Control, Integer>(
		new Control_borderStyle()
	);{
	borderStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_BorderStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Control, TextOrientationStyle, org.eclipse.swt.widgets.Control, Integer> textOrientationStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Control, TextOrientationStyle, org.eclipse.swt.widgets.Control, Integer>(
		new Control_textOrientationStyle()
	);{
	textOrientationStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_TextOrientationStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, LayoutData, org.eclipse.swt.widgets.Control, Object> layoutData_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, LayoutData, org.eclipse.swt.widgets.Control, Object>(
		new Control_layoutData()
	);{
	layoutData_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_LayoutData());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean> enabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean>(
		new Control_enabled()
	);{
	enabled_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_Enabled());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean> visible_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean>(
		new Control_visible()
	);{
	visible_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_Visible());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean> touchEnabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Boolean, org.eclipse.swt.widgets.Control, Boolean>(
		new Control_touchEnabled()
	);{
	touchEnabled_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_TouchEnabled());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, org.eclipse.gmt.emfacade.swt.Color, org.eclipse.swt.widgets.Control, Color> background_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, org.eclipse.gmt.emfacade.swt.Color, org.eclipse.swt.widgets.Control, Color>(
		new Control_background()
	);{
	background_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_Background());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, org.eclipse.gmt.emfacade.swt.Font, org.eclipse.swt.widgets.Control, Font> font_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, org.eclipse.gmt.emfacade.swt.Font, org.eclipse.swt.widgets.Control, Font>(
		new Control_font()
	);{
	font_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_Font());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, String, org.eclipse.swt.widgets.Control, String> toolTipText_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, String, org.eclipse.swt.widgets.Control, String>(
		new Control_toolTipText()
	);{
	toolTipText_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_ToolTipText());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Point, org.eclipse.swt.widgets.Control, Point> size_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Control, Point, org.eclipse.swt.widgets.Control, Point>(
		new Control_size()
	);{
	size_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getControl_Size());
	}
		
	
}
