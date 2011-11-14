package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.RowData;

class RowData_height implements Association<RowData, Integer> {

  public Integer get(RowData rowData) {
    return rowData.height;
  }

  public void set(RowData rowData, Integer integer) {
    rowData.height = integer;
  }
}
