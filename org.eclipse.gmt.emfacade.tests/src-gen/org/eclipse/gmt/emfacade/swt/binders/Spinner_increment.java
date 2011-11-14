package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Spinner;

class Spinner_increment implements Association<Spinner, Integer> {

  public Integer get(Spinner spinner) {
    int _increment = spinner.getIncrement();
    return _increment;
  }

  public void set(Spinner spinner, Integer integer) {
    spinner.setIncrement(integer);
  }
}
