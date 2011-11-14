package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Combo;

class Combo_text implements Association<Combo, String> {

  public String get(Combo combo) {
    String _text = combo.getText();
    return _text;
  }

  public void set(Combo combo, String string) {
    String _xifexpression = null;
    boolean _operator_notEquals = org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_notEquals(string, null);
    if (_operator_notEquals) {
      _xifexpression = string;
    } else {
      _xifexpression = "";
    }
    combo.setText(_xifexpression);
  }
}
