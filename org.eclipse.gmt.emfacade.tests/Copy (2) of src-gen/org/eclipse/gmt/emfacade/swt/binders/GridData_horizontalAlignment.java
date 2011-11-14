package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.GridData;

class GridData_horizontalAlignment implements Association<GridData, Integer> {

  public Integer get(GridData gridData) {
    return gridData.horizontalAlignment;
  }

  public void set(GridData gridData, Integer integer) {
    gridData.horizontalAlignment = integer;
  }
}
