package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Figure_bounds implements Association<Figure, Rectangle> {

  public Rectangle get(Figure figure) {
    org.eclipse.draw2d.geometry.Rectangle _bounds = figure.getBounds();
    return _bounds;
  }

  public void set(Figure figure, Rectangle rectangle) {
    figure.setBounds(rectangle);
  }
}
