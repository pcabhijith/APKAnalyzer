package sk.styk.martin.apkanalyzer.ui.appdetail;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppDetailFragmentViewModel_Factory_Impl implements AppDetailFragmentViewModel.Factory {
  private final AppDetailFragmentViewModel_Factory delegateFactory;

  AppDetailFragmentViewModel_Factory_Impl(AppDetailFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppDetailFragmentViewModel create(AppDetailRequest appDetailRequest) {
    return delegateFactory.get(appDetailRequest);
  }

  public static Provider<AppDetailFragmentViewModel.Factory> create(
      AppDetailFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppDetailFragmentViewModel_Factory_Impl(delegateFactory));
  }
}
