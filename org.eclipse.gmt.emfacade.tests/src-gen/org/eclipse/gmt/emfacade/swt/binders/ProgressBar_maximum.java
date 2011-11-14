package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.ProgressBar;

class ProgressBar_maximum implements Association<ProgressBar, Integer> {

  public Integer get(ProgressBar progressBar) {
    int _maximum = progressBar.getMaximum();
    return _maximum;
  }

  public void set(ProgressBar progressBar, Integer integer) {
    progressBar.setMaximum(integer);
  }
}
