package sk.styk.martin.apkanalyzer.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
import sk.styk.martin.apkanalyzer.manager.analytics.AnalyticsTracker;
import sk.styk.martin.apkanalyzer.manager.analytics.FragmentScreenTracker;
import sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
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
public final class ActivityCommonModule_ProvideFragmentScreenTrackerFactory implements Factory<FragmentScreenTracker> {
  private final ActivityCommonModule module;

  private final Provider<AppCompatActivity> activityProvider;

  private final Provider<AnalyticsTracker> analyticsTrackerProvider;

  private final Provider<ForegroundFragmentWatcher> foregroundWatcherProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public ActivityCommonModule_ProvideFragmentScreenTrackerFactory(ActivityCommonModule module,
      Provider<AppCompatActivity> activityProvider,
      Provider<AnalyticsTracker> analyticsTrackerProvider,
      Provider<ForegroundFragmentWatcher> foregroundWatcherProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
    this.analyticsTrackerProvider = analyticsTrackerProvider;
    this.foregroundWatcherProvider = foregroundWatcherProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public FragmentScreenTracker get() {
    return provideFragmentScreenTracker(module, activityProvider.get(), analyticsTrackerProvider.get(), foregroundWatcherProvider.get(), dispatcherProvider.get());
  }

  public static ActivityCommonModule_ProvideFragmentScreenTrackerFactory create(
      ActivityCommonModule module, Provider<AppCompatActivity> activityProvider,
      Provider<AnalyticsTracker> analyticsTrackerProvider,
      Provider<ForegroundFragmentWatcher> foregroundWatcherProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new ActivityCommonModule_ProvideFragmentScreenTrackerFactory(module, activityProvider, analyticsTrackerProvider, foregroundWatcherProvider, dispatcherProvider);
  }

  public static FragmentScreenTracker provideFragmentScreenTracker(ActivityCommonModule instance,
      AppCompatActivity activity, AnalyticsTracker analyticsTracker,
      ForegroundFragmentWatcher foregroundWatcher, DispatcherProvider dispatcherProvider) {
    return Preconditions.checkNotNullFromProvides(instance.provideFragmentScreenTracker(activity, analyticsTracker, foregroundWatcher, dispatcherProvider));
  }
}
