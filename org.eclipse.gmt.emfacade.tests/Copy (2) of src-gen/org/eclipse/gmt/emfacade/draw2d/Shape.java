/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.emfacade.swt.CapStyle;
import org.eclipse.gmt.emfacade.swt.JoinStyle;
import org.eclipse.gmt.emfacade.swt.LineStyle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#isFill <em>Fill</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#isFillXOR <em>Fill XOR</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#isOutline <em>Outline</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#isOutlineXOR <em>Outline XOR</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#getAntialias <em>Antialias</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineWidthFloat <em>Line Width Float</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineCap <em>Line Cap</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineJoin <em>Line Join</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineDash <em>Line Dash</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineDashOffset <em>Line Dash Offset</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineMiterLimit <em>Line Miter Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends Figure {
	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #setFill(boolean)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_Fill()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Fill XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill XOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill XOR</em>' attribute.
	 * @see #setFillXOR(boolean)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_FillXOR()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFillXOR();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#isFillXOR <em>Fill XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill XOR</em>' attribute.
	 * @see #isFillXOR()
	 * @generated
	 */
	void setFillXOR(boolean value);

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #setOutline(boolean)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_Outline()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOutline();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #isOutline()
	 * @generated
	 */
	void setOutline(boolean value);

	/**
	 * Returns the value of the '<em><b>Outline XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline XOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline XOR</em>' attribute.
	 * @see #setOutlineXOR(boolean)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_OutlineXOR()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOutlineXOR();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#isOutlineXOR <em>Outline XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline XOR</em>' attribute.
	 * @see #isOutlineXOR()
	 * @generated
	 */
	void setOutlineXOR(boolean value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(Integer)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_Alpha()
	 * @model unique="false"
	 * @generated
	 */
	Integer getAlpha();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(Integer value);

	/**
	 * Returns the value of the '<em><b>Antialias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antialias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antialias</em>' attribute.
	 * @see #setAntialias(Integer)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_Antialias()
	 * @model unique="false"
	 * @generated
	 */
	Integer getAntialias();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getAntialias <em>Antialias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antialias</em>' attribute.
	 * @see #getAntialias()
	 * @generated
	 */
	void setAntialias(Integer value);

	/**
	 * Returns the value of the '<em><b>Line Width Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Width Float</em>' attribute.
	 * @see #setLineWidthFloat(float)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_LineWidthFloat()
	 * @model unique="false"
	 * @generated
	 */
	float getLineWidthFloat();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineWidthFloat <em>Line Width Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Width Float</em>' attribute.
	 * @see #getLineWidthFloat()
	 * @generated
	 */
	void setLineWidthFloat(float value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.LineStyle
	 * @see #setLineStyle(LineStyle)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_LineStyle()
	 * @model unique="false"
	 * @generated
	 */
	LineStyle getLineStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.LineStyle
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyle value);

	/**
	 * Returns the value of the '<em><b>Line Cap</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.CapStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Cap</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.CapStyle
	 * @see #setLineCap(CapStyle)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_LineCap()
	 * @model unique="false"
	 * @generated
	 */
	CapStyle getLineCap();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineCap <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Cap</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.CapStyle
	 * @see #getLineCap()
	 * @generated
	 */
	void setLineCap(CapStyle value);

	/**
	 * Returns the value of the '<em><b>Line Join</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.swt.JoinStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Join</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Join</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.JoinStyle
	 * @see #setLineJoin(JoinStyle)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_LineJoin()
	 * @model unique="false"
	 * @generated
	 */
	JoinStyle getLineJoin();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineJoin <em>Line Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Join</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.swt.JoinStyle
	 * @see #getLineJoin()
	 * @generated
	 */
	void setLineJoin(JoinStyle value);

	/**
	 * Returns the value of the '<em><b>Line Dash</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Dash</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Dash</em>' attribute list.
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_LineDash()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getLineDash();

	/**
	 * Returns the value of the '<em><b>Line Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Dash Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Dash Offset</em>' attribute.
	 * @see #setLineDashOffset(float)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_LineDashOffset()
	 * @model unique="false"
	 * @generated
	 */
	float getLineDashOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineDashOffset <em>Line Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Dash Offset</em>' attribute.
	 * @see #getLineDashOffset()
	 * @generated
	 */
	void setLineDashOffset(float value);

	/**
	 * Returns the value of the '<em><b>Line Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Miter Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Miter Limit</em>' attribute.
	 * @see #setLineMiterLimit(float)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getShape_LineMiterLimit()
	 * @model unique="false"
	 * @generated
	 */
	float getLineMiterLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Shape#getLineMiterLimit <em>Line Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Miter Limit</em>' attribute.
	 * @see #getLineMiterLimit()
	 * @generated
	 */
	void setLineMiterLimit(float value);

} // Shape
