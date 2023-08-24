package sk.styk.martin.apkanalyzer.dependencyinjection;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\tH\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u001c"}, d2 = {"Lsk/styk/martin/apkanalyzer/dependencyinjection/ActivityCommonModule;", "", "()V", "provideActivityContext", "Landroid/content/Context;", "activity", "Landroid/app/Activity;", "provideColorThemeManager", "Lsk/styk/martin/apkanalyzer/manager/resources/ActivityColorThemeManager;", "Landroidx/appcompat/app/AppCompatActivity;", "applicationColorThemeManager", "Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;", "provideForegroundFragmentWatcher", "Lsk/styk/martin/apkanalyzer/manager/navigationdrawer/ForegroundFragmentWatcher;", "provideFragmentScreenTracker", "Lsk/styk/martin/apkanalyzer/manager/analytics/FragmentScreenTracker;", "analyticsTracker", "Lsk/styk/martin/apkanalyzer/manager/analytics/AnalyticsTracker;", "foregroundWatcher", "dispatcherProvider", "Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;", "providePermissionsManager", "Lsk/styk/martin/apkanalyzer/manager/permission/PermissionManager;", "provideUserReviewManager", "Lsk/styk/martin/apkanalyzer/manager/promo/UserReviewManager;", "reviewManager", "Lcom/google/android/play/core/review/ReviewManager;", "providesResources", "app_freeDebug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
public final class ActivityCommonModule {
    
    public ActivityCommonModule() {
        super();
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityScoped
    @org.jetbrains.annotations.NotNull
    public final android.content.Context provideActivityContext(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityScoped
    @org.jetbrains.annotations.NotNull
    public final androidx.appcompat.app.AppCompatActivity providesResources(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityScoped
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.permission.PermissionManager providePermissionsManager(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityScoped
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.resources.ActivityColorThemeManager provideColorThemeManager(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager applicationColorThemeManager) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityScoped
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.analytics.FragmentScreenTracker provideFragmentScreenTracker(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.analytics.AnalyticsTracker analyticsTracker, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher foregroundWatcher, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityScoped
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.navigationdrawer.ForegroundFragmentWatcher provideForegroundFragmentWatcher(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ActivityScoped
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.promo.UserReviewManager provideUserReviewManager(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull
    com.google.android.play.core.review.ReviewManager reviewManager) {
        return null;
    }
}