package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Slider;

class Slider_increment implements Association<Slider, Integer> {

  public Integer get(Slider slider) {
    int _increment = slider.getIncrement();
    return _increment;
  }

  public void set(Slider slider, Integer integer) {
    slider.setIncrement(integer);
  }
}
