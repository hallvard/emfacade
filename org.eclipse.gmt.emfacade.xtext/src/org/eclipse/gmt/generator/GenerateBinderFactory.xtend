package org.eclipse.gmt.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.gmt.emfacade.EClassMapping
import java.util.HashSet
import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.gmt.emfacade.FacadeModel
import org.eclipse.emf.ecore.EEnum

class GenerateBinderFactory {

	@Inject
	extension Util util
	
	def void generateBinderFactory(FacadeModel facadeModel, IFileSystemAccess fsa) {
		val modelPackageName = facadeModel.classifierMappings.head.EClassifier.EPackage.name
		val	binderFactoryName = modelPackageName.toFirstUpper() + "BinderFactory"
		val jPackageName = facadeModel.classifierMappings.head.binderPackageName() // "org.eclipse.gmt.emfacade.tests.binders_gen"

		val imports = new EmfacadeImportManager()
		imports.addImports("org.eclipse.emf.ecore.EObject, org.eclipse.gmt.emfacade.builder.IBinder");

		val mainContent = '''
public class «binderFactoryName» extends «facadeModel.genModel.basePackage».«modelPackageName».util.«modelPackageName.toFirstUpper()»AdapterFactory {

	@Override
	public boolean isFactoryForType(Object type) {
		return IBinder.class.equals(type);
	}

			«facadeModel.classifierMappings.join("\n", [eClassifierMapping |
				val eClassifier = eClassifierMapping.EClassifier
				if (eClassifier instanceof EDataType) ""
				else if ((eClassifier instanceof EClass && (eClassifier as EClass).abstract)) ""
				else {
					val eClassifierQName = imports.get(eClassifierMapping.eClassName())
					val binderClassName = (eClassifierMapping as EClassMapping).binderClassName()
			'''
	private IBinder<?, ?> «binderClassName.toFirstLower» = null;
	@Override
	public IBinder<?, ?> create«eClassifier.name»Adapter() {
		if («binderClassName.toFirstLower» == null) {
			«binderClassName.toFirstLower» = new «binderClassName»<«eClassifierQName», «imports.get(eClassifierMapping.jClassName())»>();
		}
		return «binderClassName.toFirstLower»;
	}
			'''
					}
			])»
}
		'''
		val fileContent = '''
package «jPackageName»;
			
		«FOR importDirective : imports.imports»
import «importDirective»;
		«ENDFOR»
			
«mainContent»
		'''			
		fsa.generateFile(jPackageName.replace(".", "/") + "/" + binderFactoryName + ".java", fileContent);
	}
}
