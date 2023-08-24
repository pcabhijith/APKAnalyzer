package sk.styk.martin.apkanalyzer.manager.analytics;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/analytics/AnalyticsTracker;", "", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "trackAppActionAction", "", "action", "Lsk/styk/martin/apkanalyzer/manager/analytics/AnalyticsTracker$AppAction;", "trackScreenView", "screenTag", "", "AppAction", "app_freeDebug"})
public final class AnalyticsTracker {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics = null;
    
    @javax.inject.Inject
    public AnalyticsTracker(@org.jetbrains.annotations.NotNull
    com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics) {
        super();
    }
    
    public final void trackAppActionAction(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.analytics.AnalyticsTracker.AppAction action) {
    }
    
    public final void trackScreenView(@org.jetbrains.annotations.NotNull
    java.lang.String screenTag) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/analytics/AnalyticsTracker$AppAction;", "", "trackingId", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingId", "()Ljava/lang/String;", "SHOW_MANIFEST", "EXPORT_APK", "SAVE_ICON", "OPEN_SYSTEM_ABOUT", "OPEN_GOOGLE_PLAY", "app_freeDebug"})
    public static enum AppAction {
        /*public static final*/ SHOW_MANIFEST /* = new SHOW_MANIFEST(null) */,
        /*public static final*/ EXPORT_APK /* = new EXPORT_APK(null) */,
        /*public static final*/ SAVE_ICON /* = new SAVE_ICON(null) */,
        /*public static final*/ OPEN_SYSTEM_ABOUT /* = new OPEN_SYSTEM_ABOUT(null) */,
        /*public static final*/ OPEN_GOOGLE_PLAY /* = new OPEN_GOOGLE_PLAY(null) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String trackingId = null;
        
        AppAction(java.lang.String trackingId) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTrackingId() {
            return null;
        }
    }
}