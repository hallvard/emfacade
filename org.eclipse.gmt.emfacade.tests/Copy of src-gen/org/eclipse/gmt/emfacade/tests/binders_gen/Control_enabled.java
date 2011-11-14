package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Control;

class Control_enabled implements Association<Control, Boolean> {

  public Boolean get(Control control) {
    boolean _enabled = control.getEnabled();
    return _enabled;
  }

  public void set(Control control, Boolean booleanValue) {
    control.setEnabled(booleanValue);
  }
}
