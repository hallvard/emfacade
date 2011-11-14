package org.eclipse.gmt.emfacade.tests.views;

public class SimpleControl {

	private SimpleComposite parent;

	public SimpleControl(SimpleComposite parent) {
		super();
		this.parent = parent;
		if (parent != null) {
			parent.addChild(this);
		}
	}
	
	public void dispose() {
		if (parent != null) {
			parent.removeChild(this);
			parent = null;
		}
	}

	public SimpleComposite getParent() {
		return parent;
	}
}
