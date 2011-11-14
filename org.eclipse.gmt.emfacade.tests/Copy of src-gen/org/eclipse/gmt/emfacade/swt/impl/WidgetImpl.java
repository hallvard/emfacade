/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.Widget;
import org.eclipse.swt.SWT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.WidgetImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WidgetImpl extends MinimalEObjectImpl.Container implements Widget {
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final int STYLE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwtPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getStyle() {
		int style = SWT.NONE;
		for (EStructuralFeature feature : eClass().getEAllStructuralFeatures()) {
			String name = feature.getName();
			int value = SWT.NONE;
			if (name.endsWith("Style") && feature.getEType() instanceof EEnum) {
				Object featureValue = eGet(feature);
				if (featureValue instanceof Integer) {
					value = (Integer) featureValue;
				} else if (featureValue instanceof Enumerator) {
					value = ((Enumerator) featureValue).getValue();
				}
			}
			if (name.endsWith("Bit") && feature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
				String fieldName = name.substring(0, name.length() - "Bit".length()).toUpperCase();
				Object featureValue = eGet(feature);
				if (Boolean.TRUE.equals(featureValue)) {
					try {
						value = SWT.class.getField(fieldName).getInt(null);
					} catch (Exception e) {
					}
				}
			}
			style |= value;
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwtPackage.WIDGET__STYLE:
				return getStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SwtPackage.WIDGET__STYLE:
				return getStyle() != STYLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //WidgetImpl
