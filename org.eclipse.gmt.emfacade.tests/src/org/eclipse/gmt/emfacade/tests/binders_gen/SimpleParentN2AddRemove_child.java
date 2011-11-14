package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.*;

import org.eclipse.gmt.emfacade.tests.views.*;



class SimpleParentN2AddRemove_child implements AddRemoveEClassStrategyN.Association<SimpleParentN2AddRemove, SimpleBean> {
			public void addVE(SimpleParentN2AddRemove t, SimpleBean e) { t.addChild(e);}
			public void removeVE(SimpleParentN2AddRemove t, SimpleBean e) { t.removeChild(e);}
	
}
