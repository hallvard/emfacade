package org.eclipse.gmt.generator;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmt.emfacade.EClassMapping;
import org.eclipse.gmt.emfacade.EClassifierMapping;
import org.eclipse.gmt.emfacade.FacadeModel;
import org.eclipse.gmt.generator.EmfacadeImportManager;
import org.eclipse.gmt.generator.Util;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenerateBinderFactory {
  @Inject
  private Util util;
  
  public void generateBinderFactory(final FacadeModel facadeModel, final IFileSystemAccess fsa) {
      EList<EClassifierMapping> _classifierMappings = facadeModel.getClassifierMappings();
      EClassifierMapping _head = IterableExtensions.<EClassifierMapping>head(_classifierMappings);
      EClassifier _eClassifier = _head.getEClassifier();
      EPackage _ePackage = _eClassifier.getEPackage();
      String _name = _ePackage.getName();
      final String modelPackageName = _name;
      String _firstUpper = StringExtensions.toFirstUpper(modelPackageName);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "BinderFactory");
      final String binderFactoryName = _operator_plus;
      EList<EClassifierMapping> _classifierMappings_1 = facadeModel.getClassifierMappings();
      EClassifierMapping _head_1 = IterableExtensions.<EClassifierMapping>head(_classifierMappings_1);
      String _binderPackageName = this.util.binderPackageName(_head_1);
      final String jPackageName = _binderPackageName;
      EmfacadeImportManager _emfacadeImportManager = new EmfacadeImportManager();
      final EmfacadeImportManager imports = _emfacadeImportManager;
      imports.addImports("org.eclipse.emf.ecore.EObject, org.eclipse.gmt.emfacade.builder.IBinder");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class ");
      _builder.append(binderFactoryName, "");
      _builder.append(" extends ");
      GenPackage _genModel = facadeModel.getGenModel();
      String _basePackage = _genModel.getBasePackage();
      _builder.append(_basePackage, "");
      _builder.append(".");
      _builder.append(modelPackageName, "");
      _builder.append(".util.");
      String _firstUpper_1 = StringExtensions.toFirstUpper(modelPackageName);
      _builder.append(_firstUpper_1, "");
      _builder.append("AdapterFactory {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public boolean isFactoryForType(Object type) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return IBinder.class.equals(type);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t\t");
      EList<EClassifierMapping> _classifierMappings_2 = facadeModel.getClassifierMappings();
      final Function1<EClassifierMapping,CharSequence> _function = new Function1<EClassifierMapping,CharSequence>() {
          public CharSequence apply(final EClassifierMapping eClassifierMapping) {
            CharSequence _xblockexpression = null;
            {
              EClassifier _eClassifier_1 = eClassifierMapping.getEClassifier();
              final EClassifier eClassifier = _eClassifier_1;
              CharSequence _xifexpression = null;
              if ((eClassifier instanceof EDataType)) {
                _xifexpression = "";
              } else {
                CharSequence _xifexpression_1 = null;
                boolean _operator_and = false;
                if (!(eClassifier instanceof EClass)) {
                  _operator_and = false;
                } else {
                  boolean _isAbstract = ((EClass) eClassifier).isAbstract();
                  _operator_and = BooleanExtensions.operator_and((eClassifier instanceof EClass), _isAbstract);
                }
                if (_operator_and) {
                  _xifexpression_1 = "";
                } else {
                  StringConcatenation _xblockexpression_1 = null;
                  {
                    String _eClassName = GenerateBinderFactory.this.util.eClassName(eClassifierMapping);
                    String _get = imports.get(_eClassName);
                    final String eClassifierQName = _get;
                    String _binderClassName = GenerateBinderFactory.this.util.binderClassName(((EClassMapping) eClassifierMapping));
                    final String binderClassName = _binderClassName;
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("private IBinder<?, ?> ");
                    String _firstLower = StringExtensions.toFirstLower(binderClassName);
                    _builder.append(_firstLower, "");
                    _builder.append(" = null;");
                    _builder.newLineIfNotEmpty();
                    _builder.append("@Override");
                    _builder.newLine();
                    _builder.append("public IBinder<?, ?> create");
                    String _name_1 = eClassifier.getName();
                    _builder.append(_name_1, "");
                    _builder.append("Adapter() {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("if (");
                    String _firstLower_1 = StringExtensions.toFirstLower(binderClassName);
                    _builder.append(_firstLower_1, "	");
                    _builder.append(" == null) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    String _firstLower_2 = StringExtensions.toFirstLower(binderClassName);
                    _builder.append(_firstLower_2, "		");
                    _builder.append(" = new ");
                    _builder.append(binderClassName, "		");
                    _builder.append("<");
                    _builder.append(eClassifierQName, "		");
                    _builder.append(", ");
                    String _jClassName = GenerateBinderFactory.this.util.jClassName(eClassifierMapping);
                    String _get_1 = imports.get(_jClassName);
                    _builder.append(_get_1, "		");
                    _builder.append(">();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("return ");
                    String _firstLower_3 = StringExtensions.toFirstLower(binderClassName);
                    _builder.append(_firstLower_3, "	");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                    _xblockexpression_1 = (_builder);
                  }
                  _xifexpression_1 = _xblockexpression_1;
                }
                _xifexpression = _xifexpression_1;
              }
              _xblockexpression = (_xifexpression);
            }
            return _xblockexpression;
          }
        };
      String _join = IterableExtensions.<EClassifierMapping>join(_classifierMappings_2, "\n", _function);
      _builder.append(_join, "			");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      final StringConcatenation mainContent = _builder;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package ");
      _builder_1.append(jPackageName, "");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      _builder_1.newLine();
      {
        List<String> _imports = imports.getImports();
        for(final String importDirective : _imports) {
          _builder_1.append("import ");
          _builder_1.append(importDirective, "");
          _builder_1.append(";");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.append("\t\t\t");
      _builder_1.newLine();
      _builder_1.append(mainContent, "");
      _builder_1.newLineIfNotEmpty();
      final StringConcatenation fileContent = _builder_1;
      String _replace = jPackageName.replace(".", "/");
      String _operator_plus_1 = StringExtensions.operator_plus(_replace, "/");
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, binderFactoryName);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, ".java");
      fsa.generateFile(_operator_plus_3, fileContent);
  }
}
