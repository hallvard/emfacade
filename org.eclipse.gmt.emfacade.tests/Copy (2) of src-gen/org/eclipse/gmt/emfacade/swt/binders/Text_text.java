package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Text;

class Text_text implements Association<Text, String> {

  public String get(Text text) {
    String _text = text.getText();
    return _text;
  }

  public void set(Text text, String string) {
    String _xifexpression = null;
    boolean _operator_notEquals = org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_notEquals(string, null);
    if (_operator_notEquals) {
      _xifexpression = string;
    } else {
      _xifexpression = "";
    }
    text.setText(_xifexpression);
  }
}
