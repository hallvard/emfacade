
package org.eclipse.gmt;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EmfacadeStandaloneSetup extends EmfacadeStandaloneSetupGenerated{

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		Injector injector = super.createInjectorAndDoEMFRegistration();
		String baseEcoreUrl = EcorePlugin.INSTANCE.getBaseURL().toExternalForm();
		ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/org.eclipse.emf.ecore/"), URI.createURI(baseEcoreUrl));
		return injector;
	}

	public static void doSetup() {
		new EmfacadeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

