package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class MultiplicityStyleIntegerConverter extends AbstractConverter<MultiplicityStyle, Integer> implements IConverter<MultiplicityStyle, Integer> {

	@Override
	public Integer convert(MultiplicityStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
