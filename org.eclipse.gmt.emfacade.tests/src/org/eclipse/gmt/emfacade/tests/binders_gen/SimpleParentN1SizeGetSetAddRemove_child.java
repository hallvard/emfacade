package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveEClassStrategyN;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN1SizeGetSetAddRemove;



class SimpleParentN1SizeGetSetAddRemove_child implements SizeGetSetAddRemoveEClassStrategyN.Association<SimpleParentN1SizeGetSetAddRemove, SimpleBean> {
			public int getVECount(SimpleParentN1SizeGetSetAddRemove t) { return t.getChildCount();}
			public SimpleBean getVE(SimpleParentN1SizeGetSetAddRemove t, int i) { return t.getChild(i);}
			public void setVE(SimpleParentN1SizeGetSetAddRemove t, int i, SimpleBean e) { t.setChild(i, e);}
			public void addVE(SimpleParentN1SizeGetSetAddRemove t, int i, SimpleBean e) { t.addChild(i, e);}
			public void removeVE(SimpleParentN1SizeGetSetAddRemove t, int i) { t.removeChild(i);}
	
}
