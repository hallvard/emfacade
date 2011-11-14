package org.eclipse.gmt.scoping;

import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

public class EmfacadeQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider
{
  @Inject
  private IQualifiedNameConverter nameConverter;
  
  QualifiedName qualifiedName(JvmType type) {
	  String typeName = type.getQualifiedName();
	  return nameConverter.toQualifiedName(typeName);
  }

  QualifiedName qualifiedName(JvmMember member) {
	  String memberName = member.getQualifiedName();
	  return nameConverter.toQualifiedName(memberName);
  }
  
//  QualifiedName qualifiedName(FeatureMappingStrategy featureMappingStrategy) {
//	  return nameConverter.toQualifiedName(featureMappingStrategy.getImplType().getQualifiedName());
//  }
  
//  QualifiedName qualifiedName(GenPackage genPackage, String suffix) {
//	  String name = genPackage.getQualifiedPackageName();
//	  if (suffix != null) {
//		  name += "." + suffix;
//	  }
//	  return nameConverter.toQualifiedName(name);
//  }
  
//  QualifiedName qualifiedName(FacadeModel model) {
//	  return qualifiedName(model.getGenModel());
//  }
//  QualifiedName qualifiedName(GenPackage genPackage) {
//	  return qualifiedName(genPackage, null);
//  }
//  QualifiedName qualifiedName(GenClassifier genClassifier) {
//	  return qualifiedName(genClassifier.getGenPackage(), genClassifier.getName());
//  }
  
//  QualifiedName qualifiedName(EClassifier eClassifier) {
//	  String packageName = eClassifier.getEPackage().getName();
//	  return nameConverter.toQualifiedName(packageName + "." + eClassifier.getName());
//  }

//  QualifiedName qualifiedName(EClassifierMapping eClassifierMapping) {
//	  return qualifiedName(eClassifierMapping.getEClassifier());
//  }
}
