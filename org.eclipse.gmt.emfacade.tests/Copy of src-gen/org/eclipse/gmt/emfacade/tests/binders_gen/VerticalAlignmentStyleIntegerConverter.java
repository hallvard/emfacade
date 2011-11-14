package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class VerticalAlignmentStyleIntegerConverter extends AbstractConverter<VerticalAlignmentStyle, Integer> implements IConverter<VerticalAlignmentStyle, Integer> {

	@Override
	public Integer convert(VerticalAlignmentStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
