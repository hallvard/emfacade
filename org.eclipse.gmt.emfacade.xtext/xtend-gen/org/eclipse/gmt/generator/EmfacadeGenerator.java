package org.eclipse.gmt.generator;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmt.emfacade.EClassMapping;
import org.eclipse.gmt.emfacade.EClassifierMapping;
import org.eclipse.gmt.emfacade.EDataTypeMapping;
import org.eclipse.gmt.emfacade.FacadeModel;
import org.eclipse.gmt.generator.GenerateBinderFactory;
import org.eclipse.gmt.generator.GenerateEClassMapping;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;

@SuppressWarnings("all")
public class EmfacadeGenerator implements IGenerator {
  @Inject
  private GenerateEClassMapping _generateEClassMapping;
  
  @Inject
  private GenerateBinderFactory _generateBinderFactory;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      ResourceSet _resourceSet = resource.getResourceSet();
      final ResourceSet resourceSet = _resourceSet;
      EList<EObject> _contents = resource.getContents();
      final EList<EObject> contents = _contents;
      boolean _operator_and = false;
      int _size = contents.size();
      boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_size), ((Integer)0));
      if (!_operator_greaterThan) {
        _operator_and = false;
      } else {
        EObject _get = contents.get(0);
        _operator_and = BooleanExtensions.operator_and(_operator_greaterThan, (_get instanceof FacadeModel));
      }
      if (_operator_and) {
        EObject _get_1 = contents.get(0);
        this.generate(((FacadeModel) _get_1), fsa);
      }
  }
  
  public void generate(final FacadeModel facadeModel, final IFileSystemAccess fsa) {
      EList<EClassifierMapping> _classifierMappings = facadeModel.getClassifierMappings();
      for (final EClassifierMapping eClassifierMapping : _classifierMappings) {
        final EClassifierMapping eClassifierMapping_1 = eClassifierMapping;
        boolean matched = false;
        if (!matched) {
          if (eClassifierMapping_1 instanceof EClassMapping) {
            final EClassMapping eClassifierMapping_2 = (EClassMapping) eClassifierMapping_1;
            matched=true;
            this._generateEClassMapping.generateEClassMapping(eClassifierMapping_2, fsa);
          }
        }
        if (!matched) {
          if (eClassifierMapping_1 instanceof EDataTypeMapping) {
            final EDataTypeMapping eClassifierMapping_3 = (EDataTypeMapping) eClassifierMapping_1;
            matched=true;
            this._generateEClassMapping.generateEDataTypeMapping(eClassifierMapping_3, fsa);
          }
        }
      }
      this._generateBinderFactory.generateBinderFactory(facadeModel, fsa);
  }
}
