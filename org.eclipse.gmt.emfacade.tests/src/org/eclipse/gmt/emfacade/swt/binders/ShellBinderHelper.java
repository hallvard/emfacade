package org.eclipse.gmt.emfacade.swt.binders;

import org.eclipse.swt.widgets.Display;

public class ShellBinderHelper {

	static void help(final org.eclipse.swt.widgets.Shell shell) {
		final Display display = Display.getDefault();
		new Thread(new Runnable() {
			public void run() {
				shell.open ();
				while (! shell.isDisposed()) {
					if (! display.readAndDispatch()) display.sleep ();
				}
				display.dispose();
			}
		}).start();
	}
}
