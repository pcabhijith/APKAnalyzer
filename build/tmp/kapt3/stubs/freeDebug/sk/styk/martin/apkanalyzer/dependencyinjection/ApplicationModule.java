package sk.styk.martin.apkanalyzer.dependencyinjection;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u0015"}, d2 = {"Lsk/styk/martin/apkanalyzer/dependencyinjection/ApplicationModule;", "", "()V", "provideColorThemeManagerImpl", "Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;", "colorThemeManagerImpl", "Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManagerImpl;", "provideContentResolver", "Landroid/content/ContentResolver;", "application", "Landroid/app/Application;", "provideFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "context", "Landroid/content/Context;", "provideNotificationManager", "Landroid/app/NotificationManager;", "providePersistenceSharedPreferences", "Landroid/content/SharedPreferences;", "provideReviewManager", "Lcom/google/android/play/core/review/ReviewManager;", "app_freeDebug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ApplicationModule {
    
    public ApplicationModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final android.content.ContentResolver provideContentResolver(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences providePersistenceSharedPreferences(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final android.app.NotificationManager provideNotificationManager(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager provideColorThemeManagerImpl(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManagerImpl colorThemeManagerImpl) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.analytics.FirebaseAnalytics provideFirebaseAnalytics(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.google.android.play.core.review.ReviewManager provideReviewManager(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}