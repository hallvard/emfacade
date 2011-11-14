package org.eclipse.gmt.emfacade.tests.views;

import java.util.ArrayList;
import java.util.List;

public class ImmutableValueParent {

	private ImmutableValue value;
	private List<ImmutableValue> values = new ArrayList<ImmutableValue>();

	public ImmutableValue getValue() {
		return value;
	}

	public void setValue(ImmutableValue value) {
		this.value = value;
	}
	
	// Only used for testing!!!
	public ImmutableValue[] getValues() {
		return values.toArray(new ImmutableValue[values.size()]);
	}

	public void addValues(ImmutableValue value) {
		values.add(value);
	}
	
	public void removeValues(ImmutableValue value) {
		values.remove(value);
	}
}
