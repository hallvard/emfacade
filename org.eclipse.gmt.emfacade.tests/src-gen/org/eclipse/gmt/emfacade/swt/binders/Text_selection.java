package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;

class Text_selection implements Association<Text, Point> {

  public Point get(Text text) {
    org.eclipse.swt.graphics.Point _selection = text.getSelection();
    return _selection;
  }

  public void set(Text text, Point point) {
    boolean _operator_notEquals = org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_notEquals(point, null);
    if (_operator_notEquals) {
      text.setSelection(point.x, point.y);
    }
  }
}
