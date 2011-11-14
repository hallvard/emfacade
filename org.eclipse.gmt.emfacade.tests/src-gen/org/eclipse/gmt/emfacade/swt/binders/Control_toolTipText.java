package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Control;

class Control_toolTipText implements Association<Control, String> {

  public String get(Control control) {
    String _olTipText = control.getToolTipText();
    return _olTipText;
  }

  public void set(Control control, String string) {
    control.setToolTipText(string);
  }
}
