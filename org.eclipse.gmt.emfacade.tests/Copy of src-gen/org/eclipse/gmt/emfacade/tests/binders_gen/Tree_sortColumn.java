package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

class Tree_sortColumn implements Association<Tree, TreeColumn> {

  public TreeColumn get(Tree tree) {
    org.eclipse.swt.widgets.TreeColumn _sortColumn = tree.getSortColumn();
    return _sortColumn;
  }

  public void set(Tree tree, TreeColumn treeColumn) {
    tree.setSortColumn(treeColumn);
  }
}
