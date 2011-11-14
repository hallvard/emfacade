package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Decorations;

class Decorations_maximized implements Association<Decorations, Boolean> {

  public Boolean get(Decorations decorations) {
    boolean _maximized = decorations.getMaximized();
    return _maximized;
  }

  public void set(Decorations decorations, Boolean booleanValue) {
    decorations.setMaximized(booleanValue);
  }
}
