package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValue;

public class ImmutableValue_string implements GetStrategy1.Association<ImmutableValue, String> {
	public String get(ImmutableValue t) 			{ return t.getString();}
}
