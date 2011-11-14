package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.TabItem;

class TabItem_toolTipText implements Association<TabItem, String> {

  public String get(TabItem tabItem) {
    String _olTipText = tabItem.getToolTipText();
    return _olTipText;
  }

  public void set(TabItem tabItem, String string) {
    tabItem.setToolTipText(string);
  }
}
