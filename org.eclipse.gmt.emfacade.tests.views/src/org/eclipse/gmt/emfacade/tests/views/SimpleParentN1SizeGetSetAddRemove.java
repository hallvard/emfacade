package org.eclipse.gmt.emfacade.tests.views;

import java.util.ArrayList;
import java.util.List;

public class SimpleParentN1SizeGetSetAddRemove {

	private List<SimpleBean> children;
	
	public SimpleParentN1SizeGetSetAddRemove() {
		super();
		children = new ArrayList<SimpleBean>();
	}

	public int getChildCount() {
		return children.size();
	}
	public SimpleBean getChild(int i) {
		return children.get(i);
	}
	public void setChild(int i, SimpleBean simpleBean) {
		children.set(i, simpleBean);
	}
	public void addChild(int i, SimpleBean simpleBean) {
		children.add(i, simpleBean);
	}
	public void removeChild(int i) {
		children.remove(i);
	}
}
