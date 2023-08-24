package sk.styk.martin.apkanalyzer.ui.permission.list;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.apppermissions.LocalPermissionManager;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class PermissionListFragmentViewModel_Factory implements Factory<PermissionListFragmentViewModel> {
  private final Provider<DispatcherProvider> dispatcherProvider;

  private final Provider<PermissionListAdapter> permissionListAdapterProvider;

  private final Provider<NavigationDrawerModel> navigationDrawerModelProvider;

  private final Provider<LocalPermissionManager> localPermissionManagerProvider;

  public PermissionListFragmentViewModel_Factory(Provider<DispatcherProvider> dispatcherProvider,
      Provider<PermissionListAdapter> permissionListAdapterProvider,
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<LocalPermissionManager> localPermissionManagerProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.permissionListAdapterProvider = permissionListAdapterProvider;
    this.navigationDrawerModelProvider = navigationDrawerModelProvider;
    this.localPermissionManagerProvider = localPermissionManagerProvider;
  }

  @Override
  public PermissionListFragmentViewModel get() {
    return newInstance(dispatcherProvider.get(), permissionListAdapterProvider.get(), navigationDrawerModelProvider.get(), localPermissionManagerProvider.get());
  }

  public static PermissionListFragmentViewModel_Factory create(
      Provider<DispatcherProvider> dispatcherProvider,
      Provider<PermissionListAdapter> permissionListAdapterProvider,
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<LocalPermissionManager> localPermissionManagerProvider) {
    return new PermissionListFragmentViewModel_Factory(dispatcherProvider, permissionListAdapterProvider, navigationDrawerModelProvider, localPermissionManagerProvider);
  }

  public static PermissionListFragmentViewModel newInstance(DispatcherProvider dispatcherProvider,
      PermissionListAdapter permissionListAdapter, NavigationDrawerModel navigationDrawerModel,
      LocalPermissionManager localPermissionManager) {
    return new PermissionListFragmentViewModel(dispatcherProvider, permissionListAdapter, navigationDrawerModel, localPermissionManager);
  }
}
