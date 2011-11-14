package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.RowLayout;

class RowLayout_fill implements Association<RowLayout, Boolean> {

  public Boolean get(RowLayout rowLayout) {
    return rowLayout.fill;
  }

  public void set(RowLayout rowLayout, Boolean booleanValue) {
    rowLayout.fill = booleanValue;
  }
}
