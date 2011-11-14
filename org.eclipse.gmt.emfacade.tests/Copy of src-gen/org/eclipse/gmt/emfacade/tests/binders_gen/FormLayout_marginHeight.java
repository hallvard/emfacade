package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FormLayout;

class FormLayout_marginHeight implements Association<FormLayout, Integer> {

  public Integer get(FormLayout formLayout) {
    return formLayout.marginHeight;
  }

  public void set(FormLayout formLayout, Integer integer) {
    formLayout.marginHeight = integer;
  }
}
