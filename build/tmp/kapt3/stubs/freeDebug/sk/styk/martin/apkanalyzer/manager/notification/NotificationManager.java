package sk.styk.martin.apkanalyzer.manager.notification;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u0014J\u0016\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001cJ\u0016\u0010 \u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\"\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/notification/NotificationManager;", "", "context", "Landroid/content/Context;", "resourcesManager", "Lsk/styk/martin/apkanalyzer/core/common/resources/ResourcesManager;", "androidNotificationManager", "Landroid/app/NotificationManager;", "(Landroid/content/Context;Lsk/styk/martin/apkanalyzer/core/common/resources/ResourcesManager;Landroid/app/NotificationManager;)V", "flagImmutable", "", "shouldShowNotification", "", "getShouldShowNotification", "()Z", "cancelNotification", "", "notificationId", "createChannel", "channelId", "", "channelName", "", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "showAppExportDoneNotification", "appName", "outputFileUri", "Landroid/net/Uri;", "showAppExportProgressNotification", "showImageExportedNotification", "drawableFileUri", "showManifestSavedNotification", "updateAppExportProgressNotification", "progress", "app_freeDebug"})
public final class NotificationManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager resourcesManager = null;
    @org.jetbrains.annotations.NotNull
    private final android.app.NotificationManager androidNotificationManager = null;
    private final int flagImmutable = 0;
    
    @javax.inject.Inject
    public NotificationManager(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.resources.ResourcesManager resourcesManager, @org.jetbrains.annotations.NotNull
    android.app.NotificationManager androidNotificationManager) {
        super();
    }
    
    private final boolean getShouldShowNotification() {
        return false;
    }
    
    public final void showImageExportedNotification(@org.jetbrains.annotations.NotNull
    java.lang.String appName, @org.jetbrains.annotations.NotNull
    android.net.Uri drawableFileUri) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.core.app.NotificationCompat.Builder showAppExportProgressNotification(@org.jetbrains.annotations.NotNull
    java.lang.String appName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.app.NotificationCompat.Builder updateAppExportProgressNotification(@org.jetbrains.annotations.NotNull
    androidx.core.app.NotificationCompat.Builder notificationBuilder, @androidx.annotation.IntRange(from = 0L, to = 100L)
    int progress) {
        return null;
    }
    
    public final void showAppExportDoneNotification(@org.jetbrains.annotations.NotNull
    java.lang.String appName, @org.jetbrains.annotations.NotNull
    android.net.Uri outputFileUri) {
    }
    
    public final void showManifestSavedNotification(@org.jetbrains.annotations.NotNull
    java.lang.String appName, @org.jetbrains.annotations.NotNull
    android.net.Uri outputFileUri) {
    }
    
    private final androidx.core.app.NotificationCompat.Builder notificationBuilder(java.lang.String channelId) {
        return null;
    }
    
    private final void createChannel(java.lang.String channelId, java.lang.CharSequence channelName) {
    }
    
    private final void cancelNotification(int notificationId) {
    }
}