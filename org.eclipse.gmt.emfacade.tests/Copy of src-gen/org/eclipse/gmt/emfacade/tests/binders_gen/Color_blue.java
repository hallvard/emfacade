package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1.Association;
import org.eclipse.swt.graphics.Color;

class Color_blue implements Association<Color, Integer> {

  public Integer get(Color color) {
    int _blue = color.getBlue();
    return _blue;
  }
}
