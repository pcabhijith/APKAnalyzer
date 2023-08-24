package sk.styk.martin.apkanalyzer.ui.appdetail.page.service;

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
public final class AppServiceDetailFragmentViewModel_Factory_Impl implements AppServiceDetailFragmentViewModel.Factory {
  private final AppServiceDetailFragmentViewModel_Factory delegateFactory;

  AppServiceDetailFragmentViewModel_Factory_Impl(
      AppServiceDetailFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppServiceDetailFragmentViewModel create(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return delegateFactory.get(appDetailFragmentViewModel);
  }

  public static Provider<AppServiceDetailFragmentViewModel.Factory> create(
      AppServiceDetailFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppServiceDetailFragmentViewModel_Factory_Impl(delegateFactory));
  }
}
