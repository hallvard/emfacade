package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.DateTime;

class DateTime_month implements Association<DateTime, Integer> {

  public Integer get(DateTime dateTime) {
    int _month = dateTime.getMonth();
    return _month;
  }

  public void set(DateTime dateTime, Integer integer) {
    dateTime.setMonth(integer);
  }
}
