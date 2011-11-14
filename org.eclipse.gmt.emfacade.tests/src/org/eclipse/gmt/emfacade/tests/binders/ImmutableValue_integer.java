package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetStrategy1;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValue;

public class ImmutableValue_integer implements GetStrategy1.Association<ImmutableValue, Integer> {
	public Integer get(ImmutableValue t) 			{ return t.getInteger();}
}
