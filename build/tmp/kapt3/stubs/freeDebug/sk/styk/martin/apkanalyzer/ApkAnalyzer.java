package sk.styk.martin.apkanalyzer;

@dagger.hilt.android.HiltAndroidApp
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lsk/styk/martin/apkanalyzer/ApkAnalyzer;", "Landroidx/multidex/MultiDexApplication;", "()V", "colorThemeManager", "Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;", "getColorThemeManager", "()Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;", "setColorThemeManager", "(Lsk/styk/martin/apkanalyzer/manager/resources/ColorThemeManager;)V", "onCreate", "", "app_freeDebug"})
public final class ApkAnalyzer extends androidx.multidex.MultiDexApplication {
    @javax.inject.Inject
    public sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager colorThemeManager;
    
    public ApkAnalyzer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager getColorThemeManager() {
        return null;
    }
    
    public final void setColorThemeManager(@org.jetbrains.annotations.NotNull
    sk.styk.martin.apkanalyzer.manager.resources.ColorThemeManager p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
}