package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.draw2d.Alignment;

import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public class AlignmentIntegerConverter extends AbstractConverter<Alignment, Integer> implements IConverter<Alignment, Integer> {

	@Override
	public Integer convert(Alignment model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
