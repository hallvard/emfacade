package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Spinner;

class Spinner_digits implements Association<Spinner, Integer> {

  public Integer get(Spinner spinner) {
    int _digits = spinner.getDigits();
    return _digits;
  }

  public void set(Spinner spinner, Integer integer) {
    spinner.setDigits(integer);
  }
}
