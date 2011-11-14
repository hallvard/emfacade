package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.ProgressBar;

class ProgressBar_state implements Association<ProgressBar, Integer> {

  public Integer get(ProgressBar progressBar) {
    int _state = progressBar.getState();
    return _state;
  }

  public void set(ProgressBar progressBar, Integer integer) {
    progressBar.setState(integer);
  }
}
