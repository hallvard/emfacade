package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Spinner;

class Spinner_maximum implements Association<Spinner, Integer> {

  public Integer get(Spinner spinner) {
    int _maximum = spinner.getMaximum();
    return _maximum;
  }

  public void set(Spinner spinner, Integer integer) {
    spinner.setMaximum(integer);
  }
}
