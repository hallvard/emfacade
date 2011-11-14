package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.*;

import org.eclipse.gmt.emfacade.tests.views.*;



class SimpleParent1GetSet_child implements GetSetEClassStrategy1.Association<SimpleParent1GetSet, SimpleBean> {
			public SimpleBean getVE(SimpleParent1GetSet t) { return t.getChild();}
			public void setVE(SimpleParent1GetSet t, SimpleBean e) { t.setChild(e);}
	
}
