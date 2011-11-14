package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.SizeGetSetAddRemoveStrategyN;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN1SizeGetSetAddRemove;

class SimpleParentN1SizeGetSetAddRemove_child implements SizeGetSetAddRemoveStrategyN.Association<SimpleParentN1SizeGetSetAddRemove, SimpleBean> {
	public int getCount(SimpleParentN1SizeGetSetAddRemove t) 						{ return t.getChildCount();}
	public SimpleBean get(SimpleParentN1SizeGetSetAddRemove t, int i) 			{ return t.getChild(i);}
	public void set(SimpleParentN1SizeGetSetAddRemove t, int i, SimpleBean e) 	{ t.setChild(i, e);}
	public void add(SimpleParentN1SizeGetSetAddRemove t, int i, SimpleBean e) 	{ t.addChild(i, e);}
	public void remove(SimpleParentN1SizeGetSetAddRemove t, int i) 				{ t.removeChild(i);}
}
