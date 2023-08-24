package sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;
import sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragment_MembersInjector;

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
public final class AppCertificateDetailFragment_MembersInjector implements MembersInjector<AppCertificateDetailFragment> {
  private final Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider;

  private final Provider<AppCertificateDetailsFragmentViewModel.Factory> viewModelFactoryProvider;

  public AppCertificateDetailFragment_MembersInjector(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppCertificateDetailsFragmentViewModel.Factory> viewModelFactoryProvider) {
    this.parentViewModelFactoryProvider = parentViewModelFactoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AppCertificateDetailFragment> create(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppCertificateDetailsFragmentViewModel.Factory> viewModelFactoryProvider) {
    return new AppCertificateDetailFragment_MembersInjector(parentViewModelFactoryProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AppCertificateDetailFragment instance) {
    AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, parentViewModelFactoryProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.appdetail.page.certificate.AppCertificateDetailFragment.viewModelFactory")
  public static void injectViewModelFactory(AppCertificateDetailFragment instance,
      AppCertificateDetailsFragmentViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
