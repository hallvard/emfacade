/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.FeatureMappingStrategy;
import org.eclipse.gmt.emfacade.FeatureMappingStrategyMethodPattern;
import org.eclipse.gmt.emfacade.FeatureMappingStrategyPattern;
import org.eclipse.xtext.common.types.JvmTypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Mapping Strategy Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyPatternImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyPatternImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyPatternImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FeatureMappingStrategyPatternImpl#getMethodPatterns <em>Method Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureMappingStrategyPatternImpl extends EObjectImpl implements FeatureMappingStrategyPattern {
	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmTypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getMethodPatterns() <em>Method Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMappingStrategyMethodPattern> methodPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMappingStrategyPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.FEATURE_MAPPING_STRATEGY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMappingStrategy getStrategy() {
		if (eContainerFeatureID() != EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY) return null;
		return (FeatureMappingStrategy)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy(FeatureMappingStrategy newStrategy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStrategy, EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(FeatureMappingStrategy newStrategy) {
		if (newStrategy != eInternalContainer() || (eContainerFeatureID() != EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY && newStrategy != null)) {
			if (EcoreUtil.isAncestor(this, newStrategy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStrategy != null)
				msgs = ((InternalEObject)newStrategy).eInverseAdd(this, EmfacadePackage.FEATURE_MAPPING_STRATEGY__PATTERNS, FeatureMappingStrategy.class, msgs);
			msgs = basicSetStrategy(newStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY, newStrategy, newStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmTypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<JvmTypeParameter>(JvmTypeParameter.class, this, EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMappingStrategyMethodPattern> getMethodPatterns() {
		if (methodPatterns == null) {
			methodPatterns = new EObjectContainmentEList<FeatureMappingStrategyMethodPattern>(FeatureMappingStrategyMethodPattern.class, this, EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__METHOD_PATTERNS);
		}
		return methodPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStrategy((FeatureMappingStrategy)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY:
				return basicSetStrategy(null, msgs);
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__METHOD_PATTERNS:
				return ((InternalEList<?>)getMethodPatterns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY:
				return eInternalContainer().eInverseRemove(this, EmfacadePackage.FEATURE_MAPPING_STRATEGY__PATTERNS, FeatureMappingStrategy.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY:
				return getStrategy();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__FEATURE_NAME:
				return getFeatureName();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__TYPE_PARAMETERS:
				return getTypeParameters();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__METHOD_PATTERNS:
				return getMethodPatterns();
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
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY:
				setStrategy((FeatureMappingStrategy)newValue);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends JvmTypeParameter>)newValue);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__METHOD_PATTERNS:
				getMethodPatterns().clear();
				getMethodPatterns().addAll((Collection<? extends FeatureMappingStrategyMethodPattern>)newValue);
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
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY:
				setStrategy((FeatureMappingStrategy)null);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__METHOD_PATTERNS:
				getMethodPatterns().clear();
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
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__STRATEGY:
				return getStrategy() != null;
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case EmfacadePackage.FEATURE_MAPPING_STRATEGY_PATTERN__METHOD_PATTERNS:
				return methodPatterns != null && !methodPatterns.isEmpty();
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
		result.append(" (featureName: ");
		result.append(featureName);
		result.append(')');
		return result.toString();
	}

} //FeatureMappingStrategyPatternImpl
