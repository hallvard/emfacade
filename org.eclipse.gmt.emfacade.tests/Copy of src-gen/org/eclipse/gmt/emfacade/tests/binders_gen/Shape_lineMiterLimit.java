package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_lineMiterLimit implements Association<Shape, Integer> {

  public Integer get(Shape shape) {
    float _lineMiterLimit = shape.getLineMiterLimit();
    return _lineMiterLimit;
  }

  public void set(Shape shape, Integer integer) {
    shape.setLineMiterLimit(integer);
  }
}
