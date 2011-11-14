package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Slider;

class Slider_pageIncrement implements Association<Slider, Integer> {

  public Integer get(Slider slider) {
    int _pageIncrement = slider.getPageIncrement();
    return _pageIncrement;
  }

  public void set(Slider slider, Integer integer) {
    slider.setPageIncrement(integer);
  }
}
