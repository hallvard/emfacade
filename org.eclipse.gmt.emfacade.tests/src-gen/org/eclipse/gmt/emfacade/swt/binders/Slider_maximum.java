package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Slider;

class Slider_maximum implements Association<Slider, Integer> {

  public Integer get(Slider slider) {
    int _maximum = slider.getMaximum();
    return _maximum;
  }

  public void set(Slider slider, Integer integer) {
    slider.setMaximum(integer);
  }
}
