package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FillLayout;

class FillLayout_orientationStyle implements Association<FillLayout, Integer> {

  public Integer get(FillLayout fillLayout) {
    return fillLayout.type;
  }

  public void set(FillLayout fillLayout, Integer integer) {
    fillLayout.type = integer;
  }
}
