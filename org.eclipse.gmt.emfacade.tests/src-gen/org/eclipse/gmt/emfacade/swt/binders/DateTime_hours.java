package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.DateTime;

class DateTime_hours implements Association<DateTime, Integer> {

  public Integer get(DateTime dateTime) {
    int _hours = dateTime.getHours();
    return _hours;
  }

  public void set(DateTime dateTime, Integer integer) {
    dateTime.setHours(integer);
  }
}
