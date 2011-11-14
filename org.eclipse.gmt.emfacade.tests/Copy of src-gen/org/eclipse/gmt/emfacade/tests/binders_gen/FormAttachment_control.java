package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Control;

class FormAttachment_control implements Association<FormAttachment, Control> {

  public Control get(FormAttachment formAttachment) {
    return formAttachment.control;
  }

  public void set(FormAttachment formAttachment, Control control) {
    formAttachment.control = control;
  }
}
