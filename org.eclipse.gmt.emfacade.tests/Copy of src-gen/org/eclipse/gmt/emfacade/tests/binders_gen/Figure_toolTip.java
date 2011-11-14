package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Figure;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Figure_toolTip implements Association<Figure, Figure> {

  public Figure get(Figure figure) {
    org.eclipse.draw2d.IFigure _olTip = figure.getToolTip();
    return _olTip;
  }

  public void set(Figure figure, Figure figure) {
    figure.setToolTip(figure_1);
  }
}
