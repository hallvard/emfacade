package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.AddRemoveStrategyN.Association;
import org.eclipse.swt.widgets.List;

class List_selectionIndices implements Association<List, Integer> {

  public void add(List list, Integer integer) {
    list.select(integer);
  }

  public void remove(List list, Integer integer) {
    list.deselect(integer);
  }
}
