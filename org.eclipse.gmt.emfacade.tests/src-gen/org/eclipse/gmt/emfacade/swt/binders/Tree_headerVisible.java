package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Tree;

class Tree_headerVisible implements Association<Tree, Boolean> {

  public Boolean get(Tree tree) {
    boolean _headerVisible = tree.getHeaderVisible();
    return _headerVisible;
  }

  public void set(Tree tree, Boolean booleanValue) {
    tree.setHeaderVisible(booleanValue);
  }
}
