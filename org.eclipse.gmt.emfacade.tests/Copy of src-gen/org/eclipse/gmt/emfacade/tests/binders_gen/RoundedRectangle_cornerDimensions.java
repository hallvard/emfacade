package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class RoundedRectangle_cornerDimensions implements Association<RoundedRectangle, Dimension> {

  public Dimension get(RoundedRectangle roundedRectangle) {
    org.eclipse.draw2d.geometry.Dimension _cornerDimensions = roundedRectangle.getCornerDimensions();
    return _cornerDimensions;
  }

  public void set(RoundedRectangle roundedRectangle, Dimension dimension) {
    roundedRectangle.setCornerDimensions(dimension);
  }
}
