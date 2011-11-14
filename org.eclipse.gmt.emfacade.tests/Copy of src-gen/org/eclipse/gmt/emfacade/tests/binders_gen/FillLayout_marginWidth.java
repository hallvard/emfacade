package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FillLayout;

class FillLayout_marginWidth implements Association<FillLayout, Integer> {

  public Integer get(FillLayout fillLayout) {
    return fillLayout.marginWidth;
  }

  public void set(FillLayout fillLayout, Integer integer) {
    fillLayout.marginWidth = integer;
  }
}
