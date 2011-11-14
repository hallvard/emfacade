package org.eclipse.gmt.generator;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;

import com.google.inject.Injector;

public class TypeUtil {

	public  Class<?>[] types = {
		boolean.class, java.lang.Boolean.class, 
		char.class, java.lang.Character.class, 
		int.class, java.lang.Integer.class,
		long.class, java.lang.Long.class, 
		byte.class, java.lang.Byte.class, 
		short.class, java.lang.Short.class, 
		double.class, java.lang.Double.class, 
		float.class, java.lang.Float.class, 
	};
	
	private Class<?> getType(String typeName, boolean wrapper) {
		for (int i = (wrapper ? 0 : 1); i < types.length; i += 2) {
			Class<?> c = types[i];
			if (typeName.equals(c.getName())) {
				return types[i + (wrapper ? 1 : -1)];
			}
		}
		return null;
	}

	private Class<?> getType(Class<?> type, boolean wrapper) {
		for (int i = (wrapper ? 0 : 1); i < types.length; i += 2) {
			Class<?> c = types[i];
			if (type == c) {
				return types[i + (wrapper ? 1 : -1)];
			}
		}
		return type;
	}
	
	public Class<?> getPrimitiveType(String typeName) {
		return getType(typeName, false);
	}
	public Class<?> getWrapperType(String typeName) {
		return getType(typeName, true);
	}
	public Class<?> getPrimitiveType(Class<?> type) {
		return getType(type, false);
	}
	public Class<?> getWrapperType(Class<?> type) {
		return getType(type, true);
	}
	
	public String getPrimitiveTypeName(String typeName) {
		Class<?> type = getType(typeName, false);
		return type != null ? type.getName() : typeName;
	}
	public String getWrapperTypeName(String typeName) {
		Class<?> type = getType(typeName, true);
		return type != null ? type.getName() : typeName;
	}
	public String getPrimitiveTypeName(Class<?> type) {
		Class<?> result = getType(type, false);
		return result != null ? result.getName() : type.getName();
	}
	public String getWrapperTypeName(Class<?> type) {
		Class<?> result = getType(type, true);
		return result != null ? result.getName() : type.getName();
	}
	
	public <T> Class<T> classFor(JvmType type) {
		try {
			return (Class<T>) Class.forName(type.getQualifiedName());
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e);
		}
	}
	public <T> Class<T> classFor(JvmTypeReference type) {
		return classFor(type.getType());
	}
	public Object getInstance(Injector injector, JvmType type) {
		try {
			Class<?> clazz = (Class<?>) Class.forName(type.getQualifiedName());
			return injector.getInstance(clazz);
		} catch (ClassNotFoundException e) {
			return null;
		}
	}
	public Object getInstance(Injector injector, JvmTypeReference type) {
		return getInstance(injector, type.getType());
	}
}
