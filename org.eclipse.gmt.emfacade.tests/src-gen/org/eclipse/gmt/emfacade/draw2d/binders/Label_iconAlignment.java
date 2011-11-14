package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.Label;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Label_iconAlignment implements Association<Label, Integer> {

  public Integer get(Label label) {
    int _iconAlignment = label.getIconAlignment();
    return _iconAlignment;
  }

  public void set(Label label, Integer integer) {
    label.setIconAlignment(integer);
  }
}
