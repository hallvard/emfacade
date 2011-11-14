package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Text;

class Text_topIndex implements Association<Text, Integer> {

  public Integer get(Text text) {
    int _pIndex = text.getTopIndex();
    return _pIndex;
  }

  public void set(Text text, Integer integer) {
    text.setTopIndex(integer);
  }
}
