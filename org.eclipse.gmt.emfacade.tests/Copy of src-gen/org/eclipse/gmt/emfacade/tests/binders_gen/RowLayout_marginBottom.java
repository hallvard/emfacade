package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.RowLayout;

class RowLayout_marginBottom implements Association<RowLayout, Integer> {

  public Integer get(RowLayout rowLayout) {
    return rowLayout.marginBottom;
  }

  public void set(RowLayout rowLayout, Integer integer) {
    rowLayout.marginBottom = integer;
  }
}
