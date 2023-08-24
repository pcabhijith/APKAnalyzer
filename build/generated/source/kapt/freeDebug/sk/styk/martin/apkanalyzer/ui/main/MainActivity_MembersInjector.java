package sk.styk.martin.apkanalyzer.ui.main;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.manager.analytics.FragmentScreenTracker;
import sk.styk.martin.apkanalyzer.manager.backpress.BackPressedManager;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher;
import sk.styk.martin.apkanalyzer.manager.permission.PermissionManager;
import sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager;
import sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager;
import sk.styk.martin.apkanalyzer.ui.ApkAnalyzerBaseActivity_MembersInjector;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<PermissionManager> permissionManagerProvider;

  private final Provider<ActivityColorThemeManager> activityColorThemeManagerProvider;

  private final Provider<BackPressedManager> backPressedManagerProvider;

  private final Provider<FragmentScreenTracker> fragmentScreenTrackerProvider;

  private final Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider;

  private final Provider<MainActivityViewModel.Factory> factoryProvider;

  private final Provider<UserReviewManager> userReviewManagerProvider;

  public MainActivity_MembersInjector(Provider<PermissionManager> permissionManagerProvider,
      Provider<ActivityColorThemeManager> activityColorThemeManagerProvider,
      Provider<BackPressedManager> backPressedManagerProvider,
      Provider<FragmentScreenTracker> fragmentScreenTrackerProvider,
      Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider,
      Provider<MainActivityViewModel.Factory> factoryProvider,
      Provider<UserReviewManager> userReviewManagerProvider) {
    this.permissionManagerProvider = permissionManagerProvider;
    this.activityColorThemeManagerProvider = activityColorThemeManagerProvider;
    this.backPressedManagerProvider = backPressedManagerProvider;
    this.fragmentScreenTrackerProvider = fragmentScreenTrackerProvider;
    this.foregroundFragmentWatcherProvider = foregroundFragmentWatcherProvider;
    this.factoryProvider = factoryProvider;
    this.userReviewManagerProvider = userReviewManagerProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<PermissionManager> permissionManagerProvider,
      Provider<ActivityColorThemeManager> activityColorThemeManagerProvider,
      Provider<BackPressedManager> backPressedManagerProvider,
      Provider<FragmentScreenTracker> fragmentScreenTrackerProvider,
      Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider,
      Provider<MainActivityViewModel.Factory> factoryProvider,
      Provider<UserReviewManager> userReviewManagerProvider) {
    return new MainActivity_MembersInjector(permissionManagerProvider, activityColorThemeManagerProvider, backPressedManagerProvider, fragmentScreenTrackerProvider, foregroundFragmentWatcherProvider, factoryProvider, userReviewManagerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    ApkAnalyzerBaseActivity_MembersInjector.injectPermissionManager(instance, permissionManagerProvider.get());
    ApkAnalyzerBaseActivity_MembersInjector.injectActivityColorThemeManager(instance, activityColorThemeManagerProvider.get());
    ApkAnalyzerBaseActivity_MembersInjector.injectBackPressedManager(instance, backPressedManagerProvider.get());
    ApkAnalyzerBaseActivity_MembersInjector.injectFragmentScreenTracker(instance, fragmentScreenTrackerProvider.get());
    ApkAnalyzerBaseActivity_MembersInjector.injectForegroundFragmentWatcher(instance, foregroundFragmentWatcherProvider.get());
    injectFactory(instance, factoryProvider.get());
    injectUserReviewManager(instance, userReviewManagerProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.main.MainActivity.factory")
  public static void injectFactory(MainActivity instance, MainActivityViewModel.Factory factory) {
    instance.factory = factory;
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.main.MainActivity.userReviewManager")
  public static void injectUserReviewManager(MainActivity instance,
      UserReviewManager userReviewManager) {
    instance.userReviewManager = userReviewManager;
  }
}
