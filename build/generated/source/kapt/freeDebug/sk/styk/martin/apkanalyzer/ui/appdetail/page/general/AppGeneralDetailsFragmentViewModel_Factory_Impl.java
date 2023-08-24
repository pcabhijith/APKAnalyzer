package sk.styk.martin.apkanalyzer.ui.appdetail.page.general;

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
public final class AppGeneralDetailsFragmentViewModel_Factory_Impl implements AppGeneralDetailsFragmentViewModel.Factory {
  private final AppGeneralDetailsFragmentViewModel_Factory delegateFactory;

  AppGeneralDetailsFragmentViewModel_Factory_Impl(
      AppGeneralDetailsFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppGeneralDetailsFragmentViewModel create(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return delegateFactory.get(appDetailFragmentViewModel);
  }

  public static Provider<AppGeneralDetailsFragmentViewModel.Factory> create(
      AppGeneralDetailsFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppGeneralDetailsFragmentViewModel_Factory_Impl(delegateFactory));
  }
}
