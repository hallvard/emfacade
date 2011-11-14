package org.eclipse.gmt.emfacade.tests.binders;

import java.util.List;

import org.eclipse.gmt.emfacade.builder.strategies.ListStrategyN;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN3List;

class SimpleParentN3List_child implements
		ListStrategyN.Association<SimpleParentN3List, SimpleBean> {
	public List<SimpleBean> getVE(SimpleParentN3List t) { return t.getChildren();}
}