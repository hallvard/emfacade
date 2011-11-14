package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.ButtonStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class ButtonStyleIntegerConverter extends AbstractConverter<ButtonStyle, Integer> implements IConverter<ButtonStyle, Integer> {

	@Override
	public Integer convert(ButtonStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
