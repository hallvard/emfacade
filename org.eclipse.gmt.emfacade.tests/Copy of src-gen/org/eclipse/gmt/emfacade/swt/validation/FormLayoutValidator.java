/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.validation;


/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.swt.FormLayout}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FormLayoutValidator {
	boolean validate();

	boolean validateMarginWidth(int value);
	boolean validateMarginHeight(int value);
	boolean validateSpacing(int value);
	boolean validateMarginLeft(int value);
	boolean validateMarginTop(int value);
	boolean validateMarginRight(int value);
	boolean validateMarginBottom(int value);
}
