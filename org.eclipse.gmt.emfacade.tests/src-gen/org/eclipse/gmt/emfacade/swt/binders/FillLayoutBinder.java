package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.FillLayout;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class FillLayoutBinder <Model extends FillLayout, View extends org.eclipse.swt.layout.FillLayout>
	extends LayoutBinder<Model, View>
	{

	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getFillLayout_OrientationStyle()) {
			if (orientationStyle_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFillLayout_MarginWidth()) {
			if (marginWidth_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getFillLayout_MarginHeight()) {
			if (marginHeight_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getFillLayout_OrientationStyle()) {
			orientationStyle_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFillLayout_MarginWidth()) {
			marginWidth_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getFillLayout_MarginHeight()) {
			marginHeight_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FillLayout, OrientationStyle, org.eclipse.swt.layout.FillLayout, Integer> orientationStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FillLayout, OrientationStyle, org.eclipse.swt.layout.FillLayout, Integer>(
		new FillLayout_orientationStyle()
	);{
	orientationStyle_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFillLayout_OrientationStyle());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FillLayout, Integer, org.eclipse.swt.layout.FillLayout, Integer> marginWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FillLayout, Integer, org.eclipse.swt.layout.FillLayout, Integer>(
		new FillLayout_marginWidth()
	);{
	marginWidth_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFillLayout_MarginWidth());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FillLayout, Integer, org.eclipse.swt.layout.FillLayout, Integer> marginHeight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<FillLayout, Integer, org.eclipse.swt.layout.FillLayout, Integer>(
		new FillLayout_marginHeight()
	);{
	marginHeight_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getFillLayout_MarginHeight());
	}
		
	
}
