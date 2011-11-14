package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.BorderStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class BorderStyleIntegerConverter extends AbstractConverter<BorderStyle, Integer> implements IConverter<BorderStyle, Integer> {

	@Override
	public Integer convert(BorderStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
