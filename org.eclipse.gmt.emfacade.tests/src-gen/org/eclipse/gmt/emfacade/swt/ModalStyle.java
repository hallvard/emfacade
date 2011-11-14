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
 * A representation of the literals of the enumeration '<em><b>Modal Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getModalStyle()
 * @model
 * @generated
 */
public enum ModalStyle implements Enumerator
{
  /**
	 * The '<em><b>SYSTEM MODAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SYSTEM_MODAL_VALUE
	 * @generated
	 * @ordered
	 */
  SYSTEM_MODAL(131072, "SYSTEM_MODAL", "SYSTEM_MODAL"),

  /**
	 * The '<em><b>APPLICATION MODAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #APPLICATION_MODAL_VALUE
	 * @generated
	 * @ordered
	 */
  APPLICATION_MODAL(65536, "APPLICATION_MODAL", "APPLICATION_MODAL"),

  /**
	 * The '<em><b>PRIMARY MODAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PRIMARY_MODAL_VALUE
	 * @generated
	 * @ordered
	 */
  PRIMARY_MODAL(32768, "PRIMARY_MODAL", "PRIMARY_MODAL");

  /**
	 * The '<em><b>SYSTEM MODAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYSTEM MODAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SYSTEM_MODAL
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int SYSTEM_MODAL_VALUE = 131072;

  /**
	 * The '<em><b>APPLICATION MODAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>APPLICATION MODAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #APPLICATION_MODAL
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int APPLICATION_MODAL_VALUE = 65536;

  /**
	 * The '<em><b>PRIMARY MODAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRIMARY MODAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PRIMARY_MODAL
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int PRIMARY_MODAL_VALUE = 32768;

  /**
	 * An array of all the '<em><b>Modal Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final ModalStyle[] VALUES_ARRAY =
    new ModalStyle[] {
			SYSTEM_MODAL,
			APPLICATION_MODAL,
			PRIMARY_MODAL,
		};

  /**
	 * A public read-only list of all the '<em><b>Modal Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<ModalStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Modal Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ModalStyle get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModalStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Modal Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ModalStyle getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModalStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Modal Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ModalStyle get(int value)
  {
		switch (value) {
			case SYSTEM_MODAL_VALUE: return SYSTEM_MODAL;
			case APPLICATION_MODAL_VALUE: return APPLICATION_MODAL;
			case PRIMARY_MODAL_VALUE: return PRIMARY_MODAL;
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
  private ModalStyle(int value, String name, String literal)
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
  
} //ModalStyle
