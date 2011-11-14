package org.eclipse.gmt.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IContainer.Manager;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.generic.GenericResourceDescriptionManager;
import org.eclipse.xtext.resource.generic.GenericResourceServiceProvider;
import org.eclipse.xtext.resource.generic.XMLEncodingProvider;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.validation.IResourceValidator;

import com.google.inject.Inject;

public class GenmodelResourceServiceProviderImpl extends GenericResourceServiceProvider {

	public Manager getContainerManager() {
		return null;
	}

	@Inject
	private IDefaultResourceDescriptionStrategy resourceDescriptionStrategy;

	@Inject
	private IResourceScopeCache cache = new IResourceScopeCache.NullImpl();

	private IResourceDescription.Manager resourceDescriptionManager = new GenericResourceDescriptionManager() {
		public IResourceDescription getResourceDescription(Resource resource) {
			return new DefaultResourceDescription(resource, new DefaultResourceDescriptionStrategy() {
				@Override
				public IQualifiedNameProvider getQualifiedNameProvider() {
					return super.getQualifiedNameProvider();
				}
			}, cache);
		}
//		public boolean isAffected(Delta delta, IResourceDescription candidate) throws IllegalArgumentException {
//			return false;
//		}
//		public boolean isAffected(Collection<Delta> deltas, IResourceDescription candidate, IResourceDescriptions context) throws IllegalArgumentException {
//			return false;
//		}
	};

	public IResourceDescription.Manager getResourceDescriptionManager() {
		return resourceDescriptionManager;
	}

	public IResourceValidator getResourceValidator() {
		return IResourceValidator.NULL;
	}

	public boolean canHandle(URI uri) {
		return true;
	}

	private IEncodingProvider encodingProvider = new XMLEncodingProvider();
	
	public IEncodingProvider getEncodingProvider() {
		return encodingProvider;
	}
}
