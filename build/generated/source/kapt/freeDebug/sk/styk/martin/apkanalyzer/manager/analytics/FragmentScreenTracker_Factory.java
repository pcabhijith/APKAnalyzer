package sk.styk.martin.apkanalyzer.manager.analytics;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider;
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
public final class FragmentScreenTracker_Factory implements Factory<FragmentScreenTracker> {
  private final Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider;

  private final Provider<AnalyticsTracker> analyticsTrackerProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public FragmentScreenTracker_Factory(
      Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider,
      Provider<AnalyticsTracker> analyticsTrackerProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.foregroundFragmentWatcherProvider = foregroundFragmentWatcherProvider;
    this.analyticsTrackerProvider = analyticsTrackerProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public FragmentScreenTracker get() {
    return newInstance(foregroundFragmentWatcherProvider.get(), analyticsTrackerProvider.get(), dispatcherProvider.get());
  }

  public static FragmentScreenTracker_Factory create(
      Provider<ForegroundFragmentWatcher> foregroundFragmentWatcherProvider,
      Provider<AnalyticsTracker> analyticsTrackerProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new FragmentScreenTracker_Factory(foregroundFragmentWatcherProvider, analyticsTrackerProvider, dispatcherProvider);
  }

  public static FragmentScreenTracker newInstance(
      ForegroundFragmentWatcher foregroundFragmentWatcher, AnalyticsTracker analyticsTracker,
      DispatcherProvider dispatcherProvider) {
    return new FragmentScreenTracker(foregroundFragmentWatcher, analyticsTracker, dispatcherProvider);
  }
}
