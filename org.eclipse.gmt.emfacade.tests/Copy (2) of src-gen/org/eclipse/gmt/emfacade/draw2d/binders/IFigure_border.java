package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class IFigure_border implements Association<IFigure, Border> {

  public Border get(IFigure iFigure) {
    org.eclipse.draw2d.Border _border = iFigure.getBorder();
    return _border;
  }

  public void set(IFigure iFigure, Border border) {
    iFigure.setBorder(border);
  }
}
