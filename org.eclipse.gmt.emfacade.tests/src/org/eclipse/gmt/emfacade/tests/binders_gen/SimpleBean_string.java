package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.strategies.*;

import org.eclipse.gmt.emfacade.tests.views.*;



class SimpleBean_string implements GetSetEDataTypeStrategy1.Association<SimpleBean, String> {
			public String getVE(SimpleBean t) { return t.getString();}
			public void setVE(SimpleBean t, String e) { t.setString(e);}
	
}
