package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class IFigure_opaque implements Association<IFigure, Boolean> {

  public Boolean get(IFigure iFigure) {return null;
  }

  public void set(IFigure iFigure, Boolean booleanValue) {
    iFigure.setOpaque(booleanValue);
  }
}
