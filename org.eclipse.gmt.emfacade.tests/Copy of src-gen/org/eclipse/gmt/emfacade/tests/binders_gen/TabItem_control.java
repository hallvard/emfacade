package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabItem;

class TabItem_control implements Association<TabItem, Control> {

  public Control get(TabItem tabItem) {
    org.eclipse.swt.widgets.Control _control = tabItem.getControl();
    return _control;
  }

  public void set(TabItem tabItem, Control control) {
    tabItem.setControl(control);
  }
}
