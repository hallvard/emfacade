package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_lineDashOffset implements Association<Shape, Float> {

  public Float get(Shape shape) {
    float _lineDashOffset = shape.getLineDashOffset();
    return _lineDashOffset;
  }

  public void set(Shape shape, Float floatValue) {
    shape.setLineDashOffset(floatValue);
  }
}
