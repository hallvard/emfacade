package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.graphics.Color;

class IFigure_foregroundColor implements Association<IFigure, Color> {

  public Color get(IFigure iFigure) {
    org.eclipse.swt.graphics.Color _foregroundColor = iFigure.getForegroundColor();
    return _foregroundColor;
  }

  public void set(IFigure iFigure, Color color) {
    iFigure.setForegroundColor(color);
  }
}
