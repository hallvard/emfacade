package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.ProgressBar;

class ProgressBar_selection implements Association<ProgressBar, Integer> {

  public Integer get(ProgressBar progressBar) {
    int _selection = progressBar.getSelection();
    return _selection;
  }

  public void set(ProgressBar progressBar, Integer integer) {
    progressBar.setSelection(integer);
  }
}
