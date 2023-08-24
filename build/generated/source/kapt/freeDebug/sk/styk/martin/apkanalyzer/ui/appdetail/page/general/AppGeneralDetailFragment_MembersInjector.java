package sk.styk.martin.apkanalyzer.ui.appdetail.page.general;

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
public final class AppGeneralDetailFragment_MembersInjector implements MembersInjector<AppGeneralDetailFragment> {
  private final Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider;

  private final Provider<AppGeneralDetailsFragmentViewModel.Factory> viewModelFactoryProvider;

  public AppGeneralDetailFragment_MembersInjector(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppGeneralDetailsFragmentViewModel.Factory> viewModelFactoryProvider) {
    this.parentViewModelFactoryProvider = parentViewModelFactoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AppGeneralDetailFragment> create(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppGeneralDetailsFragmentViewModel.Factory> viewModelFactoryProvider) {
    return new AppGeneralDetailFragment_MembersInjector(parentViewModelFactoryProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AppGeneralDetailFragment instance) {
    AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, parentViewModelFactoryProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.appdetail.page.general.AppGeneralDetailFragment.viewModelFactory")
  public static void injectViewModelFactory(AppGeneralDetailFragment instance,
      AppGeneralDetailsFragmentViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
