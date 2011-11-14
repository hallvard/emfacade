/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.validation;

import org.eclipse.gmt.emfacade.swt.FormAttachment;

/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.swt.FormData}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FormDataValidator {
	boolean validate();

	boolean validateWidth(int value);
	boolean validateHeight(int value);
	boolean validateLeft(FormAttachment value);
	boolean validateTop(FormAttachment value);
	boolean validateRight(FormAttachment value);
	boolean validateBottom(FormAttachment value);
}
