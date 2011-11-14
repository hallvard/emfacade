package org.eclipse.gmt.emfacade.builder.strategies;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class ListStrategyN extends StrategyN {

	public interface Association<V, VE> {
		List<VE> getVE(V t);
	}

	public static class Impl<M extends EObject, ME extends EObject, V, VE> extends SizeGetSetAddRemoveStrategyN.Impl<M, ME, V, VE>{
		public Impl(Association<V, VE> association) {
			super(new AssociationImpl<V, VE>(association));
		}
	}
	
	private static class AssociationImpl<V, VE> implements SizeGetSetAddRemoveStrategyN.Association<V, VE> {

		private Association<V, VE> association;
		
		public AssociationImpl(Association<V, VE> association) {
			this.association = association;
		}

		public int getCount(V t) 			{ return association.getVE(t).size();}
		public VE get(V t, int i) 			{ return association.getVE(t).get(i);}
		public void set(V t, int i, VE e) 	{ association.getVE(t).set(i, e);}
		public void add(V t, int i, VE e) 	{ association.getVE(t).add(i, e);}
		public void remove(V t, int i) 		{ association.getVE(t).remove(i);}
	}
}
