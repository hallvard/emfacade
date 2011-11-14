package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormData;

class FormData_height implements Association<FormData, Integer> {

  public Integer get(FormData formData) {
    return formData.height;
  }

  public void set(FormData formData, Integer integer) {
    formData.height = integer;
  }
}
