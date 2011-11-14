package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.AddRemoveStrategyN;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN2AddRemove;

public class SimpleParentN2AddRemove_child implements AddRemoveStrategyN.Association<SimpleParentN2AddRemove, SimpleBean> {
	public void add(SimpleParentN2AddRemove t, SimpleBean e) 	{ t.addChild(e);}
	public void remove(SimpleParentN2AddRemove t, SimpleBean e) { t.removeChild(e);}
}
