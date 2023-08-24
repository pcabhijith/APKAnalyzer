package sk.styk.martin.apkanalyzer.ui.premium;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class PremiumFragmentViewModel_Factory implements Factory<PremiumFragmentViewModel> {
  private final Provider<NavigationDrawerModel> navigationDrawerModelProvider;

  private final Provider<ResourcesManager> resourcesManagerProvider;

  public PremiumFragmentViewModel_Factory(
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<ResourcesManager> resourcesManagerProvider) {
    this.navigationDrawerModelProvider = navigationDrawerModelProvider;
    this.resourcesManagerProvider = resourcesManagerProvider;
  }

  @Override
  public PremiumFragmentViewModel get() {
    return newInstance(navigationDrawerModelProvider.get(), resourcesManagerProvider.get());
  }

  public static PremiumFragmentViewModel_Factory create(
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<ResourcesManager> resourcesManagerProvider) {
    return new PremiumFragmentViewModel_Factory(navigationDrawerModelProvider, resourcesManagerProvider);
  }

  public static PremiumFragmentViewModel newInstance(NavigationDrawerModel navigationDrawerModel,
      ResourcesManager resourcesManager) {
    return new PremiumFragmentViewModel(navigationDrawerModel, resourcesManager);
  }
}
