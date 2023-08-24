package sk.styk.martin.apkanalyzer.ui.applist.packagename;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.applist.InstalledAppsRepository;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
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
public final class AppListFromPackageNamesDialogViewModel_Factory {
  private final Provider<InstalledAppsRepository> installedAppsRepositoryProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  private final Provider<AppListAdapter> appListAdapterProvider;

  public AppListFromPackageNamesDialogViewModel_Factory(
      Provider<InstalledAppsRepository> installedAppsRepositoryProvider,
      Provider<DispatcherProvider> dispatcherProvider,
      Provider<AppListAdapter> appListAdapterProvider) {
    this.installedAppsRepositoryProvider = installedAppsRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.appListAdapterProvider = appListAdapterProvider;
  }

  public AppListFromPackageNamesDialogViewModel get(List<String> packageNames) {
    return newInstance(packageNames, installedAppsRepositoryProvider.get(), dispatcherProvider.get(), appListAdapterProvider.get());
  }

  public static AppListFromPackageNamesDialogViewModel_Factory create(
      Provider<InstalledAppsRepository> installedAppsRepositoryProvider,
      Provider<DispatcherProvider> dispatcherProvider,
      Provider<AppListAdapter> appListAdapterProvider) {
    return new AppListFromPackageNamesDialogViewModel_Factory(installedAppsRepositoryProvider, dispatcherProvider, appListAdapterProvider);
  }

  public static AppListFromPackageNamesDialogViewModel newInstance(List<String> packageNames,
      InstalledAppsRepository installedAppsRepository, DispatcherProvider dispatcherProvider,
      AppListAdapter appListAdapter) {
    return new AppListFromPackageNamesDialogViewModel(packageNames, installedAppsRepository, dispatcherProvider, appListAdapter);
  }
}
