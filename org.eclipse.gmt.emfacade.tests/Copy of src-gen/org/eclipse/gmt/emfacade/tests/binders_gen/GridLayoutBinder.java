package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.swt.GridLayout;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class GridLayoutBinder <Model extends GridLayout, View extends org.eclipse.swt.layout.GridLayout>
	extends LayoutBinder<Model, View> {
	@Override
	protected View createView(Model eObject, IBinderContext context) {
		
		return (View) new org.eclipse.swt.layout.GridLayout();
	}
	
	
	@Override
	public void updateView(Model eObject, View object, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getGridLayout_NumColumns()) {
			if (numColumns_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MakeColumnsEqualWidth()) {
			if (makeColumnsEqualWidth_Association.updateView(eObject, object, feature, Boolean.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginWidth()) {
			if (marginWidth_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginHeight()) {
			if (marginHeight_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginLeft()) {
			if (marginLeft_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginTop()) {
			if (marginTop_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginRight()) {
			if (marginRight_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginBottom()) {
			if (marginBottom_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_HorizontalSpacing()) {
			if (horizontalSpacing_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_VerticalSpacing()) {
			if (verticalSpacing_Association.updateView(eObject, object, feature, Integer.class, context)) {
				return;
			}
		}
		super.updateView(eObject, object, feature, context);
	}

	@Override
	public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext context) {
		if (feature == SwtPackage.eINSTANCE.getGridLayout_NumColumns()) {
			numColumns_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MakeColumnsEqualWidth()) {
			makeColumnsEqualWidth_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginWidth()) {
			marginWidth_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginHeight()) {
			marginHeight_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginLeft()) {
			marginLeft_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginTop()) {
			marginTop_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginRight()) {
			marginRight_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginBottom()) {
			marginBottom_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_HorizontalSpacing()) {
			horizontalSpacing_Association.disposeView(
object
			, context);
			return;
		}else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_VerticalSpacing()) {
			verticalSpacing_Association.disposeView(
object
			, context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> numColumns_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_numColumns()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Boolean, org.eclipse.swt.layout.GridLayout, Boolean> makeColumnsEqualWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Boolean, org.eclipse.swt.layout.GridLayout, Boolean>(
		new GridLayout_makeColumnsEqualWidth()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginWidth()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginHeight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginHeight()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginLeft_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginLeft()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginTop_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginTop()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginRight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginRight()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginBottom_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginBottom()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> horizontalSpacing_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_horizontalSpacing()
	);
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> verticalSpacing_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_verticalSpacing()
	);
		
}
