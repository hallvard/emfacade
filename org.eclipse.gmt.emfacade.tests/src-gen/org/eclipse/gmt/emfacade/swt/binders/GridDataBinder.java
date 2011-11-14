package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.GridData;
import org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle;
import org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class GridDataBinder <Model extends GridData, View extends org.eclipse.swt.layout.GridData>
	extends LayoutDataBinder<Model, View>
	{

	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalAlignment()) {
			if (verticalAlignment_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalAlignment()) {
			if (horizontalAlignment_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_WidthHint()) {
			if (widthHint_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HeightHint()) {
			if (heightHint_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalIndent()) {
			if (horizontalIndent_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalIndent()) {
			if (verticalIndent_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalSpan()) {
			if (horizontalSpan_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalSpan()) {
			if (verticalSpan_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_GrabExcessHorizontalSpace()) {
			if (grabExcessHorizontalSpace_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_GrabExcessVerticalSpace()) {
			if (grabExcessVerticalSpace_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_MinimumWidth()) {
			if (minimumWidth_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_MinimumHeight()) {
			if (minimumHeight_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_Exclude()) {
			if (exclude_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalAlignment()) {
			verticalAlignment_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalAlignment()) {
			horizontalAlignment_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_WidthHint()) {
			widthHint_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HeightHint()) {
			heightHint_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalIndent()) {
			horizontalIndent_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalIndent()) {
			verticalIndent_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_HorizontalSpan()) {
			horizontalSpan_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_VerticalSpan()) {
			verticalSpan_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_GrabExcessHorizontalSpace()) {
			grabExcessHorizontalSpace_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_GrabExcessVerticalSpace()) {
			grabExcessVerticalSpace_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_MinimumWidth()) {
			minimumWidth_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_MinimumHeight()) {
			minimumHeight_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridData_Exclude()) {
			exclude_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, VerticalAlignmentStyle, org.eclipse.swt.layout.GridData, Integer> verticalAlignment_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, VerticalAlignmentStyle, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_verticalAlignment()
	);{
	verticalAlignment_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_VerticalAlignment());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, HorizontalAlignmentStyle, org.eclipse.swt.layout.GridData, Integer> horizontalAlignment_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, HorizontalAlignmentStyle, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_horizontalAlignment()
	);{
	horizontalAlignment_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_HorizontalAlignment());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> widthHint_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_widthHint()
	);{
	widthHint_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_WidthHint());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> heightHint_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_heightHint()
	);{
	heightHint_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_HeightHint());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> horizontalIndent_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_horizontalIndent()
	);{
	horizontalIndent_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_HorizontalIndent());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> verticalIndent_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_verticalIndent()
	);{
	verticalIndent_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_VerticalIndent());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> horizontalSpan_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_horizontalSpan()
	);{
	horizontalSpan_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_HorizontalSpan());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> verticalSpan_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_verticalSpan()
	);{
	verticalSpan_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_VerticalSpan());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean> grabExcessHorizontalSpace_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean>(
		new GridData_grabExcessHorizontalSpace()
	);{
	grabExcessHorizontalSpace_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_GrabExcessHorizontalSpace());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean> grabExcessVerticalSpace_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean>(
		new GridData_grabExcessVerticalSpace()
	);{
	grabExcessVerticalSpace_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_GrabExcessVerticalSpace());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> minimumWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_minimumWidth()
	);{
	minimumWidth_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_MinimumWidth());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer> minimumHeight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Integer, org.eclipse.swt.layout.GridData, Integer>(
		new GridData_minimumHeight()
	);{
	minimumHeight_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_MinimumHeight());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean> exclude_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridData, Boolean, org.eclipse.swt.layout.GridData, Boolean>(
		new GridData_exclude()
	);{
	exclude_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridData_Exclude());
	}
		
	
}
