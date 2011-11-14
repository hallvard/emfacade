package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Figure;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Figure_opaque implements Association<Figure, Boolean> {

  public Boolean get(Figure figure) {return null;
  }

  public void set(Figure figure, Boolean booleanValue) {
    figure.setOpaque(booleanValue);
  }
}
