package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;
import org.eclipse.gmt.emfacade.swt.RowLayout;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class RowLayoutBinder <Model extends RowLayout, View extends org.eclipse.swt.layout.RowLayout>
	extends LayoutBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.swt.layout.RowLayout();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getRowLayout_OrientationStyle()) {
			if (orientationStyle_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Spacing()) {
			if (spacing_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Wrap()) {
			if (wrap_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Pack()) {
			if (pack_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Fill()) {
			if (fill_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Center()) {
			if (center_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Justify()) {
			if (justify_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginWidth()) {
			if (marginWidth_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginHeight()) {
			if (marginHeight_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginLeft()) {
			if (marginLeft_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginTop()) {
			if (marginTop_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginRight()) {
			if (marginRight_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginBottom()) {
			if (marginBottom_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getRowLayout_OrientationStyle()) {
			orientationStyle_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Spacing()) {
			spacing_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Wrap()) {
			wrap_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Pack()) {
			pack_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Fill()) {
			fill_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Center()) {
			center_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_Justify()) {
			justify_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginWidth()) {
			marginWidth_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginHeight()) {
			marginHeight_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginLeft()) {
			marginLeft_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginTop()) {
			marginTop_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginRight()) {
			marginRight_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getRowLayout_MarginBottom()) {
			marginBottom_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, OrientationStyle, org.eclipse.swt.layout.RowLayout, Integer> orientationStyle_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, OrientationStyle, org.eclipse.swt.layout.RowLayout, Integer>(
		new RowLayout_orientationStyle()
	);{
	orientationStyle_Association.setConverter(new OrientationStyleIntegerConverter());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer> spacing_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer>(
		new RowLayout_spacing()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean> wrap_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean>(
		new RowLayout_wrap()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean> pack_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean>(
		new RowLayout_pack()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean> fill_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean>(
		new RowLayout_fill()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean> center_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean>(
		new RowLayout_center()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean> justify_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Boolean, org.eclipse.swt.layout.RowLayout, Boolean>(
		new RowLayout_justify()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer> marginWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer>(
		new RowLayout_marginWidth()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer> marginHeight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer>(
		new RowLayout_marginHeight()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer> marginLeft_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer>(
		new RowLayout_marginLeft()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer> marginTop_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer>(
		new RowLayout_marginTop()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer> marginRight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer>(
		new RowLayout_marginRight()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer> marginBottom_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<RowLayout, Integer, org.eclipse.swt.layout.RowLayout, Integer>(
		new RowLayout_marginBottom()
	);
		
}
