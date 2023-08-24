package sk.styk.martin.apkanalyzer.ui.appdetail.page.provider;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;

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
public final class AppProviderDetailFragmentViewModel_Factory_Impl implements AppProviderDetailFragmentViewModel.Factory {
  private final AppProviderDetailFragmentViewModel_Factory delegateFactory;

  AppProviderDetailFragmentViewModel_Factory_Impl(
      AppProviderDetailFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppProviderDetailFragmentViewModel create(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return delegateFactory.get(appDetailFragmentViewModel);
  }

  public static Provider<AppProviderDetailFragmentViewModel.Factory> create(
      AppProviderDetailFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppProviderDetailFragmentViewModel_Factory_Impl(delegateFactory));
  }
}
