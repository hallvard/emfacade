package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Menu;

class Menu_visible implements Association<Menu, Boolean> {

  public Boolean get(Menu menu) {
    boolean _visible = menu.getVisible();
    return _visible;
  }

  public void set(Menu menu, Boolean booleanValue) {
    menu.setVisible(booleanValue);
  }
}
