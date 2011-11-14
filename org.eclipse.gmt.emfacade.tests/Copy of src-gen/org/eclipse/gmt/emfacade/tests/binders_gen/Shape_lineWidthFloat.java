package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_lineWidthFloat implements Association<Shape, Float> {

  public Float get(Shape shape) {
    float _lineWidthFloat = shape.getLineWidthFloat();
    return _lineWidthFloat;
  }

  public void set(Shape shape, Float floatValue) {
    shape.setLineWidthFloat(floatValue);
  }
}
