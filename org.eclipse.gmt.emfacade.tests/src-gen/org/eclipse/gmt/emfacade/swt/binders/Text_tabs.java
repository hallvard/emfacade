package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Text;

class Text_tabs implements Association<Text, Integer> {

  public Integer get(Text text) {
    int _tabs = text.getTabs();
    return _tabs;
  }

  public void set(Text text, Integer integer) {
    text.setTabs(integer);
  }
}
