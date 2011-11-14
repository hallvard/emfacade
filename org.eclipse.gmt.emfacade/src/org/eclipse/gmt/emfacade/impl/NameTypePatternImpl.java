/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.emfacade.EmfacadePackage;
import org.eclipse.gmt.emfacade.MemberPattern;
import org.eclipse.gmt.emfacade.MethodPattern;
import org.eclipse.gmt.emfacade.NameTypePattern;
import org.eclipse.gmt.emfacade.util.Util;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Type Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.impl.NameTypePatternImpl#getMemberPatterns <em>Member Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameTypePatternImpl extends EObjectImpl implements NameTypePattern {
	/**
	 * The cached value of the '{@link #getMemberPatterns() <em>Member Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberPattern> memberPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameTypePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfacadePackage.Literals.NAME_TYPE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberPattern> getMemberPatterns() {
		if (memberPatterns == null) {
			memberPatterns = new EObjectContainmentEList<MemberPattern>(MemberPattern.class, this, EmfacadePackage.NAME_TYPE_PATTERN__MEMBER_PATTERNS);
		}
		return memberPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JvmTypeReference matchMembers(String propertyName, EList<JvmMember> members, EList<JvmMember> matchedMembers) {
		JvmTypeReference matchedType = null;
		JvmDeclaredType matchedMemberOwner = null;
		for (MemberPattern memberPattern : getMemberPatterns()) {
			String memberName = memberPattern.getNamePattern().replace("$", propertyName);
			JvmMember matchedMember = null;
			membersLoop: for (JvmMember namedElement : members) {
				if (matchedMember != null && matchedMembers.contains(namedElement)) {
					continue;
				}
				if (matchedMemberOwner != null && matchedMemberOwner != memberOwner(namedElement)) {
					continue;
				}
				String name = (namedElement instanceof JvmConstructor ? "" : namedElement.getSimpleName());
				if (! memberName.equals(name)) {
					continue;
				}
				if (! checkModifiers(namedElement)) {
					continue;
				}
				List<JvmTypeReference> types = new ArrayList<JvmTypeReference>();
				if (namedElement instanceof JvmField) {
					types.add(((JvmField) namedElement).getType());
				} else if (namedElement instanceof JvmOperation) {
					JvmOperation methodDeclaration = (JvmOperation) namedElement;
					for (JvmFormalParameter param : methodDeclaration.getParameters()) {
						types.add(param.getParameterType());
					}
					types.add(methodDeclaration.getReturnType());
				}
				List<String> typePatterns = new ArrayList<String>();
				if (memberPattern instanceof MethodPattern) {
					typePatterns.addAll(((MethodPattern) memberPattern).getParameterTypePatterns());
				}
				// type pattern is null if it is supposed to match a constructor
				if (memberPattern.getTypePattern() != null) {
					typePatterns.add(memberPattern.getTypePattern());
				}
				Iterator<JvmTypeReference> typesIt = types.iterator();
				for (String typePattern : typePatterns) {
					if (! typesIt.hasNext()) {
						continue membersLoop;
					}
					JvmTypeReference type = typesIt.next();
					JvmTypeReference typeMatch = matchType(type, typePattern, matchedType);
					if (typeMatch == null) {
						continue membersLoop;
					}
					if (matchedType == null && (typePattern.contains("$") || typePattern.contains("#"))) {
						matchedType = typeMatch;
					}
					if (matchedMemberOwner == null) {
						matchedMemberOwner = memberOwner(namedElement);
					}
				}
				if (typesIt.hasNext()) {
					continue membersLoop;
				}
				matchedMember = namedElement;
				break;
			}
			if (matchedMember == null) {
				return null;
			}
			if (matchedMembers != null) {
				matchedMembers.add(matchedMember);
			}
		}
		return matchedType;
	}

	private boolean checkModifiers(JvmMember namedElement) {
		if (namedElement.getVisibility() != JvmVisibility.PUBLIC) {
			return false;
		}
		return true;
	}

	private JvmDeclaredType memberOwner(JvmMember namedElement) {
		return namedElement.getDeclaringType();
	}
	
	private JvmTypeReference matchType(JvmTypeReference type, String typePattern, JvmTypeReference matchedType) {
		if ("$".equals(typePattern)) {
			return (isClass(type) && (matchedType == null || type == matchedType) ? type : null);
		} else if ("#".equals(typePattern)) {
			return (isDataType(type) && (matchedType == null || type == matchedType) ? type : null);
		}
		if (Util.typeFullName(type).equals(typePattern)) {
			return (matchedType != null ? matchedType : type);
		}
		return null;
	}

	private boolean isClass(JvmTypeReference type) {
		return ! isDataType(type);
	}
	private boolean isDataType(JvmTypeReference type) {
		String qName = type.getQualifiedName();
		if ((! qName.contains(".")) || qName.equals("java.lang." + type.getSimpleName())) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> findFeatures(EList<JvmMember> members, EList<JvmTypeReference> matchedTypes) {
		EList<String> result = new BasicEList<String>();
		EList<JvmMember> unmatchedMembers = new BasicEList<JvmMember>(members);
		for (MemberPattern memberPattern : getMemberPatterns()) {
			String namePattern = memberPattern.getNamePattern();
			int pos = namePattern.indexOf('$');
			if (pos < 0) {
				continue;
			} else if (pos == 0) {
				namePattern = namePattern.replace("$", "(\\p{javaLowerCase}+)");
			} else {
				namePattern = namePattern.replace("$", "(\\p{javaUpperCase}\\p{javaLowerCase}*)");
			}
			EList<JvmMember> matchedMembers = new BasicEList<JvmMember>();
			for (JvmMember bodyDeclaration : unmatchedMembers) {
				if (matchedMembers.contains(bodyDeclaration) || bodyDeclaration.getSimpleName() == null) {
					continue;
				}
				Matcher matcher = Pattern.compile(namePattern).matcher(bodyDeclaration.getSimpleName());
				if (matcher.matches()) {
					String propertyName = matcher.group(1);
					JvmTypeReference matchedType = matchMembers(propertyName, unmatchedMembers, matchedMembers);
					if (matchedType != null) {
						result.add(propertyName);
						if (matchedTypes != null) {
							matchedTypes.add(matchedType);
						}
					}
				}
			}
			unmatchedMembers.removeAll(matchedMembers);
		}
		return result;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfacadePackage.NAME_TYPE_PATTERN__MEMBER_PATTERNS:
				return ((InternalEList<?>)getMemberPatterns()).basicRemove(otherEnd, msgs);
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
			case EmfacadePackage.NAME_TYPE_PATTERN__MEMBER_PATTERNS:
				return getMemberPatterns();
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
			case EmfacadePackage.NAME_TYPE_PATTERN__MEMBER_PATTERNS:
				getMemberPatterns().clear();
				getMemberPatterns().addAll((Collection<? extends MemberPattern>)newValue);
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
			case EmfacadePackage.NAME_TYPE_PATTERN__MEMBER_PATTERNS:
				getMemberPatterns().clear();
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
			case EmfacadePackage.NAME_TYPE_PATTERN__MEMBER_PATTERNS:
				return memberPatterns != null && !memberPatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NameTypePatternImpl
