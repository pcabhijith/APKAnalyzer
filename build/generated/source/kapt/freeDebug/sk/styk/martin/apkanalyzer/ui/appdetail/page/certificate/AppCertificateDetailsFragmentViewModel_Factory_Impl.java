package sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate;

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
public final class AppCertificateDetailsFragmentViewModel_Factory_Impl implements AppCertificateDetailsFragmentViewModel.Factory {
  private final AppCertificateDetailsFragmentViewModel_Factory delegateFactory;

  AppCertificateDetailsFragmentViewModel_Factory_Impl(
      AppCertificateDetailsFragmentViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AppCertificateDetailsFragmentViewModel create(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return delegateFactory.get(appDetailFragmentViewModel);
  }

  public static Provider<AppCertificateDetailsFragmentViewModel.Factory> create(
      AppCertificateDetailsFragmentViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new AppCertificateDetailsFragmentViewModel_Factory_Impl(delegateFactory));
  }
}
