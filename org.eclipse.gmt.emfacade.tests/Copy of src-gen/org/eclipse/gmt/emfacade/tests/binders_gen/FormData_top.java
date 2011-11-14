package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;

class FormData_top implements Association<FormData, FormAttachment> {

  public FormAttachment get(FormData formData) {
    return formData.top;
  }

  public void set(FormData formData, FormAttachment formAttachment) {
    formData.top = formAttachment;
  }
}
