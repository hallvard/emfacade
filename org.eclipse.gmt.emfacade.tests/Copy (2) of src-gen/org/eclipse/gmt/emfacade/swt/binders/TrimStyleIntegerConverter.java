package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.TrimStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class TrimStyleIntegerConverter extends AbstractConverter<TrimStyle, Integer> implements IConverter<TrimStyle, Integer> {

	@Override
	public Integer convert(TrimStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
