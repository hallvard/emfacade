package org.eclipse.gmt.emfacade.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.emfacade.EFeatureMapping;
import org.eclipse.gmt.emfacade.FacadeModel;
import org.eclipse.gmt.emfacade.FeatureMappingStrategy;
import org.eclipse.xtext.common.types.JvmAnyTypeReference;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;

public class Util {

	public static <T extends EObject> T getContainerOfType(EObject context, Class<T> clazz) {
		while (context != null) {
			if (clazz.isInstance(context)) {
				return (T) context;
			}
			context = context.eContainer();
		}
		return null;
	}

	private static String casify(String s, boolean toUpper) {
		char c = s.charAt(0);
		if (toUpper && Character.isLowerCase(c)) {
			c = Character.toUpperCase(c);
		} else if ((! toUpper) && Character.isUpperCase(c)) {
			c = Character.toLowerCase(c);
		}
		return (c != s.charAt(0) ? c + s.substring(1) : s);
	}

	public static String downcaseFirst(String name) {
		return casify(name, false);
	}
	public static String upcaseFirst(String name) {
		return casify(name, true);
	}

	public static JvmTypeReference typeRefFor(JvmType type) {
		JvmAnyTypeReference typeRef = TypesFactory.eINSTANCE.createJvmAnyTypeReference();
		typeRef.setType(type);
		return typeRef;
	}

	public static String typeFullName(JvmTypeReference type) {
		if (type instanceof JvmGenericArrayTypeReference) {
			JvmGenericArrayTypeReference arrayType = (JvmGenericArrayTypeReference) type;
			String typeName = typeFullName(arrayType.getComponentType());
			for (int i = 0; i < arrayType.getDimensions(); i++) {
				typeName += "[]";
			}
			return typeName;
		} else if (type instanceof JvmParameterizedTypeReference) {
			JvmParameterizedTypeReference paramType = (JvmParameterizedTypeReference) type;
			String typeName = typeFullName(typeRefFor(paramType.getType())) + "<";
			for (JvmTypeReference typeRef : paramType.getArguments()) {
				if (! typeName.endsWith("<")) {
					typeName += ",";
				}
				typeName += typeFullName(typeRefFor(typeRef.getType()));
			}
			typeName += ">";
			return typeName;
		}
		else if (type instanceof JvmAnyTypeReference) {
			return classFullName((JvmAnyTypeReference) type);
		}
		return type.getSimpleName();
	}

	public static String classFullName(JvmAnyTypeReference typeRef) {
		return typeRef.getQualifiedName();
	}

	public static FeatureMappingStrategy getStrategy(EFeatureMapping eFeatureMapping) {
		FeatureMappingStrategy strategy = null;
		if (strategy == null && eFeatureMapping.getOptions() != null)
			strategy = eFeatureMapping.getOptions().getStrategy();
		if (strategy == null && eFeatureMapping.getEClassMapping().getFeatureMappingDefaults() != null) {
			strategy = eFeatureMapping.getEClassMapping().getFeatureMappingDefaults().getStrategy();
		}
		if (strategy == null) {
			FacadeModel facadeModel = (FacadeModel) EcoreUtil.getRootContainer(eFeatureMapping);
			if (facadeModel.getFeatureMappingDefaults() != null) {
				strategy = facadeModel.getFeatureMappingDefaults().getStrategy();
			}
		}			
		return strategy;
	}
}
