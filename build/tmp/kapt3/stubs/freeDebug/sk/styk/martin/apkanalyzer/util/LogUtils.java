package sk.styk.martin.apkanalyzer.util;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lsk/styk/martin/apkanalyzer/util/LogUtils;", "", "()V", "logTrees", "", "Ltimber/log/Timber$DebugTree;", "()[Ltimber/log/Timber$DebugTree;", "FirebaseTree", "app_freeDebug"})
public final class LogUtils {
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.util.LogUtils INSTANCE = null;
    
    private LogUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final timber.log.Timber.DebugTree[] logTrees() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J,\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014\u00a8\u0006\r"}, d2 = {"Lsk/styk/martin/apkanalyzer/util/LogUtils$FirebaseTree;", "Ltimber/log/Timber$DebugTree;", "()V", "crashlyticsMessage", "", "priority", "", "tag", "message", "log", "", "t", "", "app_freeDebug"})
    public static final class FirebaseTree extends timber.log.Timber.DebugTree {
        
        public FirebaseTree() {
            super();
        }
        
        @java.lang.Override
        protected void log(int priority, @org.jetbrains.annotations.Nullable
        java.lang.String tag, @org.jetbrains.annotations.NotNull
        java.lang.String message, @org.jetbrains.annotations.Nullable
        java.lang.Throwable t) {
        }
        
        private final java.lang.String crashlyticsMessage(int priority, java.lang.String tag, java.lang.String message) {
            return null;
        }
    }
}