package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.ProgressBar;

class ProgressBar_minimum implements Association<ProgressBar, Integer> {

  public Integer get(ProgressBar progressBar) {
    int _minimum = progressBar.getMinimum();
    return _minimum;
  }

  public void set(ProgressBar progressBar, Integer integer) {
    progressBar.setMinimum(integer);
  }
}
