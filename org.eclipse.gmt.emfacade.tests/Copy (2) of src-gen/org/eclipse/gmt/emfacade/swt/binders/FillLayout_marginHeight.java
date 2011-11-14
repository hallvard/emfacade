package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.layout.FillLayout;

class FillLayout_marginHeight implements Association<FillLayout, Integer> {

  public Integer get(FillLayout fillLayout) {
    return fillLayout.marginHeight;
  }

  public void set(FillLayout fillLayout, Integer integer) {
    fillLayout.marginHeight = integer;
  }
}
