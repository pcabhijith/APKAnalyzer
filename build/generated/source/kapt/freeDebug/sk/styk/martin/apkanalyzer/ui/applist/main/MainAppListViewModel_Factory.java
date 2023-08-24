package sk.styk.martin.apkanalyzer.ui.applist.main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepository;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel;
import sk.styk.martin.apkanalyzer.ui.applist.AppListAdapter;

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
public final class MainAppListViewModel_Factory implements Factory<MainAppListViewModel> {
  private final Provider<InstalledAppsRepository> installedAppsRepositoryProvider;

  private final Provider<NavigationDrawerModel> navigationDrawerModelProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  private final Provider<AppListAdapter> adapterProvider;

  public MainAppListViewModel_Factory(
      Provider<InstalledAppsRepository> installedAppsRepositoryProvider,
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<DispatcherProvider> dispatcherProvider, Provider<AppListAdapter> adapterProvider) {
    this.installedAppsRepositoryProvider = installedAppsRepositoryProvider;
    this.navigationDrawerModelProvider = navigationDrawerModelProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.adapterProvider = adapterProvider;
  }

  @Override
  public MainAppListViewModel get() {
    return newInstance(installedAppsRepositoryProvider.get(), navigationDrawerModelProvider.get(), dispatcherProvider.get(), adapterProvider.get());
  }

  public static MainAppListViewModel_Factory create(
      Provider<InstalledAppsRepository> installedAppsRepositoryProvider,
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<DispatcherProvider> dispatcherProvider, Provider<AppListAdapter> adapterProvider) {
    return new MainAppListViewModel_Factory(installedAppsRepositoryProvider, navigationDrawerModelProvider, dispatcherProvider, adapterProvider);
  }

  public static MainAppListViewModel newInstance(InstalledAppsRepository installedAppsRepository,
      NavigationDrawerModel navigationDrawerModel, DispatcherProvider dispatcherProvider,
      AppListAdapter adapter) {
    return new MainAppListViewModel(installedAppsRepository, navigationDrawerModel, dispatcherProvider, adapter);
  }
}
