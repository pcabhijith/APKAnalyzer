package sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver;

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
public final class AppReceiverDetailFragmentViewModel_Factory_Impl implements AppReceiverDetailFragmentViewModel.Factory {
  private final AppReceiverDetailFragmentViewModel_Factory delegateFactory;

  AppReceiverDetailFragmentViewModel_Factory_Impl(
      AppReceiverDetailFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppReceiverDetailFragmentViewModel create(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return delegateFactory.get(appDetailFragmentViewModel);
  }

  public static Provider<AppReceiverDetailFragmentViewModel.Factory> create(
      AppReceiverDetailFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppReceiverDetailFragmentViewModel_Factory_Impl(delegateFactory));
  }
}
