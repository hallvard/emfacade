package org.eclipse.gmt.emfacade.tests.binders;

import java.util.Arrays;

import junit.framework.TestCase;

import org.eclipse.gmt.emfacade.builder.AbstractBuilder;
import org.eclipse.gmt.emfacade.tests.facademodel.FacademodelFactory;
import org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValue;
import org.eclipse.gmt.emfacade.tests.facademodel.MImmutableValueParent;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleBean;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleClassPublicFields;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleComposite;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleControl;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParent1GetSet;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN1SizeGetSetAddRemove;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN2AddRemove;
import org.eclipse.gmt.emfacade.tests.facademodel.MSimpleParentN3List;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValue;
import org.eclipse.gmt.emfacade.tests.views.ImmutableValueParent;
import org.eclipse.gmt.emfacade.tests.views.SimpleBean;
import org.eclipse.gmt.emfacade.tests.views.SimpleClassPublicFields;
import org.eclipse.gmt.emfacade.tests.views.SimpleComposite;
import org.eclipse.gmt.emfacade.tests.views.SimpleControl;
import org.eclipse.gmt.emfacade.tests.views.SimpleParent1GetSet;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN1SizeGetSetAddRemove;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN2AddRemove;
import org.eclipse.gmt.emfacade.tests.views.SimpleParentN3List;

public class BindersTest extends TestCase {

	private AbstractBuilder builder;
	private FacademodelFactory factory;
	
	public void setUp() throws Exception {
		factory = FacademodelFactory.eINSTANCE;
		builder = new AbstractBuilder(new FacademodelBinderFactory()) {
		};
	}

	// testSimpleBean
	
	private MSimpleBean createSimpleBean(String s, int i) {
		MSimpleBean simpleBean = factory.createMSimpleBean();
		simpleBean.setString(s);
		simpleBean.setInteger(i);
		return simpleBean;
	}
	
	private void testSimpleBean(MSimpleBean simpleBean, Object view) {
		assertTrue(view instanceof SimpleBean);
		SimpleBean simpleBeanView = (SimpleBean) view;
		assertEquals(simpleBean.getString(), simpleBeanView.getString());
		assertEquals(simpleBean.getInteger(), simpleBeanView.getInteger());
	}
	
	public void testSimpleBeanBuild() {
		MSimpleBean simpleBean = createSimpleBean("Hallvard", 44);
		Object view = builder.buildView(simpleBean, null);
		testSimpleBean(simpleBean, view);
	}

	public void testSimpleBeanBuildAndSet() {
		MSimpleBean simpleBean = createSimpleBean("Hallvard", 44);
		Object view = builder.buildView(simpleBean, null);
		testSimpleBean(simpleBean, view);
		simpleBean.setString("Marit");
		testSimpleBean(simpleBean, view);
		simpleBean.setInteger(46);
		testSimpleBean(simpleBean, view);
	}
	
	// testSimpleClassPublicFields
	
	private MSimpleClassPublicFields createSimpleClassPublicFields(String s, int i) {
		MSimpleClassPublicFields simpleBean = factory.createMSimpleClassPublicFields();
		simpleBean.setString(s);
		simpleBean.setInteger(i);
		return simpleBean;
	}
	
	private void testSimpleClassPublicFields(MSimpleClassPublicFields simpleInstance, Object view) {
		assertTrue(view instanceof SimpleClassPublicFields);
		SimpleClassPublicFields simpleInstanceView = (SimpleClassPublicFields) view;
		assertEquals(simpleInstance.getString(), simpleInstanceView.string);
		assertEquals(simpleInstance.getInteger(), simpleInstanceView.integer);
	}
	
	public void testSimpleClassPublicFieldsBuild() {
		MSimpleClassPublicFields simpleBean = createSimpleClassPublicFields("Hallvard", 44);
		Object view = builder.buildView(simpleBean, null);
		testSimpleClassPublicFields(simpleBean, view);
	}
	
	public void testSimpleClassPublicFieldsBuildAndSet() {
		MSimpleClassPublicFields simpleBean = createSimpleClassPublicFields("Hallvard", 44);
		Object view = builder.buildView(simpleBean, null);
		testSimpleClassPublicFields(simpleBean, view);
		simpleBean.setString("Marit");
		testSimpleClassPublicFields(simpleBean, view);
		simpleBean.setInteger(46);
		testSimpleClassPublicFields(simpleBean, view);
	}
	
	// testSimpleParent1GetSet
	
	public void testSimpleParent1GetSetBuild() {
		MSimpleBean simpleBean1 = createSimpleBean("Hallvard", 44);
		MSimpleParent1GetSet simpleParent = factory.createMSimpleParent1GetSet();
		simpleParent.setChild(simpleBean1);
		Object view = builder.buildView(simpleParent, null);
		assertTrue(view instanceof SimpleParent1GetSet);
		testSimpleBean(simpleParent.getChild(), ((SimpleParent1GetSet) view).getChild());
	}
	
	public void testSimpleParent1GetSetBuildAndSet() {
		MSimpleBean simpleBean1 = createSimpleBean("Hallvard", 44);
		MSimpleBean simpleBean2 = createSimpleBean("Marit", 46);
		MSimpleParent1GetSet simpleParent = factory.createMSimpleParent1GetSet();
		simpleParent.setChild(simpleBean1);
		Object view = builder.buildView(simpleParent, null);
		assertTrue(view instanceof SimpleParent1GetSet);
		testSimpleBean(simpleParent.getChild(), ((SimpleParent1GetSet) view).getChild());
		simpleParent.setChild(simpleBean2);
		testSimpleBean(simpleParent.getChild(), ((SimpleParent1GetSet) view).getChild());
	}

	// testSimpleParentN1SizeGetSetAddRemove
	
	private void testSimpleParentChildren(MSimpleParentN1SizeGetSetAddRemove simpleParent, Object view) {
		assertTrue(view instanceof SimpleParentN1SizeGetSetAddRemove);
		SimpleParentN1SizeGetSetAddRemove simpleParentView = (SimpleParentN1SizeGetSetAddRemove) view;
		assertEquals(simpleParent.getChildren().size(), simpleParentView.getChildCount());
		for (int i = 0; i < simpleParent.getChildren().size(); i++) {
			testSimpleBean(simpleParent.getChildren().get(i), simpleParentView.getChild(i));
		}
	}
	private void addAndTestSimpleParentChildren(MSimpleParentN1SizeGetSetAddRemove simpleParent, Object view, MSimpleBean child, int i) {
		simpleParent.getChildren().add(i < 0 ? simpleParent.getChildren().size() + i + 1 : i, child);
		testSimpleParentChildren(simpleParent, view);
	}
	private void removeAndTestSimpleParentChildren(MSimpleParentN1SizeGetSetAddRemove simpleParent, Object view, MSimpleBean child) {
		simpleParent.getChildren().remove(child);
		testSimpleParentChildren(simpleParent, view);
	}

	public void testSimpleParentN1SizeGetSetAddRemoveBuild() {
		MSimpleBean simpleBean1 = createSimpleBean("Hallvard", 44);
		MSimpleBean simpleBean2 = createSimpleBean("Marit", 46);
		MSimpleBean simpleBean3 = createSimpleBean("Jens", 14);
		MSimpleBean simpleBean4 = createSimpleBean("Anne", 12);
		MSimpleParentN1SizeGetSetAddRemove simpleParent = factory.createMSimpleParentN1SizeGetSetAddRemove();
		Object view = builder.buildView(simpleParent, null);
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean3, -1);	// 3
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean1, 0); 	// 1, 3
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean2, 1); 	// 1, 2, 3
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean4, -1);	// 1, 2, 3, 4
		removeAndTestSimpleParentChildren(simpleParent, view, simpleBean2);		// 1, 3, 4
		removeAndTestSimpleParentChildren(simpleParent, view, simpleBean4);		// 1, 3
		simpleParent.getChildren().set(1, simpleBean2);							// 1, 2
		testSimpleParentChildren(simpleParent, view);
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean4, 1);		// 1, 4, 2
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean3, -1);	// 1, 4, 2, 3
		simpleParent.getChildren().clear();										//
		testSimpleParentChildren(simpleParent, view);
	}
	
	// testSimpleParentN2AddRemove
	
	private void testSimpleParentChildren(MSimpleParentN2AddRemove simpleParent, Object view) {
		assertTrue(view instanceof SimpleParentN2AddRemove);
		SimpleBean[] simpleParentViewChildren = ((SimpleParentN2AddRemove) view).getChildren();
		assertEquals(simpleParent.getChildren().size(), simpleParentViewChildren.length);
		for (int i = 0; i < simpleParent.getChildren().size(); i++) {
			testSimpleBean(simpleParent.getChildren().get(i), simpleParentViewChildren[i]);
		}
	}
	private void addAndTestSimpleParentChildren(MSimpleParentN2AddRemove simpleParent, Object view, MSimpleBean child, int i) {
		simpleParent.getChildren().add(i < 0 ? simpleParent.getChildren().size() + i + 1 : i, child);
		testSimpleParentChildren(simpleParent, view);
	}
	private void removeAndTestSimpleParentChildren(MSimpleParentN2AddRemove simpleParent, Object view, MSimpleBean child) {
		simpleParent.getChildren().remove(child);
		testSimpleParentChildren(simpleParent, view);
	}
	
	public void testSimpleParentN2AddRemoveBuild() {
		MSimpleBean simpleBean1 = createSimpleBean("Hallvard", 44);
		MSimpleBean simpleBean2 = createSimpleBean("Marit", 46);
		MSimpleBean simpleBean3 = createSimpleBean("Jens", 14);
		MSimpleBean simpleBean4 = createSimpleBean("Anne", 12);
		MSimpleParentN2AddRemove simpleParent = factory.createMSimpleParentN2AddRemove();
		Object view = builder.buildView(simpleParent, null);
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean3, -1);	// 3
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean1, 0); 	// 1, 3
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean2, 1); 	// 1, 2, 3
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean4, -1);	// 1, 2, 3, 4
		removeAndTestSimpleParentChildren(simpleParent, view, simpleBean2);		// 1, 3, 4
		removeAndTestSimpleParentChildren(simpleParent, view, simpleBean4);		// 1, 3
		simpleParent.getChildren().set(1, simpleBean2);							// 1, 2
		testSimpleParentChildren(simpleParent, view);
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean4, 1);		// 1, 4, 2
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean3, -1);	// 1, 4, 2, 3
		simpleParent.getChildren().clear();										//
		testSimpleParentChildren(simpleParent, view);
	}
	
	// testSimpleParentN3List
	
	private void testSimpleParentChildren(MSimpleParentN3List simpleParent, Object view) {
		assertTrue(view instanceof SimpleParentN3List);
		SimpleParentN3List simpleParentView = (SimpleParentN3List) view;
		assertEquals(simpleParent.getChildren().size(), simpleParentView.getChildren().size());
		for (int i = 0; i < simpleParent.getChildren().size(); i++) {
			testSimpleBean(simpleParent.getChildren().get(i), simpleParentView.getChildren().get(i));
		}
	}
	private void addAndTestSimpleParentChildren(MSimpleParentN3List simpleParent, Object view, MSimpleBean child, int i) {
		simpleParent.getChildren().add(i < 0 ? simpleParent.getChildren().size() + i + 1 : i, child);
		testSimpleParentChildren(simpleParent, view);
	}
	private void removeAndTestSimpleParentChildren(MSimpleParentN3List simpleParent, Object view, MSimpleBean child) {
		simpleParent.getChildren().remove(child);
		testSimpleParentChildren(simpleParent, view);
	}

	public void testSimpleParentN3ListBuild() {
		MSimpleBean simpleBean1 = createSimpleBean("Hallvard", 44);
		MSimpleBean simpleBean2 = createSimpleBean("Marit", 46);
		MSimpleBean simpleBean3 = createSimpleBean("Jens", 14);
		MSimpleBean simpleBean4 = createSimpleBean("Anne", 12);
		MSimpleParentN3List simpleParent = factory.createMSimpleParentN3List();
		Object view = builder.buildView(simpleParent, null);
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean3, -1);	// 3
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean1, 0); 	// 1, 3
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean2, 1); 	// 1, 2, 3
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean4, -1);	// 1, 2, 3, 4
		removeAndTestSimpleParentChildren(simpleParent, view, simpleBean2);		// 1, 3, 4
		removeAndTestSimpleParentChildren(simpleParent, view, simpleBean4);		// 1, 3
		simpleParent.getChildren().set(1, simpleBean2);							// 1, 2
		testSimpleParentChildren(simpleParent, view);
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean4, 1);		// 1, 4, 2
		addAndTestSimpleParentChildren(simpleParent, view, simpleBean3, -1);	// 1, 4, 2, 3
		simpleParent.getChildren().clear();										//
		testSimpleParentChildren(simpleParent, view);
	}
	
	// testSimpleComposite

	protected void addTestSimpleCompositeChild(MSimpleComposite parent, MSimpleControl child) {
		Object parentView = builder.getObject(parent, SimpleControl.class, false);
		assertTrue(parentView instanceof SimpleComposite);
		SimpleComposite simpleComposite = (SimpleComposite) parentView;
		int oldSize = parent.getChildren().size();
		parent.getChildren().add(child);

		SimpleControl[] children = simpleComposite.getChildren();
		assertEquals(oldSize + 1, children.length);
		for (int i = 0; i <= oldSize; i++) {
			assertEquals(builder.getObject(parent.getChildren().get(i), SimpleControl.class, false), children[i]);			
		}
	}

	public void testSimpleCompositeBuild() {
		MSimpleComposite simpleComposite1 = factory.createMSimpleComposite();
		MSimpleComposite simpleComposite2 = factory.createMSimpleComposite();
		MSimpleControl simpleControl1 = factory.createMSimpleControl();
		MSimpleControl simpleControl2 = factory.createMSimpleControl();		
		simpleComposite2.getChildren().add(simpleControl2);

		Object view = builder.buildView(simpleComposite1, null);
		assertTrue(view instanceof SimpleComposite);
		
		addTestSimpleCompositeChild(simpleComposite1, simpleControl1);
		addTestSimpleCompositeChild(simpleComposite1, simpleComposite2);
	}

	// testImmutableValueParent
	
	private MImmutableValue createImmutableValue(String s, int i) {
		MImmutableValue immutableValue = factory.createMImmutableValue();
		immutableValue.setString(s);
		immutableValue.setInteger(i);
		return immutableValue;
	}
	
	private void testImmutableValue(MImmutableValue value, Object view) {
		assertTrue("View should be an ImmutableValue, but was " + view, view instanceof ImmutableValue);
		ImmutableValue valueView = (ImmutableValue) view;
		assertEquals(value.getString(), valueView.getString());
		assertEquals(value.getInteger(), valueView.getInteger());
	}
	
	private void testImmutableValueParentValues(MImmutableValueParent parent, Object view) {
		assertTrue(view instanceof ImmutableValueParent);
		ImmutableValue[] parentViewValues = ((ImmutableValueParent) view).getValues();
		assertEquals(parent.getValues().size(), parentViewValues.length);
		for (int i = 0; i < parent.getValues().size(); i++) {
			testImmutableValue(parent.getValues().get(i), parentViewValues[i]);
		}
	}

	public void testImmutableValueParentBuild() {
		MImmutableValue value1 = createImmutableValue("Hallvard", 44);
		MImmutableValue value2 = createImmutableValue("Marit", 46);
		MImmutableValue value3 = createImmutableValue("Jens", 14);
		MImmutableValue value4 = createImmutableValue("Anne", 12);
		MImmutableValueParent parent = factory.createMImmutableValueParent();
		parent.setValue(value1);
		parent.getValues().addAll(Arrays.asList(value2, value3, value4));
		Object view = builder.buildView(parent, null);
		assertTrue(view instanceof ImmutableValueParent);
		testImmutableValue(parent.getValue(), ((ImmutableValueParent) view).getValue());
		testImmutableValueParentValues(parent, view);
	}
	
	public void testImmutableValueParentBuildAndSet() {
		MImmutableValue value1 = createImmutableValue("Hallvard", 44);
		MImmutableValue value2 = createImmutableValue("Marit", 46);
		MImmutableValue value3 = createImmutableValue("Jens", 14);
		MImmutableValue value4 = createImmutableValue("Anne", 12);
		MImmutableValueParent parent = factory.createMImmutableValueParent();
		parent.setValue(value1);
		parent.getValues().addAll(Arrays.asList(value2, value3, value4));
		Object view = builder.buildView(parent, null);
		assertTrue(view instanceof ImmutableValueParent);
		testImmutableValue(parent.getValue(), ((ImmutableValueParent) view).getValue());
		testImmutableValueParentValues(parent, view);
		
		value1.setInteger(45);
		testImmutableValue(parent.getValue(), ((ImmutableValueParent) view).getValue());
		value2.setString("Snuppa");
		testImmutableValueParentValues(parent, view);
	}
}
