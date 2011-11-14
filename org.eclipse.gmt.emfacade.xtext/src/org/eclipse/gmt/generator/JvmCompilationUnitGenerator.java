package org.eclipse.gmt.generator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gmt.emfacade.InterfaceImplementation;
import org.eclipse.gmt.emfacade.InterfaceMethodImplementation;
import org.eclipse.gmt.emfacade.util.EmfacadeJvmInferrerHelper;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.lib.Pair;

import com.google.inject.Inject;

public class JvmCompilationUnitGenerator {

	private String packageName;
	
	private EmfacadeImportManager imports = new EmfacadeImportManager();
	private List<JvmGenericType> types = new ArrayList<JvmGenericType>();
	
	//
	
	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public void setImports(EmfacadeImportManager imports) {
		this.imports = imports;
	}
	
	public void addDeclaredType(JvmGenericType type) {
		types.add(type);
	}
	
	public void removeDeclaredType(JvmGenericType type) {
		types.remove(type);
	}
	
	//
	
	private String indentString = "  ";
	
	protected void indent(int count, StringBuilder buffer) {
		if (buffer.charAt(buffer.length() - 1) != '\n') {
			buffer.append("\n");
		}
		for (int i = 0; i < count; i++) {
			buffer.append(indentString);
		}
	}
	
	public CharSequence doGenerate(IFileSystemAccess fsa) {
		StringBuilder buffer = new StringBuilder();
		JvmGenericType mainType = (types.isEmpty() ? null : types.get(0));
		if (packageName == null && mainType != null) {
			int pos = mainType.getQualifiedName().lastIndexOf('.');
			if (pos > 0) {
				packageName = mainType.getQualifiedName().substring(0, pos);
			}
		}
		if (packageName != null) {
			append(buffer, "package ", packageName, ";\n\n");
		}
		int importsPos = buffer.length();
		for (JvmGenericType type : types) {
			buffer.append("\n");
			generate(type, buffer);
		}
		imports.insert(buffer, importsPos);
		if (fsa != null && (! types.isEmpty())) {
			fsa.generateFile((packageName != null ? packageName.replace('.', '/') + "/" : "") + mainType.getSimpleName() + ".java", buffer);
		}
		return buffer;
	}

	private void append(StringBuilder buffer, String... strings) {
		for (int i = 0; i < strings.length; i++) {
			String s = strings[i];
			buffer.append(s);
		}
	}
	
	public CharSequence generate(JvmGenericType type) {
		StringBuilder buffer = new StringBuilder();
		generate(type, buffer);
		return buffer;
	}
	
	protected void generate(JvmGenericType type, StringBuilder buffer) {
		generateVisibility(type, buffer);
		generateIf(type.isFinal(), "final", buffer);
		generateIf(type.isStatic(), "static", buffer);
		generateIf(type.isAbstract(), "abstract", buffer);
		append(buffer, type.isInterface() ? "interface " : "class ", type.getSimpleName(), " ");
		List<JvmTypeReference> extendsList = new ArrayList<JvmTypeReference>();
		List<JvmTypeReference> implementsList = new ArrayList<JvmTypeReference>();
		for (JvmTypeReference superTypeRef : type.getSuperTypes()) {
			JvmGenericType superType = (JvmGenericType) superTypeRef.getType();
			(type.isInterface() || (! superType.isInterface()) ? extendsList : implementsList).add(superTypeRef);
		}
		generate(extendsList, "extends", buffer);
		generate(implementsList, "implements", buffer);

		buffer.append("{\n");
		generate(type.getMembers(), buffer);
		buffer.append("}\n");
	}

	public CharSequence generate(Iterable<JvmMember> members) {
		StringBuilder buffer = new StringBuilder();
		generate(members, buffer);
		return buffer;
	}

	protected void generate(Iterable<JvmMember> members, StringBuilder buffer) {
		for (JvmMember member : members) {
			buffer.append("\n");
			if (member instanceof JvmField) {
				generate((JvmField) member, buffer);
			} else if (member instanceof JvmConstructor) {
				generate((JvmConstructor) member, buffer);
			} else if (member instanceof JvmOperation) {
				generate((JvmOperation) member, buffer);
			}
		}
	}

	protected void generateVisibility(JvmMember member, StringBuilder buffer) {
		JvmVisibility visibility = member.getVisibility();
		if (visibility != JvmVisibility.DEFAULT) {
			append(buffer, visibility.getName().toLowerCase(), " ");
		}
	}
	
	protected void generate(JvmConstructor member, StringBuilder buffer) {
		indent(1, buffer);
		generateVisibility(member, buffer);
		buffer.append(member.getDeclaringType().getSimpleName());
	}

	protected void generate(JvmOperation member, StringBuilder buffer) {
		indent(1, buffer);
		generateVisibility(member, buffer);
		generate(member.getReturnType(), buffer);
		generateOperationName(member, buffer);
		buffer.append("(");
		generateParameterList(member, buffer);
		buffer.append(")");
		if (((JvmGenericType) member.getDeclaringType()).isInterface()) {
			buffer.append(";");
		} else {
			buffer.append(" {");
			generateBody(member, buffer);
			indent(1, buffer);
			buffer.append("}");
		}
		buffer.append("\n");
	}

	private String nameFormat = null;

	public String getNameFormat() {
		return nameFormat;
	}

	public void setNameFormat(String nameFormat) {
		this.nameFormat = nameFormat;
	}

	protected void generateOperationName(JvmOperation member, StringBuilder buffer) {
		String name = member.getSimpleName();
		if (nameFormat != null) {
			name = MessageFormat.format(nameFormat, name);
		}
		append(buffer, " ", name);
	}

	@Inject
	private XbaseCompiler xbaseCompiler;
	
	private Map<JvmMember, XExpression> memberExpressions = new HashMap<JvmMember, XExpression>();

	public void setMemberExpression(JvmMember member, XExpression expression) {
		memberExpressions.put(member, expression);
	}
	public void setMemberExpression(JvmMember member, InterfaceImplementation impl) {
		for (InterfaceMethodImplementation methodImplementation : impl.getMethodImplementations()) {
			if (methodImplementation.getInterfaceMethod().getSimpleName().equals(member.getSimpleName())) {
				memberExpressions.put(member, methodImplementation.getMethodBody());
				break;
			}
		}
	}

	private List<Pair<String, String>> extraParameters = null;
	
	public void setExtraParameters(Pair<String, String>... extraParameters) {
		this.extraParameters = new ArrayList(Arrays.asList(extraParameters));
	}
	
	@Inject
	private EmfacadeJvmInferrerHelper inferrerHelper;
	
	protected void generateBody(JvmExecutable executable, StringBuilder buffer) {
		XExpression body = memberExpressions.get(executable);
		boolean isExpression = executable instanceof JvmOperation && (! isVoid(((JvmOperation) executable).getReturnType()));
		if (body != null) {
			StringBuilderBasedAppendable appendable = new StringBuilderBasedAppendable();
			appendable.increaseIndentation();
			appendable.increaseIndentation();
			appendable.openScope();
			for (JvmFormalParameter param : executable.getParameters()) {
				appendable.declareVariable(param, param.getSimpleName());
			}
			if (extraParameters != null) {
				for (Pair<String, String> pair : extraParameters) {
					Object existingValue = appendable.getObject(pair.getValue());
					if (existingValue != null) {
						appendable.declareVariable(existingValue, pair.getKey());
					} else {
						JvmTypeReference type = inferrerHelper.getJvmTypeRef(pair.getValue(), executable);
						if (type != null) {
							appendable.declareVariable(type.getType(), pair.getKey());
						}
					}
				}
			}
			xbaseCompiler.toJavaStatement(body, appendable, isExpression);
			if (isExpression) {
				appendable.append("\nreturn ");
				xbaseCompiler.toJavaExpression(body, appendable);
				appendable.append(";");
			}
			appendable.closeScope();
			buffer.append(appendable);
		} else {
			buffer.append("\nreturn" + (isExpression ? " null" : "") + ";");
		}
	}

	public boolean isVoid(JvmTypeReference type) {
		return "void".equals(type.getSimpleName());
	}

	protected void generateParameterList(JvmExecutable executable, StringBuilder buffer) {
		int count = 0;
		for (JvmFormalParameter parameter : executable.getParameters()) {
			if (count++ > 0) {
				buffer.append(", ");
			}
			generate(parameter, buffer);
		}
		if (extraParameters != null) {
			for (Pair<String, String> pair : extraParameters) {
				String typeName = pair.getValue();
				JvmTypeReference type = inferrerHelper.getJvmTypeRef(typeName, executable);
				if (type != null) {
					if (count++ > 0) {
						buffer.append(", ");
					}
					append(buffer, imports.get(type.getType()), " ", pair.getKey());
				}
			}
		}
	}

	protected void generate(JvmFormalParameter parameter, StringBuilder buffer) {
		generate(parameter.getParameterType(), buffer);
		buffer.append(" ");
		buffer.append(parameter.getSimpleName());
	}

	protected void generate(JvmField member, StringBuilder buffer) {
		indent(1, buffer);
		generateVisibility(member, buffer);
		generate(member.getType(), buffer);
		buffer.append(member.getSimpleName());

		XExpression body = memberExpressions.get(member);
		if (body != null) {
			StringBuilderBasedAppendable appendable = new StringBuilderBasedAppendable();
			appendable.increaseIndentation();
			appendable.increaseIndentation();
			appendable.openScope();
			String s1 = appendable.toString();
			xbaseCompiler.toJavaStatement(body, appendable, true);
			String s2 = appendable.toString();
			appendable.append("\nreturn ");
			if (s1.equals(s2)) {
				appendable = new StringBuilderBasedAppendable();
			}
			xbaseCompiler.toJavaExpression(body, appendable);
			appendable.append(";");
			
			buffer.append(" = ");
			if (s1.equals(s2)) {
				buffer.append(appendable.toString());
			} else {
				buffer.append("new ");
				imports.append("com.google.common.base.Supplier", buffer);
				buffer.append("<");
				generate(member.getType(), buffer);
				buffer.append(">() { public ");
				generate(member.getType(), buffer);
				buffer.append(" get() {\n");
				buffer.append(appendable.toString());
				buffer.append(" \n}}.get()");
			}
		}
		buffer.append(";");
	}

	protected void generateIf(boolean test, String ix, StringBuilder buffer) {
		if (test) {
			buffer.append(ix);
			buffer.append(" ");
		}
	}
	
	private void generate(List<JvmTypeReference> typeRefs, String prefix, StringBuilder buffer) {
		if (! typeRefs.isEmpty()) {
			buffer.append(prefix);
			buffer.append(" ");
		}
		generate(typeRefs, buffer);
	}

	protected void generate(List<JvmTypeReference> typeRefs, StringBuilder buffer) {
		for (int i = 0; i < typeRefs.size(); i++) {
			if (i > 0) {
				buffer.append(", ");
			}
			JvmTypeReference typeRef = typeRefs.get(i);
			generate(typeRef, buffer);
		}
		if (! typeRefs.isEmpty()) {
			buffer.append(" ");
		}
	}

	protected void generate(JvmTypeReference typeRef, StringBuilder buffer) {
		imports.append(typeRef, buffer);
	}
}
