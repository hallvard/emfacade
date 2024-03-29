/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.emfacade.swt.Decorations;
import org.eclipse.gmt.emfacade.swt.MenuItem;
import org.eclipse.gmt.emfacade.swt.MenuStyle;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;

/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.swt.Menu}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MenuValidator {
	boolean validate();

	boolean validateMenuStyle(MenuStyle value);

	boolean validateParent(Decorations value);
	boolean validateParentItem(MenuItem value);
	boolean validateTextOrientationStyle(TextOrientationStyle value);
	boolean validateVisible(boolean value);
	boolean validateEnabled(boolean value);
	boolean validateItems(EList<MenuItem> value);
}
