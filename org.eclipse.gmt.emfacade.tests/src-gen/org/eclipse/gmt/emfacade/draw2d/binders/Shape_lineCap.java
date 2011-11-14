package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_lineCap implements Association<Shape, Integer> {

  public Integer get(Shape shape) {
    int _lineCap = shape.getLineCap();
    return _lineCap;
  }

  public void set(Shape shape, Integer integer) {
    shape.setLineCap(integer);
  }
}
