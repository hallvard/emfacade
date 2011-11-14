/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getCap <em>Cap</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getJoin <em>Join</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getDash <em>Dash</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getDashOffset <em>Dash Offset</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getMiterLimit <em>Miter Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getLineAttributes()
 * @model
 * @generated
 */
public interface LineAttributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getLineAttributes_Width()
	 * @model unique="false"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.LineStyle
	 * @see #setStyle(LineStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getLineAttributes_Style()
	 * @model unique="false"
	 * @generated
	 */
	LineStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.LineStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(LineStyle value);

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.CapStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.CapStyle
	 * @see #setCap(CapStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getLineAttributes_Cap()
	 * @model unique="false"
	 * @generated
	 */
	CapStyle getCap();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getCap <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.CapStyle
	 * @see #getCap()
	 * @generated
	 */
	void setCap(CapStyle value);

	/**
	 * Returns the value of the '<em><b>Join</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.JoinStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.JoinStyle
	 * @see #setJoin(JoinStyle)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getLineAttributes_Join()
	 * @model unique="false"
	 * @generated
	 */
	JoinStyle getJoin();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getJoin <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.JoinStyle
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(JoinStyle value);

	/**
	 * Returns the value of the '<em><b>Dash</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dash</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dash</em>' attribute list.
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getLineAttributes_Dash()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getDash();

	/**
	 * Returns the value of the '<em><b>Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dash Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dash Offset</em>' attribute.
	 * @see #setDashOffset(float)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getLineAttributes_DashOffset()
	 * @model unique="false"
	 * @generated
	 */
	float getDashOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getDashOffset <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dash Offset</em>' attribute.
	 * @see #getDashOffset()
	 * @generated
	 */
	void setDashOffset(float value);

	/**
	 * Returns the value of the '<em><b>Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miter Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miter Limit</em>' attribute.
	 * @see #setMiterLimit(float)
	 * @see org.eclipse.gmt.emfacade.swt.SwtPackage#getLineAttributes_MiterLimit()
	 * @model unique="false"
	 * @generated
	 */
	float getMiterLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.swt.LineAttributes#getMiterLimit <em>Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miter Limit</em>' attribute.
	 * @see #getMiterLimit()
	 * @generated
	 */
	void setMiterLimit(float value);

} // LineAttributes
