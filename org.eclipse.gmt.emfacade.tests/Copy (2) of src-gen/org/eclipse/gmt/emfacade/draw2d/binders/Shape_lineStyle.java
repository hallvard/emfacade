package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_lineStyle implements Association<Shape, Integer> {

  public Integer get(Shape shape) {
    int _lineStyle = shape.getLineStyle();
    return _lineStyle;
  }

  public void set(Shape shape, Integer integer) {
    shape.setLineStyle(integer);
  }
}
