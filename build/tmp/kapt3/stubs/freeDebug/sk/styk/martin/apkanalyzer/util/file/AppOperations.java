package sk.styk.martin.apkanalyzer.util.file;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007\u00a8\u0006\u000f"}, d2 = {"Lsk/styk/martin/apkanalyzer/util/file/AppOperations;", "", "()V", "installPremium", "", "context", "Landroid/content/Context;", "openAppSystemPage", "packageName", "", "openBrowser", "url", "openGooglePlay", "startForeignActivity", "activityName", "app_freeDebug"})
public final class AppOperations {
    @org.jetbrains.annotations.NotNull
    public static final sk.styk.martin.apkanalyzer.util.file.AppOperations INSTANCE = null;
    
    private AppOperations() {
        super();
    }
    
    public final void openAppSystemPage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String packageName) {
    }
    
    @kotlin.jvm.JvmStatic
    public static final void installPremium(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic
    public static final void openGooglePlay(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String packageName) {
    }
    
    @kotlin.jvm.JvmStatic
    public static final void startForeignActivity(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String packageName, @org.jetbrains.annotations.NotNull
    java.lang.String activityName) {
    }
    
    @kotlin.jvm.JvmStatic
    public static final void openBrowser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
}