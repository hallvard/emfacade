/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.validation;

import org.eclipse.gmt.emfacade.swt.Menu;

/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.swt.MenuItem}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MenuItemValidator {
	boolean validate();

	boolean validateMenu(Menu value);
	boolean validateID(int value);
	boolean validateAccelerator(int value);
	boolean validateEnabled(boolean value);
	boolean validateSelection(boolean value);
}