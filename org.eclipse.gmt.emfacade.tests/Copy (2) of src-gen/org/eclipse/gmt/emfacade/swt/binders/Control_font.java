package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Control;

class Control_font implements Association<Control, Font> {

  public Font get(Control control) {
    org.eclipse.swt.graphics.Font _font = control.getFont();
    return _font;
  }

  public void set(Control control, Font font) {
    control.setFont(font);
  }
}
