package sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver;

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
public final class AppReceiverDetailFragment_MembersInjector implements MembersInjector<AppReceiverDetailFragment> {
  private final Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider;

  private final Provider<AppReceiverDetailFragmentViewModel.Factory> viewModelFactoryProvider;

  public AppReceiverDetailFragment_MembersInjector(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppReceiverDetailFragmentViewModel.Factory> viewModelFactoryProvider) {
    this.parentViewModelFactoryProvider = parentViewModelFactoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AppReceiverDetailFragment> create(
      Provider<AppDetailFragmentViewModel.Factory> parentViewModelFactoryProvider,
      Provider<AppReceiverDetailFragmentViewModel.Factory> viewModelFactoryProvider) {
    return new AppReceiverDetailFragment_MembersInjector(parentViewModelFactoryProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AppReceiverDetailFragment instance) {
    AppDetailPageFragment_MembersInjector.injectParentViewModelFactory(instance, parentViewModelFactoryProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.appdetail.page.receiver.AppReceiverDetailFragment.viewModelFactory")
  public static void injectViewModelFactory(AppReceiverDetailFragment instance,
      AppReceiverDetailFragmentViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
