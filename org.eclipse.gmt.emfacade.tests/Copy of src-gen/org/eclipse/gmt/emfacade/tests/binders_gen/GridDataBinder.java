package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.GridData;
import org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle;
import org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class GridDataBinder <Model extends GridData, View extends org.eclipse.swt.layout.GridData>
	extends LayoutDataBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.swt.layout.GridData();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalAlignment()) {
			if (verticalAlignment_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalAlignment()) {
			if (horizontalAlignment_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_WidthHint()) {
			if (widthHint_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HeightHint()) {
			if (heightHint_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalIndent()) {
			if (horizontalIndent_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalIndent()) {
			if (verticalIndent_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalSpan()) {
			if (horizontalSpan_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalSpan()) {
			if (verticalSpan_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_GrabExcessHorizontalSpace()) {
			if (grabExcessHorizontalSpace_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_GrabExcessVerticalSpace()) {
			if (grabExcessVerticalSpace_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_MinimumWidth()) {
			if (minimumWidth_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_MinimumHeight()) {
			if (minimumHeight_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_Exclude()) {
			if (exclude_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalAlignment()) {
			verticalAlignment_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalAlignment()) {
			horizontalAlignment_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_WidthHint()) {
			widthHint_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HeightHint()) {
			heightHint_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalIndent()) {
			horizontalIndent_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalIndent()) {
			verticalIndent_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalSpan()) {
			horizontalSpan_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalSpan()) {
			verticalSpan_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_GrabExcessHorizontalSpace()) {
			grabExcessHorizontalSpace_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_GrabExcessVerticalSpace()) {
			grabExcessVerticalSpace_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_MinimumWidth()) {
			minimumWidth_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_MinimumHeight()) {
			minimumHeight_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridData_Exclude()) {
			exclude_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, VerticalAlignmentStyle, org.eclipse.swt.layout.GridData, Integer> verticalAlignment_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, VerticalAlignmentStyle, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_verticalAlignment()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, HorizontalAlignmentStyle, org.eclipse.swt.layout.GridData, Integer> horizontalAlignment_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, HorizontalAlignmentStyle, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_horizontalAlignment()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> widthHint_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_widthHint()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> heightHint_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_heightHint()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> horizontalIndent_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_horizontalIndent()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> verticalIndent_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_verticalIndent()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> horizontalSpan_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_horizontalSpan()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> verticalSpan_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_verticalSpan()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean> grabExcessHorizontalSpace_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean>(
		new GridData_grabExcessHorizontalSpace()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean> grabExcessVerticalSpace_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean>(
		new GridData_grabExcessVerticalSpace()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> minimumWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_minimumWidth()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> minimumHeight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_minimumHeight()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean> exclude_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean>(
		new GridData_exclude()
	);
		
}
