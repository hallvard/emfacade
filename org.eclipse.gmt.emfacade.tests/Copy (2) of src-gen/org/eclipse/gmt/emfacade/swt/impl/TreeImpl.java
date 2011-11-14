/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmt.emfacade.swt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.emfacade.swt.SortDirection;
import org.eclipse.gmt.emfacade.swt.SwtPackage;
import org.eclipse.gmt.emfacade.swt.Tree;
import org.eclipse.gmt.emfacade.swt.TreeColumn;
import org.eclipse.gmt.emfacade.swt.TreeViewer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TreeImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TreeImpl#isHeaderVisible <em>Header Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TreeImpl#isLinesVisible <em>Lines Visible</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TreeImpl#getSortColumn <em>Sort Column</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TreeImpl#getSortDirection <em>Sort Direction</em>}</li>
 *   <li>{@link org.eclipse.gmt.emfacade.swt.impl.TreeImpl#getViewer <em>Viewer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreeImpl extends ControlImpl implements Tree
{
  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<TreeColumn> columns;

  /**
   * The default value of the '{@link #isHeaderVisible() <em>Header Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeaderVisible()
   * @generated
   * @ordered
   */
  protected static final boolean HEADER_VISIBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHeaderVisible() <em>Header Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeaderVisible()
   * @generated
   * @ordered
   */
  protected boolean headerVisible = HEADER_VISIBLE_EDEFAULT;

  /**
   * The default value of the '{@link #isLinesVisible() <em>Lines Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLinesVisible()
   * @generated
   * @ordered
   */
  protected static final boolean LINES_VISIBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLinesVisible() <em>Lines Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLinesVisible()
   * @generated
   * @ordered
   */
  protected boolean linesVisible = LINES_VISIBLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSortColumn() <em>Sort Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortColumn()
   * @generated
   * @ordered
   */
  protected TreeColumn sortColumn;

  /**
   * The default value of the '{@link #getSortDirection() <em>Sort Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortDirection()
   * @generated
   * @ordered
   */
  protected static final SortDirection SORT_DIRECTION_EDEFAULT = SortDirection.NONE;

  /**
   * The cached value of the '{@link #getSortDirection() <em>Sort Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortDirection()
   * @generated
   * @ordered
   */
  protected SortDirection sortDirection = SORT_DIRECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getViewer() <em>Viewer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewer()
   * @generated
   * @ordered
   */
  protected TreeViewer viewer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TreeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SwtPackage.Literals.TREE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TreeColumn> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<TreeColumn>(TreeColumn.class, this, SwtPackage.TREE__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHeaderVisible()
  {
    return headerVisible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeaderVisible(boolean newHeaderVisible)
  {
    boolean oldHeaderVisible = headerVisible;
    headerVisible = newHeaderVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TREE__HEADER_VISIBLE, oldHeaderVisible, headerVisible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLinesVisible()
  {
    return linesVisible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinesVisible(boolean newLinesVisible)
  {
    boolean oldLinesVisible = linesVisible;
    linesVisible = newLinesVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TREE__LINES_VISIBLE, oldLinesVisible, linesVisible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreeColumn getSortColumn()
  {
    if (sortColumn != null && sortColumn.eIsProxy())
    {
      InternalEObject oldSortColumn = (InternalEObject)sortColumn;
      sortColumn = (TreeColumn)eResolveProxy(oldSortColumn);
      if (sortColumn != oldSortColumn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwtPackage.TREE__SORT_COLUMN, oldSortColumn, sortColumn));
      }
    }
    return sortColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreeColumn basicGetSortColumn()
  {
    return sortColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortColumn(TreeColumn newSortColumn)
  {
    TreeColumn oldSortColumn = sortColumn;
    sortColumn = newSortColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TREE__SORT_COLUMN, oldSortColumn, sortColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortDirection getSortDirection()
  {
    return sortDirection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortDirection(SortDirection newSortDirection)
  {
    SortDirection oldSortDirection = sortDirection;
    sortDirection = newSortDirection == null ? SORT_DIRECTION_EDEFAULT : newSortDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TREE__SORT_DIRECTION, oldSortDirection, sortDirection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreeViewer getViewer()
  {
    return viewer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetViewer(TreeViewer newViewer, NotificationChain msgs)
  {
    TreeViewer oldViewer = viewer;
    viewer = newViewer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwtPackage.TREE__VIEWER, oldViewer, newViewer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewer(TreeViewer newViewer)
  {
    if (newViewer != viewer)
    {
      NotificationChain msgs = null;
      if (viewer != null)
        msgs = ((InternalEObject)viewer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwtPackage.TREE__VIEWER, null, msgs);
      if (newViewer != null)
        msgs = ((InternalEObject)newViewer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwtPackage.TREE__VIEWER, null, msgs);
      msgs = basicSetViewer(newViewer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.TREE__VIEWER, newViewer, newViewer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SwtPackage.TREE__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case SwtPackage.TREE__VIEWER:
        return basicSetViewer(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SwtPackage.TREE__COLUMNS:
        return getColumns();
      case SwtPackage.TREE__HEADER_VISIBLE:
        return isHeaderVisible();
      case SwtPackage.TREE__LINES_VISIBLE:
        return isLinesVisible();
      case SwtPackage.TREE__SORT_COLUMN:
        if (resolve) return getSortColumn();
        return basicGetSortColumn();
      case SwtPackage.TREE__SORT_DIRECTION:
        return getSortDirection();
      case SwtPackage.TREE__VIEWER:
        return getViewer();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SwtPackage.TREE__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends TreeColumn>)newValue);
        return;
      case SwtPackage.TREE__HEADER_VISIBLE:
        setHeaderVisible((Boolean)newValue);
        return;
      case SwtPackage.TREE__LINES_VISIBLE:
        setLinesVisible((Boolean)newValue);
        return;
      case SwtPackage.TREE__SORT_COLUMN:
        setSortColumn((TreeColumn)newValue);
        return;
      case SwtPackage.TREE__SORT_DIRECTION:
        setSortDirection((SortDirection)newValue);
        return;
      case SwtPackage.TREE__VIEWER:
        setViewer((TreeViewer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SwtPackage.TREE__COLUMNS:
        getColumns().clear();
        return;
      case SwtPackage.TREE__HEADER_VISIBLE:
        setHeaderVisible(HEADER_VISIBLE_EDEFAULT);
        return;
      case SwtPackage.TREE__LINES_VISIBLE:
        setLinesVisible(LINES_VISIBLE_EDEFAULT);
        return;
      case SwtPackage.TREE__SORT_COLUMN:
        setSortColumn((TreeColumn)null);
        return;
      case SwtPackage.TREE__SORT_DIRECTION:
        setSortDirection(SORT_DIRECTION_EDEFAULT);
        return;
      case SwtPackage.TREE__VIEWER:
        setViewer((TreeViewer)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SwtPackage.TREE__COLUMNS:
        return columns != null && !columns.isEmpty();
      case SwtPackage.TREE__HEADER_VISIBLE:
        return headerVisible != HEADER_VISIBLE_EDEFAULT;
      case SwtPackage.TREE__LINES_VISIBLE:
        return linesVisible != LINES_VISIBLE_EDEFAULT;
      case SwtPackage.TREE__SORT_COLUMN:
        return sortColumn != null;
      case SwtPackage.TREE__SORT_DIRECTION:
        return sortDirection != SORT_DIRECTION_EDEFAULT;
      case SwtPackage.TREE__VIEWER:
        return viewer != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (headerVisible: ");
    result.append(headerVisible);
    result.append(", linesVisible: ");
    result.append(linesVisible);
    result.append(", sortDirection: ");
    result.append(sortDirection);
    result.append(')');
    return result.toString();
  }

} //TreeImpl
