package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Decorations;
import org.eclipse.swt.widgets.Menu;

class Decorations_menuBar implements Association<Decorations, Menu> {

  public Menu get(Decorations decorations) {
    org.eclipse.swt.widgets.Menu _menuBar = decorations.getMenuBar();
    return _menuBar;
  }

  public void set(Decorations decorations, Menu menu) {
    decorations.setMenuBar(menu);
  }
}
