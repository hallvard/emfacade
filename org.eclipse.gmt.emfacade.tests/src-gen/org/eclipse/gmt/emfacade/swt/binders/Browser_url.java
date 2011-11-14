package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.browser.Browser;

class Browser_url implements Association<Browser, String> {

  public String get(Browser browser) {
    String _url = browser.getUrl();
    return _url;
  }

  public void set(Browser browser, String string) {
    browser.setUrl(string);
  }
}
