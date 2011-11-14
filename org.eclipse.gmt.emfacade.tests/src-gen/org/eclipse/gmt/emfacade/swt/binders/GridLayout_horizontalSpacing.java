package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.GridLayout;

class GridLayout_horizontalSpacing implements Association<GridLayout, Integer> {

  public Integer get(GridLayout gridLayout) {
    return gridLayout.horizontalSpacing;
  }

  public void set(GridLayout gridLayout, Integer integer) {
    gridLayout.horizontalSpacing = integer;
  }
}
