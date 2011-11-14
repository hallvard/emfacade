package org.eclipse.gmt.emfacade.tests.views;

public class ImmutableValue {

	private String string;
	private int integer;
	
	public ImmutableValue(String string, int integer) {
		this.string = string;
		this.integer = integer;
	}

	public String getString() {
		return string;
	}

	public int getInteger() {
		return integer;
	}
}
