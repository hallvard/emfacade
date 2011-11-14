package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;

class FormData_right implements Association<FormData, FormAttachment> {

  public FormAttachment get(FormData formData) {
    return formData.right;
  }

  public void set(FormData formData, FormAttachment formAttachment) {
    formData.right = formAttachment;
  }
}
