package sk.styk.martin.apkanalyzer.ui.about;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel;
import sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager;

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
public final class AboutFragmentViewModel_Factory {
  private final Provider<NavigationDrawerModel> navigationDrawerModelProvider;

  private final Provider<UserReviewManager> userReviewManagerProvider;

  public AboutFragmentViewModel_Factory(
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<UserReviewManager> userReviewManagerProvider) {
    this.navigationDrawerModelProvider = navigationDrawerModelProvider;
    this.userReviewManagerProvider = userReviewManagerProvider;
  }

  public AboutFragmentViewModel get() {
    return newInstance(navigationDrawerModelProvider.get(), userReviewManagerProvider.get());
  }

  public static AboutFragmentViewModel_Factory create(
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<UserReviewManager> userReviewManagerProvider) {
    return new AboutFragmentViewModel_Factory(navigationDrawerModelProvider, userReviewManagerProvider);
  }

  public static AboutFragmentViewModel newInstance(NavigationDrawerModel navigationDrawerModel,
      UserReviewManager userReviewManager) {
    return new AboutFragmentViewModel(navigationDrawerModel, userReviewManager);
  }
}
