/*******************************************************************************
 * Copyright (c) 2008 Hallvard Traetteberg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hallvard Traetteberg - initial API and implementation
 ******************************************************************************/
package org.eclipse.gmt.swt.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public abstract class PartStyle {
	
	protected Composite treeParent;
	protected List<Composite> contentComposites = new ArrayList<Composite>();
	
	public Composite getTreeParent() {
		return treeParent;
	}

	protected List<Object> contentCompositeKeys = new ArrayList<Object>();
	
	protected void addContentComposite(Object key, Composite composite) {
		contentCompositeKeys.add(key);
		contentComposites.add(composite);
	}
	public abstract Composite addContentComposite(Object key);

	public Composite getContentComposite(Object key) {
		int pos = contentCompositeKeys.indexOf(key);
		return (pos >= 0 ? contentComposites.get(pos) : null);
	}

	protected void disposeContentComposite(Object key) {
		int pos = contentCompositeKeys.indexOf(key);
		if (pos >= 0) {
			contentComposites.get(pos).dispose();
		}
		contentCompositeKeys.remove(key);
	}

	public void createPageContainer(Composite parent) {
		if (treeParent == null) {
			createTreeParent(parent);
		}
	}

	protected Composite createTmComposite(Composite parent) {
		return new Composite(parent, SWT.V_SCROLL);
	}

	abstract void createTreeParent(Composite parent);
	
	public static class SashStyle extends PartStyle {
		
		private SashForm sashForm; 
			
		public void createTreeParent(Composite parent) {
			sashForm = new SashForm(parent, SWT.HORIZONTAL);
			treeParent =  new Composite(sashForm, SWT.NONE);
		}

		public Composite addContentComposite(Object key) {
			Composite composite = createTmComposite(sashForm);
			sashForm.layout();
			addContentComposite(key, composite);
			return composite;
		}
	}
	
	public static class TabFolderStyle extends PartStyle {

		private String treeTabTitle;
		
		public TabFolderStyle(String treeTabTitle) {
			this.treeTabTitle = treeTabTitle;
		}
		public TabFolderStyle() {
			this("Toolkit model");
		}
		
		private TabFolder tabFolder; 
			
		public void createTreeParent(Composite parent) {
			tabFolder = new TabFolder(parent, SWT.BOTTOM);
			TabItem treeTab = new TabItem(tabFolder, SWT.NONE);
			treeTab.setText(treeTabTitle);
			treeParent =  new Composite(tabFolder, SWT.NONE);
			treeTab.setControl(treeParent);
		}

		public Composite addContentComposite(Object key) {
			TabItem tmTab = new TabItem(tabFolder, SWT.NONE);
			tmTab.setText(key.toString());
			Composite composite = createTmComposite(tabFolder);
			tmTab.setControl(composite);
			return composite;
		}
	}
	
	public static class SashTabFolderStyle extends PartStyle {
		
		private TabFolder tabFolder; 
			
		public void createTreeParent(Composite parent) {
			SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);
			treeParent =  new Composite(sashForm, SWT.NONE);
			tabFolder = new TabFolder(sashForm, SWT.BOTTOM);
		}

		public Composite addContentComposite(Object key) {
			TabItem tmTab = new TabItem(tabFolder, SWT.NONE);
			tmTab.setText(key.toString());
			Composite composite = createTmComposite(tabFolder);
			tmTab.setControl(composite);
			return composite;
		}
	}

}
