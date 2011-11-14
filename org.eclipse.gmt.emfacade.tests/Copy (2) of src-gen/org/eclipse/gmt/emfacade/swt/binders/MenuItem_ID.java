package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.MenuItem;

class MenuItem_ID implements Association<MenuItem, Integer> {

  public Integer get(MenuItem menuItem) {
    int _iD = menuItem.getID();
    return _iD;
  }

  public void set(MenuItem menuItem, Integer integer) {
    menuItem.setID(integer);
  }
}
