/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.validation;


/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.swt.TreeColumn}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TreeColumnValidator {
	boolean validate();

	boolean validateToolTipText(String value);
	boolean validateDisplayText(String value);
}
