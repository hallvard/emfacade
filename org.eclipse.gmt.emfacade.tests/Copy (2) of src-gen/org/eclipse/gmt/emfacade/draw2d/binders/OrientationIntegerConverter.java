package org.eclipse.gmt.emfacade.draw2d.binders;

import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;
import org.eclipse.gmt.emfacade.draw2d.Orientation;

import org.eclipse.gmt.emfacade.draw2d.Draw2dPackage;

public class OrientationIntegerConverter extends AbstractConverter<Orientation, Integer> implements IConverter<Orientation, Integer> {

	@Override
	public Integer convert(Orientation model, IConverterContext context) {
		
		int _value = model.getValue();
		return _value;
	}
}
