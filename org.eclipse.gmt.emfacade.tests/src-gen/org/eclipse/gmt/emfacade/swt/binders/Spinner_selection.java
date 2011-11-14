package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Spinner;

class Spinner_selection implements Association<Spinner, Integer> {

  public Integer get(Spinner spinner) {
    int _selection = spinner.getSelection();
    return _selection;
  }

  public void set(Spinner spinner, Integer integer) {
    spinner.setSelection(integer);
  }
}
