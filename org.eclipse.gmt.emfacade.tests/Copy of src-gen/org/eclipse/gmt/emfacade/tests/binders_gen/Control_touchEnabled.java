package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Control;

class Control_touchEnabled implements Association<Control, Boolean> {

  public Boolean get(Control control) {
    boolean _uchEnabled = control.getTouchEnabled();
    return _uchEnabled;
  }

  public void set(Control control, Boolean booleanValue) {
    control.setTouchEnabled(booleanValue);
  }
}
