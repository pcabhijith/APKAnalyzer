package sk.styk.martin.apkanalyzer.ui.appdetail.page.provider;

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
public final class AppProviderDetailFragment_MembersInjector implements MembersInjector<AppProviderDetailFragment> {
  private final Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider;

  private final Provider<AppProviderDetailFragmentViewModel.Factory> viewModelFactoryProvider;

  public AppProviderDetailFragment_MembersInjector(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppProviderDetailFragmentViewModel.Factory> viewModelFactoryProvider) {
    this.parentViewModelFactoryProvider = parentViewModelFactoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AppProviderDetailFragment> create(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppProviderDetailFragmentViewModel.Factory> viewModelFactoryProvider) {
    return new AppProviderDetailFragment_MembersInjector(parentViewModelFactoryProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AppProviderDetailFragment instance) {
    AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, parentViewModelFactoryProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.appdetail.page.provider.AppProviderDetailFragment.viewModelFactory")
  public static void injectViewModelFactory(AppProviderDetailFragment instance,
      AppProviderDetailFragmentViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
