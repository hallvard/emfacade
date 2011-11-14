package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Tree;

class Tree_sortDirection implements Association<Tree, Integer> {

  public Integer get(Tree tree) {
    int _sortDirection = tree.getSortDirection();
    return _sortDirection;
  }

  public void set(Tree tree, Integer integer) {
    tree.setSortDirection(integer);
  }
}
