package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.*;

import org.eclipse.gmt.emfacade.tests.views.*;



class SimpleControl_parent implements GetEClassStrategy1.Association<SimpleControl, SimpleComposite> {
			public SimpleComposite getVE(SimpleControl t) { return t.getParent();}
	
}
