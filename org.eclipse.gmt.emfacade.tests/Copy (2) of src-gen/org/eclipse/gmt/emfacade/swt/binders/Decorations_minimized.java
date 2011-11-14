package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Decorations;

class Decorations_minimized implements Association<Decorations, Boolean> {

  public Boolean get(Decorations decorations) {
    boolean _minimized = decorations.getMinimized();
    return _minimized;
  }

  public void set(Decorations decorations, Boolean booleanValue) {
    decorations.setMinimized(booleanValue);
  }
}
