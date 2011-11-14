package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;

class Composite_layout implements Association<Composite, Layout> {

  public Layout get(Composite composite) {
    org.eclipse.swt.widgets.Layout _layout = composite.getLayout();
    return _layout;
  }

  public void set(Composite composite, Layout layout) {
    composite.setLayout(layout);
  }
}
