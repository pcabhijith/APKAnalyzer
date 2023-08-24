package sk.styk.martin.apkanalyzer.ui.permission.detail.apps;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepository;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter;
import sk.styk.martin.apkanalyzer.ui.permission.detail.pager.PermissionDetailFragmentViewModel;

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
public final class PermissionsAppListViewModel_Factory {
  private final Provider<InstalledAppsRepository> installedAppsRepositoryProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  private final Provider<AppListAdapter> adapterProvider;

  public PermissionsAppListViewModel_Factory(
      Provider<InstalledAppsRepository> installedAppsRepositoryProvider,
      Provider<DispatcherProvider> dispatcherProvider, Provider<AppListAdapter> adapterProvider) {
    this.installedAppsRepositoryProvider = installedAppsRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.adapterProvider = adapterProvider;
  }

  public PermissionsAppListViewModel get(
      PermissionDetailFragmentViewModel permissionDetailFragmentViewModel, boolean showGranted) {
    return newInstance(permissionDetailFragmentViewModel, showGranted, installedAppsRepositoryProvider.get(), dispatcherProvider.get(), adapterProvider.get());
  }

  public static PermissionsAppListViewModel_Factory create(
      Provider<InstalledAppsRepository> installedAppsRepositoryProvider,
      Provider<DispatcherProvider> dispatcherProvider, Provider<AppListAdapter> adapterProvider) {
    return new PermissionsAppListViewModel_Factory(installedAppsRepositoryProvider, dispatcherProvider, adapterProvider);
  }

  public static PermissionsAppListViewModel newInstance(
      PermissionDetailFragmentViewModel permissionDetailFragmentViewModel, boolean showGranted,
      InstalledAppsRepository installedAppsRepository, DispatcherProvider dispatcherProvider,
      AppListAdapter adapter) {
    return new PermissionsAppListViewModel(permissionDetailFragmentViewModel, showGranted, installedAppsRepository, dispatcherProvider, adapter);
  }
}
