package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormAttachment;

class FormAttachment_offset implements Association<FormAttachment, Integer> {

  public Integer get(FormAttachment formAttachment) {
    return formAttachment.offset;
  }

  public void set(FormAttachment formAttachment, Integer integer) {
    formAttachment.offset = integer;
  }
}
