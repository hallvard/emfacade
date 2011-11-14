package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleParent1GetSet;

public class SimpleParent1GetSet_child<View extends SimpleParent1GetSet> implements GetSetStrategy1.Association<View, SimpleBean> {
	public SimpleBean get(View t) 			{ return t.getChild();}
	public void set(View t, SimpleBean e) 	{ t.setChild(e);}
}
