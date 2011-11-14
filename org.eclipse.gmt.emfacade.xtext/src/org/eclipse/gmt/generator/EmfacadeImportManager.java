package org.eclipse.gmt.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnyTypeReference;
import org.eclipse.xtext.common.types.JvmArrayType;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;

public class EmfacadeImportManager {

	private Map<String, String> imports = new HashMap<String, String>();

	public String get(JvmIdentifiableElement element) {
		return get(element.getQualifiedName());
	}
	public String get(String qualifiedName) {
		return append(qualifiedName, null);
	}

	public String append(String qualifiedName, StringBuilder buffer) {
		int pos = qualifiedName.lastIndexOf('.');
		String appendName = qualifiedName.substring(pos + 1);
		if (qualifiedName.startsWith("java.lang.") || appendName.equals(qualifiedName)) {
		} else {
			if (! imports.containsKey(appendName)) {
				imports.put(appendName, qualifiedName);
			}
			if (! qualifiedName.equals(imports.get(appendName))) {
				appendName = qualifiedName;
			}
		}
		if (buffer != null) {
			buffer.append(appendName);
		}
		return appendName;
	}

	public void append(JvmType type, StringBuilder buffer) {
		if (type instanceof JvmPrimitiveType || type instanceof JvmVoid || type instanceof JvmTypeParameter) {
			buffer.append(type.getQualifiedName('.'));
		} else if (type instanceof JvmArrayType) {
			append(((JvmArrayType) type).getComponentType(), buffer);
			buffer.append("[]");
		} else {
			append(type.getQualifiedName('.'), buffer);
		}
	}

	public void append(JvmTypeReference typeRef, StringBuilder buffer) {
		if (typeRef instanceof JvmParameterizedTypeReference) {
			final JvmType type = typeRef.getType();
			append(type, buffer);
			EList<JvmTypeReference> arguments = ((JvmParameterizedTypeReference) typeRef).getArguments();
			if (arguments.size() > 0) {
				buffer.append("<");
				int count = 0;
				for (JvmTypeReference typeArg : arguments) {
					if (count++ > 0) {
						buffer.append(", ");
					}
					append(typeArg, buffer);
				}
				buffer.append(">");
			}
		} else if (typeRef instanceof JvmWildcardTypeReference) {
			buffer.append("?");
			int count = 0;
			for (JvmTypeConstraint constraint : ((JvmWildcardTypeReference) typeRef).getConstraints()) {
				if (count++ > 0) {
					buffer.append(" & ");
				}
				buffer.append(constraint instanceof JvmUpperBound ? " extends " : " super ");
				append(constraint.getTypeReference(), buffer);
			}
		} else if (typeRef instanceof JvmGenericArrayTypeReference) {
			JvmGenericArrayTypeReference reference = (JvmGenericArrayTypeReference) typeRef;
			append(reference.getComponentType(), buffer);
			buffer.append("[]");
		} else if (typeRef instanceof JvmAnyTypeReference) {
			append(typeRef.getType(), buffer);
		}
	}

	public List<String> getImports() {
		ArrayList<String> result = new ArrayList<String>(imports.values());
		Collections.sort(result);
		String packageImport = "$";
		for (int i = 0; i < result.size(); i++) {
			String s = result.get(i);
			if (s.endsWith(".*")) {
				packageImport = s.substring(0, s.length() - 1);
			} else if (s.startsWith(packageImport) && s.indexOf('.', packageImport.length()) < 0) {
				result.remove(i--);
			}
		}
		return result;
	}
	
	public void append(StringBuilder buffer) {
		for (String s : getImports()) {
			buffer.append("import ");
			buffer.append(s);
			buffer.append(";\n");
		}
	}

	public int insert(StringBuilder buffer, int pos) {
		for (String s : getImports()) {
			pos = insert(buffer, pos, "import ");
			pos = insert(buffer, pos, s);
			pos = insert(buffer, pos, ";\n");
		}
		return pos;
	}
	private int insert(StringBuilder buffer, int pos, String s) {
		buffer.insert(pos, s);
		return pos + s.length();
	}

	public void addImports(EmfacadeImportManager imports) {
		addImports(imports.getImports());
	}

	public void addImports(Collection<String> imports) {
		addImports(imports.toArray(new String[imports.size()]));
	}
	
	public void addImports(String... imports) {
		for (int i = 0; i < imports.length; i++) {
			String qualifiedName = imports[i].trim();
			if (qualifiedName.contains(",")) {
				addImports(qualifiedName.split(","));
			} else if (qualifiedName.endsWith(".*")) {
				int pos = qualifiedName.lastIndexOf('.');
				this.imports.put(qualifiedName.substring(0, pos), qualifiedName);
			} else {
				append(qualifiedName, null);
			}
		}
	}
}
