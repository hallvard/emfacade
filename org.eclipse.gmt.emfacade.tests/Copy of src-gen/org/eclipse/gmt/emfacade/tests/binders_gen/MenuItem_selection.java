package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.MenuItem;

class MenuItem_selection implements Association<MenuItem, Boolean> {

  public Boolean get(MenuItem menuItem) {
    boolean _selection = menuItem.getSelection();
    return _selection;
  }

  public void set(MenuItem menuItem, Boolean booleanValue) {
    menuItem.setSelection(booleanValue);
  }
}
