package org.eclipse.gmt.emfacade.tests.views;

import java.util.ArrayList;
import java.util.List;

public class SimpleParentN2AddRemove {

	private List<SimpleBean> children;
	
	public SimpleParentN2AddRemove() {
		children = new ArrayList<SimpleBean>();
	}

	// Only used for testing!!!
	public SimpleBean[] getChildren() {
		return children.toArray(new SimpleBean[children.size()]);
	}
	
	public void addChild(SimpleBean simpleBean) {
		children.add(simpleBean);
	}
	public void removeChild(SimpleBean simpleBean) {
		children.remove(simpleBean);
	}
}
