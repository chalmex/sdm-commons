/**
 */
package org.storydriven.storydiagrams.interpreter.tests.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.storydriven.storydiagrams.interpreter.tests.util.TestsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TestsItemProviderAdapterFactory extends TestsAdapterFactory implements ComposeableAdapterFactory,
		IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.interpreter.tests.TModel}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TModelItemProvider tModelItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.interpreter.tests.TPackage}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TPackageItemProvider tPackageItemProvider;

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TInterface} instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected TInterfaceItemProvider tInterfaceItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.interpreter.tests.TClass}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TClassItemProvider tClassItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.interpreter.tests.TEnum}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TEnumItemProvider tEnumItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.interpreter.tests.TField}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TFieldItemProvider tFieldItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.storydriven.storydiagrams.interpreter.tests.TMethod}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TMethodItemProvider tMethodItemProvider;

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TParameter} instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected TParameterItemProvider tParameterItemProvider;

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TReturnStatement} instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected TReturnStatementItemProvider tReturnStatementItemProvider;

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TestsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TModel}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTModelAdapter() {
		if (tModelItemProvider == null) {
			tModelItemProvider = new TModelItemProvider(this);
		}

		return tModelItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTPackageAdapter() {
		if (tPackageItemProvider == null) {
			tPackageItemProvider = new TPackageItemProvider(this);
		}

		return tPackageItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TInterface}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTInterfaceAdapter() {
		if (tInterfaceItemProvider == null) {
			tInterfaceItemProvider = new TInterfaceItemProvider(this);
		}

		return tInterfaceItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TClass}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTClassAdapter() {
		if (tClassItemProvider == null) {
			tClassItemProvider = new TClassItemProvider(this);
		}

		return tClassItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TEnum}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTEnumAdapter() {
		if (tEnumItemProvider == null) {
			tEnumItemProvider = new TEnumItemProvider(this);
		}

		return tEnumItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TField}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTFieldAdapter() {
		if (tFieldItemProvider == null) {
			tFieldItemProvider = new TFieldItemProvider(this);
		}

		return tFieldItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TMethod}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTMethodAdapter() {
		if (tMethodItemProvider == null) {
			tMethodItemProvider = new TMethodItemProvider(this);
		}

		return tMethodItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TParameter}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTParameterAdapter() {
		if (tParameterItemProvider == null) {
			tParameterItemProvider = new TParameterItemProvider(this);
		}

		return tParameterItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TReturnStatement}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTReturnStatementAdapter() {
		if (tReturnStatementItemProvider == null) {
			tReturnStatementItemProvider = new TReturnStatementItemProvider(this);
		}

		return tReturnStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement} instances. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TMethodCallStatementItemProvider tMethodCallStatementItemProvider;

	/**
	 * This creates an adapter for a {@link org.storydriven.storydiagrams.interpreter.tests.TMethodCallStatement}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTMethodCallStatementAdapter() {
		if (tMethodCallStatementItemProvider == null) {
			tMethodCallStatementItemProvider = new TMethodCallStatementItemProvider(this);
		}

		return tMethodCallStatementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		if (tModelItemProvider != null)
			tModelItemProvider.dispose();
		if (tPackageItemProvider != null)
			tPackageItemProvider.dispose();
		if (tInterfaceItemProvider != null)
			tInterfaceItemProvider.dispose();
		if (tClassItemProvider != null)
			tClassItemProvider.dispose();
		if (tEnumItemProvider != null)
			tEnumItemProvider.dispose();
		if (tFieldItemProvider != null)
			tFieldItemProvider.dispose();
		if (tMethodItemProvider != null)
			tMethodItemProvider.dispose();
		if (tParameterItemProvider != null)
			tParameterItemProvider.dispose();
		if (tReturnStatementItemProvider != null)
			tReturnStatementItemProvider.dispose();
		if (tMethodCallStatementItemProvider != null)
			tMethodCallStatementItemProvider.dispose();
	}

}
