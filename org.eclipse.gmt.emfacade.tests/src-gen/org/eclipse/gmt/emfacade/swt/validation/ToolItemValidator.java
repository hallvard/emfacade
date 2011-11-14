/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.emfacade.swt.ToolBar;

/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.swt.ToolItem}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ToolItemValidator {
	boolean validate();

	boolean validateParent(ToolBar value);
	boolean validateEnabled(boolean value);
	boolean validateHotImage(URI value);
	boolean validateToolTipText(String value);
	boolean validateSelection(boolean value);
}
