package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.text.BlockFlow;
import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;

class BlockFlow_orientation implements Association<BlockFlow, Integer> {

  public Integer get(BlockFlow blockFlow) {
    int _orientation = blockFlow.getOrientation();
    return _orientation;
  }

  public void set(BlockFlow blockFlow, Integer integer) {
    blockFlow.setOrientation(integer);
  }
}
