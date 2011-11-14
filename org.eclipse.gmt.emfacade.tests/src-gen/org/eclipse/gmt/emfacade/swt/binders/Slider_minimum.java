package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Slider;

class Slider_minimum implements Association<Slider, Integer> {

  public Integer get(Slider slider) {
    int _minimum = slider.getMinimum();
    return _minimum;
  }

  public void set(Slider slider, Integer integer) {
    slider.setMinimum(integer);
  }
}
