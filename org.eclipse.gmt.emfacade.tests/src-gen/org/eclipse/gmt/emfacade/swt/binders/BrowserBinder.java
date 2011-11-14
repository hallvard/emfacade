package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.Browser;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class BrowserBinder <Model extends Browser, View extends org.eclipse.swt.browser.Browser>
	extends ControlBinder<Model, View>
	{

	 
	  public void configureView(Browser browser_1, org.eclipse.swt.browser.Browser browser_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.browser.Browser createView(Browser browser, IBinderHelper _binderHelper) {
	    org.eclipse.swt.widgets.Composite _aParent = _binderHelper.<org.eclipse.swt.widgets.Composite>aParent(browser, org.eclipse.swt.widgets.Composite.class);
	    int _style = browser.getStyle();
	    org.eclipse.swt.browser.Browser _browser = new org.eclipse.swt.browser.Browser(_aParent, _style);
	    return _browser;
	  }
	
	  public void disposeView(Browser browser_1, org.eclipse.swt.browser.Browser browser_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getBrowser_JavascriptEnabled()) {
			if (javascriptEnabled_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getBrowser_Text()) {
			if (text_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getBrowser_Url()) {
			if (url_Association.updateView(eObject, object, feature, String.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getBrowser_JavascriptEnabled()) {
			javascriptEnabled_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getBrowser_Text()) {
			text_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getBrowser_Url()) {
			url_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Browser, Boolean, org.eclipse.swt.browser.Browser, Boolean> javascriptEnabled_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Browser, Boolean, org.eclipse.swt.browser.Browser, Boolean>(
		new Browser_javascriptEnabled()
	);{
	javascriptEnabled_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getBrowser_JavascriptEnabled());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Browser, String, org.eclipse.swt.browser.Browser, String> text_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Browser, String, org.eclipse.swt.browser.Browser, String>(
		new Browser_text()
	);{
	text_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getBrowser_Text());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Browser, URI, org.eclipse.swt.browser.Browser, String> url_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Browser, URI, org.eclipse.swt.browser.Browser, String>(
		new Browser_url()
	);{
	url_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getBrowser_Url());
	url_Association.setConverter(new URIStringConverter());
	}
		
	
}
