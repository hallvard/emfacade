package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.Font;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class FontBinder <Model extends Font, View extends org.eclipse.swt.graphics.Font>
	extends AbstractBinder<Model, View>
	{

	
	  public void configureView(Font font_1, org.eclipse.swt.graphics.Font font_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.graphics.Font createView(Font font, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Widget _aParent = _binderHelper.<org.eclipse.swt.widgets.Widget>aParent(font, org.eclipse.swt.widgets.Widget.class);
	    org.eclipse.swt.widgets.Display _display = _aParent.getDisplay();
	    String _name = font.getName();
	    int _style = font.getStyle();
	    int _height = font.getHeight();
	    org.eclipse.swt.graphics.Font _font = new org.eclipse.swt.graphics.Font(_display, _name, _style, ((int) _height));
	    return _font;
	  }
	
	  public void disposeView(Font font_1, org.eclipse.swt.graphics.Font font_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getFont_Name()) {
			if (name_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFont_Style()) {
			if (style_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFont_Height()) {
			if (height_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getFont_Name()) {
			name_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFont_Style()) {
			style_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFont_Height()) {
			height_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, String, org.eclipse.swt.graphics.Font, String> name_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, String, org.eclipse.swt.graphics.Font, String>(
		new Font_name()
	);{
	name_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFont_Name());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, Integer, org.eclipse.swt.graphics.Font, Integer> style_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, Integer, org.eclipse.swt.graphics.Font, Integer>(
		new Font_style()
	);{
	style_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFont_Style());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, Integer, org.eclipse.swt.graphics.Font, Integer> height_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Impl<Font, Integer, org.eclipse.swt.graphics.Font, Integer>(
		new Font_height()
	);{
	height_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFont_Height());
	}
		
	
}
