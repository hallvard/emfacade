package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Button;

class Button_selection implements Association<Button, Boolean> {

  public Boolean get(Button button) {
    boolean _selection = button.getSelection();
    return _selection;
  }

  public void set(Button button, Boolean booleanValue) {
    button.setSelection(booleanValue);
  }
}
