/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.validation;

import org.eclipse.gmt.emfacade.swt.MultiplicityStyle;
import org.eclipse.swt.graphics.Point;


/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.swt.Text}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TextValidator {
	boolean validate();

	boolean validateMultiplicityStyle(MultiplicityStyle value);

	boolean validateSearchBit(boolean value);

	boolean validatePasswordBit(boolean value);

	boolean validateText(String value);

	boolean validateSelection(Point value);

	boolean validateEditable(boolean value);

	boolean validateEchoChar(char value);

	boolean validateTabs(int value);

	boolean validateTextLimit(int value);

	boolean validateTopIndex(int value);

	boolean validateMessage(String value);
}