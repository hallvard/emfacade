package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Control;

class Control_background implements Association<Control, Color> {

  public Color get(Control control) {
    org.eclipse.swt.graphics.Color _background = control.getBackground();
    return _background;
  }

  public void set(Control control, Color color) {
    control.setBackground(color);
  }
}
