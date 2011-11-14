package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.List;

class List_selectionIndex implements Association<List, Integer> {

  public Integer get(List list) {
    int _selectionIndex = list.getSelectionIndex();
    return _selectionIndex;
  }

  public void set(List list, Integer integer) {
    list.setSelection(integer);
  }
}
