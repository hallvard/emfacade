package org.eclipse.gmt.emfacade.builder;

public interface LifeCycle<Model, View> {
	View create(Model model);
	void configure(Model model, View view);
	void dispose(Model model, View view);
}
