package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

class MenuItem_menu implements Association<MenuItem, Menu> {

  public Menu get(MenuItem menuItem) {
    org.eclipse.swt.widgets.Menu _menu = menuItem.getMenu();
    return _menu;
  }

  public void set(MenuItem menuItem, Menu menu) {
    menuItem.setMenu(menu);
  }
}
