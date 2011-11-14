package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class IFigure_preferredSize implements Association<IFigure, Dimension> {

  public Dimension get(IFigure iFigure) {
    org.eclipse.draw2d.geometry.Dimension _preferredSize = iFigure.getPreferredSize();
    return _preferredSize;
  }

  public void set(IFigure iFigure, Dimension dimension) {
    iFigure.setPreferredSize(dimension);
  }
}
