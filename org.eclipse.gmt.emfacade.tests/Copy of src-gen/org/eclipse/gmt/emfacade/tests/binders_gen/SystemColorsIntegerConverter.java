package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.SystemColors;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class SystemColorsIntegerConverter extends AbstractConverter<SystemColors, Integer> implements IConverter<SystemColors, Integer> {

	@Override
	public Integer convert(SystemColors model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
