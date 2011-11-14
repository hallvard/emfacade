package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.LineStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class LineStyleIntegerConverter extends AbstractConverter<LineStyle, Integer> implements IConverter<LineStyle, Integer> {

	@Override
	public Integer convert(LineStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
