package org.eclipse.gmt.scoping;

import static org.eclipse.xtext.naming.QualifiedName.create;

import org.eclipse.xtext.xbase.scoping.featurecalls.OperatorMapping;

import com.google.inject.Singleton;

/**
 * @author Hallvard Tr¾tteberg
 */
@Singleton
public class EmfacadeOperatorMapping extends OperatorMapping {
	
	@Override
	protected void initializeMapping() {
		super.initializeMapping();
		map.put(create("|"), create("operator_bitor"));
	}
}	
