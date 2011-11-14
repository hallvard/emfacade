package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Shell;

class Shell_fullScreen implements Association<Shell, Boolean> {

  public Boolean get(Shell shell) {
    boolean _fullScreen = shell.getFullScreen();
    return _fullScreen;
  }

  public void set(Shell shell, Boolean booleanValue) {
    shell.setFullScreen(booleanValue);
  }
}
