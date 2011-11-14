package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormLayout;

class FormLayout_marginBottom implements Association<FormLayout, Integer> {

  public Integer get(FormLayout formLayout) {
    return formLayout.marginBottom;
  }

  public void set(FormLayout formLayout, Integer integer) {
    formLayout.marginBottom = integer;
  }
}
