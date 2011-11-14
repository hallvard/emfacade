package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.DateTime;

class DateTime_day implements Association<DateTime, Integer> {

  public Integer get(DateTime dateTime) {
    int _day = dateTime.getDay();
    return _day;
  }

  public void set(DateTime dateTime, Integer integer) {
    dateTime.setDay(integer);
  }
}
