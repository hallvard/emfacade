package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.GridLayout;

class GridLayout_makeColumnsEqualWidth implements Association<GridLayout, Boolean> {

  public Boolean get(GridLayout gridLayout) {
    return gridLayout.makeColumnsEqualWidth;
  }

  public void set(GridLayout gridLayout, Boolean booleanValue) {
    gridLayout.makeColumnsEqualWidth = booleanValue;
  }
}
