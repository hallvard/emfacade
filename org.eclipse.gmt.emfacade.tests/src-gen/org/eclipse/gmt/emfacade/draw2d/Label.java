/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.draw2d;

import org.eclipse.emf.common.util.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Label#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Label#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Label#getTextPlacement <em>Text Placement</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Label#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Label#getIconAlignment <em>Icon Alignment</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.draw2d.Label#getIconTextGap <em>Icon Text Gap</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends Figure {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getLabel_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Label#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Text Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.draw2d.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Alignment
	 * @see #setTextAlignment(Alignment)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getLabel_TextAlignment()
	 * @model unique="false"
	 * @generated
	 */
	Alignment getTextAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Label#getTextAlignment <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Alignment
	 * @see #getTextAlignment()
	 * @generated
	 */
	void setTextAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Text Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.draw2d.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Placement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Placement</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Direction
	 * @see #setTextPlacement(Direction)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getLabel_TextPlacement()
	 * @model unique="false"
	 * @generated
	 */
	Direction getTextPlacement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Label#getTextPlacement <em>Text Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Placement</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Direction
	 * @see #getTextPlacement()
	 * @generated
	 */
	void setTextPlacement(Direction value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(URI)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getLabel_Icon()
	 * @model unique="false" dataType="org.eclipse.gmt.emfacade.swt.ImageRef"
	 * @generated
	 */
	URI getIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Label#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(URI value);

	/**
	 * Returns the value of the '<em><b>Icon Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.emfacade.draw2d.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Alignment
	 * @see #setIconAlignment(Alignment)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getLabel_IconAlignment()
	 * @model unique="false"
	 * @generated
	 */
	Alignment getIconAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Label#getIconAlignment <em>Icon Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Alignment</em>' attribute.
	 * @see org.eclipse.gmt.emfacade.draw2d.Alignment
	 * @see #getIconAlignment()
	 * @generated
	 */
	void setIconAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Icon Text Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Text Gap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Text Gap</em>' attribute.
	 * @see #setIconTextGap(int)
	 * @see org.eclipse.gmt.emfacade.draw2d.Draw2dPackage#getLabel_IconTextGap()
	 * @model unique="false"
	 * @generated
	 */
	int getIconTextGap();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.emfacade.draw2d.Label#getIconTextGap <em>Icon Text Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Text Gap</em>' attribute.
	 * @see #getIconTextGap()
	 * @generated
	 */
	void setIconTextGap(int value);

} // Label
