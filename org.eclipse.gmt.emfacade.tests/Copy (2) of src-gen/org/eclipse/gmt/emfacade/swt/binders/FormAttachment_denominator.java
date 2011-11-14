package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormAttachment;

class FormAttachment_denominator implements Association<FormAttachment, Integer> {

  public Integer get(FormAttachment formAttachment) {
    return formAttachment.denominator;
  }

  public void set(FormAttachment formAttachment, Integer integer) {
    formAttachment.denominator = integer;
  }
}
