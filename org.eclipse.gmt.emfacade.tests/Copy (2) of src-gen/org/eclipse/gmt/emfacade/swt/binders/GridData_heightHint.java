package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.GridData;

class GridData_heightHint implements Association<GridData, Integer> {

  public Integer get(GridData gridData) {
    return gridData.heightHint;
  }

  public void set(GridData gridData, Integer integer) {
    gridData.heightHint = integer;
  }
}
