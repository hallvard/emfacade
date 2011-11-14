package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Spinner;

class Spinner_minimum implements Association<Spinner, Integer> {

  public Integer get(Spinner spinner) {
    int _minimum = spinner.getMinimum();
    return _minimum;
  }

  public void set(Spinner spinner, Integer integer) {
    spinner.setMinimum(integer);
  }
}
