package sk.styk.martin.apkanalyzer.ui.statistics;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.appstatistics.LocalApplicationStatisticManager;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager;
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
public final class StatisticsFragmentViewModel_Factory implements Factory<StatisticsFragmentViewModel> {
  private final Provider<NavigationDrawerModel> navigationDrawerModelProvider;

  private final Provider<LocalApplicationStatisticManager> localApplicationStatisticManagerProvider;

  private final Provider<ResourcesManager> resourcesManagerProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public StatisticsFragmentViewModel_Factory(
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<LocalApplicationStatisticManager> localApplicationStatisticManagerProvider,
      Provider<ResourcesManager> resourcesManagerProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.navigationDrawerModelProvider = navigationDrawerModelProvider;
    this.localApplicationStatisticManagerProvider = localApplicationStatisticManagerProvider;
    this.resourcesManagerProvider = resourcesManagerProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public StatisticsFragmentViewModel get() {
    return newInstance(navigationDrawerModelProvider.get(), localApplicationStatisticManagerProvider.get(), resourcesManagerProvider.get(), dispatcherProvider.get());
  }

  public static StatisticsFragmentViewModel_Factory create(
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<LocalApplicationStatisticManager> localApplicationStatisticManagerProvider,
      Provider<ResourcesManager> resourcesManagerProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new StatisticsFragmentViewModel_Factory(navigationDrawerModelProvider, localApplicationStatisticManagerProvider, resourcesManagerProvider, dispatcherProvider);
  }

  public static StatisticsFragmentViewModel newInstance(NavigationDrawerModel navigationDrawerModel,
      LocalApplicationStatisticManager localApplicationStatisticManager,
      ResourcesManager resourcesManager, DispatcherProvider dispatcherProvider) {
    return new StatisticsFragmentViewModel(navigationDrawerModel, localApplicationStatisticManager, resourcesManager, dispatcherProvider);
  }
}
