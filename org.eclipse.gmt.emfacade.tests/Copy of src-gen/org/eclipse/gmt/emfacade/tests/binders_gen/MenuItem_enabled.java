package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.MenuItem;

class MenuItem_enabled implements Association<MenuItem, Boolean> {

  public Boolean get(MenuItem menuItem) {
    boolean _enabled = menuItem.getEnabled();
    return _enabled;
  }

  public void set(MenuItem menuItem, Boolean booleanValue) {
    menuItem.setEnabled(booleanValue);
  }
}
