package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.CapStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class CapStyleIntegerConverter extends AbstractConverter<CapStyle, Integer> implements IConverter<CapStyle, Integer> {

	@Override
	public Integer convert(CapStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
