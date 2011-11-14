package org.eclipse.gmt.emfacade.builder.strategies;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.gmt.emfacade.builder.AbstractConverter;
import org.eclipse.gmt.emfacade.builder.IBinderContext;
import org.eclipse.gmt.emfacade.builder.IConverter;

public abstract class Strategy {

	public static abstract class Impl<M extends EObject, ME, V, VE> {

		private IConverter<ME, VE> converter;

		public IConverter<ME, VE> getConverter() {
			return this.converter;
		}
		public void setConverter(IConverter<ME, VE> converter) {
			this.converter = converter;
		}

		private EClass invalidateEClass;

		public EClass getInvalidateEClass() {
			return invalidateEClass;
		}

		public void setInvalidateEClass(EClass invalidateEClass) {
			this.invalidateEClass = invalidateEClass;
		}

		private ETypedElement eTyped;
		
		public ETypedElement getETyped() {
			return eTyped;
		}

		public void setETyped(ETypedElement eTyped) {
			this.eTyped = eTyped;
		}

		protected Impl() {
		}

		protected VE model2View(ME modelValue, Class<VE> c, boolean update, IBinderContext context) {
			if (getETyped() != null) {
				if (getETyped().getEType() instanceof EEnum && modelValue instanceof Enumerator) {
					Enumerator enumerator = (Enumerator) modelValue;
					if (String.class.equals(c))
						return (VE) enumerator.getLiteral();
					else if (Integer.class.equals(c)) {
						return (VE) Integer.valueOf(enumerator.getValue());
					}
				}
				else if (getETyped().getEType() instanceof EDataType && String.class.equals(c)) {
					EDataType dataType = (EDataType) getETyped().getEType();
					return (VE) dataType.getEPackage().getEFactoryInstance().convertToString(dataType, modelValue);
				}
			}
			if (modelValue instanceof EObject) {
				return getObject(modelValue, c, update, context);
			} else {
				try {
					IConverter<ME, VE> converter = getConverter();
					if (converter != null) {
						return converter.convert(modelValue, context);
					}
					return context.convert(modelValue, c, context);
				} catch (Exception e) {
				}
			}
			return null;
		}

		protected VE getObject(ME modelValue, Class<VE> c, boolean update, IBinderContext context) {
			return context.getObject((EObject) modelValue, c, update);
		}

		protected boolean unequal(VE modelValueView, VE viewValue) {
			return AbstractConverter.unequal(modelValueView, viewValue);
		}
	}
}
