package sk.styk.martin.apkanalyzer.ui.main;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.NavigationDrawerModel;
import sk.styk.martin.apkanalyzer.manager.persistence.PersistenceManager;
import sk.styk.martin.apkanalyzer.manager.promo.StartPromoManager;
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
public final class MainActivityViewModel_Factory {
  private final Provider<StartPromoManager> promoManagerProvider;

  private final Provider<PersistenceManager> persistenceManagerProvider;

  private final Provider<NavigationDrawerModel> navigationDrawerModelProvider;

  private final Provider<UserReviewManager> userReviewManagerProvider;

  private final Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider;

  public MainActivityViewModel_Factory(Provider<StartPromoManager> promoManagerProvider,
      Provider<PersistenceManager> persistenceManagerProvider,
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<UserReviewManager> userReviewManagerProvider,
      Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider) {
    this.promoManagerProvider = promoManagerProvider;
    this.persistenceManagerProvider = persistenceManagerProvider;
    this.navigationDrawerModelProvider = navigationDrawerModelProvider;
    this.userReviewManagerProvider = userReviewManagerProvider;
    this.foregroundFragmentWatcherProvider = foregroundFragmentWatcherProvider;
  }

  public MainActivityViewModel get() {
    return newInstance(promoManagerProvider.get(), persistenceManagerProvider.get(), navigationDrawerModelProvider.get(), userReviewManagerProvider.get(), foregroundFragmentWatcherProvider.get());
  }

  public static MainActivityViewModel_Factory create(
      Provider<StartPromoManager> promoManagerProvider,
      Provider<PersistenceManager> persistenceManagerProvider,
      Provider<NavigationDrawerModel> navigationDrawerModelProvider,
      Provider<UserReviewManager> userReviewManagerProvider,
      Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider) {
    return new MainActivityViewModel_Factory(promoManagerProvider, persistenceManagerProvider, navigationDrawerModelProvider, userReviewManagerProvider, foregroundFragmentWatcherProvider);
  }

  public static MainActivityViewModel newInstance(StartPromoManager promoManager,
      PersistenceManager persistenceManager, NavigationDrawerModel navigationDrawerModel,
      UserReviewManager userReviewManager, ForegroundFragmentWatcher foregroundFragmentWatcher) {
    return new MainActivityViewModel(promoManager, persistenceManager, navigationDrawerModel, userReviewManager, foregroundFragmentWatcher);
  }
}
