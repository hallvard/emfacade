package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Figure_preferredSize implements Association<Figure, Dimension> {

  public Dimension get(Figure figure) {
    org.eclipse.draw2d.geometry.Dimension _preferredSize = figure.getPreferredSize();
    return _preferredSize;
  }

  public void set(Figure figure, Dimension dimension) {
    figure.setPreferredSize(dimension);
  }
}
