package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class IFigure_toolTip implements Association<IFigure, IFigure> {

  public IFigure get(IFigure iFigure) {
    org.eclipse.draw2d.IFigure _olTip = iFigure.getToolTip();
    return _olTip;
  }

  public void set(IFigure iFigure_1, IFigure iFigure_2) {
    iFigure_1.setToolTip(iFigure_2);
  }
}
