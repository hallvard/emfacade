package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Spinner;

class Spinner_pageIncrement implements Association<Spinner, Integer> {

  public Integer get(Spinner spinner) {
    int _pageIncrement = spinner.getPageIncrement();
    return _pageIncrement;
  }

  public void set(Spinner spinner, Integer integer) {
    spinner.setPageIncrement(integer);
  }
}
