package sk.styk.martin.apkanalyzer.manager.resources;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\tH\u0096\u0001R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lsk/styk/martin/apkanalyzer/manager/resources/ActivityColorThemeManager;", "Landroidx/lifecycle/ViewModel;", "Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;", "colorThemeManager", "(Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;)V", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "bind", "", "isNightMode", "", "setTheme", "app_freeDebug"})
public final class ActivityColorThemeManager extends androidx.lifecycle.ViewModel implements sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager {
    @org.jetbrains.annotations.NotNull
    private final sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager colorThemeManager = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.ref.WeakReference<android.app.Activity> activity;
    
    @javax.inject.Inject
    public ActivityColorThemeManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager colorThemeManager) {
        super();
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    public final boolean isNightMode() {
        return false;
    }
    
    @java.lang.Override
    public void setTheme() {
    }
}