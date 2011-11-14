package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;

class FormData_left implements Association<FormData, FormAttachment> {

  public FormAttachment get(FormData formData) {
    return formData.left;
  }

  public void set(FormData formData, FormAttachment formAttachment) {
    formData.left = formAttachment;
  }
}
