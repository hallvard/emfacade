package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Label;

class Label_text implements Association<Label, String> {

  public String get(Label label) {
    String _text = label.getText();
    return _text;
  }

  public void set(Label label, String string) {
    String _xifexpression = null;
    boolean _operator_notEquals = org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_notEquals(string, null);
    if (_operator_notEquals) {
      _xifexpression = string;
    } else {
      _xifexpression = "";
    }
    label.setText(_xifexpression);
  }
}
