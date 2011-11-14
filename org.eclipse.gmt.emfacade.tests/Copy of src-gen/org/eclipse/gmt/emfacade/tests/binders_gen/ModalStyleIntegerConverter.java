package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.swt.ModalStyle;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class ModalStyleIntegerConverter extends AbstractConverter<ModalStyle, Integer> implements IConverter<ModalStyle, Integer> {

	@Override
	public Integer convert(ModalStyle model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
