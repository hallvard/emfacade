package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.graphics.Font;

class IFigure_font implements Association<IFigure, Font> {

  public Font get(IFigure iFigure) {
    org.eclipse.swt.graphics.Font _font = iFigure.getFont();
    return _font;
  }

  public void set(IFigure iFigure, Font font) {
    iFigure.setFont(font);
  }
}
