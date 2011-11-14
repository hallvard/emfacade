package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.DateTime;

class DateTime_seconds implements Association<DateTime, Integer> {

  public Integer get(DateTime dateTime) {
    int _seconds = dateTime.getSeconds();
    return _seconds;
  }

  public void set(DateTime dateTime, Integer integer) {
    dateTime.setSeconds(integer);
  }
}
