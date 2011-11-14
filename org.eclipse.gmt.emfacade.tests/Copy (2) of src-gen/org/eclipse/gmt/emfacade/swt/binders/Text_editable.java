package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Text;

class Text_editable implements Association<Text, Boolean> {

  public Boolean get(Text text) {
    boolean _editable = text.getEditable();
    return _editable;
  }

  public void set(Text text, Boolean booleanValue) {
    text.setEditable(booleanValue);
  }
}
