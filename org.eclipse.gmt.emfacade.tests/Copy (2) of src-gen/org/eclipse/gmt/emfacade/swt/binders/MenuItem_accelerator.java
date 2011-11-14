package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.MenuItem;

class MenuItem_accelerator implements Association<MenuItem, Integer> {

  public Integer get(MenuItem menuItem) {
    int _accelerator = menuItem.getAccelerator();
    return _accelerator;
  }

  public void set(MenuItem menuItem, Integer integer) {
    menuItem.setAccelerator(integer);
  }
}
