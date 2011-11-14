package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Label;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Label_text implements Association<Label, String> {

  public String get(Label label) {
    String _text = label.getText();
    return _text;
  }

  public void set(Label label, String string) {
    label.setText(string);
  }
}
