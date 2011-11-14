package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.ArrowStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class ArrowStyleIntegerConverter extends AbstractConverter<ArrowStyle, Integer> implements IConverter<ArrowStyle, Integer> {

	@Override
	public Integer convert(ArrowStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
