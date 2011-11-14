package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;

public class SimpleBean_integer implements GetSetStrategy1.Association<SimpleBean, Integer> {
	public Integer get(SimpleBean t) 			{ return t.getInteger();}
	public void set(SimpleBean t, Integer e) 	{ t.setInteger(e);}
}
