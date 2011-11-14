package org.eclipse.gmt.scoping;

import java.util.Map;

import org.eclipse.gmt.emfacade.lib.IntegerExtensions;
import org.eclipse.gmt.emfacade.lib.MapExtensions;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider;

import com.google.inject.Singleton;

/**
 * @author Hallvard Tr¾tteberg
 */

@Singleton
public class EmfacadeExtensionClassNameProvider extends StaticMethodsFeatureForTypeProvider.ExtensionClassNameProvider {

	@Override
	protected Map<Class<?>, Class<?>> simpleComputeExtensionClasses() {
		Map<Class<?>, Class<?>> result = super.simpleComputeExtensionClasses();
		result.put(Integer.class, IntegerExtensions.class);
		result.put(Map.class, MapExtensions.class);
		return result;
	}
}
