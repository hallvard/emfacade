package org.eclipse.gmt.emfacade.tests.views;

public class SimpleBean {

	private String string;
	private int integer;
	
	public SimpleBean() {
		super();
	}
	
	public String toString() {
		return "[SimpleBean: string=" + string + ", integer=" + integer + "]";
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getInteger() {
		return integer;
	}

	public void setInteger(int integer) {
		this.integer = integer;
	}
}
