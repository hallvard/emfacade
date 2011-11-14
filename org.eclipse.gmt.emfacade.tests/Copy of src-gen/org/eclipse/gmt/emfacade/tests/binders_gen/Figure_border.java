package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Figure_border implements Association<Figure, AbstractBorder> {

  public AbstractBorder get(Figure figure) {
    org.eclipse.draw2d.Border _border = figure.getBorder();
    return _border;
  }

  public void set(Figure figure, AbstractBorder abstractBorder) {
    figure.setBorder(abstractBorder);
  }
}
