package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.emfacade.builder.AbstractBinder;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IBinderHelper;
import org.eclipse.gmt.emfacade.swt.GridLayout;

import org.eclipse.gmt.emfacade.builder.strategies.*;
import org.eclipse.gmt.emfacade.swt.SwtPackage;

public  class GridLayoutBinder <Model extends GridLayout, View extends org.eclipse.swt.layout.GridLayout>
	extends LayoutBinder<Model, View>
	{

	
	
	@Override
	protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
		if (feature == SwtPackage.eINSTANCE.getGridLayout_NumColumns()) {
			if (numColumns_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MakeColumnsEqualWidth()) {
			if (makeColumnsEqualWidth_Association.updateView(eObject, object, feature, Boolean.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_HorizontalSpacing()) {
			if (horizontalSpacing_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_VerticalSpacing()) {
			if (verticalSpacing_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginWidth()) {
			if (marginWidth_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginHeight()) {
			if (marginHeight_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginLeft()) {
			if (marginLeft_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginTop()) {
			if (marginTop_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginRight()) {
			if (marginRight_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
				return true;
			}
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginBottom()) {
			if (marginBottom_Association.updateView(eObject, object, feature, Integer.class, _binderHelper.getBinderContext())) {
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
		if (feature == SwtPackage.eINSTANCE.getGridLayout_NumColumns()) {
			numColumns_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MakeColumnsEqualWidth()) {
			makeColumnsEqualWidth_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_HorizontalSpacing()) {
			horizontalSpacing_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_VerticalSpacing()) {
			verticalSpacing_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginWidth()) {
			marginWidth_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginHeight()) {
			marginHeight_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginLeft()) {
			marginLeft_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginTop()) {
			marginTop_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginRight()) {
			marginRight_Association.disposeView(object, _context);
			return;
		} else 
		if (feature == SwtPackage.eINSTANCE.getGridLayout_MarginBottom()) {
			marginBottom_Association.disposeView(object, _context);
			return;
		}
		super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> numColumns_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_numColumns()
	);{
	numColumns_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_NumColumns());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Boolean, org.eclipse.swt.layout.GridLayout, Boolean> makeColumnsEqualWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Boolean, org.eclipse.swt.layout.GridLayout, Boolean>(
		new GridLayout_makeColumnsEqualWidth()
	);{
	makeColumnsEqualWidth_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_MakeColumnsEqualWidth());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> horizontalSpacing_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_horizontalSpacing()
	);{
	horizontalSpacing_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_HorizontalSpacing());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> verticalSpacing_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_verticalSpacing()
	);{
	verticalSpacing_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_VerticalSpacing());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginWidth_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginWidth()
	);{
	marginWidth_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_MarginWidth());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginHeight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginHeight()
	);{
	marginHeight_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_MarginHeight());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginLeft_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginLeft()
	);{
	marginLeft_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_MarginLeft());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginTop_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginTop()
	);{
	marginTop_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_MarginTop());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginRight_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginRight()
	);{
	marginRight_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_MarginRight());
	}
	
	private org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer> marginBottom_Association = new org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Impl<GridLayout, Integer, org.eclipse.swt.layout.GridLayout, Integer>(
		new GridLayout_marginBottom()
	);{
	marginBottom_Association.setETyped(org.eclipse.gmt.emfacade.swt.SwtPackage.eINSTANCE.getGridLayout_MarginBottom());
	}
		
	
}
