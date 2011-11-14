package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class IFigure_maximumSize implements Association<IFigure, Dimension> {

  public Dimension get(IFigure iFigure) {
    org.eclipse.draw2d.geometry.Dimension _maximumSize = iFigure.getMaximumSize();
    return _maximumSize;
  }

  public void set(IFigure iFigure, Dimension dimension) {
    iFigure.setMaximumSize(dimension);
  }
}
