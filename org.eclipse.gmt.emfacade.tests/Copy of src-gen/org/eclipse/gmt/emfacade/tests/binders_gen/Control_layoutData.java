package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Control;

class Control_layoutData implements Association<Control, Object> {

  public Object get(Control control) {
    Object _layoutData = control.getLayoutData();
    return _layoutData;
  }

  public void set(Control control, Object object) {
    control.setLayoutData(object);
  }
}
