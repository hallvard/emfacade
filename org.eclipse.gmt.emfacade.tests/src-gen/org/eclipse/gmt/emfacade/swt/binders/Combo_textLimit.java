package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Combo;

class Combo_textLimit implements Association<Combo, Integer> {

  public Integer get(Combo combo) {
    int _textLimit = combo.getTextLimit();
    return _textLimit;
  }

  public void set(Combo combo, Integer integer) {
    Integer _xifexpression = null;
    boolean _operator_greaterThan = org.eclipse.xtext.xbase.lib.ComparableExtensions.<Integer>operator_greaterThan(integer, ((Integer)0));
    if (_operator_greaterThan) {
      _xifexpression = integer;
    } else {
      _xifexpression = org.eclipse.swt.widgets.Text.LIMIT;
    }
    combo.setTextLimit(_xifexpression);
  }
}
