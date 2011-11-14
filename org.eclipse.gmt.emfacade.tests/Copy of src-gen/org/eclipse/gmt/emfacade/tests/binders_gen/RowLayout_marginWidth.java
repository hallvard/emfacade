package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.RowLayout;

class RowLayout_marginWidth implements Association<RowLayout, Integer> {

  public Integer get(RowLayout rowLayout) {
    return rowLayout.marginWidth;
  }

  public void set(RowLayout rowLayout, Integer integer) {
    rowLayout.marginWidth = integer;
  }
}
