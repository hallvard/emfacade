package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Association;
import org.eclipse.swt.widgets.List;

class List_items implements Association<List, String> {

  public int getCount(List list) {
    int _itemCount = list.getItemCount();
    return _itemCount;
  }

  public String get(List list, int intValue) {
    String _item = list.getItem(intValue);
    return _item;
  }

  public void set(List list, int intValue, String string) {
    list.setItem(intValue, string);
  }

  public void add(List list, int intValue, String string) {
    list.add(string, intValue);
  }

  public void remove(List list, int intValue) {
    list.remove(intValue);
  }
}
