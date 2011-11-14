package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Shell;

class Shell_alpha implements Association<Shell, Integer> {

  public Integer get(Shell shell) {
    int _alpha = shell.getAlpha();
    return _alpha;
  }

  public void set(Shell shell, Integer integer) {
    shell.setAlpha(integer);
  }
}
