package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class TextOrientationStyleIntegerConverter extends AbstractConverter<TextOrientationStyle, Integer> implements IConverter<TextOrientationStyle, Integer> {

	@Override
	public Integer convert(TextOrientationStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
