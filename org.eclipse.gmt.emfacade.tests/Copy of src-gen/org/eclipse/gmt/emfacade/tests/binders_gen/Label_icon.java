package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class Label_icon implements Association<Label, URI> {

  public URI get(Label label) {
    org.eclipse.swt.graphics.Image _icon = label.getIcon();
    return _icon;
  }

  public void set(Label label, URI uRI) {
    final org.eclipse.emf.common.util.URI typeConverted_uRI = (org.eclipse.emf.common.util.URI)uRI;
    label.setIcon(typeConverted_uRI);
  }
}
