package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormLayout;

class FormLayout_spacing implements Association<FormLayout, Integer> {

  public Integer get(FormLayout formLayout) {
    return formLayout.spacing;
  }

  public void set(FormLayout formLayout, Integer integer) {
    formLayout.spacing = integer;
  }
}
