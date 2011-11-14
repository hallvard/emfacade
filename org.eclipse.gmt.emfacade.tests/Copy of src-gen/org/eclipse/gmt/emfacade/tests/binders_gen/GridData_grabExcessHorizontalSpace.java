package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.GridData;

class GridData_grabExcessHorizontalSpace implements Association<GridData, Boolean> {

  public Boolean get(GridData gridData) {
    return gridData.grabExcessHorizontalSpace;
  }

  public void set(GridData gridData, Boolean booleanValue) {
    gridData.grabExcessHorizontalSpace = booleanValue;
  }
}
