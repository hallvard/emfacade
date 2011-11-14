package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Triangle;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Triangle_orientation implements Association<Triangle, Integer> {

  public Integer get(Triangle triangle) {return null;
  }

  public void set(Triangle triangle, Integer integer) {
    triangle.setOrientation(integer);
  }
}
