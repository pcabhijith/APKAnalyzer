package sk.styk.martin.apkanalyzer.ui.appdetail;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010#\u001a\u00020 H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/AppActionsSpeedMenuAdapter;", "Lsk/styk/martin/apkanalyzer/views/SpeedDialMenuAdapter;", "()V", "exportApp", "Lkotlinx/coroutines/flow/Flow;", "", "getExportApp", "()Lkotlinx/coroutines/flow/Flow;", "exportAppFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "menuItems", "", "Lsk/styk/martin/apkanalyzer/ui/appdetail/AppActionsSpeedMenuAdapter$AppActions;", "getMenuItems", "()Ljava/util/List;", "setMenuItems", "(Ljava/util/List;)V", "openGooglePlay", "getOpenGooglePlay", "openGooglePlayFlow", "openSystemInfo", "getOpenSystemInfo", "openSystemInfoFlow", "saveIcon", "getSaveIcon", "saveIconFlow", "showManifest", "getShowManifest", "showManifestFlow", "fabRotationDegrees", "", "getCount", "", "getMenuItem", "Lsk/styk/martin/apkanalyzer/views/SpeedDialMenuItem;", "position", "onMenuItemClick", "", "AppActions", "app_freeDebug"})
public final class AppActionsSpeedMenuAdapter extends sk.styk.martin.apkanalyzer.views.SpeedDialMenuAdapter {
    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter.AppActions> menuItems;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> exportAppFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> exportApp = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> saveIconFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> saveIcon = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> showManifestFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> showManifest = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> openGooglePlayFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> openGooglePlay = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> openSystemInfoFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> openSystemInfo = null;
    
    @javax.inject.Inject
    public AppActionsSpeedMenuAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter.AppActions> getMenuItems() {
        return null;
    }
    
    public final void setMenuItems(@org.jetbrains.annotations.NotNull
    java.util.List<? extends sk.styk.martin.apkanalyzer.ui.appdetail.AppActionsSpeedMenuAdapter.AppActions> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getExportApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getSaveIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getShowManifest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getOpenGooglePlay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getOpenSystemInfo() {
        return null;
    }
    
    @java.lang.Override
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public sk.styk.martin.apkanalyzer.views.SpeedDialMenuItem getMenuItem(int position) {
        return null;
    }
    
    @java.lang.Override
    public boolean onMenuItemClick(int position) {
        return false;
    }
    
    @java.lang.Override
    public float fabRotationDegrees() {
        return 0.0F;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/AppActionsSpeedMenuAdapter$AppActions;", "", "(Ljava/lang/String;I)V", "EXPORT_APK", "SAVE_ICON", "SHOW_MANIFEST", "OPEN_PLAY", "BUILD_INFO", "app_freeDebug"})
    public static enum AppActions {
        /*public static final*/ EXPORT_APK /* = new EXPORT_APK() */,
        /*public static final*/ SAVE_ICON /* = new SAVE_ICON() */,
        /*public static final*/ SHOW_MANIFEST /* = new SHOW_MANIFEST() */,
        /*public static final*/ OPEN_PLAY /* = new OPEN_PLAY() */,
        /*public static final*/ BUILD_INFO /* = new BUILD_INFO() */;
        
        AppActions() {
        }
    }
}