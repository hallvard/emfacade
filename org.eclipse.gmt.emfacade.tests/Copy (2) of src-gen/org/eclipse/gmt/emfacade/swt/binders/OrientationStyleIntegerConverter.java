package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.OrientationStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class OrientationStyleIntegerConverter extends AbstractConverter<OrientationStyle, Integer> implements IConverter<OrientationStyle, Integer> {

	@Override
	public Integer convert(OrientationStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
