/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.validation;

import org.eclipse.gmt.emfacade.swt.HorizontalAlignmentStyle;
import org.eclipse.gmt.emfacade.swt.VerticalAlignmentStyle;


/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.swt.GridData}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GridDataValidator {
	boolean validate();

	boolean validateVerticalAlignment(VerticalAlignmentStyle value);

	boolean validateHorizontalAlignment(HorizontalAlignmentStyle value);

	boolean validateVerticalAlignment(int value);
	boolean validateHorizontalAlignment(int value);
	boolean validateWidthHint(int value);
	boolean validateHeightHint(int value);
	boolean validateHorizontalIndent(int value);
	boolean validateVerticalIndent(int value);
	boolean validateHorizontalSpan(int value);
	boolean validateVerticalSpan(int value);
	boolean validateGrabExcessHorizontalSpace(boolean value);
	boolean validateGrabExcessVerticalSpace(boolean value);
	boolean validateMinimumWidth(int value);
	boolean validateMinimumHeight(int value);
	boolean validateExclude(boolean value);
}