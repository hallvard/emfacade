package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.ModalStyle;
import org.eclipse.gmt.emfacade.swt.Shell;
import org.eclipse.gmt.emfacade.swt.TrimStyle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class ShellBinder <Model extends Shell, View extends org.eclipse.swt.widgets.Shell>
	extends DecorationsBinder<Model, View>
	{

	
	  public void configureView(Shell shell_1, org.eclipse.swt.widgets.Shell shell_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	  public org.eclipse.swt.widgets.Shell createView(Shell shell, IBinderHelper _binderHelper) {
	    org.eclipse.gmt.emfacade.swt.Shell _xblockexpression = null;
	    {
	      org.eclipse.swt.widgets.Display _current = org.eclipse.swt.widgets.Display.getCurrent();
	      final org.eclipse.swt.widgets.Display display = _current;
	      org.eclipse.swt.widgets.Display _current_1 = org.eclipse.swt.widgets.Display.getCurrent();
	      int _style = shell.getStyle();
	      org.eclipse.swt.widgets.Shell _shell = new org.eclipse.swt.widgets.Shell(_current_1, _style);
	      final org.eclipse.swt.widgets.Shell window = _shell;
	      window.open();
	      boolean _isDisposed = window.isDisposed();
	      boolean _operator_not = org.eclipse.xtext.xbase.lib.BooleanExtensions.operator_not(_isDisposed);
	      Boolean _xwhileexpression = _operator_not;
	      while (_xwhileexpression) {
	        boolean _readAndDispatch = display.readAndDispatch();
	        boolean _operator_not_1 = org.eclipse.xtext.xbase.lib.BooleanExtensions.operator_not(_readAndDispatch);
	        if (_operator_not_1) {
	          display.sleep();
	        }
	        boolean _isDisposed_1 = window.isDisposed();
	        boolean _operator_not_2 = org.eclipse.xtext.xbase.lib.BooleanExtensions.operator_not(_isDisposed_1);
	        _xwhileexpression = _operator_not_2;
	      }
	      _xblockexpression = (shell);
	    }
	    return _xblockexpression;
	  }
	
	  public void disposeView(Shell shell_1, org.eclipse.swt.widgets.Shell shell_2, IBinderHelper _binderHelper) {
	return;
	  }
	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getShell_ModalStyle()) {
			if (modalStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getShell_TrimStyle()) {
			if (trimStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getShell_FullScreen()) {
			if (fullScreen_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getShell_Alpha()) {
			if (alpha_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getShell_ModalStyle()) {
			modalStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getShell_TrimStyle()) {
			trimStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getShell_FullScreen()) {
			fullScreen_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getShell_Alpha()) {
			alpha_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Shell, ModalStyle, org.eclipse.swt.widgets.Shell, Integer> modalStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Shell, ModalStyle, org.eclipse.swt.widgets.Shell, Integer>(
		new Shell_modalStyle()
	);{
	modalStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getShell_ModalStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Shell, TrimStyle, org.eclipse.swt.widgets.Shell, Integer> trimStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.InvalidateStrategy.Impl<Shell, TrimStyle, org.eclipse.swt.widgets.Shell, Integer>(
		new Shell_trimStyle()
	);{
	trimStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getShell_TrimStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shell, Boolean, org.eclipse.swt.widgets.Shell, Boolean> fullScreen_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shell, Boolean, org.eclipse.swt.widgets.Shell, Boolean>(
		new Shell_fullScreen()
	);{
	fullScreen_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getShell_FullScreen());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shell, Integer, org.eclipse.swt.widgets.Shell, Integer> alpha_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<Shell, Integer, org.eclipse.swt.widgets.Shell, Integer>(
		new Shell_alpha()
	);{
	alpha_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getShell_Alpha());
	}
		
	
}
