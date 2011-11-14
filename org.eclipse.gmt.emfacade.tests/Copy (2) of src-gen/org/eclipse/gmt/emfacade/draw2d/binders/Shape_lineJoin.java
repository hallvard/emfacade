package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_lineJoin implements Association<Shape, Integer> {

  public Integer get(Shape shape) {
    int _lineJoin = shape.getLineJoin();
    return _lineJoin;
  }

  public void set(Shape shape, Integer integer) {
    shape.setLineJoin(integer);
  }
}
