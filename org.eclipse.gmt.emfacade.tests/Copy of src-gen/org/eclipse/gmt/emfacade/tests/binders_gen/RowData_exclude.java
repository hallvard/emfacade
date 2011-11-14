package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.RowData;

class RowData_exclude implements Association<RowData, Boolean> {

  public Boolean get(RowData rowData) {
    return rowData.exclude;
  }

  public void set(RowData rowData, Boolean booleanValue) {
    rowData.exclude = booleanValue;
  }
}
