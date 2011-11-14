package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class HorizontalAlignmentStyleIntegerConverter extends AbstractConverter<HorizontalAlignmentStyle, Integer> implements IConverter<HorizontalAlignmentStyle, Integer> {

	@Override
	public Integer convert(HorizontalAlignmentStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
