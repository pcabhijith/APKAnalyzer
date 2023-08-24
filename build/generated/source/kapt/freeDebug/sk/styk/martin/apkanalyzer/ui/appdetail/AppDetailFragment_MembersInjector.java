package sk.styk.martin.apkanalyzer.ui.appdetail;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager;

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
public final class AppDetailFragment_MembersInjector implements MembersInjector<AppDetailFragment> {
  private final Provider<AppDetailFragmentViewModel.Factory> viewModelFactoryProvider;

  private final Provider<BackPressedManager> backPressedManagerProvider;

  public AppDetailFragment_MembersInjector(
      Provider<AppDetailFragmentViewModel.Factory> viewModelFactoryProvider,
      Provider<BackPressedManager> backPressedManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.backPressedManagerProvider = backPressedManagerProvider;
  }

  public static MembersInjector<AppDetailFragment> create(
      Provider<AppDetailFragmentViewModel.Factory> viewModelFactoryProvider,
      Provider<BackPressedManager> backPressedManagerProvider) {
    return new AppDetailFragment_MembersInjector(viewModelFactoryProvider, backPressedManagerProvider);
  }

  @Override
  public void injectMembers(AppDetailFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectBackPressedManager(instance, backPressedManagerProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragment.viewModelFactory")
  public static void injectViewModelFactory(AppDetailFragment instance,
      AppDetailFragmentViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragment.backPressedManager")
  public static void injectBackPressedManager(AppDetailFragment instance,
      BackPressedManager backPressedManager) {
    instance.backPressedManager = backPressedManager;
  }
}
