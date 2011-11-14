package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.GridLayout;

class GridLayout_marginHeight implements Association<GridLayout, Integer> {

  public Integer get(GridLayout gridLayout) {
    return gridLayout.marginHeight;
  }

  public void set(GridLayout gridLayout, Integer integer) {
    gridLayout.marginHeight = integer;
  }
}
