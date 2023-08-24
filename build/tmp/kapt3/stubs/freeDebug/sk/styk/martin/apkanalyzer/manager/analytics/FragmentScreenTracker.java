package sk.styk.martin.apkanalyzer.manager.analytics;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/analytics/FragmentScreenTracker;", "Landroidx/lifecycle/ViewModel;", "foregroundFragmentWatcher", "Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/ForegroundFragmentWatcher;", "analyticsTracker", "Lsk/styk/martin/apkanalyzer/manager/analytics/AnalyticsTracker;", "dispatcherProvider", "Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;", "(Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/ForegroundFragmentWatcher;Lsk/styk/martin/apkanalyzer/manager/analytics/AnalyticsTracker;Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;)V", "lastTrackedTag", "Lsk/styk/martin/apkanalyzer/util/FragmentTag;", "app_freeDebug"})
@dagger.hilt.android.scopes.ActivityScoped
public final class FragmentScreenTracker extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher foregroundFragmentWatcher = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.analytics.AnalyticsTracker analyticsTracker = null;
    @org.jetbrains.annotations.Nullable
    private sk.styk.martin.apkanalyzer.util.FragmentTag lastTrackedTag;
    
    @javax.inject.Inject
    public FragmentScreenTracker(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher foregroundFragmentWatcher, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.analytics.AnalyticsTracker analyticsTracker, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider) {
        super();
    }
}