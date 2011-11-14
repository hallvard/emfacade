package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Menu;

class Menu_enabled implements Association<Menu, Boolean> {

  public Boolean get(Menu menu) {
    boolean _enabled = menu.getEnabled();
    return _enabled;
  }

  public void set(Menu menu, Boolean booleanValue) {
    menu.setEnabled(booleanValue);
  }
}
