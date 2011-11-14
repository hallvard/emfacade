package org.eclipse.gmt.emfacade.tests.binders_gen;

import org.eclipse.gmt.emfacade.builder.IBinder;
import org.eclipse.gmt.emfacade.builder.BinderFactory;

import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields;
import org.eclipse.gmt.emfacade.tests.views.SimpleClassPublicFields;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet;
import org.eclipse.gmt.emfacade.tests.views.SimpleParent1GetSet;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN2AddRemove;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN1SizeGetSetAddRemove;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN3List;
import org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValue;
import org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValueParent;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl;
import org.eclipse.gmt.emfacade.tests.views.SimpleControl;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite;
import org.eclipse.gmt.emfacade.tests.views.SimpleComposite;

public class FacademodelBinderFactory extends BinderFactory {

	public IBinder<?, ?> createBinder(org.eclipse.emf.ecore.EObject model) {
		return new org.eclipse.gmt.emfacade.tests.facademodel.util.FacademodelSwitch<IBinder<?, ?>>() {
			@Override
			public IBinder<?, ?> caseMSimpleBean(MSimpleBean object) {
				return new MSimpleBeanBinder<MSimpleBean, SimpleBean>();
			}
			@Override
			public IBinder<?, ?> caseMSimpleClassPublicFields(MSimpleClassPublicFields object) {
				return new MSimpleClassPublicFieldsBinder<MSimpleClassPublicFields, SimpleClassPublicFields>();
			}
			@Override
			public IBinder<?, ?> caseMSimpleParent1GetSet(MSimpleParent1GetSet object) {
				return new MSimpleParent1GetSetBinder<MSimpleParent1GetSet, SimpleParent1GetSet>();
			}
			@Override
			public IBinder<?, ?> caseMSimpleParentN2AddRemove(MSimpleParentN2AddRemove object) {
				return new MSimpleParentN2AddRemoveBinder<MSimpleParentN2AddRemove, SimpleParentN2AddRemove>();
			}
			@Override
			public IBinder<?, ?> caseMSimpleParentN1SizeGetSetAddRemove(MSimpleParentN1SizeGetSetAddRemove object) {
				return new MSimpleParentN1SizeGetSetAddRemoveBinder<MSimpleParentN1SizeGetSetAddRemove, SimpleParentN1SizeGetSetAddRemove>();
			}
			@Override
			public IBinder<?, ?> caseMSimpleParentN3List(MSimpleParentN3List object) {
				return new MSimpleParentN3ListBinder<MSimpleParentN3List, SimpleParentN3List>();
			}
			@Override
			public IBinder<?, ?> caseMImmutableValue(MImmutableValue object) {
				return new MImmutableValueBinder<MImmutableValue, ImmutableValue>();
			}
			@Override
			public IBinder<?, ?> caseMImmutableValueParent(MImmutableValueParent object) {
				return new MImmutableValueParentBinder<MImmutableValueParent, ImmutableValueParent>();
			}
			@Override
			public IBinder<?, ?> caseMSimpleControl(MSimpleControl object) {
				return new MSimpleControlBinder<MSimpleControl, SimpleControl>();
			}
			@Override
			public IBinder<?, ?> caseMSimpleComposite(MSimpleComposite object) {
				return new MSimpleCompositeBinder<MSimpleComposite, SimpleComposite>();
			}
		}.doSwitch(model);
	}
}
