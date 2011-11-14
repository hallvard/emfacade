package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.tests.views.SimpleClassPublicFields;

class SimpleClassPublicFields_string implements
		GetSetStrategy1.Association<SimpleClassPublicFields, String> {
	public String get(SimpleClassPublicFields t) 			{ return t.string;}

	public void set(SimpleClassPublicFields t, String e)	{ t.string = e;}
}