package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.DateTime;

class DateTime_year implements Association<DateTime, Integer> {

  public Integer get(DateTime dateTime) {
    int _year = dateTime.getYear();
    return _year;
  }

  public void set(DateTime dateTime, Integer integer) {
    dateTime.setYear(integer);
  }
}
