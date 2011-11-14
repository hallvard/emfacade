package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Item;

class Item_text implements Association<Item, String> {

  public String get(Item item) {
    String _text = item.getText();
    return _text;
  }

  public void set(Item item, String string) {
    String _xifexpression = null;
    boolean _operator_notEquals = org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_notEquals(string, null);
    if (_operator_notEquals) {
      _xifexpression = string;
    } else {
      _xifexpression = "";
    }
    item.setText(_xifexpression);
  }
}
