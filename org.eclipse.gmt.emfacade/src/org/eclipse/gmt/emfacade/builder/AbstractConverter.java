/*******************************************************************************
 * Copyright (c) 2008 Hallvard Traetteberg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hallvard Traetteberg - initial API and implementation
 ******************************************************************************/
package org.eclipse.gmt.emfacade.builder;

public abstract class AbstractConverter<Model, View> implements IConverter<Model, View> {
	
	public View convert(Model model, IConverterContext context) {
		return null;
	}

	public boolean unequal(Model model, View view, IConverterContext context) {
		return unequal(convert(model, context), view);
	}
	
	// utility methods for comparison
	
	public static boolean unequal(boolean 	v1, boolean v2) 	{ return v1 != v2;} 
	public static boolean unequal(byte 		v1, byte 	v2) 	{ return v1 != v2;} 
	public static boolean unequal(short		v1, short 	v2) 	{ return v1 != v2;} 
	public static boolean unequal(char		v1, char 	v2) 	{ return v1 != v2;} 
	public static boolean unequal(int 		v1, int 	v2) 	{ return v1 != v2;} 
	public static boolean unequal(long 		v1, long 	v2) 	{ return v1 != v2;} 
	public static boolean unequal(float 	v1, float 	v2) 	{ return v1 != v2;}
	public static boolean unequal(double 	v1, double 	v2) 	{ return v1 != v2;}
	public static boolean unequal(Object 	o1, Object 	o2) 	{ return o1 != o2 && (o1 == null || (! o1.equals(o2)));}
}
