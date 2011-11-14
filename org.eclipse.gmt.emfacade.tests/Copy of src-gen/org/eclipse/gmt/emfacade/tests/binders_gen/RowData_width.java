package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.RowData;

class RowData_width implements Association<RowData, Integer> {

  public Integer get(RowData rowData) {
    return rowData.width;
  }

  public void set(RowData rowData, Integer integer) {
    rowData.width = integer;
  }
}
