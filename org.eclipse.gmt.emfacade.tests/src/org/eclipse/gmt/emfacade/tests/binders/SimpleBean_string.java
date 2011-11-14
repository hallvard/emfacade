package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;

public class SimpleBean_string implements
		GetSetStrategy1.Association<SimpleBean, String> {
	public String get(SimpleBean t) 		{ return t.getString();}

	public void set(SimpleBean t, String e) { t.setString(e);}
}