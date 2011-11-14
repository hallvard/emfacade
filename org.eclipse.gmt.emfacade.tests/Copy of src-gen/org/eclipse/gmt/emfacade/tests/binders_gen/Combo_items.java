package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Association;
import org.eclipse.swt.widgets.Combo;

class Combo_items implements Association<Combo, String> {

  public int getCount(Combo combo) {
    int _itemCount = combo.getItemCount();
    return _itemCount;
  }

  public String get(Combo combo, int intValue) {
    String _item = combo.getItem(intValue);
    return _item;
  }

  public void set(Combo combo, int intValue, String string) {
    combo.setItem(intValue, string);
  }

  public void add(Combo combo, int intValue, String string) {
    combo.add(string, intValue);
  }

  public void remove(Combo combo, int intValue) {
    combo.remove(intValue);
  }
}
