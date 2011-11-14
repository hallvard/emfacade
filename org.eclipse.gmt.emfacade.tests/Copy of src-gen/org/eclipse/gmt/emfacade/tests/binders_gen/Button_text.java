package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Button;

class Button_text implements Association<Button, String> {

  public String get(Button button) {
    String _text = button.getText();
    return _text;
  }

  public void set(Button button, String string) {
    String _xifexpression = null;
    boolean _operator_notEquals = org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_notEquals(string, null);
    if (_operator_notEquals) {
      _xifexpression = string;
    } else {
      _xifexpression = "";
    }
    button.setText(_xifexpression);
  }
}
