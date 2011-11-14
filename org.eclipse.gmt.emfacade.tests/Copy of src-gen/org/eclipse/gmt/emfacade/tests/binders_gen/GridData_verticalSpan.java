package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.GridData;

class GridData_verticalSpan implements Association<GridData, Integer> {

  public Integer get(GridData gridData) {
    return gridData.verticalSpan;
  }

  public void set(GridData gridData, Integer integer) {
    gridData.verticalSpan = integer;
  }
}
