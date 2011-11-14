package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class IFigure_minimumSize implements Association<IFigure, Dimension> {

  public Dimension get(IFigure iFigure) {
    org.eclipse.draw2d.geometry.Dimension _minimumSize = iFigure.getMinimumSize();
    return _minimumSize;
  }

  public void set(IFigure iFigure, Dimension dimension) {
    iFigure.setMinimumSize(dimension);
  }
}
