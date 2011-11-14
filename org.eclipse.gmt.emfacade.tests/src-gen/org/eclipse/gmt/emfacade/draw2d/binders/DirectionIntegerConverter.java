package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.draw2d.Direction;

import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public class DirectionIntegerConverter extends AbstractConverter<Direction, Integer> implements IConverter<Direction, Integer> {

	@Override
	public Integer convert(Direction model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
