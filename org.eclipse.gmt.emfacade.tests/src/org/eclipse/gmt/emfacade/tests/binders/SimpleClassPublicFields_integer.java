package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.tests.views.SimpleClassPublicFields;

class SimpleClassPublicFields_integer implements
		GetSetStrategy1.Association<SimpleClassPublicFields, Integer> {
	public Integer get(SimpleClassPublicFields t) 			{ return t.integer;}

	public void set(SimpleClassPublicFields t, Integer e) 	{ t.integer = e;}
}