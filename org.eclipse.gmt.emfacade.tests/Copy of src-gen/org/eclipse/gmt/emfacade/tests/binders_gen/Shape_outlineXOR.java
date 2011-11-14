package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Shape;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Shape_outlineXOR implements Association<Shape, Boolean> {

  public Boolean get(Shape shape) {return null;
  }

  public void set(Shape shape, Boolean booleanValue) {
    shape.setOutlineXOR(booleanValue);
  }
}
