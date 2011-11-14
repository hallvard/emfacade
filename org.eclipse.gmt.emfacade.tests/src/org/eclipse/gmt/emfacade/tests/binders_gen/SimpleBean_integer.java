package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.*;

import org.eclipse.gmt.emfacade.tests.views.*;



class SimpleBean_integer implements GetSetEDataTypeStrategy1.Association<SimpleBean, Integer> {
			public Integer getVE(SimpleBean t) { return t.getInteger();}
			public void setVE(SimpleBean t, Integer e) { t.setInteger(e);}
	
}
