package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Spinner;

class Spinner_textLimit implements Association<Spinner, Integer> {

  public Integer get(Spinner spinner) {
    int _textLimit = spinner.getTextLimit();
    return _textLimit;
  }

  public void set(Spinner spinner, Integer integer) {
    spinner.setTextLimit(integer);
  }
}
