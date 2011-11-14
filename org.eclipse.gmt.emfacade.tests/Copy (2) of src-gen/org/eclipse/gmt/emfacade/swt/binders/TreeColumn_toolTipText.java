package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1.Association;
import org.eclipse.swt.widgets.TreeColumn;

class TreeColumn_toolTipText implements Association<TreeColumn, String> {

  public String get(TreeColumn treeColumn) {
    String _olTipText = treeColumn.getToolTipText();
    return _olTipText;
  }

  public void set(TreeColumn treeColumn, String string) {
    treeColumn.setToolTipText(string);
  }
}
