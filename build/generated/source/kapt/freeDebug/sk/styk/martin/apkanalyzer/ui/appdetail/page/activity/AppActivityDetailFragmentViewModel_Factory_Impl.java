package sk.styk.martin.apkanalyzer.ui.appdetail.page.activity;

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
public final class AppActivityDetailFragmentViewModel_Factory_Impl implements AppActivityDetailFragmentViewModel.Factory {
  private final AppActivityDetailFragmentViewModel_Factory delegateFactory;

  AppActivityDetailFragmentViewModel_Factory_Impl(
      AppActivityDetailFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppActivityDetailFragmentViewModel create(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return delegateFactory.get(appDetailFragmentViewModel);
  }

  public static Provider<AppActivityDetailFragmentViewModel.Factory> create(
      AppActivityDetailFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppActivityDetailFragmentViewModel_Factory_Impl(delegateFactory));
  }
}
