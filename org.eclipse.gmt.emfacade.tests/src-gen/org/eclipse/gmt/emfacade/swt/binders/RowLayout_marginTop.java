package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.RowLayout;

class RowLayout_marginTop implements Association<RowLayout, Integer> {

  public Integer get(RowLayout rowLayout) {
    return rowLayout.marginTop;
  }

  public void set(RowLayout rowLayout, Integer integer) {
    rowLayout.marginTop = integer;
  }
}
