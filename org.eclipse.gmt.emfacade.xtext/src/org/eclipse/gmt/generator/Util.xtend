// [module util('http://www.eclipse.org/emf/2002/Ecore', 'http://www.eclipse.org/xtext/common/JavaVMTypes', 'http://org.eclipse.gmt.emfacade/model/emfacade.ecore')}
package org.eclipse.gmt.generator

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.gmt.emfacade.EFeatureMapping
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.gmt.emfacade.FacadeModel
import org.eclipse.gmt.emfacade.EClassMapping
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeReference
import java.util.Map
import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.gmt.emfacade.EFeatureMappingElement
import org.eclipse.gmt.emfacade.FeatureMappingStrategy
import org.eclipse.gmt.emfacade.EClassifierMapping
import org.eclipse.emf.ecore.EEnum
import org.eclipse.gmt.emfacade.EDataTypeMapping
import org.eclipse.gmt.scoping.EmfacadeScopeProviderJvmInferrer

class Util {

	@Inject
	extension TypeUtil typeUtil
	
	@Inject
	extension EmfacadeScopeProviderJvmInferrer emfacadeScopeProviderJvmInferrer
		
	def simpleName(String typeName) {
		val pos = typeName.lastIndexOf(".")
		if (pos < 0) typeName else typeName.substring(pos + 1)
	}
	def String packageName(String typeName) {
		var pos = typeName.lastIndexOf('.')
		typeName.substring(0, pos)
	}

	def String simplifyName(String typeName) {
		var prefix = "java.lang."
		if (typeName.startsWith(prefix)) typeName.substring(prefix.length() + 1)
		else typeName
	}
	
	def String genPackage(EObject context) {
		(EcoreUtil::getRootContainer(context) as FacadeModel).genModel.basePackage
	}

	def String jClassName(JvmType type) {
		type.qualifiedName.wrapperTypeName()
	}
	def String jClassName(JvmTypeReference type) {
		jClassName(type.type)
	}


	def String binderPackageName(EPackage ePackage, EObject context) {
		genPackage(context) + "." + ePackage.name + ".binders"
	}
	def String binderPackageName(EClassifier eClassifier, EObject context) {
		binderPackageName(eClassifier.EPackage, context)
	}
	def String binderPackageName(EClassifierMapping eClassMapping) {
		binderPackageName(eClassMapping.EClassifier, eClassMapping)
	}

	def String jClassName(EPackage ePackage, EObject context) {
		genPackage(context) + "." + ePackage.name + "." + ePackage.name.toFirstUpper + "Package"
	}
	def String jClassName(EClassifier eClassifier, EObject context) {
		val clazz = eClassifier.instanceClass
		if (clazz != null)
			EcoreUtil::wrapperClassFor(eClassifier.instanceClass).name
		else
			genPackage(context) + "." + eClassifier.EPackage.name + "." + eClassifier.name
	}
	def String jClassName(EClassifierMapping eClassMapping) {
		jClassName(eClassMapping.declaredType)
	}
	def String eClassName(EClassifierMapping eClassMapping) {
		jClassName(eClassMapping.EClassifier, eClassMapping)
	}
	def String jClassName(EStructuralFeature eFeature, EObject context) {
		jClassName(eFeature.EType, context)
	}
	
	def EClassifierMapping eClassMappingFor(EClassifier eClassifier, EObject context) {
		emfacadeScopeProviderJvmInferrer.getEClassifierMapping(eClassifier, context)
	}

	def String jClassName(EFeatureMapping eFeatureMapping) {
		val jvmType = emfacadeScopeProviderJvmInferrer.getJClass(eFeatureMapping)
		jvmType?.qualifiedName
	}
	def String eClassName(EFeatureMapping eFeatureMapping) {
		jClassName(eFeatureMapping.EFeature, eFeatureMapping)
	}

	def String eInstance(EPackage ePackage, EObject context, boolean simple) {
		val name = jClassName(ePackage, context)
		(if (simple) simpleName(name) else name) + ".eINSTANCE"
	}
	def String eInstance(EClassifier eClassifier, EObject context, boolean simple) {
		eInstance(eClassifier.EPackage, context, simple) + ".get" + eClassifier.name
	}
	def String eInstance(EStructuralFeature eFeature, EObject context, boolean simple) {
		eInstance(eFeature.EContainingClass, context, simple) + "_" + eFeature.name.toFirstUpper()
	}

	def String eInstance(EFeatureMapping eFeatureMapping, boolean simple) {
		eInstance(eFeatureMapping.EFeature, eFeatureMapping, simple)
	}

	def String binderClassName(EClassMapping eClassMapping) {
		eClassMapping.getEClassifier.name + 'Binder'
	}
	def String binderClassName(EClass eClass, EObject context) {
		val eClassMapping = eClass.eClassMappingFor(context) as EClassMapping
		if (eClassMapping != null) eClassMapping.binderClassName() else null
	}
	def String converterClassName(EDataTypeMapping eDataTypeMapping) {
		eDataTypeMapping.getEClassifier.name + eDataTypeMapping.declaredType.simpleName + 'Converter'
	}
	def String converterClassName(EFeatureMapping eFeatureMapping) {
		val jClass = eFeatureMapping.JClass();
		if (jClass != null)
			eFeatureMapping.EFeature.EType.name + jClass.simpleName + "Converter"
	}
	
	def String strategyClassName(EFeatureMapping mapping) {
		val strategy = mapping.strategyDef
		strategy.implType.getQualifiedName
	}

	def FeatureMappingStrategy strategyDef(EFeatureMapping eFeatureMapping) {
		org::eclipse::gmt::emfacade::util::Util::getStrategy(eFeatureMapping)
	}

	def CharSequence genEPackageImport(EClassifierMapping eClassMapping) {
		val packageName = eClassMapping.EClassifier.EPackage.name
		'''import ÇjClassName(eClassMapping.EClassifier.EPackage, eClassMapping)È;'''
	}
}
