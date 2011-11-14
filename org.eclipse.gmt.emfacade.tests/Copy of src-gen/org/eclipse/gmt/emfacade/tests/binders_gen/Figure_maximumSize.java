package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Figure_maximumSize implements Association<Figure, Dimension> {

  public Dimension get(Figure figure) {
    org.eclipse.draw2d.geometry.Dimension _maximumSize = figure.getMaximumSize();
    return _maximumSize;
  }

  public void set(Figure figure, Dimension dimension) {
    figure.setMaximumSize(dimension);
  }
}
