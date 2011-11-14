package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.Tree;

class Tree_linesVisible implements Association<Tree, Boolean> {

  public Boolean get(Tree tree) {
    boolean _linesVisible = tree.getLinesVisible();
    return _linesVisible;
  }

  public void set(Tree tree, Boolean booleanValue) {
    tree.setLinesVisible(booleanValue);
  }
}
