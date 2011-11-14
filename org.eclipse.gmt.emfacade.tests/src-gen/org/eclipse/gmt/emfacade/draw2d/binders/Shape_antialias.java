package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_antialias implements Association<Shape, Integer> {

  public Integer get(Shape shape) {
    Integer _antialias = shape.getAntialias();
    return _antialias;
  }

  public void set(Shape shape, Integer integer) {
    shape.setAntialias(integer);
  }
}
