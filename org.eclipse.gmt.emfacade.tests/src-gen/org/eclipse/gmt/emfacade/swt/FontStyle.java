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
 * A representation of the literals of the enumeration '<em><b>Font Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getFontStyle()
 * @model
 * @generated
 */
public enum FontStyle implements Enumerator
{
  /**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
  NORMAL(0, "NORMAL", "NORMAL"),

  /**
	 * The '<em><b>BOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #BOLD_VALUE
	 * @generated
	 * @ordered
	 */
  BOLD(1, "BOLD", "BOLD"),

  /**
	 * The '<em><b>ITALIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
  ITALIC(2, "ITALIC", "ITALIC");

  /**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int NORMAL_VALUE = 0;

  /**
	 * The '<em><b>BOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOLD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #BOLD
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int BOLD_VALUE = 1;

  /**
	 * The '<em><b>ITALIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ITALIC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ITALIC
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int ITALIC_VALUE = 2;

  /**
	 * An array of all the '<em><b>Font Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final FontStyle[] VALUES_ARRAY =
    new FontStyle[] {
			NORMAL,
			BOLD,
			ITALIC,
		};

  /**
	 * A public read-only list of all the '<em><b>Font Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<FontStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Font Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static FontStyle get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Font Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static FontStyle getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Font Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static FontStyle get(int value)
  {
		switch (value) {
			case NORMAL_VALUE: return NORMAL;
			case BOLD_VALUE: return BOLD;
			case ITALIC_VALUE: return ITALIC;
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
  private FontStyle(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //FontStyle
