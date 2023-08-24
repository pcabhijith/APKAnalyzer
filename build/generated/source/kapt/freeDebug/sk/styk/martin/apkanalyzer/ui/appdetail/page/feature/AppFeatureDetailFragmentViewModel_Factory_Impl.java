package sk.styk.martin.apkanalyzer.ui.appdetail.page.feature;

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
public final class AppFeatureDetailFragmentViewModel_Factory_Impl implements AppFeatureDetailFragmentViewModel.Factory {
  private final AppFeatureDetailFragmentViewModel_Factory delegateFactory;

  AppFeatureDetailFragmentViewModel_Factory_Impl(
      AppFeatureDetailFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppFeatureDetailFragmentViewModel create(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return delegateFactory.get(appDetailFragmentViewModel);
  }

  public static Provider<AppFeatureDetailFragmentViewModel.Factory> create(
      AppFeatureDetailFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppFeatureDetailFragmentViewModel_Factory_Impl(delegateFactory));
  }
}
