package sk.styk.martin.apkanalyzer.ui.appdetail.page.service;

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
public final class AppServiceDetailFragmentViewModel_Factory {
  private final Provider<AppServiceDetailListAdapter> serviceAdapterProvider;

  private final Provider<ClipBoardManager> clipBoardManagerProvider;

  public AppServiceDetailFragmentViewModel_Factory(
      Provider<AppServiceDetailListAdapter> serviceAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    this.serviceAdapterProvider = serviceAdapterProvider;
    this.clipBoardManagerProvider = clipBoardManagerProvider;
  }

  public AppServiceDetailFragmentViewModel get(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return newInstance(appDetailFragmentViewModel, serviceAdapterProvider.get(), clipBoardManagerProvider.get());
  }

  public static AppServiceDetailFragmentViewModel_Factory create(
      Provider<AppServiceDetailListAdapter> serviceAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    return new AppServiceDetailFragmentViewModel_Factory(serviceAdapterProvider, clipBoardManagerProvider);
  }

  public static AppServiceDetailFragmentViewModel newInstance(
      AppDetailFragmentViewModel appDetailFragmentViewModel,
      AppServiceDetailListAdapter serviceAdapter, ClipBoardManager clipBoardManager) {
    return new AppServiceDetailFragmentViewModel(appDetailFragmentViewModel, serviceAdapter, clipBoardManager);
  }
}
