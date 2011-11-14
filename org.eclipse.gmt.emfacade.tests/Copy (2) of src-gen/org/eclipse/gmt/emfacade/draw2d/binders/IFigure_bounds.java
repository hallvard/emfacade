package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class IFigure_bounds implements Association<IFigure, Rectangle> {

  public Rectangle get(IFigure iFigure) {
    org.eclipse.draw2d.geometry.Rectangle _bounds = iFigure.getBounds();
    return _bounds;
  }

  public void set(IFigure iFigure, Rectangle rectangle) {
    iFigure.setBounds(rectangle);
  }
}
