package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.browser.Browser;

class Browser_javascriptEnabled implements Association<Browser, Boolean> {

  public Boolean get(Browser browser) {
    boolean _javascriptEnabled = browser.getJavascriptEnabled();
    return _javascriptEnabled;
  }

  public void set(Browser browser, Boolean booleanValue) {
    browser.setJavascriptEnabled(booleanValue);
  }
}
