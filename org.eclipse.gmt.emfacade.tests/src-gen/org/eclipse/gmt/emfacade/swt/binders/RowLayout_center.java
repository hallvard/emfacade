package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.RowLayout;

class RowLayout_center implements Association<RowLayout, Boolean> {

  public Boolean get(RowLayout rowLayout) {
    return rowLayout.center;
  }

  public void set(RowLayout rowLayout, Boolean booleanValue) {
    rowLayout.center = booleanValue;
  }
}
