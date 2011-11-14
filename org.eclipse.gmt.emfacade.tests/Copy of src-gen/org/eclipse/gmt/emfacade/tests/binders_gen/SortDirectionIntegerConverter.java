package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.SortDirection;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class SortDirectionIntegerConverter extends AbstractConverter<SortDirection, Integer> implements IConverter<SortDirection, Integer> {

	@Override
	public Integer convert(SortDirection model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
