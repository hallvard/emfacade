/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.TypeListPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type List Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.TypeListPatternImpl#getParameterTypePatterns <em>Parameter Type Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeListPatternImpl extends EObjectImpl implements TypeListPattern {
	/**
	 * The cached value of the '{@link #getParameterTypePatterns() <em>Parameter Type Patterns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypePatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameterTypePatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeListPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.TYPE_LIST_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameterTypePatterns() {
		if (parameterTypePatterns == null) {
			parameterTypePatterns = new EDataTypeUniqueEList<String>(String.class, this, EmfacadePackage.TYPE_LIST_PATTERN__PARAMETER_TYPE_PATTERNS);
		}
		return parameterTypePatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfacadePackage.TYPE_LIST_PATTERN__PARAMETER_TYPE_PATTERNS:
				return getParameterTypePatterns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfacadePackage.TYPE_LIST_PATTERN__PARAMETER_TYPE_PATTERNS:
				getParameterTypePatterns().clear();
				getParameterTypePatterns().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfacadePackage.TYPE_LIST_PATTERN__PARAMETER_TYPE_PATTERNS:
				getParameterTypePatterns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfacadePackage.TYPE_LIST_PATTERN__PARAMETER_TYPE_PATTERNS:
				return parameterTypePatterns != null && !parameterTypePatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (parameterTypePatterns: ");
		result.append(parameterTypePatterns);
		result.append(')');
		return result.toString();
	}

} //TypeListPatternImpl
