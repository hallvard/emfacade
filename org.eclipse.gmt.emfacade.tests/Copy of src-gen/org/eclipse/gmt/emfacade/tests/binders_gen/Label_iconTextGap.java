package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Label;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Label_iconTextGap implements Association<Label, Integer> {

  public Integer get(Label label) {
    int _iconTextGap = label.getIconTextGap();
    return _iconTextGap;
  }

  public void set(Label label, Integer integer) {
    label.setIconTextGap(integer);
  }
}
