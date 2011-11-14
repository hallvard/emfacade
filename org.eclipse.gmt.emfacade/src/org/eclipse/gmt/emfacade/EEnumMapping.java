/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.EEnumMapping#getLiteralMappings <em>Literal Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEEnumMapping()
 * @model
 * @generated
 */
public interface EEnumMapping extends EDataTypeMapping {
	/**
	 * Returns the value of the '<em><b>Literal Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.EEnumLiteralMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Mappings</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getEEnumMapping_LiteralMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<EEnumLiteralMapping> getLiteralMappings();

} // EEnumMapping
