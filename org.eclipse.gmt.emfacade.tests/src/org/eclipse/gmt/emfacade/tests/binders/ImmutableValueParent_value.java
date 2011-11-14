package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.GetSetStrategy1;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValue;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValueParent;

public class ImmutableValueParent_value implements GetSetStrategy1.Association<ImmutableValueParent, ImmutableValue> {
	public ImmutableValue get(ImmutableValueParent t) 			{ return t.getValue();}
	public void set(ImmutableValueParent t, ImmutableValue e) 	{ t.setValue(e);}
}
