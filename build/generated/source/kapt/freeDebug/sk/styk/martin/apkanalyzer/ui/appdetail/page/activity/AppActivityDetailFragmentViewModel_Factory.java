package sk.styk.martin.apkanalyzer.ui.appdetail.page.activity;

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
public final class AppActivityDetailFragmentViewModel_Factory {
  private final Provider<AppActivityDetailListAdapter> activityAdapterProvider;

  private final Provider<ClipBoardManager> clipBoardManagerProvider;

  public AppActivityDetailFragmentViewModel_Factory(
      Provider<AppActivityDetailListAdapter> activityAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    this.activityAdapterProvider = activityAdapterProvider;
    this.clipBoardManagerProvider = clipBoardManagerProvider;
  }

  public AppActivityDetailFragmentViewModel get(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return newInstance(appDetailFragmentViewModel, activityAdapterProvider.get(), clipBoardManagerProvider.get());
  }

  public static AppActivityDetailFragmentViewModel_Factory create(
      Provider<AppActivityDetailListAdapter> activityAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    return new AppActivityDetailFragmentViewModel_Factory(activityAdapterProvider, clipBoardManagerProvider);
  }

  public static AppActivityDetailFragmentViewModel newInstance(
      AppDetailFragmentViewModel appDetailFragmentViewModel,
      AppActivityDetailListAdapter activityAdapter, ClipBoardManager clipBoardManager) {
    return new AppActivityDetailFragmentViewModel(appDetailFragmentViewModel, activityAdapter, clipBoardManager);
  }
}
