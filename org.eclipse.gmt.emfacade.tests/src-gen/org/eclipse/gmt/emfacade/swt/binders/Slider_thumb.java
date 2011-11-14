package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Slider;

class Slider_thumb implements Association<Slider, Integer> {

  public Integer get(Slider slider) {
    int _thumb = slider.getThumb();
    return _thumb;
  }

  public void set(Slider slider, Integer integer) {
    slider.setThumb(integer);
  }
}
