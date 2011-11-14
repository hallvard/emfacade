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
/**
 * 
 */
package org.eclipse.gmt.swt.views;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModelContext implements ModelContext, Runnable {

	private List<Listener> listeners = new ArrayList<Listener>();

	public void addModelContextListener(Listener listener) {
		listeners.add(listener);
	}

	public void removeModelContextListener(Listener listener) {
		listeners.remove(listener);
	}

	protected void fireContextChanged() {
		run();
	}

	public void run() {
		for (Listener listener: listeners.toArray(new Listener[listeners.size()])) {
			listener.contextChanged(this);
		}
	}

	public void dispose() {
	}
}
