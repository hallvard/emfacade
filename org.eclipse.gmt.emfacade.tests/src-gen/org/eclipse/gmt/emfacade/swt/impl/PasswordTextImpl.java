/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.emfacade.swt.PasswordText;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.swt.SWT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Password Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PasswordTextImpl extends TextImpl implements PasswordText
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PasswordTextImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SwtPackage.Literals.PASSWORD_TEXT;
	}

	@Override
	public int getStyle() {
		return super.getStyle() | SWT.PASSWORD;
	}
} //PasswordTextImpl
