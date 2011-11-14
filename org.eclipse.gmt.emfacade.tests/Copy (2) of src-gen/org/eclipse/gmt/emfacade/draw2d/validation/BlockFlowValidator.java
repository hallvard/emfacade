/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d.validation;

import org.eclipse.gmt.emfacade.draw2d.Orientation;


/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.draw2d.BlockFlow}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BlockFlowValidator {
	boolean validate();

	boolean validateOrientation(Orientation value);

}