/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Type Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.NameTypePattern#getMemberPatterns <em>Member Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getNameTypePattern()
 * @model
 * @generated
 */
public interface NameTypePattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Member Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.emfacade.MemberPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Patterns</em>' containment reference list.
	 * @see org.eclipse.gmt.emfacade.EmfacadePackage#getNameTypePattern_MemberPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemberPattern> getMemberPatterns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model membersMany="true" matchedMembersMany="true"
	 * @generated
	 */
	JvmTypeReference matchMembers(String propertyName, EList<JvmMember> members, EList<JvmMember> matchedMembers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model membersMany="true" matchedTypesMany="true"
	 * @generated
	 */
	EList<String> findFeatures(EList<JvmMember> members, EList<JvmTypeReference> matchedTypes);

} // NameTypePattern
