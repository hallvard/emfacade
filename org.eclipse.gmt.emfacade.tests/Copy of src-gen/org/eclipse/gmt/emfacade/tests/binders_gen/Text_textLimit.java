package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Text;

class Text_textLimit implements Association<Text, Integer> {

  public Integer get(Text text) {
    int _textLimit = text.getTextLimit();
    return _textLimit;
  }

  public void set(Text text, Integer integer) {
    Integer _xifexpression = null;
    boolean _operator_greaterThan = org.eclipse.xtext.xbase.lib.ComparableExtensions.<Integer>operator_greaterThan(integer, ((Integer)0));
    if (_operator_greaterThan) {
      _xifexpression = integer;
    } else {
      _xifexpression = org.eclipse.swt.widgets.Text.LIMIT;
    }
    text.setTextLimit(_xifexpression);
  }
}
