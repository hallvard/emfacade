package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Slider;

class Slider_selection implements Association<Slider, Integer> {

  public Integer get(Slider slider) {
    int _selection = slider.getSelection();
    return _selection;
  }

  public void set(Slider slider, Integer integer) {
    slider.setSelection(integer);
  }
}
