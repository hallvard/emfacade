/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.validation;

import org.eclipse.gmt.emfacade.swt.AbstractComposite;
import org.eclipse.gmt.emfacade.swt.BorderStyle;
import org.eclipse.gmt.emfacade.swt.Color;
import org.eclipse.gmt.emfacade.swt.Control;
import org.eclipse.gmt.emfacade.swt.Font;
import org.eclipse.gmt.emfacade.swt.LayoutData;
import org.eclipse.gmt.emfacade.swt.TextOrientationStyle;

/**
 * A sample validator interface for {@link org.eclipse.gmt.emfacade.swt.Control}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ControlValidator {
	boolean validate();

	boolean validateBorderStyle(BorderStyle value);

	boolean validateTouchEnabled(boolean value);

	boolean validateToolTipText(String value);

	boolean validateTextOrientationStyle(TextOrientationStyle value);

	boolean validateBackground(Color value);

	boolean validateFont(Font value);

	boolean validateLayoutData(LayoutData value);

	boolean validateEnabled(boolean value);

	boolean validateVisible(boolean value);

	boolean validateParent(AbstractComposite<Control> value);
}
