package org.eclipse.gmt.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.gmt.emfacade.EClassMapping
import com.google.inject.Inject
import org.eclipse.gmt.emfacade.FeatureMappingStrategy
import org.eclipse.gmt.emfacade.EFeatureMapping
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmMember
import java.util.HashMap
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.gmt.scoping.EmfacadeScopeProviderJvmInferrer
import com.google.inject.Provider
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.xbase.compiler.IAppendable
import org.eclipse.xtext.resource.IEObjectDescription
import java.util.List
import java.util.Map
import org.eclipse.gmt.emfacade.EDataTypeMapping
import org.eclipse.gmt.emfacade.EEnumMapping
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.xbase.XbaseFactory
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.JvmType
import java.util.Collections
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.gmt.emfacade.InterfaceMethodImplementation
import org.eclipse.gmt.emfacade.InterfaceImplementation
import org.eclipse.xtext.xbase.lib.Pair

class GenerateEClassMapping {

	@Inject
	extension Util util
	
	@Inject
	Provider<JvmCompilationUnitGenerator> jvmCompilationUnitGeneratorProvider

	@Inject
	extension EmfacadeScopeProviderJvmInferrer emfacadeScopeProviderJvmInferrer

	@Inject
	XbaseCompiler xbaseCompiler

	def void generateEClassMapping(EClassMapping eClassMapping, IFileSystemAccess fsa) {
		val eClass = eClassMapping.EClass
		val jClass = eClassMapping.JClass
		val jPackageName = eClassMapping.binderPackageName() // "org.eclipse.gmt.emfacade.tests.binders_gen"
		
		for (featureMapping : eClassMapping.featureMappings) {
			generateAssociationClass(featureMapping, fsa, jPackageName)
		}
		val imports = new EmfacadeImportManager()
		imports.addImports("org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.common.notify.Notification");
		imports.addImports("org.eclipse.gmt.emfacade.builder.IBinderHelper, org.eclipse.gmt.emfacade.builder.IBinderContext, org.eclipse.gmt.emfacade.builder.AbstractBinder");
		imports.addImports(eClassMapping.eClassName)

		val jClassQName = imports.get(jClass.jClassName)
		
		val mainContent = '''
	import org.eclipse.gmt.emfacade.builder.strategies.*;
	«eClassMapping.genEPackageImport()»
	
	public «IF eClass.abstract»abstract«ENDIF» class «eClassMapping.binderClassName()» <Model extends «eClass.name», View extends «jClassQName»>
		extends «{
			val binderClassName = if (eClass.ESuperTypes.isEmpty()) null else eClass.ESuperTypes.get(0).binderClassName(eClassMapping)
			if (binderClassName != null) binderClassName else "AbstractBinder"
		}»<Model, View>
		«FOR eventHandler : eClassMapping.eventHandlers BEFORE "implements" SEPARATOR ", "»
			«imports.get(eventHandler.interfaceType)»
		«ENDFOR»
		{

		«{
			val inferredType = eClassMapping.lifeCycleHandler?.getInterfaceType(emfacadeScopeProviderJvmInferrer)
			if (inferredType != null) {
				val jvmCompilationUnitGenerator = jvmCompilationUnitGeneratorProvider.get
				jvmCompilationUnitGenerator.setImports(imports)
				jvmCompilationUnitGenerator.nameFormat = "{0}View"
				jvmCompilationUnitGenerator.setExtraParameters("_binderHelper" -> "org.eclipse.gmt.emfacade.builder.IBinderHelper")
				for (inferredMethod : inferredType.members.filter(typeof(JvmOperation))) {
					jvmCompilationUnitGenerator.setMemberExpression(inferredMethod, eClassMapping.lifeCycleHandler)
				}
				jvmCompilationUnitGenerator.generate(inferredType.members);
			} else ""
		}»
		
		@Override
		protected boolean updateView(Model eObject, View object, EStructuralFeature feature, IBinderHelper _binderHelper) {
			«FOR featureMapping : eClassMapping.featureMappings SEPARATOR " else "»
			if (feature == «featureMapping.eInstance(true)»()) {
				if («featureMapping.EFeature.name»_Association.updateView(eObject«if (featureMapping.EFeature.many)'''.get«featureMapping.EFeature.name.toFirstUpper()»()'''», object, feature, «imports.get(featureMapping.jClassName())».class, _binderHelper.getBinderContext())) {
					return true;
				}
			}
			«ENDFOR»
			return false;
		}
		«{
			val manyMappings = eClassMapping.featureMappings.filter(mapping | mapping.EFeature.many).toList
			'''
		@Override
		protected boolean updateView(Model eObject, View object, Notification notification, IBinderHelper _binderHelper) {
			«FOR featureMapping : manyMappings SEPARATOR " else "»
			if (notification.getFeature() == «featureMapping.eInstance(true)»()) {
				if («featureMapping.EFeature.name»_Association.updateView(eObject«IF featureMapping.EFeature.many».get«featureMapping.EFeature.name.toFirstUpper()»()«ENDIF», object, notification, «imports.get(featureMapping.jClassName())».class, _binderHelper.getBinderContext())) {
					return true;
				}
			}
			«ENDFOR»
			return false;
		}
		'''
		}»
	
		@Override
		public void disposeView(Model eObject, View object, Object child, Object childObject, EStructuralFeature feature, IBinderContext _context) {
			«FOR featureMapping : eClassMapping.featureMappings SEPARATOR " else "»
				if (feature == «featureMapping.eInstance(true)»()) {
					«featureMapping.EFeature.name»_Association.disposeView(«IF featureMapping.EFeature.many»
					eObject.get«featureMapping.EFeature.name.toFirstUpper()»(), object, feature, («imports.get(featureMapping.eClassName())») child, («imports.get(featureMapping.jClassName())») childObject
					«ELSE»object«ENDIF», _context);
					return;
				}
			«ENDFOR»
			super.disposeView((Model) eObject, (View) object, child, childObject, feature, _context);
		}
		
		«eClassMapping.featureMappings.join("\n", [eFeatureMapping |
			val strategyImplType = '''«eFeatureMapping.strategyClassName()».Impl<«eClass.name», «imports.get(eFeatureMapping.eClassName())», «jClassQName», «imports.get(eFeatureMapping.jClassName())»>'''
			val associationName = '''«eFeatureMapping.EFeature.name»_Association'''
		'''
		private «strategyImplType» «associationName» = new «strategyImplType»(
			new «eFeatureMapping.EClassMapping.declaredType.simpleName»_«eFeatureMapping.EFeature.name»()
		);«{
			val settings = eFeatureMapping.strategyDef.generateStrategySettings(eFeatureMapping)
			if (settings.empty) ""
			else "{\n" + settings.entrySet.join("\n", [entry | '''«associationName».set«entry.key.toFirstUpper()»(«entry.value»);''']) + "\n}"
		}»
		'''])»
			
		«FOR eventHandler : eClassMapping.eventHandlers»
		// implements «eventHandler.interfaceType.qualifiedName»
			«{
				val inferredType = eventHandler.getInterfaceType(emfacadeScopeProviderJvmInferrer)
				if (inferredType != null) {
					val jvmCompilationUnitGenerator = jvmCompilationUnitGeneratorProvider.get
					jvmCompilationUnitGenerator.setImports(imports)
					for (inferredMethod : inferredType.members.filter(typeof(JvmOperation))) {
						jvmCompilationUnitGenerator.setMemberExpression(inferredMethod, eventHandler)
					}
					jvmCompilationUnitGenerator.generate(inferredType.members);
				} else ""
			}»
		«ENDFOR»
		
	}''';
		val fileContent = '''
			package «jPackageName»;
			
			«FOR importDirective : imports.imports»
			import «importDirective»;
			«ENDFOR»
			
			«mainContent»
		'''		
		fsa.generateFile(jPackageName.replace(".", "/") + "/" + eClassMapping.binderClassName() + ".java", fileContent);
	}

	def Map<String, CharSequence> generateStrategySettings(FeatureMappingStrategy eFeatureMappingStrategy, EFeatureMapping eFeatureMapping) {
		val eClassMapping = eFeatureMapping.EClassMapping
		val settings = new HashMap<String, CharSequence>();
		settings.put("ETyped", eFeatureMapping.eInstance(false) + "()")
		val converterClassName = eFeatureMapping.converterClassName()
		if (converterClassName != null)	{
			settings.put("converter", "new " + converterClassName + "()")
		}
		settings
	}
	
	def void declareVariables(List<IEObjectDescription> descriptions, List<Pair<String, String>> nameMapping, IAppendable appendable) {
		for (pair : nameMapping) {
			appendable.declareVariable(descriptions.getEObject(pair.key.toFirstLower), pair.value.toFirstLower)
		}
	}
	
	def InterfaceMethodImplementation getMethodImplementation(InterfaceImplementation impl, String name) {
		impl.methodImplementations.findFirst(methodImplementation | methodImplementation.interfaceMethod.simpleName.equals(name))
	}
	
	def generateAssociationClass(EFeatureMapping eFeatureMapping, IFileSystemAccess fsa, String packageName) {
		val inferredType = eFeatureMapping.getInterfaceType(emfacadeScopeProviderJvmInferrer)
		if (inferredType != null) {
			val jvmCompilationUnitGenerator = jvmCompilationUnitGeneratorProvider.get
			for (inferredMethod : inferredType.members.filter(typeof(JvmOperation))) {
				val methodImplementation = eFeatureMapping.getMethodImplementation(inferredMethod.simpleName)
				var methodBody = methodImplementation?.methodBody
				if (methodBody == null) {
					methodBody = generateAssociationClassMethodBody(eFeatureMapping, inferredMethod as JvmOperation)
				}
				jvmCompilationUnitGenerator.setMemberExpression(inferredMethod, methodBody)
			}
			jvmCompilationUnitGenerator.setPackageName(packageName);
			jvmCompilationUnitGenerator.addDeclaredType(inferredType)
			jvmCompilationUnitGenerator.doGenerate(fsa);
		}
	}
	
	@Inject 
	XbaseFactory xbaseFactory

	def XExpression generateAssociationClassMethodBody(EFeatureMapping eFeatureMapping, JvmOperation operation) {
		val receiverParam = operation.parameters.head()
		val receiverType = receiverParam.parameterType.type as JvmDeclaredType
		val featureName = eFeatureMapping.EFeature.name

		val params = <XFeatureCall>newArrayList()
		for (param : operation.parameters.drop(1)) {
			val paramExpression = xbaseFactory.createXFeatureCall
			paramExpression.feature = param
			params += paramExpression
		}
		var receiverMethod = receiverType.findMethod(operation.simpleName, featureName, params)
		if (receiverMethod == null && eFeatureMapping.EFeature.many && featureName.endsWith("s")) {
			receiverMethod = receiverType.findMethod(operation.simpleName, featureName.substring(0, featureName.length() - 1), params)
		}
		if (receiverMethod != null) {
			val expression = xbaseFactory.createXMemberFeatureCall
			expression.feature = receiverMethod
			val receiverExpression = xbaseFactory.createXFeatureCall
			receiverExpression.feature = operation.parameters.head
			expression.memberCallTarget = receiverExpression
			expression.getMemberCallArguments() += params
			return expression
		} else if ("get".equals(operation.simpleName) || "set".equals(operation.simpleName)) {
			val receiverField = receiverType.findField(featureName, params)
			if (receiverField != null) {
				var expression = null as XAbstractFeatureCall
				val receiverExpression = xbaseFactory.createXFeatureCall
				receiverExpression.feature = operation.parameters.head
				if ("get".equals(operation.simpleName)) {
					val memberFeatureCall = xbaseFactory.createXMemberFeatureCall
					memberFeatureCall.memberCallTarget = receiverExpression
					expression = memberFeatureCall
				} else if ("set".equals(operation.simpleName)) {
					val assignment = xbaseFactory.createXAssignment
					assignment.assignable = receiverExpression
					val valueExpression = xbaseFactory.createXFeatureCall
					valueExpression.feature = operation.parameters.get(1)
					assignment.value = valueExpression
					expression = assignment
				} else {
					return null
				}
				expression.feature = receiverField
				return expression
			}
		}
		null
	}

	def JvmOperation findMethod(JvmDeclaredType type, String name, String featureName, List<XFeatureCall> params) {
		val methodName = name + featureName.toFirstUpper
		type.members.filter(typeof(JvmOperation)).findFirst(member | isStrategyReceiverMethod(member, methodName, params))
	}
	def boolean isStrategyReceiverMethod(JvmOperation operation, String name, List<XFeatureCall> featureCalls) {
		return isStrategyReceiverMember(operation, name, operation.parameters.map(param | param.parameterType.type), featureCalls)
	}

	def JvmField findField(JvmDeclaredType type, String name, List<XFeatureCall> params) {
		type.members.filter(typeof(JvmField)).findFirst(member | isStrategyReceiverField(member, name, params))
	}
	def boolean isStrategyReceiverField(JvmField field, String name, List<XFeatureCall> featureCalls) {
		return isStrategyReceiverMember(field, name, Collections::singletonList(field.type.type), featureCalls)
	}

	def boolean isStrategyReceiverMember(JvmMember member, String name, Iterable<JvmType> types, List<XFeatureCall> featureCalls) {
		if (! (member.visibility == JvmVisibility::PUBLIC && member.simpleName.equals(name))) {
			return false
		}
		val params = types.iterator
		for (featureCall : featureCalls) {
			if (! params.hasNext())
				return false
			if (params.next().isSubtype(featureCall.feature) == Boolean::FALSE)
				return false
		}
		true
	}
	def Boolean isSubtype(JvmType type1, JvmIdentifiableElement type2) {
		var otherType = null as JvmType
		if (type2 instanceof JvmFormalParameter)
			otherType = (type2 as JvmFormalParameter).parameterType.type
		else if (type2 instanceof JvmTypeReference)
			otherType = (type2 as JvmTypeReference).type
		else if (type2 instanceof JvmType)
			otherType = type2 as JvmType
		return if (otherType != null) type1.isSubtype(otherType) else null
	}
	def Boolean isSubtype(JvmType type1, JvmType type2) {
		return null
	}

	def void generateEDataTypeMapping(EDataTypeMapping eDataTypeMapping, IFileSystemAccess fsa) {
		val eDataType = eDataTypeMapping.EDataType
		val jClass = eDataTypeMapping.declaredType
		val jPackageName = eDataTypeMapping.binderPackageName() // "org.eclipse.gmt.emfacade.tests.binders_gen"
		
		val imports = new EmfacadeImportManager()
		imports.addImports("org.eclipse.gmt.emfacade.builder.IConverter, org.eclipse.gmt.emfacade.builder.AbstractConverter, org.eclipse.gmt.emfacade.builder.IConverterContext");
		imports.addImports(eDataTypeMapping.eClassName)

		val eClassName = imports.get(eDataTypeMapping.eClassName())
		val jClassQName = imports.get(jClass.jClassName)
		val descriptions = eDataTypeMapping.getEDataTypeMappingVariables();
		
		val mainContent = '''
	«eDataTypeMapping.genEPackageImport()»
	
	public class «eDataTypeMapping.converterClassName()» extends AbstractConverter<«eClassName», «jClassQName»> implements IConverter<«eClassName», «jClassQName»> {

		@Override
		public «jClassQName» convert(«eClassName» model, IConverterContext _context) {
			«IF eDataTypeMapping instanceof EEnumMapping»
			switch (model) {
			«FOR eEnumLiteralMapping : (eDataType as EEnumMapping).literalMappings»
			case «eEnumLiteralMapping.enumLiteral.name»: { 
			«{
				val appendable = new StringBuilderBasedAppendable()
				appendable.openScope()
				declareVariables(descriptions, newArrayList("model" -> "model", "_converter" -> "this", "_context" -> "_context"), appendable)
				xbaseCompiler.toJavaStatement(eEnumLiteralMapping.convertExpression, appendable, true)
				appendable.append("return ");
				xbaseCompiler.toJavaExpression(eEnumLiteralMapping.convertExpression, appendable)
				appendable.append(";");
				appendable.toString
			}
			»}
			«ENDFOR»
			}
			«ENDIF»
			«if (eDataTypeMapping.convertExpression != null) {
				val appendable = new StringBuilderBasedAppendable()
				appendable.openScope()
				declareVariables(descriptions, newArrayList("model" -> "model", "_converter" -> "this", "_context" -> "_context"), appendable)
				xbaseCompiler.toJavaStatement(eDataTypeMapping.convertExpression, appendable, true)
				appendable.append("\nreturn ");
				xbaseCompiler.toJavaExpression(eDataTypeMapping.convertExpression, appendable)
				appendable.append(";");
				appendable.toString
			} else
				"return super.convert(model, _context);"
			»
		}
	}
	''';
		val fileContent = '''
			package «jPackageName»;
			
			«FOR importDirective : imports.imports»
			import «importDirective»;
			«ENDFOR»
			
			«mainContent»
		'''		
		fsa.generateFile(jPackageName.replace(".", "/") + "/" + eDataTypeMapping.converterClassName() + ".java", fileContent);
	}
}
