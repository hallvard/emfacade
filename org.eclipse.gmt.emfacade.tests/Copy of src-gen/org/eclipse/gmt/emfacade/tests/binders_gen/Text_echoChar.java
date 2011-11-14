package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Text;

class Text_echoChar implements Association<Text, Character> {

  public Character get(Text text) {
    char _echoChar = text.getEchoChar();
    return _echoChar;
  }

  public void set(Text text, Character character) {
    text.setEchoChar(character);
  }
}
