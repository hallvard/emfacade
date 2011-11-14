/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text Orientation Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getTextOrientationStyle()
 * @model
 * @generated
 */
public enum TextOrientationStyle implements Enumerator {
	/**
	 * The '<em><b>LEFT TO RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_TO_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_TO_RIGHT(33554432, "LEFT_TO_RIGHT", "LEFT_TO_RIGHT"),

	/**
	 * The '<em><b>RIGHT TO LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TO_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_TO_LEFT(67108864, "RIGHT_TO_LEFT", "RIGHT_TO_LEFT");

	/**
	 * The '<em><b>LEFT TO RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEFT TO RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_TO_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_TO_RIGHT_VALUE = 33554432;

	/**
	 * The '<em><b>RIGHT TO LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIGHT TO LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TO_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_TO_LEFT_VALUE = 67108864;

	/**
	 * An array of all the '<em><b>Text Orientation Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextOrientationStyle[] VALUES_ARRAY =
		new TextOrientationStyle[] {
			LEFT_TO_RIGHT,
			RIGHT_TO_LEFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Orientation Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextOrientationStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Orientation Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextOrientationStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextOrientationStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Orientation Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextOrientationStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextOrientationStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Orientation Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextOrientationStyle get(int value) {
		switch (value) {
			case LEFT_TO_RIGHT_VALUE: return LEFT_TO_RIGHT;
			case RIGHT_TO_LEFT_VALUE: return RIGHT_TO_LEFT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TextOrientationStyle(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TextOrientationStyle
