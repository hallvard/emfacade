package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Label;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Label_textAlignment implements Association<Label, Integer> {

  public Integer get(Label label) {
    int _textAlignment = label.getTextAlignment();
    return _textAlignment;
  }

  public void set(Label label, Integer integer) {
    label.setTextAlignment(integer);
  }
}
