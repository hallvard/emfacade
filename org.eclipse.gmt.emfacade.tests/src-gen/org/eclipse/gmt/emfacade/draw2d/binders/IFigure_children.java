package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN.Association;

class IFigure_children implements Association<IFigure, IFigure> {

  public int getCount(IFigure iFigure) {
    java.util.List _children = iFigure.getChildren();
    int _size = _children.size();
    return _size;
  }

  public IFigure get(IFigure iFigure, int intValue) {
    java.util.List _children = iFigure.getChildren();
    Object _get = _children.get(intValue);
    return ((org.eclipse.draw2d.IFigure) _get);
  }

  public void set(IFigure iFigure_1, int intValue, IFigure iFigure_2) {return;
  }

  public void add(IFigure iFigure_1, int intValue, IFigure iFigure_2) {
    iFigure_1.add(iFigure_2, intValue);
  }

  public void remove(IFigure iFigure, int intValue) {
    java.util.List _children = iFigure.getChildren();
    Object _get = _children.get(intValue);
    iFigure.remove(((org.eclipse.draw2d.IFigure) _get));
  }
}
