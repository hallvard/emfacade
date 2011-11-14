/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.EClassifierMapping;
import org.eclipse.gmt.emfacade.EFeatureMappingOptions;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.FacadeModel;
import org.eclipse.gmt.emfacade.FeatureMappingStrategy;
import org.eclipse.gmt.emfacade.ImportDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl#getUsesFacadeModels <em>Uses Facade Models</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl#getFeatureMappingStrategies <em>Feature Mapping Strategies</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl#getEPackages <em>EPackages</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl#getClassifierMappings <em>Classifier Mappings</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.FacadeModelImpl#getFeatureMappingDefaults <em>Feature Mapping Defaults</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacadeModelImpl extends DefaultNameImpl implements FacadeModel {
	/**
	 * The cached value of the '{@link #getGenModel() <em>Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenModel()
	 * @generated
	 * @ordered
	 */
	protected GenPackage genModel;

	/**
	 * The cached value of the '{@link #getUsesFacadeModels() <em>Uses Facade Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesFacadeModels()
	 * @generated
	 * @ordered
	 */
	protected EList<FacadeModel> usesFacadeModels;

	/**
	 * The cached value of the '{@link #getFeatureMappingStrategies() <em>Feature Mapping Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMappingStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMappingStrategy> featureMappingStrategies;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEPackages() <em>EPackages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> ePackages;

	/**
	 * The cached value of the '{@link #getClassifierMappings() <em>Classifier Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifierMapping> classifierMappings;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDirective> imports;

	/**
	 * The cached value of the '{@link #getFeatureMappingDefaults() <em>Feature Mapping Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMappingDefaults()
	 * @generated
	 * @ordered
	 */
	protected EFeatureMappingOptions featureMappingDefaults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacadeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.FACADE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage getGenModel() {
		if (genModel != null && genModel.eIsProxy()) {
			InternalEObject oldGenModel = (InternalEObject)genModel;
			genModel = (GenPackage)eResolveProxy(oldGenModel);
			if (genModel != oldGenModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfacadePackage.FACADE_MODEL__GEN_MODEL, oldGenModel, genModel));
			}
		}
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage basicGetGenModel() {
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenModel(GenPackage newGenModel) {
		GenPackage oldGenModel = genModel;
		genModel = newGenModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FACADE_MODEL__GEN_MODEL, oldGenModel, genModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacadeModel> getUsesFacadeModels() {
		if (usesFacadeModels == null) {
			usesFacadeModels = new EObjectResolvingEList<FacadeModel>(FacadeModel.class, this, EmfacadePackage.FACADE_MODEL__USES_FACADE_MODELS);
		}
		return usesFacadeModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMappingStrategy> getFeatureMappingStrategies() {
		if (featureMappingStrategies == null) {
			featureMappingStrategies = new EObjectContainmentEList<FeatureMappingStrategy>(FeatureMappingStrategy.class, this, EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_STRATEGIES);
		}
		return featureMappingStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FACADE_MODEL__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getEPackages() {
		if (ePackages == null) {
			ePackages = new EObjectResolvingEList<EPackage>(EPackage.class, this, EmfacadePackage.FACADE_MODEL__EPACKAGES);
		}
		return ePackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClassifierMapping> getClassifierMappings() {
		if (classifierMappings == null) {
			classifierMappings = new EObjectContainmentEList<EClassifierMapping>(EClassifierMapping.class, this, EmfacadePackage.FACADE_MODEL__CLASSIFIER_MAPPINGS);
		}
		return classifierMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportDirective> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<ImportDirective>(ImportDirective.class, this, EmfacadePackage.FACADE_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMappingOptions getFeatureMappingDefaults() {
		return featureMappingDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureMappingDefaults(EFeatureMappingOptions newFeatureMappingDefaults, NotificationChain msgs) {
		EFeatureMappingOptions oldFeatureMappingDefaults = featureMappingDefaults;
		featureMappingDefaults = newFeatureMappingDefaults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_DEFAULTS, oldFeatureMappingDefaults, newFeatureMappingDefaults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureMappingDefaults(EFeatureMappingOptions newFeatureMappingDefaults) {
		if (newFeatureMappingDefaults != featureMappingDefaults) {
			NotificationChain msgs = null;
			if (featureMappingDefaults != null)
				msgs = ((InternalEObject)featureMappingDefaults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_DEFAULTS, null, msgs);
			if (newFeatureMappingDefaults != null)
				msgs = ((InternalEObject)newFeatureMappingDefaults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_DEFAULTS, null, msgs);
			msgs = basicSetFeatureMappingDefaults(newFeatureMappingDefaults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_DEFAULTS, newFeatureMappingDefaults, newFeatureMappingDefaults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_STRATEGIES:
				return ((InternalEList<?>)getFeatureMappingStrategies()).basicRemove(otherEnd, msgs);
			case EmfacadePackage.FACADE_MODEL__CLASSIFIER_MAPPINGS:
				return ((InternalEList<?>)getClassifierMappings()).basicRemove(otherEnd, msgs);
			case EmfacadePackage.FACADE_MODEL__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_DEFAULTS:
				return basicSetFeatureMappingDefaults(null, msgs);
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
			case EmfacadePackage.FACADE_MODEL__GEN_MODEL:
				if (resolve) return getGenModel();
				return basicGetGenModel();
			case EmfacadePackage.FACADE_MODEL__USES_FACADE_MODELS:
				return getUsesFacadeModels();
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_STRATEGIES:
				return getFeatureMappingStrategies();
			case EmfacadePackage.FACADE_MODEL__BASE_PACKAGE:
				return getBasePackage();
			case EmfacadePackage.FACADE_MODEL__EPACKAGES:
				return getEPackages();
			case EmfacadePackage.FACADE_MODEL__CLASSIFIER_MAPPINGS:
				return getClassifierMappings();
			case EmfacadePackage.FACADE_MODEL__IMPORTS:
				return getImports();
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_DEFAULTS:
				return getFeatureMappingDefaults();
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
			case EmfacadePackage.FACADE_MODEL__GEN_MODEL:
				setGenModel((GenPackage)newValue);
				return;
			case EmfacadePackage.FACADE_MODEL__USES_FACADE_MODELS:
				getUsesFacadeModels().clear();
				getUsesFacadeModels().addAll((Collection<? extends FacadeModel>)newValue);
				return;
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_STRATEGIES:
				getFeatureMappingStrategies().clear();
				getFeatureMappingStrategies().addAll((Collection<? extends FeatureMappingStrategy>)newValue);
				return;
			case EmfacadePackage.FACADE_MODEL__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case EmfacadePackage.FACADE_MODEL__EPACKAGES:
				getEPackages().clear();
				getEPackages().addAll((Collection<? extends EPackage>)newValue);
				return;
			case EmfacadePackage.FACADE_MODEL__CLASSIFIER_MAPPINGS:
				getClassifierMappings().clear();
				getClassifierMappings().addAll((Collection<? extends EClassifierMapping>)newValue);
				return;
			case EmfacadePackage.FACADE_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends ImportDirective>)newValue);
				return;
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_DEFAULTS:
				setFeatureMappingDefaults((EFeatureMappingOptions)newValue);
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
			case EmfacadePackage.FACADE_MODEL__GEN_MODEL:
				setGenModel((GenPackage)null);
				return;
			case EmfacadePackage.FACADE_MODEL__USES_FACADE_MODELS:
				getUsesFacadeModels().clear();
				return;
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_STRATEGIES:
				getFeatureMappingStrategies().clear();
				return;
			case EmfacadePackage.FACADE_MODEL__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case EmfacadePackage.FACADE_MODEL__EPACKAGES:
				getEPackages().clear();
				return;
			case EmfacadePackage.FACADE_MODEL__CLASSIFIER_MAPPINGS:
				getClassifierMappings().clear();
				return;
			case EmfacadePackage.FACADE_MODEL__IMPORTS:
				getImports().clear();
				return;
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_DEFAULTS:
				setFeatureMappingDefaults((EFeatureMappingOptions)null);
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
			case EmfacadePackage.FACADE_MODEL__GEN_MODEL:
				return genModel != null;
			case EmfacadePackage.FACADE_MODEL__USES_FACADE_MODELS:
				return usesFacadeModels != null && !usesFacadeModels.isEmpty();
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_STRATEGIES:
				return featureMappingStrategies != null && !featureMappingStrategies.isEmpty();
			case EmfacadePackage.FACADE_MODEL__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case EmfacadePackage.FACADE_MODEL__EPACKAGES:
				return ePackages != null && !ePackages.isEmpty();
			case EmfacadePackage.FACADE_MODEL__CLASSIFIER_MAPPINGS:
				return classifierMappings != null && !classifierMappings.isEmpty();
			case EmfacadePackage.FACADE_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case EmfacadePackage.FACADE_MODEL__FEATURE_MAPPING_DEFAULTS:
				return featureMappingDefaults != null;
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
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getDefaultName() {
		return (genModel != null && (! genModel.eIsProxy()) ? genModel.getBasePackage() : null);
	}
} //FacadeModelImpl
