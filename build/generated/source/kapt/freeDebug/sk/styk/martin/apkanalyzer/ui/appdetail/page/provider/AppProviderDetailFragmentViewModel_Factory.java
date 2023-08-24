package sk.styk.martin.apkanalyzer.ui.appdetail.page.provider;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.clipboard.ClipBoardManager;
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailFragmentViewModel;

@ScopeMetadata
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
public final class AppProviderDetailFragmentViewModel_Factory {
  private final Provider<AppProviderDetailListAdapter> providerAdapterProvider;

  private final Provider<ClipBoardManager> clipBoardManagerProvider;

  public AppProviderDetailFragmentViewModel_Factory(
      Provider<AppProviderDetailListAdapter> providerAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    this.providerAdapterProvider = providerAdapterProvider;
    this.clipBoardManagerProvider = clipBoardManagerProvider;
  }

  public AppProviderDetailFragmentViewModel get(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return newInstance(appDetailFragmentViewModel, providerAdapterProvider.get(), clipBoardManagerProvider.get());
  }

  public static AppProviderDetailFragmentViewModel_Factory create(
      Provider<AppProviderDetailListAdapter> providerAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    return new AppProviderDetailFragmentViewModel_Factory(providerAdapterProvider, clipBoardManagerProvider);
  }

  public static AppProviderDetailFragmentViewModel newInstance(
      AppDetailFragmentViewModel appDetailFragmentViewModel,
      AppProviderDetailListAdapter providerAdapter, ClipBoardManager clipBoardManager) {
    return new AppProviderDetailFragmentViewModel(appDetailFragmentViewModel, providerAdapter, clipBoardManager);
  }
}
