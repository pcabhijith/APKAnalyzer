package sk.styk.martin.apkanalyzer.manager.file;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager;", "", "contentResolver", "Landroid/content/ContentResolver;", "notificationManager", "Lsk/styk/martin/apkanalyzer/manager/notification/NotificationManager;", "dispatcherProvider", "Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;", "(Landroid/content/ContentResolver;Lsk/styk/martin/apkanalyzer/manager/notification/NotificationManager;Lsk/styk/martin/apkanalyzer/core/common/coroutines/DispatcherProvider;)V", "saveApk", "Lkotlinx/coroutines/flow/Flow;", "Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager$AppSaveStatus;", "appName", "", "sourceFile", "Ljava/io/File;", "targetUri", "Landroid/net/Uri;", "saveApkInternal", "AppSaveStatus", "app_freeDebug"})
public final class ApkSaveManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.ContentResolver contentResolver = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.notification.NotificationManager notificationManager = null;
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider = null;
    
    @javax.inject.Inject
    public ApkSaveManager(@org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.notification.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.core.common.coroutines.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager.AppSaveStatus> saveApk(@org.jetbrains.annotations.NotNull
    java.lang.String appName, @org.jetbrains.annotations.NotNull
    java.io.File sourceFile, @org.jetbrains.annotations.NotNull
    android.net.Uri targetUri) {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager.AppSaveStatus> saveApkInternal(java.io.File sourceFile, android.net.Uri targetUri) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager$AppSaveStatus;", "", "outputUri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getOutputUri", "()Landroid/net/Uri;", "Done", "Progress", "Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager$AppSaveStatus$Done;", "Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager$AppSaveStatus$Progress;", "app_freeDebug"})
    public static abstract class AppSaveStatus {
        @org.jetbrains.annotations.NotNull
        private final android.net.Uri outputUri = null;
        
        private AppSaveStatus(android.net.Uri outputUri) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public android.net.Uri getOutputUri() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager$AppSaveStatus$Done;", "Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager$AppSaveStatus;", "outputUri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getOutputUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_freeDebug"})
        public static final class Done extends sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager.AppSaveStatus {
            @org.jetbrains.annotations.NotNull
            private final android.net.Uri outputUri = null;
            
            public Done(@org.jetbrains.annotations.NotNull
            android.net.Uri outputUri) {
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public android.net.Uri getOutputUri() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final android.net.Uri component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager.AppSaveStatus.Done copy(@org.jetbrains.annotations.NotNull
            android.net.Uri outputUri) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager$AppSaveStatus$Progress;", "Lsk/styk/martin/apkanalyzer/manager/file/ApkSaveManager$AppSaveStatus;", "currentProgress", "", "outputUri", "Landroid/net/Uri;", "(ILandroid/net/Uri;)V", "getCurrentProgress", "()I", "getOutputUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_freeDebug"})
        public static final class Progress extends sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager.AppSaveStatus {
            private final int currentProgress = 0;
            @org.jetbrains.annotations.NotNull
            private final android.net.Uri outputUri = null;
            
            public Progress(@androidx.annotation.IntRange(from = 0L, to = 100L)
            int currentProgress, @org.jetbrains.annotations.NotNull
            android.net.Uri outputUri) {
            }
            
            public final int getCurrentProgress() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public android.net.Uri getOutputUri() {
                return null;
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final android.net.Uri component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final sk.styk.martin.apkanalyzer.manager.file.ApkSaveManager.AppSaveStatus.Progress copy(@androidx.annotation.IntRange(from = 0L, to = 100L)
            int currentProgress, @org.jetbrains.annotations.NotNull
            android.net.Uri outputUri) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
    }
}