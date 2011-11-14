package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.GridData;

class GridData_exclude implements Association<GridData, Boolean> {

  public Boolean get(GridData gridData) {
    return gridData.exclude;
  }

  public void set(GridData gridData, Boolean booleanValue) {
    gridData.exclude = booleanValue;
  }
}
