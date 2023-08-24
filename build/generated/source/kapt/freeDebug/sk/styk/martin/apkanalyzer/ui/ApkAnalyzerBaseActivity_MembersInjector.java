package sk.styk.martin.apkanalyzer.ui;

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
import sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager;

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
public final class ApkAnalyzerBaseActivity_MembersInjector implements MembersInjector<ApkAnalyzerBaseActivity> {
  private final Provider<PermissionManager> permissionManagerProvider;

  private final Provider<ActivityColorThemeManager> activityColorThemeManagerProvider;

  private final Provider<BackPressedManager> backPressedManagerProvider;

  private final Provider<FragmentScreenTracker> fragmentScreenTrackerProvider;

  private final Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider;

  public ApkAnalyzerBaseActivity_MembersInjector(
      Provider<PermissionManager> permissionManagerProvider,
      Provider<ActivityColorThemeManager> activityColorThemeManagerProvider,
      Provider<BackPressedManager> backPressedManagerProvider,
      Provider<FragmentScreenTracker> fragmentScreenTrackerProvider,
      Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider) {
    this.permissionManagerProvider = permissionManagerProvider;
    this.activityColorThemeManagerProvider = activityColorThemeManagerProvider;
    this.backPressedManagerProvider = backPressedManagerProvider;
    this.fragmentScreenTrackerProvider = fragmentScreenTrackerProvider;
    this.foregroundFragmentWatcherProvider = foregroundFragmentWatcherProvider;
  }

  public static MembersInjector<ApkAnalyzerBaseActivity> create(
      Provider<PermissionManager> permissionManagerProvider,
      Provider<ActivityColorThemeManager> activityColorThemeManagerProvider,
      Provider<BackPressedManager> backPressedManagerProvider,
      Provider<FragmentScreenTracker> fragmentScreenTrackerProvider,
      Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider) {
    return new ApkAnalyzerBaseActivity_MembersInjector(permissionManagerProvider, activityColorThemeManagerProvider, backPressedManagerProvider, fragmentScreenTrackerProvider, foregroundFragmentWatcherProvider);
  }

  @Override
  public void injectMembers(ApkAnalyzerBaseActivity instance) {
    injectPermissionManager(instance, permissionManagerProvider.get());
    injectActivityColorThemeManager(instance, activityColorThemeManagerProvider.get());
    injectBackPressedManager(instance, backPressedManagerProvider.get());
    injectFragmentScreenTracker(instance, fragmentScreenTrackerProvider.get());
    injectForegroundFragmentWatcher(instance, foregroundFragmentWatcherProvider.get());
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.ApkAnalyzerBaseActivity.permissionManager")
  public static void injectPermissionManager(ApkAnalyzerBaseActivity instance,
      PermissionManager permissionManager) {
    instance.permissionManager = permissionManager;
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.ApkAnalyzerBaseActivity.activityColorThemeManager")
  public static void injectActivityColorThemeManager(ApkAnalyzerBaseActivity instance,
      ActivityColorThemeManager activityColorThemeManager) {
    instance.activityColorThemeManager = activityColorThemeManager;
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.ApkAnalyzerBaseActivity.backPressedManager")
  public static void injectBackPressedManager(ApkAnalyzerBaseActivity instance,
      BackPressedManager backPressedManager) {
    instance.backPressedManager = backPressedManager;
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.ApkAnalyzerBaseActivity.fragmentScreenTracker")
  public static void injectFragmentScreenTracker(ApkAnalyzerBaseActivity instance,
      FragmentScreenTracker fragmentScreenTracker) {
    instance.fragmentScreenTracker = fragmentScreenTracker;
  }

  @InjectedFieldSignature("sk.styk.martin.apkanalyzer.ui.ApkAnalyzerBaseActivity.foregroundFragmentWatcher")
  public static void injectForegroundFragmentWatcher(ApkAnalyzerBaseActivity instance,
      ForegroundFragmentWatcher foregroundFragmentWatcher) {
    instance.foregroundFragmentWatcher = foregroundFragmentWatcher;
  }
}
