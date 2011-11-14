package org.eclipse.gmt.emfacade.tests.views;

import java.util.ArrayList;
import java.util.List;

public class SimpleComposite extends SimpleControl {
	
	public SimpleComposite(SimpleComposite parent) {
		super(parent);
	}

	private List<SimpleControl> children = new ArrayList<SimpleControl>();
	
	public SimpleControl[] getChildren() {
		return children.toArray(new SimpleControl[children.size()]);
	}
	
	void addChild(SimpleControl child) {
		children.add(child);
	}
	
	void removeChild(SimpleControl child) {
		children.remove(child);
	}
}
