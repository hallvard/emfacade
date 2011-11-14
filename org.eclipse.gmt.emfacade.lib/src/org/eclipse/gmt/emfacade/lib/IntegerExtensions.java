package org.eclipse.gmt.emfacade.lib;

public class IntegerExtensions extends org.eclipse.xtext.xbase.lib.IntegerExtensions {
	/**
	 * The binary <code>bitwise or</code> operator. This is the equivalent to the java <code>|</code> operator.
	 * 
	 * @param a
	 *            an integer. May not be <code>null</code>.
	 * @param b
	 *            a number. May not be <code>null</code>.
	 * @return <code>a+b</code>
	 * @throws NullPointerException
	 *             if {@code a} or {@code b} is <code>null</code>.
	 */
	public static int operator_bitor(Integer a, Number b) {
		return a | b.intValue();
	}	
}
