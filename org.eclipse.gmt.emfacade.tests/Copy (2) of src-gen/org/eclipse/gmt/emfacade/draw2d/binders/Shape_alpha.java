package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_alpha implements Association<Shape, Integer> {

  public Integer get(Shape shape) {
    Integer _alpha = shape.getAlpha();
    return _alpha;
  }

  public void set(Shape shape, Integer integer) {
    shape.setAlpha(integer);
  }
}
