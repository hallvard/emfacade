/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.EEnumLiteralMapping;
import org.eclipse.gmt.emfacade.EEnumMapping;
import org.eclipse.gmt.emfacade.EmfacadePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEnum Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.EEnumMappingImpl#getLiteralMappings <em>Literal Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEnumMappingImpl extends EDataTypeMappingImpl implements EEnumMapping {
	/**
	 * The cached value of the '{@link #getLiteralMappings() <em>Literal Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<EEnumLiteralMapping> literalMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEnumMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.EENUM_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EEnumLiteralMapping> getLiteralMappings() {
		if (literalMappings == null) {
			literalMappings = new EObjectContainmentEList<EEnumLiteralMapping>(EEnumLiteralMapping.class, this, EmfacadePackage.EENUM_MAPPING__LITERAL_MAPPINGS);
		}
		return literalMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.EENUM_MAPPING__LITERAL_MAPPINGS:
				return ((InternalEList<?>)getLiteralMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfacadePackage.EENUM_MAPPING__LITERAL_MAPPINGS:
				return getLiteralMappings();
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
			case EmfacadePackage.EENUM_MAPPING__LITERAL_MAPPINGS:
				getLiteralMappings().clear();
				getLiteralMappings().addAll((Collection<? extends EEnumLiteralMapping>)newValue);
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
			case EmfacadePackage.EENUM_MAPPING__LITERAL_MAPPINGS:
				getLiteralMappings().clear();
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
			case EmfacadePackage.EENUM_MAPPING__LITERAL_MAPPINGS:
				return literalMappings != null && !literalMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}
} //EEnumMappingImpl
