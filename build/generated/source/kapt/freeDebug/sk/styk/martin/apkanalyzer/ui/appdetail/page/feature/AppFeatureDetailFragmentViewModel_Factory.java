package sk.styk.martin.apkanalyzer.ui.appdetail.page.feature;

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
public final class AppFeatureDetailFragmentViewModel_Factory {
  private final Provider<AppFeatureDetailListAdapter> featureAdapterProvider;

  private final Provider<ClipBoardManager> clipBoardManagerProvider;

  public AppFeatureDetailFragmentViewModel_Factory(
      Provider<AppFeatureDetailListAdapter> featureAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    this.featureAdapterProvider = featureAdapterProvider;
    this.clipBoardManagerProvider = clipBoardManagerProvider;
  }

  public AppFeatureDetailFragmentViewModel get(
      AppDetailFragmentViewModel appDetailFragmentViewModel) {
    return newInstance(appDetailFragmentViewModel, featureAdapterProvider.get(), clipBoardManagerProvider.get());
  }

  public static AppFeatureDetailFragmentViewModel_Factory create(
      Provider<AppFeatureDetailListAdapter> featureAdapterProvider,
      Provider<ClipBoardManager> clipBoardManagerProvider) {
    return new AppFeatureDetailFragmentViewModel_Factory(featureAdapterProvider, clipBoardManagerProvider);
  }

  public static AppFeatureDetailFragmentViewModel newInstance(
      AppDetailFragmentViewModel appDetailFragmentViewModel,
      AppFeatureDetailListAdapter featureAdapter, ClipBoardManager clipBoardManager) {
    return new AppFeatureDetailFragmentViewModel(appDetailFragmentViewModel, featureAdapter, clipBoardManager);
  }
}
