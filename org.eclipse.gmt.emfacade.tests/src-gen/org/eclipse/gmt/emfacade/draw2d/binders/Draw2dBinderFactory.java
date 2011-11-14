package org.eclipse.gmt.emfacade.draw2d.binders;
			
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.emfacade.builder.IBinder;
import org.eclipse.gmt.emfacade.draw2d.BlockFlow;
import org.eclipse.gmt.emfacade.draw2d.Ellipse;
import org.eclipse.gmt.emfacade.draw2d.Figure;
import org.eclipse.gmt.emfacade.draw2d.FrameBorder;
import org.eclipse.gmt.emfacade.draw2d.GroupBoxBorder;
import org.eclipse.gmt.emfacade.draw2d.Label;
import org.eclipse.gmt.emfacade.draw2d.RectangleFigure;
import org.eclipse.gmt.emfacade.draw2d.RoundedRectangle;
import org.eclipse.gmt.emfacade.draw2d.TitleBarBorder;
import org.eclipse.gmt.emfacade.draw2d.Triangle;
			
public class Draw2dBinderFactory extends org.eclipse.gmt.emfacade.draw2d.util.Draw2dAdapterFactory {

	@Override
	public boolean isFactoryForType(Object type) {
		return IBinder.class.equals(type);
	}

			private IBinder<?, ?> figureBinder = null;
			@Override
			public IBinder<?, ?> createFigureAdapter() {
				if (figureBinder == null) {
					figureBinder = new FigureBinder<Figure, IFigure>();
				}
				return figureBinder;
			}
			
			private IBinder<?, ?> labelBinder = null;
			@Override
			public IBinder<?, ?> createLabelAdapter() {
				if (labelBinder == null) {
					labelBinder = new LabelBinder<Label, org.eclipse.draw2d.Label>();
				}
				return labelBinder;
			}
			
			
			private IBinder<?, ?> rectangleFigureBinder = null;
			@Override
			public IBinder<?, ?> createRectangleFigureAdapter() {
				if (rectangleFigureBinder == null) {
					rectangleFigureBinder = new RectangleFigureBinder<RectangleFigure, org.eclipse.draw2d.RectangleFigure>();
				}
				return rectangleFigureBinder;
			}
			
			private IBinder<?, ?> roundedRectangleBinder = null;
			@Override
			public IBinder<?, ?> createRoundedRectangleAdapter() {
				if (roundedRectangleBinder == null) {
					roundedRectangleBinder = new RoundedRectangleBinder<RoundedRectangle, org.eclipse.draw2d.RoundedRectangle>();
				}
				return roundedRectangleBinder;
			}
			
			private IBinder<?, ?> ellipseBinder = null;
			@Override
			public IBinder<?, ?> createEllipseAdapter() {
				if (ellipseBinder == null) {
					ellipseBinder = new EllipseBinder<Ellipse, org.eclipse.draw2d.Ellipse>();
				}
				return ellipseBinder;
			}
			
			private IBinder<?, ?> triangleBinder = null;
			@Override
			public IBinder<?, ?> createTriangleAdapter() {
				if (triangleBinder == null) {
					triangleBinder = new TriangleBinder<Triangle, org.eclipse.draw2d.Triangle>();
				}
				return triangleBinder;
			}
			
			
			
			private IBinder<?, ?> groupBoxBorderBinder = null;
			@Override
			public IBinder<?, ?> createGroupBoxBorderAdapter() {
				if (groupBoxBorderBinder == null) {
					groupBoxBorderBinder = new GroupBoxBorderBinder<GroupBoxBorder, org.eclipse.draw2d.GroupBoxBorder>();
				}
				return groupBoxBorderBinder;
			}
			
			private IBinder<?, ?> titleBarBorderBinder = null;
			@Override
			public IBinder<?, ?> createTitleBarBorderAdapter() {
				if (titleBarBorderBinder == null) {
					titleBarBorderBinder = new TitleBarBorderBinder<TitleBarBorder, org.eclipse.draw2d.TitleBarBorder>();
				}
				return titleBarBorderBinder;
			}
			
			private IBinder<?, ?> frameBorderBinder = null;
			@Override
			public IBinder<?, ?> createFrameBorderAdapter() {
				if (frameBorderBinder == null) {
					frameBorderBinder = new FrameBorderBinder<FrameBorder, org.eclipse.draw2d.FrameBorder>();
				}
				return frameBorderBinder;
			}
			
			private IBinder<?, ?> blockFlowBinder = null;
			@Override
			public IBinder<?, ?> createBlockFlowAdapter() {
				if (blockFlowBinder == null) {
					blockFlowBinder = new BlockFlowBinder<BlockFlow, org.eclipse.draw2d.text.BlockFlow>();
				}
				return blockFlowBinder;
			}
			
			
			
}
