package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.strategies.AddRemoveStrategyN;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValue;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValueParent;

public class ImmutableValueParent_values implements AddRemoveStrategyN.Association<ImmutableValueParent, ImmutableValue> {
	public void add(ImmutableValueParent t, ImmutableValue e) 	{ t.addValues(e);}
	public void remove(ImmutableValueParent t, ImmutableValue e) { t.removeValues(e);}
}
