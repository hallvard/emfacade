package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Combo;

class Combo_selectionIndex implements Association<Combo, Integer> {

  public Integer get(Combo combo) {
    int _selectionIndex = combo.getSelectionIndex();
    return _selectionIndex;
  }

  public void set(Combo combo, Integer integer) {
    combo.select(integer);
  }
}
