package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_lineDash implements Association<Shape, Float> {

  public Float get(Shape shape) {
    float[] _lineDash = shape.getLineDash();
    return _lineDash;
  }

  public void set(Shape shape, Float floatValue) {
    final Float typeConverted_floatValue = (Float)floatValue;
    shape.setLineDash(typeConverted_floatValue);
  }
}
