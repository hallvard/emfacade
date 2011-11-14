package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IConverter;
import org.eclipse.gmt.emfacade.builder.IConverterContext;

import org.eclipse.gmt.emfacade.swt.SwtPackage;

public class URIStringConverter extends AbstractConverter<URI, String> implements IConverter<URI, String> {

	@Override
	public String convert(URI model, IConverterContext _context) {
		
		String _string = model.toString();
		return _string;
	}
}
