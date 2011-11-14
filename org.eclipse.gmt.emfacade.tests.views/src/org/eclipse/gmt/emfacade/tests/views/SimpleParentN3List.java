package org.eclipse.gmt.emfacade.tests.views;

import java.util.ArrayList;
import java.util.List;

public class SimpleParentN3List {

	private List<SimpleBean> children;
	
	public SimpleParentN3List() {
		children = new ArrayList<SimpleBean>();
	}

	public List<SimpleBean> getChildren() {
		return children;
	}
}
