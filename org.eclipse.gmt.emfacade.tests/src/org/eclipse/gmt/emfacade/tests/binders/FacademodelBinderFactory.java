package org.eclipse.gmt.emfacade.tests.binders;

import org.eclipse.gmt.emfacade.builder.IBinder;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet;
import org.eclipse.gmt.emfacade.tests.facademodel.util.FacademodelAdapterFactory;
import org.eclipse.gmt.emfacade.tests.views.SimpleParent1GetSet;

public class FacademodelBinderFactory extends FacademodelAdapterFactory {

	@Override
	public IBinder<?, ?> createMSimpleBeanAdapter() {
		return new MSimpleBeanBinder();
	}

	private IBinder<?, ?> MSimpleClassPublicFieldsBinder = null;

	@Override
	public IBinder<?, ?> createMSimpleClassPublicFieldsAdapter() {
		if (MSimpleClassPublicFieldsBinder == null) {
			MSimpleClassPublicFieldsBinder = new MSimpleClassPublicFieldsBinder();
		}
		return MSimpleClassPublicFieldsBinder;
	}

	private IBinder<?, ?> MSimpleParent1GetSetBinder = null;

	@Override
	public IBinder<?, ?> createMSimpleParent1GetSetAdapter() {
		if (MSimpleParent1GetSetBinder == null) {
			MSimpleParent1GetSetBinder = new MSimpleParent1GetSetBinder<MSimpleParent1GetSet, SimpleParent1GetSet>();
		}
		return MSimpleParent1GetSetBinder;
	}
	
	private IBinder<?, ?> MSimpleParentN1SizeGetSetAddRemoveBinder = null;
	
	@Override
	public IBinder<?, ?> createMSimpleParentN1SizeGetSetAddRemoveAdapter() {
		if (MSimpleParentN1SizeGetSetAddRemoveBinder == null) {
			MSimpleParentN1SizeGetSetAddRemoveBinder = new MSimpleParentN1SizeGetSetAddRemoveBinder();
		}
		return MSimpleParentN1SizeGetSetAddRemoveBinder;
	}
	
	private IBinder<?, ?> MSimpleParentN2AddRemoveBinder = null;

	@Override
	public IBinder<?, ?> createMSimpleParentN2AddRemoveAdapter() {
		if (MSimpleParentN2AddRemoveBinder == null) {
			MSimpleParentN2AddRemoveBinder = new MSimpleParentN2AddRemoveBinder();
		}
		return MSimpleParentN2AddRemoveBinder;
	}
	
	private IBinder<?, ?> MSimpleParentN3ListBinder = null;
	
	@Override
	public IBinder<?, ?> createMSimpleParentN3ListAdapter() {
		if (MSimpleParentN3ListBinder == null) {
			MSimpleParentN3ListBinder = new MSimpleParentN3ListBinder();
		}
		return MSimpleParentN3ListBinder;
	}
	
	private IBinder<?, ?> MSimpleCompositeBinder = null;
	
	@Override
	public IBinder<?, ?> createMSimpleCompositeAdapter() {
		if (MSimpleCompositeBinder == null) {
			MSimpleCompositeBinder = new MSimpleCompositeBinder();
		}
		return MSimpleCompositeBinder;
	}
	
	private IBinder<?, ?> MSimpleControlBinder = null;
	
	@Override
	public IBinder<?, ?> createMSimpleControlAdapter() {
		if (MSimpleControlBinder == null) {
			MSimpleControlBinder = new MSimpleControlBinder();
		}
		return MSimpleControlBinder;
	}
	
	private IBinder<?, ?> MImmutableValueBinder = null;
	
	@Override
	public IBinder<?, ?> createMImmutableValueAdapter() {
		if (MImmutableValueBinder == null) {
			MImmutableValueBinder = new MImmutableValueBinder();
		}
		return MImmutableValueBinder;
	}
	
	private IBinder<?, ?> MImmutableValueParentBinder = null;
	
	@Override
	public IBinder<?, ?> createMImmutableValueParentAdapter() {
		if (MImmutableValueParentBinder == null) {
			MImmutableValueParentBinder = new MImmutableValueParentBinder();
		}
		return MImmutableValueParentBinder;
	}
}
