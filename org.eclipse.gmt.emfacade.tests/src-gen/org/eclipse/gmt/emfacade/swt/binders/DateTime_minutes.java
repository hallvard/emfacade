package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.DateTime;

class DateTime_minutes implements Association<DateTime, Integer> {

  public Integer get(DateTime dateTime) {
    int _minutes = dateTime.getMinutes();
    return _minutes;
  }

  public void set(DateTime dateTime, Integer integer) {
    dateTime.setMinutes(integer);
  }
}
