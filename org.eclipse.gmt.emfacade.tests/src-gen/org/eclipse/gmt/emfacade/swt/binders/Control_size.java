package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;

class Control_size implements Association<Control, Point> {

  public Point get(Control control) {
    org.eclipse.swt.graphics.Point _size = control.getSize();
    return _size;
  }

  public void set(Control control, Point point) {
    boolean _operator_notEquals = org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_notEquals(point, null);
    if (_operator_notEquals) {
      control.setSize(point);
    }
  }
}
