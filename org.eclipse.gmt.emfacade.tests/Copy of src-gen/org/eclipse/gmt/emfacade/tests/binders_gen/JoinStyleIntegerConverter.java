package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.JoinStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class JoinStyleIntegerConverter extends AbstractConverter<JoinStyle, Integer> implements IConverter<JoinStyle, Integer> {

	@Override
	public Integer convert(JoinStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
