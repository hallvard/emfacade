package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_lineMiterLimit implements Association<Shape, Float> {

  public Float get(Shape shape) {
    float _lineMiterLimit = shape.getLineMiterLimit();
    return _lineMiterLimit;
  }

  public void set(Shape shape, Float floatValue) {
    shape.setLineMiterLimit(floatValue);
  }
}
