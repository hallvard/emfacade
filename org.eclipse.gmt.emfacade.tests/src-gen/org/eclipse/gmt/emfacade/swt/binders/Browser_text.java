package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.browser.Browser;

class Browser_text implements Association<Browser, String> {

  public String get(Browser browser) {
    String _text = browser.getText();
    return _text;
  }

  public void set(Browser browser, String string) {
    browser.setText(string);
  }
}
