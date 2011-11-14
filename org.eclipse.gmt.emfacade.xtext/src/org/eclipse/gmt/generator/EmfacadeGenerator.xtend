/*
 * generated by Xtext
 */
package org.eclipse.gmt.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.gmt.emfacade.FacadeModel
import org.eclipse.gmt.emfacade.EClassMapping
import org.eclipse.gmt.emfacade.EFeatureMapping
import com.google.inject.Inject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.common.util.URI
import java.util.Collections
import java.io.IOException
import org.eclipse.emf.ecore.impl.EPackageImpl
import org.eclipse.emf.ecore.impl.EcorePackageImpl
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.gmt.emfacade.EDataTypeMapping
import org.eclipse.gmt.emfacade.EEnumMapping

class EmfacadeGenerator implements IGenerator {

	@Inject extension GenerateEClassMapping
	@Inject extension GenerateBinderFactory
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val resourceSet = resource.resourceSet
		val contents = resource.contents
		if (contents.size() > 0 && contents.get(0) instanceof FacadeModel) {
			generate(contents.get(0) as FacadeModel, fsa)
		}
	}

	def void generate(FacadeModel facadeModel, IFileSystemAccess fsa) {
		for (eClassifierMapping : facadeModel.classifierMappings) {
			switch (eClassifierMapping) {
				EClassMapping: eClassifierMapping.generateEClassMapping(fsa)
				EDataTypeMapping: eClassifierMapping.generateEDataTypeMapping(fsa)
			} 
		}
		facadeModel.generateBinderFactory(fsa)
	}
}
